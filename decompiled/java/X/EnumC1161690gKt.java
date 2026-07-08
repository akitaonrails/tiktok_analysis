package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1161690gKt {
    public static final EnumC1161690gKt FIRST_TAB_CREATE_START;
    public static final EnumC1161690gKt FIRST_TAB_RESUME_END;
    public static final EnumC1161690gKt FIRST_TAB_RESUME_START;
    public static final EnumC1161690gKt FIRST_TAB_UPDATE_DATA;
    public static final EnumC1161690gKt FRAGMENT_CREATE_END;
    public static final /* synthetic */ EnumC1161690gKt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1161690gKt PAGE_CLICK_START;
    public static final EnumC1161690gKt PAGE_CREATE_START;
    public static final EnumC1161690gKt PAGE_END;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1161690gKt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1161690gKt enumC1161690gKt = new EnumC1161690gKt("PAGE_CLICK_START", 0, "pageRecordStart");
        PAGE_CLICK_START = enumC1161690gKt;
        EnumC1161690gKt enumC1161690gKt2 = new EnumC1161690gKt("PAGE_CREATE_START", 1, "pageCreateStart");
        PAGE_CREATE_START = enumC1161690gKt2;
        EnumC1161690gKt enumC1161690gKt3 = new EnumC1161690gKt("FRAGMENT_CREATE_END", 2, "fragmentCreateEnd");
        FRAGMENT_CREATE_END = enumC1161690gKt3;
        EnumC1161690gKt enumC1161690gKt4 = new EnumC1161690gKt("FIRST_TAB_CREATE_START", 3, "firstTabCreateStart");
        FIRST_TAB_CREATE_START = enumC1161690gKt4;
        EnumC1161690gKt enumC1161690gKt5 = new EnumC1161690gKt("FIRST_TAB_RESUME_START", 4, "firstTabResumeStart");
        FIRST_TAB_RESUME_START = enumC1161690gKt5;
        EnumC1161690gKt enumC1161690gKt6 = new EnumC1161690gKt("FIRST_TAB_RESUME_END", 5, "firstTabResumeEnd");
        FIRST_TAB_RESUME_END = enumC1161690gKt6;
        EnumC1161690gKt enumC1161690gKt7 = new EnumC1161690gKt("FIRST_TAB_UPDATE_DATA", 6, "firstTabUpdateData");
        FIRST_TAB_UPDATE_DATA = enumC1161690gKt7;
        EnumC1161690gKt enumC1161690gKt8 = new EnumC1161690gKt("PAGE_END", 7, "pageRecordEnd");
        PAGE_END = enumC1161690gKt8;
        EnumC1161690gKt[] enumC1161690gKtArr = {enumC1161690gKt, enumC1161690gKt2, enumC1161690gKt3, enumC1161690gKt4, enumC1161690gKt5, enumC1161690gKt6, enumC1161690gKt7, enumC1161690gKt8};
        LLILLJJLI = enumC1161690gKtArr;
        LLILLL = new C2254308sP(enumC1161690gKtArr);
    }

    public static EnumC1161690gKt[] values() {
        return (EnumC1161690gKt[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1161690gKt valueOf(String str) {
        return (EnumC1161690gKt) C08FF.LIZ(EnumC1161690gKt.class, str);
    }

    public EnumC1161690gKt(String str, int i, String str2) {
        this.LL = str2;
    }
}
