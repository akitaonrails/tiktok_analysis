package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Nzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC612200Nzm {
    public static final /* synthetic */ EnumC612200Nzm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC612200Nzm MUTATION;
    public static final EnumC612200Nzm NET;
    public static final EnumC612200Nzm OPTIMISTIC;
    public static final EnumC612200Nzm ROLLBACK;

    public static InterfaceC2044707zh<EnumC612200Nzm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC612200Nzm enumC612200Nzm = new EnumC612200Nzm("NET", 0);
        NET = enumC612200Nzm;
        EnumC612200Nzm enumC612200Nzm2 = new EnumC612200Nzm("OPTIMISTIC", 1);
        OPTIMISTIC = enumC612200Nzm2;
        EnumC612200Nzm enumC612200Nzm3 = new EnumC612200Nzm("MUTATION", 2);
        MUTATION = enumC612200Nzm3;
        EnumC612200Nzm enumC612200Nzm4 = new EnumC612200Nzm("ROLLBACK", 3);
        ROLLBACK = enumC612200Nzm4;
        EnumC612200Nzm[] enumC612200NzmArr = {enumC612200Nzm, enumC612200Nzm2, enumC612200Nzm3, enumC612200Nzm4};
        LL = enumC612200NzmArr;
        LLILLJJLI = new C2254308sP(enumC612200NzmArr);
    }

    public static EnumC612200Nzm[] values() {
        return (EnumC612200Nzm[]) LL.clone();
    }

    public static EnumC612200Nzm valueOf(String str) {
        return (EnumC612200Nzm) C08FF.LIZ(EnumC612200Nzm.class, str);
    }

    public EnumC612200Nzm(String str, int i) {
    }
}
