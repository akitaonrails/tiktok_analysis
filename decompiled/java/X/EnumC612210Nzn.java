package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nzn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC612210Nzn {
    public static final /* synthetic */ EnumC612210Nzn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC612210Nzn MUTATION;
    public static final EnumC612210Nzn OPTIMISTIC;
    public static final EnumC612210Nzn ROLLBACK;

    public static InterfaceC2044707zh<EnumC612210Nzn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC612210Nzn enumC612210Nzn = new EnumC612210Nzn("OPTIMISTIC", 0);
        OPTIMISTIC = enumC612210Nzn;
        EnumC612210Nzn enumC612210Nzn2 = new EnumC612210Nzn("MUTATION", 1);
        MUTATION = enumC612210Nzn2;
        EnumC612210Nzn enumC612210Nzn3 = new EnumC612210Nzn("ROLLBACK", 2);
        ROLLBACK = enumC612210Nzn3;
        EnumC612210Nzn[] enumC612210NznArr = {enumC612210Nzn, enumC612210Nzn2, enumC612210Nzn3};
        LL = enumC612210NznArr;
        LLILLJJLI = new C2254308sP(enumC612210NznArr);
    }

    public static EnumC612210Nzn[] values() {
        return (EnumC612210Nzn[]) LL.clone();
    }

    public static EnumC612210Nzn valueOf(String str) {
        return (EnumC612210Nzn) C08FF.LIZ(EnumC612210Nzn.class, str);
    }

    public EnumC612210Nzn(String str, int i) {
    }
}
