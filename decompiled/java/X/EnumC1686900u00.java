package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0u00, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1686900u00 {
    public static final EnumC1686900u00 HAVE_IMAGE_AND_TEXT;
    public static final EnumC1686900u00 HAVE_IMAGE_NO_TEXT;
    public static final /* synthetic */ EnumC1686900u00[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1686900u00 NO_IMAGE_AND_TEXT;
    public static final EnumC1686900u00 NO_IMAGE_HAVE_TEXT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1686900u00> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1686900u00 enumC1686900u00 = new EnumC1686900u00("NO_IMAGE_AND_TEXT", 0, "00");
        NO_IMAGE_AND_TEXT = enumC1686900u00;
        EnumC1686900u00 enumC1686900u002 = new EnumC1686900u00("NO_IMAGE_HAVE_TEXT", 1, "01");
        NO_IMAGE_HAVE_TEXT = enumC1686900u002;
        EnumC1686900u00 enumC1686900u003 = new EnumC1686900u00("HAVE_IMAGE_NO_TEXT", 2, "10");
        HAVE_IMAGE_NO_TEXT = enumC1686900u003;
        EnumC1686900u00 enumC1686900u004 = new EnumC1686900u00("HAVE_IMAGE_AND_TEXT", 3, "11");
        HAVE_IMAGE_AND_TEXT = enumC1686900u004;
        EnumC1686900u00[] enumC1686900u00Arr = {enumC1686900u00, enumC1686900u002, enumC1686900u003, enumC1686900u004};
        LLILLJJLI = enumC1686900u00Arr;
        LLILLL = new C2254308sP(enumC1686900u00Arr);
    }

    public static EnumC1686900u00[] values() {
        return (EnumC1686900u00[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1686900u00 valueOf(String str) {
        return (EnumC1686900u00) C08FF.LIZ(EnumC1686900u00.class, str);
    }

    public EnumC1686900u00(String str, int i, String str2) {
        this.LL = str2;
    }
}
