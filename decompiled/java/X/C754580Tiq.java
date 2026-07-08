package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.adminsetting.LiveAdminSettingDialog;
import com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostSettingsUIConfig;
import com.bytedance.android.livesdk.message.proto.StarCommentConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;

/* JADX INFO: renamed from: X.0Tiq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C754580Tiq implements InterfaceViewOnClickListenerC1102800enu, Observer<C998850c6F> {
    public Room LL;
    public DataChannel LLILLJJLI;
    public LiveMode LLILLL;

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean f1() {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    public C754580Tiq(Context context) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EnumC754620Tiu enumC754620Tiu;
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.A4;
        Boolean bool = Boolean.FALSE;
        c20337914i1.LJFF(bool);
        C20337914i1<Map<String, Boolean>> c20337914i12 = InterfaceC1106030et7.D4;
        c20337914i12.LIZIZ().put(CardStruct.IStatusCode.DEFAULT, bool);
        c20337914i12.LJFF(c20337914i12.LIZIZ());
        try {
            if (C036E.LIZ.LIZIZ()) {
                FragmentManager fragmentManager = (FragmentManager) this.LLILLJJLI.gg0(C748880TZe.class);
                DataChannelGlobal.LLILZ.JQ2(C1148180fz6.class, "more_page_setting");
                if (this.LL != null && fragmentManager != null) {
                    if (LiveHostSettingsUIConfig.enable()) {
                        LiveMode liveMode = this.LLILLL;
                        if (liveMode != null && !liveMode.equals(LiveMode.VIDEO)) {
                            if (this.LLILLL.equals(LiveMode.THIRD_PARTY)) {
                                enumC754620Tiu = EnumC754620Tiu.OBS;
                            } else if (this.LLILLL.equals(LiveMode.SCREEN_RECORD)) {
                                enumC754620Tiu = EnumC754620Tiu.GAME;
                            } else if (this.LLILLL.equals(LiveMode.LIVE_VOICE)) {
                                enumC754620Tiu = EnumC754620Tiu.VOICE;
                            } else {
                                enumC754620Tiu = EnumC754620Tiu.VIDEO;
                            }
                        } else {
                            enumC754620Tiu = EnumC754620Tiu.VIDEO;
                        }
                        C19322110iZ.LJ(fragmentManager, new LiveHostSettingFragmentSheet(enumC754620Tiu, this.LLILLJJLI, null), null, "live_host_settings_more_settings", null, 0, null);
                    } else {
                        LiveAdminSettingDialog liveAdminSettingDialogXu2 = C781270Ukn.LIZIZ().xu2(false);
                        if (this.LL != null && liveAdminSettingDialogXu2 != null) {
                            liveAdminSettingDialogXu2.show(fragmentManager, "ToolbarManageBehavior");
                        }
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_set_page_click");
                    c474500IjALIZ.LJIJJLI(this.LLILLJJLI);
                    c474500IjALIZ.LJJII(C354201Zc.LIZ(this.LL.getStreamType()), "live_type");
                    c474500IjALIZ.LIZ();
                    return;
                }
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C766270U4b.LIZLLL(2131843092);
    }

    @Override // androidx.lifecycle.Observer
    public final /* bridge */ /* synthetic */ void onChanged(C998850c6F c998850c6F) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void WH(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        StarCommentConfig starCommentConfig;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_set_icon_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
        this.LLILLJJLI = dataChannel;
        this.LL = (Room) dataChannel.gg0(RoomChannel.class);
        this.LLILLL = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        EnumC1102750enp enumC1102750enp = EnumC1102750enp.SETTING;
        enumC1102750enp.setRedDotVisible(dataChannel, false);
        Room room = this.LL;
        if (room != null && (starCommentConfig = room.starCommentConfig) != null && starCommentConfig.starCommentQualification && InterfaceC1106030et7.D4.LIZIZ().get(CardStruct.IStatusCode.DEFAULT) == null) {
            enumC1102750enp.setRedDotVisible(dataChannel, true);
        }
    }
}
