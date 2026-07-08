package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC514040KDy {
    public static final EnumC514040KDy ANNIVERSARY;
    public static final EnumC514040KDy COMMON;
    public static final EnumC514040KDy CUSTOM_PROMOTION;
    public static final C0KEM Companion;
    public static final /* synthetic */ EnumC514040KDy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC514040KDy MULTI_MONTH;
    public static final EnumC514040KDy UNKNOWN;
    public final long LL;

    public static InterfaceC2044707zh<EnumC514040KDy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC514040KDy enumC514040KDy = new EnumC514040KDy("UNKNOWN", 0, 0L);
        UNKNOWN = enumC514040KDy;
        EnumC514040KDy enumC514040KDy2 = new EnumC514040KDy("ANNIVERSARY", 1, 1L);
        ANNIVERSARY = enumC514040KDy2;
        EnumC514040KDy enumC514040KDy3 = new EnumC514040KDy("COMMON", 2, 2L);
        COMMON = enumC514040KDy3;
        EnumC514040KDy enumC514040KDy4 = new EnumC514040KDy("MULTI_MONTH", 3, 3L);
        MULTI_MONTH = enumC514040KDy4;
        EnumC514040KDy enumC514040KDy5 = new EnumC514040KDy("CUSTOM_PROMOTION", 4, 4L);
        CUSTOM_PROMOTION = enumC514040KDy5;
        EnumC514040KDy[] enumC514040KDyArr = {enumC514040KDy, enumC514040KDy2, enumC514040KDy3, enumC514040KDy4, enumC514040KDy5};
        LLILLJJLI = enumC514040KDyArr;
        LLILLL = new C2254308sP(enumC514040KDyArr);
        Companion = new C0KEM();
    }

    public static EnumC514040KDy[] values() {
        return (EnumC514040KDy[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC514040KDy valueOf(String str) {
        return (EnumC514040KDy) C08FF.LIZ(EnumC514040KDy.class, str);
    }

    public EnumC514040KDy(String str, int i, long j) {
        this.LL = j;
    }
}
