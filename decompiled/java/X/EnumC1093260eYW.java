package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eYW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1093260eYW {
    public static final EnumC1093260eYW APPLOG;
    public static final EnumC1093260eYW CLIENT_FINALACTION;
    public static final EnumC1093260eYW CUSTOM;
    public static final EnumC1093260eYW FEATURE;
    public static final /* synthetic */ EnumC1093260eYW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1093260eYW SERVER;
    public static final EnumC1093260eYW TICKER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1093260eYW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1093260eYW enumC1093260eYW = new EnumC1093260eYW("APPLOG", 0, 1);
        APPLOG = enumC1093260eYW;
        EnumC1093260eYW enumC1093260eYW2 = new EnumC1093260eYW("FEATURE", 1, 2);
        FEATURE = enumC1093260eYW2;
        EnumC1093260eYW enumC1093260eYW3 = new EnumC1093260eYW("TICKER", 2, 3);
        TICKER = enumC1093260eYW3;
        EnumC1093260eYW enumC1093260eYW4 = new EnumC1093260eYW("CUSTOM", 3, 4);
        CUSTOM = enumC1093260eYW4;
        EnumC1093260eYW enumC1093260eYW5 = new EnumC1093260eYW("SERVER", 4, 5);
        SERVER = enumC1093260eYW5;
        EnumC1093260eYW enumC1093260eYW6 = new EnumC1093260eYW("CLIENT_FINALACTION", 5, 6);
        CLIENT_FINALACTION = enumC1093260eYW6;
        EnumC1093260eYW[] enumC1093260eYWArr = {enumC1093260eYW, enumC1093260eYW2, enumC1093260eYW3, enumC1093260eYW4, enumC1093260eYW5, enumC1093260eYW6};
        LLILLJJLI = enumC1093260eYWArr;
        LLILLL = new C2254308sP(enumC1093260eYWArr);
    }

    public static EnumC1093260eYW[] values() {
        return (EnumC1093260eYW[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1093260eYW valueOf(String str) {
        return (EnumC1093260eYW) C08FF.LIZ(EnumC1093260eYW.class, str);
    }

    public EnumC1093260eYW(String str, int i, int i2) {
        this.LL = i2;
    }
}
