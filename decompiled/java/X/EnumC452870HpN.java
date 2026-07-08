package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC452870HpN {
    public static final EnumC452870HpN LL;
    public static final EnumC452870HpN LLILLJJLI;
    public static final EnumC452870HpN LLILLL;
    public static final EnumC452870HpN LLILZ;
    public static final EnumC452870HpN LLILZIL;
    public static final /* synthetic */ EnumC452870HpN[] LLILZLL;

    static {
        EnumC452870HpN enumC452870HpN = new EnumC452870HpN("TYPING", 0);
        LL = enumC452870HpN;
        EnumC452870HpN enumC452870HpN2 = new EnumC452870HpN("PHOTO_COMMENT", 1);
        LLILLJJLI = enumC452870HpN2;
        EnumC452870HpN enumC452870HpN3 = new EnumC452870HpN("REPLY_TO_STICKER", 2);
        LLILLL = enumC452870HpN3;
        EnumC452870HpN enumC452870HpN4 = new EnumC452870HpN("RECENT_FAVORITE", 3);
        LLILZ = enumC452870HpN4;
        EnumC452870HpN enumC452870HpN5 = new EnumC452870HpN("PLACEHOLDER", 4);
        LLILZIL = enumC452870HpN5;
        EnumC452870HpN[] enumC452870HpNArr = {enumC452870HpN, enumC452870HpN2, enumC452870HpN3, enumC452870HpN4, enumC452870HpN5};
        LLILZLL = enumC452870HpNArr;
        new C2254308sP(enumC452870HpNArr);
    }

    public static EnumC452870HpN[] values() {
        return (EnumC452870HpN[]) LLILZLL.clone();
    }

    public static EnumC452870HpN valueOf(String str) {
        return (EnumC452870HpN) C08FF.LIZ(EnumC452870HpN.class, str);
    }

    public EnumC452870HpN(String str, int i) {
    }
}
