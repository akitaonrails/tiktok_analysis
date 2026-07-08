package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ine, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1256400ine {
    public static final C1256410inf Companion;
    public static final EnumC1256400ine HAS_AVATAR_AVATAR;
    public static final EnumC1256400ine HAS_AVATAR_BADGE;
    public static final EnumC1256400ine HAS_AVATAR_FRAME;
    public static final EnumC1256400ine HAS_AVATAR_NULL;
    public static final EnumC1256400ine HAS_AVATAR_OVERLAY;
    public static final EnumC1256400ine HAS_AVATAR_RING;
    public static final EnumC1256400ine HAS_AVATAR_STROKE;
    public static final EnumC1256400ine HAS_SOCIAL_AVATAR;
    public static final EnumC1256400ine HAS_STORY_NOTE;
    public static final /* synthetic */ EnumC1256400ine[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1256400ine> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1256400ine enumC1256400ine = new EnumC1256400ine("HAS_AVATAR_NULL", 0);
        HAS_AVATAR_NULL = enumC1256400ine;
        EnumC1256400ine enumC1256400ine2 = new EnumC1256400ine("HAS_AVATAR_RING", 1);
        HAS_AVATAR_RING = enumC1256400ine2;
        EnumC1256400ine enumC1256400ine3 = new EnumC1256400ine("HAS_AVATAR_STROKE", 2);
        HAS_AVATAR_STROKE = enumC1256400ine3;
        EnumC1256400ine enumC1256400ine4 = new EnumC1256400ine("HAS_AVATAR_BADGE", 3);
        HAS_AVATAR_BADGE = enumC1256400ine4;
        EnumC1256400ine enumC1256400ine5 = new EnumC1256400ine("HAS_AVATAR_FRAME", 4);
        HAS_AVATAR_FRAME = enumC1256400ine5;
        EnumC1256400ine enumC1256400ine6 = new EnumC1256400ine("HAS_AVATAR_AVATAR", 5);
        HAS_AVATAR_AVATAR = enumC1256400ine6;
        EnumC1256400ine enumC1256400ine7 = new EnumC1256400ine("HAS_SOCIAL_AVATAR", 6);
        HAS_SOCIAL_AVATAR = enumC1256400ine7;
        EnumC1256400ine enumC1256400ine8 = new EnumC1256400ine("HAS_AVATAR_OVERLAY", 7);
        HAS_AVATAR_OVERLAY = enumC1256400ine8;
        EnumC1256400ine enumC1256400ine9 = new EnumC1256400ine("HAS_STORY_NOTE", 8);
        HAS_STORY_NOTE = enumC1256400ine9;
        EnumC1256400ine[] enumC1256400ineArr = {enumC1256400ine, enumC1256400ine2, enumC1256400ine3, enumC1256400ine4, enumC1256400ine5, enumC1256400ine6, enumC1256400ine7, enumC1256400ine8, enumC1256400ine9};
        LL = enumC1256400ineArr;
        LLILLJJLI = new C2254308sP(enumC1256400ineArr);
        Companion = new C1256410inf();
    }

    public static EnumC1256400ine[] values() {
        return (EnumC1256400ine[]) LL.clone();
    }

    public static EnumC1256400ine valueOf(String str) {
        return (EnumC1256400ine) C08FF.LIZ(EnumC1256400ine.class, str);
    }

    public EnumC1256400ine(String str, int i) {
    }
}
