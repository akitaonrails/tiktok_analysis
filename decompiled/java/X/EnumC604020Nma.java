package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC604020Nma {
    public static final EnumC604020Nma BROWSER;
    public static final EnumC604020Nma CUSTOM_TAB;
    public static final /* synthetic */ EnumC604020Nma[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC604020Nma> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC604020Nma enumC604020Nma = new EnumC604020Nma("CUSTOM_TAB", 0);
        CUSTOM_TAB = enumC604020Nma;
        EnumC604020Nma enumC604020Nma2 = new EnumC604020Nma("BROWSER", 1);
        BROWSER = enumC604020Nma2;
        EnumC604020Nma[] enumC604020NmaArr = {enumC604020Nma, enumC604020Nma2};
        LL = enumC604020NmaArr;
        LLILLJJLI = new C2254308sP(enumC604020NmaArr);
    }

    public static EnumC604020Nma[] values() {
        return (EnumC604020Nma[]) LL.clone();
    }

    public static EnumC604020Nma valueOf(String str) {
        return (EnumC604020Nma) C08FF.LIZ(EnumC604020Nma.class, str);
    }

    public EnumC604020Nma(String str, int i) {
    }
}
