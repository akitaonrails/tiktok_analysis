package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: renamed from: X.0Rqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708460Rqe {
    public static final /* synthetic */ int LIZ = 0;

    public static C08LY LIZ(TagLayout tagLayout) {
        return new C08LY(new C1939607ik(C13LZ.LJIILJJIL(0, tagLayout.getChildCount())), new AwS590S0100000_11(tagLayout, 375));
    }

    public static final void LIZIZ(TagLayout tagLayout) {
        int i;
        Long l;
        if (tagLayout == null) {
            return;
        }
        C08QT c08qt = new C08QT(C09RB.LJIIJJI(LIZ(tagLayout)));
        while (true) {
            i = 8;
            if (!c08qt.hasNext()) {
                break;
            }
            View view = (View) c08qt.next();
            Object tag = view.getTag(R.id.abd);
            if ((tag instanceof Long) && (l = (Long) tag) != null && l.longValue() > 0) {
                C786410Ut5.LJLLLLLL(8, view);
            } else {
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
        C08LX c08lx = new C08LX(LIZ(tagLayout));
        while (true) {
            if (!c08lx.hasNext()) {
                break;
            } else if (((View) c08lx.next()).getVisibility() == 0) {
                i = 0;
                break;
            }
        }
        C786410Ut5.LJLZ(i, tagLayout);
    }

    public static void LIZJ(View view, View view2, ViewGroup viewGroup) {
        Long l;
        long jLongValue;
        if (view2.getVisibility() == 0) {
            return;
        }
        Object tag = view2.getTag(R.id.abd);
        if (tag instanceof Long) {
            l = (Long) tag;
        } else {
            l = null;
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C786410Ut5.LJLLLLLL(0, view2);
        if (jLongValue > 0 && view.getVisibility() == 0) {
            C786410Ut5.T4(view2, 0.0f);
            view2.animate().alpha(1.0f).setDuration(200L).start();
            return;
        }
        C786410Ut5.T4(view2, 1.0f);
        C21459418yW c21459418yW = new C21459418yW();
        if (viewGroup != null) {
            try {
                C19748612Om.LIZ(viewGroup, c21459418yW);
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C786410Ut5.LJLLLLLL(0, view);
    }
}
