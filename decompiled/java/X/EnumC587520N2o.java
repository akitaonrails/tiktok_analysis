package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N2o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC587520N2o {
    public static final EnumC587520N2o ACCOUNTS;
    public static final /* synthetic */ EnumC587520N2o[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC587520N2o MESSAGES;
    public final int LL;

    public static InterfaceC2044707zh<EnumC587520N2o> getEntries() {
        return LLILLL;
    }

    static {
        EnumC587520N2o enumC587520N2o = new EnumC587520N2o("ACCOUNTS", 0, 0);
        ACCOUNTS = enumC587520N2o;
        EnumC587520N2o enumC587520N2o2 = new EnumC587520N2o("MESSAGES", 1, 1);
        MESSAGES = enumC587520N2o2;
        EnumC587520N2o[] enumC587520N2oArr = {enumC587520N2o, enumC587520N2o2};
        LLILLJJLI = enumC587520N2oArr;
        LLILLL = new C2254308sP(enumC587520N2oArr);
    }

    public static EnumC587520N2o[] values() {
        return (EnumC587520N2o[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC587520N2o valueOf(String str) {
        return (EnumC587520N2o) C08FF.LIZ(EnumC587520N2o.class, str);
    }

    public EnumC587520N2o(String str, int i, int i2) {
        this.LL = i2;
    }
}
