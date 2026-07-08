package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1908280zl4 {
    public static final EnumC1908280zl4 DETAIL_TYPE_FOLLOW_REQUEST;
    public static final EnumC1908280zl4 DETAIL_TYPE_LIKE_LIST;
    public static final EnumC1908280zl4 DETAIL_TYPE_NOTIFICATION;
    public static final EnumC1908280zl4 DETAIL_TYPE_TRANSLATION_LIKE_LIST;
    public static final /* synthetic */ EnumC1908280zl4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1908280zl4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1908280zl4 enumC1908280zl4 = new EnumC1908280zl4("DETAIL_TYPE_LIKE_LIST", 0, "like_list");
        DETAIL_TYPE_LIKE_LIST = enumC1908280zl4;
        EnumC1908280zl4 enumC1908280zl42 = new EnumC1908280zl4("DETAIL_TYPE_NOTIFICATION", 1, "notification");
        DETAIL_TYPE_NOTIFICATION = enumC1908280zl42;
        EnumC1908280zl4 enumC1908280zl43 = new EnumC1908280zl4("DETAIL_TYPE_FOLLOW_REQUEST", 2, "follow_request");
        DETAIL_TYPE_FOLLOW_REQUEST = enumC1908280zl43;
        EnumC1908280zl4 enumC1908280zl44 = new EnumC1908280zl4("DETAIL_TYPE_TRANSLATION_LIKE_LIST", 3, "translation_like_list");
        DETAIL_TYPE_TRANSLATION_LIKE_LIST = enumC1908280zl44;
        EnumC1908280zl4[] enumC1908280zl4Arr = {enumC1908280zl4, enumC1908280zl42, enumC1908280zl43, enumC1908280zl44};
        LLILLJJLI = enumC1908280zl4Arr;
        LLILLL = new C2254308sP(enumC1908280zl4Arr);
    }

    public static EnumC1908280zl4[] values() {
        return (EnumC1908280zl4[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC1908280zl4 valueOf(String str) {
        return (EnumC1908280zl4) C08FF.LIZ(EnumC1908280zl4.class, str);
    }

    public EnumC1908280zl4(String str, int i, String str2) {
        this.LL = str2;
    }
}
