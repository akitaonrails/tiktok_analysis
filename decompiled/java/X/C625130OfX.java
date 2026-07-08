package X;

import android.app.Application;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeManagerVM;
import java.util.Map;

/* JADX INFO: renamed from: X.0OfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625130OfX {
    public static final C625130OfX LIZ = new C625130OfX();
    public static final C19319410i8 LIZIZ = new C19319410i8("OfflineModeMobUtil");

    public static Integer LIZIZ() {
        return Integer.valueOf(C1479130oat.LJII());
    }

    public static String LIZ(OfflineModeManagerVM offlineModeManagerVM) {
        if (offlineModeManagerVM.getState().LLILZ) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static String LIZJ(C19EG c19eg) {
        Application application;
        if (c19eg != null) {
            application = c19eg.getApplication();
        } else {
            application = null;
        }
        return C625120OfW.LIZ(C786410Ut5.e3(application));
    }

    public static String LIZLLL(OfflineModeManagerVM offlineModeManagerVM) {
        boolean z;
        if (C624670Oen.LIZIZ()) {
            EnumC624770Oex enumC624770Oex = offlineModeManagerVM.getState().LLILLL;
            if (offlineModeManagerVM.getState().LLILLJJLI == 0) {
                z = true;
            } else {
                z = false;
            }
            return enumC624770Oex.toOfflineModePanelStatus(z);
        }
        return null;
    }

    public static void LJ(C625130OfX c625130OfX, String str, String str2, String str3, String str4, Integer num, Integer num2, String str5, Integer num3, Integer num4, Long l, String str6, String str7, String str8, Long l2, Integer num5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, Integer num6, Integer num7, String str21, String str22, String str23, String str24, Integer num8, Integer num9, Integer num10, Long l3, Integer num11, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, String str25, String str26, String str27, Integer num17, int i, int i2) {
        String str28 = str7;
        String str29 = str6;
        String str30 = str4;
        String str31 = str3;
        String str32 = str5;
        String str33 = str2;
        String str34 = str23;
        String str35 = str24;
        String str36 = str22;
        String str37 = str21;
        String str38 = str20;
        String str39 = str19;
        String str40 = str18;
        String str41 = str27;
        String str42 = str26;
        String str43 = str16;
        String str44 = str15;
        String str45 = str14;
        String str46 = str25;
        String str47 = str13;
        String str48 = str12;
        String str49 = str10;
        String str50 = str9;
        String str51 = str11;
        String str52 = str17;
        String str53 = str8;
        if ((i & 2) != 0) {
            str33 = null;
        }
        if ((i & 4) != 0) {
            str31 = null;
        }
        if ((i & 8) != 0) {
            str30 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        if ((i & 64) != 0) {
            str32 = null;
        }
        if ((i & 128) != 0) {
            num3 = null;
        }
        if ((i & 256) != 0) {
            num4 = null;
        }
        if ((i & 512) != 0) {
            l = null;
        }
        if ((i & 1024) != 0) {
            str29 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str28 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str53 = null;
        }
        if ((i & 8192) != 0) {
            l2 = null;
        }
        if ((i & 16384) != 0) {
            num5 = null;
        }
        if ((i & 32768) != 0) {
            str50 = null;
        }
        if ((i & 65536) != 0) {
            str49 = null;
        }
        if ((131072 & i) != 0) {
            str51 = null;
        }
        if ((262144 & i) != 0) {
            str48 = null;
        }
        if ((524288 & i) != 0) {
            str47 = null;
        }
        if ((1048576 & i) != 0) {
            str45 = null;
        }
        if ((2097152 & i) != 0) {
            str44 = null;
        }
        if ((4194304 & i) != 0) {
            str43 = null;
        }
        if ((8388608 & i) != 0) {
            str52 = null;
        }
        if ((16777216 & i) != 0) {
            str40 = null;
        }
        if ((67108864 & i) != 0) {
            str39 = null;
        }
        if ((134217728 & i) != 0) {
            str38 = null;
        }
        if ((268435456 & i) != 0) {
            num6 = null;
        }
        if ((536870912 & i) != 0) {
            num7 = null;
        }
        if ((1073741824 & i) != 0) {
            str37 = null;
        }
        if ((i & Integer.MIN_VALUE) != 0) {
            str36 = null;
        }
        if ((i2 & 1) != 0) {
            str34 = null;
        }
        if ((i2 & 2) != 0) {
            str35 = null;
        }
        if ((i2 & 8) != 0) {
            num8 = null;
        }
        if ((i2 & 16) != 0) {
            num9 = null;
        }
        if ((i2 & 32) != 0) {
            num10 = null;
        }
        if ((i2 & 64) != 0) {
            l3 = null;
        }
        if ((i2 & 128) != 0) {
            num11 = null;
        }
        if ((i2 & 256) != 0) {
            num12 = null;
        }
        if ((i2 & 512) != 0) {
            num13 = null;
        }
        if ((i2 & 1024) != 0) {
            num14 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num15 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num16 = null;
        }
        if ((i2 & 8192) != 0) {
            str46 = null;
        }
        if ((i2 & 16384) != 0) {
            str42 = null;
        }
        if ((i2 & 32768) != 0) {
            str41 = null;
        }
        if ((i2 & 65536) != 0) {
            num17 = null;
        }
        c625130OfX.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str33 != null) {
            c2344009Gk.LJFF("enter_from", str33);
        }
        if (str31 != null) {
            c2344009Gk.LJFF("enter_method", str31);
        }
        if (str30 != null) {
            c2344009Gk.LJFF("network_status", str30);
        }
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            c2344009Gk.LIZJ(iIntValue, "network_speed");
        }
        if (num2 != null) {
            c2344009Gk.LIZJ(num2.intValue(), "cache_count");
        }
        if (str32 != null) {
            c2344009Gk.LJFF("block_type", str32);
        }
        if (num3 != null) {
            c2344009Gk.LIZJ(num3.intValue(), "start_reason");
        }
        if (num4 != null) {
            c2344009Gk.LIZJ(num4.intValue(), "end_reason");
        }
        if (l != null) {
            c2344009Gk.LIZLLL(l.longValue(), "cache_size");
        }
        if (str29 != null) {
            c2344009Gk.LJFF("cache_status", str29);
        }
        if (str28 != null) {
            c2344009Gk.LJFF("clean_type", str28);
        }
        if (str53 != null) {
            c2344009Gk.LJFF("to_status", str53);
        }
        if (l2 != null) {
            c2344009Gk.LIZLLL(l2.longValue(), "duration");
        }
        if (num5 != null) {
            c2344009Gk.LIZJ(num5.intValue(), "cache_percent");
        }
        if (str50 != null) {
            c2344009Gk.LJFF("toast_type", str50);
        }
        if (str49 != null) {
            c2344009Gk.LJFF("exit_method", str49);
        }
        if (str51 != null) {
            c2344009Gk.LJFF("vv", str51);
        }
        if (str48 != null) {
            c2344009Gk.LJFF("vv_finish", str48);
        }
        if (str47 != null) {
            c2344009Gk.LJFF("stay_duration", str47);
        }
        if (str45 != null) {
            c2344009Gk.LJFF("like_count", str45);
        }
        if (str44 != null) {
            c2344009Gk.LJFF("follow_count", str44);
        }
        if (str43 != null) {
            c2344009Gk.LJFF("favourite_count", str43);
        }
        if (str52 != null) {
            c2344009Gk.LJFF("group_id", str52);
        }
        if (str40 != null) {
            c2344009Gk.LJFF("position", str40);
        }
        if (str39 != null) {
            c2344009Gk.LJFF("request_id", str39);
        }
        if (str38 != null) {
            c2344009Gk.LJFF("status_codes", str38);
        }
        if (num6 != null) {
            c2344009Gk.LIZJ(num6.intValue(), "sum_remain_count");
        }
        if (num7 != null) {
            c2344009Gk.LIZJ(num7.intValue(), "empty_count");
        }
        if (str37 != null) {
            c2344009Gk.LJFF("offline_mode_panel_status", str37);
        }
        if (str36 != null) {
            c2344009Gk.LJFF("download_over_wifi_status", str36);
        }
        if (str34 != null) {
            c2344009Gk.LJFF("expected_update_number", str34);
        }
        if (str35 != null) {
            c2344009Gk.LJFF("real_update_number", str35);
        }
        if (num8 != null) {
            c2344009Gk.LIZJ(num8.intValue(), "filter_cnt");
        }
        if (num9 != null) {
            c2344009Gk.LIZJ(num9.intValue(), "offline_status");
        }
        if (num10 != null) {
            c2344009Gk.LIZJ(num10.intValue(), "offline_video_cnt");
        }
        if (l3 != null) {
            c2344009Gk.LIZLLL(l3.longValue(), "offline_video_size");
        }
        if (num11 != null) {
            c2344009Gk.LIZJ(num11.intValue(), "offline_download_limit");
        }
        if (num12 != null) {
            c2344009Gk.LIZJ(num12.intValue(), "expired_cnt");
        }
        if (num13 != null) {
            c2344009Gk.LIZJ(num13.intValue(), "watched_cnt");
        }
        if (num14 != null) {
            c2344009Gk.LIZJ(num14.intValue(), "duplicate_cnt");
        }
        if (num15 != null) {
            c2344009Gk.LIZJ(num15.intValue(), "before_count");
        }
        if (num16 != null) {
            c2344009Gk.LIZJ(num16.intValue(), "after_count");
        }
        if (str46 != null) {
            c2344009Gk.LJFF("action_type", str46);
        }
        if (str42 != null) {
            c2344009Gk.LJFF("last_open_date", str42);
        }
        if (str41 != null) {
            c2344009Gk.LJFF("last_clear_date", str41);
        }
        if (num17 != null) {
            c2344009Gk.LIZJ(num17.intValue(), "cache_type");
        }
        Map<String, String> map = c2344009Gk.LIZ;
        LIZIZ.LIZ(str, map);
        C20684815ws.LJIILLIIL(str, map);
    }
}
