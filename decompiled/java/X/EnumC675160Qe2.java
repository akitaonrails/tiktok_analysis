package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qe2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC675160Qe2 {
    public static final /* synthetic */ EnumC675160Qe2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC675160Qe2 PHOTO_SEARCH;
    public static final EnumC675160Qe2 SHOP_SEARCH_RESULT;

    public static InterfaceC2044707zh<EnumC675160Qe2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC675160Qe2 enumC675160Qe2 = new EnumC675160Qe2("SHOP_SEARCH_RESULT", 0);
        SHOP_SEARCH_RESULT = enumC675160Qe2;
        EnumC675160Qe2 enumC675160Qe22 = new EnumC675160Qe2("PHOTO_SEARCH", 1);
        PHOTO_SEARCH = enumC675160Qe22;
        EnumC675160Qe2[] enumC675160Qe2Arr = {enumC675160Qe2, enumC675160Qe22};
        LL = enumC675160Qe2Arr;
        LLILLJJLI = new C2254308sP(enumC675160Qe2Arr);
    }

    public static EnumC675160Qe2[] values() {
        return (EnumC675160Qe2[]) LL.clone();
    }

    public static EnumC675160Qe2 valueOf(String str) {
        return (EnumC675160Qe2) C08FF.LIZ(EnumC675160Qe2.class, str);
    }

    public EnumC675160Qe2(String str, int i) {
    }
}
