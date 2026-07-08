package X;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18EL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EL extends AbstractC813200VvC {
    public static final C18EL LL = new C18EL();
    public static final WeakHashMap<Fragment, C18HQ> LLILLJJLI = new WeakHashMap<>();

    public static void LIZ(Fragment fragment) {
        C18HQ c18hq;
        if (C18CS.LIZ.LIZJ().LJIILL() != 1 || (c18hq = LLILLJJLI.get(fragment)) == null) {
            return;
        }
        Boolean bool = c18hq.LIZJ;
        if (bool == null) {
            c18hq.LIZIZ = SystemClock.elapsedRealtime();
        } else {
            if (!Intrinsics.LJFF(bool, Boolean.TRUE)) {
                return;
            }
            C18DP.LIZ(fragment);
        }
    }

    public static void LJJJZ(Fragment fragment, C18HQ c18hq) {
        C18DN c18dnLIZJ = C18DP.LIZJ(fragment);
        if (c18hq.LIZ) {
            C18DP.LIZ(fragment);
        }
        C18CK.LJIIJJI("UnknownDialogFragment_Paused", new C18F4(c18hq, c18dnLIZJ));
        C18DO.LIZIZ(c18dnLIZJ, c18dnLIZJ.getBufferBtm());
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        WeakHashMap<Fragment, C18HQ> weakHashMap;
        C18HQ c18hq;
        if (C18CS.LIZ.LIZJ().LJIILL() != 1 || (c18hq = (weakHashMap = LLILLJJLI).get(fragment)) == null) {
            return;
        }
        Boolean bool = c18hq.LIZJ;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            LJJJZ(fragment, c18hq);
            return;
        }
        if (!c18hq.LIZ) {
            return;
        }
        C21248618Dk.LIZ.getClass();
        if (C21248618Dk.LIZ(fragment)) {
            weakHashMap.remove(fragment);
        } else {
            if (SystemClock.elapsedRealtime() - c18hq.LIZIZ <= Mp4ScreenVideoLoadTimeout.CONTROL) {
                return;
            }
            c18hq.LIZJ = bool2;
            LJJJZ(fragment, c18hq);
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        LIZ(fragment);
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        if (C18CS.LIZ.LIZJ().LJIILL() != 1) {
            return;
        }
        C21248618Dk.LIZ.getClass();
        if (!C21248618Dk.LIZ(fragment)) {
            C21250218Ea c21250218Ea = C21250218Ea.LIZ;
            if (C21250218Ea.LIZ(fragment)) {
                LLILLJJLI.put(fragment, new C18HQ());
            }
        }
    }
}
