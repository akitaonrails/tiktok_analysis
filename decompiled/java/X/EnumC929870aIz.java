package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aIz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC929870aIz {
    public static final EnumC929870aIz GUEST_PREVIEW;
    public static final EnumC929870aIz GUEST_STATUS_SETTING;
    public static final EnumC929870aIz GUEST_USER_INFO;
    public static final /* synthetic */ EnumC929870aIz[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public boolean LL = true;
    public String LLILLJJLI = "";

    public static InterfaceC2044707zh<EnumC929870aIz> getEntries() {
        return LLILZ;
    }

    static {
        EnumC929870aIz enumC929870aIz = new EnumC929870aIz("GUEST_USER_INFO", 0);
        GUEST_USER_INFO = enumC929870aIz;
        EnumC929870aIz enumC929870aIz2 = new EnumC929870aIz("GUEST_PREVIEW", 1);
        GUEST_PREVIEW = enumC929870aIz2;
        EnumC929870aIz enumC929870aIz3 = new EnumC929870aIz("GUEST_STATUS_SETTING", 2);
        GUEST_STATUS_SETTING = enumC929870aIz3;
        EnumC929870aIz[] enumC929870aIzArr = {enumC929870aIz, enumC929870aIz2, enumC929870aIz3};
        LLILLL = enumC929870aIzArr;
        LLILZ = new C2254308sP(enumC929870aIzArr);
    }

    public static EnumC929870aIz[] values() {
        return (EnumC929870aIz[]) LLILLL.clone();
    }

    public final boolean getGoNextPage() {
        return this.LL;
    }

    public final String getSource() {
        return this.LLILLJJLI;
    }

    public static EnumC929870aIz valueOf(String str) {
        return (EnumC929870aIz) C08FF.LIZ(EnumC929870aIz.class, str);
    }

    public final void setGoNextPage(boolean z) {
        this.LL = z;
    }

    public final void setSource(String str) {
        this.LLILLJJLI = str;
    }

    public EnumC929870aIz(String str, int i) {
    }
}
