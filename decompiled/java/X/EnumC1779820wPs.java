package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779820wPs {
    public static final EnumC1779820wPs LL;
    public static final EnumC1779820wPs LLILLJJLI;
    public static final EnumC1779820wPs LLILLL;
    public static final /* synthetic */ EnumC1779820wPs[] LLILZ;

    static {
        EnumC1779820wPs enumC1779820wPs = new EnumC1779820wPs("NONE", 0);
        LL = enumC1779820wPs;
        EnumC1779820wPs enumC1779820wPs2 = new EnumC1779820wPs("RESULT", 1);
        LLILLJJLI = enumC1779820wPs2;
        EnumC1779820wPs enumC1779820wPs3 = new EnumC1779820wPs("FAIL", 2);
        LLILLL = enumC1779820wPs3;
        EnumC1779820wPs[] enumC1779820wPsArr = {enumC1779820wPs, enumC1779820wPs2, enumC1779820wPs3};
        LLILZ = enumC1779820wPsArr;
        new C2254308sP(enumC1779820wPsArr);
    }

    public static EnumC1779820wPs[] values() {
        return (EnumC1779820wPs[]) LLILZ.clone();
    }

    public static EnumC1779820wPs valueOf(String str) {
        return (EnumC1779820wPs) C08FF.LIZ(EnumC1779820wPs.class, str);
    }

    public EnumC1779820wPs(String str, int i) {
    }
}
