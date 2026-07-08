package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0roS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602860roS {
    public static final C1602860roS LIZ = new C1602860roS();
    public static WeakReference<View> LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static int LJ;
    public static boolean LJFF;

    public static int LJI() {
        Object c098200Yq;
        int i;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (LJFF) {
            return LJ;
        }
        LIZ.getClass();
        if (LJ()) {
            C10R5 c10r5 = C10R5.LJIIIIZZ;
            i = C10RS.LIZ().LIZ() ? 3 : 1;
        } else {
            i = 2;
        }
        LJ = i;
        LJFF = true;
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            return LJ;
        }
        return 2;
    }

    static {
        new CopyOnWriteArraySet();
        LIZJ = C452501pT.LIZIZ(new C801290Vbz());
        LIZLLL = C452501pT.LIZIZ(new C0VGO());
        LJ = 1;
    }

    public static boolean LIZLLL() {
        InterfaceC591620NIi interfaceC591620NIiLIZJ;
        INewUserJourneyService iNewUserJourneyService = (INewUserJourneyService) PluggableExtentionKt.pluggableSpi$default(INewUserJourneyService.class, false, false, false, 14, null);
        return (iNewUserJourneyService == null || (interfaceC591620NIiLIZJ = iNewUserJourneyService.LIZJ()) == null || !interfaceC591620NIiLIZJ.LJIIIZ()) ? false : true;
    }

    public static boolean LJ() {
        Boolean boolLIZLLL = C1514430pVp.LIZLLL();
        if (boolLIZLLL != null) {
            return boolLIZLLL.booleanValue();
        }
        C844470XAv.LIZ.getClass();
        return C810670Vr7.LIZJ(C844470XAv.LIZ(), 0, "prefs_feed_check").getBoolean("key_first_launch", true);
    }

    public static boolean LJFF() {
        return LJI() == 3;
    }

    public static boolean LIZ(Function0 function0) {
        if (C0TKA.LJI && LJ() && function0 != null && ((Boolean) function0.invoke()).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Function0 function0) {
        if (!C0TKA.LJI || LJI() != 1 || function0 == null || !((Boolean) function0.invoke()).booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(long j) {
        C01GW c01gw = LIZJ;
        if (((Number) c01gw.getValue()).longValue() != 0 && System.currentTimeMillis() - ((Number) c01gw.getValue()).longValue() >= TimeUnit.DAYS.toMillis(j)) {
            return false;
        }
        return true;
    }
}
