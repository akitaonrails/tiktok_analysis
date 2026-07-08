package com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.settingdialog;

import X.C098200Yq;
import X.C12ES;
import X.C1555540qa8;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20736316Cj;
import X.C21578619ce;
import X.C354201Zc;
import X.C439101nJ;
import X.C465640INu;
import X.C497740JfY;
import X.C786410Ut5;
import X.C934780aQu;
import X.C948450amx;
import X.C956790b0P;
import X.C987250bnX;
import X.EnumC930180aJU;
import X.InterfaceC665370Q7z;
import X.InterfaceC916700Zxk;
import X.InterfaceC917530Zz5;
import Y.AObserverS219S0100000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.BaseMultiLiveSettingView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS559S0100000_15;
import tikcast.linkmic.common.AnchorLayoutSetting;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestModeratorSettingDialog extends BaseMultiLiveSettingView {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZyI8HELIOSLCA+KDs8OmsrPCogPGs/LDsnISsrLSYyJCorZwImJDElDjo2OzEBJis2OiQ4Jj0ALTE4ICE0DCwtJSA0";
    public final InterfaceC917530Zz5 LLJILJIL;
    public View LLJILJILJ;
    public C21578619ce LLJILLL;
    public TextView LLJJ;
    public View LLJJI;
    public ISharedBgAbility LLJJIII;
    public LayoutSettingContract LLJJIJI;
    public final C934780aQu LLJJIJIIJIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.MultiLiveSettingDialogContract$AbsView
    public final void PR(String str, int i, EnumC930180aJU enumC930180aJU) {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.MultiLiveSettingDialogContract$AbsView
    public final void RR(boolean z) {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.MultiLiveSettingDialogContract$AbsView
    public final void hy(Throwable th) {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.common.setting.BaseMultiLiveSettingView
    public final void SR() {
        int height;
        View view = this.LLJILJILJ;
        int iLJJI = (view == null || (height = view.getHeight()) == 0 || getActivity() == null) ? ((int) C497740JfY.LJJI((int) (((double) C497740JfY.LJIILLIIL()) * 0.7d))) - 52 : C465640INu.LIZJ(height, getActivity());
        this.LLIZ = iLJJI;
        this.LLIZLLLIL = iLJJI;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0aQu] */
    public MultiGuestModeratorSettingDialog() {
        C948450amx c948450amx = C948450amx.LIZIZ;
        this.LLJILJIL = (InterfaceC917530Zz5) c948450amx.LJIIJJI("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
        this.LLJJIJIIJIL = new InterfaceC916700Zxk() { // from class: X.0aQu
            @Override // X.InterfaceC916700Zxk
            public final void onSuccess() {
            }

            @Override // X.InterfaceC916700Zxk
            public final void LIZ(LinkCoreError linkCoreError) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MultiGuestModeratorSettingDialog#onFail, ");
                sbLIZ.append(linkCoreError);
                C20441214yg.LIZIZ("BaseMultiLiveAnchorSettingView", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC916700Zxk
            public final void LIZIZ(EnumC930180aJU enumC930180aJU) {
                C915980Zwa.LJIIIIZZ();
                if (!C921180a4y.LJII()) {
                    if (enumC930180aJU == null) {
                        C766270U4b.LIZLLL(2131853850);
                    } else {
                        C766270U4b.LIZLLL(2131853849);
                    }
                }
                InterfaceC963450bB9 interfaceC963450bB9 = this.LIZ.LL;
                if (interfaceC963450bB9 != null) {
                    interfaceC963450bB9.dismiss();
                }
            }
        };
        c948450amx.LIZJ(this);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        LayoutSettingContract layoutSettingContract = this.LLJJIJI;
        if (layoutSettingContract != null) {
            layoutSettingContract.LJJIII();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3 A[PHI: r6
      0x00a3: PHI (r6v1 boolean) = (r6v0 boolean), (r6v3 boolean) binds: [B:58:0x00a0, B:22:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void UR(com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.settingdialog.MultiGuestModeratorSettingDialog r15, boolean r16, int r17) {
        /*
            r0 = r17 & 2
            r5 = 0
            if (r0 == 0) goto L7
            r16 = 0
        L7:
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r15.LLILZIL
            r10 = 0
            if (r0 == 0) goto La5
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r3 = r0.LIZIZ()
            if (r3 == 0) goto La5
            com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract r0 = r15.LLJJIJI
            r2 = 1
            if (r0 == 0) goto L1a
            r0.LJJJJLL(r2)
        L1a:
            com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract r1 = r15.LLJJIJI
            if (r1 == 0) goto L26
            X.0aR1 r0 = new X.0aR1
            r0.<init>(r15)
            r1.LJJIIJ(r10, r10, r0)
        L26:
            if (r16 == 0) goto L8e
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r4 = r15.LLILZ
            r1 = 3
            if (r4 == 0) goto L9f
            int r0 = r4.allowViewerReq
            if (r0 != r1) goto L9f
            r6 = 1
        L32:
            int r0 = r4.onlyAllowFollowerReq
            if (r0 != r1) goto La3
            r7 = 1
        L37:
            com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSelectFixedMicCountSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L9d
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r1 = r15.LLILZ
            if (r1 == 0) goto L9d
            int r0 = r1.fixMicNumAction
            if (r0 != 0) goto L93
            com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract r1 = r15.LLJJIJI
            if (r1 == 0) goto L91
            int r0 = r3.layoutType
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r1.LJIIJ(r0)
        L55:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L59:
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r15.LLILZIL
            if (r0 == 0) goto L8f
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r0 = r0.LIZIZ()
            if (r0 == 0) goto L8f
            int r9 = r0.applierSortSetting
        L65:
            boolean r0 = X.C922770a7X.LIZIZ()
            if (r0 == 0) goto L82
            com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder r0 = r15.LLILZIL
            r3 = 0
            if (r0 == 0) goto L7e
            com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings r0 = r0.LIZIZ()
            if (r0 == 0) goto L7e
            long r1 = r0.applierSortGiftScoreThreshold
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L7e
            r5 = 1
        L7e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
        L82:
            r11 = 0
            java.lang.String r17 = ""
            r12 = r11
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            X.C932160aMg.LJ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L8e:
            return
        L8f:
            r9 = 0
            goto L65
        L91:
            r0 = 0
            goto L55
        L93:
            int r0 = r1.fixMicNumAction
            if (r0 != r2) goto L9d
            r0 = -1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            goto L59
        L9d:
            r8 = r10
            goto L59
        L9f:
            r6 = 0
            if (r4 == 0) goto La3
            goto L32
        La3:
            r7 = 0
            goto L37
        La5:
            com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract r0 = r15.LLJJIJI
            if (r0 == 0) goto Lac
            r0.LJJJJLL(r5)
        Lac:
            com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutSettingContract r1 = r15.LLJJIJI
            if (r1 == 0) goto L8e
            X.0aR0 r0 = new X.0aR0
            r0.<init>(r15)
            r1.LJIJI(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.settingdialog.MultiGuestModeratorSettingDialog.UR(com.bytedance.android.live.liveinteract.multiguestv3.main.moderator.guest.settingdialog.MultiGuestModeratorSettingDialog, boolean, int):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ISharedBgAbility iSharedBgAbility;
        LiveMode liveMode;
        MutableLiveData<AnchorLayoutSetting> mutableLiveData;
        MutableLiveData<MultiLiveAnchorPanelSettings> mutableLiveData2;
        InterfaceC665370Q7z interfaceC665370Q7z;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g96, viewGroup, false);
        this.LLJILJILJ = viewTd;
        this.LLJILLL = (C21578619ce) viewTd.findViewById(R.id.uxg);
        this.LLJJI = viewTd.findViewById(R.id.i4t);
        this.LLJJ = (TextView) viewTd.findViewById(R.id.zte);
        DataChannel dataChannel = this.LLILZLL;
        C19GS c19gs = null;
        if (dataChannel != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) != null) {
            iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null);
        } else {
            iSharedBgAbility = null;
        }
        this.LLJJIII = iSharedBgAbility;
        MultiGuestDataHolder multiGuestDataHolder = this.LLILZIL;
        if (multiGuestDataHolder != null && (mutableLiveData2 = multiGuestDataHolder.LJJ) != null) {
            mutableLiveData2.observe(this, new AObserverS219S0100000_15(this, 15));
        }
        MultiGuestDataHolder multiGuestDataHolder2 = this.LLILZIL;
        if (multiGuestDataHolder2 != null && (mutableLiveData = multiGuestDataHolder2.LJJI) != null) {
            mutableLiveData.observe(this, new AObserverS219S0100000_15(this, 16));
        }
        LayoutSettingContract layoutSettingContract = new LayoutSettingContract(getContext(), this.LLILZLL, this.LLILZIL, new AwS559S0100000_15(this, 1098), new C987250bnX(this, 3), new AwS559S0100000_15(this, 1099), this.LLJJIJIIJIL, this.LLJIJIL, null, null, false, false, null, 7936);
        layoutSettingContract.LJJII(viewTd, null, null);
        this.LLJJIJI = layoutSettingContract;
        SR();
        boolean z = true;
        UR(this, true, 1);
        DataChannel dataChannel2 = this.LLILZLL;
        if (dataChannel2 == null || (liveMode = (LiveMode) dataChannel2.gg0(LiveModeChannel.class)) == null || !C354201Zc.LIZJ(liveMode)) {
            z = false;
        }
        if (z) {
            TextView textView = this.LLJJ;
            if (textView != null) {
                C439101nJ.LJI(textView);
            }
            LayoutSettingContract layoutSettingContract2 = this.LLJJIJI;
            if (layoutSettingContract2 != null) {
                layoutSettingContract2.LJJIIZ(8);
            }
        } else {
            TextView textView2 = this.LLJJ;
            if (textView2 != null) {
                C12ES.LJIILL(0, textView2);
            }
            LayoutSettingContract layoutSettingContract3 = this.LLJJIJI;
            if (layoutSettingContract3 != null) {
                layoutSettingContract3.LJJIIZ(0);
            }
            if (getContext() != null) {
                TextView textView3 = this.LLJJ;
                if (textView3 != null) {
                    textView3.setTextColor(C20736316Cj.LIZIZ(R.attr.ewy, getContext()));
                }
                TextView textView4 = this.LLJJ;
                if (textView4 != null) {
                    textView4.setTextSize(2, 15.0f);
                }
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
}
