package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1552350qUz {
    public static final EnumC1552350qUz CHECK_FAILED;
    public static final EnumC1552350qUz CHECK_SUCCEED_FILTERED_ALL_DOWNLOADED;
    public static final EnumC1552350qUz CHECK_SUCCEED_FILTERED_PARTIAL_DOWNLOADED;
    public static final EnumC1552350qUz CHECK_SUCCEED_NOT_FILTERED_ALL_DOWNLOADED;
    public static final EnumC1552350qUz CHECK_SUCCEED_NOT_FILTERED_PARTIAL_DOWNLOADED;
    public static final /* synthetic */ EnumC1552350qUz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1552350qUz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1552350qUz enumC1552350qUz = new EnumC1552350qUz("CHECK_FAILED", 0, 0);
        CHECK_FAILED = enumC1552350qUz;
        EnumC1552350qUz enumC1552350qUz2 = new EnumC1552350qUz("CHECK_SUCCEED_FILTERED_PARTIAL_DOWNLOADED", 1, 1);
        CHECK_SUCCEED_FILTERED_PARTIAL_DOWNLOADED = enumC1552350qUz2;
        EnumC1552350qUz enumC1552350qUz3 = new EnumC1552350qUz("CHECK_SUCCEED_FILTERED_ALL_DOWNLOADED", 2, 2);
        CHECK_SUCCEED_FILTERED_ALL_DOWNLOADED = enumC1552350qUz3;
        EnumC1552350qUz enumC1552350qUz4 = new EnumC1552350qUz("CHECK_SUCCEED_NOT_FILTERED_PARTIAL_DOWNLOADED", 3, 3);
        CHECK_SUCCEED_NOT_FILTERED_PARTIAL_DOWNLOADED = enumC1552350qUz4;
        EnumC1552350qUz enumC1552350qUz5 = new EnumC1552350qUz("CHECK_SUCCEED_NOT_FILTERED_ALL_DOWNLOADED", 4, 4);
        CHECK_SUCCEED_NOT_FILTERED_ALL_DOWNLOADED = enumC1552350qUz5;
        EnumC1552350qUz[] enumC1552350qUzArr = {enumC1552350qUz, enumC1552350qUz2, enumC1552350qUz3, enumC1552350qUz4, enumC1552350qUz5};
        LLILLJJLI = enumC1552350qUzArr;
        LLILLL = new C2254308sP(enumC1552350qUzArr);
    }

    public static EnumC1552350qUz[] values() {
        return (EnumC1552350qUz[]) LLILLJJLI.clone();
    }

    public final int getNumber() {
        return this.LL;
    }

    public static EnumC1552350qUz valueOf(String str) {
        return (EnumC1552350qUz) C08FF.LIZ(EnumC1552350qUz.class, str);
    }

    public EnumC1552350qUz(String str, int i, int i2) {
        this.LL = i2;
    }
}
