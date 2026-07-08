package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Iwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC482970Iwp {
    public static final EnumC482970Iwp BACK;
    public static final EnumC482970Iwp CANCEL;
    public static final /* synthetic */ EnumC482970Iwp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC482970Iwp SELECTED;
    public static final EnumC482970Iwp SELECTED_SECONDARY;
    public static final EnumC482970Iwp SUBMIT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC482970Iwp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC482970Iwp enumC482970Iwp = new EnumC482970Iwp("SUBMIT", 0, "submit");
        SUBMIT = enumC482970Iwp;
        EnumC482970Iwp enumC482970Iwp2 = new EnumC482970Iwp("CANCEL", 1, "cancel");
        CANCEL = enumC482970Iwp2;
        EnumC482970Iwp enumC482970Iwp3 = new EnumC482970Iwp("SELECTED", 2, "selected");
        SELECTED = enumC482970Iwp3;
        EnumC482970Iwp enumC482970Iwp4 = new EnumC482970Iwp("SELECTED_SECONDARY", 3, "selected_secondary");
        SELECTED_SECONDARY = enumC482970Iwp4;
        EnumC482970Iwp enumC482970Iwp5 = new EnumC482970Iwp("BACK", 4, "back");
        BACK = enumC482970Iwp5;
        EnumC482970Iwp[] enumC482970IwpArr = {enumC482970Iwp, enumC482970Iwp2, enumC482970Iwp3, enumC482970Iwp4, enumC482970Iwp5};
        LLILLJJLI = enumC482970IwpArr;
        LLILLL = new C2254308sP(enumC482970IwpArr);
    }

    public static EnumC482970Iwp[] values() {
        return (EnumC482970Iwp[]) LLILLJJLI.clone();
    }

    public final String getMethod() {
        return this.LL;
    }

    public static EnumC482970Iwp valueOf(String str) {
        return (EnumC482970Iwp) C08FF.LIZ(EnumC482970Iwp.class, str);
    }

    public EnumC482970Iwp(String str, int i, String str2) {
        this.LL = str2;
    }
}
