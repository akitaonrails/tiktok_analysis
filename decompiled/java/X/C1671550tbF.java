package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0tbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671550tbF {
    public static final <T> C1686010tyZ<T> LIZIZ(Function1<? super C1685950tyT<T>, Unit> function1) {
        C1685950tyT c1685950tyT = new C1685950tyT();
        function1.invoke(c1685950tyT);
        return new C1686010tyZ<>(c1685950tyT);
    }

    public static C1677040tk6 LIZ(InterfaceC1677060tk8 interfaceC1677060tk8, C0N66 c0n66, long j, int i) {
        if ((i & 2) != 0) {
            c0n66 = C0N66.Restart;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        return new C1677040tk6(interfaceC1677060tk8, c0n66, j);
    }

    public static C1676890tjr LIZJ(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new C1676890tjr(f, f2, obj);
    }

    public static C1677050tk7 LIZLLL(int i, int i2, InterfaceC1686200tys interfaceC1686200tys, int i3) {
        if ((i3 & 1) != 0) {
            i = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            interfaceC1686200tys = C05Y0.LIZ;
        }
        return new C1677050tk7(i, i2, interfaceC1686200tys);
    }
}
