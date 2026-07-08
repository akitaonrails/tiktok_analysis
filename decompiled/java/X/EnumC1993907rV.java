package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07rV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1993907rV {
    public static final /* synthetic */ EnumC1993907rV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1993907rV REFRESH_DATA;
    public static final EnumC1993907rV TAB_RESUMED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1993907rV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1993907rV enumC1993907rV = new EnumC1993907rV("TAB_RESUMED", 0, "tab_resumed");
        TAB_RESUMED = enumC1993907rV;
        EnumC1993907rV enumC1993907rV2 = new EnumC1993907rV("REFRESH_DATA", 1, "refresh_data");
        REFRESH_DATA = enumC1993907rV2;
        EnumC1993907rV[] enumC1993907rVArr = {enumC1993907rV, enumC1993907rV2};
        LLILLJJLI = enumC1993907rVArr;
        LLILLL = new C2254308sP(enumC1993907rVArr);
    }

    public static EnumC1993907rV[] values() {
        return (EnumC1993907rV[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1993907rV valueOf(String str) {
        return (EnumC1993907rV) C08FF.LIZ(EnumC1993907rV.class, str);
    }

    public EnumC1993907rV(String str, int i, String str2) {
        this.LL = str2;
    }
}
