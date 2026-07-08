package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC504960JrC {
    public static final /* synthetic */ EnumC504960JrC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC504960JrC MOST_LIKE;
    public static final EnumC504960JrC RECENT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC504960JrC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC504960JrC enumC504960JrC = new EnumC504960JrC("MOST_LIKE", 0, 1);
        MOST_LIKE = enumC504960JrC;
        EnumC504960JrC enumC504960JrC2 = new EnumC504960JrC("RECENT", 1, 2);
        RECENT = enumC504960JrC2;
        EnumC504960JrC[] enumC504960JrCArr = {enumC504960JrC, enumC504960JrC2};
        LLILLJJLI = enumC504960JrCArr;
        LLILLL = new C2254308sP(enumC504960JrCArr);
    }

    public static EnumC504960JrC[] values() {
        return (EnumC504960JrC[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC504960JrC valueOf(String str) {
        return (EnumC504960JrC) C08FF.LIZ(EnumC504960JrC.class, str);
    }

    public EnumC504960JrC(String str, int i, int i2) {
        this.LL = i2;
    }
}
