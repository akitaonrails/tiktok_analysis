package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.comp.api.game.service.IGameService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostFixRtmpErrorCode;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.Map;
import kotlin.jvm.internal.AwS11S0002000_12;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0UTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772830UTh {
    public static volatile boolean LIZ;
    public static boolean LIZIZ;

    public static final void LIZLLL(int i, long j, long j2, boolean z, int i2) {
        if (i != 30001) {
            if (i != 50002) {
                LIZ(10007, i, 0, "", j, j2, z, i2, 1);
                return;
            } else {
                LIZ(10006, i, 0, "", j, j2, z, i2, 1);
                return;
            }
        }
        LIZ(10005, i, 0, "", j, j2, z, i2, 1);
    }

    public static final void LIZIZ(int i, long j, long j2, boolean z, int i2, int i3) {
        LIZ(i, 0, 0, "", j, j2, z, i2, i3);
    }

    public static final void LIZ(int i, int i2, int i3, String str, long j, long j2, boolean z, int i4, int i5) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        String str2;
        Boolean boolValueOf;
        Integer numValueOf;
        String str3;
        long j3;
        int i6;
        int i7;
        int i8;
        LiveMode streamType;
        StreamUrl streamUrl;
        LiveMode streamType2;
        Boolean boolValueOf2;
        LiveMode streamType3;
        int i9 = i4;
        String strLIZ = str;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        C0UTQ c0utq = (C0UTQ) dataChannelGlobal.gg0(C931280aLG.class);
        String strLIZIZ = null;
        boolValueOf = null;
        Boolean boolValueOf3 = null;
        strLIZIZ = null;
        if (c0utq != null) {
            if (c0utq.LJIIL <= 0) {
                c0utq.LJIILIIL = -999;
            }
            if (c0utq.LJIILJJIL <= 0) {
                if (LiveHostFixRtmpErrorCode.INSTANCE.enable() && c0utq.LJIIL > 0 && i3 != 0) {
                    c0utq.LJIILL = i3;
                } else {
                    c0utq.LJIILL = -999;
                }
            }
            if (!c0utq.LJIJ) {
                c0utq.LJIILLIIL = System.currentTimeMillis();
                c0utq.LJIIZILJ = i;
                c0utq.LJIJ = true;
                c0utq.LJI = 6;
                C0UTP.LIZ.LIZLLL(null, 31);
            }
        }
        C776590UdF c776590UdF = (C776590UdF) dataChannelGlobal.gg0(C931370aLP.class);
        if (c776590UdF != null && c776590UdF.LJ == j2) {
            return;
        }
        if (!LIZIZ) {
            Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
            if (room != null && (streamType3 = room.getStreamType()) != null) {
                boolValueOf2 = Boolean.valueOf(C354201Zc.LIZLLL(streamType3));
            } else {
                boolValueOf2 = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf2)) {
                dataChannelGlobal.JQ2(C931300aLI.class, new C0UWB(i, i3, strLIZ));
            }
        }
        if (LIZ) {
            if (!LIZIZ) {
                Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                if (room2 != null && (streamType2 = room2.getStreamType()) != null) {
                    boolValueOf3 = Boolean.valueOf(C354201Zc.LIZLLL(streamType2));
                }
                if (C500260Jjc.LJJJI(boolValueOf3)) {
                    C773220UUu c773220UUu = C773220UUu.LIZ;
                    AwS11S0002000_12 awS11S0002000_12 = new AwS11S0002000_12(i, i3, 3);
                    c773220UUu.getClass();
                    C773220UUu.LJIIL(awS11S0002000_12);
                    LIZIZ = true;
                    return;
                }
                return;
            }
            return;
        }
        dataChannelGlobal.IQ2(C931370aLP.class);
        LIZ = true;
        LIZIZ = true;
        if (TextUtils.isEmpty(strLIZ)) {
            strLIZ = C0UWE.LIZ(i);
        }
        boolean zDU = ((IGameService) C1161920gLG.LIZJ(IGameService.class)).dU();
        Room room3 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        if (room3 != null && (streamUrl = room3.getStreamUrl()) != null) {
            strLIZIZ = streamUrl.LIZIZ();
        }
        if (C771670UOv.LJI) {
            i9 = 4;
        } else if (C771670UOv.LJFF) {
            i9 = 2;
        }
        C760160Trq c760160TrqLIZJ = C759970TrX.LIZJ("ttlive_video_stream_end_all");
        c760160TrqLIZJ.LJFF(Integer.valueOf(i), "error_code");
        c760160TrqLIZJ.LJII("error_msg", strLIZ);
        Boolean boolValueOf4 = Boolean.valueOf(z);
        JSONObject jSONObject = c760160TrqLIZJ.LIZIZ;
        if (boolValueOf4 != null) {
            zBooleanValue = boolValueOf4.booleanValue();
        } else {
            zBooleanValue = false;
        }
        jSONObject.put("isFirstPushStream", zBooleanValue);
        JSONObject jSONObject2 = c760160TrqLIZJ.LIZJ;
        if (boolValueOf4 != null) {
            zBooleanValue2 = boolValueOf4.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        jSONObject2.put("isFirstPushStream", zBooleanValue2);
        c760160TrqLIZJ.LJFF(Integer.valueOf(i2), "api_error_code");
        c760160TrqLIZJ.LJFF(Integer.valueOf(i3), "liveCore_error_code");
        c760160TrqLIZJ.LJII("user_id", C501590Jll.LIZIZ(String.valueOf(j)));
        c760160TrqLIZJ.LJI(Long.valueOf(j2), "room_id");
        c760160TrqLIZJ.LJFF(Integer.valueOf(i5), "error_type");
        if (!C0UWE.LIZLLL(i)) {
            str2 = "";
        } else {
            str2 = strLIZIZ;
        }
        c760160TrqLIZJ.LJII("push_params", str2);
        c760160TrqLIZJ.LJFF(Integer.valueOf(i9), "resume_scene");
        c760160TrqLIZJ.LJFF(Integer.valueOf(zDU ? 1 : 0), "isDualDevice");
        for (Map.Entry<String, String> entry : C0IJT.LIZ("").LJIIZILJ().entrySet()) {
            if (C500260Jjc.LJJIIZ(entry.getKey()) && C500260Jjc.LJJIIZ(entry.getValue())) {
                c760160TrqLIZJ.LIZIZ.put(entry.getKey(), entry.getValue());
            }
        }
        Float fValueOf = Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue());
        if (fValueOf != null && !Float.isNaN(fValueOf.floatValue()) && !Float.isInfinite(fValueOf.floatValue())) {
            c760160TrqLIZJ.LIZIZ.put("device_score", fValueOf);
            c760160TrqLIZJ.LIZJ.put("device_score", fValueOf);
        } else {
            c760160TrqLIZJ.LIZIZ.put("device_score", Float.valueOf(0.0f));
            c760160TrqLIZJ.LIZJ.put("device_score", Float.valueOf(0.0f));
        }
        c760160TrqLIZJ.LJIIIZ();
        DataChannelGlobal dataChannelGlobal2 = DataChannelGlobal.LLILZ;
        Room room4 = (Room) dataChannelGlobal2.gg0(C930940aKi.class);
        if (room4 != null && (streamType = room4.getStreamType()) != null) {
            boolValueOf = Boolean.valueOf(C354201Zc.LIZLLL(streamType));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            Context applicationContext = GlobalContext.getApplicationContext();
            if (applicationContext != null && new C815520Vyw(applicationContext).LIZ()) {
                i8 = 1;
            } else {
                i8 = 0;
            }
            numValueOf = Integer.valueOf(i8);
        } else {
            numValueOf = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("ttlive_video_stream_end_all");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(strLIZ, "error_msg");
        c474500IjALIZ.LJJII(Integer.valueOf(i5), "error_type");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "room_id");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_first_push_stream_fail");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "api_error_code");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "liveCore_error_code");
        if (!C0UWE.LIZLLL(i)) {
            strLIZIZ = "";
        }
        c474500IjALIZ.LJJII(strLIZIZ, "push_params");
        c474500IjALIZ.LJJII(Integer.valueOf(C772780UTc.LJIIIZ ? 1 : 0), "is_bytevc1");
        c474500IjALIZ.LJJII(Integer.valueOf(C772780UTc.LJIIJ ? 1 : 0), "is_hw");
        c474500IjALIZ.LJJII(Integer.valueOf(i9), "resume_scene");
        if (i9 == 4) {
            str3 = "anchor_manully";
        } else {
            str3 = "system";
        }
        c474500IjALIZ.LJJII(str3, "resume_type");
        c474500IjALIZ.LJJII(numValueOf, "is_notification_authorized");
        c474500IjALIZ.LJJII(Integer.valueOf(zDU ? 1 : 0), "isDualDevice");
        c474500IjALIZ.LJJIIZI(C771990UQb.LIZ);
        Map<String, String> map = C771670UOv.LJII;
        if (!map.isEmpty()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str4 = map.get("t_push_stream_failed_manual_end_live_duration");
            if (str4 != null) {
                j3 = CastLongProtector.parseLong(str4);
            } else {
                j3 = jCurrentTimeMillis;
            }
            c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis - j3), "t_push_stream_failed_manual_end_live_duration");
            String str5 = map.get("pushed_stream");
            if (str5 != null) {
                i6 = CastIntegerProtector.parseInt(str5);
            } else {
                i6 = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i6), "pushed_stream");
            String str6 = map.get("showed_first_frame");
            if (str6 != null) {
                i7 = CastIntegerProtector.parseInt(str6);
            } else {
                i7 = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i7), "showed_first_frame");
            map.clear();
        }
        c474500IjALIZ.LJJIJL();
        if (dataChannelGlobal2.gg0(C931010aKp.class) != null) {
            Map<String, Object> map2 = C1338270kvh.LIZ;
        }
    }
}
