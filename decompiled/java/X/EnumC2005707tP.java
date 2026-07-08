package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2005707tP {
    public static final EnumC2005707tP IMAGE;
    public static final /* synthetic */ EnumC2005707tP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2005707tP VIDEO;

    public static InterfaceC2044707zh<EnumC2005707tP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2005707tP enumC2005707tP = new EnumC2005707tP("IMAGE", 0);
        IMAGE = enumC2005707tP;
        EnumC2005707tP enumC2005707tP2 = new EnumC2005707tP("VIDEO", 1);
        VIDEO = enumC2005707tP2;
        EnumC2005707tP[] enumC2005707tPArr = {enumC2005707tP, enumC2005707tP2};
        LL = enumC2005707tPArr;
        LLILLJJLI = new C2254308sP(enumC2005707tPArr);
    }

    public static EnumC2005707tP[] values() {
        return (EnumC2005707tP[]) LL.clone();
    }

    public static EnumC2005707tP valueOf(String str) {
        return (EnumC2005707tP) C08FF.LIZ(EnumC2005707tP.class, str);
    }

    public EnumC2005707tP(String str, int i) {
    }
}
