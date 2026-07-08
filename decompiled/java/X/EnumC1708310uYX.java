package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uYX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1708310uYX {
    public static final /* synthetic */ EnumC1708310uYX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1708310uYX PENDING;
    public static final EnumC1708310uYX REDIRECT;
    public static final EnumC1708310uYX SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1708310uYX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1708310uYX enumC1708310uYX = new EnumC1708310uYX("SUCCESS", 0, "success");
        SUCCESS = enumC1708310uYX;
        EnumC1708310uYX enumC1708310uYX2 = new EnumC1708310uYX("REDIRECT", 1, "redirect");
        REDIRECT = enumC1708310uYX2;
        EnumC1708310uYX enumC1708310uYX3 = new EnumC1708310uYX("PENDING", 2, "pending");
        PENDING = enumC1708310uYX3;
        EnumC1708310uYX[] enumC1708310uYXArr = {enumC1708310uYX, enumC1708310uYX2, enumC1708310uYX3};
        LLILLJJLI = enumC1708310uYXArr;
        LLILLL = new C2254308sP(enumC1708310uYXArr);
    }

    public static EnumC1708310uYX[] values() {
        return (EnumC1708310uYX[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1708310uYX valueOf(String str) {
        return (EnumC1708310uYX) C08FF.LIZ(EnumC1708310uYX.class, str);
    }

    public EnumC1708310uYX(String str, int i, String str2) {
        this.LL = str2;
    }
}
