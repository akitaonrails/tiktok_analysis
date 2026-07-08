package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC543480LTe {
    public static final /* synthetic */ EnumC543480LTe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC543480LTe RECONCILE;
    public static final EnumC543480LTe RESTORE;
    public static final EnumC543480LTe SAVE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC543480LTe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC543480LTe enumC543480LTe = new EnumC543480LTe("SAVE", 0, "save");
        SAVE = enumC543480LTe;
        EnumC543480LTe enumC543480LTe2 = new EnumC543480LTe("RESTORE", 1, "restore");
        RESTORE = enumC543480LTe2;
        EnumC543480LTe enumC543480LTe3 = new EnumC543480LTe("RECONCILE", 2, "reconcile");
        RECONCILE = enumC543480LTe3;
        EnumC543480LTe[] enumC543480LTeArr = {enumC543480LTe, enumC543480LTe2, enumC543480LTe3};
        LLILLJJLI = enumC543480LTeArr;
        LLILLL = new C2254308sP(enumC543480LTeArr);
    }

    public static EnumC543480LTe[] values() {
        return (EnumC543480LTe[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC543480LTe valueOf(String str) {
        return (EnumC543480LTe) C08FF.LIZ(EnumC543480LTe.class, str);
    }

    public EnumC543480LTe(String str, int i, String str2) {
        this.LL = str2;
    }
}
