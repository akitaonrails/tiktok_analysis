package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive;

import X.AbstractC948180amW;
import X.AbstractC948190amX;
import X.C01KE;
import X.C0TVI;
import X.C14K9;
import X.C1669670tYD;
import X.C1954807lC;
import X.C19719212De;
import X.C20088213iq;
import X.C20441214yg;
import X.C20736316Cj;
import X.C782110Um9;
import X.C786410Ut5;
import X.C861620Xr6;
import X.C948000amE;
import X.C948170amV;
import X.C948210amZ;
import X.C948220ama;
import X.C948230amb;
import X.EnumC1427810nG7;
import Y.AcS106S0101000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.dataChannel.MultiGuestSettingPanelVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.PreviewLiveSettingEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestPreviewLiveSettingDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZy49HELIOSKy0jO2EgLTE4PSY9L2s8OyolISA7JSYlLWsBPCMnIQI5LDwnGDcpPyY2PwklPyoALTE4ICE0DCwtJSA0";
    public MultiGuestPreviewLiveSettingViewModel LLJLLL;
    public DataChannel LLJZ;
    public String LLJZIJLIL = "";

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannel dataChannel;
        super.onDestroy();
        MultiGuestPreviewLiveSettingViewModel multiGuestPreviewLiveSettingViewModel = this.LLJLLL;
        if (Intrinsics.LJFF(multiGuestPreviewLiveSettingViewModel != null ? multiGuestPreviewLiveSettingViewModel.LLILLL : null, "open_layout_market_fragment") || (dataChannel = this.LLJZ) == null) {
            return;
        }
        dataChannel.zW(MultiGuestSettingPanelVisibilityChannel.class, Boolean.FALSE);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezk, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.canceledOnTouchOutside = false;
        sheetOptions.LIZ(6, null);
        return sheetOptions;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            X.0amU r2 = new X.0amU
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r9.LLJZ
            java.lang.String r0 = r9.LLJZIJLIL
            r2.<init>(r1, r0)
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel.class
            androidx.lifecycle.ViewModel r0 = r2.create(r0)
            com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingViewModel) r0
            r9.LLJLLL = r0
            java.lang.String r4 = r9.LLJZIJLIL
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            X.0amO r7 = X.C0H79.LIZ()
            r8 = 0
            if (r7 == 0) goto La6
            int r5 = r7.LIZIZ()
            webcast.api.linkmic_multi_guest.GuideLayoutDetailsResponse$AnchorLayoutSetting r0 = r7.LIZ
            if (r0 == 0) goto La6
            java.util.List<tikcast.linkmic.common.AnchorPanelLayoutTypeSetting> r2 = r0.panelLayoutTypeSetting
            if (r2 == 0) goto La6
            X.020M r1 = new X.020M
            r0 = 3
            r1.<init>(r5, r0)
            kotlin.Pair r0 = X.C500260Jjc.LJI(r2, r1)
            java.lang.Object r0 = r0.getFirst()
            tikcast.linkmic.common.AnchorPanelLayoutTypeSetting r0 = (tikcast.linkmic.common.AnchorPanelLayoutTypeSetting) r0
            if (r0 == 0) goto La6
            int r0 = r0.maxPosition
        L44:
            int r6 = r0 + (-1)
            r2 = 0
            if (r7 == 0) goto La4
            int r0 = r7.LIZJ
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = r7.LJFF
            if (r0 == 0) goto L57
            int r8 = r0.intValue()
        L57:
            if (r6 <= 0) goto L62
            java.lang.String r1 = "max_guest_num"
            java.lang.String r0 = java.lang.String.valueOf(r6)
            r3.put(r1, r0)
        L62:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "is_show_available_spot"
            r3.put(r0, r1)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "anchor_id"
            r3.put(r0, r1)
            java.lang.String r0 = "from_page"
            r3.put(r0, r4)
            java.lang.String r1 = "auto_accept_request_initiate_type"
            java.lang.String r0 = java.lang.String.valueOf(r8)
            r3.put(r1, r0)
            if (r8 <= 0) goto La1
            java.lang.String r1 = "on"
        L92:
            java.lang.String r0 = "auto_accept_request"
            r3.put(r0, r1)
            X.C942270acz.LIZ(r3)
            java.lang.String r1 = "livesdk_anchor_guest_setting_page_show"
            r0 = 1
            X.C0KX4.LIZ(r1, r3, r2, r0)
            return
        La1:
            java.lang.String r1 = "off"
            goto L92
        La4:
            r5 = r2
            goto L57
        La6:
            r0 = 0
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.MultiGuestPreviewLiveSettingDialog.onCreate(android.os.Bundle):void");
    }

    public final void uS(AbstractC948180amW abstractC948180amW) {
        if (Intrinsics.LJFF(abstractC948180amW, C948220ama.LIZ)) {
            close(1);
            return;
        }
        if (Intrinsics.LJFF(abstractC948180amW, C948210amZ.LIZ)) {
            DataChannelGlobal.LLILZ.GQ2(PreviewLiveSettingEvent.class);
            close(1);
            return;
        }
        if (abstractC948180amW instanceof C948170amV) {
            int i = ((C948170amV) abstractC948180amW).LIZ;
            Context context = getContext();
            if (context == null) {
                return;
            }
            C782110Um9 c782110Um9 = new C782110Um9(context);
            c782110Um9.LJIILL = false;
            c782110Um9.LJII(2131853882);
            c782110Um9.LJIILIIL(2131842316, new AcS106S0101000_15(i, this, 1));
            C786410Ut5.E4(c782110Um9.LIZ());
            return;
        }
        if (abstractC948180amW instanceof AbstractC948190amX) {
            C948230amb c948230amb = C948230amb.LIZ;
            if (Intrinsics.LJFF(abstractC948180amW, c948230amb)) {
                MultiGuestPreviewLiveSettingViewModel multiGuestPreviewLiveSettingViewModel = this.LLJLLL;
                if (multiGuestPreviewLiveSettingViewModel == null || !(abstractC948180amW instanceof AbstractC948190amX)) {
                    return;
                }
                if (Intrinsics.LJFF(abstractC948180amW, c948230amb)) {
                    C20441214yg.LIZIZ("MultiGuestPreviewLiveSettingViewModel", "handleLayoutEffect: OpenLayoutMarketPanel");
                    C01KE.LIZIZ(ViewModelKt.getViewModelScope(multiGuestPreviewLiveSettingViewModel), new C948000amE(multiGuestPreviewLiveSettingViewModel, null));
                    return;
                }
                throw new C1954807lC();
            }
            throw new C1954807lC();
        }
        throw new C1954807lC();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.n65);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        View viewFindViewById2 = view.findViewById(R.id.jl0);
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
        View viewFindViewById3 = view.findViewById(R.id.fpl);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setBackgroundColor(0);
        }
        View viewFindViewById4 = view.findViewById(R.id.eqx);
        if (viewFindViewById4 != null) {
            C14K9.LJIJJ(viewFindViewById4, new C0TVI() { // from class: X.0Dd8
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    view2.setPadding(view2.getPaddingLeft(), c20246014Ju.LIZ(7).LIZIZ, view2.getPaddingRight(), 0);
                    return c20246014Ju;
                }
            });
            viewFindViewById4.setBackgroundColor(0);
        }
        DataChannel dataChannel = this.LLJZ;
        if (dataChannel != null) {
            dataChannel.zW(MultiGuestSettingPanelVisibilityChannel.class, Boolean.TRUE);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MultiGuestPreviewLiveSettingViewModel multiGuestPreviewLiveSettingViewModel = this.LLJLLL;
        if (multiGuestPreviewLiveSettingViewModel == null) {
            return new ComposeView(requireContext(), null, 6);
        }
        C01KE.LIZIZ(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), new C861620Xr6(this, multiGuestPreviewLiveSettingViewModel, null));
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(441147967, new AwS293S0300000_15(multiGuestPreviewLiveSettingViewModel, this, composeView, 2), true));
        return composeView;
    }
}
