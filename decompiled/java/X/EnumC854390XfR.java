package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XfR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC854390XfR {
    public static final EnumC854390XfR EMAIL;
    public static final /* synthetic */ EnumC854390XfR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC854390XfR PASSWORD;
    public static final EnumC854390XfR SMS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC854390XfR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC854390XfR enumC854390XfR = new EnumC854390XfR("EMAIL", 0, "email");
        EMAIL = enumC854390XfR;
        EnumC854390XfR enumC854390XfR2 = new EnumC854390XfR("PASSWORD", 1, "password");
        PASSWORD = enumC854390XfR2;
        EnumC854390XfR enumC854390XfR3 = new EnumC854390XfR("SMS", 2, "sms");
        SMS = enumC854390XfR3;
        EnumC854390XfR[] enumC854390XfRArr = {enumC854390XfR, enumC854390XfR2, enumC854390XfR3};
        LLILLJJLI = enumC854390XfRArr;
        LLILLL = new C2254308sP(enumC854390XfRArr);
    }

    public static EnumC854390XfR[] values() {
        return (EnumC854390XfR[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC854390XfR valueOf(String str) {
        return (EnumC854390XfR) C08FF.LIZ(EnumC854390XfR.class, str);
    }

    public EnumC854390XfR(String str, int i, String str2) {
        this.LL = str2;
    }
}
