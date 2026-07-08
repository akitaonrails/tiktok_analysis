package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting;

import X.AbstractC928510aGn;
import X.AbstractC934860aR2;
import X.C01GW;
import X.C01Z4;
import X.C098200Yq;
import X.C0IJT;
import X.C0KX4;
import X.C0UX6;
import X.C1161920gLG;
import X.C11NJ;
import X.C12ES;
import X.C1303170k15;
import X.C1324720kZq;
import X.C1338270kvh;
import X.C1555540qa8;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C1770850wBP;
import X.C1841350y17;
import X.C189200o6;
import X.C19475711Hn;
import X.C19EG;
import X.C19GS;
import X.C1AZW;
import X.C1EOY;
import X.C20441214yg;
import X.C20736316Cj;
import X.C20743416Fc;
import X.C21411718qp;
import X.C21411818qq;
import X.C21578619ce;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C439101nJ;
import X.C452501pT;
import X.C465640INu;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501540Jlg;
import X.C635860Owq;
import X.C766270U4b;
import X.C786410Ut5;
import X.C916490ZxP;
import X.C916740Zxo;
import X.C917140ZyS;
import X.C917290Zyh;
import X.C917300Zyi;
import X.C917320Zyk;
import X.C917520Zz4;
import X.C917750ZzR;
import X.C917810ZzX;
import X.C921220a52;
import X.C922760a7W;
import X.C923330a8R;
import X.C924620aAW;
import X.C924810aAp;
import X.C925150aBN;
import X.C928330aGV;
import X.C931790aM5;
import X.C931800aM6;
import X.C932160aMg;
import X.C932270aMr;
import X.C934790aQv;
import X.C934800aQw;
import X.C934890aR5;
import X.C935010aRH;
import X.C935060aRM;
import X.C935100aRQ;
import X.C935540aS8;
import X.C936270aTJ;
import X.C943990afl;
import X.C948450amx;
import X.C956790b0P;
import X.EnumC918790a17;
import X.EnumC918970a1P;
import X.EnumC918990a1R;
import X.EnumC919090a1b;
import X.EnumC930180aJU;
import X.EnumC931540aLg;
import X.EnumC936960aUQ;
import X.EnumC937290aUx;
import X.InterfaceC1303160k14;
import X.InterfaceC1809520xBm;
import X.InterfaceC302401Fe;
import X.InterfaceC665370Q7z;
import X.InterfaceC916700Zxk;
import X.InterfaceC934710aQn;
import X.InterfaceC935020aRI;
import X.InterfaceC948490an1;
import X.InterfaceC963450bB9;
import X.ViewOnClickListenerC934990aRF;
import X.ViewOnClickListenerC935080aRO;
import Y.AObserverS219S0100000_15;
import Y.AfS184S0100000_15;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.BaseMultiLiveSettingView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ISharedRevenueAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestAnchorShareRevenueViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.MultiGuestAnchorQuickConnectViewModel;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAutoApprovalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicAdminAuthorizationLinkOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestDecorationSetting;
import com.bytedance.android.livesdk.model.message.LinkLayoutMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import tikcast.linkmic.common.AnchorLayoutSetting;
import tikcast.linkmic.common.LinkerMediaChangeOperator;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiLiveSettingDialog extends BaseMultiLiveSettingView implements View.OnClickListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2HELIOSOzE6emE+KSwiZy49Ky0jO2EgLTE4PSY9L2sBPCMnIQklPyoALTE4ICE0DCwtJSA0";
    public ViewOnClickListenerC934990aRF A;
    public C20743416Fc B;
    public View C;
    public boolean H;
    public boolean I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f294J;
    public View LLJILJIL;
    public TextView LLJILJILJ;
    public View LLJILLL;
    public View LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public View LLJJJ;
    public ViewGroup LLJJJIL;
    public ViewGroup LLJJJJ;
    public C21411818qq LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public ViewGroup LLJJL;
    public C21411718qp LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public ViewGroup LLJLIL;
    public C1841350y17 LLJLILLLLZIIL;
    public ViewGroup LLJLL;
    public ViewGroup LLJLLIL;
    public C1841350y17 LLJLLL;
    public ViewGroup LLJZ;
    public ViewGroup LLJZIJLIL;
    public C21411718qp LLL;
    public ViewGroup LLLF;
    public ViewGroup LLLFF;
    public C1841350y17 LLLFFI;
    public ViewGroup LLLFZ;
    public ViewGroup LLLI;
    public C1841350y17 LLLII;
    public ViewGroup LLLIIII;
    public ViewGroup LLLIIIIL;
    public C1841350y17 LLLIIIL;
    public ViewGroup LLLIIL;
    public ViewGroup LLLIILIL;
    public C1841350y17 LLLIL;
    public ViewGroup LLLILZ;
    public ViewGroup LLLILZJ;
    public C21411818qq LLLILZLLLI;
    public ViewGroup LLLIZZ;
    public C21411718qp LLLJ;
    public View LLLJIL;
    public C21411718qp LLLJL;
    public View LLLL;
    public ViewGroup LLLLII;
    public ViewGroup LLLLIIIILLL;
    public View LLLLIIL;
    public C21411718qp LLLLIILL;
    public ViewGroup LLLLIILLL;
    public View LLLLIL;
    public C21411718qp LLLLILI;
    public ViewGroup LLLLJ;
    public View LLLLJI;
    public C21411718qp LLLLL;
    public ViewGroup LLLLLIL;
    public View LLLLLILLIL;
    public TextView LLLLLJIL;
    public TuxSheet LLLLLJLJLL;
    public C21411818qq LLLLLL;
    public boolean LLLLLLIL;
    public ViewOnClickListenerC935080aRO LLLLLLJ;
    public LayoutSettingContract LLLLLLL;
    public ViewGroup LLLLLLLLL;
    public View LLLLLLLLLL;
    public C21411818qq LLLLLLLZIL;
    public View LLLLLLZ;
    public C21411718qp LLLLLLZZ;
    public View LLLLLZ;
    public C21411718qp LLLLLZIL;
    public C21578619ce LLLLLZL;
    public ViewGroup LLLLZ;
    public ViewGroup LLLLZI;
    public C21411718qp LLLLZIL;
    public View LLLLZLL;
    public ViewGroup LLLLZLLIL;
    public TextView LLLLZLLLI;
    public TextView LLLZ;
    public LiveIconView LLLZI;
    public View LLLZIIL;
    public ViewGroup LLLZIL;
    public View LLLZL;
    public ViewGroup LLLZZ;
    public C1324720kZq LLLZZIL;
    public C1324720kZq LLZ;
    public ImageView LLZIL;
    public ImageView LLZILL;
    public View LLZL;
    public View LLZLI;
    public View LLZLL;
    public View LLZLLIL;
    public C21411718qp LLZLLLL;
    public boolean LLZZ;
    public boolean LLZZJLIL;
    public ISharedBgAbility LLZZLLIL;
    public boolean LLZZZIL;
    public boolean LLZZZZ;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public volatile boolean s;
    public boolean t;

    @InterfaceC948490an1(name = "MULTI_GUEST_V3_ANCHOR_USER_MANAGER")
    public InterfaceC302401Fe userManager;
    public final C01GW LLLZLL = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(62));
    public final C01GW LLLZLZ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(63));
    public final C01GW u = C452501pT.LIZIZ(new AwS559S0100000_15(this, 193));
    public final C01GW v = C452501pT.LIZIZ(new AwS559S0100000_15(this, 201));
    public final C01GW w = C452501pT.LIZIZ(new AwS559S0100000_15(this, 197));
    public final C01GW x = C452501pT.LIZIZ(new AwS559S0100000_15(this, 194));
    public final C01GW y = C452501pT.LIZIZ(new AwS559S0100000_15(this, 196));
    public final C01GW z = C452501pT.LIZIZ(new AwS559S0100000_15(this, 195));
    public final C11NJ D = new C11NJ();
    public final C934800aQw E = new InterfaceC916700Zxk() { // from class: X.0aQw
        @Override // X.InterfaceC916700Zxk
        public final void onSuccess() {
        }

        @Override // X.InterfaceC916700Zxk
        public final void LIZ(LinkCoreError linkCoreError) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error = ");
            sbLIZ.append(linkCoreError);
            C20441214yg.LIZIZ("MultiLiveAnchorSettingDialog", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC916700Zxk
        public final void LIZIZ(EnumC930180aJU enumC930180aJU) {
            this.LIZ.LL.dismiss();
        }
    };
    public final C01GW F = C452501pT.LIZIZ(new AwS559S0100000_15(this, 192));
    public final C934790aQv G = new InterfaceC935020aRI() { // from class: X.0aQv
        @Override // X.InterfaceC935020aRI
        public final MultiLiveAnchorPanelSettings LIZIZ() {
            return this.LIZ.LLILZ;
        }

        @Override // X.InterfaceC935020aRI
        public final void LIZJ() {
            this.LIZ.LL.dismiss();
        }

        @Override // X.InterfaceC935020aRI
        public final void LIZ(int i, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
            Long lValueOf;
            MultiLiveSettingDialog multiLiveSettingDialog = this.LIZ;
            AbstractC934860aR2 abstractC934860aR2 = (AbstractC934860aR2) multiLiveSettingDialog.LLILLL;
            if (abstractC934860aR2 != null) {
                DataChannel dataChannel = multiLiveSettingDialog.LLILZLL;
                Room roomBS = multiLiveSettingDialog.bS();
                if (roomBS != null) {
                    lValueOf = Long.valueOf(roomBS.getId());
                } else {
                    lValueOf = null;
                }
                abstractC934860aR2.LJIIL(dataChannel, lValueOf, Long.valueOf(this.LIZ.cS()), multiLiveAnchorPanelSettings, 6, null, null, null, i);
            }
        }
    };

    public final void BS() {
        C1841350y17 c1841350y17 = this.LLLFFI;
        if (c1841350y17 != null) {
            c1841350y17.setChecked(false);
        }
        C1841350y17 c1841350y172 = this.LLLII;
        if (c1841350y172 != null) {
            c1841350y172.setChecked(false);
        }
        C1841350y17 c1841350y173 = this.LLLIIIL;
        if (c1841350y173 != null) {
            c1841350y173.setChecked(false);
        }
        C1841350y17 c1841350y174 = this.LLLIL;
        if (c1841350y174 != null) {
            c1841350y174.setChecked(false);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.BaseMultiLiveSettingView
    public final void SR() {
        int height;
        View view = this.LLJILJIL;
        int iLJJI = (view == null || (height = view.getHeight()) == 0 || getActivity() == null) ? ((int) C497740JfY.LJJI((int) (((double) C497740JfY.LJIILLIIL()) * 0.7d))) - 52 : C465640INu.LIZJ(height, getActivity());
        this.LLIZ = iLJJI;
        this.LLIZLLLIL = iLJJI;
    }

    public final void ZR() {
        ImageView imageView = this.LLZIL;
        if (imageView != null) {
            imageView.setBackgroundResource(0);
        }
        ImageView imageView2 = this.LLZILL;
        if (imageView2 != null) {
            imageView2.setBackgroundResource(R.drawable.f6_);
        }
    }

    public final Room bS() {
        return (Room) this.LLLZLL.getValue();
    }

    public final int cS() {
        return ((Number) this.LLLZLZ.getValue()).intValue();
    }

    public final void kS() {
        LayoutSettingContract layoutSettingContract = this.LLLLLLL;
        if (layoutSettingContract != null) {
            layoutSettingContract.LJJIIZ(0);
        }
        if (getContext() != null) {
            TextView textView = this.LLJILJILJ;
            if (textView != null) {
                textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, getContext()));
            }
            TextView textView2 = this.LLJILJILJ;
            if (textView2 != null) {
                textView2.setTextSize(2, 15.0f);
            }
        }
    }

    public final boolean nS() {
        MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel = (MultiGuestAnchorQuickConnectViewModel) this.F.getValue();
        return (multiGuestAnchorQuickConnectViewModel != null ? multiGuestAnchorQuickConnectViewModel.yQ2() : null) == EnumC931540aLg.CALLING;
    }

    public final void uS() {
        User owner;
        C1841350y17 c1841350y17;
        ViewGroup viewGroup = this.LLLF;
        if (viewGroup != null) {
            C12ES.LJIILL(0, viewGroup);
        }
        ViewGroup viewGroup2 = this.LLLFZ;
        if (viewGroup2 != null) {
            C12ES.LJIILL(0, viewGroup2);
        }
        ViewGroup viewGroup3 = this.LLLIIII;
        if (viewGroup3 != null) {
            C12ES.LJIILL(0, viewGroup3);
        }
        ViewGroup viewGroup4 = this.LLLIIL;
        if (viewGroup4 != null) {
            C12ES.LJIILL(0, viewGroup4);
        }
        C21411718qp c21411718qp = this.LLL;
        if (c21411718qp != null) {
            c21411718qp.setChecked(true);
        }
        Room roomBS = bS();
        if (roomBS == null || (owner = roomBS.getOwner()) == null || owner.getSecret() != 1 || (c1841350y17 = this.LLLFFI) == null) {
            return;
        }
        c1841350y17.setEnabled(false);
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0aQw] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0aQv] */
    public MultiLiveSettingDialog() {
        C948450amx.LIZIZ.LIZJ(this);
    }

    public static MultiLiveAnchorPanelSettings dS() {
        return C924810aAp.LJ().LJJIII;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.D.LJ();
        LayoutSettingContract layoutSettingContract = this.LLLLLLL;
        if (layoutSettingContract != null) {
            layoutSettingContract.LJJIII();
        }
        if (this.LLLLLLJ != null) {
            C1AZW.LIZ.getClass();
            C1AZW.LIZ("GiftSettingContract", "[onDestroy]", null, null);
        }
        ((C935100aRQ) this.u.getValue()).release();
        ((C935100aRQ) this.v.getValue()).release();
        ((C935100aRQ) this.w.getValue()).release();
        ((C935100aRQ) this.z.getValue()).release();
        ((C935100aRQ) this.x.getValue()).release();
        ((C935100aRQ) this.y.getValue()).release();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C1EOY.LIZ.LJJII("multi_guest_anchor_setting_page");
    }

    public final boolean wS() {
        if (!nS()) {
            return false;
        }
        C766270U4b.LIZLLL(2131854708);
        return true;
    }

    public static void WR(View view) {
        if (view != null) {
            view.setEnabled(false);
            C786410Ut5.T4(view, 0.5f);
        }
    }

    public static void aS(View view) {
        if (view != null) {
            view.setEnabled(true);
            C786410Ut5.T4(view, 1.0f);
        }
    }

    public static void zS(EnumC918990a1R enumC918990a1R) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchLayoutInternal layoutName:");
        sbLIZ.append(enumC918990a1R);
        C20441214yg.LIZIZ("MultiLiveAnchorSettingDialog", C2188811AlT.LIZIZ(sbLIZ));
        C917290Zyh c917290Zyh = C917290Zyh.LIZ;
        C917290Zyh.LJIIL = "manual";
        C917290Zyh.LJIILIIL = "manual";
        c917290Zyh.LJIIIZ(enumC918990a1R, false);
    }

    public final void ES(int i) {
        if (!MultiGuestAutoApprovalSetting.INSTANCE.enable()) {
            return;
        }
        if (!nS()) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                BS();
                                uS();
                                C1841350y17 c1841350y17 = this.LLLIL;
                                if (c1841350y17 != null) {
                                    c1841350y17.setChecked(true);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        BS();
                        uS();
                        C1841350y17 c1841350y172 = this.LLLIIIL;
                        if (c1841350y172 == null) {
                            return;
                        }
                        c1841350y172.setChecked(true);
                        return;
                    }
                    BS();
                    uS();
                    C1841350y17 c1841350y173 = this.LLLII;
                    if (c1841350y173 == null) {
                        return;
                    }
                    c1841350y173.setChecked(true);
                    return;
                }
            } else {
                ViewGroup viewGroup = this.LLLF;
                if (viewGroup != null) {
                    C439101nJ.LJI(viewGroup);
                }
                ViewGroup viewGroup2 = this.LLLFZ;
                if (viewGroup2 != null) {
                    C439101nJ.LJI(viewGroup2);
                }
                ViewGroup viewGroup3 = this.LLLIIII;
                if (viewGroup3 != null) {
                    C439101nJ.LJI(viewGroup3);
                }
                ViewGroup viewGroup4 = this.LLLIIL;
                if (viewGroup4 != null) {
                    C439101nJ.LJI(viewGroup4);
                }
                C21411718qp c21411718qp = this.LLL;
                if (c21411718qp != null) {
                    c21411718qp.setChecked(false);
                }
                BS();
                return;
            }
        }
        BS();
        uS();
        C1841350y17 c1841350y174 = this.LLLFFI;
        if (c1841350y174 == null) {
            return;
        }
        c1841350y174.setChecked(true);
    }

    public final void FS(boolean z) {
        Integer numValueOf;
        Long lValueOf;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        int i;
        if (!C932270aMr.LJ()) {
            return;
        }
        String str = null;
        Integer numValueOf2 = null;
        str = null;
        str = null;
        if (!C917140ZyS.LIZ()) {
            C766270U4b.LIZLLL(2131843698);
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLILZ;
            if (multiLiveAnchorPanelSettings != null) {
                numValueOf2 = Integer.valueOf(multiLiveAnchorPanelSettings.disableGuestOpenCamera);
            }
            GS(false, numValueOf2);
            return;
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = this.LLILZ;
        if (multiLiveAnchorPanelSettings2 != null) {
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            multiLiveAnchorPanelSettings2.disableGuestOpenCamera = i;
            numValueOf = Integer.valueOf(multiLiveAnchorPanelSettings2.disableGuestOpenCamera);
        } else {
            numValueOf = null;
        }
        GS(false, numValueOf);
        AbstractC934860aR2 abstractC934860aR2 = (AbstractC934860aR2) this.LLILLL;
        if (abstractC934860aR2 != null) {
            DataChannel dataChannel = this.LLILZLL;
            Room roomBS = bS();
            if (roomBS != null) {
                lValueOf = Long.valueOf(roomBS.getId());
            } else {
                lValueOf = null;
            }
            Long lValueOf2 = Long.valueOf(cS());
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3 = this.LLILZ;
            ISharedBgAbility iSharedBgAbility = this.LLZZLLIL;
            if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
                str = state.LLILZ;
            }
            abstractC934860aR2.LJIIL(dataChannel, lValueOf, lValueOf2, multiLiveAnchorPanelSettings3, 12, null, null, C936270aTJ.LIZ(str), 14);
        }
    }

    public final void HS(MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        int i;
        int i2;
        if (nS()) {
            i = 3;
        } else {
            i = multiLiveAnchorPanelSettings.allowViewerReq;
        }
        if (nS()) {
            i2 = 4;
        } else {
            i2 = multiLiveAnchorPanelSettings.onlyAllowFollowerReq;
        }
        if (i != 0) {
            if (i != 3) {
                if (i == 4) {
                    C21411718qp c21411718qp = this.LLJJLIIIJLLLLLLLZ;
                    if (c21411718qp != null) {
                        c21411718qp.setChecked(false);
                    }
                    ViewGroup viewGroup = this.LLJL;
                    if (viewGroup != null) {
                        C439101nJ.LJI(viewGroup);
                    }
                    ViewGroup viewGroup2 = this.LLJLL;
                    if (viewGroup2 != null) {
                        C439101nJ.LJI(viewGroup2);
                    }
                }
            } else {
                C21411718qp c21411718qp2 = this.LLJJLIIIJLLLLLLLZ;
                if (c21411718qp2 != null) {
                    c21411718qp2.setChecked(true);
                }
                ViewGroup viewGroup3 = this.LLJL;
                if (viewGroup3 != null) {
                    C12ES.LJIILL(0, viewGroup3);
                }
                ViewGroup viewGroup4 = this.LLJLL;
                if (viewGroup4 != null) {
                    C12ES.LJIILL(0, viewGroup4);
                }
                if (!this.LLZZ) {
                    C935060aRM.LIZIZ();
                    this.LLZZ = true;
                }
            }
        } else {
            C21411718qp c21411718qp3 = this.LLJJLIIIJLLLLLLLZ;
            if (c21411718qp3 != null) {
                c21411718qp3.setChecked(true);
            }
            ViewGroup viewGroup5 = this.LLJL;
            if (viewGroup5 != null) {
                C12ES.LJIILL(0, viewGroup5);
            }
            ViewGroup viewGroup6 = this.LLJLL;
            if (viewGroup6 != null) {
                C12ES.LJIILL(0, viewGroup6);
            }
        }
        if (i2 != 0) {
            if (i2 != 3) {
                if (i2 == 4) {
                    C1841350y17 c1841350y17 = this.LLJLLL;
                    if (c1841350y17 != null) {
                        c1841350y17.setChecked(false);
                    }
                    C1841350y17 c1841350y172 = this.LLJLILLLLZIIL;
                    if (c1841350y172 != null) {
                        c1841350y172.setChecked(true);
                        return;
                    }
                    return;
                }
                return;
            }
            C1841350y17 c1841350y173 = this.LLJLLL;
            if (c1841350y173 != null) {
                c1841350y173.setChecked(true);
            }
            C1841350y17 c1841350y174 = this.LLJLILLLLZIIL;
            if (c1841350y174 == null) {
                return;
            }
            c1841350y174.setChecked(false);
            return;
        }
        C21411718qp c21411718qp4 = this.LLLJL;
        if (c21411718qp4 != null) {
            c21411718qp4.setChecked(false);
        }
        C1841350y17 c1841350y175 = this.LLJLILLLLZIIL;
        if (c1841350y175 == null) {
            return;
        }
        c1841350y175.setChecked(true);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.MultiLiveSettingDialogContract$AbsView
    public final void RR(boolean z) {
        C21411818qq c21411818qq = this.LLLLLLLZIL;
        if (c21411818qq != null) {
            c21411818qq.setChecked(z);
        }
    }

    public final void UR(int i) {
        Long lValueOf;
        int i2;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        AbstractC934860aR2 abstractC934860aR2 = (AbstractC934860aR2) this.LLILLL;
        if (abstractC934860aR2 != null) {
            DataChannel dataChannel = this.LLILZLL;
            Room roomBS = bS();
            String str = null;
            if (roomBS != null) {
                lValueOf = Long.valueOf(roomBS.getId());
            } else {
                lValueOf = null;
            }
            Long lValueOf2 = Long.valueOf(cS());
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLILZ;
            ISharedBgAbility iSharedBgAbility = this.LLZZLLIL;
            if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
                str = state.LLILZ;
            }
            String strLIZ = C936270aTJ.LIZ(str);
            if (C931790aM5.LIZIZ()) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            abstractC934860aR2.LJIIJ(dataChannel, lValueOf, lValueOf2, multiLiveAnchorPanelSettings, i, null, null, strLIZ, i2);
        }
    }

    public final void gS(boolean z) {
        Long lValueOf;
        int i;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        if (!C917140ZyS.LIZ()) {
            C766270U4b.LIZLLL(2131843698);
            return;
        }
        if (z) {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLILZ;
            if (multiLiveAnchorPanelSettings != null) {
                if (multiLiveAnchorPanelSettings.onlyAllowFollowerReq == 3) {
                    C917320Zyk.LIZIZ(EnumC918790a17.CLOSE_PERMISSION_FROM_VIEWERS);
                }
                multiLiveAnchorPanelSettings.allowViewerReq = 4;
            }
            ViewGroup viewGroup = this.LLJL;
            if (viewGroup != null) {
                C439101nJ.LJI(viewGroup);
            }
            ViewGroup viewGroup2 = this.LLJLL;
            if (viewGroup2 != null) {
                C439101nJ.LJI(viewGroup2);
            }
        } else {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = this.LLILZ;
            if (multiLiveAnchorPanelSettings2 != null) {
                multiLiveAnchorPanelSettings2.allowViewerReq = 3;
                multiLiveAnchorPanelSettings2.onlyAllowFollowerReq = 4;
            }
            C1841350y17 c1841350y17 = this.LLJLILLLLZIIL;
            if (c1841350y17 != null) {
                c1841350y17.setChecked(true);
            }
            C1841350y17 c1841350y172 = this.LLJLLL;
            if (c1841350y172 != null) {
                c1841350y172.setChecked(false);
            }
            ViewGroup viewGroup3 = this.LLJL;
            if (viewGroup3 != null) {
                C12ES.LJIILL(0, viewGroup3);
            }
            ViewGroup viewGroup4 = this.LLJLL;
            if (viewGroup4 != null) {
                C12ES.LJIILL(0, viewGroup4);
            }
        }
        AbstractC934860aR2 abstractC934860aR2 = (AbstractC934860aR2) this.LLILLL;
        if (abstractC934860aR2 != null) {
            DataChannel dataChannel = this.LLILZLL;
            Room roomBS = bS();
            String str = null;
            if (roomBS != null) {
                lValueOf = Long.valueOf(roomBS.getId());
            } else {
                lValueOf = null;
            }
            Long lValueOf2 = Long.valueOf(cS());
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3 = this.LLILZ;
            ISharedBgAbility iSharedBgAbility = this.LLZZLLIL;
            if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
                str = state.LLILZ;
            }
            String strLIZ = C936270aTJ.LIZ(str);
            if (C931790aM5.LIZIZ()) {
                i = 4;
            } else {
                i = 0;
            }
            abstractC934860aR2.LJIIJ(dataChannel, lValueOf, lValueOf2, multiLiveAnchorPanelSettings3, 2, null, null, strLIZ, i);
        }
    }

    public final void hS(int i) {
        Long lValueOf;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        ES(i);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_layoutsettings_auto_accept_request_sub");
        C924620aAW.LJIILIIL(c474500IjALIZ);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "switch_to");
        c474500IjALIZ.LIZ();
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLILZ;
        if (multiLiveAnchorPanelSettings != null) {
            multiLiveAnchorPanelSettings.multiGuestApplyAutoApprove = i;
        }
        AbstractC934860aR2 abstractC934860aR2 = (AbstractC934860aR2) this.LLILLL;
        if (abstractC934860aR2 != null) {
            DataChannel dataChannel = this.LLILZLL;
            Room roomBS = bS();
            String str = null;
            if (roomBS != null) {
                lValueOf = Long.valueOf(roomBS.getId());
            } else {
                lValueOf = null;
            }
            Long lValueOf2 = Long.valueOf(cS());
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = this.LLILZ;
            ISharedBgAbility iSharedBgAbility = this.LLZZLLIL;
            if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
                str = state.LLILZ;
            }
            abstractC934860aR2.LJIIL(dataChannel, lValueOf, lValueOf2, multiLiveAnchorPanelSettings2, 15, null, null, C936270aTJ.LIZ(str), 7);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.MultiLiveSettingDialogContract$AbsView
    public final void hy(Throwable th) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZ;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdateAnchorPanelSettingsFail:");
        sbLIZ.append(th);
        C20441214yg.LJ("MultiLiveAnchorSettingDialog", C2188811AlT.LIZIZ(sbLIZ));
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsDS = dS();
        Integer numValueOf = null;
        if (multiLiveAnchorPanelSettingsDS != null) {
            multiLiveAnchorPanelSettingsLIZ = MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettingsDS, 0, 0, 0, 8388607);
        } else {
            multiLiveAnchorPanelSettingsLIZ = null;
        }
        this.LLILZ = multiLiveAnchorPanelSettingsLIZ;
        if (multiLiveAnchorPanelSettingsLIZ != null) {
            ES(multiLiveAnchorPanelSettingsLIZ.multiGuestApplyAutoApprove);
        }
        C21411818qq c21411818qq = this.LLLLLLLZIL;
        if (c21411818qq != null) {
            if (!c21411818qq.isChecked()) {
                z = true;
            } else {
                z = false;
            }
            c21411818qq.setChecked(z);
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLILZ;
        if (multiLiveAnchorPanelSettings != null) {
            numValueOf = Integer.valueOf(multiLiveAnchorPanelSettings.disableGuestOpenCamera);
        }
        GS(false, numValueOf);
        C501540Jlg.LIZLLL(getContext(), th, 2131851936);
    }

    public final void iS(boolean z) {
        Long lValueOf;
        int i;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        if (!C917140ZyS.LIZ()) {
            C766270U4b.LIZLLL(2131843698);
            return;
        }
        C917320Zyk.LIZIZ(EnumC918790a17.MANUAL_SETTING);
        boolean z2 = false;
        if (!z) {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLILZ;
            if (multiLiveAnchorPanelSettings != null) {
                multiLiveAnchorPanelSettings.allowViewerReq = 3;
                multiLiveAnchorPanelSettings.onlyAllowFollowerReq = 3;
            }
            C1841350y17 c1841350y17 = this.LLJLILLLLZIIL;
            if (c1841350y17 != null) {
                c1841350y17.setChecked(false);
            }
            C1841350y17 c1841350y172 = this.LLJLLL;
            if (c1841350y172 != null) {
                c1841350y172.setChecked(true);
            }
        } else {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = this.LLILZ;
            if (multiLiveAnchorPanelSettings2 != null) {
                multiLiveAnchorPanelSettings2.onlyAllowFollowerReq = 4;
            }
        }
        AbstractC934860aR2 abstractC934860aR2 = (AbstractC934860aR2) this.LLILLL;
        if (abstractC934860aR2 != null) {
            DataChannel dataChannel = this.LLILZLL;
            Room roomBS = bS();
            String str = null;
            if (roomBS != null) {
                lValueOf = Long.valueOf(roomBS.getId());
            } else {
                lValueOf = null;
            }
            Long lValueOf2 = Long.valueOf(cS());
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3 = this.LLILZ;
            ISharedBgAbility iSharedBgAbility = this.LLZZLLIL;
            if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
                str = state.LLILZ;
            }
            String strLIZ = C936270aTJ.LIZ(str);
            if (C931790aM5.LIZIZ()) {
                i = 4;
            } else {
                i = 0;
            }
            abstractC934860aR2.LJIIJ(dataChannel, lValueOf, lValueOf2, multiLiveAnchorPanelSettings3, 3, null, null, strLIZ, i);
        }
        EnumC918790a17 enumC918790a17 = EnumC918790a17.OPEN_MODE;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings4 = this.LLILZ;
        if (multiLiveAnchorPanelSettings4 != null && multiLiveAnchorPanelSettings4.allowViewerReq == 3) {
            z2 = true;
        }
        C917300Zyi.LIZ(enumC918790a17, z2, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:263:0x04a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mS(android.view.View r24) {
        /*
            Method dump skipped, instruction units count: 1253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog.mS(android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0700  */
    /* JADX WARN: Removed duplicated region for block: B:617:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v64 */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r19) {
        /*
            Method dump skipped, instruction units count: 2525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog.onClick(android.view.View):void");
    }

    public final void qS(String str) {
        boolean z;
        AbstractC928510aGn abstractC928510aGnLIZ;
        String str2;
        int i;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        List listLJIL;
        InterfaceC302401Fe interfaceC302401Fe;
        View view = this.LLZL;
        int size = 0;
        if (view != null && view.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if ((objLJIIIZ instanceof InterfaceC302401Fe) && (interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ) != null) {
            abstractC928510aGnLIZ = interfaceC302401Fe.LIZ();
        } else {
            abstractC928510aGnLIZ = null;
        }
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (abstractC928510aGnLIZ != null && (listLJIL = abstractC928510aGnLIZ.LJIL()) != null) {
            size = listLJIL.size();
        }
        map.put("request_list_ucnt", String.valueOf(size));
        map.put("to_display_type", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_first_time_click", str2);
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        int i2 = -1;
        if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLIZJ.LIZIZ()) != null) {
            i = multiLiveAnchorPanelSettingsLIZIZ2.layoutType;
        } else {
            i = -1;
        }
        MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ2.LIZIZ()) != null) {
            i2 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
        }
        EnumC918970a1P enumC918970a1PLJFF = C917140ZyS.LJFF(i, i2);
        map.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJFF).getFirst());
        map.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJFF).getSecond());
        C0KX4.LIZ("livesdk_anchor_guest_request_display_setting_click", map, null, true);
    }

    public final void rS(String str) {
        Long lValueOf;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        AbstractC934860aR2 abstractC934860aR2 = (AbstractC934860aR2) this.LLILLL;
        if (abstractC934860aR2 != null) {
            DataChannel dataChannel = this.LLILZLL;
            Room roomBS = bS();
            String str2 = null;
            if (roomBS != null) {
                lValueOf = Long.valueOf(roomBS.getId());
            } else {
                lValueOf = null;
            }
            long jCS = cS();
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLILZ;
            ISharedBgAbility iSharedBgAbility = this.LLZZLLIL;
            if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
                str2 = state.LLILZ;
            }
            abstractC934860aR2.LJIIJ(dataChannel, lValueOf, Long.valueOf(jCS), multiLiveAnchorPanelSettings, 13, str, null, C936270aTJ.LIZ(str2), 3);
        }
    }

    public final void yS(final LinkLayoutMessage linkLayoutMessage) {
        C1303170k15 c1303170k15Y22;
        if (C931790aM5.LIZIZ()) {
            LinkerMediaChangeOperator linkerMediaChangeOperator = linkLayoutMessage.operatorUserInfo;
            if (linkerMediaChangeOperator != null) {
                C923330a8R c923330a8R = C923330a8R.LIZ;
                C923330a8R.LJIIJJI(linkerMediaChangeOperator, new AwS594S0100000_15(linkLayoutMessage, 203));
                return;
            }
            return;
        }
        if (linkLayoutMessage.messageType == 1 && (c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22()) != null) {
            c1303170k15Y22.LJJL(0, linkLayoutMessage.layoutId, new InterfaceC1303160k14() { // from class: X.0aQs
                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) {
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZ;
                    if (layout == null) {
                        C923330a8R c923330a8R2 = C923330a8R.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("BaseMultiLiveAnchorSettingView_switchLayoutAndUpdateSetting onQueried:");
                        sbLIZ.append(linkLayoutMessage.layoutId);
                        sbLIZ.append(" failed!");
                        C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLILZ;
                    EnumC918990a1R enumC918990a1RLIZ = null;
                    if (multiLiveAnchorPanelSettings != null) {
                        multiLiveAnchorPanelSettingsLIZ = MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettings, 0, 0, 0, 8388607);
                    } else {
                        multiLiveAnchorPanelSettingsLIZ = null;
                    }
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = this.LLILZ;
                    if (multiLiveAnchorPanelSettings2 != null) {
                        int i = C917140ZyS.LIZ;
                        Pair<Integer, Integer> pairLIZLLL = C917140ZyS.LIZLLL(layout.businessType);
                        if (pairLIZLLL != null) {
                            multiLiveAnchorPanelSettings2.layoutType = pairLIZLLL.getFirst().intValue();
                            multiLiveAnchorPanelSettings2.fixMicNumAction = pairLIZLLL.getSecond().intValue();
                        }
                    }
                    LinkerMediaChangeOperator linkerMediaChangeOperator2 = linkLayoutMessage.operatorUserInfo;
                    if (linkerMediaChangeOperator2 != null) {
                        C923330a8R c923330a8R3 = C923330a8R.LIZ;
                        C923330a8R.LJIIJJI(linkerMediaChangeOperator2, new AwS224S0300000_15(multiLiveAnchorPanelSettingsLIZ, this, layout, 7));
                    }
                    C923330a8R c923330a8R4 = C923330a8R.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("after update setting:");
                    sbLIZ2.append(this.LLILZ);
                    C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ2));
                    MultiLiveSettingDialog multiLiveSettingDialog = this;
                    LayoutSettingContract layoutSettingContract = multiLiveSettingDialog.LLLLLLL;
                    if (layoutSettingContract == null) {
                        layoutSettingContract = new LayoutSettingContract(multiLiveSettingDialog.getContext(), multiLiveSettingDialog.LLILZLL, multiLiveSettingDialog.LLILZIL, new AwS559S0100000_15(multiLiveSettingDialog, 771), new C987250bnX(multiLiveSettingDialog, 1), new AwS559S0100000_15(multiLiveSettingDialog, 774), multiLiveSettingDialog.E, multiLiveSettingDialog.LLJIJIL, null, null, false, multiLiveSettingDialog.o, null, 5888);
                    }
                    LinkLayoutMessage linkLayoutMessage2 = linkLayoutMessage;
                    int i2 = linkLayoutMessage2.maxPosition;
                    String str = linkLayoutMessage2.layoutId;
                    MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings3 = this.LLILZ;
                    if (multiLiveAnchorPanelSettings3 != null) {
                        enumC918990a1RLIZ = C923170a8B.LIZ(multiLiveAnchorPanelSettings3);
                    }
                    layoutSettingContract.LIZIZ(i2, str, C922550a7B.LIZJ(enumC918990a1RLIZ), null, 11, null);
                }
            }, null);
        }
    }

    public final void GS(boolean z, Integer num) {
        String str;
        int i;
        if (!C932270aMr.LJ()) {
            return;
        }
        boolean z2 = !C932270aMr.LIZJ(num);
        TextView textView = this.LLLLLJIL;
        if (textView != null) {
            if (z2) {
                i = 2131854254;
            } else {
                i = 2131854250;
            }
            textView.setText(i);
        }
        if (z) {
            if (z2) {
                str = "open";
            } else {
                str = "close";
            }
            C932160aMg.LIZIZ("camara_permission_show", str);
        }
        C21411818qq c21411818qq = this.LLLLLL;
        if (c21411818qq != null) {
            this.LLLLLLIL = true;
            c21411818qq.setChecked(z2);
            this.LLLLLLIL = false;
        }
    }

    public final void oS(Boolean bool, String str) {
        boolean zBooleanValue;
        InterfaceC302401Fe interfaceC302401Fe;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            View view = this.LLZL;
            if (view != null && view.getVisibility() == 0) {
                zBooleanValue = true;
            } else {
                zBooleanValue = false;
            }
        }
        Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        AbstractC928510aGn abstractC928510aGnLIZ = null;
        if ((objLJIIIZ instanceof InterfaceC302401Fe) && (interfaceC302401Fe = (InterfaceC302401Fe) objLJIIIZ) != null) {
            abstractC928510aGnLIZ = interfaceC302401Fe.LIZ();
        }
        C921220a52.LIZIZ(str, zBooleanValue, abstractC928510aGnLIZ);
    }

    public static void VR(View view, Function0 function0, Function0 function02) {
        boolean globalVisibleRect;
        float f;
        if (((Boolean) function0.invoke()).booleanValue()) {
            return;
        }
        Rect rect = new Rect();
        if (view != null) {
            globalVisibleRect = view.getGlobalVisibleRect(rect);
            int iWidth = rect.width() * rect.height();
            int width = view.getWidth() * view.getHeight();
            if (width > 0) {
                f = iWidth / width;
            }
            if (!globalVisibleRect && f >= 0.5f && !((Boolean) function0.invoke()).booleanValue()) {
                C20441214yg.LIZIZ("MultiLiveAnchorSettingDialog", "entranceLayout is Visible");
                function02.invoke();
                return;
            } else {
                C20441214yg.LIZIZ("MultiLiveAnchorSettingDialog", "entranceLayout is inVisible");
            }
        }
        globalVisibleRect = false;
        f = 0.0f;
        if (!globalVisibleRect) {
        }
        C20441214yg.LIZIZ("MultiLiveAnchorSettingDialog", "entranceLayout is inVisible");
    }

    /* JADX WARN: Removed duplicated region for block: B:190:0x02d7  */
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.MultiLiveSettingDialogContract$AbsView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void PR(java.lang.String r14, int r15, X.EnumC930180aJU r16) {
        /*
            Method dump skipped, instruction units count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog.PR(java.lang.String, int, X.0aJU):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        int i;
        Object objGg0;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZ;
        Object objGg02;
        Object objGg03;
        String strLJIJI;
        View viewFindViewById;
        View viewFindViewById2;
        View view;
        View viewFindViewById3;
        C19475711Hn c19475711Hn;
        MutableLiveData<AnchorLayoutSetting> mutableLiveData;
        MutableLiveData<MultiLiveAnchorPanelSettings> mutableLiveData2;
        MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModelKn1;
        boolean z;
        Integer numValueOf;
        int i2;
        boolean zLIZ;
        Integer numValueOf2;
        C916740Zxo state;
        C916740Zxo state2;
        C916740Zxo state3;
        InterfaceC665370Q7z interfaceC665370Q7z;
        ISharedRevenueAbility iSharedRevenueAbility;
        View viewFindViewById4;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C943990afl.LIZ().LJ();
        C1EOY c1eoy = C1EOY.LIZ;
        InterfaceC963450bB9 interfaceC963450bB9 = this.LL;
        C19GS c19gs = null;
        if (interfaceC963450bB9 != null) {
            window = interfaceC963450bB9.getWindow();
        } else {
            window = null;
        }
        c1eoy.LJIJI(window, "multi_guest_anchor_setting_page");
        MultiGuestDecorationSetting multiGuestDecorationSetting = MultiGuestDecorationSetting.INSTANCE;
        if (multiGuestDecorationSetting.adjustSettingOrder()) {
            i = R.layout.g9q;
        } else {
            i = R.layout.g9p;
        }
        View viewTd = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        this.LLJILJIL = viewTd;
        C943990afl.LIZ().LIZIZ();
        this.LLLLLZL = (C21578619ce) viewTd.findViewById(R.id.uxg);
        this.LLJJIII = viewTd.findViewById(R.id.i4t);
        this.LLJILJILJ = (TextView) viewTd.findViewById(R.id.zte);
        this.LLJILLL = viewTd.findViewById(R.id.toj);
        this.LLJJ = viewTd.findViewById(R.id.ztf);
        this.LLJJI = viewTd.findViewById(R.id.k1f);
        this.LLJJIJIIJIL = viewTd.findViewById(R.id.ojv);
        this.LLJJIJIL = viewTd.findViewById(R.id.ojt);
        this.LLJJJ = viewTd.findViewById(R.id.ojs);
        this.LLJJJIL = (ViewGroup) viewTd.findViewById(R.id.tpw);
        this.B = (C20743416Fc) viewTd.findViewById(R.id.voice_wave_content);
        this.C = viewTd.findViewById(R.id.voice_wave_space);
        this.LLJJJJ = (ViewGroup) viewTd.findViewById(R.id.t72);
        this.LLJJJJJIL = (C21411818qq) viewTd.findViewById(R.id.t7a);
        this.LLJJIJI = viewTd.findViewById(R.id.tq4);
        ViewGroup viewGroup2 = (ViewGroup) viewTd.findViewById(R.id.axf);
        if (viewGroup2 != null) {
            if (MultiGuestAutoApprovalSetting.INSTANCE.isOptAllowUserReqUI()) {
                C12ES.LJIILL(0, viewGroup2);
            } else {
                C439101nJ.LJI(viewGroup2);
            }
        } else {
            viewGroup2 = null;
        }
        this.LLJJJJLIIL = viewGroup2;
        this.LLJJL = (ViewGroup) viewTd.findViewById(R.id.axn);
        this.LLJJLIIIJLLLLLLLZ = (C21411718qp) viewTd.findViewById(R.id.axo);
        this.LLJL = (ViewGroup) viewTd.findViewById(R.id.axg);
        this.LLJLIL = (ViewGroup) viewTd.findViewById(R.id.axh);
        this.LLJLILLLLZIIL = (C1841350y17) viewTd.findViewById(R.id.axi);
        this.LLJLL = (ViewGroup) viewTd.findViewById(R.id.axk);
        this.LLJLLIL = (ViewGroup) viewTd.findViewById(R.id.axl);
        this.LLJLLL = (C1841350y17) viewTd.findViewById(R.id.axm);
        ViewGroup viewGroup3 = (ViewGroup) viewTd.findViewById(R.id.bcu);
        if (viewGroup3 != null) {
            if (!C917810ZzX.LJIIIIZZ() && MultiGuestAutoApprovalSetting.INSTANCE.enable()) {
                C12ES.LJIILL(0, viewGroup3);
            } else {
                C439101nJ.LJI(viewGroup3);
            }
        } else {
            viewGroup3 = null;
        }
        this.LLJZ = viewGroup3;
        this.LLJZIJLIL = (ViewGroup) viewTd.findViewById(R.id.bd_);
        this.LLL = (C21411718qp) viewTd.findViewById(R.id.bdd);
        this.LLLF = (ViewGroup) viewTd.findViewById(R.id.bcv);
        this.LLLFF = (ViewGroup) viewTd.findViewById(R.id.bcw);
        this.LLLFFI = (C1841350y17) viewTd.findViewById(R.id.bcx);
        this.LLLFZ = (ViewGroup) viewTd.findViewById(R.id.bcz);
        this.LLLI = (ViewGroup) viewTd.findViewById(R.id.bd0);
        this.LLLII = (C1841350y17) viewTd.findViewById(R.id.bd1);
        this.LLLIIII = (ViewGroup) viewTd.findViewById(R.id.bd2);
        this.LLLIIIIL = (ViewGroup) viewTd.findViewById(R.id.bd3);
        this.LLLIIIL = (C1841350y17) viewTd.findViewById(R.id.bd5);
        this.LLLIIL = (ViewGroup) viewTd.findViewById(R.id.bd6);
        this.LLLIILIL = (ViewGroup) viewTd.findViewById(R.id.bd7);
        this.LLLIL = (C1841350y17) viewTd.findViewById(R.id.bd8);
        this.LLLILZJ = (ViewGroup) viewTd.findViewById(R.id.e39);
        this.LLLILZLLLI = (C21411818qq) viewTd.findViewById(R.id.e38);
        ViewGroup viewGroup4 = (ViewGroup) viewTd.findViewById(R.id.e36);
        if (viewGroup4 != null) {
            C931800aM6.LIZ.getClass();
            if (C931800aM6.LIZIZ()) {
                C12ES.LJIILL(0, viewGroup4);
            } else {
                C439101nJ.LJI(viewGroup4);
            }
        } else {
            viewGroup4 = null;
        }
        this.LLLILZ = viewGroup4;
        ViewGroup viewGroup5 = (ViewGroup) viewTd.findViewById(R.id.ax8);
        if (viewGroup5 != null) {
            if (!C925150aBN.LJJIII() && !MultiGuestAutoApprovalSetting.INSTANCE.isOptAllowUserReqUI()) {
                C12ES.LJIILL(0, viewGroup5);
            } else {
                C439101nJ.LJI(viewGroup5);
            }
        } else {
            viewGroup5 = null;
        }
        this.LLLIZZ = viewGroup5;
        this.LLLJ = (C21411718qp) viewTd.findViewById(R.id.wvf);
        this.LLLJIL = viewTd.findViewById(R.id.viewer_permission_switch_layout);
        this.LLLJL = (C21411718qp) viewTd.findViewById(R.id.wuj);
        this.LLLL = viewTd.findViewById(R.id.png);
        ViewGroup viewGroup6 = (ViewGroup) viewTd.findViewById(R.id.pnf);
        if (viewGroup6 != null) {
            if (!C925150aBN.LJJIII() && !MultiGuestAutoApprovalSetting.INSTANCE.isOptAllowUserReqUI()) {
                C12ES.LJIILL(0, viewGroup6);
            } else {
                C439101nJ.LJI(viewGroup6);
            }
        } else {
            viewGroup6 = null;
        }
        this.LLLLII = viewGroup6;
        ViewGroup viewGroup7 = (ViewGroup) viewTd.findViewById(R.id.im_);
        if (viewGroup7 != null) {
            if (C925150aBN.LJJIII()) {
                C12ES.LJIILL(0, viewGroup7);
            } else {
                C439101nJ.LJI(viewGroup7);
            }
        } else {
            viewGroup7 = null;
        }
        this.LLLLIIIILLL = viewGroup7;
        this.LLLLIIL = viewTd.findViewById(R.id.ima);
        this.LLLLIILL = (C21411718qp) viewTd.findViewById(R.id.wu8);
        ViewGroup viewGroup8 = (ViewGroup) viewTd.findViewById(R.id.igc);
        if (viewGroup8 != null) {
            if (C925150aBN.LJJIII()) {
                C12ES.LJIILL(0, viewGroup8);
            } else {
                C439101nJ.LJI(viewGroup8);
            }
        } else {
            viewGroup8 = null;
        }
        this.LLLLIILLL = viewGroup8;
        this.LLLLIL = viewTd.findViewById(R.id.igd);
        this.LLLLILI = (C21411718qp) viewTd.findViewById(R.id.wu7);
        ViewGroup viewGroup9 = (ViewGroup) viewTd.findViewById(R.id.pvf);
        if (viewGroup9 != null) {
            if (C925150aBN.LJJIII()) {
                C12ES.LJIILL(0, viewGroup9);
            } else {
                C439101nJ.LJI(viewGroup9);
            }
        } else {
            viewGroup9 = null;
        }
        this.LLLLJ = viewGroup9;
        this.LLLLJI = viewTd.findViewById(R.id.pvg);
        this.LLLLL = (C21411718qp) viewTd.findViewById(R.id.wum);
        ViewGroup viewGroup10 = (ViewGroup) viewTd.findViewById(R.id.j9z);
        if (viewGroup10 != null) {
            if (C932270aMr.LJ()) {
                C12ES.LJIILL(0, viewGroup10);
            } else {
                C439101nJ.LJI(viewGroup10);
            }
        } else {
            viewGroup10 = null;
        }
        this.LLLLLIL = viewGroup10;
        this.LLLLLILLIL = viewTd.findViewById(R.id.j_4);
        this.LLLLLJIL = (TextView) viewTd.findViewById(R.id.j_3);
        this.LLLLLLLLL = (ViewGroup) viewTd.findViewById(R.id.tc6);
        this.LLLLLLLZIL = (C21411818qq) viewTd.findViewById(R.id.tc8);
        View viewFindViewById5 = viewTd.findViewById(R.id.tc9);
        this.LLLLLLLLLL = viewFindViewById5;
        if (viewFindViewById5 != null) {
            C500260Jjc.LJLIIL(this, viewFindViewById5);
        }
        this.LLLLZ = (ViewGroup) viewTd.findViewById(R.id.ada);
        this.LLLLZIL = (C21411718qp) viewTd.findViewById(R.id.adc);
        ViewGroup viewGroup11 = (ViewGroup) viewTd.findViewById(R.id.add);
        this.LLLLZI = viewGroup11;
        if (viewGroup11 != null) {
            C786410Ut5.K7(viewGroup11, this);
        }
        this.LLLLLZ = viewTd.findViewById(R.id.m_7);
        this.LLLLLZIL = (C21411718qp) viewTd.findViewById(R.id.m_6);
        View view2 = this.LLLLLZ;
        if (view2 != null) {
            C500260Jjc.LJLIIIL(500L, view2, new AwS594S0100000_15(this, 206));
        }
        this.LLLLZLL = viewTd.findViewById(R.id.j53);
        TextView textView = (TextView) viewTd.findViewById(R.id.ztd);
        if (textView != null) {
            if (C925150aBN.LJJIII()) {
                textView.setText(2131854213);
            } else {
                textView.setText(2131843371);
            }
        }
        C21578619ce c21578619ce = this.LLLLLZL;
        if (c21578619ce != null) {
            c21578619ce.setOnScrollChangeListener(new InterfaceC1809520xBm() { // from class: X.0aR6
                @Override // X.InterfaceC1809520xBm
                public final void LIZ(C21578619ce c21578619ce2, int i3, int i4, int i5, int i6) {
                    MultiLiveSettingDialog multiLiveSettingDialog = this.LIZ;
                    MultiLiveSettingDialog.VR(multiLiveSettingDialog.LLJJJIL, new AwS559S0100000_15(multiLiveSettingDialog, 202), new AwS559S0100000_15(this.LIZ, 203));
                    MultiLiveSettingDialog multiLiveSettingDialog2 = this.LIZ;
                    MultiLiveSettingDialog.VR(multiLiveSettingDialog2.LLJJJJ, new AwS559S0100000_15(multiLiveSettingDialog2, 204), new AwS559S0100000_15(this.LIZ, 205));
                    MultiLiveSettingDialog multiLiveSettingDialog3 = this.LIZ;
                    MultiLiveSettingDialog.VR(multiLiveSettingDialog3.LLLLLLLLLL, new AwS559S0100000_15(multiLiveSettingDialog3, 206), new AwS559S0100000_15(this.LIZ, 207));
                }
            });
        }
        View view3 = this.LLJJ;
        if (view3 != null) {
            C500260Jjc.LJLIIL(this, view3);
        }
        View view4 = this.LLJJI;
        if (view4 != null) {
            C500260Jjc.LJLIIL(this, view4);
        }
        View view5 = this.LLJJ;
        int i3 = 8;
        if (view5 != null) {
            C635860Owq.LIZ.LIZJ(8, view5);
        }
        View view6 = this.LLJJI;
        if (view6 != null) {
            C635860Owq.LIZ.LIZJ(8, view6);
        }
        ViewGroup viewGroup12 = this.LLJJL;
        if (viewGroup12 != null) {
            C786410Ut5.K7(viewGroup12, this);
        }
        ViewGroup viewGroup13 = this.LLJLIL;
        if (viewGroup13 != null) {
            C786410Ut5.K7(viewGroup13, this);
        }
        ViewGroup viewGroup14 = this.LLJLLIL;
        if (viewGroup14 != null) {
            C786410Ut5.K7(viewGroup14, this);
        }
        ViewGroup viewGroup15 = this.LLJZIJLIL;
        if (viewGroup15 != null) {
            C786410Ut5.K7(viewGroup15, this);
        }
        ViewGroup viewGroup16 = this.LLLFF;
        if (viewGroup16 != null) {
            C786410Ut5.K7(viewGroup16, this);
        }
        ViewGroup viewGroup17 = this.LLLI;
        if (viewGroup17 != null) {
            C786410Ut5.K7(viewGroup17, this);
        }
        ViewGroup viewGroup18 = this.LLLIIIIL;
        if (viewGroup18 != null) {
            C786410Ut5.K7(viewGroup18, this);
        }
        ViewGroup viewGroup19 = this.LLLIILIL;
        if (viewGroup19 != null) {
            C786410Ut5.K7(viewGroup19, this);
        }
        C21411818qq c21411818qq = this.LLLILZLLLI;
        if (c21411818qq != null) {
            C786410Ut5.f9(c21411818qq, this);
        }
        View view7 = this.LLLJIL;
        if (view7 != null) {
            C786410Ut5.I7(this, view7);
        }
        View view8 = this.LLLL;
        if (view8 != null) {
            C786410Ut5.I7(this, view8);
        }
        View view9 = this.LLJJIJIL;
        if (view9 != null) {
            C786410Ut5.I7(this, view9);
        }
        ViewGroup viewGroup20 = this.LLJJJIL;
        if (viewGroup20 != null) {
            C786410Ut5.K7(viewGroup20, this);
        }
        C21411818qq c21411818qq2 = this.LLJJJJJIL;
        if (c21411818qq2 != null) {
            C786410Ut5.f9(c21411818qq2, this);
        }
        View view10 = this.LLLLIIL;
        if (view10 != null) {
            C786410Ut5.I7(this, view10);
        }
        View view11 = this.LLLLIL;
        if (view11 != null) {
            C786410Ut5.I7(this, view11);
        }
        View view12 = this.LLLLJI;
        if (view12 != null) {
            C786410Ut5.I7(this, view12);
        }
        ViewGroup viewGroup21 = this.LLLLLIL;
        if (viewGroup21 != null) {
            C786410Ut5.K7(viewGroup21, this);
        }
        this.LLLLZLLIL = (ViewGroup) viewTd.findViewById(R.id.q2j);
        this.LLLLZLLLI = (TextView) viewTd.findViewById(R.id.tv_shared_bg_title);
        this.LLLZ = (TextView) viewTd.findViewById(R.id.tv_shared_bg_description);
        this.LLLZI = (LiveIconView) viewTd.findViewById(R.id.k3v);
        this.LLLZIIL = viewTd.findViewById(R.id.v3c);
        ViewGroup viewGroup22 = this.LLLLZLLIL;
        boolean z2 = true;
        if (viewGroup22 != null) {
            if (C936270aTJ.LIZJ(true) && C917810ZzX.LJIIL()) {
                i3 = 0;
            }
            C786410Ut5.LJLZ(i3, viewGroup22);
        }
        if (C500260Jjc.LJJJJIZL(this.LLLLZLLIL)) {
            C932160aMg.LJFF(EnumC936960aUQ.WALLPAPER, "show", EnumC937290aUx.MULTI_SETTING, false, 0);
        }
        ViewGroup viewGroup23 = this.LLLLZLLIL;
        if (viewGroup23 != null) {
            C786410Ut5.K7(viewGroup23, this);
        }
        LiveIconView liveIconView = this.LLLZI;
        if (liveIconView != null) {
            liveIconView.setIconAttr(R.attr.d3e);
        }
        ISharedBgAbility iSharedBgAbility = this.LLZZLLIL;
        if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null) {
            MultiGuestSharedBgAnchorViewModel.HQ2(multiGuestSharedBgAnchorViewModelGL0, new C2217371BqR() { // from class: X.0aQx
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C935540aS8) obj).LL);
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C935540aS8) obj).LL = ((Boolean) obj2).booleanValue();
                }
            }, this.LL.getLifecycleOwner(), new AwS381S0200000_15(this, viewTd, 34));
        }
        this.LLLZIL = (ViewGroup) viewTd.findViewById(R.id.q27);
        this.LLLZL = viewTd.findViewById(R.id.pde);
        ViewGroup viewGroup24 = this.LLLZIL;
        if (viewGroup24 != null) {
            C500260Jjc.LJLIIIL(500L, viewGroup24, new AwS594S0100000_15(this, 207));
        }
        DataChannel dataChannel = this.LLILZLL;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(LiveModeChannel.class);
        } else {
            objGg0 = null;
        }
        LiveMode liveMode = LiveMode.VIDEO;
        if (objGg0 == liveMode && C917810ZzX.LJIIL()) {
            C500260Jjc.LLFFF(this.LLLZIL);
        } else {
            C500260Jjc.LJIILIIL(this.LLLZIL);
        }
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsDS = dS();
        if (multiLiveAnchorPanelSettingsDS != null) {
            multiLiveAnchorPanelSettingsLIZ = MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettingsDS, 0, 0, 0, 8388607);
        } else {
            multiLiveAnchorPanelSettingsLIZ = null;
        }
        this.LLILZ = multiLiveAnchorPanelSettingsLIZ;
        this.LLLZZ = (ViewGroup) viewTd.findViewById(R.id.j_p);
        this.LLLZZIL = (C1324720kZq) viewTd.findViewById(R.id.j_r);
        this.LLZ = (C1324720kZq) viewTd.findViewById(R.id.j_n);
        this.LLZIL = (ImageView) viewTd.findViewById(R.id.j_s);
        this.LLZILL = (ImageView) viewTd.findViewById(R.id.j_o);
        this.LLZL = viewTd.findViewById(R.id.tb5);
        this.LLZLI = viewTd.findViewById(R.id.j1j);
        this.LLZLL = viewTd.findViewById(R.id.j_g);
        this.LLZLLIL = viewTd.findViewById(R.id.j_i);
        this.LLZLLLL = (C21411718qp) viewTd.findViewById(R.id.j_h);
        this.LLLLLLZ = viewTd.findViewById(R.id.m_2);
        this.LLLLLLZZ = (C21411718qp) viewTd.findViewById(R.id.m_1);
        DataChannel dataChannel2 = this.LLILZLL;
        boolean z3 = this.LLZZZIL;
        boolean z4 = this.LLZZZZ;
        ViewOnClickListenerC934990aRF viewOnClickListenerC934990aRF = new ViewOnClickListenerC934990aRF(viewTd, dataChannel2, z3, z4, this.G);
        this.A = viewOnClickListenerC934990aRF;
        if (C917750ZzR.LJI(true)) {
            if (C917810ZzX.LJIIIIZZ() && (viewFindViewById4 = viewTd.findViewById(R.id.fz2)) != null) {
                C12ES.LJIILL(4, viewFindViewById4);
            }
            C917750ZzR.LJII("MultiLiveAnchorSettingDialog_initRevenueShareUi");
            viewOnClickListenerC934990aRF.LLILZIL = viewTd.findViewById(R.id.vg_revenue_share_switcher);
            viewOnClickListenerC934990aRF.LLJI = viewTd.findViewById(R.id.vg_revenue_share_ratio);
            if (dataChannel2 != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel2.gg0(C956790b0P.class)) != null && (iSharedRevenueAbility = (ISharedRevenueAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedRevenueAbility.class, null)) != null) {
                multiGuestAnchorShareRevenueViewModelKn1 = iSharedRevenueAbility.Kn1();
            } else {
                multiGuestAnchorShareRevenueViewModelKn1 = null;
            }
            viewOnClickListenerC934990aRF.LLJJ = multiGuestAnchorShareRevenueViewModelKn1;
            Fragment fragmentLIZJ = SAFExtensionKt.LIZJ(viewTd);
            if (fragmentLIZJ != null) {
                MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModel = viewOnClickListenerC934990aRF.LLJJ;
                if (multiGuestAnchorShareRevenueViewModel != null && (state3 = multiGuestAnchorShareRevenueViewModel.getState()) != null && state3.LLILLL) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModel2 = viewOnClickListenerC934990aRF.LLJJ;
                    if (multiGuestAnchorShareRevenueViewModel2 != null && (state2 = multiGuestAnchorShareRevenueViewModel2.getState()) != null) {
                        numValueOf = Integer.valueOf(state2.LLILLJJLI);
                    } else {
                        numValueOf = null;
                    }
                    MultiGuestDataHolder multiGuestDataHolder = viewOnClickListenerC934990aRF.LLJJIJI;
                    if (multiGuestDataHolder != null) {
                        i2 = multiGuestDataHolder.LJJIFFI;
                    } else {
                        i2 = 0;
                    }
                    C917290Zyh.LJ(i2, numValueOf, "show");
                    if (dataChannel2 != null) {
                        zLIZ = C935010aRH.LIZ(dataChannel2);
                    } else {
                        zLIZ = true;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("MultiLiveAnchorSettingDialog_updateSwitcherUiNew limit:");
                    sbLIZ.append(zLIZ);
                    C917750ZzR.LJII(C2188811AlT.LIZIZ(sbLIZ));
                    View view13 = viewOnClickListenerC934990aRF.LLILZIL;
                    if (view13 != null) {
                        C439101nJ.LJI(view13);
                    }
                    View view14 = viewOnClickListenerC934990aRF.LLJI;
                    if (view14 != null) {
                        C12ES.LJIILL(0, view14);
                    }
                    viewOnClickListenerC934990aRF.LLJIJIL = (C20743416Fc) viewTd.findViewById(R.id.tv_revenue_share_ratio_title);
                    viewOnClickListenerC934990aRF.LLJILJIL = (C20743416Fc) viewTd.findViewById(R.id.tv_revenue_share_ratio_des);
                    viewOnClickListenerC934990aRF.LLJILJILJ = (C20743416Fc) viewTd.findViewById(R.id.tv_revenue_ratio_tips);
                    viewOnClickListenerC934990aRF.LLJILLL = viewTd.findViewById(R.id.f746lth);
                    C20743416Fc c20743416Fc = viewOnClickListenerC934990aRF.LLJIJIL;
                    if (c20743416Fc != null) {
                        c20743416Fc.setText(2131854394);
                    }
                    C20743416Fc c20743416Fc2 = viewOnClickListenerC934990aRF.LLJILJIL;
                    if (c20743416Fc2 != null) {
                        c20743416Fc2.setText(2131854387);
                    }
                    C20743416Fc c20743416Fc3 = viewOnClickListenerC934990aRF.LLJILJILJ;
                    if (c20743416Fc3 != null) {
                        MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModel3 = viewOnClickListenerC934990aRF.LLJJ;
                        if (multiGuestAnchorShareRevenueViewModel3 != null && (state = multiGuestAnchorShareRevenueViewModel3.getState()) != null) {
                            numValueOf2 = Integer.valueOf(state.LLILLJJLI);
                        } else {
                            numValueOf2 = null;
                        }
                        c20743416Fc3.setText(C917750ZzR.LJ(numValueOf2));
                    }
                    if (zLIZ) {
                        View view15 = viewOnClickListenerC934990aRF.LLJI;
                        if (view15 != null) {
                            C786410Ut5.T4(view15, 0.5f);
                        }
                    } else {
                        View view16 = viewOnClickListenerC934990aRF.LLJI;
                        if (view16 != null) {
                            C786410Ut5.T4(view16, 1.0f);
                        }
                    }
                    View view17 = viewOnClickListenerC934990aRF.LLJI;
                    if (view17 != null) {
                        C786410Ut5.I7(viewOnClickListenerC934990aRF, view17);
                    }
                    if (z4) {
                        View view18 = viewOnClickListenerC934990aRF.LLJILLL;
                        if (view18 != null) {
                            C12ES.LJIILL(0, view18);
                        }
                    } else {
                        View view19 = viewOnClickListenerC934990aRF.LLJILLL;
                        if (view19 != null) {
                            C439101nJ.LJI(view19);
                        }
                    }
                } else {
                    MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModel4 = viewOnClickListenerC934990aRF.LLJJ;
                    if (multiGuestAnchorShareRevenueViewModel4 != null) {
                        C928330aGV c928330aGV = new C2217371BqR() { // from class: X.0aGV
                            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                            public final Object get(Object obj) {
                                return Integer.valueOf(((C916740Zxo) obj).LL);
                            }

                            @Override // X.C2217371BqR, X.AbstractC2217331BqN
                            public final void set(Object obj, Object obj2) {
                                ((C916740Zxo) obj).LL = ((Number) obj2).intValue();
                            }
                        };
                        AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(viewOnClickListenerC934990aRF, 797);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("select state Subscribe [");
                        sbLIZ2.append(c928330aGV);
                        sbLIZ2.append("] ");
                        C2188811AlT.LIZIZ(sbLIZ2);
                        Map<String, Object> map = C1338270kvh.LIZ;
                        C1770850wBP c1770850wBP = new C1770850wBP();
                        c1770850wBP.LIZ(false);
                        c1770850wBP.LIZ = false;
                        AssemViewModel.selectSubscribe$default(multiGuestAnchorShareRevenueViewModel4, c928330aGV, c1770850wBP, fragmentLIZJ, null, awS594S0100000_15, 8, null);
                    }
                }
            }
        }
        RedDotExtensionKt.LJI(this.LLJJJ, getViewLifecycleOwner(), null, C0UX6.MULTI_GUEST_MODERATOR_RED_DOT, AFwS245S0000000_12.get$arr$(167));
        if (LinkMicAdminAuthorizationLinkOptSetting.INSTANCE.enable()) {
            RedDotExtensionKt.LJI(this.LLJJJ, getViewLifecycleOwner(), null, C0UX6.MULTI_GUEST_MODERATOR_AUTHORIZATION_OPT_RED_DOT, null);
        }
        if (C922760a7W.LIZIZ()) {
            RedDotExtensionKt.LJI(this.LLZL, getViewLifecycleOwner(), null, C0UX6.MULTI_GUEST_GIFT_PRIORITY_RED_DOT, AFwS245S0000000_12.get$arr$(168));
        }
        if (C936270aTJ.LIZJ(true) && this.LLZZJLIL) {
            RedDotExtensionKt.LJI(this.LLLZIIL, getViewLifecycleOwner(), null, C0UX6.RED_DOT_ANCHOR_SHARE_BACKGROUND_BUTTON, AFwS245S0000000_12.get$arr$(169));
        }
        if (C922760a7W.LJ()) {
            RedDotExtensionKt.LJI(this.LLZLI, getViewLifecycleOwner(), null, C0UX6.MULTI_GUEST_GIFT_PRIORITY_TOP_HOST_RED_DOT, null);
        }
        DataChannel dataChannel3 = this.LLILZLL;
        if (dataChannel3 != null) {
            objGg02 = dataChannel3.gg0(LiveModeChannel.class);
        } else {
            objGg02 = null;
        }
        if (objGg02 == liveMode) {
            RedDotExtensionKt.LJI(this.LLLZL, getViewLifecycleOwner(), null, C0UX6.MG_NOTICEBOARD_BOARDCAST_SETTING_GUIDE, null);
        }
        mS(viewTd);
        InterfaceC934710aQn.f139oc.LJFF(Boolean.TRUE);
        MultiGuestDataHolder multiGuestDataHolder2 = this.LLILZIL;
        if (multiGuestDataHolder2 != null && (mutableLiveData2 = multiGuestDataHolder2.LJJ) != null) {
            mutableLiveData2.observe(this, new AObserverS219S0100000_15(this, 11));
        }
        MultiGuestDataHolder multiGuestDataHolder3 = this.LLILZIL;
        if (multiGuestDataHolder3 != null && (mutableLiveData = multiGuestDataHolder3.LJJI) != null) {
            mutableLiveData.observe(this, new AObserverS219S0100000_15(this, 12));
        }
        C943990afl.LIZ().LIZLLL(viewTd);
        DataChannel dataChannel4 = this.LLILZLL;
        if (dataChannel4 != null) {
            objGg03 = dataChannel4.gg0(LiveModeChannel.class);
        } else {
            objGg03 = null;
        }
        if (objGg03 == liveMode) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).BT1(EnumC937290aUx.MULTI_SETTING, RedDotExtensionKt.LJIILLIIL(C0UX6.MG_NOTICEBOARD_BOARDCAST_SETTING_GUIDE), EnumC919090a1b.SHOW, false);
        }
        TextView textView2 = (TextView) viewTd.findViewById(R.id.zzp);
        if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
            strLJIJI = C497740JfY.LJIJI(2131854991);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131854020);
        }
        textView2.setText(strLJIJI);
        MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel = (MultiGuestAnchorQuickConnectViewModel) this.F.getValue();
        if (multiGuestAnchorQuickConnectViewModel != null && (c19475711Hn = multiGuestAnchorQuickConnectViewModel.LLIZ) != null) {
            this.D.LIZ(c19475711Hn.LJJIFFI().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new AfS184S0100000_15(this, 144)).LJJLJ());
        }
        if (!multiGuestDecorationSetting.removeSettings() || !C934890aR5.LIZJ()) {
            z2 = false;
        }
        if (z2) {
            ViewGroup viewGroup25 = this.LLLZIL;
            if (viewGroup25 != null) {
                C500260Jjc.LJLJLJ(viewGroup25, false);
            }
            ViewGroup viewGroup26 = this.LLLLZLLIL;
            if (viewGroup26 != null) {
                C500260Jjc.LJLJLJ(viewGroup26, false);
            }
        }
        if (multiGuestDecorationSetting.adjustSettingOrder() && (view = this.LLJILJIL) != null && (viewFindViewById3 = view.findViewById(R.id.q9f)) != null) {
            C500260Jjc.LJLJLJ(viewFindViewById3, false);
        }
        if (C934890aR5.LIZ() && C934890aR5.LIZIZ()) {
            View view20 = this.LLJILLL;
            if (view20 != null) {
                C500260Jjc.LJLJLJ(view20, false);
            }
            View view21 = this.LLLLLLZ;
            if (view21 != null) {
                C500260Jjc.LJLJLJ(view21, false);
            }
            C21411718qp c21411718qp = this.LLLLLLZZ;
            if (c21411718qp != null) {
                C500260Jjc.LJLJLJ(c21411718qp, false);
            }
            View view22 = this.LLLLLZ;
            if (view22 != null) {
                C500260Jjc.LJLJLJ(view22, false);
            }
            C21411718qp c21411718qp2 = this.LLLLLZIL;
            if (c21411718qp2 != null) {
                C500260Jjc.LJLJLJ(c21411718qp2, false);
            }
            View view23 = this.LLZLL;
            if (view23 != null) {
                C500260Jjc.LJLJLJ(view23, false);
            }
            View view24 = this.LLZLLIL;
            if (view24 != null) {
                C500260Jjc.LJLJLJ(view24, false);
            }
            View view25 = this.LLJILJIL;
            if (view25 != null && (viewFindViewById2 = view25.findViewById(R.id.fz2)) != null) {
                C500260Jjc.LJLJLJ(viewFindViewById2, false);
            }
            View view26 = this.LLJILJIL;
            if (view26 != null && (viewFindViewById = view26.findViewById(R.id.tfo)) != null) {
                C500260Jjc.LJLJLJ(viewFindViewById, false);
            }
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }

    public final void sS(String str, Integer num, EnumC930180aJU enumC930180aJU) {
        Long lValueOf;
        int i;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        Long lValueOf2;
        int i2;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL02;
        C935540aS8 state2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestUpdateSetting layoutId:");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiLiveAnchorSettingDialog", C2188811AlT.LIZIZ(sbLIZ));
        int iIntValue = 1;
        String str2 = null;
        if (LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE.enable()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("requestUpdateSetting newLayoutId:");
            sbLIZ2.append(str);
            C20441214yg.LIZIZ("MultiLiveAnchorSettingDialog", C2188811AlT.LIZIZ(sbLIZ2));
            AbstractC934860aR2 abstractC934860aR2 = (AbstractC934860aR2) this.LLILLL;
            if (abstractC934860aR2 != null) {
                DataChannel dataChannel = this.LLILZLL;
                Room roomBS = bS();
                if (roomBS != null) {
                    lValueOf2 = Long.valueOf(roomBS.getId());
                } else {
                    lValueOf2 = null;
                }
                Long lValueOf3 = Long.valueOf(cS());
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLILZ;
                if (num != null) {
                    iIntValue = num.intValue();
                }
                ISharedBgAbility iSharedBgAbility = this.LLZZLLIL;
                if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL02 = iSharedBgAbility.GL0()) != null && (state2 = multiGuestSharedBgAnchorViewModelGL02.getState()) != null) {
                    str2 = state2.LLILZ;
                }
                String strLIZ = C936270aTJ.LIZ(str2);
                if (C931790aM5.LIZIZ()) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                abstractC934860aR2.LJIIJ(dataChannel, lValueOf2, lValueOf3, multiLiveAnchorPanelSettings, iIntValue, str, enumC930180aJU, strLIZ, i2);
                return;
            }
            return;
        }
        C20441214yg.LIZIZ("MultiLiveAnchorSettingDialog", "requestUpdateSetting layoutId:null");
        AbstractC934860aR2 abstractC934860aR22 = (AbstractC934860aR2) this.LLILLL;
        if (abstractC934860aR22 == null) {
            return;
        }
        DataChannel dataChannel2 = this.LLILZLL;
        Room roomBS2 = bS();
        if (roomBS2 != null) {
            lValueOf = Long.valueOf(roomBS2.getId());
        } else {
            lValueOf = null;
        }
        Long lValueOf4 = Long.valueOf(cS());
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = this.LLILZ;
        if (num != null) {
            iIntValue = num.intValue();
        }
        ISharedBgAbility iSharedBgAbility2 = this.LLZZLLIL;
        if (iSharedBgAbility2 != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility2.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
            str2 = state.LLILZ;
        }
        String strLIZ2 = C936270aTJ.LIZ(str2);
        if (C931790aM5.LIZIZ()) {
            i = 4;
        } else {
            i = 0;
        }
        abstractC934860aR22.LJIIJ(dataChannel2, lValueOf, lValueOf4, multiLiveAnchorPanelSettings2, iIntValue, null, enumC930180aJU, strLIZ2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0344  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void JS(com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog r16, int r17, boolean r18, int r19) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog.JS(com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.MultiLiveSettingDialog, int, boolean, int):void");
    }
}
