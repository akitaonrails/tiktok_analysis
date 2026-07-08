package androidx.fragment.app;

import X.AbstractC21468118zv;
import X.AbstractC2173821A5s;
import X.AbstractC813200VvC;
import X.AnonymousClass1433;
import X.AnonymousClass1902;
import X.AnonymousClass1996;
import X.C092O;
import X.C0TSA;
import X.C1278104zL;
import X.C128Y;
import X.C168Q;
import X.C1719660uqq;
import X.C197066128i;
import X.C199Y;
import X.C19CY;
import X.C19CZ;
import X.C19EC;
import X.C19ED;
import X.C19EE;
import X.C19EG;
import X.C19EH;
import X.C19EM;
import X.C19EW;
import X.C19F0;
import X.C19F6;
import X.C19F8;
import X.C19FD;
import X.C19FF;
import X.C1AF0;
import X.C20135813qW;
import X.C20247014Ke;
import X.C21467218zm;
import X.C21505319Ed;
import X.C21505619Eg;
import X.C21505819Ei;
import X.C21523519Ld;
import X.C21524219Lk;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2241008qG;
import X.C2349809Iq;
import X.C480030Is5;
import X.C786410Ut5;
import X.C794420VEi;
import X.InterfaceC1670800ta2;
import X.InterfaceC1671500tbA;
import X.InterfaceC1840220xzI;
import X.InterfaceC197061128d;
import X.InterfaceC19739612La;
import X.InterfaceC21506019Ek;
import X.InterfaceC21506619Eq;
import X.InterfaceC21506819Es;
import X.InterfaceC21507319Ex;
import X.InterfaceC21507419Ey;
import X.InterfaceC21507519Ez;
import X.InterfaceC988103tf;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS132S0100000_32;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public abstract class FragmentManager {
    public static boolean DEBUG = false;
    public static boolean USE_PREDICTIVE_BACK = true;
    public C19F6 mContainer;
    public ArrayList<Fragment> mCreatedMenus;
    public boolean mDestroyed;
    public boolean mExecutingActions;
    public boolean mHavePendingDeferredStart;
    public AnonymousClass1996<?> mHost;
    public boolean mNeedMenuInvalidate;
    public FragmentManagerViewModel mNonConfig;
    public OnBackPressedDispatcher mOnBackPressedDispatcher;
    public Fragment mParent;
    public Fragment mPrimaryNav;
    public C19F0<String[]> mRequestPermissions;
    public C19F0<Intent> mStartActivityForResult;
    public C19F0<IntentSenderRequest> mStartIntentSenderForResult;
    public boolean mStateSaved;
    public boolean mStopped;
    public C1278104zL mStrictModePolicy;
    public ArrayList<Fragment> mTmpAddedFragments;
    public ArrayList<Boolean> mTmpIsPop;
    public ArrayList<a> mTmpRecords;
    public Object parent;
    public final ArrayList<InterfaceC21506619Eq> mPendingActions = new ArrayList<>();
    public final C19EE mFragmentStore = new C19EE();
    public ArrayList<a> mBackStack = new ArrayList<>();
    public final C19ED mLayoutInflaterFactory = new C19ED(this);
    public a mTransitioningOp = null;
    public boolean mHandlingTransitioningOp = false;
    public final AbstractC2173821A5s mOnBackPressedCallback = new AbstractC2173821A5s() { // from class: X.19EJ
        @Override // X.AbstractC2173821A5s
        public final void LIZ() {
            FragmentManager fragmentManager;
            a aVar;
            if (!FragmentManager.USE_PREDICTIVE_BACK || (aVar = (fragmentManager = this.LIZLLL).mTransitioningOp) == null) {
                return;
            }
            aVar.LJIJJ = false;
            aVar.LJJIII();
            fragmentManager.mTransitioningOp.LJIJI(new ARunnableS132S0100000_32(fragmentManager, 7), true);
            fragmentManager.mTransitioningOp.LJIIIZ();
            fragmentManager.mHandlingTransitioningOp = true;
            fragmentManager.LJJJJL();
            fragmentManager.mHandlingTransitioningOp = false;
            fragmentManager.mTransitioningOp = null;
        }

        @Override // X.AbstractC2173821A5s
        public final void LIZIZ() {
            this.LIZLLL.LJJZ();
        }

        @Override // X.AbstractC2173821A5s
        public final void LIZLLL() {
            if (FragmentManager.USE_PREDICTIVE_BACK) {
                this.LIZLLL.LJJJIL();
                final FragmentManager fragmentManager = this.LIZLLL;
                fragmentManager.getClass();
                fragmentManager.LJJJJ(new InterfaceC21506619Eq() { // from class: X.19EL
                    @Override // X.InterfaceC21506619Eq
                    public final boolean LIZ(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
                        boolean zLJZ;
                        FragmentManager fragmentManager2 = fragmentManager;
                        if (fragmentManager2.mBackStack.isEmpty()) {
                            zLJZ = false;
                        } else {
                            ArrayList<a> arrayList3 = fragmentManager2.mBackStack;
                            a aVar = (a) ListProtector.get(arrayList3, arrayList3.size() - 1);
                            fragmentManager2.mTransitioningOp = aVar;
                            Iterator<C19EW> it2 = aVar.LIZJ.iterator();
                            while (it2.hasNext()) {
                                Fragment fragment = it2.next().LIZIZ;
                                if (fragment != null) {
                                    fragment.mTransitioning = true;
                                }
                            }
                            zLJZ = fragmentManager2.LJZ(arrayList, arrayList2, null, -1, 0);
                        }
                        if (!fragmentManager.mBackStackChangeListeners.isEmpty() && arrayList.size() > 0) {
                            boolean zBooleanValue = ((Boolean) ListProtector.get(arrayList2, arrayList.size() - 1)).booleanValue();
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            for (a aVar2 : arrayList) {
                                fragmentManager.getClass();
                                linkedHashSet.addAll(FragmentManager.LJJL(aVar2));
                            }
                            for (InterfaceC21506019Ek interfaceC21506019Ek : fragmentManager.mBackStackChangeListeners) {
                                Iterator it3 = linkedHashSet.iterator();
                                while (it3.hasNext()) {
                                    interfaceC21506019Ek.onBackStackChangeStarted((Fragment) it3.next(), zBooleanValue);
                                }
                            }
                        }
                        return zLJZ;
                    }
                }, false);
            }
        }

        {
            super(false);
        }

        @Override // X.AbstractC2173821A5s
        public final void LIZJ(C1776540wKa c1776540wKa) {
            FragmentManager fragmentManager = this.LIZLLL;
            if (fragmentManager.mTransitioningOp != null) {
                Iterator it2 = ((HashSet) fragmentManager.LJIILJJIL(new ArrayList<>(Collections.singletonList(this.LIZLLL.mTransitioningOp)), 0, 1)).iterator();
                while (it2.hasNext()) {
                    List<C21468018zu> list = ((AbstractC21468118zv) it2.next()).LIZJ;
                    ArrayList arrayList = new ArrayList();
                    Iterator it3 = ((ArrayList) list).iterator();
                    while (it3.hasNext()) {
                        C19719612Di.LJJI(((C21468018zu) it3.next()).LJIIJ, arrayList);
                    }
                    List listLLIIII = C13LP.LLIIII(C13LP.LLIIJI(arrayList));
                    int size = listLLIIII.size();
                    for (int i = 0; i < size; i++) {
                        ((C21467618zq) ListProtector.get(listLLIIII, i)).LIZLLL(c1776540wKa);
                    }
                }
                Iterator<InterfaceC21506019Ek> it4 = this.LIZLLL.mBackStackChangeListeners.iterator();
                while (it4.hasNext()) {
                    it4.next().onBackStackChangeProgressed(c1776540wKa);
                }
            }
        }
    };
    public final AtomicInteger mBackStackIndex = new AtomicInteger();
    public final Map<String, BackStackState> mBackStackStates = Collections.synchronizedMap(new HashMap());
    public final Map<String, Bundle> mResults = Collections.synchronizedMap(new HashMap());
    public final Map<String, C21505819Ei> mResultListeners = Collections.synchronizedMap(new HashMap());
    public ArrayList<InterfaceC21506019Ek> mBackStackChangeListeners = new ArrayList<>();
    public final C19CY mLifecycleCallbacksDispatcher = new C19CY(this);
    public final CopyOnWriteArrayList<InterfaceC1840220xzI> mOnAttachListeners = new CopyOnWriteArrayList<>();
    public final C092O<Configuration> mOnConfigurationChangedListener = new C21524219Lk(this, 0);
    public final C092O<Integer> mOnTrimMemoryListener = new C21524219Lk(this, 1);
    public final C092O<C19FD> mOnMultiWindowModeChangedListener = new C21524219Lk(this, 2);
    public final C092O<C480030Is5> mOnPictureInPictureModeChangedListener = new C21524219Lk(this, 3);
    public final InterfaceC21506819Es mMenuProvider = new InterfaceC21506819Es() { // from class: X.19Eh
        @Override // X.InterfaceC21506819Es
        public final void LIZ(Menu menu) {
            this.LIZ.LJJIIZ(menu);
        }

        @Override // X.InterfaceC21506819Es
        public final void LIZJ(Menu menu) {
            this.LIZ.LJJIJIIJIL(menu);
        }

        @Override // X.InterfaceC21506819Es
        public final boolean LIZLLL(MenuItem menuItem) {
            return this.LIZ.LJJIIJZLJL(menuItem);
        }

        @Override // X.InterfaceC21506819Es
        public final void LIZIZ(Menu menu, MenuInflater menuInflater) {
            this.LIZ.LJIL(menu, menuInflater);
        }
    };
    public int mCurState = -1;
    public C20135813qW mFragmentFactory = null;
    public C20135813qW mHostFragmentFactory = new C20135813qW() { // from class: X.14Kk
        @Override // X.C20135813qW
        public final Fragment LIZ(String str) {
            AnonymousClass1996<?> anonymousClass1996LJJLIIIJLJLI = this.LIZIZ.LJJLIIIJLJLI();
            Context context = this.LIZIZ.LJJLIIIJLJLI().LLILLJJLI;
            anonymousClass1996LJJLIIIJLJLI.getClass();
            return Fragment.instantiate(context, str, null);
        }
    };
    public AnonymousClass1902 mSpecialEffectsControllerFactory = null;
    public AnonymousClass1902 mDefaultSpecialEffectsControllerFactory = new AnonymousClass1902() { // from class: X.19F9
    };
    public ArrayDeque<LaunchedFragmentInfo> mLaunchedFragments = new ArrayDeque<>();
    public Runnable mExecCommit = new ARunnableS119S0100000_19(this, 1);

    public final void LJIIL() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    public void LJIIZILJ() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.LLILZLL = false;
        LJJIL(4);
    }

    public void LJIJ() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.LLILZLL = false;
        LJJIL(0);
    }

    public void LJIJJLI() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.LLILZLL = false;
        LJJIL(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJ() {
        /*
            r5 = this;
            r2 = 1
            r5.mDestroyed = r2
            r5.LJJJJIZL(r2)
            r5.LJJJIL()
            X.1996<?> r1 = r5.mHost
            boolean r0 = r1 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L48
            X.19EE r0 = r5.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r0 = r0.LIZLLL
            boolean r2 = r0.LLILZIL
        L15:
            if (r2 == 0) goto L56
        L17:
            java.util.Map<java.lang.String, androidx.fragment.app.BackStackState> r0 = r5.mBackStackStates
            java.util.Collection r0 = r0.values()
            java.util.Iterator r4 = r0.iterator()
        L21:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r4.next()
            androidx.fragment.app.BackStackState r0 = (androidx.fragment.app.BackStackState) r0
            java.util.List<java.lang.String> r0 = r0.LL
            java.util.Iterator r3 = r0.iterator()
        L33:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            X.19EE r0 = r5.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r0.LIZLLL
            r0 = 0
            r1.vQ2(r2, r0)
            goto L33
        L48:
            android.content.Context r1 = r1.LLILLJJLI
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L17
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isChangingConfigurations()
            r2 = r2 ^ r0
            goto L15
        L56:
            r0 = -1
            r5.LJJIL(r0)
            X.1996<?> r1 = r5.mHost
            boolean r0 = r1 instanceof X.InterfaceC21507519Ez
            if (r0 == 0) goto L67
            X.19Ez r1 = (X.InterfaceC21507519Ez) r1
            X.092O<java.lang.Integer> r0 = r5.mOnTrimMemoryListener
            r1.removeOnTrimMemoryListener(r0)
        L67:
            X.1996<?> r1 = r5.mHost
            boolean r0 = r1 instanceof X.InterfaceC19739612La
            if (r0 == 0) goto L74
            X.12La r1 = (X.InterfaceC19739612La) r1
            X.092O<android.content.res.Configuration> r0 = r5.mOnConfigurationChangedListener
            r1.removeOnConfigurationChangedListener(r0)
        L74:
            X.1996<?> r1 = r5.mHost
            boolean r0 = r1 instanceof X.InterfaceC21507319Ex
            if (r0 == 0) goto L81
            X.19Ex r1 = (X.InterfaceC21507319Ex) r1
            X.092O<X.19FD> r0 = r5.mOnMultiWindowModeChangedListener
            r1.removeOnMultiWindowModeChangedListener(r0)
        L81:
            X.1996<?> r1 = r5.mHost
            boolean r0 = r1 instanceof X.InterfaceC21507419Ey
            if (r0 == 0) goto L8e
            X.19Ey r1 = (X.InterfaceC21507419Ey) r1
            X.092O<X.0Is5> r0 = r5.mOnPictureInPictureModeChangedListener
            r1.removeOnPictureInPictureModeChangedListener(r0)
        L8e:
            X.1996<?> r1 = r5.mHost
            boolean r0 = r1 instanceof X.C19F8
            if (r0 == 0) goto L9f
            androidx.fragment.app.Fragment r0 = r5.mParent
            if (r0 != 0) goto L9f
            X.19F8 r1 = (X.C19F8) r1
            X.19Es r0 = r5.mMenuProvider
            r1.removeMenuProvider(r0)
        L9f:
            r1 = 0
            r5.mHost = r1
            r5.mContainer = r1
            r5.mParent = r1
            androidx.activity.OnBackPressedDispatcher r0 = r5.mOnBackPressedDispatcher
            if (r0 == 0) goto Lb1
            X.1A5s r0 = r5.mOnBackPressedCallback
            r0.LJ()
            r5.mOnBackPressedDispatcher = r1
        Lb1:
            X.19F0<android.content.Intent> r0 = r5.mStartActivityForResult
            if (r0 == 0) goto Lc2
            r0.LIZIZ()
            X.19F0<androidx.activity.result.IntentSenderRequest> r0 = r5.mStartIntentSenderForResult
            r0.LIZIZ()
            X.19F0<java.lang.String[]> r0 = r5.mRequestPermissions
            r0.LIZIZ()
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.LJJ():void");
    }

    public void LJJI() {
        LJJIL(1);
    }

    public void LJJIJ() {
        LJJIL(5);
    }

    public void LJJIJL() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.LLILZLL = false;
        LJJIL(7);
    }

    public void LJJIJLIJ() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.LLILZLL = false;
        LJJIL(5);
    }

    public void LJJIZ() {
        this.mStopped = true;
        this.mNonConfig.LLILZLL = true;
        LJJIL(4);
    }

    public void LJJJ() {
        LJJIL(2);
    }

    public boolean LJJJJL() {
        boolean zLJJJJIZL = LJJJJIZL(true);
        LJJJZ();
        return zLJJJJIZL;
    }

    public void LJJZ() {
        this.mHandlingTransitioningOp = true;
        LJJJJIZL(true);
        this.mHandlingTransitioningOp = false;
        if (!USE_PREDICTIVE_BACK || this.mTransitioningOp == null) {
            if (this.mOnBackPressedCallback.LIZ) {
                LJLLL();
                return;
            } else {
                this.mOnBackPressedDispatcher.LJ();
                return;
            }
        }
        if (!this.mBackStackChangeListeners.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(LJJL(this.mTransitioningOp));
            for (InterfaceC21506019Ek interfaceC21506019Ek : this.mBackStackChangeListeners) {
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    interfaceC21506019Ek.onBackStackChangeCommitted((Fragment) it2.next(), true);
                }
            }
        }
        Iterator<C19EW> it3 = this.mTransitioningOp.LIZJ.iterator();
        while (it3.hasNext()) {
            Fragment fragment = it3.next().LIZIZ;
            if (fragment != null) {
                fragment.mTransitioning = false;
            }
        }
        for (AbstractC21468118zv abstractC21468118zv : (HashSet) LJIILJJIL(new ArrayList<>(Collections.singletonList(this.mTransitioningOp)), 0, 1)) {
            abstractC21468118zv.LJIIJJI(abstractC21468118zv.LIZJ);
            abstractC21468118zv.LIZJ(abstractC21468118zv.LIZJ);
        }
        Iterator<C19EW> it4 = this.mTransitioningOp.LIZJ.iterator();
        while (it4.hasNext()) {
            Fragment fragment2 = it4.next().LIZIZ;
            if (fragment2 != null && fragment2.mContainer == null) {
                LIZ(LJIILL(fragment2));
            }
        }
        this.mTransitioningOp = null;
        LLIIZ();
    }

    public boolean LJLLL() {
        return LJLLLLLL(-1, 0, null);
    }

    public static boolean LJLI() {
        return DEBUG || Log.isLoggable("FragmentManager", 2);
    }

    public int LJII() {
        return this.mBackStackIndex.getAndIncrement();
    }

    public C19EH LJIIJ() {
        return new a(this);
    }

    public boolean LJIIJJI() {
        for (Fragment fragment : (ArrayList) this.mFragmentStore.LJ()) {
            if (fragment != null && LJLIIIL(fragment)) {
                return true;
            }
        }
        return false;
    }

    public final Set<AbstractC21468118zv> LJIILIIL() {
        HashSet hashSet = new HashSet();
        Iterator it2 = ((ArrayList) this.mFragmentStore.LIZLLL()).iterator();
        while (it2.hasNext()) {
            ViewGroup viewGroup = ((C19EC) it2.next()).LIZJ.mContainer;
            if (viewGroup != null) {
                AnonymousClass1902 anonymousClass1902LJJLJLI = LJJLJLI();
                Object tag = viewGroup.getTag(R.id.vte);
                if (!(tag instanceof AbstractC21468118zv)) {
                    anonymousClass1902LJJLJLI.getClass();
                    tag = new C21467218zm(viewGroup);
                    viewGroup.setTag(R.id.vte, tag);
                }
                hashSet.add(tag);
            }
        }
        return hashSet;
    }

    public final void LJJIIJ() throws Throwable {
        for (Fragment fragment : (ArrayList) this.mFragmentStore.LJ()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.LJJIIJ();
            }
        }
    }

    public int LJJLIIIIJ() {
        return this.mBackStack.size() + (this.mTransitioningOp != null ? 1 : 0);
    }

    public C20135813qW LJJLIIIJJIZ() {
        C20135813qW c20135813qW = this.mFragmentFactory;
        if (c20135813qW != null) {
            return c20135813qW;
        }
        Fragment fragment = this.mParent;
        return fragment != null ? fragment.mFragmentManager.LJJLIIIJJIZ() : this.mHostFragmentFactory;
    }

    public List<Fragment> LJJLIIIJL() {
        return this.mFragmentStore.LJFF();
    }

    public AnonymousClass1902 LJJLJLI() {
        AnonymousClass1902 anonymousClass1902 = this.mSpecialEffectsControllerFactory;
        if (anonymousClass1902 != null) {
            return anonymousClass1902;
        }
        Fragment fragment = this.mParent;
        return fragment != null ? fragment.mFragmentManager.LJJLJLI() : this.mDefaultSpecialEffectsControllerFactory;
    }

    public final boolean LJLIIL() {
        Fragment fragment = this.mParent;
        if (fragment == null) {
            return true;
        }
        return fragment.isAdded() && this.mParent.getParentFragmentManager().LJLIIL();
    }

    public boolean LJLJI() {
        return this.mCurState >= 1;
    }

    public boolean LJLJJI() {
        return this.mStateSaved || this.mStopped;
    }

    public void LJLJLLL() {
        if (this.mHost == null) {
            return;
        }
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.LLILZLL = false;
        for (Fragment fragment : this.mFragmentStore.LJFF()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void LJLLILLLL() {
        LJJJJ(new C21505319Ed(this, null, -1, 0), false);
    }

    public Parcelable LLFZ() {
        if (this.mHost instanceof C128Y) {
            LLIILII(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
            throw null;
        }
        Bundle bundleLLI = LLI();
        if (bundleLLI.isEmpty()) {
            return null;
        }
        return bundleLLI;
    }

    public final Bundle LLI() {
        BackStackRecordState[] backStackRecordStateArr;
        ArrayList<String> arrayList;
        Bundle bundle = new Bundle();
        LJJJZ();
        LJJJIL();
        LJJJJIZL(true);
        this.mStateSaved = true;
        this.mNonConfig.LLILZLL = true;
        C19EE c19ee = this.mFragmentStore;
        c19ee.getClass();
        ArrayList<String> arrayList2 = new ArrayList<>(c19ee.LIZIZ.size());
        for (C19EC c19ec : c19ee.LIZIZ.values()) {
            if (c19ec != null) {
                Fragment fragment = c19ec.LIZJ;
                c19ee.LJIIIIZZ(c19ec.LJIIL(), fragment.mWho);
                arrayList2.add(fragment.mWho);
            }
        }
        HashMap<String, Bundle> map = this.mFragmentStore.LIZJ;
        if (!map.isEmpty()) {
            C19EE c19ee2 = this.mFragmentStore;
            synchronized (c19ee2.LIZ) {
                try {
                    backStackRecordStateArr = null;
                    if (c19ee2.LIZ.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList<>(c19ee2.LIZ.size());
                        Iterator<Fragment> it2 = c19ee2.LIZ.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().mWho);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            int size = this.mBackStack.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStackRecordStateArr[i] = new BackStackRecordState((a) ListProtector.get(this.mBackStack, i));
                }
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.LL = arrayList2;
            fragmentManagerState.LLILLJJLI = arrayList;
            fragmentManagerState.LLILLL = backStackRecordStateArr;
            fragmentManagerState.LLILZ = this.mBackStackIndex.get();
            Fragment fragment2 = this.mPrimaryNav;
            if (fragment2 != null) {
                fragmentManagerState.LLILZIL = fragment2.mWho;
            }
            fragmentManagerState.LLILZLL.addAll(this.mBackStackStates.keySet());
            fragmentManagerState.LLIZ.addAll(this.mBackStackStates.values());
            fragmentManagerState.LLIZLLLIL = new ArrayList<>(this.mLaunchedFragments);
            C786410Ut5.LJJIJL(bundle, "state", fragmentManagerState);
            for (String str : this.mResults.keySet()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("result_");
                sbLIZ.append(str);
                C786410Ut5.LJJIIZI(bundle, this.mResults.get(str), C2188811AlT.LIZIZ(sbLIZ));
            }
            for (String str2 : map.keySet()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fragment_");
                sbLIZ2.append(str2);
                C786410Ut5.LJJIIZI(bundle, map.get(str2), C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return bundle;
    }

    public void LLII() {
        synchronized (this.mPendingActions) {
            try {
                if (this.mPendingActions.size() == 1) {
                    this.mHost.LJ().removeCallbacks(this.mExecCommit);
                    C786410Ut5.LJJZZIII(this.mHost.LJ(), this.mExecCommit);
                    LLIIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LLIIL() {
        Iterator it2 = ((ArrayList) this.mFragmentStore.LIZLLL()).iterator();
        while (it2.hasNext()) {
            LJLLI((C19EC) it2.next());
        }
    }

    public final void LLIIZ() {
        synchronized (this.mPendingActions) {
            try {
                if (this.mPendingActions.isEmpty()) {
                    this.mOnBackPressedCallback.LJFF(LJJLIIIIJ() > 0 && LJLILLLLZI(this.mParent));
                } else {
                    this.mOnBackPressedCallback.LJFF(true);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.mParent;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.mParent)));
            sb.append("}");
        } else {
            AnonymousClass1996<?> anonymousClass1996 = this.mHost;
            if (anonymousClass1996 != null) {
                sb.append(anonymousClass1996.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.mHost)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void LJJIJIL() {
        LLIIZ();
        LJJIIZI(this.mPrimaryNav);
    }

    public final void LJJJIL() {
        Iterator it2 = ((HashSet) LJIILIIL()).iterator();
        while (it2.hasNext()) {
            ((AbstractC21468118zv) it2.next()).LJII();
        }
    }

    public final void LJJJZ() {
        for (AbstractC21468118zv abstractC21468118zv : (HashSet) LJIILIIL()) {
            if (abstractC21468118zv.LJFF) {
                abstractC21468118zv.LJFF = false;
                abstractC21468118zv.LJ();
            }
        }
    }

    public C19F6 LJJLIIIJ() {
        return this.mContainer;
    }

    public AnonymousClass1996<?> LJJLIIIJLJLI() {
        return this.mHost;
    }

    public LayoutInflater.Factory2 LJJLIIIJLLLLLLLZ() {
        return this.mLayoutInflaterFactory;
    }

    public C19CY LJJLIIJ() {
        return this.mLifecycleCallbacksDispatcher;
    }

    public Fragment LJJLIL() {
        return this.mParent;
    }

    public Fragment LJJLJ() {
        return this.mPrimaryNav;
    }

    public boolean LJL() {
        return this.mDestroyed;
    }

    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new C21523519Ld(3);
        public final String LL;
        public final int LLILLJJLI;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.LL = parcel.readString();
            this.LLILLJJLI = parcel.readInt();
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.LL = str;
            this.LLILLJJLI = i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.LL);
            parcel.writeInt(this.LLILLJJLI);
        }
    }

    public static void LIZ(C19EC c19ec) {
        try {
            c19ec.LJIIIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(new RuntimeException("FragmentStateManager moveToExpectedState exception ---> "));
        }
    }

    public static <F extends Fragment> F LJJJJLL(View view) {
        F f = (F) LJJJLZIJ(view);
        if (f != null) {
            return f;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("View ");
        sbLIZ.append(view);
        sbLIZ.append(" does not have a Fragment set");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static FragmentManager LJJJLL(View view) {
        Fragment fragmentLJJJLZIJ = LJJJLZIJ(view);
        if (fragmentLJJJLZIJ != null) {
            if (fragmentLJJJLZIJ.isAdded()) {
                return fragmentLJJJLZIJ.getChildFragmentManager();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The Fragment ");
            sbLIZ.append(fragmentLJJJLZIJ);
            sbLIZ.append(" that owns View ");
            sbLIZ.append(view);
            sbLIZ.append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof C19EG) {
                C19EG c19eg = (C19EG) context;
                if (c19eg != null) {
                    return c19eg.getSupportFragmentManager();
                }
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("View ");
        sbLIZ2.append(view);
        sbLIZ2.append(" is not within a subclass of FragmentActivity.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static Fragment LJJJLZIJ(View view) {
        Fragment fragment;
        while (view != null) {
            Object tag = view.getTag(R.id.ij1);
            if ((tag instanceof Fragment) && (fragment = (Fragment) tag) != null) {
                return fragment;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static Set LJJL(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < aVar.LIZJ.size(); i++) {
            Fragment fragment = ((C19EW) ListProtector.get(aVar.LIZJ, i)).LIZIZ;
            if (fragment != null && aVar.LJIIIIZZ) {
                hashSet.add(fragment);
            }
        }
        return hashSet;
    }

    public static boolean LJLIIIL(Fragment fragment) {
        if ((!fragment.mHasMenu || !fragment.mMenuVisible) && !fragment.mChildFragmentManager.LJIIJJI()) {
            return false;
        }
        return true;
    }

    public void LIZJ(a aVar) {
        this.mBackStack.add(aVar);
    }

    public C19EC LIZLLL(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            C19EM.LIZJ(fragment, str);
        }
        C19EC c19ecLJIILL = LJIILL(fragment);
        fragment.mFragmentManager = this;
        this.mFragmentStore.LJI(c19ecLJIILL);
        if (!fragment.mDetached) {
            this.mFragmentStore.LIZ(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (LJLIIIL(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
        return c19ecLJIILL;
    }

    public void LJ(InterfaceC1840220xzI interfaceC1840220xzI) {
        this.mOnAttachListeners.add(interfaceC1840220xzI);
    }

    public void LJFF(InterfaceC21506019Ek interfaceC21506019Ek) {
        this.mBackStackChangeListeners.add(interfaceC21506019Ek);
    }

    public void LJI(Fragment fragment) {
        FragmentManagerViewModel fragmentManagerViewModel = this.mNonConfig;
        if (!fragmentManagerViewModel.LLILZLL && !fragmentManagerViewModel.LL.containsKey(fragment.mWho)) {
            fragmentManagerViewModel.LL.put(fragment.mWho, fragment);
        }
    }

    public void LJIIIZ(Fragment fragment) {
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.mFragmentStore.LIZ(fragment);
                if (LJLIIIL(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
            }
        }
    }

    public C19EC LJIILL(Fragment fragment) {
        C19EE c19ee = this.mFragmentStore;
        C19EC c19ec = c19ee.LIZIZ.get(fragment.mWho);
        if (c19ec != null) {
            return c19ec;
        }
        C19EC c19ec2 = new C19EC(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment);
        c19ec2.LJIIJ(this.mHost.LLILLJJLI.getClassLoader());
        c19ec2.LJ = this.mCurState;
        return c19ec2;
    }

    public void LJIILLIIL(Fragment fragment) {
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                C19EE c19ee = this.mFragmentStore;
                synchronized (c19ee.LIZ) {
                    try {
                        c19ee.LIZ.remove(fragment);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                fragment.mAdded = false;
                if (LJLIIIL(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
                LLIIJI(fragment);
            }
        }
    }

    public boolean LJIJJ(MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.LJFF()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void LJJIFFI(boolean z) {
        if (z && (this.mHost instanceof InterfaceC21507519Ez)) {
            LLIILII(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (Fragment fragment : this.mFragmentStore.LJFF()) {
            if (fragment != null) {
                fragment.performLowMemory();
                if (z) {
                    fragment.mChildFragmentManager.LJJIFFI(true);
                }
            }
        }
    }

    public void LJJIII(Fragment fragment) {
        Iterator<InterfaceC1840220xzI> it2 = this.mOnAttachListeners.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(fragment);
        }
    }

    public boolean LJJIIJZLJL(MenuItem menuItem) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.LJFF()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void LJJIIZ(Menu menu) {
        if (this.mCurState < 1) {
            return;
        }
        for (Fragment fragment : this.mFragmentStore.LJFF()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void LJJIIZI(Fragment fragment) {
        if (fragment != null && fragment.equals(LJJJJLI(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    public boolean LJJIJIIJIL(Menu menu) {
        boolean z = false;
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment fragment : this.mFragmentStore.LJFF()) {
            if (fragment != null && LJLIL(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final void LJJIL(int i) {
        Object objLJII = this.mHost.LJII();
        if ((objLJII instanceof C199Y) && ((C199Y) objLJII).shieldActivityController) {
            return;
        }
        try {
            this.mExecutingActions = true;
            for (C19EC c19ec : this.mFragmentStore.LIZIZ.values()) {
                if (c19ec != null) {
                    c19ec.LJ = i;
                }
            }
            LIZIZ(this, i, false);
            Iterator it2 = ((HashSet) LJIILIIL()).iterator();
            while (it2.hasNext()) {
                ((AbstractC21468118zv) it2.next()).LJII();
            }
            this.mExecutingActions = false;
            LJJJJIZL(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.mExecutingActions = false;
            throw th;
        }
    }

    public final void LJJJJI(boolean z) {
        if (!this.mExecutingActions) {
            if (this.mHost == null) {
                if (this.mDestroyed) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.mHost.LJ().getLooper()) {
                if (!z && LJLJJI()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.mTmpRecords == null) {
                    this.mTmpRecords = new ArrayList<>();
                    this.mTmpIsPop = new ArrayList<>();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0105, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010a, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJJJJIZL(boolean r12) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.LJJJJIZL(boolean):boolean");
    }

    public Fragment LJJJJLI(String str) {
        return this.mFragmentStore.LIZIZ(str);
    }

    public Fragment LJJJJZ(int i) {
        C19EE c19ee = this.mFragmentStore;
        int size = c19ee.LIZ.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) ListProtector.get(c19ee.LIZ, size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            } else {
                for (C19EC c19ec : c19ee.LIZIZ.values()) {
                    if (c19ec != null) {
                        Fragment fragment2 = c19ec.LIZJ;
                        if (fragment2.mFragmentId == i) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public Fragment LJJJJZI(String str) {
        C19EE c19ee = this.mFragmentStore;
        if (str != null) {
            int size = c19ee.LIZ.size();
            while (true) {
                size--;
                if (size >= 0) {
                    Fragment fragment = (Fragment) ListProtector.get(c19ee.LIZ, size);
                    if (fragment != null && str.equals(fragment.mTag)) {
                        return fragment;
                    }
                } else {
                    for (C19EC c19ec : c19ee.LIZIZ.values()) {
                        if (c19ec != null) {
                            Fragment fragment2 = c19ec.LIZJ;
                            if (str.equals(fragment2.mTag)) {
                                return fragment2;
                            }
                        }
                    }
                    return null;
                }
            }
        } else {
            c19ee.getClass();
            return null;
        }
    }

    public Fragment LJJJLIIL(String str) {
        return this.mFragmentStore.LIZJ(str);
    }

    public InterfaceC988103tf LJJLI(int i) {
        if (i == this.mBackStack.size()) {
            a aVar = this.mTransitioningOp;
            if (aVar != null) {
                return aVar;
            }
            throw new IndexOutOfBoundsException();
        }
        return (InterfaceC988103tf) ListProtector.get(this.mBackStack, i);
    }

    public final ViewGroup LJJLIIIJJI(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.mContainer.LIZJ()) {
            View viewLIZIZ = this.mContainer.LIZIZ(fragment.mContainerId);
            if (viewLIZIZ instanceof ViewGroup) {
                return (ViewGroup) viewLIZIZ;
            }
        }
        return null;
    }

    public ViewModelStore LJJLL(Fragment fragment) {
        FragmentManagerViewModel fragmentManagerViewModel = this.mNonConfig;
        ViewModelStore viewModelStore = fragmentManagerViewModel.LLILLL.get(fragment.mWho);
        if (viewModelStore == null) {
            ViewModelStore viewModelStore2 = new ViewModelStore();
            fragmentManagerViewModel.LLILLL.put(fragment.mWho, viewModelStore2);
            return viewModelStore2;
        }
        return viewModelStore;
    }

    public void LJJZZI(Fragment fragment) {
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            LLIIJI(fragment);
        }
    }

    public void LJJZZIII(Fragment fragment) {
        if (fragment.mAdded && LJLIIIL(fragment)) {
            this.mNeedMenuInvalidate = true;
        }
    }

    public boolean LJLIL(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean LJLILLLLZI(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragment.equals(fragmentManager.LJJLJ()) && LJLILLLLZI(fragmentManager.mParent)) {
            return true;
        }
        return false;
    }

    public final void LJLL(C20247014Ke c20247014Ke) {
        View view;
        for (C19EC c19ec : (ArrayList) this.mFragmentStore.LIZLLL()) {
            Fragment fragment = c19ec.LIZJ;
            if (fragment.mContainerId == c20247014Ke.getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = c20247014Ke;
                c19ec.LIZ();
                LIZ(c19ec);
            }
        }
    }

    public void LJLLI(C19EC c19ec) {
        Fragment fragment = c19ec.LIZJ;
        if (fragment.mDeferStart) {
            if (this.mExecutingActions) {
                this.mHavePendingDeferredStart = true;
            } else {
                fragment.mDeferStart = false;
                LIZ(c19ec);
            }
        }
    }

    public boolean LJLLLL(int i) {
        if (i >= 0) {
            return LJLLLLLL(i, 1, null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Bad id: ");
        sbLIZ.append(i);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LL(Fragment fragment) {
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            C19EE c19ee = this.mFragmentStore;
            synchronized (c19ee.LIZ) {
                try {
                    c19ee.LIZ.remove(fragment);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            fragment.mAdded = false;
            if (LJLIIIL(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mRemoving = true;
            LLIIJI(fragment);
        }
    }

    public void LLD(InterfaceC21506019Ek interfaceC21506019Ek) {
        this.mBackStackChangeListeners.remove(interfaceC21506019Ek);
    }

    public void LLFF(Fragment fragment) {
        this.mNonConfig.wQ2(fragment);
    }

    public void LLFFF(Parcelable parcelable) {
        if (!(this.mHost instanceof C128Y)) {
            LLFII(parcelable);
        } else {
            LLIILII(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
            throw null;
        }
    }

    public final void LLFII(Parcelable parcelable) {
        int i;
        boolean z;
        C19EC c19ec;
        Bundle bundle;
        Bundle bundle2;
        if (parcelable == null) {
            return;
        }
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.mHost.LLILLJJLI.getClassLoader());
                this.mResults.put(str.substring(7), bundle2);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.mHost.LLILLJJLI.getClassLoader());
                map.put(str2.substring(9), bundle);
            }
        }
        C19EE c19ee = this.mFragmentStore;
        c19ee.LIZJ.clear();
        c19ee.LIZJ.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable("state");
        if (fragmentManagerState == null) {
            return;
        }
        this.mFragmentStore.LIZIZ.clear();
        Iterator<String> it2 = fragmentManagerState.LL.iterator();
        while (it2.hasNext()) {
            Bundle bundleLJIIIIZZ = this.mFragmentStore.LJIIIIZZ(null, it2.next());
            if (bundleLJIIIIZZ != null) {
                FragmentState fragmentState = (FragmentState) bundleLJIIIIZZ.getParcelable("state");
                Fragment fragment = this.mNonConfig.LL.get(fragmentState.LLILLJJLI);
                if (fragment != null) {
                    c19ec = new C19EC(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment, bundleLJIIIIZZ);
                } else {
                    c19ec = new C19EC(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, this.mHost.LLILLJJLI.getClassLoader(), LJJLIIIJJIZ(), bundleLJIIIIZZ);
                }
                Fragment fragment2 = c19ec.LIZJ;
                fragment2.mSavedFragmentState = bundleLJIIIIZZ;
                fragment2.mFragmentManager = this;
                c19ec.LJIIJ(this.mHost.LLILLJJLI.getClassLoader());
                this.mFragmentStore.LJI(c19ec);
                c19ec.LJ = this.mCurState;
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.mNonConfig;
        fragmentManagerViewModel.getClass();
        Iterator it3 = new ArrayList(fragmentManagerViewModel.LL.values()).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Fragment fragment3 = (Fragment) it3.next();
            if (this.mFragmentStore.LIZIZ.get(fragment3.mWho) == null) {
                this.mNonConfig.wQ2(fragment3);
                fragment3.mFragmentManager = this;
                C19EC c19ec2 = new C19EC(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, fragment3);
                c19ec2.LJ = 1;
                LIZ(c19ec2);
                fragment3.mRemoving = true;
                LIZ(c19ec2);
            }
        }
        C19EE c19ee2 = this.mFragmentStore;
        ArrayList<String> arrayList = fragmentManagerState.LLILLJJLI;
        c19ee2.LIZ.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                Fragment fragmentLIZIZ = c19ee2.LIZIZ(str3);
                if (fragmentLIZIZ != null) {
                    c19ee2.LIZ(fragmentLIZIZ);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("No instantiated fragment for (");
                    sbLIZ.append(str3);
                    sbLIZ.append(")");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        if (fragmentManagerState.LLILLL != null) {
            this.mBackStack = new ArrayList<>(fragmentManagerState.LLILLL.length);
            int i2 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.LLILLL;
                if (i2 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i2];
                backStackRecordState.getClass();
                a aVar = new a(this);
                int i3 = 0;
                int i4 = 0;
                while (i3 < backStackRecordState.LL.length) {
                    C19EW c19ew = new C19EW();
                    int i5 = i3 + 1;
                    c19ew.LIZ = backStackRecordState.LL[i3];
                    c19ew.LJII = Lifecycle.State.values()[backStackRecordState.LLILLL[i4]];
                    c19ew.LJIIIIZZ = Lifecycle.State.values()[backStackRecordState.LLILZ[i4]];
                    int[] iArr = backStackRecordState.LL;
                    int i6 = i5 + 1;
                    if (iArr[i5] != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c19ew.LIZJ = z;
                    int i7 = i6 + 1;
                    int i8 = iArr[i6];
                    c19ew.LIZLLL = i8;
                    int i9 = i7 + 1;
                    int i10 = iArr[i7];
                    c19ew.LJ = i10;
                    int i11 = i9 + 1;
                    int i12 = iArr[i9];
                    c19ew.LJFF = i12;
                    i3 = i11 + 1;
                    int i13 = iArr[i11];
                    c19ew.LJI = i13;
                    aVar.LIZLLL = i8;
                    aVar.LJ = i10;
                    aVar.LJFF = i12;
                    aVar.LJI = i13;
                    aVar.LJFF(c19ew);
                    i4++;
                }
                aVar.LJII = backStackRecordState.LLILZIL;
                aVar.LJIIJ = backStackRecordState.LLILZLL;
                aVar.LJIIIIZZ = true;
                aVar.LJIIJJI = backStackRecordState.LLIZLLLIL;
                aVar.LJIIL = backStackRecordState.LLJ;
                aVar.LJIILIIL = backStackRecordState.LLJI;
                aVar.LJIILJJIL = backStackRecordState.LLJIJIL;
                aVar.LJIILL = backStackRecordState.LLJILJIL;
                aVar.LJIILLIIL = backStackRecordState.LLJILJILJ;
                aVar.LJIIZILJ = backStackRecordState.LLJILLL;
                aVar.LJIJJLI = backStackRecordState.LLIZ;
                for (int i14 = 0; i14 < backStackRecordState.LLILLJJLI.size(); i14++) {
                    String str4 = (String) ListProtector.get(backStackRecordState.LLILLJJLI, i14);
                    if (str4 != null) {
                        ((C19EW) ListProtector.get(aVar.LIZJ, i14)).LIZIZ = LJJJJLI(str4);
                    }
                }
                aVar.LJJII(1);
                if (LJLI()) {
                    PrintWriter printWriter = new PrintWriter(new C2349809Iq());
                    aVar.LJJIIJZLJL("  ", printWriter, false);
                    printWriter.close();
                }
                this.mBackStack.add(aVar);
                i2++;
            }
        } else {
            this.mBackStack = new ArrayList<>();
        }
        this.mBackStackIndex.set(fragmentManagerState.LLILZ);
        String str5 = fragmentManagerState.LLILZIL;
        if (str5 != null) {
            Fragment fragmentLJJJJLI = LJJJJLI(str5);
            this.mPrimaryNav = fragmentLJJJJLI;
            LJJIIZI(fragmentLJJJJLI);
        }
        ArrayList<String> arrayList2 = fragmentManagerState.LLILZLL;
        if (arrayList2 != null) {
            for (i = 0; i < arrayList2.size(); i++) {
                this.mBackStackStates.put((String) ListProtector.get(arrayList2, i), (BackStackState) ListProtector.get(fragmentManagerState.LLIZ, i));
            }
        }
        this.mLaunchedFragments = new ArrayDeque<>(fragmentManagerState.LLIZLLLIL);
    }

    public Fragment.SavedState LLIFFJFJJ(Fragment fragment) {
        C19EE c19ee = this.mFragmentStore;
        C19EC c19ec = c19ee.LIZIZ.get(fragment.mWho);
        if (c19ec != null && c19ec.LIZJ.equals(fragment)) {
            if (c19ec.LIZJ.mState <= -1) {
                return null;
            }
            return new Fragment.SavedState(c19ec.LJIIL());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(fragment);
        sbLIZ.append(" is not currently in the FragmentManager");
        LLIILII(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
        throw null;
    }

    public void LLIIIZ(Fragment fragment) {
        if (fragment == null || (fragment.equals(LJJJJLI(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.mPrimaryNav;
            this.mPrimaryNav = fragment;
            LJJIIZI(fragment2);
            LJJIIZI(this.mPrimaryNav);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(fragment);
        sbLIZ.append(" is not an active fragment of FragmentManager ");
        sbLIZ.append(this);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LLIIJI(Fragment fragment) {
        ViewGroup viewGroupLJJLIIIJJI = LJJLIIIJJI(fragment);
        if (viewGroupLJJLIIIJJI != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            if (viewGroupLJJLIIIJJI.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                viewGroupLJJLIIIJJI.setTag(R.id.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) viewGroupLJJLIIIJJI.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
        }
    }

    public void LLIIJLIL(Fragment fragment) {
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public final void LLIILII(RuntimeException runtimeException) {
        PrintWriter printWriter = new PrintWriter(new C2349809Iq());
        AnonymousClass1996<?> anonymousClass1996 = this.mHost;
        if (anonymousClass1996 != null) {
            try {
                anonymousClass1996.LJI(printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw runtimeException;
            }
        }
        try {
            LJJJI("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw runtimeException;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        r4.LIZIZ.remove(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLIILZL(X.AbstractC813200VvC r6) {
        /*
            r5 = this;
            X.19CY r4 = r5.mLifecycleCallbacksDispatcher
            java.util.concurrent.CopyOnWriteArrayList<X.19CZ> r3 = r4.LIZIZ
            monitor-enter(r3)
            java.util.concurrent.CopyOnWriteArrayList<X.19CZ> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L25
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L25
            r1 = 0
        Lc:
            if (r1 >= r2) goto L23
            java.util.concurrent.CopyOnWriteArrayList<X.19CZ> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L25
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L25
            X.19CZ r0 = (X.C19CZ) r0     // Catch: java.lang.Throwable -> L25
            X.0VvC r0 = r0.LIZ     // Catch: java.lang.Throwable -> L25
            if (r0 != r6) goto L20
            java.util.concurrent.CopyOnWriteArrayList<X.19CZ> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L25
            r0.remove(r1)     // Catch: java.lang.Throwable -> L25
            goto L23
        L20:
            int r1 = r1 + 1
            goto Lc
        L23:
            monitor-exit(r3)
            return
        L25:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.LLIILZL(X.0VvC):void");
    }

    public void LJIJI(boolean z, Configuration configuration) {
        if (z && (this.mHost instanceof InterfaceC19739612La)) {
            LLIILII(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.mFragmentStore.LJFF()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
                if (z) {
                    fragment.mChildFragmentManager.LJIJI(true, configuration);
                }
            }
        }
    }

    public boolean LJIL(Menu menu, MenuInflater menuInflater) {
        if (this.mCurState < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.mFragmentStore.LJFF()) {
            if (fragment != null && LJLIL(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i = 0; i < this.mCreatedMenus.size(); i++) {
                Fragment fragment2 = (Fragment) ListProtector.get(this.mCreatedMenus, i);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = arrayList;
        return z;
    }

    public void LJJII(boolean z, boolean z2) {
        if (z2 && (this.mHost instanceof InterfaceC21507319Ex)) {
            LLIILII(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.mFragmentStore.LJFF()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.LJJII(z, true);
                }
            }
        }
    }

    public void LJJIJIIJI(boolean z, boolean z2) {
        if (z2 && (this.mHost instanceof InterfaceC21507419Ey)) {
            LLIILII(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (Fragment fragment : this.mFragmentStore.LJFF()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
                if (z2) {
                    fragment.mChildFragmentManager.LJJIJIIJI(z, true);
                }
            }
        }
    }

    public void LJJJJ(InterfaceC21506619Eq interfaceC21506619Eq, boolean z) {
        if (!z) {
            if (this.mHost == null) {
                if (this.mDestroyed) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (LJLJJI()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.mPendingActions) {
            try {
                if (this.mHost == null) {
                    if (z) {
                    } else {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.mPendingActions.add(interfaceC21506619Eq);
                    LLII();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void LJJJJJ(InterfaceC21506619Eq interfaceC21506619Eq, boolean z) {
        boolean z2;
        if (z && (this.mHost == null || this.mDestroyed)) {
            return;
        }
        LJJJJI(z);
        a aVar = this.mTransitioningOp;
        if (aVar != null) {
            aVar.LJIJJ = false;
            aVar.LJJIII();
            this.mTransitioningOp.LJJIIJ(false, false);
            this.mTransitioningOp.LIZ(this.mTmpRecords, this.mTmpIsPop);
            Iterator<C19EW> it2 = this.mTransitioningOp.LIZJ.iterator();
            while (it2.hasNext()) {
                Fragment fragment = it2.next().LIZIZ;
                if (fragment != null) {
                    fragment.mTransitioning = false;
                }
            }
            this.mTransitioningOp = null;
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zLIZ = interfaceC21506619Eq.LIZ(this.mTmpRecords, this.mTmpIsPop);
        if (z2 || zLIZ) {
            this.mExecutingActions = true;
            try {
                LLF(this.mTmpRecords, this.mTmpIsPop);
                LJIIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIL();
                throw th;
            }
        }
        LLIIZ();
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            LLIIL();
        }
        this.mFragmentStore.LIZIZ.values().removeAll(Collections.singleton(null));
    }

    public Fragment LJJLIIIJILLIZJL(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentLJJJJLI = LJJJJLI(string);
        if (fragmentLJJJJLI != null) {
            return fragmentLJJJJLI;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment no longer exists for key ");
        sbLIZ.append(str);
        sbLIZ.append(": unique id ");
        sbLIZ.append(string);
        LLIILII(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
        throw null;
    }

    public void LJLJLJ(int i, boolean z) {
        AnonymousClass1996<?> anonymousClass1996;
        if (this.mHost == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z && i == this.mCurState) {
            return;
        }
        this.mCurState = i;
        C19EE c19ee = this.mFragmentStore;
        Iterator<Fragment> it2 = c19ee.LIZ.iterator();
        while (it2.hasNext()) {
            C19EC c19ec = c19ee.LIZIZ.get(it2.next().mWho);
            if (c19ec != null) {
                try {
                    c19ec.LJIIIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(new RuntimeException("FragmentStateManager moveToExpectedState exception ---> "));
                }
            }
        }
        for (C19EC c19ec2 : c19ee.LIZIZ.values()) {
            if (c19ec2 != null) {
                try {
                    c19ec2.LJIIIZ();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1AF0.LJ(new RuntimeException("FragmentStateManager moveToExpectedState exception ---> "));
                }
                Fragment fragment = c19ec2.LIZJ;
                if (fragment.mRemoving && !fragment.isInBackStack()) {
                    if (fragment.mBeingSaved && !c19ee.LIZJ.containsKey(fragment.mWho)) {
                        c19ee.LJIIIIZZ(c19ec2.LJIIL(), fragment.mWho);
                    }
                    c19ee.LJII(c19ec2);
                }
            }
        }
        LLIIL();
        if (this.mNeedMenuInvalidate && (anonymousClass1996 = this.mHost) != null && this.mCurState == 7) {
            anonymousClass1996.LJIIL();
            this.mNeedMenuInvalidate = false;
        }
    }

    public void LJLLJ(int i, String str) {
        LJJJJ(new C21505319Ed(this, str, -1, i), false);
    }

    public boolean LJLZ(int i, String str) {
        return LJLLLLLL(-1, i, str);
    }

    public void LJZL(AbstractC813200VvC abstractC813200VvC, boolean z) {
        this.mLifecycleCallbacksDispatcher.LIZIZ.add(new C19CZ(abstractC813200VvC, z));
    }

    public final void LLF(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == arrayList2.size()) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!((C19EH) ListProtector.get(arrayList, i)).LJIIZILJ) {
                    if (i2 != i) {
                        LJJJJJL(i2, i, arrayList, arrayList2);
                    }
                    i2 = i + 1;
                    if (((Boolean) ListProtector.get(arrayList2, i)).booleanValue()) {
                        while (i2 < size && ((Boolean) ListProtector.get(arrayList2, i2)).booleanValue() && !((C19EH) ListProtector.get(arrayList, i2)).LJIIZILJ) {
                            i2++;
                        }
                    }
                    LJJJJJL(i, i2, arrayList, arrayList2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                LJJJJJL(i2, size, arrayList, arrayList2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public void LLIIII(Fragment fragment, boolean z) {
        ViewGroup viewGroupLJJLIIIJJI = LJJLIIIJJI(fragment);
        if (viewGroupLJJLIIIJJI != null && (viewGroupLJJLIIIJJI instanceof C20247014Ke)) {
            ((C20247014Ke) viewGroupLJJLIIIJJI).setDrawDisappearingViewsLast(!z);
        }
    }

    public final void LLIIIILZ(Bundle bundle, String str) {
        C21505819Ei c21505819Ei = this.mResultListeners.get(str);
        if (c21505819Ei != null) {
            if (c21505819Ei.LIZ.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
                c21505819Ei.LIZ(bundle, str);
                return;
            }
        }
        this.mResults.put(str, bundle);
    }

    public void LLIIIL(Fragment fragment, Lifecycle.State state) {
        if (fragment.equals(LJJJJLI(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(fragment);
        sbLIZ.append(" is not an active fragment of FragmentManager ");
        sbLIZ.append(this);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(FragmentManager fragmentManager, int i, boolean z) {
        String name;
        try {
            fragmentManager.LJLJLJ(i, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                Activity activityLJFF = C2214201BlK.LJFF();
                if (activityLJFF == null) {
                    name = "";
                } else {
                    name = activityLJFF.getClass().getName();
                }
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("always", Boolean.valueOf(z));
                c2241008qG.LIZ.put("newState", Integer.valueOf(i));
                c2241008qG.LIZ.put("currentActivity", name);
                c2241008qG.LIZ.put("errorMsg", Log.getStackTraceString(e));
                JSONObject jSONObjectLJ = c2241008qG.LJ();
                C2241008qG c2241008qG2 = new C2241008qG();
                c2241008qG2.LIZ.put("errorDesc", jSONObjectLJ.toString());
                c2241008qG2.LIZ.put("always", Boolean.valueOf(z));
                C794420VEi.LIZIZ("fragment_crash_log", "", c2241008qG2.LJ());
                System.err.println("always ---> " + z);
                System.err.println("fragment_crash_log ---> " + jSONObjectLJ);
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJIIIIZZ(AnonymousClass1996 anonymousClass1996, C19F6 c19f6, final Fragment fragment) {
        String strLIZIZ;
        Object objLJII = anonymousClass1996.LJII();
        if ((objLJII instanceof C199Y) && ((C199Y) objLJII).shieldActivityController) {
            this.mHost = anonymousClass1996;
            this.mContainer = c19f6;
            this.parent = fragment;
            FragmentManagerViewModel fragmentManagerViewModel = new FragmentManagerViewModel(false);
            this.mFragmentStore.LIZLLL = fragmentManagerViewModel;
            this.mNonConfig = fragmentManagerViewModel;
            return;
        }
        if (this.mHost == null) {
            this.mHost = anonymousClass1996;
            this.mContainer = c19f6;
            this.mParent = fragment;
            if (fragment != null) {
                LJ(new InterfaceC1840220xzI() { // from class: X.19En
                    @Override // X.InterfaceC1840220xzI
                    public final void LIZ(Fragment fragment2) {
                        fragment.onAttachFragment(fragment2);
                    }
                });
            } else if (anonymousClass1996 instanceof InterfaceC1840220xzI) {
                LJ((InterfaceC1840220xzI) anonymousClass1996);
            }
            if (this.mParent != null) {
                LLIIZ();
            }
            if (anonymousClass1996 instanceof InterfaceC1671500tbA) {
                InterfaceC1671500tbA interfaceC1671500tbA = (InterfaceC1671500tbA) anonymousClass1996;
                OnBackPressedDispatcher onBackPressedDispatcher = interfaceC1671500tbA.getOnBackPressedDispatcher();
                this.mOnBackPressedDispatcher = onBackPressedDispatcher;
                LifecycleOwner lifecycleOwner = interfaceC1671500tbA;
                if (fragment != null) {
                    lifecycleOwner = fragment;
                }
                onBackPressedDispatcher.LIZ(lifecycleOwner, this.mOnBackPressedCallback);
            }
            if (fragment != null) {
                FragmentManagerViewModel fragmentManagerViewModel2 = fragment.mFragmentManager.mNonConfig;
                FragmentManagerViewModel fragmentManagerViewModel3 = fragmentManagerViewModel2.LLILLJJLI.get(fragment.mWho);
                if (fragmentManagerViewModel3 == null) {
                    fragmentManagerViewModel3 = new FragmentManagerViewModel(fragmentManagerViewModel2.LLILZ);
                    fragmentManagerViewModel2.LLILLJJLI.put(fragment.mWho, fragmentManagerViewModel3);
                }
                this.mNonConfig = fragmentManagerViewModel3;
            } else if (anonymousClass1996 instanceof ViewModelStoreOwner) {
                this.mNonConfig = (FragmentManagerViewModel) new ViewModelProvider(((ViewModelStoreOwner) anonymousClass1996).getViewModelStore(), FragmentManagerViewModel.LLIZ).get(FragmentManagerViewModel.class);
            } else {
                this.mNonConfig = new FragmentManagerViewModel(false);
            }
            this.mNonConfig.LLILZLL = LJLJJI();
            this.mFragmentStore.LIZLLL = this.mNonConfig;
            Object obj = this.mHost;
            if ((obj instanceof C128Y) && fragment == null) {
                C197066128i savedStateRegistry = ((C128Y) obj).getSavedStateRegistry();
                savedStateRegistry.LIZJ("android:support:fragments", new InterfaceC197061128d() { // from class: X.19F3
                    @Override // X.InterfaceC197061128d
                    public final Bundle saveState() {
                        return this.LIZ.LLI();
                    }
                });
                Bundle bundleLIZ = savedStateRegistry.LIZ("android:support:fragments");
                if (bundleLIZ != null) {
                    LLFII(bundleLIZ);
                }
            }
            Object obj2 = this.mHost;
            if (obj2 instanceof InterfaceC1670800ta2) {
                C19FF activityResultRegistry = ((InterfaceC1670800ta2) obj2).getActivityResultRegistry();
                if (fragment != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(fragment.mWho);
                    sbLIZ.append(":");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLIZIZ = "";
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("FragmentManager:");
                sbLIZ2.append(strLIZIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ2);
                sbLIZ3.append("StartActivityForResult");
                this.mStartActivityForResult = activityResultRegistry.LIZLLL(C2188811AlT.LIZIZ(sbLIZ3), new C21505619Eg(), new C168Q<ActivityResult>() { // from class: X.19ES
                    @Override // X.C168Q
                    public final void LIZ(ActivityResult activityResult) {
                        ActivityResult activityResult2 = activityResult;
                        FragmentManager.LaunchedFragmentInfo launchedFragmentInfoPollLast = this.LIZ.mLaunchedFragments.pollLast();
                        if (launchedFragmentInfoPollLast != null) {
                            String str = launchedFragmentInfoPollLast.LL;
                            int i = launchedFragmentInfoPollLast.LLILLJJLI;
                            Fragment fragmentLIZJ = this.LIZ.mFragmentStore.LIZJ(str);
                            if (fragmentLIZJ != null) {
                                fragmentLIZJ.onActivityResult(i, activityResult2.resultCode, activityResult2.data);
                            }
                        }
                    }
                });
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ2);
                sbLIZ4.append("StartIntentSenderForResult");
                this.mStartIntentSenderForResult = activityResultRegistry.LIZLLL(C2188811AlT.LIZIZ(sbLIZ4), new AnonymousClass1433<IntentSenderRequest, ActivityResult>() { // from class: X.19EQ
                    @Override // X.AnonymousClass1433
                    public final Intent LIZ(ComponentActivity componentActivity, Object obj3) {
                        Bundle bundleG3;
                        IntentSenderRequest intentSenderRequestLIZ = (IntentSenderRequest) obj3;
                        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                        Intent intent2 = intentSenderRequestLIZ.fillInIntent;
                        if (intent2 != null && (bundleG3 = C786410Ut5.g3(intent2, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleG3);
                            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                                C1719660uqq c1719660uqq = new C1719660uqq(intentSenderRequestLIZ.intentSender);
                                c1719660uqq.LIZIZ = null;
                                int i = intentSenderRequestLIZ.flagsValues;
                                int i2 = intentSenderRequestLIZ.flagsMask;
                                c1719660uqq.LIZLLL = i;
                                c1719660uqq.LIZJ = i2;
                                intentSenderRequestLIZ = c1719660uqq.LIZ();
                            }
                        }
                        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequestLIZ);
                        return intent;
                    }

                    @Override // X.AnonymousClass1433
                    public final ActivityResult LIZJ(int i, Intent intent) {
                        return new ActivityResult(i, intent);
                    }
                }, new C168Q<ActivityResult>() { // from class: X.19ET
                    @Override // X.C168Q
                    public final void LIZ(ActivityResult activityResult) {
                        ActivityResult activityResult2 = activityResult;
                        FragmentManager.LaunchedFragmentInfo launchedFragmentInfoPollFirst = this.LIZ.mLaunchedFragments.pollFirst();
                        if (launchedFragmentInfoPollFirst != null) {
                            String str = launchedFragmentInfoPollFirst.LL;
                            int i = launchedFragmentInfoPollFirst.LLILLJJLI;
                            Fragment fragmentLIZJ = this.LIZ.mFragmentStore.LIZJ(str);
                            if (fragmentLIZJ != null) {
                                fragmentLIZJ.onActivityResult(i, activityResult2.resultCode, activityResult2.data);
                            }
                        }
                    }
                });
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ2);
                sbLIZ5.append("RequestPermissions");
                this.mRequestPermissions = activityResultRegistry.LIZLLL(C2188811AlT.LIZIZ(sbLIZ5), new AnonymousClass1433<String[], Map<String, Boolean>>() { // from class: X.142z
                    public static final /* synthetic */ int LIZ = 0;

                    @Override // X.AnonymousClass1433
                    public final Intent LIZ(ComponentActivity componentActivity, Object obj3) {
                        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj3);
                    }

                    @Override // X.AnonymousClass1433
                    public final AnonymousClass1431 LIZIZ(ComponentActivity componentActivity, Object obj3) {
                        String[] strArr = (String[]) obj3;
                        if (strArr.length == 0) {
                            return new AnonymousClass1431(C2097608Jq.LJ());
                        }
                        for (String str : strArr) {
                            if (C838410Wul.LIZ(componentActivity, str) != 0) {
                                return null;
                            }
                        }
                        int iLIZIZ = C2097908Jt.LIZIZ(strArr.length);
                        if (iLIZIZ < 16) {
                            iLIZIZ = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                        for (String str2 : strArr) {
                            Pair pair = new Pair(str2, Boolean.TRUE);
                            linkedHashMap.put(pair.getFirst(), pair.getSecond());
                        }
                        return new AnonymousClass1431(linkedHashMap);
                    }

                    @Override // X.AnonymousClass1433
                    public final Map<String, Boolean> LIZJ(int i, Intent intent) {
                        boolean z;
                        if (i != -1) {
                            return C2097608Jq.LJ();
                        }
                        if (intent == null) {
                            return C2097608Jq.LJ();
                        }
                        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                        if (intArrayExtra != null && stringArrayExtra != null) {
                            ArrayList arrayList = new ArrayList(intArrayExtra.length);
                            for (int i2 : intArrayExtra) {
                                if (i2 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                arrayList.add(Boolean.valueOf(z));
                            }
                            return C2097608Jq.LJIILLIIL(C13LP.LLIILII(C13LQ.LJIJI(stringArrayExtra), arrayList));
                        }
                        return C2097608Jq.LJ();
                    }
                }, new C168Q<Map<String, Boolean>>() { // from class: X.19EN
                    @Override // X.C168Q
                    public final void LIZ(Map<String, Boolean> map) {
                        int i;
                        Map<String, Boolean> map2 = map;
                        String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
                        ArrayList arrayList = new ArrayList(map2.values());
                        int[] iArr = new int[arrayList.size()];
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            if (((Boolean) ListProtector.get(arrayList, i2)).booleanValue()) {
                                i = 0;
                            } else {
                                i = -1;
                            }
                            iArr[i2] = i;
                        }
                        FragmentManager.LaunchedFragmentInfo launchedFragmentInfoPollFirst = this.LIZ.mLaunchedFragments.pollFirst();
                        if (launchedFragmentInfoPollFirst != null) {
                            String str = launchedFragmentInfoPollFirst.LL;
                            int i3 = launchedFragmentInfoPollFirst.LLILLJJLI;
                            Fragment fragmentLIZJ = this.LIZ.mFragmentStore.LIZJ(str);
                            if (fragmentLIZJ != null) {
                                fragmentLIZJ.onRequestPermissionsResult(i3, strArr, iArr);
                            }
                        }
                    }
                });
            }
            Object obj3 = this.mHost;
            if (obj3 instanceof InterfaceC19739612La) {
                ((InterfaceC19739612La) obj3).addOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
            }
            Object obj4 = this.mHost;
            if (obj4 instanceof InterfaceC21507519Ez) {
                ((InterfaceC21507519Ez) obj4).addOnTrimMemoryListener(this.mOnTrimMemoryListener);
            }
            Object obj5 = this.mHost;
            if (obj5 instanceof InterfaceC21507319Ex) {
                ((InterfaceC21507319Ex) obj5).addOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
            }
            Object obj6 = this.mHost;
            if (obj6 instanceof InterfaceC21507419Ey) {
                ((InterfaceC21507419Ey) obj6).addOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
            }
            Object obj7 = this.mHost;
            if (!(obj7 instanceof C19F8) || fragment != null) {
                return;
            }
            ((C19F8) obj7).addMenuProvider(this.mMenuProvider);
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final Set<AbstractC21468118zv> LJIILJJIL(ArrayList<a> arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator<C19EW> it2 = ((C19EH) ListProtector.get(arrayList, i)).LIZJ.iterator();
            while (it2.hasNext()) {
                Fragment fragment = it2.next().LIZIZ;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(AbstractC21468118zv.LJIIIIZZ(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public void LJLJJL(Fragment fragment, String[] strArr, int i) {
        if (this.mRequestPermissions != null) {
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            this.mRequestPermissions.LIZ(strArr);
            return;
        }
        this.mHost.LJIIIZ(fragment, strArr, i);
    }

    public final boolean LJLLLLLL(int i, int i2, String str) {
        LJJJJIZL(false);
        LJJJJI(true);
        Fragment fragment = this.mPrimaryNav;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().LJLLL()) {
            return true;
        }
        boolean zLJZ = LJZ(this.mTmpRecords, this.mTmpIsPop, str, i, i2);
        if (zLJZ) {
            this.mExecutingActions = true;
            try {
                LLF(this.mTmpRecords, this.mTmpIsPop);
                LJIIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIL();
                throw th;
            }
        }
        LLIIZ();
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            LLIIL();
        }
        this.mFragmentStore.LIZIZ.values().removeAll(Collections.singleton(null));
        return zLJZ;
    }

    public void LJZI(Bundle bundle, Fragment fragment, String str) {
        if (fragment.mFragmentManager == this) {
            C786410Ut5.LJJJI(str, fragment.mWho, bundle);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Fragment ");
        sbLIZ.append(fragment);
        sbLIZ.append(" is not currently in the FragmentManager");
        LLIILII(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
        throw null;
    }

    public final void LLIIIJ(final String str, LifecycleOwner lifecycleOwner, final C0TSA c0tsa) {
        final Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Bundle bundle;
                if (event == Lifecycle.Event.ON_START && (bundle = FragmentManager.this.mResults.get(str)) != null) {
                    c0tsa.LIZ(bundle, str);
                    FragmentManager.this.mResults.remove(str);
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    lifecycle.removeObserver(this);
                    FragmentManager.this.mResultListeners.remove(str);
                }
            }
        };
        C21505819Ei c21505819EiPut = this.mResultListeners.put(str, new C21505819Ei(lifecycle, c0tsa, lifecycleEventObserver));
        if (c21505819EiPut != null) {
            c21505819EiPut.LIZ.removeObserver(c21505819EiPut.LIZJ);
        }
        lifecycle.addObserver(lifecycleEventObserver);
    }

    public void LJJJI(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("    ");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C19EE c19ee = this.mFragmentStore;
        c19ee.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("    ");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        if (!c19ee.LIZIZ.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C19EC c19ec : c19ee.LIZIZ.values()) {
                printWriter.print(str);
                if (c19ec != null) {
                    Fragment fragment = c19ec.LIZJ;
                    printWriter.println(fragment);
                    fragment.dump(strLIZIZ2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = c19ee.LIZ.size();
        int i = 0;
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            int i2 = 0;
            do {
                Fragment fragment2 = (Fragment) ListProtector.get(c19ee.LIZ, i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
                i2++;
            } while (i2 < size2);
        }
        ArrayList<Fragment> arrayList = this.mCreatedMenus;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            int i3 = 0;
            do {
                Fragment fragment3 = (Fragment) ListProtector.get(this.mCreatedMenus, i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
                i3++;
            } while (i3 < size);
        }
        int size3 = this.mBackStack.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            int i4 = 0;
            do {
                a aVar = (a) ListProtector.get(this.mBackStack, i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.LJJIIJZLJL(strLIZIZ, printWriter, true);
                i4++;
            } while (i4 < size3);
        }
        printWriter.print(str);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Back Stack Index: ");
        sbLIZ3.append(this.mBackStackIndex.get());
        printWriter.println(C2188811AlT.LIZIZ(sbLIZ3));
        synchronized (this.mPendingActions) {
            try {
                int size4 = this.mPendingActions.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    do {
                        Object obj = (InterfaceC21506619Eq) this.mPendingActions.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(obj);
                        i++;
                    } while (i < size4);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.mHost);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.mContainer);
        if (this.mParent != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.mParent);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.mCurState);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.mStateSaved);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.mNeedMenuInvalidate);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x029c A[PHI: r3
      0x029c: PHI (r3v15 int) = (r3v13 int), (r3v16 int) binds: [B:88:0x01cf, B:93:0x01db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJJL(int r20, int r21, java.util.ArrayList r22, java.util.ArrayList r23) {
        /*
            Method dump skipped, instruction units count: 1286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.LJJJJJL(int, int, java.util.ArrayList, java.util.ArrayList):void");
    }

    public void LJLJJLL(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (this.mStartActivityForResult != null) {
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            this.mStartActivityForResult.LIZ(intent);
            return;
        }
        this.mHost.LJIIJJI(fragment, intent, i, bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020 A[LOOP:0: B:12:0x001e->B:13:0x0020, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJZ(java.util.ArrayList<androidx.fragment.app.a> r7, java.util.ArrayList<java.lang.Boolean> r8, java.lang.String r9, int r10, int r11) {
        /*
            r6 = this;
            r5 = 1
            r0 = r11 & 1
            r4 = 0
            if (r0 == 0) goto L8e
            r2 = 1
        L7:
            java.util.ArrayList<androidx.fragment.app.a> r0 = r6.mBackStack
            boolean r0 = r0.isEmpty()
            r3 = -1
            if (r0 != 0) goto L92
            if (r9 != 0) goto L31
            if (r10 >= 0) goto L31
            if (r2 == 0) goto L84
            r3 = 0
        L17:
            java.util.ArrayList<androidx.fragment.app.a> r0 = r6.mBackStack
            int r1 = r0.size()
            int r1 = r1 - r5
        L1e:
            if (r1 < r3) goto L91
            java.util.ArrayList<androidx.fragment.app.a> r0 = r6.mBackStack
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.remove(r0, r1)
            r7.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.add(r0)
            int r1 = r1 + (-1)
            goto L1e
        L31:
            java.util.ArrayList<androidx.fragment.app.a> r0 = r6.mBackStack
            int r0 = r0.size()
            int r3 = r0 + (-1)
        L39:
            if (r3 < 0) goto L92
            java.util.ArrayList<androidx.fragment.app.a> r0 = r6.mBackStack
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
            if (r9 == 0) goto L5c
            java.lang.String r0 = r1.LJIIJ
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L5c
        L4d:
            if (r2 != 0) goto L66
            java.util.ArrayList<androidx.fragment.app.a> r0 = r6.mBackStack
            int r0 = r0.size()
            int r0 = r0 + (-1)
            if (r3 == r0) goto L92
            int r3 = r3 + 1
            goto L8b
        L5c:
            if (r10 < 0) goto L63
            int r0 = r1.LJIJJLI
            if (r10 != r0) goto L63
            goto L4d
        L63:
            int r3 = r3 + (-1)
            goto L39
        L66:
            if (r3 <= 0) goto L8b
            java.util.ArrayList<androidx.fragment.app.a> r0 = r6.mBackStack
            int r2 = r3 + (-1)
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
            if (r9 == 0) goto L7c
            java.lang.String r0 = r1.LJIIJ
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L82
        L7c:
            if (r10 < 0) goto L8b
            int r0 = r1.LJIJJLI
            if (r10 != r0) goto L8b
        L82:
            r3 = r2
            goto L66
        L84:
            java.util.ArrayList<androidx.fragment.app.a> r0 = r6.mBackStack
            int r0 = r0.size()
            int r3 = r3 + r0
        L8b:
            if (r3 >= 0) goto L17
            return r4
        L8e:
            r2 = 0
            goto L7
        L91:
            return r5
        L92:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.LJZ(java.util.ArrayList, java.util.ArrayList, java.lang.String, int, int):boolean");
    }

    public void LJLJL(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2 = intent;
        boolean z = true;
        if (this.mStartIntentSenderForResult != null) {
            if (bundle != null) {
                if (intent2 == null) {
                    intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                }
                intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            C1719660uqq c1719660uqq = new C1719660uqq(intentSender);
            c1719660uqq.LIZIZ = intent2;
            c1719660uqq.LIZLLL = i3;
            c1719660uqq.LIZJ = i2;
            IntentSenderRequest intentSenderRequestLIZ = c1719660uqq.LIZ();
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(fragment.mWho, i));
            this.mStartIntentSenderForResult.LIZ(intentSenderRequestLIZ);
            return;
        }
        AnonymousClass1996<?> anonymousClass1996 = this.mHost;
        anonymousClass1996.getClass();
        if (i != -1) {
            z = false;
        }
        if (z) {
            Activity activity = anonymousClass1996.LL;
            if (activity != null) {
                activity.startIntentSenderForResult(intentSender, i, intent2, i2, i3, i4, bundle);
                return;
            } else {
                "Starting intent sender with a requestCode requires a FragmentActivity host".toString();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
        }
        "Starting intent sender with a requestCode requires a FragmentActivity host".toString();
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }
}
