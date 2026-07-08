package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zrX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1912290zrX {
    public static final EnumC1912290zrX CONFIRMED;
    public static final EnumC1912290zrX INIT;
    public static final /* synthetic */ EnumC1912290zrX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1912290zrX REQUESTED;
    public static final EnumC1912290zrX SKIPPED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1912290zrX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1912290zrX enumC1912290zrX = new EnumC1912290zrX("INIT", 0, "init");
        INIT = enumC1912290zrX;
        EnumC1912290zrX enumC1912290zrX2 = new EnumC1912290zrX("REQUESTED", 1, "requested");
        REQUESTED = enumC1912290zrX2;
        EnumC1912290zrX enumC1912290zrX3 = new EnumC1912290zrX("CONFIRMED", 2, "confirmed");
        CONFIRMED = enumC1912290zrX3;
        EnumC1912290zrX enumC1912290zrX4 = new EnumC1912290zrX("SKIPPED", 3, "skipped");
        SKIPPED = enumC1912290zrX4;
        EnumC1912290zrX[] enumC1912290zrXArr = {enumC1912290zrX, enumC1912290zrX2, enumC1912290zrX3, enumC1912290zrX4};
        LLILLJJLI = enumC1912290zrXArr;
        LLILLL = new C2254308sP(enumC1912290zrXArr);
    }

    public static EnumC1912290zrX[] values() {
        return (EnumC1912290zrX[]) LLILLJJLI.clone();
    }

    public final String getStatus() {
        return this.LL;
    }

    public static EnumC1912290zrX valueOf(String str) {
        return (EnumC1912290zrX) C08FF.LIZ(EnumC1912290zrX.class, str);
    }

    public EnumC1912290zrX(String str, int i, String str2) {
        this.LL = str2;
    }
}
