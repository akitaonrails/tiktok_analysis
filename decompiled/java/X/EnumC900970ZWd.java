package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC900970ZWd {
    public static final EnumC900970ZWd BACKGROUND_DISMISS;
    public static final EnumC900970ZWd CANCEL;
    public static final EnumC900970ZWd CONFIRM;
    public static final /* synthetic */ EnumC900970ZWd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC900970ZWd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC900970ZWd enumC900970ZWd = new EnumC900970ZWd("CONFIRM", 0, "confirm");
        CONFIRM = enumC900970ZWd;
        EnumC900970ZWd enumC900970ZWd2 = new EnumC900970ZWd("CANCEL", 1, "cancel");
        CANCEL = enumC900970ZWd2;
        EnumC900970ZWd enumC900970ZWd3 = new EnumC900970ZWd("BACKGROUND_DISMISS", 2, "background_dismiss");
        BACKGROUND_DISMISS = enumC900970ZWd3;
        EnumC900970ZWd[] enumC900970ZWdArr = {enumC900970ZWd, enumC900970ZWd2, enumC900970ZWd3};
        LLILLJJLI = enumC900970ZWdArr;
        LLILLL = new C2254308sP(enumC900970ZWdArr);
    }

    public static EnumC900970ZWd[] values() {
        return (EnumC900970ZWd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC900970ZWd valueOf(String str) {
        return (EnumC900970ZWd) C08FF.LIZ(EnumC900970ZWd.class, str);
    }

    public EnumC900970ZWd(String str, int i, String str2) {
        this.LL = str2;
    }
}
