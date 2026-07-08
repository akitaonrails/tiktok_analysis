package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eu5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1106630eu5 {
    public static final EnumC1106630eu5 FIRST_FRAME;
    public static final /* synthetic */ EnumC1106630eu5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1106630eu5 RESUME;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1106630eu5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1106630eu5 enumC1106630eu5 = new EnumC1106630eu5("RESUME", 0, 0);
        RESUME = enumC1106630eu5;
        EnumC1106630eu5 enumC1106630eu52 = new EnumC1106630eu5("FIRST_FRAME", 1, 1);
        FIRST_FRAME = enumC1106630eu52;
        EnumC1106630eu5[] enumC1106630eu5Arr = {enumC1106630eu5, enumC1106630eu52};
        LLILLJJLI = enumC1106630eu5Arr;
        LLILLL = new C2254308sP(enumC1106630eu5Arr);
    }

    public static EnumC1106630eu5[] values() {
        return (EnumC1106630eu5[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1106630eu5 valueOf(String str) {
        return (EnumC1106630eu5) C08FF.LIZ(EnumC1106630eu5.class, str);
    }

    public EnumC1106630eu5(String str, int i, int i2) {
        this.LL = i2;
    }
}
