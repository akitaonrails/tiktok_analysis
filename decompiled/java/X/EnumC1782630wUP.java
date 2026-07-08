package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782630wUP {
    public static final EnumC1782630wUP FIXED;
    public static final /* synthetic */ EnumC1782630wUP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1782630wUP ORIGINAL;

    public static InterfaceC2044707zh<EnumC1782630wUP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1782630wUP enumC1782630wUP = new EnumC1782630wUP("ORIGINAL", 0);
        ORIGINAL = enumC1782630wUP;
        EnumC1782630wUP enumC1782630wUP2 = new EnumC1782630wUP("FIXED", 1);
        FIXED = enumC1782630wUP2;
        EnumC1782630wUP[] enumC1782630wUPArr = {enumC1782630wUP, enumC1782630wUP2};
        LL = enumC1782630wUPArr;
        LLILLJJLI = new C2254308sP(enumC1782630wUPArr);
    }

    public static EnumC1782630wUP[] values() {
        return (EnumC1782630wUP[]) LL.clone();
    }

    public static EnumC1782630wUP valueOf(String str) {
        return (EnumC1782630wUP) C08FF.LIZ(EnumC1782630wUP.class, str);
    }

    public EnumC1782630wUP(String str, int i) {
    }
}
