package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09af, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2399109af {
    public static final EnumC2399109af CANCEL;
    public static final /* synthetic */ EnumC2399109af[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2399109af START;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2399109af> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2399109af enumC2399109af = new EnumC2399109af("START", 0, "start");
        START = enumC2399109af;
        EnumC2399109af enumC2399109af2 = new EnumC2399109af("CANCEL", 1, "cancel");
        CANCEL = enumC2399109af2;
        EnumC2399109af[] enumC2399109afArr = {enumC2399109af, enumC2399109af2};
        LLILLJJLI = enumC2399109afArr;
        LLILLL = new C2254308sP(enumC2399109afArr);
    }

    public static EnumC2399109af[] values() {
        return (EnumC2399109af[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2399109af valueOf(String str) {
        return (EnumC2399109af) C08FF.LIZ(EnumC2399109af.class, str);
    }

    public EnumC2399109af(String str, int i, String str2) {
        this.LL = str2;
    }
}
