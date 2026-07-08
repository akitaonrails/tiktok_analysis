package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0306008q {
    public static final EnumC0306008q ENTER_EDIT_MODE;
    public static final EnumC0306008q EXIT_EDIT_MODE;
    public static final /* synthetic */ EnumC0306008q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC0306008q UPDATE;

    public static InterfaceC2044707zh<EnumC0306008q> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0306008q enumC0306008q = new EnumC0306008q("ENTER_EDIT_MODE", 0);
        ENTER_EDIT_MODE = enumC0306008q;
        EnumC0306008q enumC0306008q2 = new EnumC0306008q("EXIT_EDIT_MODE", 1);
        EXIT_EDIT_MODE = enumC0306008q2;
        EnumC0306008q enumC0306008q3 = new EnumC0306008q("UPDATE", 2);
        UPDATE = enumC0306008q3;
        EnumC0306008q[] enumC0306008qArr = {enumC0306008q, enumC0306008q2, enumC0306008q3};
        LL = enumC0306008qArr;
        LLILLJJLI = new C2254308sP(enumC0306008qArr);
    }

    public static EnumC0306008q[] values() {
        return (EnumC0306008q[]) LL.clone();
    }

    public static EnumC0306008q valueOf(String str) {
        return (EnumC0306008q) C08FF.LIZ(EnumC0306008q.class, str);
    }

    public EnumC0306008q(String str, int i) {
    }
}
