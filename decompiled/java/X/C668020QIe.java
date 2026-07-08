package X;

import android.text.TextUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0QIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668020QIe {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Integer num, String str2, String str3, String str4, Long l, boolean z, String str5, String str6, boolean z2, boolean z3, String str7, String str8, int i) {
        final boolean z4 = z2;
        final String str9 = str6;
        final boolean z5 = z;
        final Long l2 = l;
        final String str10 = str4;
        final String str11 = str3;
        final String str12 = str2;
        final Integer num2 = num;
        final String str13 = str7;
        final String str14 = str;
        final String str15 = "";
        if ((i & 1) != 0) {
            str14 = "";
        }
        final String str16 = null;
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            str12 = "";
        }
        if ((i & 8) != 0) {
            str11 = null;
        }
        if ((i & 16) != 0) {
            str10 = "";
        }
        if ((i & 32) != 0) {
            l2 = null;
        }
        final boolean z6 = false;
        if ((i & 64) != 0) {
            z5 = false;
        }
        if ((i & 128) == 0) {
            str15 = str5;
        }
        if ((i & 256) != 0) {
            str9 = null;
        }
        if ((i & 512) != 0) {
            z4 = false;
        }
        if ((i & 1024) == 0) {
            z6 = z3;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str13 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0) {
            str16 = str8;
        }
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0QIc
            public final void LIZ() {
                C650460PfI<C0QIZ> c650460PfI = new C650460PfI<C0QIZ>() { // from class: X.0QIf
                };
                Integer num3 = num2;
                if (num3 != null) {
                    c650460PfI.LJ("words_position", num3.toString());
                }
                if (C123100dR.LIZ(str11)) {
                    c650460PfI.LJ("history_source", str11);
                }
                Long l3 = l2;
                if (l3 != null) {
                    c650460PfI.LJ("last_time_search", String.valueOf(l3.longValue()));
                }
                if (C123100dR.LIZ(str14)) {
                    c650460PfI.LJJIJ(str14);
                }
                if (C123100dR.LIZ(str10)) {
                    c650460PfI.LJ("words_label", str10);
                }
                if (str15.length() > 0) {
                    c650460PfI.LJIIZILJ("music_id", str15);
                    if (C123100dR.LIZ(str9)) {
                        c650460PfI.LJ("is_origin_music", str9);
                    }
                }
                if (C123100dR.LIZ(str16)) {
                    c650460PfI.LJ("subtitle_type", str16);
                }
                c650460PfI.LJ("has_sound_label", z5 ? "1" : CardStruct.IStatusCode.DEFAULT);
                c650460PfI.LJ("is_more_songs", z4 ? "1" : CardStruct.IStatusCode.DEFAULT);
                c650460PfI.LJ("is_invalid_songs", z6 ? "1" : CardStruct.IStatusCode.DEFAULT);
                c650460PfI.LJ("search_position", str12);
                c650460PfI.LJ("blankpage_id", str13);
                c650460PfI.LJIILJJIL();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SearchHistoryStatistics@5509.mobSearchHistoryWordsShow$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SearchHistoryStatistics@5509.mobSearchHistoryWordsShow$1");
            }
        });
    }

    public static void LIZIZ(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Long l, boolean z, String str8, String str9, boolean z2, boolean z3, String str10, String str11, int i) {
        final String str12 = str11;
        final String str13 = str10;
        final boolean z4 = z2;
        final boolean z5 = z;
        final Long l2 = l;
        final String str14 = str7;
        final String str15 = str6;
        final String str16 = str5;
        final Integer num2 = num;
        final String str17 = str4;
        final String str18 = str3;
        final String str19 = str2;
        final String str20 = str9;
        final String str21 = str;
        final String str22 = "";
        if ((i & 1) != 0) {
            str21 = "";
        }
        if ((i & 2) != 0) {
            str19 = "";
        }
        if ((i & 4) != 0) {
            str18 = "";
        }
        if ((i & 8) != 0) {
            str17 = "";
        }
        if ((i & 16) != 0) {
            num2 = null;
        }
        if ((i & 32) != 0) {
            str16 = "";
        }
        if ((i & 64) != 0) {
            str15 = "";
        }
        if ((i & 128) != 0) {
            str14 = null;
        }
        if ((i & 256) != 0) {
            l2 = null;
        }
        final boolean z6 = false;
        if ((i & 512) != 0) {
            z5 = false;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0) {
            str22 = str8;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str20 = null;
        }
        if ((i & 8192) != 0) {
            z4 = false;
        }
        if ((i & 16384) == 0) {
            z6 = z3;
        }
        if ((32768 & i) != 0) {
            str13 = null;
        }
        if ((i & 65536) != 0) {
            str12 = null;
        }
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0QIb
            public final void LIZ() {
                C0QIZ c0qiz = new C0QIZ();
                Integer num3 = num2;
                if (num3 != null) {
                    c0qiz.LJIIZILJ("order", String.valueOf(num3));
                }
                if (C123100dR.LIZ(str17)) {
                    c0qiz.LJJIJ(str17);
                    c0qiz.LJ("words_label", str15);
                }
                if (C123100dR.LIZ(str14)) {
                    c0qiz.LJ("history_source", str14);
                }
                Long l3 = l2;
                if (l3 != null) {
                    c0qiz.LJ("last_time_search", String.valueOf(l3.longValue()));
                }
                if (str22.length() > 0) {
                    c0qiz.LJIIZILJ("music_id", str22);
                    if (C123100dR.LIZ(str20)) {
                        c0qiz.LJ("is_origin_music", str20);
                    }
                }
                if (C123100dR.LIZ(str12)) {
                    c0qiz.LJ("subtitle_type", str12);
                }
                c0qiz.LJ("search_position", str21);
                c0qiz.LJ("search_entrance", str19);
                String str23 = str16;
                if (!TextUtils.isEmpty(str23)) {
                    c0qiz.LJ("request_id", str23);
                }
                c0qiz.LJ("blankpage_id", str13);
                c0qiz.LJIIZILJ("action_type", str18);
                c0qiz.LJ("has_sound_label", z5 ? "1" : CardStruct.IStatusCode.DEFAULT);
                c0qiz.LJ("is_more_songs", z4 ? "1" : CardStruct.IStatusCode.DEFAULT);
                c0qiz.LJ("is_invalid_songs", z6 ? "1" : CardStruct.IStatusCode.DEFAULT);
                c0qiz.LJIILJJIL();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SearchHistoryStatistics@5509.sendClickEvent$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SearchHistoryStatistics@5509.sendClickEvent$1");
            }
        });
    }
}
