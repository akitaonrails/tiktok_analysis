package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1987107qP {
    public static final EnumC1987107qP IMAGE;
    public static final /* synthetic */ EnumC1987107qP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1987107qP VIDEO;

    public static InterfaceC2044707zh<EnumC1987107qP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1987107qP enumC1987107qP = new EnumC1987107qP("VIDEO", 0);
        VIDEO = enumC1987107qP;
        EnumC1987107qP enumC1987107qP2 = new EnumC1987107qP("IMAGE", 1);
        IMAGE = enumC1987107qP2;
        EnumC1987107qP[] enumC1987107qPArr = {enumC1987107qP, enumC1987107qP2};
        LL = enumC1987107qPArr;
        LLILLJJLI = new C2254308sP(enumC1987107qPArr);
    }

    public static EnumC1987107qP[] values() {
        return (EnumC1987107qP[]) LL.clone();
    }

    public static EnumC1987107qP valueOf(String str) {
        return (EnumC1987107qP) C08FF.LIZ(EnumC1987107qP.class, str);
    }

    public EnumC1987107qP(String str, int i) {
    }
}
