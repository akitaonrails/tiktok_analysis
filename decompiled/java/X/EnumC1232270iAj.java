package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iAj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1232270iAj {
    public static final EnumC1232270iAj CANCEL;
    public static final EnumC1232270iAj CONFIRM;
    public static final /* synthetic */ EnumC1232270iAj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1232270iAj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1232270iAj enumC1232270iAj = new EnumC1232270iAj("CONFIRM", 0, "confirm");
        CONFIRM = enumC1232270iAj;
        EnumC1232270iAj enumC1232270iAj2 = new EnumC1232270iAj("CANCEL", 1, "cancel");
        CANCEL = enumC1232270iAj2;
        EnumC1232270iAj[] enumC1232270iAjArr = {enumC1232270iAj, enumC1232270iAj2};
        LLILLJJLI = enumC1232270iAjArr;
        LLILLL = new C2254308sP(enumC1232270iAjArr);
    }

    public static EnumC1232270iAj[] values() {
        return (EnumC1232270iAj[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1232270iAj valueOf(String str) {
        return (EnumC1232270iAj) C08FF.LIZ(EnumC1232270iAj.class, str);
    }

    public EnumC1232270iAj(String str, int i, String str2) {
        this.LL = str2;
    }
}
