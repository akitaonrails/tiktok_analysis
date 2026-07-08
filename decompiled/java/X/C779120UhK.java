package X;

import com.bytedance.android.livesdk.dataChannel.MobileGameStreamInfo;
import com.bytedance.android.livesdk.game.broadcast.setting.MobileHighPingAdjustBitrateInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UhK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779120UhK implements C0UWD {
    public static final float LJIILIIL = MobileHighPingAdjustBitrateInfo.INSTANCE.getValue().getHigh_ping_limit_bitrate_allow_range();
    public int LIZ = -1;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;
    public int LJII = -1;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;

    public final void LIZLLL() {
        this.LJIIL = 0;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = 0;
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LIZ = -1;
        this.LIZIZ = -1;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJ = -1;
        this.LJFF = -1;
        this.LJI = -1;
        this.LJII = -1;
    }

    @Override // X.C0UWD
    public final void LIZ() {
        LIZLLL();
        DataChannelGlobal.LLILZ.zQ2(this);
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // X.C0UWD
    public final void LIZIZ() {
        LIZLLL();
        DataChannelGlobal.LLILZ.DQ2(MobileGameStreamInfo.class, this, new AwS591S0100000_12(this, 1209));
    }

    public final void LIZJ(int i, int i2, int i3, boolean z) {
        AbstractC1273900jFs liveCore;
        boolean z2;
        long id;
        String str;
        String str2;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) dataChannelGlobal.gg0(C930890aKd.class);
        if (interfaceC769940UIe != null && (liveCore = interfaceC769940UIe.getLiveCore()) != null) {
            this.LJIIJJI = true;
            TEBundle tEBundle = new TEBundle();
            tEBundle.setInt("defaultBitrate", i2 * LSPassThroughRecordSizeConfig.DEFAULT);
            tEBundle.setInt("minBitrate", i * LSPassThroughRecordSizeConfig.DEFAULT);
            tEBundle.setInt("maxBitrate", i3 * LSPassThroughRecordSizeConfig.DEFAULT);
            tEBundle.setString("from", "game_high_ping_optmize");
            liveCore.LJJLIIJ(tEBundle);
            tEBundle.release();
            this.LJI = i;
            this.LJII = i3;
            int i4 = 0;
            if (i3 == i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                i4 = this.LJIIL + 1;
            }
            this.LJIIL = i4;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_high_ping_bitrate_adjust");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
            if (z) {
                str = "reduce";
            } else {
                str = "recover";
            }
            c474500IjALIZ.LJJII(str, "bitrate_adjust_type");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LJIIL), "continue_reduce_count");
            if (z2) {
                str2 = "true";
            } else {
                str2 = "false";
            }
            c474500IjALIZ.LJJII(str2, "max_bitrate_reduce_to_min_bitrate");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LIZJ), "origin_max_bitrate");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LIZ), "origin_min_bitrate");
            c474500IjALIZ.LJJII(Integer.valueOf(i3), "new_max_bitrate");
            c474500IjALIZ.LIZ();
        }
    }
}
