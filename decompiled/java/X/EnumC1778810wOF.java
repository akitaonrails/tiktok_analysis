package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wOF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778810wOF {
    public static final EnumC1778810wOF KYB;
    public static final EnumC1778810wOF KYC;
    public static final /* synthetic */ EnumC1778810wOF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1778810wOF> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1778810wOF enumC1778810wOF = new EnumC1778810wOF("KYB", 0);
        KYB = enumC1778810wOF;
        EnumC1778810wOF enumC1778810wOF2 = new EnumC1778810wOF("KYC", 1);
        KYC = enumC1778810wOF2;
        EnumC1778810wOF[] enumC1778810wOFArr = {enumC1778810wOF, enumC1778810wOF2};
        LL = enumC1778810wOFArr;
        LLILLJJLI = new C2254308sP(enumC1778810wOFArr);
    }

    public static EnumC1778810wOF[] values() {
        return (EnumC1778810wOF[]) LL.clone();
    }

    public static EnumC1778810wOF valueOf(String str) {
        return (EnumC1778810wOF) C08FF.LIZ(EnumC1778810wOF.class, str);
    }

    public EnumC1778810wOF(String str, int i) {
    }
}
