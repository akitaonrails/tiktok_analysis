package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Bb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC036900Bb {
    public static final EnumC036900Bb DEBUG;
    public static final EnumC036900Bb ERROR;
    public static final EnumC036900Bb INFO;
    public static final /* synthetic */ EnumC036900Bb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC036900Bb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC036900Bb enumC036900Bb = new EnumC036900Bb("INFO", 0, "INFO");
        INFO = enumC036900Bb;
        EnumC036900Bb enumC036900Bb2 = new EnumC036900Bb("ERROR", 1, "ERROR");
        ERROR = enumC036900Bb2;
        EnumC036900Bb enumC036900Bb3 = new EnumC036900Bb("DEBUG", 2, "DEBUG");
        DEBUG = enumC036900Bb3;
        EnumC036900Bb[] enumC036900BbArr = {enumC036900Bb, enumC036900Bb2, enumC036900Bb3};
        LLILLJJLI = enumC036900BbArr;
        LLILLL = new C2254308sP(enumC036900BbArr);
    }

    public static EnumC036900Bb[] values() {
        return (EnumC036900Bb[]) LLILLJJLI.clone();
    }

    public final String getLevel() {
        return this.LL;
    }

    public static EnumC036900Bb valueOf(String str) {
        return (EnumC036900Bb) C08FF.LIZ(EnumC036900Bb.class, str);
    }

    public EnumC036900Bb(String str, int i, String str2) {
        this.LL = str2;
    }
}
