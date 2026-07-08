package X;

import Y.AAListenerS326S0100000_15;
import Y.AcS354S0200000_15;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.sharerevenue.MultiGuestSelectShareRevenueSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestRevenueLimit;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestAnchorShareRevenueViewModel;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.wallet.CustomErrorExtra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import webcast.data.RechargeCustomError;

/* JADX INFO: renamed from: X.0aRF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ViewOnClickListenerC934990aRF implements View.OnClickListener {
    public final View LL;
    public final DataChannel LLILLJJLI;
    public boolean LLILLL;
    public final InterfaceC935020aRI LLILZ;
    public View LLILZIL;
    public C20743416Fc LLILZLL;
    public C20743416Fc LLIZ;
    public View LLIZLLLIL;
    public C21411718qp LLJ;
    public View LLJI;
    public C20743416Fc LLJIJIL;
    public C20743416Fc LLJILJIL;
    public C20743416Fc LLJILJILJ;
    public View LLJILLL;
    public MultiGuestAnchorShareRevenueViewModel LLJJ;
    public C935000aRG LLJJI;
    public MultiGuestSelectShareRevenueSheetFragment LLJJIII;
    public final MultiGuestDataHolder LLJJIJI;
    public final InterfaceC302401Fe LLJJIJIIJIL;

    public final void LIZ() {
        C916740Zxo state;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ = this.LLILZ.LIZIZ();
        if (multiLiveAnchorPanelSettingsLIZIZ != null) {
            MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModel = this.LLJJ;
            multiLiveAnchorPanelSettingsLIZIZ.LIZ = (multiGuestAnchorShareRevenueViewModel == null || (state = multiGuestAnchorShareRevenueViewModel.getState()) == null || state.LL != 2) ? 2 : 1;
        }
        InterfaceC935020aRI interfaceC935020aRI = this.LLILZ;
        interfaceC935020aRI.LIZ(2, interfaceC935020aRI.LIZIZ());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C916740Zxo state;
        boolean z;
        int i;
        List listLJJIII;
        String idStr;
        long id;
        String str;
        InterfaceC2262081DgM currentUser;
        String strLIZIZ;
        AbstractC928510aGn abstractC928510aGnLIZ;
        FragmentManager fragmentManager;
        C916740Zxo state2;
        Context context;
        C935030aRJ c935030aRJ;
        RechargeCustomError rechargeCustomError;
        ObjectAnimator objectAnimator;
        int i2 = 0;
        if (this.LLILLL) {
            this.LLILLL = false;
            C935000aRG c935000aRG = this.LLJJI;
            if (c935000aRG != null && ((objectAnimator = c935000aRG.LJ) == null || !objectAnimator.isStarted())) {
                C917750ZzR.LJII("onDisappear");
                ObjectAnimator objectAnimator2 = c935000aRG.LIZLLL;
                if (objectAnimator2 != null && objectAnimator2.isStarted()) {
                    ObjectAnimator objectAnimator3 = c935000aRG.LIZLLL;
                    if (objectAnimator3 != null) {
                        objectAnimator3.addListener(new AAListenerS326S0100000_15(c935000aRG, 10));
                    }
                } else {
                    c935000aRG.LIZ();
                }
            }
        }
        Context context2 = null;
        numValueOf = null;
        Integer numValueOf = null;
        if (C935010aRH.LIZ(this.LLILLJJLI)) {
            DataChannel dataChannel = this.LLILLJJLI;
            View view2 = this.LL;
            if (view2 != null && (context = view2.getContext()) != null && dataChannel != null && (c935030aRJ = (C935030aRJ) dataChannel.gg0(MultiGuestRevenueLimit.class)) != null && (rechargeCustomError = c935030aRJ.LIZ) != null) {
                try {
                    Gson gson = C19748512Ol.LIZIZ;
                    ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletException().mO0(context, (CustomErrorExtra) gson.LJII(gson.LJIILL(rechargeCustomError), CustomErrorExtra.class), rechargeCustomError.errCode, Boolean.TRUE);
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C20441214yg.LJ("RevenueLimitExt", String.valueOf(th.getMessage()));
                    return;
                }
            }
            return;
        }
        MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModel = this.LLJJ;
        if (multiGuestAnchorShareRevenueViewModel != null && (state = multiGuestAnchorShareRevenueViewModel.getState()) != null) {
            if (state.LLILLL) {
                this.LLILZ.LIZJ();
                MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModel2 = this.LLJJ;
                if (multiGuestAnchorShareRevenueViewModel2 != null && (state2 = multiGuestAnchorShareRevenueViewModel2.getState()) != null) {
                    numValueOf = Integer.valueOf(state2.LLILLJJLI);
                }
                MultiGuestDataHolder multiGuestDataHolder = this.LLJJIJI;
                if (multiGuestDataHolder != null) {
                    i2 = multiGuestDataHolder.LJJIFFI;
                }
                C917290Zyh.LJ(i2, numValueOf, "click");
                int i3 = state.LLILLJJLI;
                MultiGuestSelectShareRevenueSheetFragment multiGuestSelectShareRevenueSheetFragment = this.LLJJIII;
                if (multiGuestSelectShareRevenueSheetFragment != null) {
                    multiGuestSelectShareRevenueSheetFragment.close(1);
                }
                String str2 = MultiGuestSelectShareRevenueSheetFragment._pnsPageId;
                DataChannel dataChannel2 = this.LLILLJJLI;
                AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(this, 798);
                AwS594S0100000_15 awS594S0100000_152 = new AwS594S0100000_15(this, 799);
                MultiGuestSelectShareRevenueSheetFragment multiGuestSelectShareRevenueSheetFragment2 = new MultiGuestSelectShareRevenueSheetFragment();
                multiGuestSelectShareRevenueSheetFragment2.LLJLLL = dataChannel2;
                multiGuestSelectShareRevenueSheetFragment2.LLJZ = i3;
                multiGuestSelectShareRevenueSheetFragment2.LLJZIJLIL = awS594S0100000_15;
                multiGuestSelectShareRevenueSheetFragment2.LLL = awS594S0100000_152;
                this.LLJJIII = multiGuestSelectShareRevenueSheetFragment2;
                DataChannel dataChannel3 = this.LLILLJJLI;
                if (dataChannel3 != null && (fragmentManager = (FragmentManager) dataChannel3.gg0(C748880TZe.class)) != null) {
                    C20374514nv.LJIIIZ(fragmentManager, multiGuestSelectShareRevenueSheetFragment2, "MultiGuestSelectShareRevenueSheetFragment");
                    return;
                }
                return;
            }
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ = this.LLILZ.LIZIZ();
            if (multiLiveAnchorPanelSettingsLIZIZ != null) {
                C21411718qp c21411718qp = this.LLJ;
                if (c21411718qp != null && c21411718qp.isChecked()) {
                    z = false;
                } else {
                    z = true;
                }
                MultiGuestDataHolder multiGuestDataHolder2 = this.LLJJIJI;
                if (multiGuestDataHolder2 != null) {
                    i = multiGuestDataHolder2.LJJIFFI;
                } else {
                    i = 0;
                }
                InterfaceC302401Fe interfaceC302401Fe = this.LLJJIJIIJIL;
                if (interfaceC302401Fe != null && (abstractC928510aGnLIZ = interfaceC302401Fe.LIZ()) != null) {
                    listLJJIII = abstractC928510aGnLIZ.LJJIII();
                } else {
                    listLJJIII = null;
                }
                Pair pairLJII = C917520Zz4.LJII(C917290Zyh.LJIIIZ);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (i > 0 && (strLIZIZ = C917290Zyh.LIZIZ(listLJJIII)) != null) {
                    linkedHashMap.put("link_id_list", strLIZIZ);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_bonus_icon");
                c474500IjALIZ.LJIL();
                Room roomLIZ = C917290Zyh.LIZ();
                if (roomLIZ != null) {
                    idStr = roomLIZ.getIdStr();
                } else {
                    idStr = null;
                }
                c474500IjALIZ.LJJII(idStr, "room_id");
                InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
                if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null) {
                    id = currentUser.getId();
                } else {
                    id = 0;
                }
                c474500IjALIZ.LJJII(Long.valueOf(id), "anchor_id");
                c474500IjALIZ.LJJII(pairLJII.getFirst(), "layout_setting");
                c474500IjALIZ.LJJII(pairLJII.getSecond(), "window_setting");
                if (z) {
                    str = "on";
                } else {
                    str = "off";
                }
                c474500IjALIZ.LJJII(str, "switch_to");
                c474500IjALIZ.LJJII(String.valueOf(i), "guest_cnt");
                c474500IjALIZ.LJJIIZI(linkedHashMap);
                c474500IjALIZ.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("show confirm dialog, switcherValue:");
                int i4 = 2;
                if (multiLiveAnchorPanelSettingsLIZIZ.LIZ == 2) {
                    i4 = 1;
                }
                sbLIZ.append(Integer.valueOf(i4));
                C917750ZzR.LJII(C2188811AlT.LIZIZ(sbLIZ));
            }
            C21411718qp c21411718qp2 = this.LLJ;
            if (c21411718qp2 != null && !c21411718qp2.isChecked()) {
                LIZ();
                return;
            }
            AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 824);
            View view3 = this.LL;
            if (view3 != null) {
                context2 = view3.getContext();
            }
            C782110Um9 c782110Um9 = new C782110Um9(context2);
            c782110Um9.LJIIZILJ(2131852882);
            c782110Um9.LJII(2131852878);
            c782110Um9.LJIIJ(2131852881, new InterfaceC743640TFa() { // from class: X.0Zz0
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    C917750ZzR.LJII("click cancel");
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIILIIL(2131852877, new AcS354S0200000_15(this, awS559S0100000_15, 19));
            c782110Um9.LJIILL = false;
            C786410Ut5.E4(c782110Um9.LIZ());
        }
    }

    public ViewOnClickListenerC934990aRF(View view, DataChannel dataChannel, boolean z, boolean z2, C934790aQv c934790aQv) {
        this.LL = view;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = z;
        this.LLILZ = c934790aQv;
        C948450amx c948450amx = C948450amx.LIZIZ;
        this.LLJJIJI = (MultiGuestDataHolder) c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        this.LLJJIJIIJIL = (InterfaceC302401Fe) c948450amx.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
    }
}
