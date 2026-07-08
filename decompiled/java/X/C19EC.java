package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManagerViewModel;
import androidx.fragment.app.FragmentState;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19EC, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19EC {
    public final C19CY LIZ;
    public final C19EE LIZIZ;
    public final Fragment LIZJ;
    public boolean LIZLLL;
    public int LJ = -1;

    public final void LIZ() {
        int iIndexOfChild;
        View view;
        View view2;
        final Fragment fragmentLJJJLZIJ = FragmentManager.LJJJLZIJ(this.LIZJ.mContainer);
        Fragment parentFragment = this.LIZJ.getParentFragment();
        if (fragmentLJJJLZIJ != null && !fragmentLJJJLZIJ.equals(parentFragment)) {
            final Fragment fragment = this.LIZJ;
            final int i = fragment.mContainerId;
            C1278104zL c1278104zL = C19EM.LIZ;
            AbstractC1889400zGc abstractC1889400zGc = new AbstractC1889400zGc(fragment, fragmentLJJJLZIJ, i) { // from class: X.0yiK
                public final Fragment LLILLJJLI;
                public final int LLILLL;

                public final int getContainerId() {
                    return this.LLILLL;
                }

                public final Fragment getExpectedParentFragment() {
                    return this.LLILLJJLI;
                }

                /* JADX WARN: Illegal instructions before constructor call */
                {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Attempting to nest fragment ");
                    sbLIZ.append(fragment);
                    sbLIZ.append(" within the view of parent fragment ");
                    sbLIZ.append(fragmentLJJJLZIJ);
                    sbLIZ.append(" via container with ID ");
                    sbLIZ.append(i);
                    sbLIZ.append(" without using parent's childFragmentManager");
                    super(fragment, C2188811AlT.LIZIZ(sbLIZ));
                    this.LLILLJJLI = fragmentLJJJLZIJ;
                    this.LLILLL = i;
                }
            };
            C1278104zL c1278104zLLIZ = C19EM.LIZ(fragment);
            if (c1278104zLLIZ.LIZ.contains(C19EX.DETECT_WRONG_NESTED_HIERARCHY) && C19EM.LIZLLL(c1278104zLLIZ, fragment.getClass(), C1868140yiK.class)) {
                C19EM.LIZIZ(c1278104zLLIZ, abstractC1889400zGc);
            }
        }
        C19EE c19ee = this.LIZIZ;
        Fragment fragment2 = this.LIZJ;
        c19ee.getClass();
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup != null) {
            int iIndexOf = c19ee.LIZ.indexOf(fragment2);
            int i2 = iIndexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= c19ee.LIZ.size()) {
                            break;
                        }
                        Fragment fragment3 = (Fragment) ListProtector.get(c19ee.LIZ, iIndexOf);
                        if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment4 = (Fragment) ListProtector.get(c19ee.LIZ, i2);
                    if (fragment4.mContainer == viewGroup && (view2 = fragment4.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
            iIndexOfChild = -1;
        } else {
            iIndexOfChild = -1;
        }
        Fragment fragment5 = this.LIZJ;
        fragment5.mContainer.addView(fragment5.mView, iIndexOfChild);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|2|(2:4|(1:6)(2:7|8))(4:9|(2:11|(2:13|14))|18|19)|20|15|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0081, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C1AF0.LJ(new java.lang.RuntimeException("FragmentStateManager moveToExpectedState exception ---> "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r7 = this;
            androidx.fragment.app.Fragment r0 = r7.LIZJ
            androidx.fragment.app.Fragment r1 = r0.mTarget
            java.lang.String r3 = " that does not belong to this FragmentManager!"
            java.lang.String r4 = " declared target fragment "
            java.lang.String r6 = "Fragment "
            r5 = 0
            if (r1 == 0) goto L49
            X.19EE r0 = r7.LIZIZ
            java.lang.String r1 = r1.mWho
            java.util.HashMap<java.lang.String, X.19EC> r0 = r0.LIZIZ
            java.lang.Object r0 = r0.get(r1)
            X.19EC r0 = (X.C19EC) r0
            if (r0 == 0) goto L26
            androidx.fragment.app.Fragment r2 = r7.LIZJ
            androidx.fragment.app.Fragment r1 = r2.mTarget
            java.lang.String r1 = r1.mWho
            r2.mTargetWho = r1
            r2.mTarget = r5
            goto L7c
        L26:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r6)
            androidx.fragment.app.Fragment r0 = r7.LIZJ
            r1.append(r0)
            r1.append(r4)
            androidx.fragment.app.Fragment r0 = r7.LIZJ
            androidx.fragment.app.Fragment r0 = r0.mTarget
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L49:
            java.lang.String r1 = r0.mTargetWho
            if (r1 == 0) goto L8e
            X.19EE r0 = r7.LIZIZ
            java.util.HashMap<java.lang.String, X.19EC> r0 = r0.LIZIZ
            java.lang.Object r0 = r0.get(r1)
            X.19EC r0 = (X.C19EC) r0
            if (r0 != 0) goto L7c
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r6)
            androidx.fragment.app.Fragment r0 = r7.LIZJ
            r1.append(r0)
            r1.append(r4)
            androidx.fragment.app.Fragment r0 = r7.LIZJ
            java.lang.String r0 = r0.mTargetWho
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L7c:
            r0.LJIIIZ()     // Catch: java.lang.Exception -> L80
            goto L8e
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "FragmentStateManager moveToExpectedState exception ---> "
            r1.<init>(r0)
            X.C1AF0.LJ(r1)
        L8e:
            androidx.fragment.app.Fragment r1 = r7.LIZJ
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            X.1996 r0 = r0.LJJLIIIJLJLI()
            r1.mHost = r0
            androidx.fragment.app.Fragment r1 = r7.LIZJ
            androidx.fragment.app.FragmentManager r0 = r1.mFragmentManager
            androidx.fragment.app.Fragment r0 = r0.LJJLIL()
            r1.mParentFragment = r0
            X.19CY r1 = r7.LIZ
            androidx.fragment.app.Fragment r0 = r7.LIZJ
            r2 = 0
            r1.LJI(r0, r2)
            androidx.fragment.app.Fragment r0 = r7.LIZJ
            r0.performAttach()
            X.19CY r1 = r7.LIZ
            androidx.fragment.app.Fragment r0 = r7.LIZJ
            r1.LIZIZ(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19EC.LIZIZ():void");
    }

    public final int LIZJ() {
        int i;
        Fragment fragment = this.LIZJ;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.LJ;
        int i2 = C19467211Eg.LIZ[fragment.mMaxState.ordinal()];
        if (i2 != 1) {
            iMin = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment2 = this.LIZJ;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.LJ, 2);
                View view = this.LIZJ.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.LJ < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        Fragment fragment3 = this.LIZJ;
        if (fragment3.mInDynamicContainer && fragment3.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.LIZJ.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment4 = this.LIZJ;
        ViewGroup viewGroup = fragment4.mContainer;
        if (viewGroup != null) {
            AbstractC21468118zv abstractC21468118zvLJIIIIZZ = AbstractC21468118zv.LJIIIIZZ(viewGroup, fragment4.getParentFragmentManager());
            abstractC21468118zvLJIIIIZZ.getClass();
            Fragment fragment5 = this.LIZJ;
            C21468018zu c21468018zuLJFF = abstractC21468118zvLJIIIIZZ.LJFF(fragment5);
            EnumC21468418zy enumC21468418zy = c21468018zuLJFF != null ? c21468018zuLJFF.LIZIZ : null;
            C21468018zu c21468018zuLJI = abstractC21468118zvLJIIIIZZ.LJI(fragment5);
            enumC21468418zy = c21468018zuLJI != null ? c21468018zuLJI.LIZIZ : null;
            if (enumC21468418zy != null && (i = C21468518zz.LIZ[enumC21468418zy.ordinal()]) != -1 && i != 1) {
                enumC21468418zy = enumC21468418zy;
            }
        }
        if (enumC21468418zy == EnumC21468418zy.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (enumC21468418zy == EnumC21468418zy.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment6 = this.LIZJ;
            if (fragment6.mRemoving) {
                iMin = fragment6.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment7 = this.LIZJ;
        if (fragment7.mDeferStart && fragment7.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        return this.LIZJ.mTransitioning ? Math.max(iMin, 3) : iMin;
    }

    public final void LIZLLL() {
        Bundle bundle = this.LIZJ.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        Fragment fragment = this.LIZJ;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.LIZ.LJII(fragment, bundle2, false);
            this.LIZJ.performCreate(bundle2);
            this.LIZ.LIZJ(this.LIZJ, bundle2, false);
        }
    }

    public final void LJ() {
        String resourceName;
        Fragment fragment = this.LIZJ;
        if (fragment.mFromLayout) {
            return;
        }
        Bundle bundle = fragment.mSavedFragmentState;
        final ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.LIZJ.performGetLayoutInflater(bundle2);
        Fragment fragment2 = this.LIZJ;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment2.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cannot create fragment ");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(" for a container view with no id");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.LJJLIIIJ().LIZIZ(this.LIZJ.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.LIZJ;
                    if (!fragment3.mRestored && !fragment3.mInDynamicContainer) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.LIZJ.mContainerId);
                        } catch (Resources.NotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.LIZJ.mContainerId) + " (" + resourceName + ") for fragment " + this.LIZJ);
                    }
                } else if (!(viewGroup instanceof C20247014Ke)) {
                    final Fragment fragment4 = this.LIZJ;
                    C1278104zL c1278104zL = C19EM.LIZ;
                    AbstractC1889400zGc abstractC1889400zGc = new AbstractC1889400zGc(fragment4, viewGroup) { // from class: X.0yiS
                        public final ViewGroup LLILLJJLI;

                        public final ViewGroup getContainer() {
                            return this.LLILLJJLI;
                        }

                        /* JADX WARN: Illegal instructions before constructor call */
                        {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Attempting to add fragment ");
                            sbLIZ2.append(fragment4);
                            sbLIZ2.append(" to container ");
                            sbLIZ2.append(viewGroup);
                            sbLIZ2.append(" which is not a FragmentContainerView");
                            super(fragment4, C2188811AlT.LIZIZ(sbLIZ2));
                            this.LLILLJJLI = viewGroup;
                        }
                    };
                    C1278104zL c1278104zLLIZ = C19EM.LIZ(fragment4);
                    if (c1278104zLLIZ.LIZ.contains(C19EX.DETECT_WRONG_FRAGMENT_CONTAINER) && C19EM.LIZLLL(c1278104zLLIZ, fragment4.getClass(), C1868220yiS.class)) {
                        C19EM.LIZIZ(c1278104zLLIZ, abstractC1889400zGc);
                    }
                }
            }
        }
        Fragment fragment5 = this.LIZJ;
        fragment5.mContainer = viewGroup;
        fragment5.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        View view = this.LIZJ.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment6 = this.LIZJ;
            fragment6.mView.setTag(R.id.ij1, fragment6);
            if (viewGroup != null) {
                LIZ();
            }
            Fragment fragment7 = this.LIZJ;
            if (fragment7.mHidden) {
                C786410Ut5.LJLLLLLL(8, fragment7.mView);
            }
            if (this.LIZJ.mView.isAttachedToWindow()) {
                C20097313kJ.LIZJ(this.LIZJ.mView);
            } else {
                final View view2 = this.LIZJ.mView;
                view2.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.19Er
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view3) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view3) {
                        view2.removeOnAttachStateChangeListener(this);
                        C20097313kJ.LIZJ(view2);
                    }
                });
            }
            this.LIZJ.performViewCreated();
            C19CY c19cy = this.LIZ;
            Fragment fragment8 = this.LIZJ;
            c19cy.LJIIL(fragment8, fragment8.mView, bundle2, false);
            int visibility = this.LIZJ.mView.getVisibility();
            this.LIZJ.setPostOnViewCreatedAlpha(this.LIZJ.mView.getAlpha());
            Fragment fragment9 = this.LIZJ;
            if (fragment9.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment9.mView.findFocus();
                if (viewFindFocus != null) {
                    this.LIZJ.setFocusedView(viewFindFocus);
                }
                C786410Ut5.T4(this.LIZJ.mView, 0.0f);
            }
        }
        this.LIZJ.mState = 2;
    }

    public final void LJFF() {
        Fragment fragmentLIZIZ;
        Fragment fragment = this.LIZJ;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        if (z) {
            Fragment fragment2 = this.LIZJ;
            if (!fragment2.mBeingSaved) {
                this.LIZIZ.LJIIIIZZ(null, fragment2.mWho);
            }
        } else {
            FragmentManagerViewModel fragmentManagerViewModel = this.LIZIZ.LIZLLL;
            if (fragmentManagerViewModel.LL.containsKey(this.LIZJ.mWho) && fragmentManagerViewModel.LLILZ && !fragmentManagerViewModel.LLILZIL) {
                String str = this.LIZJ.mTargetWho;
                if (str != null && (fragmentLIZIZ = this.LIZIZ.LIZIZ(str)) != null && fragmentLIZIZ.mRetainInstance) {
                    this.LIZJ.mTarget = fragmentLIZIZ;
                }
                this.LIZJ.mState = 0;
                return;
            }
        }
        AnonymousClass1996<?> anonymousClass1996 = this.LIZJ.mHost;
        if (anonymousClass1996 instanceof ViewModelStoreOwner) {
            zIsChangingConfigurations = this.LIZIZ.LIZLLL.LLILZIL;
        } else {
            Context context = anonymousClass1996.LLILLJJLI;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z && !this.LIZJ.mBeingSaved) || zIsChangingConfigurations) {
            FragmentManagerViewModel fragmentManagerViewModel2 = this.LIZIZ.LIZLLL;
            Fragment fragment3 = this.LIZJ;
            fragmentManagerViewModel2.getClass();
            fragmentManagerViewModel2.vQ2(fragment3.mWho, false);
        }
        this.LIZJ.performDestroy();
        this.LIZ.LIZLLL(this.LIZJ, false);
        for (C19EC c19ec : (ArrayList) this.LIZIZ.LIZLLL()) {
            if (c19ec != null) {
                Fragment fragment4 = c19ec.LIZJ;
                if (this.LIZJ.mWho.equals(fragment4.mTargetWho)) {
                    fragment4.mTarget = this.LIZJ;
                    fragment4.mTargetWho = null;
                }
            }
        }
        Fragment fragment5 = this.LIZJ;
        String str2 = fragment5.mTargetWho;
        if (str2 != null) {
            fragment5.mTarget = this.LIZIZ.LIZIZ(str2);
        }
        this.LIZIZ.LJII(this);
    }

    public final void LJI() {
        View view;
        Fragment fragment = this.LIZJ;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            C786410Ut5.LJJJLZIJ(view, viewGroup);
        }
        this.LIZJ.performDestroyView();
        this.LIZ.LJIILIIL(this.LIZJ, false);
        Fragment fragment2 = this.LIZJ;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.LIZJ.mInLayout = false;
    }

    public final void LJII() {
        this.LIZJ.performDetach();
        this.LIZ.LJ(this.LIZJ, false);
        Fragment fragment = this.LIZJ;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            FragmentManagerViewModel fragmentManagerViewModel = this.LIZIZ.LIZLLL;
            if (fragmentManagerViewModel.LL.containsKey(this.LIZJ.mWho) && fragmentManagerViewModel.LLILZ && !fragmentManagerViewModel.LLILZIL) {
                return;
            }
        }
        this.LIZJ.initState();
    }

    public final void LJIIIIZZ() {
        Fragment fragment = this.LIZJ;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            Fragment fragment2 = this.LIZJ;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.LIZJ.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.LIZJ;
                fragment3.mView.setTag(R.id.ij1, fragment3);
                Fragment fragment4 = this.LIZJ;
                if (fragment4.mHidden) {
                    C786410Ut5.LJLLLLLL(8, fragment4.mView);
                }
                this.LIZJ.performViewCreated();
                C19CY c19cy = this.LIZ;
                Fragment fragment5 = this.LIZJ;
                c19cy.LJIIL(fragment5, fragment5.mView, bundle2, false);
                this.LIZJ.mState = 2;
            }
        }
    }

    public final void LJIIIZ() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.LIZLLL) {
            return;
        }
        try {
            this.LIZLLL = true;
            boolean z = false;
            while (true) {
                int iLIZJ = LIZJ();
                Fragment fragment = this.LIZJ;
                int i = fragment.mState;
                if (iLIZJ == i) {
                    if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack()) {
                        Fragment fragment2 = this.LIZJ;
                        if (!fragment2.mBeingSaved) {
                            FragmentManagerViewModel fragmentManagerViewModel = this.LIZIZ.LIZLLL;
                            fragmentManagerViewModel.getClass();
                            fragmentManagerViewModel.vQ2(fragment2.mWho, true);
                            this.LIZIZ.LJII(this);
                            this.LIZJ.initState();
                        }
                    }
                    Fragment fragment3 = this.LIZJ;
                    if (fragment3.mHiddenChanged) {
                        if (fragment3.mView != null && (viewGroup = fragment3.mContainer) != null) {
                            AbstractC21468118zv abstractC21468118zvLJIIIIZZ = AbstractC21468118zv.LJIIIIZZ(viewGroup, fragment3.getParentFragmentManager());
                            if (this.LIZJ.mHidden) {
                                abstractC21468118zvLJIIIIZZ.getClass();
                                abstractC21468118zvLJIIIIZZ.LIZLLL(EnumC21467818zs.GONE, EnumC21468418zy.NONE, this);
                            } else {
                                abstractC21468118zvLJIIIIZZ.getClass();
                                abstractC21468118zvLJIIIIZZ.LIZLLL(EnumC21467818zs.VISIBLE, EnumC21468418zy.NONE, this);
                            }
                        }
                        Fragment fragment4 = this.LIZJ;
                        FragmentManager fragmentManager = fragment4.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.LJJZZIII(fragment4);
                        }
                        Fragment fragment5 = this.LIZJ;
                        fragment5.mHiddenChanged = false;
                        fragment5.onHiddenChanged(fragment5.mHidden);
                        this.LIZJ.mChildFragmentManager.LJJIIJ();
                    }
                    this.LIZLLL = false;
                    return;
                }
                if (iLIZJ <= i) {
                    switch (i - 1) {
                        case -1:
                            LJII();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (this.LIZIZ.LIZJ.get(fragment.mWho) == null) {
                                    this.LIZIZ.LJIIIIZZ(LJIIL(), this.LIZJ.mWho);
                                }
                            }
                            LJFF();
                            break;
                        case 1:
                            LJI();
                            this.LIZJ.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (fragment.mBeingSaved) {
                                this.LIZIZ.LJIIIIZZ(LJIIL(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                LJIILIIL();
                            }
                            Fragment fragment6 = this.LIZJ;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                AbstractC21468118zv abstractC21468118zvLJIIIIZZ2 = AbstractC21468118zv.LJIIIIZZ(viewGroup2, fragment6.getParentFragmentManager());
                                abstractC21468118zvLJIIIIZZ2.getClass();
                                abstractC21468118zvLJIIIIZZ2.LIZLLL(EnumC21467818zs.REMOVED, EnumC21468418zy.REMOVING, this);
                            }
                            this.LIZJ.mState = 3;
                            break;
                        case 4:
                            fragment.performStop();
                            this.LIZ.LJIIJJI(this.LIZJ, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            fragment.performPause();
                            this.LIZ.LJFF(this.LIZJ, false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            LIZIZ();
                            break;
                        case 1:
                            LIZLLL();
                            break;
                        case 2:
                            LJIIIIZZ();
                            LJ();
                            break;
                        case 3:
                            Bundle bundle = fragment.mSavedFragmentState;
                            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
                            this.LIZJ.performActivityCreated(bundle2);
                            this.LIZ.LIZ(this.LIZJ, bundle2, false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                AbstractC21468118zv abstractC21468118zvLJIIIIZZ3 = AbstractC21468118zv.LJIIIIZZ(viewGroup3, fragment.getParentFragmentManager());
                                EnumC21467818zs enumC21467818zsFrom = EnumC21467818zs.from(this.LIZJ.mView.getVisibility());
                                abstractC21468118zvLJIIIIZZ3.getClass();
                                abstractC21468118zvLJIIIIZZ3.LIZLLL(enumC21467818zsFrom, EnumC21468418zy.ADDING, this);
                            }
                            this.LIZJ.mState = 4;
                            break;
                        case 5:
                            fragment.performStart();
                            this.LIZ.LJIIJ(this.LIZJ, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            LJIIJJI();
                            break;
                    }
                }
                z = true;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZLLL = false;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI() {
        /*
            r5 = this;
            androidx.fragment.app.Fragment r0 = r5.LIZJ
            android.view.View r4 = r0.getFocusedView()
            r3 = 0
            if (r4 == 0) goto L5f
            androidx.fragment.app.Fragment r0 = r5.LIZJ
            android.view.View r0 = r0.mView
            if (r4 == r0) goto L20
            android.view.ViewParent r1 = r4.getParent()
        L13:
            if (r1 == 0) goto L5f
            androidx.fragment.app.Fragment r0 = r5.LIZJ
            android.view.View r0 = r0.mView
            if (r1 == r0) goto L20
            android.view.ViewParent r1 = r1.getParent()
            goto L13
        L20:
            boolean r2 = r4.requestFocus()
            boolean r0 = androidx.fragment.app.FragmentManager.LJLI()
            if (r0 == 0) goto L5f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "requestFocus: Restoring focused view "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " "
            r1.append(r0)
            if (r2 == 0) goto L83
            java.lang.String r0 = "succeeded"
        L3f:
            r1.append(r0)
            java.lang.String r0 = " on Fragment "
            r1.append(r0)
            androidx.fragment.app.Fragment r0 = r5.LIZJ
            r1.append(r0)
            java.lang.String r0 = " resulting in focused view "
            r1.append(r0)
            androidx.fragment.app.Fragment r0 = r5.LIZJ
            android.view.View r0 = r0.mView
            android.view.View r0 = r0.findFocus()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L5f:
            androidx.fragment.app.Fragment r0 = r5.LIZJ
            r2 = 0
            r0.setFocusedView(r2)
            androidx.fragment.app.Fragment r0 = r5.LIZJ
            r0.performResume()
            X.19CY r1 = r5.LIZ
            androidx.fragment.app.Fragment r0 = r5.LIZJ
            r1.LJIIIIZZ(r0, r3)
            X.19EE r1 = r5.LIZIZ
            androidx.fragment.app.Fragment r0 = r5.LIZJ
            java.lang.String r0 = r0.mWho
            r1.LJIIIIZZ(r2, r0)
            androidx.fragment.app.Fragment r0 = r5.LIZJ
            r0.mSavedFragmentState = r2
            r0.mSavedViewState = r2
            r0.mSavedViewRegistryState = r2
            return
        L83:
            java.lang.String r0 = "failed"
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19EC.LJIIJJI():void");
    }

    public final Bundle LJIIL() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.LIZJ;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        }
        C786410Ut5.LJJIJL(bundle2, "state", new FragmentState(this.LIZJ));
        if (this.LIZJ.mState > 0) {
            Bundle bundle3 = new Bundle();
            this.LIZJ.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                C786410Ut5.LJJIIZI(bundle2, bundle3, "savedInstanceState");
            }
            this.LIZ.LJIIIZ(this.LIZJ, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.LIZJ.mSavedStateRegistryController.LIZIZ(bundle4);
            if (!bundle4.isEmpty()) {
                C786410Ut5.LJJIIZI(bundle2, bundle4, "registryState");
            }
            Bundle bundleLLI = this.LIZJ.mChildFragmentManager.LLI();
            if (!bundleLLI.isEmpty()) {
                C786410Ut5.LJJIIZI(bundle2, bundleLLI, "childFragmentManager");
            }
            if (this.LIZJ.mView != null) {
                LJIILIIL();
            }
            SparseArray<Parcelable> sparseArray = this.LIZJ.mSavedViewState;
            if (sparseArray != null) {
                C786410Ut5.LJJJ(bundle2, "viewState", sparseArray);
            }
            Bundle bundle5 = this.LIZJ.mSavedViewRegistryState;
            if (bundle5 != null) {
                C786410Ut5.LJJIIZI(bundle2, bundle5, "viewRegistryState");
            }
        }
        Bundle bundle6 = this.LIZJ.mArguments;
        if (bundle6 != null) {
            C786410Ut5.LJJIIZI(bundle2, bundle6, "arguments");
        }
        return bundle2;
    }

    public final void LJIILIIL() {
        if (this.LIZJ.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.LIZJ.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.LIZJ.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.LIZJ.mViewLifecycleOwner.LLILZLL.LIZIZ(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.LIZJ.mSavedViewRegistryState = bundle;
    }

    public final void LJIIJ(ClassLoader classLoader) {
        Bundle bundle = this.LIZJ.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.LIZJ.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            C786410Ut5.LJJIIZI(this.LIZJ.mSavedFragmentState, new Bundle(), "savedInstanceState");
        }
        try {
            Fragment fragment = this.LIZJ;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            Fragment fragment2 = this.LIZJ;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) this.LIZJ.mSavedFragmentState.getParcelable("state");
            if (fragmentState != null) {
                Fragment fragment3 = this.LIZJ;
                fragment3.mTargetWho = fragmentState.LLJILJILJ;
                fragment3.mTargetRequestCode = fragmentState.LLJILLL;
                Boolean bool = fragment3.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment3.mUserVisibleHint = bool.booleanValue();
                    this.LIZJ.mSavedUserVisibleHint = null;
                } else {
                    fragment3.mUserVisibleHint = fragmentState.LLJJ;
                }
            }
            Fragment fragment4 = this.LIZJ;
            if (!fragment4.mUserVisibleHint) {
                fragment4.mDeferStart = true;
            }
        } catch (BadParcelableException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to restore view hierarchy state for fragment ");
            sbLIZ.append(this.LIZJ);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public C19EC(C19CY c19cy, C19EE c19ee, Fragment fragment) {
        this.LIZ = c19cy;
        this.LIZIZ = c19ee;
        this.LIZJ = fragment;
    }

    public C19EC(C19CY c19cy, C19EE c19ee, Fragment fragment, Bundle bundle) {
        String str;
        this.LIZ = c19cy;
        this.LIZIZ = c19ee;
        this.LIZJ = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        if (fragment2 != null) {
            str = fragment2.mWho;
        } else {
            str = null;
        }
        fragment.mTargetWho = str;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    public C19EC(C19CY c19cy, C19EE c19ee, ClassLoader classLoader, C20135813qW c20135813qW, Bundle bundle) {
        this.LIZ = c19cy;
        this.LIZIZ = c19ee;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable("state");
        Fragment fragmentLIZ = c20135813qW.LIZ(fragmentState.LL);
        fragmentLIZ.mWho = fragmentState.LLILLJJLI;
        fragmentLIZ.mFromLayout = fragmentState.LLILLL;
        fragmentLIZ.mInDynamicContainer = fragmentState.LLILZ;
        fragmentLIZ.mRestored = true;
        fragmentLIZ.mFragmentId = fragmentState.LLILZIL;
        fragmentLIZ.mContainerId = fragmentState.LLILZLL;
        fragmentLIZ.mTag = fragmentState.LLIZ;
        fragmentLIZ.mRetainInstance = fragmentState.LLIZLLLIL;
        fragmentLIZ.mRemoving = fragmentState.LLJ;
        fragmentLIZ.mDetached = fragmentState.LLJI;
        fragmentLIZ.mHidden = fragmentState.LLJIJIL;
        fragmentLIZ.mMaxState = Lifecycle.State.values()[fragmentState.LLJILJIL];
        fragmentLIZ.mTargetWho = fragmentState.LLJILJILJ;
        fragmentLIZ.mTargetRequestCode = fragmentState.LLJILLL;
        fragmentLIZ.mUserVisibleHint = fragmentState.LLJJ;
        this.LIZJ = fragmentLIZ;
        fragmentLIZ.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentLIZ.setArguments(bundle2);
    }
}
