package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0LCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutComponent$startAutoCut$1", f = "AutoCutComponent.kt", l = {354}, m = "invokeSuspend")
public final class C539180LCq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C539180LCq(InterfaceC1364105Vn<? super C539180LCq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539180LCq(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ;
        C1C7U.LIZ("AutoCutComponent@2715.startAutoCut$1");
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
            this.LL = 1;
            InterfaceC539200LCs interfaceC539200LCs = C539190LCr.LIZ;
            if (interfaceC539200LCs == null || (objLIZ = interfaceC539200LCs.LIZ()) != C099R.LJFF()) {
                objLIZ = Unit.LIZ;
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("AutoCutComponent@2715.startAutoCut$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutComponent@2715.startAutoCut$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C539180LCq(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
