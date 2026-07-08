package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.AVCameraInitTask$PostedDraftConvertToNormal$run$1", f = "InitTaskServiceImpl.kt", l = {558}, m = "invokeSuspend")
public final class C497730JfX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C497730JfX(InterfaceC1364105Vn<? super C497730JfX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C497730JfX(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AVCameraInitTask$PostedDraftConvertToNormal@3de.run$1");
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
            C499180Jhs c499180Jhs = C499180Jhs.LIZ;
            this.LL = 1;
            if (c499180Jhs.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("AVCameraInitTask$PostedDraftConvertToNormal@3de.run$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AVCameraInitTask$PostedDraftConvertToNormal@3de.run$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C497730JfX(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
