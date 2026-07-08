package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uW2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1706760uW2 {
    public static final EnumC1706760uW2 DESTRUCTIVE;
    public static final /* synthetic */ EnumC1706760uW2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1706760uW2 PRIMARY;
    public static final EnumC1706760uW2 SECONDARY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1706760uW2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1706760uW2 enumC1706760uW2 = new EnumC1706760uW2("PRIMARY", 0, 0);
        PRIMARY = enumC1706760uW2;
        EnumC1706760uW2 enumC1706760uW22 = new EnumC1706760uW2("SECONDARY", 1, 1);
        SECONDARY = enumC1706760uW22;
        EnumC1706760uW2 enumC1706760uW23 = new EnumC1706760uW2("DESTRUCTIVE", 2, 2);
        DESTRUCTIVE = enumC1706760uW23;
        EnumC1706760uW2[] enumC1706760uW2Arr = {enumC1706760uW2, enumC1706760uW22, enumC1706760uW23};
        LLILLJJLI = enumC1706760uW2Arr;
        LLILLL = new C2254308sP(enumC1706760uW2Arr);
    }

    public static EnumC1706760uW2[] values() {
        return (EnumC1706760uW2[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1706760uW2 valueOf(String str) {
        return (EnumC1706760uW2) C08FF.LIZ(EnumC1706760uW2.class, str);
    }

    public EnumC1706760uW2(String str, int i, int i2) {
        this.LL = i2;
    }
}
