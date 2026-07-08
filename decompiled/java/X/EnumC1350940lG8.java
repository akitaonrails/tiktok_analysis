package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lG8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1350940lG8 {
    public static final EnumC1350940lG8 COMMENT_DISLIKE;
    public static final EnumC1350940lG8 COMMENT_EMPTY;
    public static final /* synthetic */ EnumC1350940lG8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1350940lG8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1350940lG8 enumC1350940lG8 = new EnumC1350940lG8("COMMENT_DISLIKE", 0, "dislike");
        COMMENT_DISLIKE = enumC1350940lG8;
        EnumC1350940lG8 enumC1350940lG82 = new EnumC1350940lG8("COMMENT_EMPTY", 1, "no_comment");
        COMMENT_EMPTY = enumC1350940lG82;
        EnumC1350940lG8[] enumC1350940lG8Arr = {enumC1350940lG8, enumC1350940lG82};
        LLILLJJLI = enumC1350940lG8Arr;
        LLILLL = new C2254308sP(enumC1350940lG8Arr);
    }

    public static EnumC1350940lG8[] values() {
        return (EnumC1350940lG8[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1350940lG8 valueOf(String str) {
        return (EnumC1350940lG8) C08FF.LIZ(EnumC1350940lG8.class, str);
    }

    public EnumC1350940lG8(String str, int i, String str2) {
        this.LL = str2;
    }
}
