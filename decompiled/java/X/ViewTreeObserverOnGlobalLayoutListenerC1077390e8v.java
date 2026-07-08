package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0e8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1077390e8v implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1077390e8v viewTreeObserverOnGlobalLayoutListenerC1077390e8v) {
        ViewTreeObserver viewTreeObserver;
        TextView textViewLJIJI = ((AdNewFakeUserProfileHeaderWidget) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0).LJIJI();
        if (textViewLJIJI != null && (viewTreeObserver = textViewLJIJI.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1077390e8v);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1077390e8v, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        AdNewFakeUserProfileHeaderWidget adNewFakeUserProfileHeaderWidget = (AdNewFakeUserProfileHeaderWidget) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0;
        LinearLayout linearLayout = (LinearLayout) adNewFakeUserProfileHeaderWidget.LLJILLL.getValue();
        if (linearLayout != null) {
            C786410Ut5.x3(linearLayout.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1077400e8w(linearLayout, adNewFakeUserProfileHeaderWidget, 0));
            TextView textViewLJIJI2 = adNewFakeUserProfileHeaderWidget.LJIJI();
            if (textViewLJIJI2 != null && textViewLJIJI2.getLineCount() > 3) {
                C786410Ut5.LJZL(0, linearLayout);
            } else {
                C786410Ut5.LJZL(8, linearLayout);
            }
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1077390e8v viewTreeObserverOnGlobalLayoutListenerC1077390e8v) {
        C1041920dDi c1041920dDi = (C1041920dDi) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0;
        Space space = c1041920dDi.LL;
        Space space2 = null;
        if (space == null) {
            space = null;
        }
        c1041920dDi.LLILLJJLI = space.getHeight();
        Space space3 = ((C1041920dDi) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0).LL;
        if (space3 != null) {
            space2 = space3;
        }
        C786410Ut5.C3(space2.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1077390e8v);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1077390e8v viewTreeObserverOnGlobalLayoutListenerC1077390e8v) {
        C1077410e8x c1077410e8x;
        int right;
        Iterable c1077420e8y = new C1077420e8y((LinearLayout) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0, 10);
        if ((c1077420e8y instanceof Collection) && ((Collection) c1077420e8y).isEmpty()) {
            return;
        }
        Iterator it2 = c1077420e8y.iterator();
        do {
            c1077410e8x = (C1077410e8x) it2;
            if (!c1077410e8x.hasNext()) {
                return;
            }
        } while (((View) c1077410e8x.next()).getTag(R.id.u_0) != null);
        if (((LinearLayout) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0).getLayoutDirection() == 1) {
            View view = (View) C09RB.LJIJ(new C09RD((LinearLayout) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0));
            if (view != null && view.getLeft() > 0) {
                return;
            }
        } else {
            View view2 = (View) C09RB.LJIJ(new C09RD((LinearLayout) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0));
            if (view2 != null) {
                right = view2.getRight();
            } else {
                right = 0;
            }
            if (right < ((LinearLayout) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0).getWidth()) {
                return;
            }
        }
        C1077420e8y c1077420e8y2 = new C1077420e8y((LinearLayout) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0, 11);
        ArrayList<View> arrayList = new ArrayList();
        Iterator it3 = c1077420e8y2.iterator();
        while (true) {
            C1077410e8x c1077410e8x2 = (C1077410e8x) it3;
            if (!c1077410e8x2.hasNext()) {
                break;
            }
            Object next = c1077410e8x2.next();
            if (((View) next).getTag(R.id.u_0) != null) {
                arrayList.add(next);
            }
        }
        for (View view3 : arrayList) {
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.weight = 1.0f;
                C786410Ut5.W5(view3, layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1077390e8v viewTreeObserverOnGlobalLayoutListenerC1077390e8v) {
        int height = ((C1018030cbB) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0).getHeight();
        Integer num = ((C1018030cbB) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0).LLJLLL;
        if (num == null || num.intValue() != height) {
            ((C1018030cbB) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0).LLJLLL = Integer.valueOf(height);
            ((C1018030cbB) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0).LLJLILLLLZIIL.setPeekHeight(height);
        }
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC1077390e8v viewTreeObserverOnGlobalLayoutListenerC1077390e8v) {
        ((C1076950e8D) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0).LIZ();
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC1077390e8v viewTreeObserverOnGlobalLayoutListenerC1077390e8v) {
        boolean z;
        C1069080dvW c1069080dvW = (C1069080dvW) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0;
        c1069080dvW.getWindowVisibleDisplayFrame(c1069080dvW.LLJJIJI);
        int height = ((C1069080dvW) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0).getRootView().getHeight() - ((C1069080dvW) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0).LLJJIJI.height();
        C1069080dvW c1069080dvW2 = (C1069080dvW) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0;
        if (height > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))) {
            z = true;
        } else {
            z = false;
        }
        c1069080dvW2.LLJILJIL = z;
        C1069080dvW c1069080dvW3 = (C1069080dvW) viewTreeObserverOnGlobalLayoutListenerC1077390e8v.l0;
        if (c1069080dvW3.LLJILJIL) {
            c1069080dvW3.getPullRefreshController().LIZLLL();
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1077390e8v(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
