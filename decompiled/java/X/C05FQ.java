package X;

import com.ss.android.ugc.aweme.changeregion.api.RegionChangeUpdatedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05FQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.changeregion.custom.RegionChangedListener$sendRegionUpdated$1", f = "RegionChangedListener.kt", l = {61}, m = "invokeSuspend")
public final class C05FQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C05FQ(InterfaceC1364105Vn<? super C05FQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05FQ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RegionChangedListener@137c.sendRegionUpdated$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1423605hi c1423605hi = RegionChangeUpdatedApi.LIZ;
            this.LL = 1;
            c1423605hi.getClass();
            if (C23250099c.LJI(this, C0PEM.LIZJ, new C05FR(null)) == objLJFF) {
                C1C7U.LIZIZ("RegionChangedListener@137c.sendRegionUpdated$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RegionChangedListener@137c.sendRegionUpdated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05FQ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
