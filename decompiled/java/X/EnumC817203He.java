package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03He, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC817203He {
    public static final /* synthetic */ EnumC817203He[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC817203He PLUS_SYMBOL;
    public static final EnumC817203He ROUND;
    public final int LL;

    public static InterfaceC2044707zh<EnumC817203He> getEntries() {
        return LLILLL;
    }

    static {
        EnumC817203He enumC817203He = new EnumC817203He("ROUND", 0, 0);
        ROUND = enumC817203He;
        EnumC817203He enumC817203He2 = new EnumC817203He("PLUS_SYMBOL", 1, 1);
        PLUS_SYMBOL = enumC817203He2;
        EnumC817203He[] enumC817203HeArr = {enumC817203He, enumC817203He2};
        LLILLJJLI = enumC817203HeArr;
        LLILLL = new C2254308sP(enumC817203HeArr);
    }

    public static EnumC817203He[] values() {
        return (EnumC817203He[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC817203He valueOf(String str) {
        return (EnumC817203He) C08FF.LIZ(EnumC817203He.class, str);
    }

    public EnumC817203He(String str, int i, int i2) {
        this.LL = i2;
    }
}
