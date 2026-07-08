package X;

import Y.ARunnableS114S0100000_14;
import Y.AUListenerS265S0100000_16;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mHG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390080mHG extends C214906198m {
    public static final Map<String, Pair<WeakReference<View>, WeakReference<C1390080mHG>>> LLIZ = new LinkedHashMap();
    public final Context LL;
    public final View LLILLJJLI;
    public final C1383230m6D LLILLL;
    public final boolean LLILZ;
    public View LLILZIL;
    public C1361400lX0 LLILZLL;

    public final void LJJIIJZLJL() {
        C1390080mHG c1390080mHG;
        Boolean boolValueOf;
        View view = this.LLILZIL;
        if (view == null) {
            return;
        }
        try {
            C1389920mH0 c1389920mH0 = this.LLILLL.LIZ;
            c1389920mH0.LIZ = Long.valueOf(SystemClock.elapsedRealtime() + c1389920mH0.LJ);
            View view2 = this.LLILLJJLI;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LL);
            if (c19egLIZIZ != null) {
                boolValueOf = Boolean.valueOf(C0T45.LIZIZ(c19egLIZIZ) > 0);
            } else {
                boolValueOf = null;
            }
            showAtLocation(view2, (!this.LLILZ || (boolValueOf != null && boolValueOf.booleanValue())) ? 48 : 8388661, 0, 0);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(this);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
            view.announceForAccessibility(c1389920mH0.LIZIZ);
            boolean z = c1389920mH0.LJFF;
            View view3 = this.LLILZIL;
            if (view3 != null && !z) {
                LinearLayout linearLayout = (LinearLayout) view3.findViewById(R.id.x0i);
                C786410Ut5.W4(linearLayout, 1.0f);
                C786410Ut5.Rb(linearLayout, 1.0f);
                C786410Ut5.sc(linearLayout, 1.0f);
            }
            if (c1389920mH0.LJFF) {
                LJJIIJ(true);
            }
            C786410Ut5.LJLIIL(c1389920mH0.LJ, new BPEAHandler(Looper.getMainLooper()), new ARunnableS114S0100000_14(this, 45));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        String simpleName = C1390080mHG.class.getSimpleName();
        Map<String, Pair<WeakReference<View>, WeakReference<C1390080mHG>>> map = LLIZ;
        Pair pair = (Pair) ((LinkedHashMap) map).get(simpleName);
        if (pair == null) {
            pair = new Pair(null, null);
        }
        Reference reference = (Reference) pair.getFirst();
        Reference reference2 = (Reference) pair.getSecond();
        if (Intrinsics.LJFF(reference != null ? reference.get() : null, this.LLILLJJLI) && reference2 != null && (c1390080mHG = (C1390080mHG) reference2.get()) != null && !Intrinsics.LJFF(c1390080mHG, this) && c1390080mHG.isShowing()) {
            c1390080mHG.LJJIIZ();
        }
        map.put(simpleName, new Pair<>(new WeakReference(this.LLILLJJLI), new WeakReference(this)));
    }

    @Override // X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        if (!this.LLILLL.LIZ.LJI) {
            LJJIIZ();
        } else {
            LJJIIJ(false);
            C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS114S0100000_14(this, 44));
        }
    }

    public final void LJJIIZ() {
        Function0<Unit> function0;
        try {
            super.dismiss();
            WeakReference<Function0<Unit>> weakReference = this.LLILLL.LIZ.LJIIIZ;
            if (weakReference == null || (function0 = weakReference.get()) == null) {
                return;
            }
            function0.invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJIIJ(boolean z) {
        float f;
        View view = this.LLILZIL;
        if (view == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.x0i);
        float f2 = 0.0f;
        float f3 = 0.8f;
        float f4 = 1.0f;
        if (z) {
            f = 0.8f;
            f3 = 1.0f;
        } else {
            f = 1.0f;
            f4 = 0.0f;
            f2 = 1.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f4);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS265S0100000_16(linearLayout, 36));
        valueAnimatorOfFloat.start();
        C21616519il c21616519ilLJIILL = C1619980sG4.LJIILL(linearLayout, AbstractC21616419ik.LJIILL, f3);
        c21616519ilLJIILL.LJI(f);
        c21616519ilLJIILL.LJIIIZ();
        C21616519il c21616519ilLJIILL2 = C1619980sG4.LJIILL(linearLayout, AbstractC21616419ik.LJIILLIIL, f3);
        c21616519ilLJIILL2.LJI(f);
        c21616519ilLJIILL2.LJIIIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1390080mHG(android.content.Context r21, android.view.View r22, X.C1383230m6D r23, java.lang.Integer r24, java.lang.Integer r25, boolean r26, boolean r27, int r28) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1390080mHG.<init>(android.content.Context, android.view.View, X.0m6D, java.lang.Integer, java.lang.Integer, boolean, boolean, int):void");
    }
}
