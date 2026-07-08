package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC514030KDx {
    public static final EnumC514030KDx ANNIVERSARY;
    public static final EnumC514030KDx COMMON;
    public static final EnumC514030KDx CUSTOM_PROMOTION;
    public static final C0KEC Companion;
    public static final /* synthetic */ EnumC514030KDx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC514030KDx MULTI_MONTH;
    public static final EnumC514030KDx UNKNOWN;
    public final long LL;

    public static InterfaceC2044707zh<EnumC514030KDx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC514030KDx enumC514030KDx = new EnumC514030KDx("UNKNOWN", 0, 0L);
        UNKNOWN = enumC514030KDx;
        EnumC514030KDx enumC514030KDx2 = new EnumC514030KDx("ANNIVERSARY", 1, 1L);
        ANNIVERSARY = enumC514030KDx2;
        EnumC514030KDx enumC514030KDx3 = new EnumC514030KDx("COMMON", 2, 2L);
        COMMON = enumC514030KDx3;
        EnumC514030KDx enumC514030KDx4 = new EnumC514030KDx("MULTI_MONTH", 3, 3L);
        MULTI_MONTH = enumC514030KDx4;
        EnumC514030KDx enumC514030KDx5 = new EnumC514030KDx("CUSTOM_PROMOTION", 4, 4L);
        CUSTOM_PROMOTION = enumC514030KDx5;
        EnumC514030KDx[] enumC514030KDxArr = {enumC514030KDx, enumC514030KDx2, enumC514030KDx3, enumC514030KDx4, enumC514030KDx5};
        LLILLJJLI = enumC514030KDxArr;
        LLILLL = new C2254308sP(enumC514030KDxArr);
        Companion = new C0KEC();
    }

    public static EnumC514030KDx[] values() {
        return (EnumC514030KDx[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC514030KDx valueOf(String str) {
        return (EnumC514030KDx) C08FF.LIZ(EnumC514030KDx.class, str);
    }

    public EnumC514030KDx(String str, int i, long j) {
        this.LL = j;
    }
}
