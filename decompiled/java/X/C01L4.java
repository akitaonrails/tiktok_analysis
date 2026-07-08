package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01L4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.education.GameLiveNewBroadcastEduNotificationHelperKt$tryShowWeakDeviceTipsTask$1", f = "GameLiveNewBroadcastEduNotificationHelper.kt", l = {103}, m = "invokeSuspend")
public final class C01L4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C01L4(InterfaceC1364105Vn<? super C01L4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01L4(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GameLiveNewBroadcastEduNotificationHelperKt@fad5.tryShowWeakDeviceTipsTask$1");
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
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("GameLiveNewBroadcastEduNotificationHelperKt@fad5.tryShowWeakDeviceTipsTask$1");
                return objLJFF;
            }
        }
        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841802));
        InterfaceC772390URp.LLZZ.LJFF(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameLiveNewBroadcastEduNotificationHelperKt@fad5.tryShowWeakDeviceTipsTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01L4(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
