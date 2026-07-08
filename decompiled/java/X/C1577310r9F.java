package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.MiniDramaCardInfo;
import com.ss.android.ugc.aweme.feed.model.MiniDramaFeedCardStyle;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r9F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577310r9F {
    public static final C1577310r9F LIZ = new C1577310r9F();

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

    public static String LIZIZ(Aweme aweme) {
        String aid;
        PaidContentInfo paidContentInfo;
        MiniDramaCardInfo miniDramaCardInfo;
        InterfaceC1577280r9C interfaceC1577280r9CLIZ;
        Aweme awemeLJIILLIIL;
        ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
        String str = null;
        if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577280r9CLIZ = iSeriesFeedServiceLIZIZ.LIZ()) != null && (awemeLJIILLIIL = interfaceC1577280r9CLIZ.LJIILLIIL()) != null) {
            aid = awemeLJIILLIIL.getAid();
        } else {
            aid = null;
        }
        if ((aweme == null || (paidContentInfo = aweme.mPaidContentInfo) == null || (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) == null || (str = miniDramaCardInfo.cardType) == null) && C1533950q1J.LJ(aid)) {
            return "pgc_drama_dnu_video";
        }
        if (Intrinsics.LJFF(str, "drama_guide")) {
            return "pgc_drama_guide_card";
        }
        return "pgc_drama_dnu_card";
    }

    public static boolean LJFF(Aweme aweme) {
        String str;
        PaidContentInfo paidContentInfo;
        MiniDramaCardInfo miniDramaCardInfo;
        if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) != null) {
            str = miniDramaCardInfo.cardType;
        } else {
            str = null;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "dnu");
        if (aweme != null && zLJFF) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(Aweme aweme, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        String str7;
        PaidContentInfo paidContentInfo;
        MiniDramaCardInfo miniDramaCardInfo;
        String aid = null;
        if (aweme != null && (paidContentInfo = aweme.mPaidContentInfo) != null && (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) != null) {
            str5 = miniDramaCardInfo.cardType;
        } else {
            str5 = null;
        }
        if (Intrinsics.LJFF(str5, "drama_guide") && Intrinsics.LJFF(str, "click")) {
            str6 = "special_shaped_card_click";
            str7 = "92";
        } else {
            if (LJFF(aweme)) {
                return;
            }
            str6 = "special_shaped_card";
            str7 = "pgc_drama_dnu_card";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        c2344009Gk.LJIIIIZZ("card_id", str7);
        if (aweme != null) {
            aid = aweme.getAid();
        }
        c2344009Gk.LJIIIIZZ("aweme_id", aid);
        c2344009Gk.LJIIIIZZ("business_type", "pgc");
        c2344009Gk.LJIIIIZZ("card_type", "card");
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("click_type", str2);
        c2344009Gk.LJIIIIZZ("click_position", str3);
        c2344009Gk.LJIIIIZZ("collection_id", str4);
        c2344009Gk.LJIIIIZZ("series_card_type", LIZ(aweme));
        C20684815ws.LJIILLIIL(str6, c2344009Gk.LIZ);
    }

    public static void LIZJ(C1577310r9F c1577310r9F, EnumC1577410r9P enumC1577410r9P, String str, Integer num, String str2, Long l, String str3, String str4, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        String str5;
        String str6;
        String str7;
        if ((i & 16) != 0) {
            str = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            l = null;
        }
        if ((i & 256) != 0) {
            str3 = null;
        }
        if ((i & 512) != 0) {
            str4 = null;
        }
        if ((i & 1024) != 0) {
            bool = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            bool2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            bool3 = null;
        }
        c1577310r9F.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("stage", enumC1577410r9P.getStage());
        c2344009Gk.LJIIIIZZ("attribution_from", null);
        Boolean bool4 = Boolean.TRUE;
        String str8 = "1";
        if (Intrinsics.LJFF(null, bool4)) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("need_retry", str5);
        c2344009Gk.LJIIIIZZ("card_style", str);
        c2344009Gk.LJ(num, "position");
        c2344009Gk.LJIIIIZZ("remove_from", str2);
        c2344009Gk.LJ(l, "duration");
        c2344009Gk.LJIIIIZZ("error_code", str3);
        c2344009Gk.LJIIIIZZ("error_message", str4);
        if (bool != null) {
            if (Intrinsics.LJFF(bool, bool4)) {
                str7 = "1";
            } else {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("should_show_card", str7);
        }
        if (bool2 != null) {
            if (Intrinsics.LJFF(bool2, bool4)) {
                str6 = "1";
            } else {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("should_show_drama_tab", str6);
        }
        if (bool3 != null) {
            if (!Intrinsics.LJFF(bool3, bool4)) {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJFF("should_show_innerfeed", str8);
        }
        C20684815ws.LJIILLIIL("drama_dnu_special_card_flow", c2344009Gk.LIZ);
    }
}
