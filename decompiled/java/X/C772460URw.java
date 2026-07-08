package X;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionConfig;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.GameLandScapeOrientationChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.startlive.PreviewContinueLiveHelper;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.GoLiveVoiceCallConflictCheckSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.OptGoLiveBluetoothPermissionRequestSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameAnchorIntelligentRotationTimeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtliveGameEnableIntelligentRotationSetting;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.user.ApplyLivePermission;
import com.bytedance.android.livesdkapi.user.DetailLivePermission;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS14S2000000_12;
import kotlin.jvm.internal.AwS27S0001000_12;

/* JADX INFO: renamed from: X.0URw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772460URw implements C0UQ8 {
    public String LIZ = "go_live_page";
    public final LiveMode LIZIZ = LiveMode.SCREEN_RECORD;
    public final InterfaceC759380Tqa[] LIZJ;

    public C772460URw() {
        InterfaceC759380Tqa[] interfaceC759380TqaArr = new InterfaceC759380Tqa[14];
        interfaceC759380TqaArr[0] = new C500780JkS();
        interfaceC759380TqaArr[1] = new C758880Tpm();
        interfaceC759380TqaArr[2] = new C758900Tpo();
        interfaceC759380TqaArr[3] = new C500770JkR();
        interfaceC759380TqaArr[4] = new C758910Tpp();
        interfaceC759380TqaArr[5] = new C771730UPb();
        interfaceC759380TqaArr[6] = new C501000Jko();
        interfaceC759380TqaArr[7] = new C500850JkZ();
        interfaceC759380TqaArr[8] = new C0US9();
        interfaceC759380TqaArr[9] = new C771940UPw();
        interfaceC759380TqaArr[10] = new C772680USs();
        interfaceC759380TqaArr[11] = OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable() ? null : new C772640USo();
        interfaceC759380TqaArr[12] = new C500830JkX();
        interfaceC759380TqaArr[13] = GoLiveVoiceCallConflictCheckSetting.INSTANCE.enable() ? new C0USC() : null;
        this.LIZJ = interfaceC759380TqaArr;
    }

    @Override // X.C0UQ8
    public final void LIZIZ() {
        this.LIZ = C0W78.LJFF(C497740JfY.LJII()) ? "go_live_page" : "overlay_setting";
        C773220UUu c773220UUu = C773220UUu.LIZ;
        LiveMode liveMode = this.LIZIZ;
        c773220UUu.getClass();
        C773220UUu.LJIIJJI(liveMode);
        C773220UUu.LJ = this.LIZIZ;
        C773220UUu.LJIIL(AFwS245S0000000_12.get$arr$(200));
    }

    @Override // X.C0UQ8
    public final InterfaceC759380Tqa[] LIZ() {
        return this.LIZJ;
    }

    public static void LJIIJJI(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screening_remind_banner_click");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.C0UQ8
    public final void LJFF(Fragment fragment) {
        DataChannel dataChannelLJ;
        Context context;
        String str;
        Creator creator;
        Creator creator2;
        if (fragment == null || (dataChannelLJ = C475510Ikn.LJ(fragment)) == null || (context = fragment.getContext()) == null) {
            return;
        }
        PreviewContinueLiveHelper previewContinueLiveHelper = PreviewContinueLiveHelper.LIZ;
        LiveMode liveMode = this.LIZIZ;
        previewContinueLiveHelper.getClass();
        int iLIZ = PreviewContinueLiveHelper.LIZ(liveMode);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room == null || (((creator = room.creator) == null || creator.roomContinue != 1) && ((creator2 = room.creator) == null || creator2.roomContinue != 2))) {
            Map<String, Object> map = C1338270kvh.LIZ;
            InterfaceC772390URp.q.LJFF("");
            InterfaceC772390URp.r.LJFF("");
            if (TtliveGameEnableIntelligentRotationSetting.INSTANCE.isEnable() && TtliveGameAnchorIntelligentRotationTimeSetting.INSTANCE.getValue() > 0) {
                InterfaceC772390URp.t.LJFF(Boolean.FALSE);
            }
        }
        Intent intentCreateStartBroadcastIntent = C781270Ukn.LJIIJ().createStartBroadcastIntent(C500260Jjc.LJ(context), iLIZ);
        dataChannelGlobal.JQ2(C168G.class, dataChannelLJ.gg0(C771490UOd.class));
        InterfaceC772390URp.LLLZI.LJFF(Boolean.FALSE);
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannelLJ.gg0(RoomCreateInfoChannel.class);
        if (roomCreateInfo != null) {
            str = roomCreateInfo.mAdditionalPrompt;
        } else {
            str = null;
        }
        intentCreateStartBroadcastIntent.putExtra("live.intent.extra.LIVE_PC_TIPS", str);
        intentCreateStartBroadcastIntent.putExtra("hotsoon.intent.extra.IS_LANDSCAPE", (Boolean) dataChannelLJ.gg0(GameLandScapeOrientationChannel.class));
        intentCreateStartBroadcastIntent.putExtra("request_page", (String) dataChannelLJ.gg0(C0ULI.class));
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intentCreateStartBroadcastIntent, "Context_startActivity_1");
        C1701330uNH.LIZ(intentCreateStartBroadcastIntent, context);
        C2204961BRm.LJJJJJL(context, intentCreateStartBroadcastIntent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyWq4lqd1QtMgqsXrtSuStWhHQf8ZbDAqkijWs0cQyrLkA0P2U9A20=", null));
    }

    @Override // X.C0UQ8
    public final boolean LJIIIIZZ(Fragment fragment) throws Throwable {
        Context context;
        MediaProjectionManager mediaProjectionManager;
        DataChannel dataChannelLJ = C475510Ikn.LJ(fragment);
        if (dataChannelLJ == null || (context = fragment.getContext()) == null) {
            return true;
        }
        if (dataChannelLJ.gg0(C771490UOd.class) == null) {
            Object objH2 = C786410Ut5.H2(context, "media_projection");
            if ((objH2 instanceof MediaProjectionManager) && (mediaProjectionManager = (MediaProjectionManager) objH2) != null) {
                try {
                    Intent intentLJIIIZ = LJIIIZ(mediaProjectionManager, CertProviderManagerKt.findCert("bpea-check_screen_capture_intent", 1476411393));
                    C1701330uNH.LIZ(intentLJIIIZ, fragment);
                    C2204961BRm.LLJL(fragment, intentLJIIIZ, 20001, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+wUluZhfAftz+7ymtvHQqyWq4lqd1QtMgqsXrtSuStWhHQf8ZbDAqkijWs0cQyrLkA0P2U9A20=", null));
                    return true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("check capture intent exception msg: ");
                    sbLIZ.append(e.getMessage());
                    C20441214yg.LJ("GameStartLiveStrategy", C2188811AlT.LIZIZ(sbLIZ));
                    LJIIL(dataChannelLJ);
                    return true;
                }
            }
            LJIIL(dataChannelLJ);
            return true;
        }
        return false;
    }

    public final void LJIIJ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screening_allow_show");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(this.LIZ, "enter_from");
        c474500IjALIZ.LIZ();
    }

    public final void LJIIL(DataChannel dataChannel) {
        C1124870fNV.LIZJ().getClass();
        String strLIZIZ = C1124870fNV.LIZIZ("pm_mt_mobile_gaming_unauthorized_toast");
        if (strLIZIZ == null) {
            strLIZIZ = C497740JfY.LJIJI(2131843109);
        }
        C766270U4b.LJIIJJI(strLIZIZ);
        LJ(dataChannel, 105);
    }

    public static Intent LJIIIZ(MediaProjectionManager mediaProjectionManager, Cert cert) {
        if (Build.VERSION.SDK_INT >= 34) {
            C20441214yg.LIZIZ("GameStartLiveStrategy", "getScreenCaptureIntent when sdk version greater than 34.");
            return C0TPX.LIZIZ(mediaProjectionManager, MediaProjectionConfig.createConfigForDefaultDisplay(), cert);
        }
        C20441214yg.LIZIZ("GameStartLiveStrategy", "getScreenCaptureIntent when sdk version smaller than 34.");
        return C0TPX.LIZJ(mediaProjectionManager, cert);
    }

    @Override // X.C0UQ8
    public final boolean LIZJ(ApplyLivePermission applyLivePermission, DetailLivePermission detailLivePermission) {
        Boolean boolValueOf;
        Boolean boolValueOf2 = null;
        if (detailLivePermission != null) {
            boolValueOf = Boolean.valueOf(detailLivePermission.screenPermission);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
            if (applyLivePermission != null) {
                boolValueOf2 = Boolean.valueOf(applyLivePermission.screenApplyPermission);
            }
            if (C500260Jjc.LJJJI(boolValueOf2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C0UQ8
    public final void LIZLLL(String str, String str2) {
        C773220UUu c773220UUu = C773220UUu.LIZ;
        AwS14S2000000_12 awS14S2000000_12 = new AwS14S2000000_12(str, str2, 2);
        c773220UUu.getClass();
        C773220UUu.LJIIL(awS14S2000000_12);
        C773220UUu.LJIIJJI(this.LIZIZ);
    }

    @Override // X.C0UQ8
    public final void LJ(DataChannel dataChannel, int i) {
        C772780UTc.LJFF(i, this.LIZIZ);
        C781270Ukn.LJ().startLiveManager().LJIIIZ(dataChannel, i);
        C773220UUu c773220UUu = C773220UUu.LIZ;
        AwS27S0001000_12 awS27S0001000_12 = new AwS27S0001000_12(i, 2);
        c773220UUu.getClass();
        C773220UUu.LJIIL(awS27S0001000_12);
        C773220UUu.LJIIJJI(this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0UQ8
    public final void LJI(Fragment fragment, Boolean bool) {
        DataChannel dataChannelLJ;
        Bundle bundle;
        Fragment fragment2;
        Creator creator;
        Creator creator2;
        if (fragment != null && (dataChannelLJ = C475510Ikn.LJ(fragment)) != null) {
            PreviewContinueLiveHelper previewContinueLiveHelper = PreviewContinueLiveHelper.LIZ;
            LiveMode liveMode = this.LIZIZ;
            previewContinueLiveHelper.getClass();
            InterfaceC214902198i interfaceC214902198iCreateStartBroadcastFragment = C781270Ukn.LJIIJ().createStartBroadcastFragment(PreviewContinueLiveHelper.LIZ(liveMode));
            if (interfaceC214902198iCreateStartBroadcastFragment == 0) {
                return;
            }
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room == null || (((creator = room.creator) == null || creator.roomContinue != 1) && ((creator2 = room.creator) == null || creator2.roomContinue != 2))) {
                Map<String, Object> map = C1338270kvh.LIZ;
                InterfaceC772390URp.q.LJFF("");
                InterfaceC772390URp.r.LJFF("");
                if (TtliveGameEnableIntelligentRotationSetting.INSTANCE.isEnable() && TtliveGameAnchorIntelligentRotationTimeSetting.INSTANCE.getValue() > 0) {
                    InterfaceC772390URp.t.LJFF(Boolean.FALSE);
                }
            }
            String str = null;
            if (!(interfaceC214902198iCreateStartBroadcastFragment instanceof Fragment) || (fragment2 = (Fragment) interfaceC214902198iCreateStartBroadcastFragment) == null || (bundle = fragment2.getArguments()) == null) {
                bundle = new Bundle();
            }
            dataChannelGlobal.JQ2(C168G.class, dataChannelLJ.gg0(C771490UOd.class));
            InterfaceC772390URp.LLLZI.LJFF(Boolean.FALSE);
            RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannelLJ.gg0(RoomCreateInfoChannel.class);
            if (roomCreateInfo != null) {
                str = roomCreateInfo.mAdditionalPrompt;
            }
            C786410Ut5.LJJJI("live.intent.extra.LIVE_PC_TIPS", str, bundle);
            C786410Ut5.LJJIZ(bundle, "hotsoon.intent.extra.IS_LANDSCAPE", (Boolean) dataChannelLJ.gg0(GameLandScapeOrientationChannel.class));
            C786410Ut5.LJJJI("request_page", (String) dataChannelLJ.gg0(C0ULI.class), bundle);
            InterfaceC20622815ms interfaceC20622815msLIZ = C520010KaN.LIZ(fragment.getActivity());
            if (interfaceC20622815msLIZ != null) {
                C520010KaN.LJIIL(interfaceC20622815msLIZ, interfaceC214902198iCreateStartBroadcastFragment, -1, bundle, 0, null, 24);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0279  */
    @Override // X.C0UQ8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C772410URr LJII(android.content.Context r11, com.bytedance.ies.sdk.datachannel.DataChannel r12, com.bytedance.android.livesdkapi.depend.handler.WeakHandler r13) {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C772460URw.LJII(android.content.Context, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdkapi.depend.handler.WeakHandler):X.0URr");
    }
}
