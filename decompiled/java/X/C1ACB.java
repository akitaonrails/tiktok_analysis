package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkFeedPreviewAddMultiGuestParamsSetting;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.MultiGuestLayoutInfo;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserApplySettings;
import com.ss.android.ugc.aweme.feed.model.live.MultiLiveUserSettings;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ACB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACB implements C1AE4 {
    public final String LIZ;
    public final C0V2A LIZIZ;
    public final Map<String, String> LIZJ;
    public Aweme LIZLLL;
    public Aweme LJ;
    public double LJFF;
    public JSONObject LJI;
    public boolean LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public final C01GW LJIIJ;

    static {
        new Object() { // from class: X.1ADn
        };
    }

    public C1ACB(String str) {
        this.LIZ = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("live_preview_fluency_");
        sbLIZ.append(str);
        C0V2A c0v2a = new C0V2A(C2188811AlT.LIZIZ(sbLIZ), true);
        this.LIZIZ = c0v2a;
        this.LIZJ = new LinkedHashMap();
        this.LJIIJ = C452501pT.LIZIZ(new C1ADR());
        c0v2a.LIZLLL(new C0V22() { // from class: X.1ADQ
            @Override // X.C0V22
            public final void LIZIZ(double d) {
                this.LL.LJFF = d;
            }
        });
        c0v2a.LIZJ(new InterfaceC791210V1z() { // from class: X.1ADL
            @Override // X.InterfaceC791210V1z
            public final void LIZLLL(JSONObject jSONObject) {
                C1ACB c1acb = this.LL;
                c1acb.LJI = jSONObject;
                c1acb.LIZ(false);
            }
        });
        C0V2B c0v2b = new C0V2B() { // from class: X.1ADC
            @Override // X.C0V2B
            public final void onEmpty() {
                this.LIZ.LJI = new JSONObject();
                this.LIZ.LIZ(true);
            }
        };
        C0V29 c0v29 = c0v2a.LJFF;
        if (c0v29 != null) {
            c0v29.LJFF = c0v2b;
        }
        c0v2a.LJ = c0v2b;
    }

    public final void LIZ(boolean z) {
        Aweme aweme;
        Aweme aweme2;
        int liveMgCoverShowStyle;
        LiveRoomStruct newLiveRoomDataExt;
        long j;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiGuestLayoutInfo multiGuestLayoutInfo;
        String str;
        Aweme aweme3 = this.LIZLLL;
        if (aweme3 == null || (aweme = this.LJ) == null) {
            return;
        }
        if (!AwemeSaaSExtKt.isLive(aweme3) && !AwemeSaaSExtKt.isLive(aweme)) {
            return;
        }
        if (Intrinsics.LJFF(this.LIZ, "preview_slide")) {
            if (Intrinsics.LJFF(aweme3.getAid(), aweme.getAid())) {
                return;
            }
        } else if (Intrinsics.LJFF(this.LIZ, "preview_watch") && !Intrinsics.LJFF(aweme3.getAid(), aweme.getAid())) {
            return;
        }
        this.LJIIIZ = System.currentTimeMillis();
        JSONObject jSONObject = this.LJI;
        if (jSONObject != null) {
            float f = LSPassThroughRecordSizeConfig.DEFAULT;
            float fIntValue = ((r4 - this.LJIIIIZZ) * ((Number) this.LJIIJ.getValue()).intValue()) / f;
            Iterator<String> itKeys = jSONObject.keys();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                int iOptInt = jSONObject.optInt(next);
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(next);
                if (numLJIIJJI != null) {
                    int iIntValue = numLJIIJJI.intValue();
                    if (3 <= iIntValue) {
                        if (iIntValue < 7) {
                            i9 += iOptInt;
                            i3 += iIntValue * iOptInt;
                        } else if (7 <= iIntValue) {
                            if (iIntValue < 16) {
                                i10 += iOptInt;
                                i2 += iIntValue * iOptInt;
                            } else if (16 <= iIntValue) {
                                if (iIntValue < 25) {
                                    i11 += iOptInt;
                                    i += iIntValue * iOptInt;
                                } else if (25 <= iIntValue) {
                                    if (iIntValue < 41) {
                                        i12 += iOptInt;
                                        i6 += iIntValue * iOptInt;
                                    } else {
                                        i7 += iOptInt;
                                        i5 += iIntValue * iOptInt;
                                    }
                                }
                            }
                        }
                    }
                    i8 += iOptInt;
                    i4 += (iIntValue + 1) * iOptInt;
                }
            }
            float f2 = i4;
            if (f2 > fIntValue) {
                fIntValue = f2;
            }
            float fMin = Math.min(f2 / fIntValue, 1.0f);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, this.LIZ);
            c2344009Gk.LIZ(this.LJFF, "fps");
            c2344009Gk.LIZJ(i9, "drop_3");
            c2344009Gk.LIZJ(i10, "drop_7");
            c2344009Gk.LIZJ(i11, "drop_16");
            c2344009Gk.LIZJ(i12, "drop_25");
            c2344009Gk.LIZJ(i7, "drop_41");
            c2344009Gk.LIZJ(i8, "drop_total");
            c2344009Gk.LIZLLL(this.LJIIIZ - this.LJIIIIZZ, "duration");
            c2344009Gk.LIZIZ(fMin, "ui_drawing_dur_proportion");
            c2344009Gk.LIZ(((this.LJFF - ((double) ((Number) this.LJIIJ.getValue()).intValue())) * ((double) fMin)) + ((double) ((Number) this.LJIIJ.getValue()).intValue()), "fps_total_sampling_android");
            if (!z && i4 > 0) {
                c2344009Gk.LIZIZ((((((i3 + i2) + i) + i6) + i5) / f2) * f, "drop_3_duration_ratio");
                c2344009Gk.LIZIZ((i3 / f2) * f, "drop_3_7_duration_ratio");
                c2344009Gk.LIZIZ((i2 / f2) * f, "drop_7_16_duration_ratio");
                c2344009Gk.LIZIZ((i / f2) * f, "drop_16_25_duration_ratio");
                c2344009Gk.LIZIZ((i6 / f2) * f, "drop_25_41_duration_ratio");
                c2344009Gk.LIZIZ((i5 / f2) * f, "drop_41_duration_ratio");
            }
            if (fIntValue > 0.0f) {
                c2344009Gk.LIZIZ((((((i3 + i2) + i) + i6) + i5) / fIntValue) * f, "drop_3_duration_ratio_total_sampling_android");
                c2344009Gk.LIZIZ((i3 / fIntValue) * f, "drop_3_7_duration_ratio_total_sampling_android");
                c2344009Gk.LIZIZ((i2 / fIntValue) * f, "drop_7_16_duration_ratio_total_sampling_android");
                c2344009Gk.LIZIZ((i / fIntValue) * f, "drop_16_25_duration_ratio_total_sampling_android");
                c2344009Gk.LIZIZ((i6 / fIntValue) * f, "drop_25_41_duration_ratio_total_sampling_android");
                c2344009Gk.LIZIZ((i5 / fIntValue) * f, "drop_41_duration_ratio_total_sampling_android");
            }
            c2344009Gk.LJII(this.LIZJ);
            c2344009Gk.LJFF(Scene.SCENE_SERVICE, this.LIZ);
            if (Intrinsics.LJFF(this.LIZ, "preview_slide")) {
                Aweme aweme4 = this.LJ;
                if (aweme4 != null && AwemeSaaSExtKt.isLive(aweme4)) {
                    str = "slide_in";
                } else {
                    str = "slide_out";
                }
                c2344009Gk.LJFF("sub_scene", str);
            }
            Aweme aweme5 = this.LJ;
            if (aweme5 != null && AwemeSaaSExtKt.isLive(aweme5)) {
                aweme2 = this.LJ;
            } else {
                aweme2 = this.LIZLLL;
            }
            if (aweme2 != null) {
                if (AwemeSaaSExtKt.isLive(aweme2) && (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme2)) != null) {
                    c2344009Gk.LIZLLL(newLiveRoomDataExt.id, "room_id");
                    c2344009Gk.LIZLLL(newLiveRoomDataExt.getAnchorId(), "author_id");
                    c2344009Gk.LJFF("live_type", RoomStruct.getStreamType(newLiveRoomDataExt).logStreamingType);
                    c2344009Gk.LJFF("request_id", aweme2.getRequestId());
                    c2344009Gk.LJFF("live_play_session_id", ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).getSessionId(Long.valueOf(newLiveRoomDataExt.id)));
                    if (LiveSdkFeedPreviewAddMultiGuestParamsSetting.isEnable()) {
                        MultiLiveUserSettings multiLiveUserSettings = newLiveRoomDataExt.multiLiveUserSettings;
                        if (multiLiveUserSettings != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null && (multiGuestLayoutInfo = multiLiveUserApplySettings.multiGuestLayoutInfo) != null) {
                            j = multiGuestLayoutInfo.guestCnt;
                        } else {
                            j = 0;
                        }
                        c2344009Gk.LIZJ((int) j, "guest_cnt");
                    }
                }
                if (AwemeBizExtKt.getLiveMgCoverShowStyle(aweme2) > 0) {
                    c2344009Gk.LJFF("mg_cover_type", "profile_voice");
                    if (aweme2 != null) {
                        liveMgCoverShowStyle = AwemeBizExtKt.getLiveMgCoverShowStyle(aweme2);
                    } else {
                        liveMgCoverShowStyle = 0;
                    }
                    c2344009Gk.LJFF("mg_cover_style", String.valueOf(liveMgCoverShowStyle));
                }
            }
            C20684815ws.LJIILLIIL("livesdk_preview_fluency", c2344009Gk.LIZ);
        }
    }

    public final void LIZIZ(Aweme aweme) {
        if (this.LJII) {
            return;
        }
        this.LIZLLL = null;
        this.LJ = null;
        ((LinkedHashMap) this.LIZJ).clear();
        this.LIZLLL = aweme;
        this.LIZIZ.LJFF();
        this.LJIIIIZZ = System.currentTimeMillis();
        this.LJII = true;
    }
}
