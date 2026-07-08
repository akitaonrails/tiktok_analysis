package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qzN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1571190qzN {
    public static final EnumC1571190qzN DARK;
    public static final EnumC1571190qzN LIGHT;
    public static final /* synthetic */ EnumC1571190qzN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1571190qzN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1571190qzN enumC1571190qzN = new EnumC1571190qzN("DARK", 0);
        DARK = enumC1571190qzN;
        EnumC1571190qzN enumC1571190qzN2 = new EnumC1571190qzN("LIGHT", 1);
        LIGHT = enumC1571190qzN2;
        EnumC1571190qzN[] enumC1571190qzNArr = {enumC1571190qzN, enumC1571190qzN2};
        LL = enumC1571190qzNArr;
        LLILLJJLI = new C2254308sP(enumC1571190qzNArr);
    }

    public static EnumC1571190qzN[] values() {
        return (EnumC1571190qzN[]) LL.clone();
    }

    public static EnumC1571190qzN valueOf(String str) {
        return (EnumC1571190qzN) C08FF.LIZ(EnumC1571190qzN.class, str);
    }

    public EnumC1571190qzN(String str, int i) {
    }
}
