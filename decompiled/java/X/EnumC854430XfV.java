package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XfV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC854430XfV {
    public static final EnumC854430XfV EMAIL;
    public static final /* synthetic */ EnumC854430XfV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC854430XfV PASSWORD;
    public static final EnumC854430XfV SMS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC854430XfV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC854430XfV enumC854430XfV = new EnumC854430XfV("EMAIL", 0, "email");
        EMAIL = enumC854430XfV;
        EnumC854430XfV enumC854430XfV2 = new EnumC854430XfV("PASSWORD", 1, "password");
        PASSWORD = enumC854430XfV2;
        EnumC854430XfV enumC854430XfV3 = new EnumC854430XfV("SMS", 2, "sms");
        SMS = enumC854430XfV3;
        EnumC854430XfV[] enumC854430XfVArr = {enumC854430XfV, enumC854430XfV2, enumC854430XfV3};
        LLILLJJLI = enumC854430XfVArr;
        LLILLL = new C2254308sP(enumC854430XfVArr);
    }

    public static EnumC854430XfV[] values() {
        return (EnumC854430XfV[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC854430XfV valueOf(String str) {
        return (EnumC854430XfV) C08FF.LIZ(EnumC854430XfV.class, str);
    }

    public EnumC854430XfV(String str, int i, String str2) {
        this.LL = str2;
    }
}
