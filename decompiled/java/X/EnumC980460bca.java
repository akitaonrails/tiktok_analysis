package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC980460bca {
    public static final C980510bcf Companion;
    public static final /* synthetic */ EnumC980460bca[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC980460bca OFF;
    public static final EnumC980460bca ON;
    public static final EnumC980460bca UNKNOWN;
    public final long LL;

    public static InterfaceC2044707zh<EnumC980460bca> getEntries() {
        return LLILLL;
    }

    static {
        EnumC980460bca enumC980460bca = new EnumC980460bca("UNKNOWN", 0, 0L);
        UNKNOWN = enumC980460bca;
        EnumC980460bca enumC980460bca2 = new EnumC980460bca("ON", 1, 1L);
        ON = enumC980460bca2;
        EnumC980460bca enumC980460bca3 = new EnumC980460bca("OFF", 2, 2L);
        OFF = enumC980460bca3;
        EnumC980460bca[] enumC980460bcaArr = {enumC980460bca, enumC980460bca2, enumC980460bca3};
        LLILLJJLI = enumC980460bcaArr;
        LLILLL = new C2254308sP(enumC980460bcaArr);
        Companion = new C980510bcf();
    }

    public static EnumC980460bca[] values() {
        return (EnumC980460bca[]) LLILLJJLI.clone();
    }

    public final boolean isOn() {
        return this == ON;
    }

    public final long getValue() {
        return this.LL;
    }

    public static EnumC980460bca valueOf(String str) {
        return (EnumC980460bca) C08FF.LIZ(EnumC980460bca.class, str);
    }

    public EnumC980460bca(String str, int i, long j) {
        this.LL = j;
    }
}
