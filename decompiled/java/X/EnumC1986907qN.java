package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1986907qN {
    public static final EnumC1986907qN IMAGE;
    public static final /* synthetic */ EnumC1986907qN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1986907qN VIDEO;

    public static InterfaceC2044707zh<EnumC1986907qN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1986907qN enumC1986907qN = new EnumC1986907qN("IMAGE", 0);
        IMAGE = enumC1986907qN;
        EnumC1986907qN enumC1986907qN2 = new EnumC1986907qN("VIDEO", 1);
        VIDEO = enumC1986907qN2;
        EnumC1986907qN[] enumC1986907qNArr = {enumC1986907qN, enumC1986907qN2};
        LL = enumC1986907qNArr;
        LLILLJJLI = new C2254308sP(enumC1986907qNArr);
    }

    public static EnumC1986907qN[] values() {
        return (EnumC1986907qN[]) LL.clone();
    }

    public static EnumC1986907qN valueOf(String str) {
        return (EnumC1986907qN) C08FF.LIZ(EnumC1986907qN.class, str);
    }

    public EnumC1986907qN(String str, int i) {
    }
}
