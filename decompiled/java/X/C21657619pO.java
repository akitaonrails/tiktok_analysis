package X;

import X.InterfaceC21657319pL;
import Y.AAListenerS343S0100000_33;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19pO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21657619pO<T extends InterfaceC21657319pL> {
    public final View LIZ;
    public final C436680HAk LIZIZ;
    public final List<AbstractC1863890ybT<T>> LIZJ;
    public boolean LIZLLL;

    public final void LIZIZ() {
        if (this.LIZLLL) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC1863890ybT<T> abstractC1863890ybT : this.LIZJ) {
                arrayList.add(ObjectAnimator.ofFloat(abstractC1863890ybT, (Property<AbstractC1863890ybT<T>, Float>) View.TRANSLATION_X, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(abstractC1863890ybT, (Property<AbstractC1863890ybT<T>, Float>) View.ALPHA, 1.0f));
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(300L);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new AAListenerS343S0100000_33(this, 14));
            animatorSet.addListener(new AAListenerS343S0100000_33(this, 13));
            animatorSet.addListener(new AAListenerS343S0100000_33(this, 12));
            animatorSet.start();
        }
    }

    public static double LIZ(View view) {
        if (view == null) {
            return 0.0d;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return ((double) iArr[0]) + (((double) view.getWidth()) * 0.5d);
    }

    public final void LIZJ(T t) {
        AbstractC1863890ybT<T> next;
        final int iIndexOf;
        int iLIZ;
        if (t == null) {
            return;
        }
        final C118300cf c118300cf = new C118300cf();
        int iLIZ2 = (int) LIZ(this.LIZIZ);
        c118300cf.element = iLIZ2;
        if (iLIZ2 <= 0) {
            View view = this.LIZ;
            if (view != null) {
                iLIZ = (int) LIZ(view);
            } else {
                iLIZ = 0;
            }
            c118300cf.element = iLIZ;
        }
        Iterator<AbstractC1863890ybT<T>> it2 = this.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Long lLIZ = next.LIZ();
                long jLIZ = t.LIZ();
                if (lLIZ != null && lLIZ.longValue() == jLIZ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        final AbstractC1863890ybT<T> abstractC1863890ybT = next;
        if (abstractC1863890ybT == null || (iIndexOf = this.LIZJ.indexOf(abstractC1863890ybT)) < 0) {
            return;
        }
        abstractC1863890ybT.LIZLLL(t, new AwS577S0100000_33(this, 3869));
        HandlerHook.viewPost(abstractC1863890ybT, new Runnable() { // from class: X.19pM
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TakoBottomBarAnimImpl@6e4a.playEnterAnim$2");
                try {
                    if (abstractC1863890ybT.getParent() != null) {
                        C21657619pO<T> c21657619pO = this;
                        C118300cf c118300cf2 = c118300cf;
                        C13MK.LIZLLL(new C21657519pN(iIndexOf, c21657619pO, abstractC1863890ybT, c118300cf2));
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TakoBottomBarAnimImpl@6e4a.playEnterAnim$2");
            }
        });
    }

    public C21657619pO(RecyclerView recyclerView, C436680HAk c436680HAk, List list) {
        this.LIZ = recyclerView;
        this.LIZIZ = c436680HAk;
        this.LIZJ = list;
    }
}
