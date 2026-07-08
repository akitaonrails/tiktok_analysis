package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.RoomFeedCellStruct;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ITW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ITW {
    public static final C468980IaG LJI = new C468980IaG();
    public final C1ACD LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public C0IIZ LJ = C0IIZ.VeLivePlayerRotation0;
    public boolean LJFF;

    public C0ITW(C1ACD c1acd) {
        this.LIZ = c1acd;
    }

    public final void LIZIZ(String str) {
        int i;
        int i2;
        Map<String, Object> map = C1338270kvh.LIZ;
        if (this.LIZLLL && (i = this.LIZJ) != 0 && (i2 = this.LIZIZ) != 0) {
            this.LIZ.LJJI(i2, i, false);
            if (!Intrinsics.LJFF(str, "feedLoad") || !this.LIZ.getIfPreviewUsingPlayer()) {
                this.LIZ.f0(C0IIZ.VeLivePlayerRotation0, false);
                this.LIZ.stopUseTextureRender();
                this.LIZLLL = false;
            }
            this.LJFF = false;
            this.LJ = C0IIZ.VeLivePlayerRotation0;
            this.LIZIZ = 0;
            this.LIZJ = 0;
        }
    }

    public static void LIZ(LiveMode liveMode, C0IIZ c0iiz, C1ACA c1aca) {
        String string;
        Aweme aweme;
        RoomFeedCellStruct roomFeedCellStruct;
        LiveRoomStruct newLiveRoomData;
        String string2;
        Aweme aweme2;
        RoomFeedCellStruct roomFeedCellStruct2;
        LiveRoomStruct newLiveRoomData2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_game_audience_smart_steering_event");
        String str = "";
        if (c1aca == null || (aweme2 = c1aca.LIZIZ) == null || (roomFeedCellStruct2 = aweme2.getRoomFeedCellStruct()) == null || (newLiveRoomData2 = roomFeedCellStruct2.getNewLiveRoomData()) == null || (string = Long.valueOf(newLiveRoomData2.getAnchorId()).toString()) == null) {
            string = "";
        }
        c474500IjALIZ.LJJII(string, "anchor_id");
        if (c1aca != null && (aweme = c1aca.LIZIZ) != null && (roomFeedCellStruct = aweme.getRoomFeedCellStruct()) != null && (newLiveRoomData = roomFeedCellStruct.getNewLiveRoomData()) != null && (string2 = Long.valueOf(newLiveRoomData.id).toString()) != null) {
            str = string2;
        }
        c474500IjALIZ.LJJII(str, "room_id");
        c474500IjALIZ.LJJII(liveMode.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(C0II8.FEED_LIVE.value), "adjust_state");
        c474500IjALIZ.LJJII(Integer.valueOf(c0iiz.degree), "sei_rotation");
        c474500IjALIZ.LIZ();
    }

    public final void LIZJ(JSONObject jSONObject, MutableLiveData<C473250Ih9> mutableLiveData, LiveMode liveMode, C1ACA c1aca) {
        C0IIZ c0iiz;
        int i;
        int i2;
        int i3;
        int i4;
        try {
            Map<String, Object> map = C1338270kvh.LIZ;
            if (!this.LJFF) {
                C20441214yg.LJ("GameLiveFeedAudienceAutoRotateHelper", "return! because had not show first frame!");
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("game_orientation");
            if (jSONObjectOptJSONObject != null) {
                if (this.LIZIZ == 0 && this.LIZJ == 0) {
                    C473250Ih9 value = mutableLiveData.getValue();
                    if (value != null) {
                        i3 = value.LIZ;
                    } else {
                        i3 = 0;
                    }
                    this.LIZIZ = i3;
                    C473250Ih9 value2 = mutableLiveData.getValue();
                    if (value2 != null) {
                        i4 = value2.LIZIZ;
                    } else {
                        i4 = 0;
                    }
                    this.LIZJ = i4;
                    int i5 = this.LIZIZ;
                }
                if (this.LIZIZ != 0 && this.LIZJ != 0) {
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
                    if (this.LJ != c0iiz) {
                        int i6 = C464160IIc.LIZ[c0iiz.ordinal()];
                        if (i6 != 1 && i6 != 2) {
                            i = this.LIZJ;
                            i2 = this.LIZIZ;
                        } else {
                            i = this.LIZIZ;
                            i2 = this.LIZJ;
                        }
                        this.LJ = c0iiz;
                        this.LIZ.setHadGamePreviewLiveVideoRotated(true);
                        this.LIZ.dynamicOpenTextureRender();
                        this.LIZ.f0(c0iiz, true);
                        this.LIZ.LJJI(i, i2, true);
                        this.LIZLLL = true;
                        LIZ(liveMode, c0iiz, c1aca);
                        return;
                    }
                    return;
                }
                C20441214yg.LJ("GameLiveFeedAudienceAutoRotateHelper", "return!!  because originVideoWidth or originVideoHeight is 0");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryParseIntelligentAdjustScreenInfo(). catch exception. e=");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("GameLiveFeedAudienceAutoRotateHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
