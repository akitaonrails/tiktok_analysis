package X;

import Y.ACListenerS152S0100000_17;
import Y.ARunnableS20S0100100_17;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0ePh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087790ePh {
    public static final C986850bmt LIZ = new C986850bmt(Integer.TYPE, 0);
    public static final Map<Long, WeakReference<View>> LIZIZ = new HashMap();
    public static final Map<Long, WeakReference<ValueAnimator>> LIZJ = new HashMap();
    public static final Map<Long, Long> LIZLLL = new HashMap();
    public static final Map<Long, C1087800ePi> LJ = new HashMap();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(18));

    public static Handler LJ() {
        return (Handler) LJFF.getValue();
    }

    public static void LIZJ() {
        LJ().removeMessages(1);
        Iterator it2 = ((HashMap) LJ).values().iterator();
        while (it2.hasNext()) {
            Runnable runnable = ((C1087800ePi) it2.next()).LIZLLL;
            if (runnable != null) {
                LJ().removeCallbacks(runnable);
            }
        }
        ((HashMap) LJ).clear();
        Iterator it3 = C13LP.LLIIII(((HashMap) LIZIZ).keySet()).iterator();
        while (it3.hasNext()) {
            LJFF(((Number) it3.next()).longValue());
        }
        ((HashMap) LIZLLL).clear();
        Iterator it4 = ((HashMap) LIZJ).values().iterator();
        while (it4.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) ((Reference) it4.next()).get();
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }
        ((HashMap) LIZJ).clear();
    }

    public static void LIZIZ(long j) {
        Runnable runnable;
        C1087800ePi c1087800ePi = (C1087800ePi) ((HashMap) LJ).remove(Long.valueOf(j));
        if (c1087800ePi != null && (runnable = c1087800ePi.LIZLLL) != null) {
            LJ().removeCallbacks(runnable);
        }
    }

    public static void LIZLLL(long j) {
        if (j <= 0) {
            return;
        }
        Set setEntrySet = ((HashMap) LJ).entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setEntrySet) {
            if (((C1087800ePi) ((Map.Entry) obj).getValue()).LIZ.LJ == j) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((Number) ((Map.Entry) it2.next()).getKey()).longValue()));
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            LIZIZ(((Number) it3.next()).longValue());
        }
        Set setEntrySet2 = ((HashMap) LIZLLL).entrySet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : setEntrySet2) {
            if (((Number) ((Map.Entry) obj2).getValue()).longValue() == j) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(Long.valueOf(((Number) ((Map.Entry) it4.next()).getKey()).longValue()));
        }
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            long jLongValue = ((Number) it5.next()).longValue();
            LIZIZ(jLongValue);
            LJFF(jLongValue);
        }
    }

    public static void LJFF(long j) {
        View view;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator;
        LJ().removeMessages(1, Long.valueOf(j));
        Reference reference = (Reference) ((HashMap) LIZJ).remove(Long.valueOf(j));
        if (reference != null && (valueAnimator = (ValueAnimator) reference.get()) != null) {
            valueAnimator.cancel();
        }
        ((HashMap) LIZLLL).remove(Long.valueOf(j));
        Reference reference2 = (Reference) ((HashMap) LIZIZ).remove(Long.valueOf(j));
        if (reference2 != null && (view = (View) reference2.get()) != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
        }
    }

    public static void LIZ(long j, C1087810ePj c1087810ePj, Function1 function1) {
        LIZIZ(j);
        if (LJI(j, c1087810ePj, function1)) {
            return;
        }
        C1087800ePi c1087800ePi = new C1087800ePi(c1087810ePj, function1);
        ((HashMap) LJ).put(Long.valueOf(j), c1087800ePi);
        ARunnableS20S0100100_17 aRunnableS20S0100100_17 = new ARunnableS20S0100100_17(j, c1087800ePi, 1);
        c1087800ePi.LIZLLL = aRunnableS20S0100100_17;
        C786410Ut5.LJLIIL(300L, LJ(), aRunnableS20S0100100_17);
    }

    public static boolean LJI(long j, C1087810ePj c1087810ePj, Function1 function1) {
        int iLIZ;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bml;
        View view = (View) function1.invoke(Long.valueOf(j));
        if (view == null) {
            return false;
        }
        if (c1087810ePj.LIZLLL > 0) {
            iLIZ = (int) (c1087810ePj.LIZLLL - (C158B.LIZ() / 1000));
        } else {
            iLIZ = c1087810ePj.LIZJ;
        }
        if (iLIZ <= 0) {
            LJFF(c1087810ePj.LIZ);
            return true;
        }
        LJFF(c1087810ePj.LIZ);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.nkh);
        if (linearLayout == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attach: ln_rival_container_new missing in window anchorId=");
            sbLIZ.append(c1087810ePj.LIZ);
            C20441214yg.LJIIL("VirtualTicketBoxGuideViewHelper", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        View viewFindViewById = view.findViewById(R.id.tna);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(linearLayout.getContext()), R.layout.ht2, linearLayout, false);
        if (viewTd.getId() == -1) {
            viewTd.setId(View.generateViewId());
        }
        viewTd.setTag("virtual_ticket_cross_room");
        viewTd.setClickable(true);
        viewTd.setFocusable(true);
        ImageView imageView = (ImageView) viewTd.findViewById(R.id.le8);
        ProgressBar progressBar = (ProgressBar) viewTd.findViewById(R.id.view_progressbar);
        imageView.setBackgroundResource(R.drawable.e6m);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int iLIZIZ = (int) C497740JfY.LIZIZ(3.5f);
        imageView.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        imageView.setImageResource(R.drawable.est);
        int i = iLIZ * 10;
        progressBar.setMax(i);
        progressBar.setProgress(i);
        C786410Ut5.I7(new ACListenerS152S0100000_17(c1087810ePj, 150), viewTd);
        if ((view instanceof ViewOnClickListenerC986770bml) && (viewOnClickListenerC986770bml = (ViewOnClickListenerC986770bml) view) != null) {
            viewOnClickListenerC986770bml.V0();
        }
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        }
        C786410Ut5.LJZL(0, linearLayout);
        linearLayout.addView(viewTd, new ViewGroup.LayoutParams(-1, -1));
        C786410Ut5.LJLLLLLL(0, viewTd);
        ((HashMap) LIZIZ).put(Long.valueOf(c1087810ePj.LIZ), new WeakReference(viewTd));
        ((HashMap) LIZLLL).put(Long.valueOf(c1087810ePj.LIZ), Long.valueOf(c1087810ePj.LJ));
        long j2 = ((long) iLIZ) * 1000;
        C786410Ut5.LJLJLJ(LJ(), LJ().obtainMessage(1, Long.valueOf(c1087810ePj.LIZ)), j2);
        final long j3 = c1087810ePj.LIZ;
        final ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(progressBar, LIZ, i, 0);
        objectAnimatorOfInt.setDuration(j2);
        objectAnimatorOfInt.setInterpolator(new LinearInterpolator());
        objectAnimatorOfInt.addListener(new AnimatorListenerAdapter() { // from class: X.0ePg
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                Object obj;
                Map<Long, WeakReference<ValueAnimator>> map = C1087790ePh.LIZJ;
                Reference reference = (Reference) ((HashMap) map).get(Long.valueOf(j3));
                if (reference != null) {
                    obj = reference.get();
                } else {
                    obj = null;
                }
                if (obj == objectAnimatorOfInt) {
                    ((HashMap) map).remove(Long.valueOf(j3));
                }
            }
        });
        ((HashMap) LIZJ).put(Long.valueOf(j3), new WeakReference(objectAnimatorOfInt));
        C786410Ut5.Pd(objectAnimatorOfInt);
        return true;
    }
}
