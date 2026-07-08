package X;

import com.ss.android.ugc.aweme.changeregion.api.RegionChangeUpdatedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05FR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.changeregion.api.RegionChangeUpdatedApi$Companion$sendUpdatedRegion$2", f = "RegionChangeUpdatedApi.kt", l = {25}, m = "invokeSuspend")
public final class C05FR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public int LL;

    public C05FR(InterfaceC1364105Vn<? super C05FR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05FR(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RegionChangeUpdatedApi$Companion@14b5.sendUpdatedRegion$2");
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
            RegionChangeUpdatedApi regionChangeUpdatedApi = C1423605hi.LIZIZ;
            this.LL = 1;
            obj = regionChangeUpdatedApi.sendUpdatedRegion(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RegionChangeUpdatedApi$Companion@14b5.sendUpdatedRegion$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("RegionChangeUpdatedApi$Companion@14b5.sendUpdatedRegion$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return new C05FR(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
