package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587690N3f {
    public static final EnumC587690N3f COLD_BOOT_API;
    public static final EnumC587690N3f COLD_BOOT_FEED;
    public static final EnumC587690N3f COLD_CACHE;
    public static final /* synthetic */ EnumC587690N3f[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC587690N3f NONE;
    public static final EnumC587690N3f WARM_UP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC587690N3f> getEntries() {
        return LLILLL;
    }

    static {
        EnumC587690N3f enumC587690N3f = new EnumC587690N3f("NONE", 0, 0);
        NONE = enumC587690N3f;
        EnumC587690N3f enumC587690N3f2 = new EnumC587690N3f("COLD_CACHE", 1, 1);
        COLD_CACHE = enumC587690N3f2;
        EnumC587690N3f enumC587690N3f3 = new EnumC587690N3f("WARM_UP", 2, 2);
        WARM_UP = enumC587690N3f3;
        EnumC587690N3f enumC587690N3f4 = new EnumC587690N3f("COLD_BOOT_API", 3, 3);
        COLD_BOOT_API = enumC587690N3f4;
        EnumC587690N3f enumC587690N3f5 = new EnumC587690N3f("COLD_BOOT_FEED", 4, 4);
        COLD_BOOT_FEED = enumC587690N3f5;
        EnumC587690N3f[] enumC587690N3fArr = {enumC587690N3f, enumC587690N3f2, enumC587690N3f3, enumC587690N3f4, enumC587690N3f5};
        LLILLJJLI = enumC587690N3fArr;
        LLILLL = new C2254308sP(enumC587690N3fArr);
    }

    public static EnumC587690N3f[] values() {
        return (EnumC587690N3f[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC587690N3f valueOf(String str) {
        return (EnumC587690N3f) C08FF.LIZ(EnumC587690N3f.class, str);
    }

    public EnumC587690N3f(String str, int i, int i2) {
        this.LL = i2;
    }
}
