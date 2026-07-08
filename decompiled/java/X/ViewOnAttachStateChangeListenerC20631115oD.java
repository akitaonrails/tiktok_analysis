package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tiktok.sdk.powerviewpager.adapter.PowerViewPagerFragmentAdapter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15oD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class ViewOnAttachStateChangeListenerC20631115oD extends FrameLayout implements View.OnAttachStateChangeListener {
    public Fragment _currentFragment;
    public View attachedView;
    public final C01GW currentActivity$delegate;
    public boolean defaultSmoothScroll;
    public final C01GW fragmentAdapter$delegate;
    public final C01GW fragmentItemOperator$delegate;
    public boolean hasAlreadyAttached;
    public boolean hasInit;
    public boolean isUserInputEnabled;
    public EnumC20631415oG itemType;
    public RecyclerView recyclerView;
    public Function1<? super Context, ? extends ViewGroup> scrollFixView;
    public final C01GW viewAdapter$delegate;
    public final C01GW viewItemOperator$delegate;
    public final C20632315oP viewPager2;

    private final C19EG getCurrentActivity() {
        return (C19EG) this.currentActivity$delegate.getValue();
    }

    private final Fragment getCurrentFragment() {
        Fragment fragment = this._currentFragment;
        if (fragment != null) {
            return fragment;
        }
        Fragment fragmentLIZ = C946803n0.LIZ(this);
        this._currentFragment = fragmentLIZ;
        return fragmentLIZ;
    }

    private final void throwItemTypeUnsetException() {
        throw new RuntimeException("Item type is not set, please setup powerViewPager by fragment/view operator");
    }

    public final boolean beginFakeDrag() {
        C20631615oI c20631615oI = this.viewPager2.LLJILLL;
        if (c20631615oI.LIZIZ.LLILZLL == 1) {
            return false;
        }
        c20631615oI.LJI = 0;
        c20631615oI.LJFF = 0;
        c20631615oI.LJII = SystemClock.uptimeMillis();
        VelocityTracker velocityTracker = c20631615oI.LIZLLL;
        if (velocityTracker == null) {
            c20631615oI.LIZLLL = VelocityTracker.obtain();
            c20631615oI.LJ = ViewConfiguration.get(c20631615oI.LIZ.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
        C20632015oM c20632015oM = c20631615oI.LIZIZ;
        c20632015oM.LLILZIL = 4;
        c20632015oM.LJJJ(true);
        if (c20631615oI.LIZIZ.LLILZLL != 0) {
            c20631615oI.LIZJ.stopScroll();
        }
        long j = c20631615oI.LJII;
        MotionEvent motionEventObtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
        c20631615oI.LIZLLL.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public final boolean endFakeDrag() {
        int[] iArrLIZJ;
        int i;
        C20631615oI c20631615oI = this.viewPager2.LLJILLL;
        C20632015oM c20632015oM = c20631615oI.LIZIZ;
        if (!c20632015oM.LLJILJILJ) {
            return false;
        }
        int i2 = c20632015oM.LLILZLL;
        c20632015oM.LLJILJILJ = false;
        c20632015oM.LJJJJ();
        C20631815oK c20631815oK = c20632015oM.LLIZ;
        if (c20631815oK.LIZJ == 0) {
            int i3 = c20631815oK.LIZ;
            if (i3 != c20632015oM.LLIZLLLIL) {
                c20632015oM.LJJIJIIJIL(i3);
            }
            c20632015oM.LJJIL(0);
            c20632015oM.LJJIZ();
        } else {
            c20632015oM.LJJIL(2);
        }
        VelocityTracker velocityTracker = c20631615oI.LIZLLL;
        velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, c20631615oI.LJ);
        if (!c20631615oI.LIZJ.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            C20632315oP c20632315oP = c20631615oI.LIZ;
            View viewLJFF = c20632315oP.LLJIJIL.LJFF(c20632315oP.LLIZ);
            if (viewLJFF != null && ((i = (iArrLIZJ = c20632315oP.LLJIJIL.LIZJ(c20632315oP.LLIZ, viewLJFF))[0]) != 0 || iArrLIZJ[1] != 0)) {
                c20632315oP.LLJI.smoothScrollBy(i, iArrLIZJ[1]);
            }
        }
        return true;
    }

    public final int getCurrentItem() {
        return this.viewPager2.getCurrentItem();
    }

    public final InterfaceC1194850hCN getCurrentOperator() {
        if (!this.hasInit) {
            return null;
        }
        int i = C20631515oH.LIZ[this.itemType.ordinal()];
        if (i == 1) {
            return getFragmentItemOperator();
        }
        if (i == 2) {
            return getViewItemOperator();
        }
        if (i != 3) {
            throw new C1954807lC();
        }
        return null;
    }

    public final C688970R0t getEdgeEffectFactory() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        return recyclerView.getEdgeEffectFactory();
    }

    public final PowerViewPagerFragmentAdapter getFragmentAdapter() {
        return (PowerViewPagerFragmentAdapter) this.fragmentAdapter$delegate.getValue();
    }

    public final InterfaceC636730OyF getFragmentItemOperator() {
        return (InterfaceC636730OyF) this.fragmentItemOperator$delegate.getValue();
    }

    public final int getItemDecorationCount() {
        return this.viewPager2.getItemDecorationCount();
    }

    public final RecyclerView.LayoutManager getLayoutManager() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        return recyclerView.getLayoutManager();
    }

    public final int getOffscreenPageLimit() {
        return this.viewPager2.getOffscreenPageLimit();
    }

    public final AbstractC1338480kw2 getOnFlingListener() {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        return recyclerView.getOnFlingListener();
    }

    public final int getScrollState() {
        return this.viewPager2.getScrollState();
    }

    public final AbstractC20603615jm getViewAdapter() {
        return (AbstractC20603615jm) this.viewAdapter$delegate.getValue();
    }

    public final InterfaceC1733780vDc getViewItemOperator() {
        return (InterfaceC1733780vDc) this.viewItemOperator$delegate.getValue();
    }

    public final void initFragmentOperator() {
        if (this.hasInit) {
            return;
        }
        this.hasInit = true;
        this.viewPager2.setAdapter(getFragmentAdapter());
        this.viewPager2.LIZIZ(new C1208670hYf(this, 1));
        if (this.hasAlreadyAttached) {
            PowerViewPagerFragmentAdapter fragmentAdapter = getFragmentAdapter();
            fragmentAdapter.LLJJJJJIL.LIZIZ.observe(fragmentAdapter.LLJILJIL, fragmentAdapter);
            fragmentAdapter.LLJIJIL.addOnScrollListener((AbstractC1585810rMx) fragmentAdapter.LLJJL.getValue());
        }
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.addOnAttachStateChangeListener(this);
    }

    public final void initViewOperator() {
        if (this.hasInit) {
            return;
        }
        this.hasInit = true;
        this.viewPager2.setAdapter(getViewAdapter());
        AbstractC20603615jm viewAdapter = getViewAdapter();
        C20632315oP c20632315oP = this.viewPager2;
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        final C20631215oE c20631215oE = new C20631215oE(viewAdapter, c20632315oP, recyclerView);
        c20631215oE.LLILLL.addOnChildAttachStateChangeListener(c20631215oE);
        c20631215oE.LLILLJJLI.LIZIZ(c20631215oE);
        c20631215oE.LL.LLLJ(new C0Q9R() { // from class: X.15oF
            @Override // X.C0Q9R
            public final void LJII(C21341918fZ c21341918fZ) {
                int currentItem = c20631215oE.LLILLJJLI.getCurrentItem();
                if (currentItem >= 0 && c20631215oE.LLILLJJLI.LLILZIL) {
                    try {
                        int iLIZ = c21341918fZ.LIZ(currentItem);
                        if (iLIZ != -1 && iLIZ != currentItem) {
                            C20632315oP c20632315oP2 = c20631215oE.LLILLJJLI;
                            if (!c20632315oP2.LLJILLL.LIZIZ.LLJILJILJ) {
                                c20632315oP2.LJ(iLIZ, false);
                            }
                        }
                    } catch (IndexOutOfBoundsException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        });
        if (this.hasAlreadyAttached) {
            getViewAdapter().LLLI();
        }
        RecyclerView recyclerView2 = this.recyclerView;
        (recyclerView2 != null ? recyclerView2 : null).addOnAttachStateChangeListener(this);
    }

    public final void invalidateItemDecorations() {
        this.viewPager2.LLJI.invalidateItemDecorations();
    }

    public final boolean isFakeDragging() {
        return this.viewPager2.LLJILLL.LIZIZ.LLJILJILJ;
    }

    public final void requestTransform() {
        this.viewPager2.LIZJ();
    }

    public final LifecycleOwner getFragmentItemLifecycleOwner() {
        LifecycleOwner currentFragment = getCurrentFragment();
        if (currentFragment == null && (currentFragment = getCurrentActivity()) == null) {
            throw new RuntimeException("Can not find fragment lifecycleOwner !");
        }
        return currentFragment;
    }

    public final FragmentManager getFragmentManager() {
        C19EG currentActivity;
        FragmentManager supportFragmentManager;
        Fragment currentFragment = getCurrentFragment();
        if ((currentFragment == null || (supportFragmentManager = currentFragment.getChildFragmentManager()) == null) && ((currentActivity = getCurrentActivity()) == null || (supportFragmentManager = currentActivity.getSupportFragmentManager()) == null)) {
            throw new RuntimeException("Can not find fragment manager !");
        }
        return supportFragmentManager;
    }

    public final Function1<Context, ViewGroup> getScrollFixView() {
        return this.scrollFixView;
    }

    public final boolean isUserInputEnabled() {
        return this.isUserInputEnabled;
    }

    public ViewOnAttachStateChangeListenerC20631115oD(Context context) {
        this(context, null, 0);
    }

    public final void addItemDecoration(C0DXR c0dxr) {
        this.viewPager2.LLJI.addItemDecoration(c0dxr);
    }

    public final void addOnItemTouchListener(InterfaceC21676019sM interfaceC21676019sM) {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.addOnItemTouchListener(interfaceC21676019sM);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.viewPager2.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.viewPager2.canScrollVertically(i);
    }

    public final boolean fakeDragBy(float f) {
        boolean z;
        int i;
        float f2;
        C20631615oI c20631615oI = this.viewPager2.LLJILLL;
        int i2 = 0;
        if (!c20631615oI.LIZIZ.LLJILJILJ) {
            return false;
        }
        float f3 = c20631615oI.LJFF - f;
        c20631615oI.LJFF = f3;
        int iRound = Math.round(f3 - c20631615oI.LJI);
        c20631615oI.LJI += iRound;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (c20631615oI.LIZ.getOrientation() == 0) {
            z = true;
            i = iRound;
        } else {
            z = false;
            i = 0;
            i2 = iRound;
        }
        float f4 = 0.0f;
        if (z) {
            f2 = c20631615oI.LJFF;
        } else {
            f2 = 0.0f;
            f4 = c20631615oI.LJFF;
        }
        c20631615oI.LIZJ.scrollBy(i, i2);
        MotionEvent motionEventObtain = MotionEvent.obtain(c20631615oI.LJII, jUptimeMillis, 2, f2, f4, 0);
        c20631615oI.LIZLLL.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public final C0DXR getItemDecorationAt(int i) {
        return this.viewPager2.LLJI.getItemDecorationAt(i);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        int i = C20631515oH.LIZ[this.itemType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    throwItemTypeUnsetException();
                    return;
                }
                throw new C1954807lC();
            }
            getViewAdapter().LLLI();
            return;
        }
        PowerViewPagerFragmentAdapter fragmentAdapter = getFragmentAdapter();
        fragmentAdapter.LLJJJJJIL.LIZIZ.observe(fragmentAdapter.LLJILJIL, fragmentAdapter);
        fragmentAdapter.LLJIJIL.addOnScrollListener((AbstractC1585810rMx) fragmentAdapter.LLJJL.getValue());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        int i = C20631515oH.LIZ[this.itemType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    throwItemTypeUnsetException();
                    return;
                }
                throw new C1954807lC();
            }
            getViewAdapter().LLLII();
            return;
        }
        PowerViewPagerFragmentAdapter fragmentAdapter = getFragmentAdapter();
        fragmentAdapter.LLJJJJJIL.LIZIZ.removeObserver(fragmentAdapter);
        fragmentAdapter.LLJIJIL.removeOnScrollListener((AbstractC1585810rMx) fragmentAdapter.LLJJL.getValue());
    }

    public final void registerOnPageChangeCallback(AbstractC712240Rwk abstractC712240Rwk) {
        this.viewPager2.LIZIZ(abstractC712240Rwk);
    }

    public final void removeItemDecoration(C0DXR c0dxr) {
        this.viewPager2.LLJI.removeItemDecoration(c0dxr);
    }

    public final void removeItemDecorationAt(int i) {
        this.viewPager2.LLJI.removeItemDecorationAt(i);
    }

    public final void removeOnItemTouchListener(InterfaceC21676019sM interfaceC21676019sM) {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.removeOnItemTouchListener(interfaceC21676019sM);
    }

    public final void setCurrentItem(int i) {
        boolean z;
        boolean z2 = true;
        if (this.viewPager2.getCurrentItem() == i) {
            z = true;
        } else {
            z = false;
        }
        C20632315oP c20632315oP = this.viewPager2;
        if (!z && !this.defaultSmoothScroll) {
            z2 = false;
        }
        c20632315oP.LJ(i, z2);
    }

    public final void setEdgeEffectFactory(C688970R0t c688970R0t) {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setEdgeEffectFactory(c688970R0t);
    }

    public final void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setLayoutManager(layoutManager);
    }

    public final void setOnFlingListener(AbstractC1338480kw2 abstractC1338480kw2) {
        RecyclerView recyclerView = this.recyclerView;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setOnFlingListener(abstractC1338480kw2);
    }

    public final void setOrientation(int i) {
        this.viewPager2.setOrientation(i);
    }

    public final void setPageTransformer(InterfaceC440740HQa interfaceC440740HQa) {
        this.viewPager2.setPageTransformer(interfaceC440740HQa);
    }

    public final void setPagerSnapHelper(C20635115or c20635115or) {
        RecyclerView recyclerView = null;
        setOnFlingListener(null);
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 != null) {
            recyclerView = recyclerView2;
        }
        c20635115or.LIZIZ(recyclerView);
    }

    public final void setScrollFixView(Function1<? super Context, ? extends ViewGroup> function1) {
        this.scrollFixView = function1;
    }

    public final void setSmoothScrollEnabled(boolean z) {
        this.defaultSmoothScroll = z;
    }

    public final void setUserInputEnabled(boolean z) {
        this.isUserInputEnabled = z;
        this.viewPager2.setUserInputEnabled(z);
    }

    public final void setViewPagerItemType(EnumC20631415oG enumC20631415oG) {
        EnumC20631415oG enumC20631415oG2 = this.itemType;
        if (enumC20631415oG2 == enumC20631415oG) {
            return;
        }
        if (enumC20631415oG2 == EnumC20631415oG.UNSET) {
            this.itemType = enumC20631415oG;
            return;
        }
        throw new RuntimeException("PowerViewPager operator and Item Type (fragment/view) cannot be modified after initialization");
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        C786410Ut5.LLJI(this.viewPager2, i);
    }

    public final void unregisterOnPageChangeCallback(AbstractC712240Rwk abstractC712240Rwk) {
        this.viewPager2.LJI(abstractC712240Rwk);
    }

    public ViewOnAttachStateChangeListenerC20631115oD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void addItemDecoration(C0DXR c0dxr, int i) {
        this.viewPager2.LLJI.addItemDecoration(c0dxr, i);
    }

    public final void setCurrentItem(int i, boolean z) {
        boolean z2;
        boolean z3 = true;
        if (this.viewPager2.getCurrentItem() == i) {
            z2 = true;
        } else {
            z2 = false;
        }
        C20632315oP c20632315oP = this.viewPager2;
        if (!z2 && !z) {
            z3 = false;
        }
        c20632315oP.LJ(i, z3);
    }

    public ViewOnAttachStateChangeListenerC20631115oD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.itemType = EnumC20631415oG.UNSET;
        C20632315oP c20632315oP = new C20632315oP(context, attributeSet, i);
        this.viewPager2 = c20632315oP;
        this.fragmentAdapter$delegate = C452501pT.LIZIZ(new AwS575S0100000_31(this, 209));
        this.viewAdapter$delegate = C452501pT.LIZIZ(new AwS575S0100000_31(this, 211));
        this.scrollFixView = AFwS257S0000000_19.get$arr$(42);
        this.defaultSmoothScroll = true;
        this.currentActivity$delegate = C452501pT.LIZIZ(new AwS571S0100000_27(context, 201));
        this.fragmentItemOperator$delegate = C452501pT.LIZIZ(new AwS575S0100000_31(this, 210));
        this.viewItemOperator$delegate = C452501pT.LIZIZ(new AwS575S0100000_31(this, 212));
        addView(c20632315oP, -1, -1);
        RecyclerView recyclerView = (RecyclerView) c20632315oP.getChildAt(0);
        this.recyclerView = recyclerView;
        recyclerView.addOnAttachStateChangeListener(new C16HD(this, 0));
        this.isUserInputEnabled = true;
    }
}
