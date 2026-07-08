package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Yfn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC880090Yfn {
    public static final /* synthetic */ EnumC880090Yfn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC880090Yfn MENTION;
    public static final EnumC880090Yfn SEND_BY_OWNER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC880090Yfn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC880090Yfn enumC880090Yfn = new EnumC880090Yfn("MENTION", 0, "1");
        MENTION = enumC880090Yfn;
        EnumC880090Yfn enumC880090Yfn2 = new EnumC880090Yfn("SEND_BY_OWNER", 1, "2");
        SEND_BY_OWNER = enumC880090Yfn2;
        EnumC880090Yfn[] enumC880090YfnArr = {enumC880090Yfn, enumC880090Yfn2};
        LLILLJJLI = enumC880090YfnArr;
        LLILLL = new C2254308sP(enumC880090YfnArr);
    }

    public static EnumC880090Yfn[] values() {
        return (EnumC880090Yfn[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC880090Yfn valueOf(String str) {
        return (EnumC880090Yfn) C08FF.LIZ(EnumC880090Yfn.class, str);
    }

    public EnumC880090Yfn(String str, int i, String str2) {
        this.LL = str2;
    }
}
