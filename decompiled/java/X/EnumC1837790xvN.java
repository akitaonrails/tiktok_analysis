package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1837790xvN {
    public static final EnumC1837790xvN HARD;
    public static final /* synthetic */ EnumC1837790xvN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1837790xvN SOFT;

    public static InterfaceC2044707zh<EnumC1837790xvN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1837790xvN enumC1837790xvN = new EnumC1837790xvN("SOFT", 0);
        SOFT = enumC1837790xvN;
        EnumC1837790xvN enumC1837790xvN2 = new EnumC1837790xvN("HARD", 1);
        HARD = enumC1837790xvN2;
        EnumC1837790xvN[] enumC1837790xvNArr = {enumC1837790xvN, enumC1837790xvN2};
        LL = enumC1837790xvNArr;
        LLILLJJLI = new C2254308sP(enumC1837790xvNArr);
    }

    public static EnumC1837790xvN[] values() {
        return (EnumC1837790xvN[]) LL.clone();
    }

    public static EnumC1837790xvN valueOf(String str) {
        return (EnumC1837790xvN) C08FF.LIZ(EnumC1837790xvN.class, str);
    }

    public EnumC1837790xvN(String str, int i) {
    }
}
