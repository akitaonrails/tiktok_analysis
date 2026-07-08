package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994680bzW {
    public static final EnumC994680bzW HIT;
    public static final EnumC994680bzW INVALID;
    public static final /* synthetic */ EnumC994680bzW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC994680bzW NONE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC994680bzW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC994680bzW enumC994680bzW = new EnumC994680bzW("NONE", 0, -2);
        NONE = enumC994680bzW;
        EnumC994680bzW enumC994680bzW2 = new EnumC994680bzW("INVALID", 1, -1);
        INVALID = enumC994680bzW2;
        EnumC994680bzW enumC994680bzW3 = new EnumC994680bzW("HIT", 2, 0);
        HIT = enumC994680bzW3;
        EnumC994680bzW[] enumC994680bzWArr = {enumC994680bzW, enumC994680bzW2, enumC994680bzW3};
        LLILLJJLI = enumC994680bzWArr;
        LLILLL = new C2254308sP(enumC994680bzWArr);
    }

    public static EnumC994680bzW[] values() {
        return (EnumC994680bzW[]) LLILLJJLI.clone();
    }

    public final int getVa() {
        return this.LL;
    }

    public static EnumC994680bzW valueOf(String str) {
        return (EnumC994680bzW) C08FF.LIZ(EnumC994680bzW.class, str);
    }

    public EnumC994680bzW(String str, int i, int i2) {
        this.LL = i2;
    }
}
