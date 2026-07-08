package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U4C, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U4C {
    public static final C0U4C AUDIENCE_LINK;
    public static final C0U4C BGM;
    public static final C0U4C BROADCAST_LINK;
    public static final C0U4C COHOST_INVITATION_LIST;
    public static final C0U4C DEFAULT;
    public static final C0U4C EFFECT_BEAUTY;
    public static final C0U4C EFFECT_FILTER;
    public static final C0U4C EFFECT_SEARCH_STICKER;
    public static final C0U4C EFFECT_SOUND;
    public static final C0U4C EFFECT_SOUND_EDITABLE;
    public static final C0U4C EFFECT_SOUND_MINI_V1;
    public static final C0U4C EFFECT_SOUND_MINI_V2;
    public static final C0U4C EFFECT_STICKER;
    public static final C0U4C EFFECT_VOICE;
    public static final C0U4C GIFT;
    public static final C0U4C KARAOKE_COMMON;
    public static final C0U4C KARAOKE_QUEUE;
    public static final /* synthetic */ C0U4C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0U4C PICTURE_PICKER;
    public static final C0U4C PUBLIC_SCREEN;
    public static final C0U4C RANK;
    public final String LL;

    public static InterfaceC2044707zh<C0U4C> getEntries() {
        return LLILLL;
    }

    static {
        C0U4C c0u4c = new C0U4C(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = c0u4c;
        C0U4C c0u4c2 = new C0U4C("RANK", 1, "rank");
        RANK = c0u4c2;
        C0U4C c0u4c3 = new C0U4C("COHOST_INVITATION_LIST", 2, "cohost_invitation_list");
        COHOST_INVITATION_LIST = c0u4c3;
        C0U4C c0u4c4 = new C0U4C("PUBLIC_SCREEN", 3, "public_screen");
        PUBLIC_SCREEN = c0u4c4;
        C0U4C c0u4c5 = new C0U4C("EFFECT_BEAUTY", 4, "effect_beauty");
        EFFECT_BEAUTY = c0u4c5;
        C0U4C c0u4c6 = new C0U4C("EFFECT_FILTER", 5, "effect_filter");
        EFFECT_FILTER = c0u4c6;
        C0U4C c0u4c7 = new C0U4C("EFFECT_STICKER", 6, "effect_sticker");
        EFFECT_STICKER = c0u4c7;
        C0U4C c0u4c8 = new C0U4C("EFFECT_SEARCH_STICKER", 7, "effect_search_sticker");
        EFFECT_SEARCH_STICKER = c0u4c8;
        C0U4C c0u4c9 = new C0U4C("EFFECT_VOICE", 8, "effect_voice");
        EFFECT_VOICE = c0u4c9;
        C0U4C c0u4c10 = new C0U4C("EFFECT_SOUND", 9, "effect_sound");
        EFFECT_SOUND = c0u4c10;
        C0U4C c0u4c11 = new C0U4C("EFFECT_SOUND_EDITABLE", 10, "effect_sound_editable");
        EFFECT_SOUND_EDITABLE = c0u4c11;
        C0U4C c0u4c12 = new C0U4C("EFFECT_SOUND_MINI_V1", 11, "effect_sound_mini_v1");
        EFFECT_SOUND_MINI_V1 = c0u4c12;
        C0U4C c0u4c13 = new C0U4C("EFFECT_SOUND_MINI_V2", 12, "effect_sound_mini_v2");
        EFFECT_SOUND_MINI_V2 = c0u4c13;
        C0U4C c0u4c14 = new C0U4C("BROADCAST_LINK", 13, "broadcast_link");
        BROADCAST_LINK = c0u4c14;
        C0U4C c0u4c15 = new C0U4C("AUDIENCE_LINK", 14, "audience_link");
        AUDIENCE_LINK = c0u4c15;
        C0U4C c0u4c16 = new C0U4C("GIFT", 15, "gift");
        GIFT = c0u4c16;
        C0U4C c0u4c17 = new C0U4C("BGM", 16, "bgm");
        BGM = c0u4c17;
        C0U4C c0u4c18 = new C0U4C("KARAOKE_COMMON", 17, "karaoke_common");
        KARAOKE_COMMON = c0u4c18;
        C0U4C c0u4c19 = new C0U4C("KARAOKE_QUEUE", 18, "karaoke_queue");
        KARAOKE_QUEUE = c0u4c19;
        C0U4C c0u4c20 = new C0U4C("PICTURE_PICKER", 19, "picture_picker");
        PICTURE_PICKER = c0u4c20;
        C0U4C[] c0u4cArr = {c0u4c, c0u4c2, c0u4c3, c0u4c4, c0u4c5, c0u4c6, c0u4c7, c0u4c8, c0u4c9, c0u4c10, c0u4c11, c0u4c12, c0u4c13, c0u4c14, c0u4c15, c0u4c16, c0u4c17, c0u4c18, c0u4c19, c0u4c20};
        LLILLJJLI = c0u4cArr;
        LLILLL = new C2254308sP(c0u4cArr);
    }

    public static C0U4C[] values() {
        return (C0U4C[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0U4C valueOf(String str) {
        return (C0U4C) C08FF.LIZ(C0U4C.class, str);
    }

    public C0U4C(String str, int i, String str2) {
        this.LL = str2;
    }
}
