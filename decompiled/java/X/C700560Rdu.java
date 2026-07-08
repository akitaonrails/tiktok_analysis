package X;

import Y.ARunnableS111S0100000_11;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.componentmanager.metric.staytime.FcpAwemeInfo;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rdu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700560Rdu {
    public static void LIZIZ(MotionEvent motionEvent, ViewGroup viewGroup) {
        Integer numValueOf;
        View viewLIZIZ;
        Object tag;
        FcpAwemeInfo fcpAwemeInfo;
        if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null && numValueOf.intValue() != 0 && numValueOf.intValue() != 2) {
            if (numValueOf.intValue() == 1) {
                C700410Rdf.LIZ.getClass();
                if (viewGroup != null && (viewLIZIZ = C1967407nE.LIZIZ(viewGroup)) != null && (tag = viewGroup.getTag(C700100RdA.LJII)) != null) {
                    Object tag2 = viewGroup.getTag(C700100RdA.LJIIIIZZ);
                    if ((tag2 instanceof FcpAwemeInfo) && (fcpAwemeInfo = (FcpAwemeInfo) tag2) != null) {
                        C700410Rdf.LJ(viewLIZIZ, tag, fcpAwemeInfo, true);
                    }
                }
                C704180Rjk.LIZ.getClass();
                HandlerHook.viewPostDelay(viewGroup, new ARunnableS111S0100000_11(viewGroup, 153), 100L);
                return;
            }
            numValueOf.intValue();
        }
    }

    public static Object LIZJ(View view, int i) {
        try {
            return view.getTag(i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LIZ(InterfaceC703980RjQ interfaceC703980RjQ, int i, ViewGroup viewGroup) {
        if (i == 0) {
            Set<String> set = C700100RdA.LIZ;
            if (Intrinsics.LJFF("is_avoided", interfaceC703980RjQ.LIZIZ(C700100RdA.LJI, viewGroup))) {
                return true;
            }
            return false;
        }
        if (8 == i) {
            Object objLIZIZ = interfaceC703980RjQ.LIZIZ(C700100RdA.LJIILIIL, viewGroup);
            if (!(objLIZIZ instanceof String) || objLIZIZ == null) {
                objLIZIZ = "unknown";
            }
            Set<String> set2 = C1851607Na.LIZIZ;
            if (set2 != null) {
                set2.contains(objLIZIZ);
                return false;
            }
            return false;
        }
        return false;
    }
}
