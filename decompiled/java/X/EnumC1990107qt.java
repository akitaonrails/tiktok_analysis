package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07qt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1990107qt {
    public static final /* synthetic */ EnumC1990107qt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1990107qt NO_SPLIT;
    public static final EnumC1990107qt SPLIT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1990107qt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1990107qt enumC1990107qt = new EnumC1990107qt("NO_SPLIT", 0, 0);
        NO_SPLIT = enumC1990107qt;
        EnumC1990107qt enumC1990107qt2 = new EnumC1990107qt("SPLIT", 1, 1);
        SPLIT = enumC1990107qt2;
        EnumC1990107qt[] enumC1990107qtArr = {enumC1990107qt, enumC1990107qt2};
        LLILLJJLI = enumC1990107qtArr;
        LLILLL = new C2254308sP(enumC1990107qtArr);
    }

    public static EnumC1990107qt[] values() {
        return (EnumC1990107qt[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1990107qt valueOf(String str) {
        return (EnumC1990107qt) C08FF.LIZ(EnumC1990107qt.class, str);
    }

    public EnumC1990107qt(String str, int i, int i2) {
        this.LL = i2;
    }
}
