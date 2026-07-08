package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.048q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC10498048q {
    public static final EnumC10498048q DIVIDER;
    public static final /* synthetic */ EnumC10498048q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC10498048q TEXT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC10498048q> getEntries() {
        return LLILLL;
    }

    static {
        EnumC10498048q enumC10498048q = new EnumC10498048q("TEXT", 0, 1);
        TEXT = enumC10498048q;
        EnumC10498048q enumC10498048q2 = new EnumC10498048q("DIVIDER", 1, 2);
        DIVIDER = enumC10498048q2;
        EnumC10498048q[] enumC10498048qArr = {enumC10498048q, enumC10498048q2};
        LLILLJJLI = enumC10498048qArr;
        LLILLL = new C2254308sP(enumC10498048qArr);
    }

    public static EnumC10498048q[] values() {
        return (EnumC10498048q[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC10498048q valueOf(String str) {
        return (EnumC10498048q) C08FF.LIZ(EnumC10498048q.class, str);
    }

    public EnumC10498048q(String str, int i, int i2) {
        this.LL = i2;
    }
}
