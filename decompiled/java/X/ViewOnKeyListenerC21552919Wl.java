package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.19Wl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class ViewOnKeyListenerC21552919Wl extends AbstractC21552619Wi implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final Context LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final boolean LLILZLL;
    public final Handler LLIZ;
    public View LLJJ;
    public View LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJJ;
    public InterfaceC21549519Vd LLJJJJJIL;
    public ViewTreeObserver LLJJJJLIIL;
    public PopupWindow.OnDismissListener LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final List<C19V6> LLIZLLLIL = new ArrayList();
    public final List<C19X2> LLJ = new ArrayList();
    public final ViewTreeObserverOnGlobalLayoutListenerC2189681Ams LLJI = new ViewTreeObserverOnGlobalLayoutListenerC2189681Ams(this, 0);
    public final ViewOnAttachStateChangeListenerC2189571Amh LLJIJIL = new ViewOnAttachStateChangeListenerC2189571Amh(this, 1);
    public final C21553219Wo LLJILJIL = new C21553219Wo(this);
    public int LLJILJILJ = 0;
    public int LLJILLL = 0;
    public boolean LLJJJIL = false;

    @Override // X.C19V7
    public final Parcelable LIZIZ() {
        return null;
    }

    @Override // X.C19V7
    public final boolean LJFF() {
        return false;
    }

    @Override // X.C19V7
    public final void LJIIIZ(Parcelable parcelable) {
    }

    @Override // X.InterfaceC21551219Vu
    public final C21552519Wh Wl() {
        if (((ArrayList) this.LLJ).isEmpty()) {
            return null;
        }
        return ((C19X2) ListProtector.get(this.LLJ, ((ArrayList) r1).size() - 1)).LIZ.LLILLL;
    }

    @Override // X.InterfaceC21551219Vu
    public final void dismiss() {
        int size = ((ArrayList) this.LLJ).size();
        if (size > 0) {
            C19X2[] c19x2Arr = (C19X2[]) ((ArrayList) this.LLJ).toArray(new C19X2[size]);
            for (int i = size - 1; i >= 0; i--) {
                C19X2 c19x2 = c19x2Arr[i];
                if (c19x2.LIZ.isShowing()) {
                    c19x2.LIZ.dismiss();
                }
            }
        }
    }

    @Override // X.InterfaceC21551219Vu
    public final boolean isShowing() {
        return ((ArrayList) this.LLJ).size() > 0 && ((C19X2) ListProtector.get(this.LLJ, 0)).LIZ.isShowing();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int size = ((ArrayList) this.LLJ).size();
        for (int i = 0; i < size; i++) {
            C19X2 c19x2 = (C19X2) ListProtector.get(this.LLJ, i);
            if (!c19x2.LIZ.isShowing()) {
                c19x2.LIZIZ.LIZJ(false);
                return;
            }
        }
    }

    @Override // X.InterfaceC21551219Vu
    public final void show() {
        if (isShowing()) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            LJIJJ((C19V6) it2.next());
        }
        ((ArrayList) this.LLIZLLLIL).clear();
        View view = this.LLJJ;
        this.LLJJI = view;
        if (view != null) {
            boolean z = this.LLJJJJLIIL == null;
            this.LLJJJJLIIL = view.getViewTreeObserver();
            if (z) {
                C786410Ut5.x3(this.LLJJJJLIIL, this.LLJI);
            }
            this.LLJJI.addOnAttachStateChangeListener(this.LLJIJIL);
        }
    }

    @Override // X.C19V7
    public final boolean LIZLLL(SubMenuC21548419Us subMenuC21548419Us) {
        for (C19X2 c19x2 : (ArrayList) this.LLJ) {
            if (subMenuC21548419Us == c19x2.LIZIZ) {
                c19x2.LIZ.LLILLL.requestFocus();
                return true;
            }
        }
        if (subMenuC21548419Us.hasVisibleItems()) {
            LJIIJ(subMenuC21548419Us);
            InterfaceC21549519Vd interfaceC21549519Vd = this.LLJJJJJIL;
            if (interfaceC21549519Vd != null) {
                interfaceC21549519Vd.LIZIZ(subMenuC21548419Us);
            }
            return true;
        }
        return false;
    }

    @Override // X.C19V7
    public final void LJI(InterfaceC21549519Vd interfaceC21549519Vd) {
        this.LLJJJJJIL = interfaceC21549519Vd;
    }

    @Override // X.C19V7
    public final void LJII(boolean z) {
        Iterator it2 = ((ArrayList) this.LLJ).iterator();
        while (it2.hasNext()) {
            ListAdapter adapter = ((C19X2) it2.next()).LIZ.LLILLL.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C21549919Vh) adapter).notifyDataSetChanged();
        }
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIIJ(C19V6 c19v6) {
        c19v6.LIZIZ(this, this.LLILLJJLI);
        if (isShowing()) {
            LJIJJ(c19v6);
        } else {
            ((ArrayList) this.LLIZLLLIL).add(c19v6);
        }
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIIL(View view) {
        if (this.LLJJ != view) {
            this.LLJJ = view;
            this.LLJILLL = Gravity.getAbsoluteGravity(this.LLJILJILJ, view.getLayoutDirection());
        }
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIILIIL(boolean z) {
        this.LLJJJIL = z;
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIILJJIL(int i) {
        if (this.LLJILJILJ != i) {
            this.LLJILJILJ = i;
            this.LLJILLL = Gravity.getAbsoluteGravity(i, this.LLJJ.getLayoutDirection());
        }
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIILL(int i) {
        this.LLJJIJI = true;
        this.LLJJIJIL = i;
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIILLIIL(PopupWindow.OnDismissListener onDismissListener) {
        this.LLJJL = onDismissListener;
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIIZILJ(boolean z) {
        this.LLJJJJ = z;
    }

    @Override // X.AbstractC21552619Wi
    public final void LJIJ(int i) {
        this.LLJJIJIIJIL = true;
        this.LLJJJ = i;
    }

    public final void LJIJJ(C19V6 c19v6) {
        C19X2 c19x2;
        Rect rect;
        View childAt;
        int i;
        boolean z;
        int i2;
        int i3;
        int width;
        C21549919Vh c21549919Vh;
        int headersCount;
        int firstVisiblePosition;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(this.LLILLJJLI);
        C21549919Vh c21549919Vh2 = new C21549919Vh(c19v6, layoutInflaterNe, this.LLILZLL, R.layout.hp);
        if (!isShowing() && this.LLJJJIL) {
            c21549919Vh2.LLILLL = true;
        } else if (isShowing()) {
            c21549919Vh2.LLILLL = AbstractC21552619Wi.LJIJI(c19v6);
        }
        int iLJIIJJI = AbstractC21552619Wi.LJIIJJI(c21549919Vh2, this.LLILLJJLI, this.LLILLL);
        C21553119Wn c21553119Wn = new C21553119Wn(this.LLILLJJLI, this.LLILZ, this.LLILZIL);
        c21553119Wn.LLJLIL = this.LLJILJIL;
        c21553119Wn.LLJJI = this;
        c21553119Wn.LLJJJJLIIL.setOnDismissListener(this);
        c21553119Wn.LLJJ = this.LLJJ;
        c21553119Wn.LLJILJIL = this.LLJILLL;
        c21553119Wn.LLJJJJJIL = true;
        c21553119Wn.LLJJJJLIIL.setFocusable(true);
        c21553119Wn.LLJJJJLIIL.setInputMethodMode(2);
        c21553119Wn.LJIILJJIL(c21549919Vh2);
        c21553119Wn.LIZLLL(iLJIIJJI);
        c21553119Wn.LLJILJIL = this.LLJILLL;
        if (((ArrayList) this.LLJ).size() > 0) {
            List<C19X2> list = this.LLJ;
            c19x2 = (C19X2) ListProtector.get(list, ((ArrayList) list).size() - 1);
            C19V6 c19v62 = c19x2.LIZIZ;
            int size = c19v62.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                MenuItem item = c19v62.getItem(i4);
                if (item.hasSubMenu() && c19v6 == item.getSubMenu()) {
                    C21552519Wh c21552519Wh = c19x2.LIZ.LLILLL;
                    ListAdapter adapter = c21552519Wh.getAdapter();
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        headersCount = headerViewListAdapter.getHeadersCount();
                        c21549919Vh = (C21549919Vh) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        c21549919Vh = (C21549919Vh) adapter;
                        headersCount = 0;
                    }
                    int count = c21549919Vh.getCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= count) {
                            break;
                        }
                        if (item == c21549919Vh.getItem(i5)) {
                            if (i5 == -1 || (firstVisiblePosition = (i5 + headersCount) - c21552519Wh.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= c21552519Wh.getChildCount()) {
                                break;
                            } else {
                                childAt = c21552519Wh.getChildAt(firstVisiblePosition);
                            }
                        } else {
                            i5++;
                        }
                    }
                } else {
                    i4++;
                }
            }
            childAt = null;
            if (childAt != null) {
                if (Build.VERSION.SDK_INT <= 28) {
                    Method method = C21553119Wn.LLJLILLLLZIIL;
                    if (method != null) {
                        try {
                            method.invoke(c21553119Wn.LLJJJJLIIL, Boolean.FALSE);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } else {
                    C19XC.LIZ(c21553119Wn.LLJJJJLIIL, false);
                }
                C19X5.LIZ(c21553119Wn.LLJJJJLIIL, null);
                List<C19X2> list2 = this.LLJ;
                C21552519Wh c21552519Wh2 = ((C19X2) ListProtector.get(list2, ((ArrayList) list2).size() - 1)).LIZ.LLILLL;
                int[] iArr = new int[2];
                c21552519Wh2.getLocationOnScreen(iArr);
                Rect rect2 = new Rect();
                this.LLJJI.getWindowVisibleDisplayFrame(rect2);
                if (this.LLJJIII != 1 ? iArr[0] - iLJIIJJI >= 0 : iArr[0] + c21552519Wh2.getWidth() + iLJIIJJI > rect2.right) {
                    i = 0;
                    z = false;
                } else {
                    i = 1;
                    z = true;
                }
                this.LLJJIII = i;
                if (Build.VERSION.SDK_INT >= 26) {
                    c21553119Wn.LLJJ = childAt;
                    i3 = 0;
                    i2 = 0;
                } else {
                    int[] iArr2 = new int[2];
                    this.LLJJ.getLocationOnScreen(iArr2);
                    int[] iArr3 = new int[2];
                    childAt.getLocationOnScreen(iArr3);
                    if ((this.LLJILLL & 7) == 5) {
                        iArr2[0] = iArr2[0] + this.LLJJ.getWidth();
                        iArr3[0] = iArr3[0] + childAt.getWidth();
                    }
                    i2 = iArr3[0] - iArr2[0];
                    i3 = iArr3[1] - iArr2[1];
                }
                if ((this.LLJILLL & 5) == 5) {
                    if (z) {
                        width = i2 + iLJIIJJI;
                    } else {
                        width = i2 - childAt.getWidth();
                    }
                } else if (z) {
                    width = i2 + childAt.getWidth();
                } else {
                    width = i2 - iLJIIJJI;
                }
                c21553119Wn.LLILZLL = width;
                c21553119Wn.LLJIJIL = true;
                c21553119Wn.LLJI = true;
                c21553119Wn.LJIIIIZZ(i3);
            }
            ((ArrayList) this.LLJ).add(new C19X2(c21553119Wn, c19v6, this.LLJJIII));
            c21553119Wn.show();
            C21552519Wh c21552519Wh3 = c21553119Wn.LLILLL;
            c21552519Wh3.setOnKeyListener(this);
            if (c19x2 != null && this.LLJJJJ && c19v6.LJIIL != null) {
                View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.hw, c21552519Wh3, false);
                TextView textView = (TextView) viewTd.findViewById(android.R.id.title);
                viewTd.setEnabled(false);
                textView.setText(c19v6.LJIIL);
                c21552519Wh3.addHeaderView(viewTd, null, false);
                c21553119Wn.show();
                return;
            }
            return;
        }
        c19x2 = null;
        if (this.LLJJIJI) {
            c21553119Wn.LLILZLL = this.LLJJIJIL;
        }
        if (this.LLJJIJIIJIL) {
            c21553119Wn.LJIIIIZZ(this.LLJJJ);
        }
        Rect rect3 = this.LL;
        if (rect3 != null) {
            rect = new Rect(rect3);
        } else {
            rect = null;
        }
        c21553119Wn.LLJJJJ = rect;
        ((ArrayList) this.LLJ).add(new C19X2(c21553119Wn, c19v6, this.LLJJIII));
        c21553119Wn.show();
        C21552519Wh c21552519Wh32 = c21553119Wn.LLILLL;
        c21552519Wh32.setOnKeyListener(this);
        if (c19x2 != null) {
        }
    }

    @Override // X.C19V7
    public final void LIZ(C19V6 c19v6, boolean z) {
        int i;
        int size = ((ArrayList) this.LLJ).size();
        for (int i2 = 0; i2 < size; i2++) {
            if (c19v6 == ((C19X2) ListProtector.get(this.LLJ, i2)).LIZIZ) {
                if (i2 >= 0) {
                    int i3 = i2 + 1;
                    if (i3 < ((ArrayList) this.LLJ).size()) {
                        ((C19X2) ListProtector.get(this.LLJ, i3)).LIZIZ.LIZJ(false);
                    }
                    C19X2 c19x2 = (C19X2) ListProtector.remove(this.LLJ, i2);
                    c19x2.LIZIZ.LJIIZILJ(this);
                    if (this.LLJJLIIIJLLLLLLLZ) {
                        C19X5.LIZIZ(c19x2.LIZ.LLJJJJLIIL, null);
                        c19x2.LIZ.LLJJJJLIIL.setAnimationStyle(0);
                    }
                    c19x2.LIZ.dismiss();
                    int size2 = ((ArrayList) this.LLJ).size();
                    if (size2 > 0) {
                        this.LLJJIII = ((C19X2) ListProtector.get(this.LLJ, size2 - 1)).LIZJ;
                    } else {
                        if (this.LLJJ.getLayoutDirection() == 1) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        this.LLJJIII = i;
                        if (size2 == 0) {
                            dismiss();
                            InterfaceC21549519Vd interfaceC21549519Vd = this.LLJJJJJIL;
                            if (interfaceC21549519Vd != null) {
                                interfaceC21549519Vd.LIZ(c19v6, true);
                            }
                            ViewTreeObserver viewTreeObserver = this.LLJJJJLIIL;
                            if (viewTreeObserver != null) {
                                if (viewTreeObserver.isAlive()) {
                                    C786410Ut5.A3(this.LLJJJJLIIL, this.LLJI);
                                }
                                this.LLJJJJLIIL = null;
                            }
                            this.LLJJI.removeOnAttachStateChangeListener(this.LLJIJIL);
                            this.LLJJL.onDismiss();
                            return;
                        }
                    }
                    if (z) {
                        ((C19X2) ListProtector.get(this.LLJ, 0)).LIZIZ.LIZJ(false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    public ViewOnKeyListenerC21552919Wl(Context context, View view, int i, int i2, boolean z) {
        this.LLILLJJLI = context;
        this.LLJJ = view;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = z;
        this.LLJJIII = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.LLILLL = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.cm));
        this.LLIZ = new Handler();
    }
}
