package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tl1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC755930Tl1 {
    public static final EnumC755930Tl1 LIVE_PREVIEW_COVER;
    public static final EnumC755930Tl1 LIVE_PREVIEW_ENTER_ROOM_GUIDE;
    public static final EnumC755930Tl1 LIVE_PREVIEW_GIFT_EFFECT;
    public static final EnumC755930Tl1 LIVE_PREVIEW_GRADUAL_BOTTOM;
    public static final EnumC755930Tl1 LIVE_PREVIEW_GRADUAL_TOP;
    public static final EnumC755930Tl1 LIVE_PREVIEW_LIVING_ANIM;
    public static final EnumC755930Tl1 LIVE_PREVIEW_PRE_PULL_STREAM_ON_DRAGGING;
    public static final /* synthetic */ EnumC755930Tl1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC755930Tl1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC755930Tl1 enumC755930Tl1 = new EnumC755930Tl1("LIVE_PREVIEW_COVER", 0, "live_preview_cover");
        LIVE_PREVIEW_COVER = enumC755930Tl1;
        EnumC755930Tl1 enumC755930Tl12 = new EnumC755930Tl1("LIVE_PREVIEW_LIVING_ANIM", 1, "live_preview_living_anim");
        LIVE_PREVIEW_LIVING_ANIM = enumC755930Tl12;
        EnumC755930Tl1 enumC755930Tl13 = new EnumC755930Tl1("LIVE_PREVIEW_PRE_PULL_STREAM_ON_DRAGGING", 2, "live_preview_pull_stream_on_dragging");
        LIVE_PREVIEW_PRE_PULL_STREAM_ON_DRAGGING = enumC755930Tl13;
        EnumC755930Tl1 enumC755930Tl14 = new EnumC755930Tl1("LIVE_PREVIEW_GIFT_EFFECT", 3, "live_preview_gift_effect");
        LIVE_PREVIEW_GIFT_EFFECT = enumC755930Tl14;
        EnumC755930Tl1 enumC755930Tl15 = new EnumC755930Tl1("LIVE_PREVIEW_GRADUAL_TOP", 4, "live_preview_gradual_top");
        LIVE_PREVIEW_GRADUAL_TOP = enumC755930Tl15;
        EnumC755930Tl1 enumC755930Tl16 = new EnumC755930Tl1("LIVE_PREVIEW_GRADUAL_BOTTOM", 5, "live_preview_gradual_bottom");
        LIVE_PREVIEW_GRADUAL_BOTTOM = enumC755930Tl16;
        EnumC755930Tl1 enumC755930Tl17 = new EnumC755930Tl1("LIVE_PREVIEW_ENTER_ROOM_GUIDE", 6, "live_preview_enter_room_guide");
        LIVE_PREVIEW_ENTER_ROOM_GUIDE = enumC755930Tl17;
        EnumC755930Tl1[] enumC755930Tl1Arr = {enumC755930Tl1, enumC755930Tl12, enumC755930Tl13, enumC755930Tl14, enumC755930Tl15, enumC755930Tl16, enumC755930Tl17};
        LLILLJJLI = enumC755930Tl1Arr;
        LLILLL = new C2254308sP(enumC755930Tl1Arr);
    }

    public static EnumC755930Tl1[] values() {
        return (EnumC755930Tl1[]) LLILLJJLI.clone();
    }

    public final String getBizName() {
        return this.LL;
    }

    public static EnumC755930Tl1 valueOf(String str) {
        return (EnumC755930Tl1) C08FF.LIZ(EnumC755930Tl1.class, str);
    }

    public EnumC755930Tl1(String str, int i, String str2) {
        this.LL = str2;
    }
}
