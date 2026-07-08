package X;

import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.tablet.impl.business.split.split.SplitContainerManager;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: renamed from: X.0T45, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T45 {
    public static final C0T45 LIZ = new C0T45();
    public static final C0T46 LIZIZ = new C0T46();

    public static final int LIZJ() {
        float f;
        int i;
        C1389350mG5 c1389350mG5LIZJ = C1389340mG4.LIZJ(null, null);
        int iMax = Math.max(c1389350mG5LIZJ.LIZIZ, c1389350mG5LIZJ.LIZJ);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("comment_split_ab_override_foldable", false)) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(387));
        }
        if (!((Boolean) C0AVM.LIZ.getValue()).booleanValue()) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(800));
            if (iMax <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1199)) && iLIZIZ <= iMax) {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(350));
            }
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1200));
            if (iMax <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1599)) && iLIZIZ2 <= iMax) {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(400));
            }
            if (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1600)) > iMax || iMax > Integer.MAX_VALUE) {
                return 0;
            }
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(450));
        }
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(800));
        if (iMax > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1199)) || iLIZIZ3 > iMax) {
            if (iMax <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1599)) && C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1200)) <= iMax) {
                f = iMax * 6.0f;
                i = 20;
            } else {
                if (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1600)) > iMax || iMax > Integer.MAX_VALUE) {
                    return 0;
                }
                f = iMax * 6.0f;
                i = 24;
            }
        } else {
            f = iMax * 4.0f;
            i = 12;
        }
        return (int) (f / i);
    }

    public static final void LJI() {
        C0T46 c0t46 = LIZIZ;
        if (c0t46.LIZ != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", c0t46.LIZ);
            c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - c0t46.LIZIZ, "duration");
            C20684815ws.LJIILLIIL("comment_open_play_time", c2344009Gk.LIZ);
        }
        c0t46.LIZIZ = 0L;
        c0t46.LIZ = null;
    }

    public static final InterfaceC752360TfG LIZ(C19EG c19eg) {
        return SplitContainerManager.LIZIZ(Integer.valueOf(c19eg.hashCode()));
    }

    public static final int LIZIZ(C19EG c19eg) {
        InterfaceC752360TfG interfaceC752360TfGLIZIZ = SplitContainerManager.LIZIZ(Integer.valueOf(c19eg.hashCode()));
        if (interfaceC752360TfGLIZIZ != null) {
            return interfaceC752360TfGLIZIZ.LIZLLL();
        }
        return 0;
    }

    public static final InterfaceC752360TfG LIZLLL(String str) {
        WeakReference<InterfaceC752360TfG> weakReference;
        if (C1616660sAi.LIZJ() && str != null && (weakReference = SplitContainerManager.LIZ.get(str)) != null) {
            return weakReference.get();
        }
        return null;
    }

    public static final void LJFF(String str) {
        C0T46 c0t46 = LIZIZ;
        if (str == null) {
            if (c0t46.LIZ == null) {
                return;
            }
        } else {
            c0t46.LIZ = str;
        }
        c0t46.LIZIZ = SystemClock.elapsedRealtime();
    }

    public static final void LJ(C19EG c19eg, String str) {
        Integer numValueOf;
        if (c19eg != null && (numValueOf = Integer.valueOf(c19eg.hashCode())) != null) {
            int iIntValue = numValueOf.intValue();
            List<String> list = SplitContainerManager.LIZIZ.get(Integer.valueOf(iIntValue));
            if (list != null && list.contains(str)) {
                SplitContainerManager.LIZJ.put(Integer.valueOf(iIntValue), str);
            }
        }
    }
}
