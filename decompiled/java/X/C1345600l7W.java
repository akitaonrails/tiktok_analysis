package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.actionbar.AbsCommentPageTab;
import com.ss.android.ugc.aweme.commentv2.commentpage.commonvideo.DefaultCommentPageContainerFragment;
import com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment.SingleKeyboardFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AwS421S0200000_20;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0l7W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345600l7W {
    public static final C1345600l7W LIZ = new C1345600l7W();

    public static boolean LIZIZ() {
        try {
            return C1601690rmZ.LIZJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public final void LIZLLL(View view) {
        Object c098200Yq;
        if (view != null) {
            try {
                if (LIZIZ()) {
                    C01TT.LIZJ(new AwS421S0200000_20(this, view, 12));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1344030l4z.LIZIZ("CustomAction", "setupCommentListFragmentAccessibility", thM5exceptionOrNullimpl);
        }
    }

    public static MotionEvent LIZ(int i, View view) {
        view.getLocationInWindow(new int[]{0, 0});
        long jUptimeMillis = SystemClock.uptimeMillis();
        return MotionEvent.obtain(jUptimeMillis, jUptimeMillis, i, r1[0], r1[1], 0);
    }

    public static void LIZJ(SingleKeyboardFragment singleKeyboardFragment, boolean z, Comment comment) {
        Object c098200Yq;
        Fragment fragmentLJJJJZI;
        int i;
        C19EG activity;
        try {
            if (!LIZIZ()) {
                return;
            }
            FragmentManager fragmentManagerLJ = C1345700l7g.LJ(singleKeyboardFragment);
            c098200Yq = null;
            if ((fragmentManagerLJ != null || ((activity = singleKeyboardFragment.getActivity()) != null && (fragmentManagerLJ = activity.getSupportFragmentManager()) != null)) && (fragmentLJJJJZI = fragmentManagerLJ.LJJJJZI("default_comment_page")) != null) {
                if (fragmentLJJJJZI instanceof DefaultCommentPageContainerFragment) {
                    View view = ((DefaultCommentPageContainerFragment) fragmentLJJJJZI).getView();
                    if (view != null) {
                        if (z) {
                            i = 4;
                        } else {
                            i = 0;
                        }
                        view.setImportantForAccessibility(i);
                    }
                    if (!z) {
                        AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(comment, 373);
                        Iterator it2 = ((ArrayList) ((DefaultCommentPageContainerFragment) fragmentLJJJJZI).LLILLJJLI).iterator();
                        while (it2.hasNext()) {
                            awS600S0100000_21.invoke(((AbsCommentPageTab) it2.next()).LIZ().LIZ);
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setupBackgroundIfNeed show=");
                    sbLIZ.append(z);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setupBackgroundIfNeed show=");
            sbLIZ2.append(z);
            C1344030l4z.LIZIZ("CustomAction", C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl);
        }
    }
}
