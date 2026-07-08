package com.bytedance.android.live.rank.impl.setting;

import X.AbstractViewOnClickListenerC1105820esm;
import X.C01GW;
import X.C0TZM;
import X.C1119010fE3;
import X.C1148180fz6;
import X.C1161920gLG;
import X.C16F5;
import X.C1811010xEB;
import X.C20743716Ff;
import X.C452501pT;
import X.C465640INu;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import X.C951600as2;
import X.EnumC1118970fDz;
import X.EnumC1811400xEo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.rank.impl.setting.NewRankSettingDialog;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.api.OptOutAudienceRankingEvent;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.AudienceRankSettingEvent;
import com.bytedance.android.livesdk.rank.impl.CloseAudienceRankDialogEvent;
import com.bytedance.android.livesdk.rank.impl.CloseRankDialogEvent;
import com.bytedance.android.livesdk.rank.impl.OpenRankDialogEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class NewRankSettingDialog extends LiveDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slHELIOSJD8/ZjYpPTs6JiJiByokGiQiIhw2PDElJygXISQgJig=";
    public final C01GW LL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 100));
    public C16F5 LLILLJJLI;
    public FrameLayout LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public C20743716Ff LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public String LLJIJIL;
    public String LLJILJIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void MR() {
        DataChannel dataChannel;
        String string;
        RoomAuthStatus roomAuthStatus;
        if (!TextUtils.isEmpty(this.LLJILJIL)) {
            Uri uri = UriProtector.parse(this.LLJILJIL);
            if (!TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "is_opt_out"))) {
                Room room = (Room) this.LL.getValue();
                if (room == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || (string = Integer.valueOf(roomAuthStatus.getGiftRankSwitchStatus()).toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                C500260Jjc.LJJJZ(uri, "is_opt_out", string);
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), uri);
            return;
        }
        Object objGg0 = DataChannelGlobal.LLILZ.gg0(C1148180fz6.class);
        if (objGg0 == null) {
            objGg0 = "";
        }
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.LC0(OpenRankDialogEvent.class, new C1811010xEB(EnumC1811400xEo.GIFT_RANK.getType(), "live_settings_page", this.LLJ, this.LLJI));
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(objGg0, "team_rank_contributors")) {
            Uri.Builder builderBuildUpon = UriProtector.parse("aweme://roma_redirect/?roma_group_key=roma_schema_group_fans_level_main&roma_page_key=roma_schema_page_user_contributors").buildUpon();
            if (!Intrinsics.LJFF(this.LLJIJIL, "")) {
                builderBuildUpon.appendQueryParameter("height", this.LLJIJIL);
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(getContext(), builderBuildUpon.build());
            return;
        }
        if (!Intrinsics.LJFF(objGg0, "top_active_user_rank") || (dataChannel = this.dataChannel) == null) {
            return;
        }
        dataChannel.FQ2(AudienceRankSettingEvent.class);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        DataChannel dataChannel = this.dataChannel;
        boolean zLJJIJIL = C500260Jjc.LJJIJIL(dataChannel != null ? (Boolean) dataChannel.gg0(C0TZM.class) : null);
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g9y);
        c500980Jkm.LIZJ = zLJJIJIL ? R.style.ahb : C497740JfY.LJJ() ? R.style.ahf : R.style.ahg;
        c500980Jkm.LJII = zLJJIJIL ? 80 : C497740JfY.LJJ() ? 3 : 5;
        c500980Jkm.LJI = 0.0f;
        int iLIZIZ = C465640INu.LIZIZ(getContext());
        c500980Jkm.LJIIIZ = -1;
        if (zLJJIJIL) {
            iLIZIZ = -1;
        }
        c500980Jkm.LJIIJ = iLIZIZ;
        return c500980Jkm;
    }

    public NewRankSettingDialog() {
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        int i = RankTypeV2.LJJIJIIJI.type;
        this.LLJ = i;
        this.LLJI = i;
        this.LLJIJIL = "";
        this.LLJILJIL = "";
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        EnumC1118970fDz enumC1118970fDzLIZ;
        boolean z;
        RoomAuthStatus roomAuthStatus;
        super.onViewCreated(view, bundle);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.zig);
        this.LLILLL = (FrameLayout) view.findViewById(R.id.i9a);
        this.LLILZ = (C16F5) view.findViewById(R.id.tv_rank_setting_title);
        this.LLILZIL = (C16F5) view.findViewById(R.id.tv_rank_setting_content);
        this.LLILZLL = (C20743716Ff) view.findViewById(R.id.sr4);
        this.LLIZ = view.findViewById(R.id.yg_);
        this.LLIZLLLIL = view.findViewById(R.id.yga);
        if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            C16F5 c16f5 = this.LLILLJJLI;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131842815));
            }
            C16F5 c16f52 = this.LLILZ;
            if (c16f52 != null) {
                c16f52.setText(C497740JfY.LJIJI(2131843899));
            }
            C16F5 c16f53 = this.LLILZIL;
            if (c16f53 != null) {
                c16f53.setText(C497740JfY.LJIJI(2131843898));
            }
        } else {
            C16F5 c16f54 = this.LLILLJJLI;
            if (c16f54 != null) {
                c16f54.setText(C497740JfY.LJIJI(2131856086));
            }
            C16F5 c16f55 = this.LLILZ;
            if (c16f55 != null) {
                c16f55.setText(C497740JfY.LJIJI(2131832637));
            }
            C16F5 c16f56 = this.LLILZIL;
            if (c16f56 != null) {
                c16f56.setText(C497740JfY.LJIJI(2131832638));
            }
        }
        C20743716Ff c20743716Ff = this.LLILZLL;
        if (c20743716Ff != null) {
            long jLongValue = 0;
            if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
                C1119010fE3 c1119010fE3 = EnumC1118970fDz.Companion;
                Room room = (Room) this.LL.getValue();
                if (room != null && (roomAuthStatus = room.mRoomAuthStatus) != null) {
                    jLongValue = roomAuthStatus.getGiftRankSwitchStatus();
                }
                c1119010fE3.getClass();
                enumC1118970fDzLIZ = C1119010fE3.LIZ(jLongValue);
            } else {
                C1119010fE3 c1119010fE32 = EnumC1118970fDz.Companion;
                Long l = (Long) DataChannelGlobal.LLILZ.gg0(C951600as2.class);
                if (l != null) {
                    jLongValue = l.longValue();
                }
                c1119010fE32.getClass();
                enumC1118970fDzLIZ = C1119010fE3.LIZ(jLongValue);
            }
            if (enumC1118970fDzLIZ == EnumC1118970fDz.RANK_SWITCH_STATUS_ON) {
                z = true;
            } else {
                z = false;
            }
            c20743716Ff.setChecked(z);
        }
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0fDr
                @Override // X.AbstractViewOnClickListenerC1105820esm
                public final void LIZ() {
                    final NewRankSettingDialog newRankSettingDialog = this.LLILZIL;
                    final C20743716Ff c20743716Ff2 = newRankSettingDialog.LLILZLL;
                    if (c20743716Ff2 != null) {
                        final EnumC1118970fDz enumC1118970fDz = !c20743716Ff2.isChecked() ? EnumC1118970fDz.RANK_SWITCH_STATUS_ON : EnumC1118970fDz.RANK_SWITCH_STATUS_OFF;
                        final boolean zLJIIZILJ = C500260Jjc.LJIIZILJ(newRankSettingDialog.dataChannel);
                        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).XI2().LJIIIIZZ(newRankSettingDialog.getContext(), zLJIIZILJ ? 5L : 6L, enumC1118970fDz.getValue(), zLJIIZILJ, "live_page", "live_settings_page", new InterfaceC1119160fEI() { // from class: X.0fDq
                            @Override // X.InterfaceC1119160fEI
                            public final void onCancel() {
                            }

                            @Override // X.InterfaceC1119160fEI
                            public final void LIZ() {
                                RoomAuthStatus roomAuthStatus2;
                                c20743716Ff2.toggle();
                                if (zLJIIZILJ) {
                                    Room room2 = (Room) newRankSettingDialog.LL.getValue();
                                    if (room2 != null && (roomAuthStatus2 = room2.getRoomAuthStatus()) != null) {
                                        roomAuthStatus2.setGiftRankSwitchStatus((int) enumC1118970fDz.getValue());
                                    }
                                    C766270U4b.LIZLLL(enumC1118970fDz == EnumC1118970fDz.RANK_SWITCH_STATUS_ON ? 2131855615 : 2131855614);
                                } else {
                                    DataChannelGlobal.LLILZ.JQ2(C951600as2.class, Long.valueOf((c20743716Ff2.isChecked() ? EnumC1118970fDz.RANK_SWITCH_STATUS_ON : EnumC1118970fDz.RANK_SWITCH_STATUS_OFF).getValue()));
                                    DataChannel dataChannel = newRankSettingDialog.dataChannel;
                                    if (dataChannel != null) {
                                        dataChannel.LC0(OptOutAudienceRankingEvent.class, Boolean.valueOf(!c20743716Ff2.isChecked()));
                                    }
                                }
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_rankings_setting_click");
                                c474500IjALIZ.LJIL();
                                c474500IjALIZ.LJJII(DataChannelGlobal.LLILZ.gg0(C1148180fz6.class), "enter_from");
                                c474500IjALIZ.LJJII(enumC1118970fDz == EnumC1118970fDz.RANK_SWITCH_STATUS_ON ? "open" : "close", "ranking_status");
                                c474500IjALIZ.LJJII(zLJIIZILJ ? "anchor" : "user", "user_type");
                                c474500IjALIZ.LJJII("gift_ranking", "rank_type");
                                c474500IjALIZ.LJIILJJIL(C500260Jjc.LJJIJLIJ() ? "live_take_page" : "live_take_detail");
                                c474500IjALIZ.LIZ();
                            }

                            @Override // X.InterfaceC1119160fEI
                            public final void onFailed() {
                                C766270U4b.LIZLLL(2131842705);
                            }
                        });
                    }
                }

                {
                    super(1200L);
                }
            });
        }
        View view2 = this.LLIZ;
        if (view2 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1105820esm() { // from class: X.0fE5
                @Override // X.AbstractViewOnClickListenerC1105820esm
                public final void LIZ() {
                    this.LLILZIL.dismiss();
                    this.LLILZIL.MR();
                }

                {
                    super(1200L);
                }
            }, view2);
        }
        View view3 = this.LLIZLLLIL;
        if (view3 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1105820esm() { // from class: X.0fE6
                @Override // X.AbstractViewOnClickListenerC1105820esm
                public final void LIZ() {
                    this.LLILZIL.dismiss();
                    this.LLILZIL.MR();
                }

                {
                    super(1200L);
                }
            }, view3);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.FQ2(CloseRankDialogEvent.class);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.FQ2(CloseAudienceRankDialogEvent.class);
        }
    }
}
