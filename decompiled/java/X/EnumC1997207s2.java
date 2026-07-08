package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07s2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1997207s2 {
    public static final EnumC1997207s2 ALLOW_OPEN_MIC;
    public static final EnumC1997207s2 DISALLOW_OPEN_MIC;
    public static final /* synthetic */ EnumC1997207s2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1997207s2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1997207s2 enumC1997207s2 = new EnumC1997207s2("ALLOW_OPEN_MIC", 0);
        ALLOW_OPEN_MIC = enumC1997207s2;
        EnumC1997207s2 enumC1997207s22 = new EnumC1997207s2("DISALLOW_OPEN_MIC", 1);
        DISALLOW_OPEN_MIC = enumC1997207s22;
        EnumC1997207s2[] enumC1997207s2Arr = {enumC1997207s2, enumC1997207s22};
        LL = enumC1997207s2Arr;
        LLILLJJLI = new C2254308sP(enumC1997207s2Arr);
    }

    public static EnumC1997207s2[] values() {
        return (EnumC1997207s2[]) LL.clone();
    }

    public static EnumC1997207s2 valueOf(String str) {
        return (EnumC1997207s2) C08FF.LIZ(EnumC1997207s2.class, str);
    }

    public EnumC1997207s2(String str, int i) {
    }
}
