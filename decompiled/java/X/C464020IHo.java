package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.GameAutoRotateVideoTriggerEvent;
import com.bytedance.android.livesdk.pip.PipVideoViewContainDialog;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0IHo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464020IHo {
    public final DataChannel LIZ;
    public final LiveMode LIZIZ;
    public final Room LIZJ;
    public int LJ;
    public int LJFF;
    public C0IIZ LIZLLL = C0IIZ.VeLivePlayerRotation0;
    public boolean LJI = false;

    public final void LIZIZ(C0IIZ c0iiz) {
        String string;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_game_audience_smart_steering_event");
        User owner = this.LIZJ.getOwner();
        if (owner == null || (string = Long.valueOf(owner.getId()).toString()) == null) {
            string = "";
        }
        c474500IjALIZ.LJJII(string, "anchor_id");
        c474500IjALIZ.LJJII(String.valueOf(this.LIZJ.getId()), "room_id");
        c474500IjALIZ.LJJII(this.LIZIZ.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(C0II8.INNER_LIVE.value), "adjust_state");
        c474500IjALIZ.LJJII(Integer.valueOf(c0iiz.degree), "sei_rotation");
        c474500IjALIZ.LIZ();
    }

    public final boolean LIZ(boolean z, Room room) {
        Pair pair;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            pair = (Pair) dataChannel.gg0(C749250TaF.class);
        } else {
            pair = null;
        }
        if (room != null && room.getStreamType() == LiveMode.SCREEN_RECORD && pair != null) {
            if (((Number) pair.getFirst()).intValue() > ((Number) pair.getSecond()).intValue()) {
                return true;
            }
            return false;
        }
        return z;
    }

    public C464020IHo(LiveMode liveMode, Room room, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = liveMode;
        this.LIZJ = room;
    }

    public final void LIZJ(JSONObject jSONObject, C0IEB c0ieb, C463710IGj c463710IGj, C464010IHn c464010IHn, PipVideoViewContainDialog pipVideoViewContainDialog) {
        long jLongValue;
        C0IIZ c0iiz;
        int i;
        int i2;
        Long l;
        if (c0ieb != null && c463710IGj != null && c464010IHn != null) {
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null && (l = (Long) dataChannel.gg0(C0TZP.class)) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (System.currentTimeMillis() - jLongValue <= Mp4ScreenVideoLoadTimeout.CONTROL) {
                C20441214yg.LJ("GameLiveCommentSeiHelper", "tryParseIntelligentAdjustScreenInfo. return. full video button click time less than 10s");
                return;
            }
            if (C472950Igf.LIZLLL() && pipVideoViewContainDialog != null && pipVideoViewContainDialog.isShowing()) {
                C20441214yg.LJ("GameLiveCommentSeiHelper", "tryParseIntelligentAdjustScreenInfo. return. current is pip mode");
                return;
            }
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("game_orientation");
                if (jSONObjectOptJSONObject != null) {
                    if (this.LJ == 0 && this.LJFF == 0) {
                        this.LJ = ((InterfaceC464060IHs) c463710IGj.LIZ).getStreamWidth();
                        this.LJFF = ((InterfaceC464060IHs) c463710IGj.LIZ).getStreamHeight();
                        int i3 = this.LJ;
                        Map<String, Object> map = C1338270kvh.LIZ;
                    }
                    if (this.LJ != 0 && this.LJFF != 0) {
                        int iOptInt = jSONObjectOptJSONObject.optInt("rotation");
                        if (iOptInt != 1) {
                            if (iOptInt != 3) {
                                if (iOptInt != 6) {
                                    if (iOptInt != 8) {
                                        c0iiz = C0IIZ.VeLivePlayerRotation0;
                                    } else {
                                        c0iiz = C0IIZ.VeLivePlayerRotation270;
                                    }
                                } else {
                                    c0iiz = C0IIZ.VeLivePlayerRotation90;
                                }
                            } else {
                                c0iiz = C0IIZ.VeLivePlayerRotation180;
                            }
                        } else {
                            c0iiz = C0IIZ.VeLivePlayerRotation0;
                        }
                        if (this.LIZLLL != c0iiz) {
                            int i4 = C464050IHr.LIZ[c0iiz.ordinal()];
                            if (i4 != 1 && i4 != 2) {
                                i = this.LJFF;
                                i2 = this.LJ;
                            } else {
                                i = this.LJ;
                                i2 = this.LJFF;
                            }
                            DataChannel dataChannel2 = this.LIZ;
                            if (dataChannel2 != null) {
                                dataChannel2.SX0(C749250TaF.class, new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
                            }
                            DataChannel dataChannel3 = this.LIZ;
                            if (dataChannel3 != null) {
                                dataChannel3.FQ2(GameAutoRotateVideoTriggerEvent.class);
                            }
                            c464010IHn.onVideoSizeChanged(i, i2);
                            this.LIZLLL = c0iiz;
                            Map<String, Object> map2 = C1338270kvh.LIZ;
                            c0ieb.setHadGamePreviewLiveVideoRotated(false);
                            c0ieb.dynamicOpenTextureRender();
                            c0ieb.setRenderRotation(c0iiz);
                            this.LJI = true;
                            LIZIZ(c0iiz);
                            return;
                        }
                        return;
                    }
                    C20441214yg.LJ("GameLiveCommentSeiHelper", "return!!  because originVideoWidth or originVideoHeight is 0");
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryParseIntelligentAdjustScreenInfo(). catch exception. e=");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("GameLiveCommentSeiHelper", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
        }
        C20441214yg.LJ("GameLiveCommentSeiHelper", "tryParseIntelligentAdjustScreenInfo. return. because roomPlayer/renderView/playerCallback might be null");
    }
}
