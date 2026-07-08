package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.MiniDramaCardInfo;
import com.ss.android.ugc.aweme.feed.model.MiniDramaFeedCardStyle;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.model.DramaContentType;
import com.ss.android.ugc.aweme.model.DramaFeedCardInsertScene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r9G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577320r9G {
    public static final C1577320r9G LIZ = new C1577320r9G();
    public static long LIZIZ;
    public static DramaFeedCardInsertScene LIZJ;
    public static DramaContentType LIZLLL;
    public static DramaFeedCardInsertScene LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static boolean LJII;

    public static String LIZ(Aweme aweme) {
        Integer num;
        MiniDramaCardInfo miniDramaCardInfo;
        if (aweme == null) {
            return "";
        }
        PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
        if (paidContentInfo != null && (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) != null) {
            num = miniDramaCardInfo.style;
        } else {
            num = null;
        }
        int value = MiniDramaFeedCardStyle.MINI_DRAMA_FEED_CARD_STYLE_DEFAULT.getValue();
        if (num != null && num.intValue() == value) {
            return "list_6drama";
        }
        int value2 = MiniDramaFeedCardStyle.MINI_DRAMA_FEED_CARD_STYLE_LIST.getValue();
        if (num != null && num.intValue() == value2) {
            return "list_3drama";
        }
        int value3 = MiniDramaFeedCardStyle.MINI_DRAMA_FEED_CARD_STYLE_HIGHLIGHT_VIDEO.getValue();
        if (num == null || num.intValue() != value3) {
            return "";
        }
        return "highlight";
    }

    public final void LIZJ(DramaFeedCardInsertScene dramaFeedCardInsertScene) {
        String strName;
        LJ = dramaFeedCardInsertScene;
        EnumC1577400r9O enumC1577400r9O = EnumC1577400r9O.FINAL_DESTINATION;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("current scene :");
        sbLIZ.append(dramaFeedCardInsertScene.name());
        sbLIZ.append(" insertScene : ");
        DramaFeedCardInsertScene dramaFeedCardInsertScene2 = LIZJ;
        if (dramaFeedCardInsertScene2 != null) {
            strName = dramaFeedCardInsertScene2.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        C2188811AlT.LIZIZ(sbLIZ);
        DramaFeedCardInsertScene dramaFeedCardInsertScene3 = LIZJ;
        DramaContentType dramaContentType = LIZLLL;
        boolean z = LJI;
        LIZIZ(this, enumC1577400r9O, null, null, null, null, null, null, null, null, null, null, null, null, dramaFeedCardInsertScene3, LJ, dramaContentType, Boolean.valueOf(LJFF), Boolean.valueOf(z), 16382);
    }

    public static void LIZIZ(C1577320r9G c1577320r9G, EnumC1577400r9O enumC1577400r9O, Integer num, Boolean bool, String str, String str2, Long l, Long l2, String str3, String str4, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, DramaFeedCardInsertScene dramaFeedCardInsertScene, DramaFeedCardInsertScene dramaFeedCardInsertScene2, DramaContentType dramaContentType, Boolean bool6, Boolean bool7, int i) {
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12 = str;
        Boolean bool8 = bool;
        Integer num2 = num;
        String str13 = str3;
        Long l3 = l2;
        Long l4 = l;
        String str14 = str2;
        Boolean bool9 = bool4;
        Boolean bool10 = bool3;
        Boolean bool11 = bool2;
        String str15 = str4;
        Boolean bool12 = bool7;
        Boolean bool13 = bool6;
        Boolean bool14 = bool5;
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            bool8 = null;
        }
        if ((i & 8) != 0) {
            str12 = null;
        }
        if ((i & 32) != 0) {
            str14 = null;
        }
        if ((i & 64) != 0) {
            l4 = null;
        }
        if ((i & 128) != 0) {
            l3 = null;
        }
        if ((i & 256) != 0) {
            str13 = null;
        }
        if ((i & 512) != 0) {
            str15 = null;
        }
        if ((i & 1024) != 0) {
            bool11 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool10 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            bool9 = null;
        }
        if ((i & 8192) != 0) {
            bool14 = null;
        }
        if ((i & 16384) != 0) {
            dramaFeedCardInsertScene = null;
        }
        if ((32768 & i) != 0) {
            dramaFeedCardInsertScene2 = null;
        }
        if ((65536 & i) != 0) {
            dramaContentType = null;
        }
        if ((131072 & i) != 0) {
            bool13 = null;
        }
        if ((i & 262144) != 0) {
            bool12 = null;
        }
        c1577320r9G.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("stage", enumC1577400r9O.getStage());
        c2344009Gk.LJ(num2, "request_num");
        Boolean bool15 = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(bool8, bool15);
        String str16 = "1";
        if (zLJFF) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("need_retry", str5);
        c2344009Gk.LJIIIIZZ("card_style", str12);
        c2344009Gk.LJIIIIZZ("remove_from", str14);
        c2344009Gk.LJ(l3, "duration");
        c2344009Gk.LJIIIIZZ("error_code", str13);
        c2344009Gk.LJIIIIZZ("error_message", str15);
        c2344009Gk.LJ(l4, "did_duration");
        if (Intrinsics.LJFF(bool13, bool15)) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_valid_video_data", str6);
        if (bool11 != null) {
            if (Intrinsics.LJFF(bool11, bool15)) {
                str11 = "1";
            } else {
                str11 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("should_show_card", str11);
        }
        if (bool10 != null) {
            if (Intrinsics.LJFF(bool10, bool15)) {
                str10 = "1";
            } else {
                str10 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("should_show_drama_tab", str10);
        }
        if (bool9 != null) {
            if (Intrinsics.LJFF(bool9, bool15)) {
                str9 = "1";
            } else {
                str9 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("should_show_innerfeed", str9);
        }
        if (dramaFeedCardInsertScene != null) {
            c2344009Gk.LIZJ(dramaFeedCardInsertScene.getValue(), "insert_scene");
        }
        if (dramaFeedCardInsertScene2 != null) {
            c2344009Gk.LIZJ(dramaFeedCardInsertScene2.getValue(), "final_insert_scene");
        }
        if (dramaContentType != null) {
            c2344009Gk.LIZJ(dramaContentType.getValue(), "content_type");
        }
        if (bool12 != null) {
            if (Intrinsics.LJFF(bool12, bool15)) {
                str8 = "1";
            } else {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("has_drama_tab", str8);
        }
        if (LJII) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJFF("enforce_login", str7);
        if (bool14 != null) {
            if (!Intrinsics.LJFF(bool14, bool15)) {
                str16 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("should_show_insert_video", str16);
        }
        C20684815ws.LJIILLIIL("drama_dnu_special_card_flow", c2344009Gk.LIZ);
    }
}
