package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wP5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779330wP5 {
    public static final EnumC1779330wP5 CANCEL;
    public static final /* synthetic */ EnumC1779330wP5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1779330wP5 POST;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1779330wP5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779330wP5 enumC1779330wP5 = new EnumC1779330wP5("CANCEL", 0, 0);
        CANCEL = enumC1779330wP5;
        EnumC1779330wP5 enumC1779330wP52 = new EnumC1779330wP5("POST", 1, 1);
        POST = enumC1779330wP52;
        EnumC1779330wP5[] enumC1779330wP5Arr = {enumC1779330wP5, enumC1779330wP52};
        LLILLJJLI = enumC1779330wP5Arr;
        LLILLL = new C2254308sP(enumC1779330wP5Arr);
    }

    public static EnumC1779330wP5[] values() {
        return (EnumC1779330wP5[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1779330wP5 valueOf(String str) {
        return (EnumC1779330wP5) C08FF.LIZ(EnumC1779330wP5.class, str);
    }

    public EnumC1779330wP5(String str, int i, int i2) {
        this.LL = i2;
    }
}
