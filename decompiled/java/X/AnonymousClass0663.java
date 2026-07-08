package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0663, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.res.StreakSharePanelResProvider$streakSharePanelEggAnimationRes$1", f = "StreakSharePanelResProvider.kt", l = {107}, m = "invokeSuspend")
public final class AnonymousClass0663 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public AnonymousClass0663(InterfaceC1364105Vn<? super AnonymousClass0663> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0663(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099G c099gLIZIZ;
        C1C7U.LIZ("StreakSharePanelResProvider@14bc.streakSharePanelEggAnimationRes$1");
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
            synchronized (C1583706Hz.LIZIZ) {
                try {
                    c099gLIZIZ = C1583706Hz.LJFF;
                    if (c099gLIZIZ == null) {
                        c099gLIZIZ = C23250099c.LIZIZ(C1583706Hz.LJ, null, null, new AnonymousClass0662(null), 3);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            this.LL = 1;
            if (c099gLIZIZ.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("StreakSharePanelResProvider@14bc.streakSharePanelEggAnimationRes$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakSharePanelResProvider@14bc.streakSharePanelEggAnimationRes$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new AnonymousClass0663(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
