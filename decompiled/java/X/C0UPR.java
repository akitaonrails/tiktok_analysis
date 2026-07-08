package X;

import Y.AfS4S0100100_12;
import android.os.SystemClock;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.api.BroadcastRoomApi;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.android.livesdk.dataChannel.HashtagChangedChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewNoPermissionOptABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostEnableNetControlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostNetControlConfig;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.android.livesdkapi.host.LiveDispatchConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import webcast.api.room.CreateInfoRequest;

/* JADX INFO: renamed from: X.0UPR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment$queryCreateInfo$1$1", f = "LiveBroadcastPreviewFragment.kt", l = {}, m = "invokeSuspend")
public final class C0UPR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0UPM LL;
    public final /* synthetic */ LiveBroadcastPreviewFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UPR(C0UPM c0upm, LiveBroadcastPreviewFragment liveBroadcastPreviewFragment, InterfaceC1364105Vn<? super C0UPR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0upm;
        this.LLILLJJLI = liveBroadcastPreviewFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UPR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        RoomCreateInfo roomCreateInfo;
        long jLongValue;
        int i;
        Long l;
        C1C7U.LIZ("LiveBroadcastPreviewFragment@146.queryCreateInfo$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0UPM c0upm = this.LL;
        DataChannel dataChannel = null;
        if (c0upm != null) {
            roomCreateInfo = c0upm.LIZJ;
        } else {
            roomCreateInfo = null;
        }
        if (roomCreateInfo == null) {
            LiveBroadcastPreviewFragment liveBroadcastPreviewFragment = this.LLILLJJLI;
            liveBroadcastPreviewFragment.getClass();
            if (AnchorPreviewNoPermissionOptABSetting.INSTANCE.enable() || !Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C1148240fzC.class), Boolean.TRUE)) {
                if (LiveHostEnableNetControlSetting.INSTANCE.enable()) {
                    C20441214yg.LIZIZ("HostNetCtrl", "preview");
                    LiveDispatchConfig configByScene = LiveHostNetControlConfig.INSTANCE.getConfigByScene("biz_live_broadcast_preview");
                    if (configByScene != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("preview: ");
                        sbLIZ.append(GsonProtectorUtils.toJson(C293501Bt.LIZ(), configByScene));
                        C20441214yg.LIZIZ("HostNetCtrl", C2188811AlT.LIZIZ(sbLIZ));
                        ((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).registerNetworkControl(configByScene.getSceneName(), configByScene);
                    }
                }
                DataChannel dataChannel2 = liveBroadcastPreviewFragment.LLILZLL;
                if (dataChannel2 != null) {
                    dataChannel = dataChannel2;
                }
                Hashtag hashtag = (Hashtag) dataChannel.gg0(HashtagChangedChannel.class);
                long jLongValue2 = 0;
                if (hashtag != null && (l = hashtag.id) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                BroadcastRoomApi broadcastRoomApiLIZ = C01QD.LIZ().LIZ();
                CreateInfoRequest createInfoRequest = new CreateInfoRequest();
                createInfoRequest.lastTimeHashtagId = jLongValue;
                HashMap<String, String> mapLIZ = C0USY.LIZ.LIZ();
                if (mapLIZ == null) {
                    mapLIZ = new HashMap<>();
                }
                createInfoRequest.bannerShowStats = mapLIZ;
                HashMap<String, String> mapLIZ2 = C0USY.LIZIZ.LIZ();
                if (mapLIZ2 == null) {
                    mapLIZ2 = new HashMap<>();
                }
                createInfoRequest.bannerClickStats = mapLIZ2;
                HashMap<String, String> mapLIZ3 = C0USY.LIZJ.LIZ();
                if (mapLIZ3 == null) {
                    mapLIZ3 = new HashMap<>();
                }
                createInfoRequest.bannerCloseStats = mapLIZ3;
                createInfoRequest.isTeen = C781270Ukn.LJIIL().isNeedProtectMinor();
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Long l2 = (Long) dataChannelGlobal.gg0(C944430agT.class);
                if (l2 != null) {
                    jLongValue2 = l2.longValue();
                }
                createInfoRequest.inviterId = jLongValue2;
                createInfoRequest.hasEnteredTryMode = InterfaceC772600USk.zf.LIZIZ().booleanValue();
                if (Intrinsics.LJFF(dataChannelGlobal.gg0(C930740aKO.class), Boolean.TRUE)) {
                    i = 6;
                } else {
                    i = 0;
                }
                createInfoRequest.clientBannerType = i;
                broadcastRoomApiLIZ.getPreviewRoomCreateInfo(createInfoRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJIILIIL(C0J1R.LIZIZ(liveBroadcastPreviewFragment)).LJJLL(new AfS4S0100100_12(jElapsedRealtime, liveBroadcastPreviewFragment, 10), new AfS4S0100100_12(jElapsedRealtime, liveBroadcastPreviewFragment, 11));
            }
        } else {
            this.LLILLJJLI.ZR(roomCreateInfo);
        }
        C0UON.LIZJ(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.queryCreateInfo$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
