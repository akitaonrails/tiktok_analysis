package androidx.navigation.fragment;

import X.AbstractC20133313q7;
import X.C098200Yq;
import X.C09R4;
import X.C09RB;
import X.C1308830kAD;
import X.C1685300txQ;
import X.C1845220y7M;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20132813q2;
import X.C20132913q3;
import X.C20134113qF;
import X.C20247014Ke;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.navigation.NavControllerViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public class NavHostFragment extends Fragment {
    public static final String _pnsPageId = "KSsoOyA6LD1iJy4lISItPSY8JmsqOyHELIOS40JSAiPWEdKTMEJjwnDjctLiI2JjE=";
    public C1845220y7M LL;
    public Boolean LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;

    public final C1845220y7M NR() {
        C1845220y7M c1845220y7M = this.LL;
        if (c1845220y7M != null) {
            return c1845220y7M;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    public static C20134113qF MR(Fragment fragment) {
        for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof NavHostFragment) {
                return ((NavHostFragment) parentFragment).NR();
            }
            Fragment fragmentLJJLJ = parentFragment.getParentFragmentManager().LJJLJ();
            if (fragmentLJJLJ instanceof NavHostFragment) {
                return ((NavHostFragment) fragmentLJJLJ).NR();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            C20134113qF c20134113qF = (C20134113qF) C09RB.LJIIL(C09RB.LJIJI(C09R4.LJ(AFwS257S0000000_19.get$arr$(615), view), AFwS264S0000000_24.get$arr$(580)));
            if (c20134113qF != null) {
                return c20134113qF;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("View ");
            sbLIZ.append(view);
            sbLIZ.append(" does not have a NavController set");
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Fragment ");
        sbLIZ2.append(fragment);
        sbLIZ2.append(" does not have a NavController set");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (this.LLILZ) {
            C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LJJ(this);
            c19ehLJIIJ.LJIIIZ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0y7M] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        final Context contextRequireContext = requireContext();
        ?? r0 = new C20134113qF(contextRequireContext) { // from class: X.0y7M
            public final void LJJIIZ(LifecycleOwner lifecycleOwner) {
                Lifecycle lifecycle;
                if (!Intrinsics.LJFF(lifecycleOwner, this.LJIIL)) {
                    LifecycleOwner lifecycleOwner2 = this.LJIIL;
                    if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                        lifecycle.removeObserver(this.LJIIZILJ);
                    }
                    this.LJIIL = lifecycleOwner;
                    lifecycleOwner.getLifecycle().addObserver(this.LJIIZILJ);
                }
            }

            public final void LJJIIZI(OnBackPressedDispatcher onBackPressedDispatcher) {
                if (!Intrinsics.LJFF(onBackPressedDispatcher, this.LJIILIIL)) {
                    LifecycleOwner lifecycleOwner = this.LJIIL;
                    if (lifecycleOwner != null) {
                        this.LJIJ.LJ();
                        this.LJIILIIL = onBackPressedDispatcher;
                        onBackPressedDispatcher.LIZ(lifecycleOwner, this.LJIJ);
                        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
                        lifecycle.removeObserver(this.LJIIZILJ);
                        lifecycle.addObserver(this.LJIIZILJ);
                        return;
                    }
                    "You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString();
                    throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
                }
            }

            public final void LJJIJ(ViewModelStore viewModelStore) {
                NavControllerViewModel navControllerViewModel = this.LJIILJJIL;
                C1845230y7N c1845230y7N = NavControllerViewModel.LLILLJJLI;
                if (!Intrinsics.LJFF(navControllerViewModel, new ViewModelProvider(viewModelStore, c1845230y7N, C903300Zc8.LIZJ).get(NavControllerViewModel.class))) {
                    if (this.LJI.isEmpty()) {
                        this.LJIILJJIL = (NavControllerViewModel) new ViewModelProvider(viewModelStore, c1845230y7N, C903300Zc8.LIZJ).get(NavControllerViewModel.class);
                    } else {
                        "ViewModelStore should be set before setGraph call".toString();
                        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                    }
                }
            }
        };
        this.LL = r0;
        r0.LJJIIZ(this);
        LJJIIZI(requireActivity().getOnBackPressedDispatcher());
        C1845220y7M c1845220y7M = this.LL;
        Boolean bool = this.LLILLJJLI;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        c1845220y7M.LJIJI = z;
        c1845220y7M.LJJIIJZLJL();
        this.LLILLJJLI = null;
        LJJIJ(getViewModelStore());
        C1845220y7M c1845220y7M2 = this.LL;
        c1845220y7M2.LJIJJ.LIZ(new DialogFragmentNavigator(requireContext(), getChildFragmentManager()));
        C20132913q3 c20132913q3 = c1845220y7M2.LJIJJ;
        final Context contextRequireContext2 = requireContext();
        final FragmentManager childFragmentManager = getChildFragmentManager();
        final int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.p1x;
        }
        c20132913q3.LIZ(new AbstractC20133313q7<C20132813q2>(contextRequireContext2, childFragmentManager, id) { // from class: X.13qR
            public final Context LIZJ;
            public final FragmentManager LIZLLL;
            public final int LJ;
            public final ArrayDeque<Integer> LJFF = new ArrayDeque<>();

            @Override // X.AbstractC20133313q7
            public final C20131713pr LIZ() {
                return new C20132813q2(this);
            }

            @Override // X.AbstractC20133313q7
            public final Bundle LJFF() {
                Bundle bundle2 = new Bundle();
                int[] iArr = new int[this.LJFF.size()];
                Iterator<Integer> it2 = this.LJFF.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    iArr[i] = it2.next().intValue();
                    i++;
                }
                bundle2.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
                return bundle2;
            }

            @Override // X.AbstractC20133313q7
            public final boolean LJII() {
                if (this.LJFF.isEmpty() || this.LIZLLL.LJLJJI()) {
                    return false;
                }
                this.LIZLLL.LJLLJ(1, LJIIIIZZ(this.LJFF.size(), this.LJFF.peekLast().intValue()));
                this.LJFF.removeLast();
                return true;
            }

            @Override // X.AbstractC20133313q7
            public final void LJ(Bundle bundle2) {
                int[] intArray = bundle2.getIntArray("androidx-nav-fragment:navigator:backStackIds");
                if (intArray != null) {
                    this.LJFF.clear();
                    for (int i : intArray) {
                        this.LJFF.add(Integer.valueOf(i));
                    }
                }
            }

            public static String LJIIIIZZ(int i, int i2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append("-");
                sbLIZ.append(i2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZJ = contextRequireContext2;
                this.LIZLLL = childFragmentManager;
                this.LJ = id;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0055, code lost:
            
                if (r0 == (-1)) goto L24;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
            
                if (r9.LJFF.peekLast().intValue() == r3) goto L31;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
            
                if (r9.LJFF.size() <= 1) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
            
                r9.LIZLLL.LJLLJ(1, LJIIIIZZ(r9.LJFF.size(), r9.LJFF.peekLast().intValue()));
                r5.LJII(LJIIIIZZ(r9.LJFF.size(), r3));
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00ed, code lost:
            
                if (0 != 0) goto L31;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
            @Override // X.AbstractC20133313q7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C20131713pr LIZJ(X.C20131713pr r10, android.os.Bundle r11, X.C20133813qC r12, X.InterfaceC20133413q8 r13) {
                /*
                    Method dump skipped, instruction units count: 287
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20135313qR.LIZJ(X.13pr, android.os.Bundle, X.13qC, X.13q8):X.13pr");
            }
        });
        if (bundle != null) {
            Bundle bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
            if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                this.LLILZ = true;
                C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
                c19ehLJIIJ.LJJ(this);
                c19ehLJIIJ.LJIIIZ();
            }
            this.LLILLL = bundle.getInt("android-support-nav:fragment:graphId");
            if (bundle2 != null) {
                LJJ(bundle2);
            }
        }
        int i = this.LLILLL;
        if (i != 0) {
            C1845220y7M c1845220y7M3 = this.LL;
            c1845220y7M3.LJJII(((C1308830kAD) c1845220y7M3.LJJIII.getValue()).LIZIZ(i), null);
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        int i2 = arguments.getInt("android-support-nav:fragment:graphId");
        Bundle bundle3 = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
        if (i2 == 0) {
            return;
        }
        C1845220y7M c1845220y7M4 = this.LL;
        c1845220y7M4.LJJII(((C1308830kAD) c1845220y7M4.LJJIII.getValue()).LIZIZ(i2), bundle3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPrimaryNavigationFragmentChanged(boolean z) {
        C1845220y7M c1845220y7M = this.LL;
        if (c1845220y7M != null) {
            c1845220y7M.LJIJI = z;
            c1845220y7M.LJJIIJZLJL();
        } else {
            this.LLILLJJLI = Boolean.valueOf(z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Bundle bundleLJJIFFI = LJJIFFI();
        if (bundleLJJIFFI != null) {
            C786410Ut5.LJJIIZI(bundle, bundleLJJIFFI, "android-support-nav:fragment:navControllerState");
        }
        if (this.LLILZ) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i = this.LLILLL;
        if (i != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            view.setTag(R.id.p1t, this.LL);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                if (view2.getId() == getId()) {
                    view2.setTag(R.id.p1t, this.LL);
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("created host view ");
        sbLIZ.append(view);
        sbLIZ.append(" is not a ViewGroup");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        C20247014Ke c20247014Ke = new C20247014Ke(layoutInflater.getContext());
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.p1x;
        }
        c20247014Ke.setId(id);
        try {
            ViewTreeLifecycleOwner.set(c20247014Ke, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(c20247014Ke, this);
            c20247014Ke.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return c20247014Ke;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return c20247014Ke;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.ss.android.ugc.aweme.app.R$styleable.NavHost);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(com.ss.android.ugc.aweme.app.R$styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.LLILLL = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, com.ss.android.ugc.aweme.app.R$styleable.NavHostFragment);
        if (typedArrayObtainStyledAttributes2.getBoolean(com.ss.android.ugc.aweme.app.R$styleable.NavHostFragment_defaultNavHost, false)) {
            this.LLILZ = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }
}
