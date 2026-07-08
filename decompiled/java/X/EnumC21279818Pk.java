package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18Pk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21279818Pk {
    public static final EnumC21279818Pk INBOX_POPUP;
    public static final EnumC21279818Pk JUMP;
    public static final /* synthetic */ EnumC21279818Pk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC21279818Pk REQUEST;
    public static final EnumC21279818Pk SELECTED;
    public static final EnumC21279818Pk SHOW;
    public static final EnumC21279818Pk UNEXPECTED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC21279818Pk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC21279818Pk enumC21279818Pk = new EnumC21279818Pk("REQUEST", 0, "request");
        REQUEST = enumC21279818Pk;
        EnumC21279818Pk enumC21279818Pk2 = new EnumC21279818Pk("SELECTED", 1, "selected");
        SELECTED = enumC21279818Pk2;
        EnumC21279818Pk enumC21279818Pk3 = new EnumC21279818Pk("SHOW", 2, "show");
        SHOW = enumC21279818Pk3;
        EnumC21279818Pk enumC21279818Pk4 = new EnumC21279818Pk("JUMP", 3, "jump");
        JUMP = enumC21279818Pk4;
        EnumC21279818Pk enumC21279818Pk5 = new EnumC21279818Pk("INBOX_POPUP", 4, "inbox_popup");
        INBOX_POPUP = enumC21279818Pk5;
        EnumC21279818Pk enumC21279818Pk6 = new EnumC21279818Pk("UNEXPECTED", 5, "unexpected");
        UNEXPECTED = enumC21279818Pk6;
        EnumC21279818Pk[] enumC21279818PkArr = {enumC21279818Pk, enumC21279818Pk2, enumC21279818Pk3, enumC21279818Pk4, enumC21279818Pk5, enumC21279818Pk6};
        LLILLJJLI = enumC21279818PkArr;
        LLILLL = new C2254308sP(enumC21279818PkArr);
    }

    public static EnumC21279818Pk[] values() {
        return (EnumC21279818Pk[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC21279818Pk valueOf(String str) {
        return (EnumC21279818Pk) C08FF.LIZ(EnumC21279818Pk.class, str);
    }

    public EnumC21279818Pk(String str, int i, String str2) {
        this.LL = str2;
    }
}
