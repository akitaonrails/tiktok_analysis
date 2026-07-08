package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1749360vck {
    public static final EnumC1749360vck FIXED;
    public static final /* synthetic */ EnumC1749360vck[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1749360vck PERCENT;
    public static final EnumC1749360vck SPLITTHREE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1749360vck> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1749360vck enumC1749360vck = new EnumC1749360vck("FIXED", 0, 0);
        FIXED = enumC1749360vck;
        EnumC1749360vck enumC1749360vck2 = new EnumC1749360vck("SPLITTHREE", 1, 1);
        SPLITTHREE = enumC1749360vck2;
        EnumC1749360vck enumC1749360vck3 = new EnumC1749360vck("PERCENT", 2, 2);
        PERCENT = enumC1749360vck3;
        EnumC1749360vck[] enumC1749360vckArr = {enumC1749360vck, enumC1749360vck2, enumC1749360vck3};
        LLILLJJLI = enumC1749360vckArr;
        LLILLL = new C2254308sP(enumC1749360vckArr);
    }

    public static EnumC1749360vck[] values() {
        return (EnumC1749360vck[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1749360vck valueOf(String str) {
        return (EnumC1749360vck) C08FF.LIZ(EnumC1749360vck.class, str);
    }

    public EnumC1749360vck(String str, int i, int i2) {
        this.LL = i2;
    }
}
