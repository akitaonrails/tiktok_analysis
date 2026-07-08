package X;

import X.C897520ZIw;
import Y.AAListenerS272S0200000_21;
import Y.ACListenerS155S0100000_21;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.im.activestatus.api.analytics.ActivityStatusAnalyticsCommonLifecycleOwner;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.mention.viewmodel.MentionPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mFE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388820mFE implements C0I12 {
    public final View LIZ;
    public final WeakReference<Fragment> LIZIZ;
    public final String LIZJ;
    public final InterfaceC1388810mFD LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final Map<String, String> LJI;
    public View LJII;
    public RecyclerView LJIIIIZZ;
    public TuxSkeletonLayout LJIIIZ;
    public final MentionPanelViewModel LJIIJ;
    public final C897520ZIw LJIIJJI;
    public final ActivityStatusAnalyticsCommonLifecycleOwner LJIIL;
    public final C1388630mEv LJIILIIL;
    public final C054G LJIILJJIL;
    public AnonymousClass0956 LJIILL;
    public C09AE LJIILLIIL;
    public LifecycleEventObserver LJIIZILJ;
    public volatile boolean LJIJ;
    public int LJIJI;
    public volatile boolean LJIJJ;
    public final long LJIJJLI;
    public float LJIL;
    public ViewTreeObserverOnPreDrawListenerC1402060maa LJJ;
    public final C01GW LJJI;
    public final C01GW LJJIFFI;
    public final C01GW LJJII;
    public final LinearLayoutManager LJJIII;

    public final void LIZ() {
        ViewTreeObserverOnPreDrawListenerC1402060maa viewTreeObserverOnPreDrawListenerC1402060maa = this.LJJ;
        if (viewTreeObserverOnPreDrawListenerC1402060maa != null) {
            if (this.LIZ.getViewTreeObserver().isAlive()) {
                C786410Ut5.D3(this.LIZ.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1402060maa);
            }
            this.LJJ = null;
        }
    }

    public final View LIZIZ() {
        TuxSkeletonLayout tuxSkeletonLayout = this.LJIIIZ;
        return (tuxSkeletonLayout == null || tuxSkeletonLayout.getVisibility() != 0) ? this.LJIIIIZZ : tuxSkeletonLayout;
    }

    @Override // X.C0I12
    public final void LIZJ() {
        this.LJJIII.scrollToPosition(0);
    }

    @Override // X.C0I12
    public final boolean LJ() {
        MentionPanelViewModel mentionPanelViewModel = this.LJIIJ;
        return mentionPanelViewModel != null && (((ArrayList) mentionPanelViewModel.LLJJIJIL).isEmpty() ^ true);
    }

    @Override // X.C0I12
    public final void LJII() {
        MentionPanelViewModel mentionPanelViewModel = this.LJIIJ;
        if (mentionPanelViewModel != null) {
            mentionPanelViewModel.LLJJJ = "";
            mentionPanelViewModel.LLJJJIL = false;
        }
    }

    public final ValueAnimator LJIIJ() {
        return (ValueAnimator) this.LJJI.getValue();
    }

    public final void LJIIJJI() {
        MentionPanelViewModel mentionPanelViewModel;
        Fragment fragment;
        C2252321DDq c2252321DDq;
        this.LJIIIZ = (TuxSkeletonLayout) this.LIZ.findViewById(R.id.o5y);
        this.LJIIIIZZ = (RecyclerView) this.LIZ.findViewById(R.id.o5z);
        this.LJII = this.LIZ.findViewById(R.id.o1b);
        TuxSkeletonLayout tuxSkeletonLayout = this.LJIIIZ;
        if (tuxSkeletonLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(this.LJ);
            c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(8));
            tuxSkeletonLayout.setBackground(c384050F3z.LIZ(this.LIZ.getContext()));
        }
        MentionPanelViewModel mentionPanelViewModel2 = this.LJIIJ;
        LJIIL((mentionPanelViewModel2 == null || (c2252321DDq = mentionPanelViewModel2.LLJI) == null || !((Boolean) c2252321DDq.getValue()).booleanValue()) ? false : true);
        RecyclerView recyclerView = this.LJIIIIZZ;
        if (recyclerView != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZ = Integer.valueOf(this.LJ);
            c384050F3z2.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z2.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(8));
            recyclerView.setBackground(c384050F3z2.LIZ(recyclerView.getContext()));
            recyclerView.setLayoutManager(this.LJJIII);
            recyclerView.setItemAnimator(null);
            C1388630mEv c1388630mEv = this.LJIILIIL;
            c1388630mEv.LLILZIL = this.LJ;
            MentionPanelViewModel mentionPanelViewModel3 = this.LJIIJ;
            c1388630mEv.LLILZLL = mentionPanelViewModel3 != null ? mentionPanelViewModel3.LLJJJJJIL : null;
            recyclerView.setAdapter(c1388630mEv);
        }
        View view = this.LJII;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS155S0100000_21(this, 82), view);
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ.getContext());
        if (c19egLIZIZ != null) {
            this.LJIJI = a.LIZIZ(R.attr.oz, c19egLIZIZ);
        }
        if (this.LJIILLIIL == null && (mentionPanelViewModel = this.LJIIJ) != null && (fragment = this.LIZIZ.get()) != null) {
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.mention.view.MentionPanelViewDelegate$registerObserver$1$1$observer$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    C897520ZIw c897520ZIw;
                    if (event == Lifecycle.Event.ON_DESTROY && (c897520ZIw = this.LL.LJIIJJI) != null) {
                        c897520ZIw.destroy();
                    }
                }
            };
            fragment.getLifecycle().addObserver(lifecycleEventObserver);
            this.LJIIZILJ = lifecycleEventObserver;
            this.LJIILLIIL = LifecycleOwnerKt.getLifecycleScope(fragment.getViewLifecycleOwner()).launchWhenStarted(new C1388770mF9(mentionPanelViewModel, this, null));
        }
        this.LJIJ = true;
    }

    @Override // X.C0I12
    public final void reset() {
        LJIIIZ(new AwS565S0100000_21(this, 690));
    }

    @Override // X.C0I12
    public final void show() {
        if (!this.LJIJ) {
            LJIIJJI();
        }
        if (this.LJIJJ) {
            return;
        }
        C897520ZIw c897520ZIw = this.LJIIJJI;
        if (c897520ZIw != null) {
            c897520ZIw.LJ();
        }
        this.LJIIL.LIZLLL();
        this.LJIJJ = true;
        Map<String, String> map = this.LJI;
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("dm_mention_list_show", map);
        View viewLIZIZ = LIZIZ();
        if (viewLIZIZ == null || viewLIZIZ.getParent() == null) {
            return;
        }
        LIZ();
        LJIIJ().removeAllListeners();
        LJIIJ().removeAllUpdateListeners();
        LJIIJ().cancel();
        C786410Ut5.LJLLLLLL(0, this.LIZ);
        this.LJIILIIL.notifyDataSetChanged();
        this.LIZLLL.LIZJ();
        ViewTreeObserverOnPreDrawListenerC1402060maa viewTreeObserverOnPreDrawListenerC1402060maa = new ViewTreeObserverOnPreDrawListenerC1402060maa(this, 2);
        this.LJJ = viewTreeObserverOnPreDrawListenerC1402060maa;
        C786410Ut5.y3(this.LIZ.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1402060maa);
    }

    @Override // X.C0I12
    public final void LJI() {
        ViewGroup viewGroup;
        Fragment fragment;
        Lifecycle lifecycle;
        LIZ();
        C09AE c09ae = this.LJIILLIIL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LJIILLIIL = null;
        LifecycleEventObserver lifecycleEventObserver = this.LJIIZILJ;
        if (lifecycleEventObserver != null && (fragment = this.LIZIZ.get()) != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.removeObserver(lifecycleEventObserver);
        }
        this.LJIIZILJ = null;
        AnonymousClass0956 anonymousClass0956 = this.LJIILL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIILL = null;
        C897520ZIw c897520ZIw = this.LJIIJJI;
        if (c897520ZIw != null) {
            c897520ZIw.LJII();
        }
        this.LJIIL.LIZJ();
        MentionPanelViewModel mentionPanelViewModel = this.LJIIJ;
        if (mentionPanelViewModel != null) {
            ((ArrayList) mentionPanelViewModel.LLJJIJIL).clear();
            mentionPanelViewModel.refresh();
        }
        this.LJIJJ = false;
        this.LJIJ = false;
        C786410Ut5.LJLLLLLL(8, this.LIZ);
        ViewParent parent = this.LIZ.getParent();
        if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LIZ, viewGroup);
    }

    @Override // X.C0I12
    public final void LIZLLL(List<String> list) {
        MentionPanelViewModel mentionPanelViewModel = this.LJIIJ;
        if (mentionPanelViewModel != null) {
            ((ArrayList) mentionPanelViewModel.LLJJIJIL).clear();
            ((ArrayList) mentionPanelViewModel.LLJJIJIL).addAll(list);
        }
    }

    @Override // X.C0I12
    public final void LJFF(String str) {
        MentionPanelViewModel mentionPanelViewModel = this.LJIIJ;
        if (mentionPanelViewModel != null) {
            ((ArrayList) mentionPanelViewModel.LLJJIJIL).remove(str);
            if (((ArrayList) mentionPanelViewModel.LLJJIJIL).isEmpty()) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(mentionPanelViewModel), null, null, new C315590CYr(mentionPanelViewModel, null), 3);
            }
            IMContactApi.LIZ.getClass();
            IMUser iMUserLIZLLL = C069P.LIZ().LJ().LIZLLL(str, null, "im_input");
            if (iMUserLIZLLL != null) {
                C0ZDS c0zds = mentionPanelViewModel.LLILZLL;
                String uid = iMUserLIZLLL.getUid();
                if (uid == null) {
                    uid = "";
                }
                C0ZDS.LIZIZ(c0zds, "delete_text", null, uid, iMUserLIZLLL.getFollowStatus(), mentionPanelViewModel.LLILLL);
            }
            mentionPanelViewModel.refresh();
        }
    }

    @Override // X.C0I12
    public final void LJIIIIZZ(String str) {
        MentionPanelViewModel mentionPanelViewModel = this.LJIIJ;
        if (mentionPanelViewModel != null) {
            mentionPanelViewModel.xQ2(str);
        }
    }

    @Override // X.C0I12
    public final void LJIIIZ(Function0<Unit> function0) {
        if (!this.LJIJ) {
            return;
        }
        if (!this.LJIJJ) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        C897520ZIw c897520ZIw = this.LJIIJJI;
        if (c897520ZIw != null) {
            c897520ZIw.LJII();
        }
        this.LJIIL.LIZJ();
        this.LJIJJ = false;
        this.LIZLLL.LIZIZ();
        LIZ();
        LJIIJ().removeAllListeners();
        LJIIJ().removeAllUpdateListeners();
        LJIIJ().cancel();
        LJIIJ().addUpdateListener((ValueAnimator.AnimatorUpdateListener) this.LJJII.getValue());
        LJIIJ().addListener(new AAListenerS272S0200000_21(this, function0, 0));
        LJIIJ().reverse();
    }

    public final void LJIIL(boolean z) {
        boolean z2;
        int i = 0;
        if (this.LJFF && z) {
            z2 = true;
            RecyclerView recyclerView = this.LJIIIIZZ;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 4);
            }
        } else {
            z2 = false;
            TuxSkeletonLayout tuxSkeletonLayout = this.LJIIIZ;
            if (tuxSkeletonLayout != null && tuxSkeletonLayout.getVisibility() == 0) {
                RecyclerView recyclerView2 = this.LJIIIIZZ;
                if (recyclerView2 != null) {
                    C786410Ut5.kd(recyclerView2, recyclerView2.getHeight() * (1 - this.LJIL));
                }
                RecyclerView recyclerView3 = this.LJIIIIZZ;
                if (recyclerView3 != null) {
                    C786410Ut5.LLIZLLLIL(recyclerView3, 0);
                }
            }
        }
        TuxSkeletonLayout tuxSkeletonLayout2 = this.LJIIIZ;
        if (tuxSkeletonLayout2 != null) {
            if (!z2) {
                i = 8;
            }
            C786410Ut5.LLLZL(tuxSkeletonLayout2, i);
        }
        TuxSkeletonLayout tuxSkeletonLayout3 = this.LJIIIZ;
        if (tuxSkeletonLayout3 != null) {
            tuxSkeletonLayout3.setLoading(z2);
        }
    }

    public C1388820mFE(View view, WeakReference<Fragment> weakReference, final String str, InterfaceC1388810mFD interfaceC1388810mFD, int i, boolean z, final Map<String, String> map) {
        MentionPanelViewModel mentionPanelViewModel;
        this.LIZ = view;
        this.LIZIZ = weakReference;
        this.LIZJ = str;
        this.LIZLLL = interfaceC1388810mFD;
        this.LJ = i;
        this.LJFF = z;
        this.LJI = map;
        final String string = view.getContext().getString(2131831600);
        Fragment fragment = weakReference.get();
        C897520ZIw c897520ZIwLJI = null;
        if (fragment != null) {
            ViewModelProvider viewModelProviderOf = ViewModelProviders.of(fragment, new ViewModelProvider.Factory() { // from class: X.01cB
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                    return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public final <T extends ViewModel> T create(Class<T> cls) {
                    return new MentionPanelViewModel(str, string, map);
                }
            });
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MentionPanelViewModel-");
            sbLIZ.append(str);
            mentionPanelViewModel = (MentionPanelViewModel) viewModelProviderOf.get(C2188811AlT.LIZIZ(sbLIZ), MentionPanelViewModel.class);
        } else {
            mentionPanelViewModel = null;
        }
        this.LJIIJ = mentionPanelViewModel;
        if (C1727806pg.LIZ.LIZ("group_chat_operation_enable_activity_status", str, C461720I8s.LIZIZ(), false)) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            c897520ZIwLJI = C897370ZIh.LIZ().LJI(EnumC1910450zoZ.GROUP_MENTION, false);
        }
        this.LJIIJJI = c897520ZIwLJI;
        ActivityStatusAnalyticsCommonLifecycleOwner activityStatusAnalyticsCommonLifecycleOwner = new ActivityStatusAnalyticsCommonLifecycleOwner(weakReference.get(), false);
        this.LJIIL = activityStatusAnalyticsCommonLifecycleOwner;
        this.LJIILIIL = new C1388630mEv(str, c897520ZIwLJI, activityStatusAnalyticsCommonLifecycleOwner);
        this.LJIILJJIL = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
        this.LJIJJLI = 150L;
        this.LJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 474));
        this.LJJIFFI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(297));
        this.LJJII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 691));
        this.LJJIII = new LinearLayoutManager(view.getContext(), 0, false);
    }
}
