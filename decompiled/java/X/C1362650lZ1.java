package X;

import X.C1363780laq;
import X.C2157408cm;
import X.C21673919s1;
import X.C897520ZIw;
import X.InterfaceC899440ZQg;
import Y.AObserverS210S0100000_6;
import Y.AObserverS223S0100000_19;
import Y.AObserverS224S0100000_21;
import Y.ARunnableS14S0101000_3;
import Y.AsS48S0100000_21;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.affinity.model.SocialAffinityItem;
import com.ss.android.ugc.aweme.affinity.service.ISocialAffinityService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelImHeadViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelPreloadSortedListViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lZ1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1362650lZ1 extends FrameLayout implements InterfaceC724530SbT, InterfaceC1363370laB, LifecycleEventObserver, InterfaceC1370690llz {
    public C1383380m6S LL;
    public FrameLayout LLILLJJLI;
    public C1214160hhW LLILLL;
    public C1214080hhO LLILZ;
    public View LLILZIL;
    public SharePanelPreloadSortedListViewModel LLILZLL;
    public SharePanelImHeadViewModel LLIZ;
    public AbstractC1362700lZ6 LLIZLLLIL;
    public C1214170hhX LLJ;
    public SharePackage LLJI;
    public List<? extends InterfaceC1369790lkX> LLJIJIL;
    public C1362230lYL LLJILJIL;
    public boolean LLJILJILJ;
    public Fragment LLJILLL;
    public InterfaceC1362600lYw LLJJ;
    public InterfaceC1362720lZ8 LLJJI;
    public boolean LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public String LLJJIJIL;
    public InterfaceC899440ZQg LLJJJ;
    public C897520ZIw LLJJJIL;
    public C1214160hhW LLJJJJ;
    public AssemViewModel<C1358700lSe> LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    public View getImHeadLayout() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    private final ISocialAffinityService getAffinityService() {
        return (ISocialAffinityService) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final Lifecycle getEmptyLifecycle() {
        return (Lifecycle) this.LLJL.getValue();
    }

    private final Lifecycle getInternalShareLifecycle() {
        Lifecycle lifecycle;
        Fragment fragment = this.LLJILLL;
        return (fragment == null || (lifecycle = fragment.getLifecycle()) == null) ? getEmptyLifecycle() : lifecycle;
    }

    private final int getOriginHeight() {
        return ((Number) this.LLJJL.getValue()).intValue();
    }

    public void LIZIZ() {
        Fragment fragment = this.LLJILLL;
        if (fragment == null) {
            return;
        }
        SharePanelImHeadViewModel viewModel = getViewModel();
        viewModel.LLILZ.observe(fragment, new AObserverS224S0100000_21(this, 31));
        viewModel.LLJJIJI.observe(fragment, new AObserverS224S0100000_21(this, 32));
        viewModel.LLILZLL.observe(fragment, new AObserverS224S0100000_21(this, 33));
        viewModel.LLIZLLLIL.observe(fragment, new AObserverS224S0100000_21(this, 34));
        viewModel.LLIZ.observe(fragment, new AObserverS224S0100000_21(this, 35));
        viewModel.LLJ.observe(fragment, new AObserverS224S0100000_21(this, 36));
        viewModel.LLJIJIL.observe(fragment, new AObserverS210S0100000_6(this, 28));
        viewModel.LLJILJIL.observe(fragment, new AObserverS224S0100000_21(this, 37));
        viewModel.LLJJIII.observe(fragment, new AObserverS224S0100000_21(this, 38));
        viewModel.LLILZIL.observe(fragment, new AObserverS224S0100000_21(this, 30));
        LJIIIZ();
    }

    public final boolean LJII() {
        C1362230lYL c1362230lYL;
        SharePackage sharePackage = this.LLJI;
        if (sharePackage == null) {
            sharePackage = null;
        }
        return sharePackage.LJIILL() && (c1362230lYL = this.LLJILJIL) != null && c1362230lYL.LJIJ;
    }

    public void LJIIIZ() {
        Fragment fragment = this.LLJILLL;
        if (fragment == null) {
            return;
        }
        getViewModel().LLJJ.observe(fragment, new AObserverS223S0100000_19(this, 26));
    }

    @Override // X.InterfaceC1363370laB
    public C0ZE7 getActivityStatusParams() {
        SharePackage sharePackage = this.LLJI;
        if (sharePackage == null) {
            sharePackage = null;
        }
        EnumC1910440zoY enumC1910440zoY = !C1250860iei.LIZ(sharePackage) ? EnumC1910440zoY.LONG_PRESS_PANEL : EnumC1910440zoY.SHARE_PANEL;
        SharePackage sharePackage2 = this.LLJI;
        String str = !C1250860iei.LIZ(sharePackage2 != null ? sharePackage2 : null) ? "long_press_panel" : "share_panel";
        C0ZE7 c0ze7 = new C0ZE7(this);
        c0ze7.LIZIZ(enumC1910440zoY);
        String str2 = this.LLJJIJIL;
        if (str2 == null) {
            str2 = "";
        }
        c0ze7.LIZLLL = str2;
        c0ze7.LJFF = str;
        return c0ze7;
    }

    public final FrameLayout getFloatingButtonContainerFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.id1);
            this.LLILLJJLI = (FrameLayout) callbackFindViewById;
        }
        return (FrameLayout) callbackFindViewById;
    }

    public final int getItemCount() {
        AbstractC1362700lZ6 abstractC1362700lZ6 = this.LLIZLLLIL;
        if (abstractC1362700lZ6 != null) {
            return abstractC1362700lZ6.getItemCount();
        }
        return 0;
    }

    public final C1383380m6S getRvSharePanelAvatarFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tx2);
            this.LL = (C1383380m6S) callbackFindViewById;
        }
        return (C1383380m6S) callbackFindViewById;
    }

    public final C1214160hhW getSharePanelImTipLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v0v);
            this.LLILLL = (C1214160hhW) callbackFindViewById;
        }
        return (C1214160hhW) callbackFindViewById;
    }

    public final C1214080hhO getSharePanelImTipLayoutUnifiedFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.v0w);
            this.LLILZ = (C1214080hhO) callbackFindViewById;
        }
        return (C1214080hhO) callbackFindViewById;
    }

    public final View getTipLineDividerFromXml() {
        View view = this.LLILZIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.xys);
        this.LLILZIL = viewFindViewById;
        return viewFindViewById;
    }

    public final SharePanelImHeadViewModel getViewModel() {
        SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LLIZ;
        if (sharePanelImHeadViewModel != null) {
            return sharePanelImHeadViewModel;
        }
        return null;
    }

    private final boolean getCanShowGroupEntry() {
        if (C1336205Ku.LIZJ().LIZJ()) {
            return false;
        }
        C1759206uk c1759206uk = C1759206uk.LIZ;
        if (!C1759206uk.LIZ()) {
            return false;
        }
        SharePackage sharePackage = this.LLJI;
        if (sharePackage == null) {
            sharePackage = null;
        }
        return C1244940iVA.LIZ(sharePackage);
    }

    public void LJ() {
        Bundle bundle;
        int i;
        SharePanelViewModel sharePanelViewModel = getViewModel().LLJJIJIL;
        C1214170hhX c1214170hhXLJFF = sharePanelViewModel.LJFF();
        if (c1214170hhXLJFF == null) {
            return;
        }
        SharePackage sharePackage = sharePanelViewModel.LL;
        if (sharePackage != null && sharePackage.extras != null) {
            if (!sharePanelViewModel.LIZJ(c1214170hhXLJFF)) {
                return;
            } else {
                this.LLJ = c1214170hhXLJFF;
            }
        }
        if (c1214170hhXLJFF.LIZJ == 1) {
            SharePackage sharePackage2 = this.LLJI;
            if (sharePackage2 == null) {
                sharePackage2 = null;
            }
            if (sharePackage2.LJIILL() && ((i = c1214170hhXLJFF.LIZIZ) == 2 || i == 1)) {
                return;
            }
        }
        SharePackage sharePackage3 = this.LLJI;
        if (sharePackage3 == null) {
            sharePackage3 = null;
        }
        if (sharePackage3.extras.getBoolean("is_from_new_lpp")) {
            return;
        }
        if (this.LLJJJJ == null) {
            this.LLJJJJ = getSharePanelImTipLayoutFromXml();
        }
        C1214160hhW c1214160hhW = this.LLJJJJ;
        if (c1214160hhW != null) {
            C426750GoL.LJIIIZ(c1214160hhW, null, null, null, 0, false, 23);
        }
        SharePackage sharePackage4 = sharePanelViewModel.LL;
        if (sharePackage4 == null || (bundle = sharePackage4.extras) == null) {
            return;
        }
        if (C1369210ljb.LJ(sharePanelViewModel.LL, bundle.getString("enter_method"))) {
            getSharePanelImTipLayoutUnifiedFromXml().LIZ(false);
            getSharePanelImTipLayoutUnifiedFromXml().LJ(c1214170hhXLJFF);
            C1214080hhO sharePanelImTipLayoutUnifiedFromXml = getSharePanelImTipLayoutUnifiedFromXml();
            int visibility = sharePanelImTipLayoutUnifiedFromXml.getVisibility();
            sharePanelImTipLayoutUnifiedFromXml.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, sharePanelImTipLayoutUnifiedFromXml);
        }
        C1214160hhW c1214160hhW2 = this.LLJJJJ;
        boolean z = (c1214160hhW2 != null ? c1214160hhW2.getLayoutParams() : null) instanceof LinearLayout.LayoutParams;
        C1214160hhW c1214160hhW3 = this.LLJJJJ;
        if (c1214160hhW3 != null) {
            c1214160hhW3.LIZ(true);
        }
        C1214160hhW c1214160hhW4 = this.LLJJJJ;
        if (c1214160hhW4 != null) {
            c1214160hhW4.LJ(c1214170hhXLJFF);
        }
        this.LLJILJILJ = true;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getInternalShareLifecycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C19EG activity;
        super.onAttachedToWindow();
        LIZIZ();
        Fragment fragment = this.LLJILLL;
        if (fragment != null && (fragment instanceof SkeletonSharePanelFragment) && (activity = fragment.getActivity()) != null) {
            this.LLILZLL = (SharePanelPreloadSortedListViewModel) ViewModelProviders.of(activity).get(SharePanelPreloadSortedListViewModel.class);
            SharePackage sharePackage = this.LLJI;
            if (sharePackage == null) {
                sharePackage = null;
            }
            String string = sharePackage.extras.getString("panel_source");
            if (string == null) {
                string = "";
            }
            SharePanelPreloadSortedListViewModel sharePanelPreloadSortedListViewModel = this.LLILZLL;
            if (sharePanelPreloadSortedListViewModel != null) {
                sharePanelPreloadSortedListViewModel.vQ2(string, new AwS600S0100000_21(this, 328));
            }
        }
        SharePanelImHeadViewModel viewModel = getViewModel();
        Fragment fragment2 = this.LLJILLL;
        viewModel.getClass();
        if (!(fragment2 instanceof SkeletonSharePanelFragment)) {
            viewModel.LLJJIJIL.refresh();
        }
        C1362630lYz.LIZ.getClass();
        C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
        if (c2096308Jd != null) {
            c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.SHOW_INTERNAL_SHARE.getValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        SharePanelPreloadSortedListViewModel sharePanelPreloadSortedListViewModel;
        super.onDetachedFromWindow();
        if (!((Boolean) C279030Awf.LIZ.getValue()).booleanValue() || (sharePanelPreloadSortedListViewModel = this.LLILZLL) == null) {
            return;
        }
        sharePanelPreloadSortedListViewModel.LLILZ.clear();
    }

    public final Fragment getHostFragment() {
        return this.LLJILLL;
    }

    public final InterfaceC1362720lZ8 getHostPanelPanelCallback() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    public C1362650lZ1(C1361400lX0 c1361400lX0) {
        super(c1361400lX0, null, 0);
        this.LLJJL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1421));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(547));
        this.LLJL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(544));
        LJI(c1361400lX0);
    }

    public final void LIZJ(String str) {
        C1362630lYz.LIZ.getClass();
        C1362630lYz.LIZ();
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().getShareService().LJIJ(System.currentTimeMillis(), "more");
        InterfaceC1362600lYw interfaceC1362600lYw = this.LLJJ;
        SharePackage sharePackage = null;
        if (interfaceC1362600lYw != null) {
            SharePackage sharePackage2 = this.LLJI;
            if (sharePackage2 == null) {
                sharePackage2 = null;
            }
            interfaceC1362600lYw.LJIIJ(sharePackage2, "chat_merge");
        }
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        if (activityLIZ != null) {
            ((InputMethodManager) C786410Ut5.F2(activityLIZ, "input_method")).hideSoftInputFromWindow(activityLIZ.getWindow().getDecorView().getWindowToken(), 0);
        }
        SharePackage sharePackage3 = this.LLJI;
        if (sharePackage3 == null) {
            sharePackage3 = null;
        }
        Bundle bundle = sharePackage3.extras;
        C786410Ut5.LJJJI("enter_method", "more", bundle);
        if (str != null && C123100dR.LIZ(str)) {
            C786410Ut5.LJJJI("default_edit_text_msg", str, bundle);
        }
        Set<IMContact> setLJIILL = getViewModel().LLJJIJIL.LJIILL();
        Activity activityLIZ2 = C1388190mED.LIZ(getContext());
        if (activityLIZ2 == null) {
            return;
        }
        InterfaceC1368680lik interfaceC1368680lik = new InterfaceC1368680lik() { // from class: X.0lYx
            @Override // X.InterfaceC1368680lik
            public final void LIZLLL() {
            }

            @Override // X.InterfaceC1368680lik
            public final void LJIIIIZZ() {
                C1362630lYz.LIZ.getClass();
                C1362630lYz.LIZIZ();
            }

            @Override // X.InterfaceC1368680lik
            public final void LIZ(SharePackage sharePackage4) {
                InterfaceC1362600lYw interfaceC1362600lYw2 = this.LIZ.LLJJ;
                if (interfaceC1362600lYw2 != null) {
                    interfaceC1362600lYw2.LJIIL(sharePackage4);
                }
                InterfaceC1362600lYw interfaceC1362600lYw3 = this.LIZ.LLJJ;
                if (interfaceC1362600lYw3 != null) {
                    interfaceC1362600lYw3.LIZ(sharePackage4);
                }
            }

            @Override // X.InterfaceC1368680lik
            public final void LIZIZ(HashMap<String, String> map) {
                InterfaceC1362600lYw interfaceC1362600lYw2 = this.LIZ.LLJJ;
                if (interfaceC1362600lYw2 != null) {
                    interfaceC1362600lYw2.LIZIZ(map);
                }
            }

            @Override // X.InterfaceC1368680lik
            public final void LJFF(SharePackage sharePackage4) {
                InterfaceC1362600lYw interfaceC1362600lYw2 = this.LIZ.LLJJ;
                if (interfaceC1362600lYw2 != null) {
                    interfaceC1362600lYw2.LJFF(sharePackage4);
                }
            }

            @Override // X.InterfaceC1368680lik
            public final void LJI(SharePackage sharePackage4) {
                InterfaceC1362600lYw interfaceC1362600lYw2 = this.LIZ.LLJJ;
                if (interfaceC1362600lYw2 != null) {
                    interfaceC1362600lYw2.LJI(sharePackage4);
                }
            }

            @Override // X.InterfaceC1368680lik
            public final void LJIIIZ(SharePackage sharePackage4) {
                InterfaceC1362600lYw interfaceC1362600lYw2 = this.LIZ.LLJJ;
                if (interfaceC1362600lYw2 != null) {
                    interfaceC1362600lYw2.LJIIJJI(sharePackage4);
                }
            }

            @Override // X.InterfaceC1368680lik
            public final void LIZJ(Dialog dialog, SharePackage sharePackage4) {
                InterfaceC1362600lYw interfaceC1362600lYw2 = this.LIZ.LLJJ;
                if (interfaceC1362600lYw2 != null) {
                    interfaceC1362600lYw2.LIZJ(dialog, sharePackage4);
                }
            }

            @Override // X.InterfaceC1368680lik
            public final void LJII(Dialog dialog, SharePackage sharePackage4) {
                InterfaceC1362600lYw interfaceC1362600lYw2 = this.LIZ.LLJJ;
                if (interfaceC1362600lYw2 != null) {
                    interfaceC1362600lYw2.LJII(dialog, sharePackage4);
                }
            }

            @Override // X.InterfaceC1368680lik
            public final void LJ(IMContact iMContact, int i, boolean z) {
                Integer numValueOf;
                List<IMContact> listLLLFZ;
                AbstractC1362700lZ6 abstractC1362700lZ6 = this.LIZ.LLIZLLLIL;
                if (abstractC1362700lZ6 != null && (listLLLFZ = abstractC1362700lZ6.LLLFZ()) != null) {
                    Iterator<IMContact> it2 = listLLLFZ.iterator();
                    int i2 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (Intrinsics.LJFF(it2.next().getUid(), iMContact.getUid())) {
                                break;
                            } else {
                                i2++;
                            }
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    numValueOf = Integer.valueOf(i2);
                } else {
                    numValueOf = null;
                }
                C1362650lZ1 c1362650lZ1 = this.LIZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(i, "rank_index");
                c2344009Gk.LJ(numValueOf, "panel_index");
                c2344009Gk.LJ(Boolean.valueOf(z), "has_search_word");
                c1362650lZ1.LIZ(c2344009Gk, iMContact);
                C20684815ws.LJIILLIIL("internal_share_search_result_click", c2344009Gk.LIZ);
            }
        };
        IInternalShareApi.LIZ.getClass();
        InterfaceC1364710lcL interfaceC1364710lcLLIZIZ = C1370970lmR.LIZ().LIZIZ();
        SharePackage sharePackage4 = this.LLJI;
        if (sharePackage4 == null) {
            sharePackage4 = null;
        } else {
            sharePackage = sharePackage4;
        }
        interfaceC1364710lcLLIZIZ.LJFF(activityLIZ2, sharePackage4, null, setLJIILL, false, interfaceC1368680lik, getViewModel().LLJJIJIL.LLJJJ, this.LLJ, false, !sharePackage.extras.getBoolean("key_filter_group_chat"), null, getViewModel().LLJJIJIL.LLJJJIL, true, null);
    }

    public final LinearLayoutManager LIZLLL(final int i) {
        final int iIntValue;
        Integer num;
        if (LJII()) {
            final Context context = getContext();
            C1362230lYL c1362230lYL = this.LLJILJIL;
            if (c1362230lYL != null && (num = c1362230lYL.LJIJI) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 4;
            }
            GridLayoutManager gridLayoutManager = new GridLayoutManager(iIntValue, context) { // from class: com.ss.android.ugc.aweme.internalshare.impl.ui.SharePanelImHeadLayout$getLayoutManager$1
                @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                    super.onLayoutCompleted(c21673919s1);
                    this.LJIIIIZZ(c21673919s1);
                }
            };
            getRvSharePanelAvatarFromXml().setItemViewCacheSize(50);
            return gridLayoutManager;
        }
        final Context context2 = getContext();
        return new LinearLayoutManager(i, context2) { // from class: com.ss.android.ugc.aweme.internalshare.impl.ui.SharePanelImHeadLayout$getLayoutManager$3
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                super.onLayoutCompleted(c21673919s1);
                this.LJIIIIZZ(c21673919s1);
                C1363780laq.LIZ.getClass();
                if (C1363780laq.LIZLLL) {
                    C1363780laq.LJ = true;
                }
                if (C1363780laq.LIZJ <= 0) {
                    C1363780laq.LIZIZ(System.currentTimeMillis());
                }
            }
        };
    }

    public void LJI(Context context) {
        C21146717pB.LIZ(context, R.layout.cru, this);
    }

    public final void LJIIIIZZ(C21673919s1 c21673919s1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("share IM avatar onLayoutCompleted cnt: ");
        sbLIZ.append(c21673919s1.LIZIZ());
        C1720006oQ.LJ("SharePanelImHeadLayout", C2188811AlT.LIZIZ(sbLIZ));
        if (c21673919s1.LIZIZ() > 0 && !this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = true;
            long jLIZIZ = C2216408mI.LIZIZ("share_button");
            long jCurrentTimeMillis = System.currentTimeMillis() - jLIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("share IM avatar load cost: ");
            sbLIZ2.append(jCurrentTimeMillis);
            C1720006oQ.LJ("SharePanelImHeadLayout", C2188811AlT.LIZIZ(sbLIZ2));
            if (jLIZIZ > 0 && jCurrentTimeMillis > 0) {
                C1364620lcC c1364620lcC = C1364620lcC.LIZ;
                String str = this.LLJJIJIL;
                InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
                c1364620lcC.getClass();
                C1364620lcC.LJIILL(jCurrentTimeMillis, interfaceC1493505szLIZIZ, str, "share_button");
            }
        }
    }

    @Override // X.InterfaceC1370690llz
    public final void Pe(int i) {
        C1383380m6S rvSharePanelAvatarFromXml = getRvSharePanelAvatarFromXml();
        if (rvSharePanelAvatarFromXml != null) {
            ViewGroup.LayoutParams layoutParams = rvSharePanelAvatarFromXml.getLayoutParams();
            layoutParams.height = getOriginHeight() + i;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(rvSharePanelAvatarFromXml);
            rvSharePanelAvatarFromXml.setLayoutParams(layoutParams);
        }
    }

    @Override // X.InterfaceC1370690llz
    public final void k3(int i) {
        C1383380m6S rvSharePanelAvatarFromXml = getRvSharePanelAvatarFromXml();
        if (rvSharePanelAvatarFromXml == null) {
            return;
        }
        if (rvSharePanelAvatarFromXml.getVisibility() == 0 && rvSharePanelAvatarFromXml.getMeasuredHeight() == 0) {
            HandlerHook.viewPost(rvSharePanelAvatarFromXml, new ARunnableS14S0101000_3(i, this, 4));
            return;
        }
        int measuredHeight = rvSharePanelAvatarFromXml.getMeasuredHeight() + i;
        ViewGroup.LayoutParams layoutParams = rvSharePanelAvatarFromXml.getLayoutParams();
        layoutParams.height = measuredHeight;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(rvSharePanelAvatarFromXml);
        rvSharePanelAvatarFromXml.setLayoutParams(layoutParams);
    }

    public final void setFloatingButtonContainerFromXml(FrameLayout frameLayout) {
        this.LLILLJJLI = frameLayout;
    }

    public final void setHostFragment(Fragment fragment) {
        this.LLJILLL = fragment;
    }

    public final void setHostPanelPanelCallback(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
        this.LLJJI = interfaceC1362720lZ8;
    }

    public final void setRecyclerViewNestedScrollingEnabled(boolean z) {
        getRvSharePanelAvatarFromXml().setNestedScrollingEnabled(z);
    }

    public final void setRvSharePanelAvatarFromXml(C1383380m6S c1383380m6S) {
        this.LL = c1383380m6S;
    }

    public final void setSharePanelImTipLayoutFromXml(C1214160hhW c1214160hhW) {
        this.LLILLL = c1214160hhW;
    }

    public final void setSharePanelImTipLayoutUnifiedFromXml(C1214080hhO c1214080hhO) {
        this.LLILZ = c1214080hhO;
    }

    public final void setShareUIDynamicConfig(C1362230lYL c1362230lYL) {
        this.LLJILJIL = c1362230lYL;
    }

    public final void setTipLineDividerFromXml(View view) {
        this.LLILZIL = view;
    }

    public final void setViewModel(SharePanelImHeadViewModel sharePanelImHeadViewModel) {
        this.LLIZ = sharePanelImHeadViewModel;
    }

    public final void LIZ(C2344009Gk c2344009Gk, IMContact iMContact) {
        String conversationId;
        long followTime;
        Double dValueOf;
        IMUser iMUser;
        Map<String, SocialAffinityItem> mapLIZIZ;
        SocialAffinityItem socialAffinityItem;
        String name = iMContact.getClass().getName();
        boolean z = iMContact instanceof IMUser;
        if (z) {
            name = "user";
        } else if (iMContact instanceof IMConversation) {
            name = "group";
        }
        c2344009Gk.LJFF("user_type", name);
        if (!z ? !(iMContact instanceof IMConversation) || (conversationId = ((IMConversation) iMContact).getConversationId()) == null : (conversationId = iMContact.getUid()) == null) {
            conversationId = "";
        }
        c2344009Gk.LJFF("to_user_id", conversationId);
        if (z) {
            followTime = ((IMUser) iMContact).getFollowTime();
        } else {
            followTime = -1;
        }
        c2344009Gk.LIZLLL(followTime, "follow_time");
        ISocialAffinityService affinityService = getAffinityService();
        Integer numValueOf = null;
        if (affinityService != null && (mapLIZIZ = affinityService.LIZIZ("share_more")) != null && (socialAffinityItem = mapLIZIZ.get(iMContact.getUid())) != null) {
            dValueOf = Double.valueOf(socialAffinityItem.score);
        } else {
            dValueOf = null;
        }
        c2344009Gk.LJ(dValueOf, "affinity_score");
        if (z && (iMUser = (IMUser) iMContact) != null) {
            numValueOf = Integer.valueOf(iMUser.getFollowStatus());
        }
        c2344009Gk.LJ(numValueOf, "follow_status");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int itemCount;
        ViewGroup viewGroup;
        C1363970lb9 c1363970lb9;
        IMContact iMContact;
        if (C2026207wi.LIZ[event.ordinal()] == 1) {
            getViewModel().xQ2();
            C1383380m6S rvSharePanelAvatarFromXml = getRvSharePanelAvatarFromXml();
            int i = 0;
            if (rvSharePanelAvatarFromXml != null) {
                rvSharePanelAvatarFromXml.scrollToPosition(0);
            }
            setRecyclerViewNestedScrollingEnabled(true);
            AbstractC1362700lZ6 abstractC1362700lZ6 = this.LLIZLLLIL;
            if (abstractC1362700lZ6 != null) {
                itemCount = abstractC1362700lZ6.getItemCount();
            } else {
                itemCount = 0;
            }
            while (true) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = null;
                if (i >= itemCount) {
                    break;
                }
                C1383380m6S rvSharePanelAvatarFromXml2 = getRvSharePanelAvatarFromXml();
                if (rvSharePanelAvatarFromXml2 != null) {
                    viewHolderFindViewHolderForAdapterPosition = rvSharePanelAvatarFromXml2.findViewHolderForAdapterPosition(i);
                }
                if (viewHolderFindViewHolderForAdapterPosition instanceof C1363950lb7) {
                    C1363950lb7 c1363950lb7 = (C1363950lb7) viewHolderFindViewHolderForAdapterPosition;
                    IMContact iMContact2 = c1363950lb7.LLJJI;
                    if (iMContact2 != null) {
                        c1363950lb7.LLJLL.LIZJ(iMContact2);
                    }
                } else if ((viewHolderFindViewHolderForAdapterPosition instanceof C1363970lb9) && (iMContact = (c1363970lb9 = (C1363970lb9) viewHolderFindViewHolderForAdapterPosition).LLILZLL) != null) {
                    c1363970lb9.LLJIJIL.LIZJ(iMContact);
                }
                i++;
            }
            ViewParent parent = getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this, viewGroup);
            }
            this.LLJILLL = null;
            this.LLJJ = null;
            this.LLJJI = null;
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    public void LJIIJ(SharePackage sharePackage, List list, Fragment fragment, EnumC1369720lkQ enumC1369720lkQ, InterfaceC1362900lZQ interfaceC1362900lZQ, InterfaceC1362720lZ8 interfaceC1362720lZ8, String str) {
        boolean z;
        C897520ZIw c897520ZIwLJI;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C424780GlA c424780GlA;
        C1362230lYL c1362230lYL;
        int i;
        int i2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        FrameLayout.LayoutParams layoutParams;
        int iLIZIZ;
        int iLIZIZ2;
        Activity activityLIZ;
        C19EG c19eg;
        boolean z2;
        Bundle bundle;
        boolean z3;
        Bundle bundle2;
        SkeletonSharePanelFragment skeletonSharePanelFragment;
        EnumC1910440zoY enumC1910440zoY;
        Activity activityLIZIZ;
        this.LLJILJILJ = false;
        this.LLJJIII = false;
        this.LLJJIJI = 0;
        this.LLJJIJIIJIL = false;
        this.LLJI = sharePackage;
        this.LLJIJIL = list;
        this.LLJILLL = fragment;
        this.LLJJ = interfaceC1362900lZQ;
        this.LLJJI = interfaceC1362720lZ8;
        SharePanelViewModel sharePanelViewModelLIZ = C1363350la9.LIZ(sharePackage, new InterfaceC1356390lOv() { // from class: X.0lXv
            @Override // X.InterfaceC1356390lOv
            public final boolean dE(IMContact iMContact, boolean z4, Fragment fragment2) {
                return false;
            }

            @Override // X.InterfaceC1356390lOv
            public final void GW(IMContact iMContact) {
                this.LL.getViewModel().GW(iMContact);
            }

            @Override // X.InterfaceC1356390lOv
            public final void jR(List<? extends IMContact> list2) {
                this.LL.getViewModel().jR(list2);
            }

            @Override // X.InterfaceC1356390lOv
            public final void DX1(Throwable th, List list2) {
                this.LL.getViewModel().getClass();
            }

            @Override // X.InterfaceC1356390lOv
            public final void Pu0(List<? extends IMContact> list2, List<? extends IMContact> list3) {
                C1363390laD c1363390laD;
                C897520ZIw c897520ZIw = this.LL.LLJJJIL;
                if (c897520ZIw != null) {
                    c897520ZIw.LJIIJJI(new C1356510lP7(list2, null));
                }
                this.LL.getViewModel().Pu0(list2, list3);
                C1362650lZ1 c1362650lZ1 = this.LL;
                AbstractC1362700lZ6 abstractC1362700lZ6 = c1362650lZ1.LLIZLLLIL;
                if ((abstractC1362700lZ6 instanceof C1363390laD) && (c1363390laD = (C1363390laD) abstractC1362700lZ6) != null) {
                    c1363390laD.LJLL(c1362650lZ1.getRvSharePanelAvatarFromXml(), list2);
                }
            }

            @Override // X.InterfaceC1356390lOv
            public final boolean eJ2(IMContact iMContact, boolean z4) {
                boolean zEJ2 = this.LL.getViewModel().eJ2(iMContact, z4);
                if (z4) {
                    C1362630lYz.LIZ.getClass();
                    C1362630lYz.LIZJ();
                    return zEJ2;
                }
                C1362630lYz.LIZ.getClass();
                C1362630lYz.LIZLLL();
                return zEJ2;
            }
        }, C13BV.INSTANCE, sharePackage.extras.getBoolean("key_filter_group_chat"), sharePackage.extras.getBoolean("key_filter_group_camera_permission"), sharePackage.extras.getBoolean("key_filter_no_camera_permission"), this, fragment, this.LLJILJIL, false, true, null, null, null, 14848);
        sharePanelViewModelLIZ.LLJLLIL = fragment;
        sharePanelViewModelLIZ.LLJLLL = interfaceC1362720lZ8;
        sharePanelViewModelLIZ.LLJJL = sharePackage.extras.getString("key_default_select_id");
        sharePanelViewModelLIZ.LLJJLIIIJLLLLLLLZ = sharePackage.extras.getString("screenshot_image_path");
        setViewModel((SharePanelImHeadViewModel) new ViewModelProvider(fragment, new C1362320lYU(sharePackage, list, interfaceC1362900lZQ, sharePanelViewModelLIZ)).get(SharePanelImHeadViewModel.class));
        SharePanelImHeadViewModel viewModel = getViewModel();
        SharePackage sharePackage2 = null;
        C2296808zG.LIZJ(viewModel.LLJJIJIIJIL, null);
        viewModel.xQ2();
        LJ();
        SharePackage sharePackage3 = this.LLJI;
        if (sharePackage3 == null) {
            sharePackage3 = null;
        }
        if (!C1250860iei.LIZ(sharePackage3)) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            z = false;
            c897520ZIwLJI = C897370ZIh.LIZ().LJI(EnumC1910450zoZ.LONG_PRESS_PANEL, false);
        } else {
            z = false;
            InterfaceC897380ZIi.LIZIZ.getClass();
            c897520ZIwLJI = C897370ZIh.LIZ().LJI(EnumC1910450zoZ.SHARE_PANEL, false);
        }
        this.LLJJJIL = c897520ZIwLJI;
        int iIntValue = 4;
        if (enumC1369720lkQ == EnumC1369720lkQ.VERTICAL) {
            ViewGroup.LayoutParams layoutParams2 = getFloatingButtonContainerFromXml().getLayoutParams();
            FrameLayout floatingButtonContainerFromXml = getFloatingButtonContainerFromXml();
            layoutParams2.height = -1;
            C786410Ut5.a6(floatingButtonContainerFromXml, layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) getRvSharePanelAvatarFromXml().getLayoutParams();
            layoutParams3.height = -1;
            layoutParams3.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            layoutParams3.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            C1383380m6S rvSharePanelAvatarFromXml = getRvSharePanelAvatarFromXml();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(rvSharePanelAvatarFromXml);
            rvSharePanelAvatarFromXml.setLayoutParams(layoutParams3);
            getRvSharePanelAvatarFromXml().setBackgroundResource(R.drawable.caa);
            C426750GoL.LJIIL(getRvSharePanelAvatarFromXml(), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 16);
            this.LLIZLLLIL = new C1363410laF(getViewModel().LLJJIJIL, this.LLJ, this.LLJJ, this.LLJJJIL, z);
            getRvSharePanelAvatarFromXml().setLayoutManager(LIZLLL(1));
        } else {
            if (this.LLJILJIL != null) {
                ViewGroup.LayoutParams layoutParams4 = getRvSharePanelAvatarFromXml().getLayoutParams();
                if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams4) != null) {
                    C1362230lYL c1362230lYL2 = this.LLJILJIL;
                    if (c1362230lYL2 != null) {
                        iLIZIZ = c1362230lYL2.LIZIZ;
                    } else {
                        iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86));
                    }
                    layoutParams.height = iLIZIZ;
                    C1362230lYL c1362230lYL3 = this.LLJILJIL;
                    if (c1362230lYL3 != null) {
                        iLIZIZ2 = c1362230lYL3.LIZLLL;
                    } else {
                        iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    }
                    layoutParams.bottomMargin = iLIZIZ2;
                }
                C1362230lYL c1362230lYL4 = this.LLJILJIL;
                if (c1362230lYL4 != null && (num2 = c1362230lYL4.LJ) != null) {
                    int iIntValue2 = num2.intValue();
                    C1383380m6S rvSharePanelAvatarFromXml2 = getRvSharePanelAvatarFromXml();
                    C1362230lYL c1362230lYL5 = this.LLJILJIL;
                    if (c1362230lYL5 != null) {
                        num3 = c1362230lYL5.LJI;
                    } else {
                        num3 = null;
                    }
                    Integer numValueOf = Integer.valueOf(iIntValue2);
                    C1362230lYL c1362230lYL6 = this.LLJILJIL;
                    if (c1362230lYL6 != null) {
                        num4 = c1362230lYL6.LJII;
                        num5 = c1362230lYL6.LJFF;
                    } else {
                        num4 = null;
                        num5 = null;
                    }
                    C426750GoL.LJIIL(rvSharePanelAvatarFromXml2, num3, numValueOf, num4, num5, 16);
                }
            } else {
                ViewGroup.LayoutParams layoutParams5 = getRvSharePanelAvatarFromXml().getLayoutParams();
                if ((layoutParams5 instanceof RecyclerView.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                    marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86));
                    C1383380m6S rvSharePanelAvatarFromXml3 = getRvSharePanelAvatarFromXml();
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(rvSharePanelAvatarFromXml3);
                    rvSharePanelAvatarFromXml3.setLayoutParams(marginLayoutParams);
                }
            }
            if (LJII()) {
                C1383380m6S rvSharePanelAvatarFromXml4 = getRvSharePanelAvatarFromXml();
                C1362230lYL c1362230lYL7 = this.LLJILJIL;
                if (c1362230lYL7 != null && (num = c1362230lYL7.LJIJI) != null) {
                    iIntValue = num.intValue();
                }
                C1362230lYL c1362230lYL8 = this.LLJILJIL;
                if (c1362230lYL8 != null) {
                    i = c1362230lYL8.LJIJJ;
                    i2 = c1362230lYL8.LJIJJLI;
                } else {
                    i = 0;
                    i2 = 0;
                }
                rvSharePanelAvatarFromXml4.addItemDecoration(new C0DX3(iIntValue, i, i2));
            } else {
                C1383380m6S rvSharePanelAvatarFromXml5 = getRvSharePanelAvatarFromXml();
                C1362230lYL c1362230lYL9 = this.LLJILJIL;
                if (c1362230lYL9 != null) {
                    c424780GlA = new C424780GlA(c1362230lYL9.LJIIIIZZ, c1362230lYL9.LJIIIZ, c1362230lYL9.LJIIJ);
                } else {
                    c424780GlA = new C424780GlA(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)));
                }
                rvSharePanelAvatarFromXml5.addItemDecoration(c424780GlA);
            }
            C1363390laD c1363390laD = new C1363390laD(getViewModel().LLJJIJIL, this.LLJJJIL, getViewModel());
            this.LLIZLLLIL = c1363390laD;
            c1363390laD.LLJ = true;
            c1363390laD.LLJILJIL = this.LLJJ;
            getRvSharePanelAvatarFromXml().setLayoutManager(LIZLLL(LJII() ? 1 : 0));
            getRvSharePanelAvatarFromXml().setNestedScrollingEnabled(LJII());
            getRvSharePanelAvatarFromXml().addOnScrollListener(new AsS48S0100000_21(this, 5));
            if (C1697630uHJ.LIZIZ() > 1.0f && ((c1362230lYL = this.LLJILJIL) == null || !c1362230lYL.LJIJ)) {
                getRvSharePanelAvatarFromXml().getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
            }
        }
        C1383380m6S rvSharePanelAvatarFromXml6 = getRvSharePanelAvatarFromXml();
        if (rvSharePanelAvatarFromXml6 != null) {
            rvSharePanelAvatarFromXml6.setItemAnimator(null);
        }
        getRvSharePanelAvatarFromXml().setAdapter(this.LLIZLLLIL);
        C0VWN.LIZ("share_panel_im", z).LIZIZ(getRvSharePanelAvatarFromXml());
        AbstractC1362700lZ6 abstractC1362700lZ6 = this.LLIZLLLIL;
        if (abstractC1362700lZ6 != null) {
            abstractC1362700lZ6.LLLI(sharePanelViewModelLIZ);
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            activityLIZ = C1388190mED.LIZ(activityLIZIZ);
        } else {
            activityLIZ = null;
        }
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            this.LLJJJJJIL = (AssemViewModel) C1563370qml.LIZ(c19eg, EnumC682280QpW.MAIN, new AwS560S0100000_16(c19eg, 831));
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01KT(new AwS422S0200000_21(this, sharePackage, 108), null), 3);
            this.LLJJIJIL = str;
            if (this.LLJJJ == null && C1867550yhN.LIZ()) {
                InterfaceC897380ZIi.LIZIZ.getClass();
                C0ZJ9 c0zj9LJFF = C897370ZIh.LIZ().LJFF();
                if (!C1250860iei.LIZ(sharePackage)) {
                    enumC1910440zoY = EnumC1910440zoY.LONG_PRESS_PANEL;
                } else {
                    enumC1910440zoY = EnumC1910440zoY.SHARE_PANEL;
                }
                this.LLJJJ = c0zj9LJFF.LIZIZ(enumC1910440zoY, getRvSharePanelAvatarFromXml(), fragment, getContext(), fragment.getView());
                getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.internalshare.impl.ui.SharePanelImHeadLayout$setUp$3
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        C897520ZIw c897520ZIw;
                        int i3 = C2157408cm.LIZ[event.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3 && (c897520ZIw = this.LL.LLJJJIL) != null) {
                                    c897520ZIw.destroy();
                                    return;
                                }
                                return;
                            }
                            InterfaceC899440ZQg interfaceC899440ZQg = this.LL.LLJJJ;
                            if (interfaceC899440ZQg != null) {
                                interfaceC899440ZQg.onInvisible();
                            }
                            C897520ZIw c897520ZIw2 = this.LL.LLJJJIL;
                            if (c897520ZIw2 == null) {
                                return;
                            }
                            c897520ZIw2.LJII();
                            return;
                        }
                        InterfaceC899440ZQg interfaceC899440ZQg2 = this.LL.LLJJJ;
                        if (interfaceC899440ZQg2 != null) {
                            interfaceC899440ZQg2.onVisible();
                        }
                        C897520ZIw c897520ZIw3 = this.LL.LLJJJIL;
                        if (c897520ZIw3 == null) {
                            return;
                        }
                        c897520ZIw3.LJ();
                    }
                });
            }
            if (LJII()) {
                Fragment fragment2 = this.LLJILLL;
                if ((fragment2 instanceof SkeletonSharePanelFragment) && (skeletonSharePanelFragment = (SkeletonSharePanelFragment) fragment2) != null) {
                    skeletonSharePanelFragment.NS(this);
                }
            }
            Bundle bundle3 = sharePackage.extras;
            if (bundle3 != null) {
                z2 = bundle3.getBoolean("comment_direct_share");
            } else {
                z2 = false;
            }
            if ((z2 || ((bundle2 = sharePackage.extras) != null && bundle2.getBoolean("show_edit_send_direct_im_share"))) && (bundle = sharePackage.extras) != null && bundle.getBoolean("show_edit_send_direct_im_share")) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.LLJJJJLIIL = z3;
            if (getViewModel().LLJJIJIL.LLJIJIL && (this.LLJILLL instanceof SkeletonSharePanelFragment)) {
                SharePackage sharePackage4 = this.LLJI;
                if (sharePackage4 == null) {
                    sharePackage4 = null;
                }
                if (C1250860iei.LIZ(sharePackage4)) {
                    SharePackage sharePackage5 = this.LLJI;
                    if (sharePackage5 != null) {
                        sharePackage2 = sharePackage5;
                    }
                    C786410Ut5.LJJJI("button_type", "search_button", sharePackage2.extras);
                    C1367430lgj.LIZ.LJIIIIZZ(sharePackage2, "from_nav_bar");
                    HashMap<String, String> map = new HashMap<>();
                    map.put("to_user_id", "more");
                    map.put("rank_index", "-1");
                    map.put("icon_type", "search_icon");
                    map.put("share_relation_type", "");
                    map.put("panel_source", "share_panel");
                    map.put("share_follow_status", "");
                    InterfaceC1362600lYw interfaceC1362600lYw = this.LLJJ;
                    if (interfaceC1362600lYw != null) {
                        interfaceC1362600lYw.LIZLLL(map);
                    }
                    InterfaceC1362720lZ8 interfaceC1362720lZ82 = this.LLJJI;
                    if (interfaceC1362720lZ82 != null) {
                        interfaceC1362720lZ82.Ds(new AwS565S0100000_21(this, 1422));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
