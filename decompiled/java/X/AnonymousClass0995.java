package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0995, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.RelationRoseWatchLiveDurationTracker$EnterTimerRunnable$run$1", f = "RelationRoseWatchLiveDurationTracker.kt", l = {229}, m = "invokeSuspend")
public final class AnonymousClass0995 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public AnonymousClass0995(InterfaceC1364105Vn<? super AnonymousClass0995> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0995(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RelationRoseWatchLiveDurationTracker$EnterTimerRunnable@b1ae.run$1");
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
            TaskManagerV2 taskManagerV2 = TaskManagerV2.LIZ;
            EnumC1134590fdB enumC1134590fdB = EnumC1134590fdB.OTHERS;
            this.LL = 1;
            if (taskManagerV2.LIZ(enumC1134590fdB, 24, 107, null, null, false, this) == objLJFF) {
                C1C7U.LIZIZ("RelationRoseWatchLiveDurationTracker$EnterTimerRunnable@b1ae.run$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RelationRoseWatchLiveDurationTracker$EnterTimerRunnable@b1ae.run$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new AnonymousClass0995(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
