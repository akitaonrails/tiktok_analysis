package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iJe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1237800iJe {
    public static final EnumC1237800iJe ADD_PHONE;
    public static final EnumC1237800iJe CHANGE_EMAIL;
    public static final EnumC1237800iJe HIDDEN;
    public static final /* synthetic */ EnumC1237800iJe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1237800iJe LOADING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1237800iJe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1237800iJe enumC1237800iJe = new EnumC1237800iJe("LOADING", 0, "loading");
        LOADING = enumC1237800iJe;
        EnumC1237800iJe enumC1237800iJe2 = new EnumC1237800iJe("ADD_PHONE", 1, "add_phone");
        ADD_PHONE = enumC1237800iJe2;
        EnumC1237800iJe enumC1237800iJe3 = new EnumC1237800iJe("CHANGE_EMAIL", 2, "change_email");
        CHANGE_EMAIL = enumC1237800iJe3;
        EnumC1237800iJe enumC1237800iJe4 = new EnumC1237800iJe("HIDDEN", 3, "hidden");
        HIDDEN = enumC1237800iJe4;
        EnumC1237800iJe[] enumC1237800iJeArr = {enumC1237800iJe, enumC1237800iJe2, enumC1237800iJe3, enumC1237800iJe4};
        LLILLJJLI = enumC1237800iJeArr;
        LLILLL = new C2254308sP(enumC1237800iJeArr);
    }

    public static EnumC1237800iJe[] values() {
        return (EnumC1237800iJe[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1237800iJe valueOf(String str) {
        return (EnumC1237800iJe) C08FF.LIZ(EnumC1237800iJe.class, str);
    }

    public EnumC1237800iJe(String str, int i, String str2) {
        this.LL = str2;
    }
}
