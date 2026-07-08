package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154000g8U {
    public static final EnumC1154000g8U LIKE;
    public static final EnumC1154000g8U LIKE_CANCEL;
    public static final /* synthetic */ EnumC1154000g8U[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1154000g8U> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1154000g8U enumC1154000g8U = new EnumC1154000g8U("LIKE", 0, 1);
        LIKE = enumC1154000g8U;
        EnumC1154000g8U enumC1154000g8U2 = new EnumC1154000g8U("LIKE_CANCEL", 1, 3);
        LIKE_CANCEL = enumC1154000g8U2;
        EnumC1154000g8U[] enumC1154000g8UArr = {enumC1154000g8U, enumC1154000g8U2};
        LLILLJJLI = enumC1154000g8UArr;
        LLILLL = new C2254308sP(enumC1154000g8UArr);
    }

    public static EnumC1154000g8U[] values() {
        return (EnumC1154000g8U[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1154000g8U valueOf(String str) {
        return (EnumC1154000g8U) C08FF.LIZ(EnumC1154000g8U.class, str);
    }

    public EnumC1154000g8U(String str, int i, int i2) {
        this.LL = i2;
    }
}
