package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992620bwC {
    public static final EnumC992620bwC FIRST_EMPTY_RETRY;
    public static final /* synthetic */ EnumC992620bwC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992620bwC LOAD_MORE_RETRY;
    public static final EnumC992620bwC MANUAL_LOAD_MORE;
    public static final EnumC992620bwC MANUAL_REFRESH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC992620bwC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992620bwC enumC992620bwC = new EnumC992620bwC("MANUAL_REFRESH", 0, 1);
        MANUAL_REFRESH = enumC992620bwC;
        EnumC992620bwC enumC992620bwC2 = new EnumC992620bwC("FIRST_EMPTY_RETRY", 1, 2);
        FIRST_EMPTY_RETRY = enumC992620bwC2;
        EnumC992620bwC enumC992620bwC3 = new EnumC992620bwC("MANUAL_LOAD_MORE", 2, 3);
        MANUAL_LOAD_MORE = enumC992620bwC3;
        EnumC992620bwC enumC992620bwC4 = new EnumC992620bwC("LOAD_MORE_RETRY", 3, 4);
        LOAD_MORE_RETRY = enumC992620bwC4;
        EnumC992620bwC[] enumC992620bwCArr = {enumC992620bwC, enumC992620bwC2, enumC992620bwC3, enumC992620bwC4};
        LLILLJJLI = enumC992620bwCArr;
        LLILLL = new C2254308sP(enumC992620bwCArr);
    }

    public static EnumC992620bwC[] values() {
        return (EnumC992620bwC[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC992620bwC valueOf(String str) {
        return (EnumC992620bwC) C08FF.LIZ(EnumC992620bwC.class, str);
    }

    public EnumC992620bwC(String str, int i, int i2) {
        this.LL = i2;
    }
}
