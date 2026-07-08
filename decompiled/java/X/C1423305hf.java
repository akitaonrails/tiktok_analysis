package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05hf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.changeregion.sdk.data.ChangeRegionDataManager$sendRegionUpdated$1", f = "ChangeRegionDataManager.kt", l = {28}, m = "invokeSuspend")
public final class C1423305hf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1423305hf(InterfaceC1364105Vn<? super C1423305hf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1423305hf(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChangeRegionDataManager@1790.sendRegionUpdated$1");
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
            C1423505hh c1423505hh = InterfaceC1423205he.LIZ;
            this.LL = 1;
            if (c1423505hh.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("ChangeRegionDataManager@1790.sendRegionUpdated$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChangeRegionDataManager@1790.sendRegionUpdated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1423305hf(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
