package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0332009q {
    public static final /* synthetic */ EnumC0332009q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0332009q TIP_AT_THE_BOTTOM;
    public static final EnumC0332009q TIP_AT_THE_TOP;
    public static final EnumC0332009q UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC0332009q> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0332009q enumC0332009q = new EnumC0332009q("UNKNOWN", 0, 0);
        UNKNOWN = enumC0332009q;
        EnumC0332009q enumC0332009q2 = new EnumC0332009q("TIP_AT_THE_BOTTOM", 1, 1);
        TIP_AT_THE_BOTTOM = enumC0332009q2;
        EnumC0332009q enumC0332009q3 = new EnumC0332009q("TIP_AT_THE_TOP", 2, 2);
        TIP_AT_THE_TOP = enumC0332009q3;
        EnumC0332009q[] enumC0332009qArr = {enumC0332009q, enumC0332009q2, enumC0332009q3};
        LLILLJJLI = enumC0332009qArr;
        LLILLL = new C2254308sP(enumC0332009qArr);
    }

    public static EnumC0332009q[] values() {
        return (EnumC0332009q[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC0332009q valueOf(String str) {
        return (EnumC0332009q) C08FF.LIZ(EnumC0332009q.class, str);
    }

    public EnumC0332009q(String str, int i, int i2) {
        this.LL = i2;
    }
}
