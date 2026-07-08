package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ueg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1712120ueg {
    public static final EnumC1712120ueg ENABLED;
    public static final /* synthetic */ EnumC1712120ueg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1712120ueg NOT_ENABLED;
    public static final EnumC1712120ueg NOT_SUPPORT;
    public static final EnumC1712120ueg SCANNING;

    public static InterfaceC2044707zh<EnumC1712120ueg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1712120ueg enumC1712120ueg = new EnumC1712120ueg("NOT_SUPPORT", 0);
        NOT_SUPPORT = enumC1712120ueg;
        EnumC1712120ueg enumC1712120ueg2 = new EnumC1712120ueg("NOT_ENABLED", 1);
        NOT_ENABLED = enumC1712120ueg2;
        EnumC1712120ueg enumC1712120ueg3 = new EnumC1712120ueg("ENABLED", 2);
        ENABLED = enumC1712120ueg3;
        EnumC1712120ueg enumC1712120ueg4 = new EnumC1712120ueg("SCANNING", 3);
        SCANNING = enumC1712120ueg4;
        EnumC1712120ueg[] enumC1712120uegArr = {enumC1712120ueg, enumC1712120ueg2, enumC1712120ueg3, enumC1712120ueg4};
        LL = enumC1712120uegArr;
        LLILLJJLI = new C2254308sP(enumC1712120uegArr);
    }

    public static EnumC1712120ueg[] values() {
        return (EnumC1712120ueg[]) LL.clone();
    }

    public static EnumC1712120ueg valueOf(String str) {
        return (EnumC1712120ueg) C08FF.LIZ(EnumC1712120ueg.class, str);
    }

    public EnumC1712120ueg(String str, int i) {
    }
}
