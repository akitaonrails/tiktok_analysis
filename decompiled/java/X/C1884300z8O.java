package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.0z8O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884300z8O extends C21578619ce {
    public int curTabIndex;
    public boolean firstAttached;
    public final C01GW itemContainer$delegate;
    public final C01GW itemLoadingView$delegate;
    public boolean loadingStatus;
    public final C01GW retryContainer$delegate;
    public InterfaceC1883470z73 tabEventListener;
    public final C01GW tabStatusView$delegate;
    public static final C1884360z8U Companion = new Object() { // from class: X.0z8U
    };
    public static final int $stable = 8;

    private final void hideLoading() {
        this.loadingStatus = false;
        View itemLoadingView = getItemLoadingView();
        if (itemLoadingView != null) {
            C786410Ut5.LJLLLLLL(8, itemLoadingView);
        }
    }

    public final void onDestroy() {
        this.tabEventListener = null;
    }

    public final void showLoading() {
        this.loadingStatus = true;
        View itemLoadingView = getItemLoadingView();
        if (itemLoadingView != null) {
            C786410Ut5.LJLLLLLL(0, itemLoadingView);
        }
        hideRetryBtn();
        C500260Jjc.LJIILIIL(getItemContainer());
    }

    private final View getItemContainer() {
        return (View) this.itemContainer$delegate.getValue();
    }

    private final View getItemLoadingView() {
        return (View) this.itemLoadingView$delegate.getValue();
    }

    private final ViewGroup getRetryContainer() {
        return (ViewGroup) this.retryContainer$delegate.getValue();
    }

    private final C1749280vcc getTabStatusView() {
        return (C1749280vcc) this.tabStatusView$delegate.getValue();
    }

    private final void initListeners() {
        setOnScrollChangeListener(new InterfaceC1809520xBm() { // from class: X.0z7P
            @Override // X.InterfaceC1809520xBm
            public final void LIZ(C21578619ce c21578619ce, int i, int i2, int i3, int i4) {
                C1884300z8O c1884300z8O = this.LIZ;
                InterfaceC1883470z73 interfaceC1883470z73 = c1884300z8O.tabEventListener;
                if (interfaceC1883470z73 != null) {
                    interfaceC1883470z73.LIZ(c1884300z8O.curTabIndex, i2);
                }
                if (i2 == c21578619ce.getChildAt(0).getMeasuredHeight() - c21578619ce.getMeasuredHeight()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("notify child scroll bottom reached, tab index = ");
                    sbLIZ.append(this.LIZ.curTabIndex);
                    C20441214yg.LIZIZ("MixTabItemNestedScrollView", C2188811AlT.LIZIZ(sbLIZ));
                    C1884300z8O c1884300z8O2 = this.LIZ;
                    InterfaceC1883470z73 interfaceC1883470z732 = c1884300z8O2.tabEventListener;
                    if (interfaceC1883470z732 != null) {
                        interfaceC1883470z732.LIZJ(c1884300z8O2.curTabIndex);
                    }
                }
            }
        });
    }

    public final void notifyClickRetry() {
        InterfaceC1883470z73 interfaceC1883470z73 = this.tabEventListener;
        if (interfaceC1883470z73 != null) {
            interfaceC1883470z73.LIZLLL(this.curTabIndex, 0);
        }
    }

    private final View findParentScrollView() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof InterfaceC1354050lL9) {
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }
        return null;
    }

    private final void hideRetryBtn() {
        C500260Jjc.LJIILIIL(getRetryContainer());
    }

    @Override // X.C21578619ce, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View itemLoadingView;
        super.onAttachedToWindow();
        if (!this.firstAttached) {
            this.firstAttached = true;
            initListeners();
        }
        if (!this.loadingStatus || (itemLoadingView = getItemLoadingView()) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, itemLoadingView);
    }

    public final void showChildCards() {
        hideLoading();
        hideRetryBtn();
        C500260Jjc.LLFFF(getItemContainer());
    }

    public final void showRetryBtn() {
        ViewGroup retryContainer = getRetryContainer();
        if (retryContainer != null) {
            C500260Jjc.LLFFF(retryContainer);
        }
        C1749280vcc tabStatusView = getTabStatusView();
        if (tabStatusView != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LJFF(c1722300uv6, new C1884350z8T(this));
            tabStatusView.setStatus(c1722300uv6);
        }
        C1749280vcc tabStatusView2 = getTabStatusView();
        if (tabStatusView2 != null) {
            tabStatusView2.setButtonTopMargin(C497740JfY.LIZIZ(24.0f));
        }
        hideLoading();
        C500260Jjc.LJIILIIL(getItemContainer());
    }

    public final void setTabEventListener(InterfaceC1883470z73 interfaceC1883470z73) {
        this.tabEventListener = interfaceC1883470z73;
    }

    public final void setTabIndex(int i) {
        this.curTabIndex = i;
    }

    public C1884300z8O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.itemContainer$delegate = C452501pT.LIZIZ(new C1884310z8P(this));
        this.itemLoadingView$delegate = C452501pT.LIZIZ(new C1884320z8Q(this));
        this.retryContainer$delegate = C452501pT.LIZIZ(new C1884330z8R(this));
        this.tabStatusView$delegate = C452501pT.LIZIZ(new C1884340z8S(this));
    }

    @Override // X.C21578619ce, android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        C21578619ce c21578619ce;
        if (z && f2 > 0.0f) {
            View viewFindParentScrollView = findParentScrollView();
            if ((viewFindParentScrollView instanceof C21578619ce) && (c21578619ce = (C21578619ce) viewFindParentScrollView) != null) {
                c21578619ce.fling((int) f2);
                return false;
            }
        }
        return super.dispatchNestedFling(f, f2, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C21578619ce, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        View viewFindParentScrollView;
        InterfaceC1354050lL9 interfaceC1354050lL9;
        if (i2 > 0 && (viewFindParentScrollView = findParentScrollView()) != 0 && viewFindParentScrollView.canScrollVertically(i2) && (viewFindParentScrollView instanceof InterfaceC1354050lL9) && (interfaceC1354050lL9 = (InterfaceC1354050lL9) viewFindParentScrollView) != null && (i2 = i2 - (interfaceC1354050lL9.computeVerticalScrollRange() - interfaceC1354050lL9.computeVerticalScrollOffset())) <= 0) {
            return;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C21578619ce, X.InterfaceC1318370kPb
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        int iMin;
        InterfaceC1354050lL9 interfaceC1354050lL9;
        super.onNestedPreScroll(view, i, i2, iArr, i3);
        int i4 = i2 - iArr[1];
        if (i2 > 0 && i4 > 0) {
            View viewFindParentScrollView = findParentScrollView();
            if (viewFindParentScrollView != 0 && viewFindParentScrollView.canScrollVertically(i4)) {
                if ((viewFindParentScrollView instanceof InterfaceC1354050lL9) && (interfaceC1354050lL9 = (InterfaceC1354050lL9) viewFindParentScrollView) != null) {
                    iMin = Math.min(interfaceC1354050lL9.computeVerticalScrollRange() - interfaceC1354050lL9.computeVerticalScrollOffset(), i4);
                } else {
                    iMin = 0;
                }
                iArr[1] = iArr[1] + iMin;
                viewFindParentScrollView.scrollBy(0, iMin);
            }
            int i5 = i2 - iArr[1];
            if (i5 > 0 && canScrollVertically(i5)) {
                int iMin2 = Math.min(computeVerticalScrollRange() - computeVerticalScrollOffset(), i5);
                iArr[1] = iArr[1] + iMin2;
                scrollBy(0, iMin2);
            }
        }
    }

    @Override // X.C21578619ce
    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        super.dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
        int i6 = iArr2[1];
        if (i4 > i6 && i4 > 0) {
            scrollBy(0, i4 - i6);
        }
    }
}
