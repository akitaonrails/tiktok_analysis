package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rxt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1608710rxt {
    public static final EnumC1608710rxt AVATAR;
    public static final EnumC1608710rxt BADGE;
    public static final EnumC1608710rxt FRAME;
    public static final /* synthetic */ EnumC1608710rxt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1608710rxt OVERLAY;
    public static final EnumC1608710rxt RING;
    public static final EnumC1608710rxt SOCIAL_AVATAR;
    public static final EnumC1608710rxt STORY_NOTE;
    public static final EnumC1608710rxt STROKE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1608710rxt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1608710rxt enumC1608710rxt = new EnumC1608710rxt("AVATAR", 0, "avatar");
        AVATAR = enumC1608710rxt;
        EnumC1608710rxt enumC1608710rxt2 = new EnumC1608710rxt("SOCIAL_AVATAR", 1, "social_avatar");
        SOCIAL_AVATAR = enumC1608710rxt2;
        EnumC1608710rxt enumC1608710rxt3 = new EnumC1608710rxt("STROKE", 2, "stroke");
        STROKE = enumC1608710rxt3;
        EnumC1608710rxt enumC1608710rxt4 = new EnumC1608710rxt("RING", 3, "ring");
        RING = enumC1608710rxt4;
        EnumC1608710rxt enumC1608710rxt5 = new EnumC1608710rxt("BADGE", 4, "badge");
        BADGE = enumC1608710rxt5;
        EnumC1608710rxt enumC1608710rxt6 = new EnumC1608710rxt("FRAME", 5, "frame");
        FRAME = enumC1608710rxt6;
        EnumC1608710rxt enumC1608710rxt7 = new EnumC1608710rxt("OVERLAY", 6, "overlay");
        OVERLAY = enumC1608710rxt7;
        EnumC1608710rxt enumC1608710rxt8 = new EnumC1608710rxt("STORY_NOTE", 7, "story_note");
        STORY_NOTE = enumC1608710rxt8;
        EnumC1608710rxt[] enumC1608710rxtArr = {enumC1608710rxt, enumC1608710rxt2, enumC1608710rxt3, enumC1608710rxt4, enumC1608710rxt5, enumC1608710rxt6, enumC1608710rxt7, enumC1608710rxt8};
        LLILLJJLI = enumC1608710rxtArr;
        LLILLL = new C2254308sP(enumC1608710rxtArr);
    }

    public static EnumC1608710rxt[] values() {
        return (EnumC1608710rxt[]) LLILLJJLI.clone();
    }

    public final String getString() {
        return this.LL;
    }

    public static EnumC1608710rxt valueOf(String str) {
        return (EnumC1608710rxt) C08FF.LIZ(EnumC1608710rxt.class, str);
    }

    public EnumC1608710rxt(String str, int i, String str2) {
        this.LL = str2;
    }
}
