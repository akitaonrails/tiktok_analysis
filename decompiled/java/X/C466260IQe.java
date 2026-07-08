package X;

import Y.AAListenerS262S0200000_7;
import Y.AUListenerS257S0100000_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMockCurTime;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0IQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466260IQe {
    public static ValueAnimator LIZIZ;
    public static ValueAnimator LIZJ;
    public static C466310IQj LIZLLL;
    public static final C466260IQe LIZ = new C466260IQe();
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(337));

    public static void LIZJ() {
        C1305440k4k c1305440k4kLIZIZ;
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII == null || (c1305440k4kLIZIZ = C1305440k4k.LIZIZ(contextLJII)) == null) {
            return;
        }
        long curTime = LiveMockCurTime.INSTANCE.getCurTime();
        if (curTime <= 0) {
            curTime = System.currentTimeMillis();
        }
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        Set set = (Set) c1305440k4kLIZIZ.LIZLLL(LIZ(currentUserId), EnumC1305450k4l.STRING_SET, C08CX.INSTANCE);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            try {
                long j = CastLongProtector.parseLong((String) it2.next());
                if (j > 0 && curTime - j > 86400000) {
                    it2.remove();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        set.add(String.valueOf(curTime));
        c1305440k4kLIZIZ.LJIIIIZZ(set, LIZ(currentUserId));
    }

    public static String LIZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("_customized_last_show_times");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZIZ(View view, View view2, int i, boolean z, String str) {
        if (view != null && view2 != null && view.getContext() != null) {
            int i2 = 1;
            if (view2 instanceof C16F5) {
                C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.cqw, view.getContext());
                if (c20743516FdLIZLLL != null) {
                    c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.ee, view.getContext()));
                    c20743516FdLIZLLL.setBounds(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                } else {
                    c20743516FdLIZLLL = null;
                }
                AppCompatTextView appCompatTextView = (AppCompatTextView) view2;
                appCompatTextView.setCompoundDrawablesRelative(c20743516FdLIZLLL, null, null, null);
                if (str != null) {
                    appCompatTextView.setText(C497740JfY.LJIJJ(2131844025, str));
                }
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((Number) LJ.getValue()).intValue(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
            LIZIZ = valueAnimatorOfInt;
            if (valueAnimatorOfInt != null) {
                valueAnimatorOfInt.setDuration(300L);
            }
            ValueAnimator valueAnimator = LIZIZ;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new AUListenerS257S0100000_7(view, 0));
            }
            ValueAnimator valueAnimator2 = LIZIZ;
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new AAListenerS262S0200000_7(view, view2, 0));
            }
            C786410Ut5.LJLLLLLL(0, view2);
            ValueAnimator valueAnimator3 = LIZIZ;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
            if (z) {
                LIZJ();
            }
            if (i != 1) {
                i2 = 2;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("swipe_guide_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Integer.valueOf(i2), "type");
            c474500IjALIZ.LIZ();
        }
    }
}
