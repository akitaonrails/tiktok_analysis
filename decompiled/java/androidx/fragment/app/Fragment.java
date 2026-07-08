package androidx.fragment.app;

import X.AbstractC1322240kVq;
import X.AbstractC1868130yiJ;
import X.AbstractC1868180yiO;
import X.AbstractC1889400zGc;
import X.AbstractC19728612Gu;
import X.AbstractC20148113sV;
import X.AbstractC21468118zv;
import X.AbstractC903280Zc6;
import X.AnonymousClass1433;
import X.AnonymousClass1996;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C0XAA;
import X.C0XAB;
import X.C0XAV;
import X.C1278104zL;
import X.C128Y;
import X.C1685300txQ;
import X.C1688560u2g;
import X.C168Q;
import X.C1847630yBF;
import X.C1847860yBc;
import X.C1847960yBm;
import X.C1848410yCV;
import X.C1868110yiH;
import X.C1868120yiI;
import X.C1868160yiM;
import X.C1868170yiN;
import X.C1868190yiP;
import X.C1868200yiQ;
import X.C189200o6;
import X.C197064128g;
import X.C197065128h;
import X.C197066128i;
import X.C197069128l;
import X.C19EG;
import X.C19EM;
import X.C19EO;
import X.C19EX;
import X.C19F0;
import X.C19F6;
import X.C19F7;
import X.C19FF;
import X.C19GS;
import X.C20135813qW;
import X.C20135913qX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.C903290Zc7;
import X.InterfaceC214897198d;
import X.InterfaceC21505419Ee;
import X.InterfaceC2287108xh;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS132S0100000_32;
import Y.ARunnableS32S0110000_13;
import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes33.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, C128Y, InterfaceC21505419Ee {
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final String _pnsPageId = "KSsoOyA6LD1iLz0yLygpHELIOSJzt9KTU8ZwkhKSIhLCEn";
    public boolean mAdded;
    public C19EO mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    public boolean mCalled;
    public FragmentManager mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public ViewModelProvider.Factory mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public FragmentManager mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public AnonymousClass1996<?> mHost;
    public boolean mInDynamicContainer;
    public boolean mInLayout;
    public boolean mIsCreated;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public LifecycleRegistry mLifecycleRegistry;
    public Lifecycle.State mMaxState;
    public boolean mMenuVisible;
    public final AtomicInteger mNextLocalRequestCode;
    public final ArrayList<AbstractC19728612Gu> mOnPreAttachedListeners;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public Handler mPostponedHandler;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public final AbstractC19728612Gu mSavedStateAttachListener;
    public C197065128h mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mTransitioning;
    public boolean mUserVisibleHint;
    public View mView;
    public C197064128g mViewLifecycleOwner;
    public MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData;
    public String mWho;

    public void androidx_fragment_app_Fragment__onHiddenChanged$___twin___(boolean z) {
    }

    public void androidx_fragment_app_Fragment__onPause$___twin___() {
        this.mCalled = true;
    }

    public void androidx_fragment_app_Fragment__onResume$___twin___() {
        this.mCalled = true;
    }

    public final FragmentManager getFragmentManager() {
        return androidx_fragment_app_Fragment_com_ss_android_ugc_aweme_lancet_SAFLancet_getFragmentManager(this);
    }

    public final FragmentManager getParentFragmentManager() {
        return androidx_fragment_app_Fragment_com_ss_android_ugc_aweme_lancet_SAFLancet_getParentFragmentManager(this);
    }

    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onAttachFragment(Fragment fragment) {
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return androidx_fragment_app_Fragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "androidx/fragment/app/Fragment", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dTF6Tg0zW9KSU0UgQh+BaJPtl/h+IJ9JIL8l4Fwy", new String[]{"01789"})));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        androidx_fragment_app_Fragment_com_ss_android_ugc_aweme_nxet_inject_fragment_AndroidXFragmentLancet_onHiddenChangedLancet(this, z);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        androidx_fragment_app_Fragment_com_bytedance_router_monitor_page_PageLancet_onPause(this);
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        androidx_fragment_app_Fragment_com_bytedance_router_monitor_page_PageLancet_onResume(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.LJL()) {
                return;
            }
            this.mChildFragmentManager.LJJ();
            this.mChildFragmentManager = new FragmentManagerImpl();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" did not call through to super.onDetach()");
        throw new C19F7(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "androidx/fragment/app/Fragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dTF6Tg0zW9KSU0UgQh+BaJPtl/h+IJ9JIL8l4Fwy", new String[]{"01789"})));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        androidx_fragment_app_Fragment_com_ss_android_ugc_aweme_nxet_inject_fragment_AndroidXFragmentLancet_setUserVisibleHintLancet(this, z);
    }

    private C19EO ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C19EO();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) ? state.ordinal() : Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = C197069128l.LIZ(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        C197064128g c197064128g = this.mViewLifecycleOwner;
        c197064128g.LLILZLL.LIZ(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    private void restoreViewState() {
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public final FragmentManager androidx_fragment_app_Fragment__getParentFragmentManager$___twin___() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" not associated with a fragment manager.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C19F6 createFragmentContainer() {
        return new C19F6() { // from class: X.19E9
            @Override // X.C19F6
            public final boolean LIZJ() {
                return this.LL.mView != null;
            }

            @Override // X.C19F6
            public final View LIZIZ(int i) {
                View view = this.LL.mView;
                if (view != null) {
                    return view.findViewById(i);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Fragment ");
                sbLIZ.append(this.LL);
                sbLIZ.append(" does not have a view");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        };
    }

    public final C19EG getActivity() {
        AnonymousClass1996<?> anonymousClass1996 = this.mHost;
        if (anonymousClass1996 == null) {
            return null;
        }
        return (C19EG) anonymousClass1996.LL;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null || (bool = c19eo.LJIILL) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null || (bool = c19eo.LJIILJJIL) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return null;
        }
        c19eo.getClass();
        return null;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" has not been attached yet.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public Context getContext() {
        AnonymousClass1996<?> anonymousClass1996 = this.mHost;
        if (anonymousClass1996 == null) {
            return null;
        }
        return anonymousClass1996.LLILLJJLI;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context contextN3 = C786410Ut5.N3(requireContext());
            while (true) {
                if (!(contextN3 instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (contextN3 instanceof Application) {
                    application = (Application) contextN3;
                    break;
                }
                contextN3 = ((ContextWrapper) contextN3).getBaseContext();
            }
            this.mDefaultFactory = new SavedStateViewModelFactory(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return 0;
        }
        return c19eo.LIZIZ;
    }

    public Object getEnterTransition() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return null;
        }
        return c19eo.LJIIIIZZ;
    }

    public AbstractC1322240kVq getEnterTransitionCallback() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return null;
        }
        return c19eo.LJIILLIIL;
    }

    public int getExitAnim() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return 0;
        }
        return c19eo.LIZJ;
    }

    public Object getExitTransition() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return null;
        }
        return c19eo.LJIIJ;
    }

    public AbstractC1322240kVq getExitTransitionCallback() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return null;
        }
        return c19eo.LJIIZILJ;
    }

    public View getFocusedView() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return null;
        }
        return c19eo.LJIJI;
    }

    public final Object getHost() {
        AnonymousClass1996<?> anonymousClass1996 = this.mHost;
        if (anonymousClass1996 == null) {
            return null;
        }
        return anonymousClass1996.LJII();
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    public int getNextTransition() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return 0;
        }
        return c19eo.LJFF;
    }

    public boolean getPopDirection() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return false;
        }
        return c19eo.LIZ;
    }

    public int getPopEnterAnim() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return 0;
        }
        return c19eo.LIZLLL;
    }

    public int getPopExitAnim() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return 0;
        }
        return c19eo.LJ;
    }

    public float getPostOnViewCreatedAlpha() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return 1.0f;
        }
        return c19eo.LJIJ;
    }

    public Object getReenterTransition() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return null;
        }
        Object obj = c19eo.LJIIJJI;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final boolean getRetainInstance() {
        C1278104zL c1278104zL = C19EM.LIZ;
        AbstractC1868130yiJ abstractC1868130yiJ = new AbstractC1868130yiJ(this) { // from class: X.0yiH
            /* JADX WARN: Illegal instructions before constructor call */
            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Attempting to get retain instance for fragment ");
                sbLIZ.append(this);
                super(this, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        C1278104zL c1278104zLLIZ = C19EM.LIZ(this);
        if (c1278104zLLIZ.LIZ.contains(C19EX.DETECT_RETAIN_INSTANCE_USAGE) && C19EM.LIZLLL(c1278104zLLIZ, getClass(), C1868110yiH.class)) {
            C19EM.LIZIZ(c1278104zLLIZ, abstractC1868130yiJ);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return null;
        }
        Object obj = c19eo.LJIIIZ;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // X.C128Y
    public final C197066128i getSavedStateRegistry() {
        return this.mSavedStateRegistryController.LIZIZ;
    }

    public Object getSharedElementEnterTransition() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return null;
        }
        return c19eo.LJIIL;
    }

    public Object getSharedElementReturnTransition() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return null;
        }
        Object obj = c19eo.LJIILIIL;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C19EO c19eo = this.mAnimationInfo;
        return (c19eo == null || (arrayList = c19eo.LJI) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C19EO c19eo = this.mAnimationInfo;
        return (c19eo == null || (arrayList = c19eo.LJII) == null) ? new ArrayList<>() : arrayList;
    }

    public final int getTargetRequestCode() {
        C1278104zL c1278104zL = C19EM.LIZ;
        AbstractC1868180yiO abstractC1868180yiO = new AbstractC1868180yiO(this) { // from class: X.0yiP
            /* JADX WARN: Illegal instructions before constructor call */
            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Attempting to get target request code from fragment ");
                sbLIZ.append(this);
                super(this, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        C1278104zL c1278104zLLIZ = C19EM.LIZ(this);
        if (c1278104zLLIZ.LIZ.contains(C19EX.DETECT_TARGET_FRAGMENT_USAGE) && C19EM.LIZLLL(c1278104zLLIZ, getClass(), C1868190yiP.class)) {
            C19EM.LIZIZ(c1278104zLLIZ, abstractC1868180yiO);
        }
        return this.mTargetRequestCode;
    }

    public LifecycleOwner getViewLifecycleOwner() {
        C197064128g c197064128g = this.mViewLifecycleOwner;
        if (c197064128g != null) {
            return c197064128g;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Can't access the Fragment View's LifecycleOwner for ");
        sbLIZ.append(this);
        sbLIZ.append(" when getView() is null i.e., before onCreateView() or after onDestroyView()");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != Lifecycle.State.INITIALIZED.ordinal()) {
            return this.mFragmentManager.LJJLL(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            FragmentManager fragmentManager = this.mFragmentManager;
            if (fragmentManager == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            fragmentManager.getClass();
            if (fragment == null || !fragment.isHidden()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        return fragmentManager == null || fragmentManager.LJLIL(this.mParentFragment);
    }

    public boolean isPostponed() {
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo == null) {
            return false;
        }
        return c19eo.LJIJJ;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.LJLJJI();
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.LJLJLLL();
    }

    public void performAttach() {
        Iterator<AbstractC19728612Gu> it2 = this.mOnPreAttachedListeners.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.LJIIIIZZ(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.LLILLJJLI);
        if (this.mCalled) {
            this.mFragmentManager.LJJIII(this);
            this.mChildFragmentManager.LJIJ();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fragment ");
            sbLIZ.append(this);
            sbLIZ.append(" did not call through to super.onAttach()");
            throw new C19F7(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.LJJ();
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" did not call through to super.onDestroy()");
        throw new C19F7(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void performDestroyView() {
        this.mChildFragmentManager.LJJI();
        if (this.mView != null) {
            C197064128g c197064128g = this.mViewLifecycleOwner;
            c197064128g.LIZIZ();
            if (c197064128g.LLILZIL.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AbstractC20148113sV.LIZIZ(this).LJ();
            this.mPerformedCreateView = false;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fragment ");
            sbLIZ.append(this);
            sbLIZ.append(" did not call through to super.onDestroyView()");
            throw new C19F7(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void performPause() {
        this.mChildFragmentManager.LJJIJ();
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" did not call through to super.onPause()");
        throw new C19F7(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean zLJLILLLLZI = this.mFragmentManager.LJLILLLLZI(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zLJLILLLLZI) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zLJLILLLLZI);
            onPrimaryNavigationFragmentChanged(zLJLILLLLZI);
            this.mChildFragmentManager.LJJIJIL();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.LJLJLLL();
        this.mChildFragmentManager.LJJJJIZL(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fragment ");
            sbLIZ.append(this);
            sbLIZ.append(" did not call through to super.onResume()");
            throw new C19F7(C2188811AlT.LIZIZ(sbLIZ));
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        lifecycleRegistry.handleLifecycleEvent(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ(event);
        }
        this.mChildFragmentManager.LJJIJL();
    }

    public void performStart() {
        this.mChildFragmentManager.LJLJLLL();
        this.mChildFragmentManager.LJJJJIZL(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fragment ");
            sbLIZ.append(this);
            sbLIZ.append(" did not call through to super.onStart()");
            throw new C19F7(C2188811AlT.LIZIZ(sbLIZ));
        }
        LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        lifecycleRegistry.handleLifecycleEvent(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ(event);
        }
        this.mChildFragmentManager.LJJIJLIJ();
    }

    public void performStop() {
        this.mChildFragmentManager.LJJIZ();
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" did not call through to super.onStop()");
        throw new C19F7(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.LJJJ();
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.LLFII(bundle);
        this.mChildFragmentManager.LJIJJLI();
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().LJIJJ) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().LJIJJ = false;
        } else if (Looper.myLooper() != this.mHost.LJ().getLooper()) {
            C786410Ut5.LJL(this.mHost.LJ(), new ARunnableS113S0100000_13(this, 7));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new Runnable() { // from class: X.0UwS
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.LL.startPostponedEnterTransition();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new MutableLiveData<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new AbstractC19728612Gu() { // from class: X.12Gt
            @Override // X.AbstractC19728612Gu
            public final void LIZ() {
                this.LIZ.mSavedStateRegistryController.LIZ.LIZIZ();
                SavedStateHandleSupport.enableSavedStateHandles(this.LIZ);
                Bundle bundle = this.LIZ.mSavedFragmentState;
                this.LIZ.mSavedStateRegistryController.LIZ(bundle != null ? bundle.getBundle("registryState") : null);
            }
        };
        initLifecycle();
    }

    public String generateActivityResultKey() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fragment_");
        sbLIZ.append(this.mWho);
        sbLIZ.append("_rq#");
        sbLIZ.append(this.mNextLocalRequestCode.getAndIncrement());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        Context contextN3 = C786410Ut5.N3(requireContext());
        while (true) {
            if (!(contextN3 instanceof ContextWrapper)) {
                contextN3 = null;
                break;
            }
            if (contextN3 instanceof Application) {
                break;
            }
            contextN3 = ((ContextWrapper) contextN3).getBaseContext();
        }
        C903290Zc7 c903290Zc7 = new C903290Zc7();
        if (contextN3 != null) {
            c903290Zc7.LIZIZ(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, contextN3);
        }
        c903290Zc7.LIZIZ(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        c903290Zc7.LIZIZ(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (getArguments() != null) {
            c903290Zc7.LIZIZ(SavedStateHandleSupport.DEFAULT_ARGS_KEY, getArguments());
        }
        return c903290Zc7;
    }

    public AbstractC20148113sV getLoaderManager() {
        return AbstractC20148113sV.LIZIZ(this);
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().LJIJJ = true;
    }

    public final C19EG requireActivity() {
        C19EG activity = getActivity();
        if (activity != null) {
            return activity;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" not attached to an activity.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" does not have any arguments.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" not attached to a context.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" not attached to a host.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fragment ");
            sbLIZ.append(this);
            sbLIZ.append(" is not attached to any Fragment or host");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Fragment ");
        sbLIZ2.append(this);
        sbLIZ2.append(" is not a child Fragment, it is directly attached to ");
        sbLIZ2.append(getContext());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final FragmentManager androidx_fragment_app_Fragment__getFragmentManager$___twin___() {
        return this.mFragmentManager;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final String getTag() {
        return this.mTag;
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    /* JADX INFO: loaded from: classes31.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.13qU
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new Fragment.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fragment.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final Fragment.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new Fragment.SavedState(parcel, classLoader);
            }
        };
        public final Bundle LL;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState(Bundle bundle) {
            this.LL = bundle;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.LL = bundle;
            if (classLoader != null && bundle != null) {
                bundle.setClassLoader(classLoader);
            }
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.LL);
        }
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }

    public static void androidx_fragment_app_Fragment_com_bytedance_router_monitor_page_PageLancet_onPause(Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOnPaused(fragment);
        fragment.androidx_fragment_app_Fragment__onPause$___twin___();
    }

    public static void androidx_fragment_app_Fragment_com_bytedance_router_monitor_page_PageLancet_onResume(Fragment fragment) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOnResumed(fragment);
        fragment.androidx_fragment_app_Fragment__onResume$___twin___();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FragmentManager androidx_fragment_app_Fragment_com_ss_android_ugc_aweme_lancet_SAFLancet_getFragmentManager(Fragment fragment) {
        C19EG activity = fragment.getActivity();
        FragmentManager fragmentManagerAndroidx_fragment_app_Fragment__getFragmentManager$___twin___ = fragment.androidx_fragment_app_Fragment__getFragmentManager$___twin___();
        if (activity != 0 && (activity instanceof InterfaceC214897198d)) {
            InterfaceC214897198d interfaceC214897198d = (InterfaceC214897198d) activity;
            if (interfaceC214897198d.isDelegateFragmentManager() && interfaceC214897198d.getAbility().LIZ() == fragmentManagerAndroidx_fragment_app_Fragment__getFragmentManager$___twin___) {
                return activity.getSupportFragmentManager();
            }
            return fragmentManagerAndroidx_fragment_app_Fragment__getFragmentManager$___twin___;
        }
        return fragmentManagerAndroidx_fragment_app_Fragment__getFragmentManager$___twin___;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static FragmentManager androidx_fragment_app_Fragment_com_ss_android_ugc_aweme_lancet_SAFLancet_getParentFragmentManager(Fragment fragment) {
        C19EG activity = fragment.getActivity();
        FragmentManager fragmentManagerAndroidx_fragment_app_Fragment__getParentFragmentManager$___twin___ = fragment.androidx_fragment_app_Fragment__getParentFragmentManager$___twin___();
        if (activity != 0 && (activity instanceof InterfaceC214897198d)) {
            InterfaceC214897198d interfaceC214897198d = (InterfaceC214897198d) activity;
            if (interfaceC214897198d.isDelegateFragmentManager() && interfaceC214897198d.getAbility().LIZ() == fragmentManagerAndroidx_fragment_app_Fragment__getParentFragmentManager$___twin___) {
                fragmentManagerAndroidx_fragment_app_Fragment__getParentFragmentManager$___twin___ = activity.getSupportFragmentManager();
            }
        }
        if (fragmentManagerAndroidx_fragment_app_Fragment__getParentFragmentManager$___twin___ != null) {
            return fragmentManagerAndroidx_fragment_app_Fragment__getParentFragmentManager$___twin___;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(fragment);
        sbLIZ.append(" not associated with a fragment manager.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    private Fragment getTargetFragment(boolean z) {
        String str;
        if (z) {
            C1278104zL c1278104zL = C19EM.LIZ;
            AbstractC1868180yiO abstractC1868180yiO = new AbstractC1868180yiO(this) { // from class: X.0yiQ
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Attempting to get target fragment from fragment ");
                    sbLIZ.append(this);
                    super(this, C2188811AlT.LIZIZ(sbLIZ));
                }
            };
            C1278104zL c1278104zLLIZ = C19EM.LIZ(this);
            if (c1278104zLLIZ.LIZ.contains(C19EX.DETECT_TARGET_FRAGMENT_USAGE) && C19EM.LIZLLL(c1278104zLLIZ, getClass(), C1868200yiQ.class)) {
                C19EM.LIZIZ(c1278104zLLIZ, abstractC1868180yiO);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null && (str = this.mTargetWho) != null) {
            return fragmentManager.LJJJJLI(str);
        }
        return null;
    }

    private void registerOnPreAttachListener(AbstractC19728612Gu abstractC19728612Gu) {
        if (this.mState >= 0) {
            abstractC19728612Gu.LIZ();
        } else {
            this.mOnPreAttachedListeners.add(abstractC19728612Gu);
        }
    }

    public void androidx_fragment_app_Fragment__setUserVisibleHint$___twin___(final boolean z) {
        boolean z2;
        C1278104zL c1278104zL = C19EM.LIZ;
        AbstractC1889400zGc abstractC1889400zGc = new AbstractC1889400zGc(this, z) { // from class: X.0yiM
            public final boolean LLILLJJLI;

            public final boolean isVisibleToUser() {
                return this.LLILLJJLI;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Attempting to set user visible hint to ");
                sbLIZ.append(z);
                sbLIZ.append(" for fragment ");
                sbLIZ.append(this);
                super(this, C2188811AlT.LIZIZ(sbLIZ));
                this.LLILLJJLI = z;
            }
        };
        C1278104zL c1278104zLLIZ = C19EM.LIZ(this);
        if (c1278104zLLIZ.LIZ.contains(C19EX.DETECT_SET_USER_VISIBLE_HINT) && C19EM.LIZLLL(c1278104zLLIZ, getClass(), C1868160yiM.class)) {
            C19EM.LIZIZ(c1278104zLLIZ, abstractC1889400zGc);
        }
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.LJLLI(fragmentManager.LJIILL(this));
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C19EO c19eo = this.mAnimationInfo;
        if (c19eo != null) {
            c19eo.LJIJJ = false;
        }
        if (this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            final AbstractC21468118zv abstractC21468118zvLJIIIIZZ = AbstractC21468118zv.LJIIIIZZ(viewGroup, fragmentManager);
            abstractC21468118zvLJIIIIZZ.LJIIJ();
            if (z) {
                C786410Ut5.LJJZZIII(this.mHost.LJ(), new Runnable() { // from class: X.1901
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        try {
                            if (!((ArrayList) abstractC21468118zvLJIIIIZZ.LIZIZ).isEmpty()) {
                                abstractC21468118zvLJIIIIZZ.LJ();
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                    }
                });
            } else {
                abstractC21468118zvLJIIIIZZ.LJ();
            }
            Handler handler = this.mPostponedHandler;
            if (handler != null) {
                handler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.LJJJLIIL(str);
    }

    public LayoutInflater getLayoutInflater(Bundle bundle) {
        AnonymousClass1996<?> anonymousClass1996 = this.mHost;
        if (anonymousClass1996 != null) {
            LayoutInflater layoutInflaterLJIIIIZZ = anonymousClass1996.LJIIIIZZ();
            C786410Ut5.Vd(layoutInflaterLJIIIIZZ, this.mChildFragmentManager.LJJLIIIJLLLLLLLZ());
            return layoutInflaterLJIIIIZZ;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        Activity activity;
        this.mCalled = true;
        AnonymousClass1996<?> anonymousClass1996 = this.mHost;
        if (anonymousClass1996 != null && (activity = anonymousClass1996.LL) != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (!this.mChildFragmentManager.LJLJI()) {
            this.mChildFragmentManager.LJIJJLI();
        }
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.LJLJLLL();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.LJIIZILJ();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fragment ");
            sbLIZ.append(this);
            sbLIZ.append(" did not call through to super.onActivityCreated()");
            throw new C19F7(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.LJIJJ(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.LJLJLLL();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new LifecycleEventObserver() { // from class: androidx.fragment.app.Fragment.6
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                View view;
                if (event == Lifecycle.Event.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" did not call through to super.onCreate()");
        throw new C19F7(C2188811AlT.LIZIZ(sbLIZ));
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.LJJIIJZLJL(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.LJJIIZ(menu);
        }
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.LJJIJIIJIL(menu);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.LIZ(Lifecycle.Event.ON_CREATE);
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fragment ");
            sbLIZ.append(this);
            sbLIZ.append(" did not call through to super.onViewStateRestored()");
            throw new C19F7(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().LJIILL = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().LJIILJJIL = Boolean.valueOf(z);
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(AbstractC1322240kVq abstractC1322240kVq) {
        ensureAnimationInfo().LJIILLIIL = abstractC1322240kVq;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().LJIIIIZZ = obj;
    }

    public void setExitSharedElementCallback(AbstractC1322240kVq abstractC1322240kVq) {
        ensureAnimationInfo().LJIIZILJ = abstractC1322240kVq;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().LJIIJ = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().LJIJI = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.LJIIL();
            }
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager == null) {
            if (savedState == null || (bundle = savedState.LL) == null) {
                bundle = null;
            }
            this.mSavedFragmentState = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.LJIIL();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.LJFF = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().LIZ = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().LJIJ = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().LJIIJJI = obj;
    }

    public void setRetainInstance(boolean z) {
        C1278104zL c1278104zL = C19EM.LIZ;
        AbstractC1868130yiJ abstractC1868130yiJ = new AbstractC1868130yiJ(this) { // from class: X.0yiI
            /* JADX WARN: Illegal instructions before constructor call */
            {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Attempting to set retain instance for fragment ");
                sbLIZ.append(this);
                super(this, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        C1278104zL c1278104zLLIZ = C19EM.LIZ(this);
        if (c1278104zLLIZ.LIZ.contains(C19EX.DETECT_RETAIN_INSTANCE_USAGE) && C19EM.LIZLLL(c1278104zLLIZ, getClass(), C1868120yiI.class)) {
            C19EM.LIZIZ(c1278104zLLIZ, abstractC1868130yiJ);
        }
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            if (z) {
                fragmentManager.LJI(this);
                return;
            } else {
                fragmentManager.LLFF(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().LJIIIZ = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().LJIIL = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().LJIILIIL = obj;
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        AnonymousClass1996<?> anonymousClass1996 = this.mHost;
        if (anonymousClass1996 != null) {
            return anonymousClass1996.LJIIJ(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        Fragment fragment;
        Intent intent2;
        C0WZX c0wzx = new C0WZX("dTF6Tg0zW9KSU0UgQh+BaJPtl/h+IJ9JIL8l4Fwy", new String[]{"01789"});
        C0WST c0wst = new C0WST();
        Bundle bundle = null;
        Object[] objArr = {intent, null};
        C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;Landroid/os/Bundle;)V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11088, "androidx/fragment/app/Fragment", "startActivity", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(11088, "androidx/fragment/app/Fragment", "startActivity", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        if (objArr2 != null) {
            Object obj = objArr2[0];
            if (obj != null) {
                fragment = (Fragment) obj;
            } else {
                fragment = this;
            }
            Object obj2 = objArr2[1];
            if (obj2 != null) {
                intent2 = (Intent) obj2;
            } else {
                intent2 = intent;
            }
            Object obj3 = objArr2[2];
            if (obj3 != null) {
                bundle = (Bundle) obj3;
            }
        } else {
            fragment = this;
            intent2 = intent;
        }
        fragment.startActivity(intent2, bundle);
        c0wst.LIZ(11088, "androidx/fragment/app/Fragment", "startActivity", null, objArr, fragment, c0wzw, true);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public static void androidx_fragment_app_Fragment_com_bytedance_router_monitor_page_PageLancet_onHiddenChanged(Fragment fragment, boolean z) {
        fragment.androidx_fragment_app_Fragment__onHiddenChanged$___twin___(z);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchFragmentOnHiddenChanged(fragment, z);
    }

    public static void androidx_fragment_app_Fragment_com_bytedance_scalpel_scene_lancet_common_FragmentManagerLancet_setUserVisibleHint(Fragment fragment, boolean z) {
        fragment.androidx_fragment_app_Fragment__setUserVisibleHint$___twin___(z);
        C0XAB c0xabLIZ = C0XAA.LIZ();
        if (c0xabLIZ != null && c0xabLIZ.LIZ) {
            C0XAV.LIZIZ().execute(new ARunnableS32S0110000_13(fragment, z, 10));
        }
    }

    public static void androidx_fragment_app_Fragment_com_ss_android_ugc_aweme_nxet_inject_fragment_AndroidXFragmentLancet_onHiddenChangedLancet(Fragment fragment, boolean z) {
        if (C1848410yCV.LIZ) {
            if (C1847960yBm.LJIIIIZZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onHiddenChanged: fragment = ");
                sbLIZ.append(fragment.getClass().getName());
                sbLIZ.append(", hidden = ");
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (!(fragment instanceof DialogFragment)) {
                if (z) {
                    C1847860yBc.LIZ(C1847630yBF.LIZ(fragment));
                } else {
                    C1847860yBc.LIZJ(C1847630yBF.LIZ(fragment));
                }
            }
        }
        androidx_fragment_app_Fragment_com_bytedance_router_monitor_page_PageLancet_onHiddenChanged(fragment, z);
    }

    public static void androidx_fragment_app_Fragment_com_ss_android_ugc_aweme_nxet_inject_fragment_AndroidXFragmentLancet_setUserVisibleHintLancet(Fragment fragment, boolean z) {
        if (C1848410yCV.LIZ) {
            if (C1847960yBm.LJIIIIZZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setUserVisibleHint: fragment = ");
                sbLIZ.append(fragment.getClass().getName());
                sbLIZ.append(", isVisible = ");
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (!(fragment instanceof DialogFragment)) {
                if (z) {
                    C1847860yBc.LIZJ(C1847630yBF.LIZ(fragment));
                } else {
                    C1847860yBc.LIZ(C1847630yBF.LIZ(fragment));
                }
            }
        }
        androidx_fragment_app_Fragment_com_bytedance_scalpel_scene_lancet_common_FragmentManagerLancet_setUserVisibleHint(fragment, z);
    }

    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.LJIL(menu, menuInflater);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        ensureAnimationInfo().LJIJJ = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.LJJLIIIJLJLI().LJ();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        C786410Ut5.LJLIIL(timeUnit.toMillis(j), this.mPostponedHandler, this.mPostponedDurationRunnable);
    }

    @Override // X.InterfaceC21505419Ee
    public final <I, O> C19F0<I> registerForActivityResult(AnonymousClass1433<I, O> anonymousClass1433, C168Q<O> c168q) {
        return prepareCallInternal(anonymousClass1433, new InterfaceC2287108xh<Void, C19FF>() { // from class: X.19EU
            @Override // X.InterfaceC2287108xh
            public final C19FF apply(Void r4) {
                Fragment fragment = this.LIZ;
                Object obj = fragment.mHost;
                if (obj instanceof InterfaceC1670800ta2) {
                    return ((InterfaceC1670800ta2) obj).getActivityResultRegistry();
                }
                return fragment.requireActivity().getActivityResultRegistry();
            }
        }, c168q);
    }

    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().LJLJJL(this, strArr, i);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" not attached to Activity");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        C19EO c19eo = this.mAnimationInfo;
        c19eo.LJI = arrayList;
        c19eo.LJII = arrayList2;
    }

    public void setTargetFragment(final Fragment fragment, final int i) {
        FragmentManager fragmentManager;
        if (fragment != null) {
            C1278104zL c1278104zL = C19EM.LIZ;
            AbstractC1868180yiO abstractC1868180yiO = new AbstractC1868180yiO(this, fragment, i) { // from class: X.0yiN
                public final Fragment LLILLJJLI;
                public final int LLILLL;

                public final int getRequestCode() {
                    return this.LLILLL;
                }

                public final Fragment getTargetFragment() {
                    return this.LLILLJJLI;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Attempting to set target fragment ");
                    sbLIZ.append(fragment);
                    sbLIZ.append(" with request code ");
                    sbLIZ.append(i);
                    sbLIZ.append(" for fragment ");
                    sbLIZ.append(this);
                    super(this, C2188811AlT.LIZIZ(sbLIZ));
                    this.LLILLJJLI = fragment;
                    this.LLILLL = i;
                }
            };
            C1278104zL c1278104zLLIZ = C19EM.LIZ(this);
            if (c1278104zLLIZ.LIZ.contains(C19EX.DETECT_TARGET_FRAGMENT_USAGE) && C19EM.LIZLLL(c1278104zLLIZ, getClass(), C1868170yiN.class)) {
                C19EM.LIZIZ(c1278104zLLIZ, abstractC1868180yiO);
            }
        }
        FragmentManager fragmentManager2 = this.mFragmentManager;
        if (fragment != null) {
            fragmentManager = fragment.mFragmentManager;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 != null && fragmentManager != null && fragmentManager2 != fragmentManager) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fragment ");
            sbLIZ.append(fragment);
            sbLIZ.append(" must share the same FragmentManager to be set as a target fragment");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Setting ");
                sbLIZ2.append(fragment);
                sbLIZ2.append(" as the target of ");
                sbLIZ2.append(this);
                sbLIZ2.append(" would create a target cycle");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i;
    }

    public void startActivity(Intent intent, Bundle bundle) {
        AnonymousClass1996<?> anonymousClass1996 = this.mHost;
        if (anonymousClass1996 != null) {
            anonymousClass1996.LJIIJJI(this, intent, -1, bundle);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" not attached to Activity");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void startActivityForResult(Intent intent, int i) {
        C2204961BRm.LLJJLIIIJLLLLLLLZ(this, intent, i, null, new C0WZX("dTF6Tg0zW9KSU0UgQh+BaJPtl/h+IJ9JIL8l4Fwy", new String[]{"01789"}));
    }

    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragmentNewInstance = C20135813qW.LIZJ(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to instantiate fragment ");
            sbLIZ.append(str);
            sbLIZ.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C20135913qX(C2188811AlT.LIZIZ(sbLIZ), e);
        } catch (InstantiationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Unable to instantiate fragment ");
            sbLIZ2.append(str);
            sbLIZ2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new C20135913qX(C2188811AlT.LIZIZ(sbLIZ2), e2);
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Unable to instantiate fragment ");
            sbLIZ3.append(str);
            sbLIZ3.append(": could not find Fragment constructor");
            throw new C20135913qX(C2188811AlT.LIZIZ(sbLIZ3), e3);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Unable to instantiate fragment ");
            sbLIZ4.append(str);
            sbLIZ4.append(": calling Fragment constructor caused an exception");
            throw new C20135913qX(C2188811AlT.LIZIZ(sbLIZ4), e4);
        }
    }

    private <I, O> C19F0<I> prepareCallInternal(final AnonymousClass1433<I, O> anonymousClass1433, final InterfaceC2287108xh<Void, C19FF> interfaceC2287108xh, final C168Q<O> c168q) {
        if (this.mState <= 1) {
            final AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new AbstractC19728612Gu() { // from class: X.19Ea
                @Override // X.AbstractC19728612Gu
                public final void LIZ() {
                    String strGenerateActivityResultKey = this.LJ.generateActivityResultKey();
                    atomicReference.set(((C19FF) interfaceC2287108xh.apply(null)).LIZJ(strGenerateActivityResultKey, this.LJ, anonymousClass1433, c168q));
                }
            });
            return new C19F0<I>(atomicReference, anonymousClass1433) { // from class: X.19EY
                public final /* synthetic */ AtomicReference LIZ;

                @Override // X.C19F0
                public final void LIZIZ() {
                    C19F0 c19f0 = (C19F0) this.LIZ.getAndSet(null);
                    if (c19f0 != null) {
                        c19f0.LIZIZ();
                    }
                }

                @Override // X.C19F0
                public final void LIZ(Object obj) {
                    C19F0 c19f0 = (C19F0) this.LIZ.get();
                    if (c19f0 != null) {
                        c19f0.LIZ(obj);
                        return;
                    }
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }
            };
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public View androidx_fragment_app_Fragment__onCreateView$___twin___(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        }
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        Activity activity;
        this.mCalled = true;
        AnonymousClass1996<?> anonymousClass1996 = this.mHost;
        if (anonymousClass1996 != null && (activity = anonymousClass1996.LL) != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.LJLJLLL();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C197064128g(this, getViewModelStore(), new ARunnableS132S0100000_32(this, 8));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        if (viewOnCreateView != null) {
            try {
                viewOnCreateView.setTag(R.id.en4, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.mView = viewOnCreateView;
        if (viewOnCreateView != null) {
            this.mViewLifecycleOwner.LIZIZ();
            ViewTreeLifecycleOwner.set(this.mView, this.mViewLifecycleOwner);
            ViewTreeViewModelStoreOwner.set(this.mView, this.mViewLifecycleOwner);
            C1688560u2g.LIZIZ(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.LLILZIL != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.mViewLifecycleOwner = null;
    }

    public final <I, O> C19F0<I> registerForActivityResult(AnonymousClass1433<I, O> anonymousClass1433, final C19FF c19ff, C168Q<O> c168q) {
        return prepareCallInternal(anonymousClass1433, new InterfaceC2287108xh<Void, C19FF>() { // from class: X.19Ef
            @Override // X.InterfaceC2287108xh
            public final C19FF apply(Void r2) {
                return c19ff;
            }
        }, c168q);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().LJLJJLL(this, intent, i, bundle);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" not attached to Activity");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public static View androidx_fragment_app_Fragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(Fragment fragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewAndroidx_fragment_app_Fragment__onCreateView$___twin___ = fragment.androidx_fragment_app_Fragment__onCreateView$___twin___(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewAndroidx_fragment_app_Fragment__onCreateView$___twin___ instanceof View)) {
            viewAndroidx_fragment_app_Fragment__onCreateView$___twin___ = null;
        }
        if (viewAndroidx_fragment_app_Fragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewAndroidx_fragment_app_Fragment__onCreateView$___twin___, fragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewAndroidx_fragment_app_Fragment__onCreateView$___twin___, fragment);
                viewAndroidx_fragment_app_Fragment__onCreateView$___twin___.setTag(R.id.view_tree_saved_state_registry_owner, fragment);
                C19EG activity = fragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewAndroidx_fragment_app_Fragment__onCreateView$___twin___;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewAndroidx_fragment_app_Fragment__onCreateView$___twin___;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC20148113sV.LIZIZ(this).LIZLLL(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Child ");
        sbLIZ.append(this.mChildFragmentManager);
        sbLIZ.append(":");
        printWriter.println(C2188811AlT.LIZIZ(sbLIZ));
        FragmentManager fragmentManager = this.mChildFragmentManager;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("  ");
        fragmentManager.LJJJI(C2188811AlT.LIZIZ(sbLIZ2), fileDescriptor, printWriter, strArr);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().LIZIZ = i;
        ensureAnimationInfo().LIZJ = i2;
        ensureAnimationInfo().LIZLLL = i3;
        ensureAnimationInfo().LJ = i4;
    }

    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().LJLJL(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(this);
        sbLIZ.append(" not attached to Activity");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
