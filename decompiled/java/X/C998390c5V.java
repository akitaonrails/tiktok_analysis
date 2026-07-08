package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0c5V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C998390c5V implements C0T9P {
    public final ViewGroup LIZ;
    public View LIZIZ;
    public boolean LIZJ;

    @Override // X.C0T9Q
    public final int LIZLLL() {
        C01GW<Integer> c01gw = ConstraintSizeVM.LL;
        return C693770RJf.LIZIZ();
    }

    public final View LJI() {
        ViewParent parent;
        if (!this.LIZJ) {
            View viewFindViewById = this.LIZ.findViewById(R.id.ow0);
            ViewParent parent2 = (viewFindViewById == null || (parent = viewFindViewById.getParent()) == null) ? null : parent.getParent();
            this.LIZIZ = parent2 instanceof View ? (View) parent2 : null;
            this.LIZJ = true;
        }
        return this.LIZIZ;
    }

    public C998390c5V(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    @Override // X.C0T9Q
    public final void LIZIZ(float f) {
        View viewLJI = LJI();
        if (viewLJI != null) {
            C786410Ut5.T4(viewLJI, f);
        }
    }

    @Override // X.C0T9Q
    public final void LIZJ(int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View viewLJI = LJI();
        ViewGroup.LayoutParams layoutParams2 = null;
        if (viewLJI != null) {
            layoutParams = viewLJI.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.bottomMargin = i;
        }
        View viewLJI2 = LJI();
        if (viewLJI2 != null) {
            View viewLJI3 = LJI();
            if (viewLJI3 != null) {
                layoutParams2 = viewLJI3.getLayoutParams();
            }
            C786410Ut5.W5(viewLJI2, layoutParams2);
        }
    }

    @Override // X.C0T9Q
    public final void LJFF(int i) {
        View viewLJI = LJI();
        if (viewLJI != null) {
            C786410Ut5.LJLLLLLL(i, viewLJI);
        }
    }

    @Override // X.C0T9P
    public final void LIZ(float f, Function1<? super View, Boolean> function1) {
        C1077420e8y c1077420e8y = new C1077420e8y(this.LIZ, 17);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = c1077420e8y.iterator();
        while (true) {
            C1077410e8x c1077410e8x = (C1077410e8x) it2;
            if (!c1077410e8x.hasNext()) {
                break;
            }
            Object next = c1077410e8x.next();
            if (function1.invoke(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C786410Ut5.T4((View) it3.next(), f);
            arrayList2.add(Unit.LIZ);
        }
    }

    @Override // X.C0T9P
    public final void LJ(int i, Function1<? super View, Boolean> function1) {
        C1077420e8y c1077420e8y = new C1077420e8y(this.LIZ, 18);
        ArrayList<View> arrayList = new ArrayList();
        Iterator it2 = c1077420e8y.iterator();
        while (true) {
            C1077410e8x c1077410e8x = (C1077410e8x) it2;
            if (!c1077410e8x.hasNext()) {
                break;
            }
            Object next = c1077410e8x.next();
            if (function1.invoke(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (View view : arrayList) {
            C786410Ut5.LJLLLLLL(i, view);
            view.requestLayout();
            arrayList2.add(Unit.LIZ);
        }
    }
}
