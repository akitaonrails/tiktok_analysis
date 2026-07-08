package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TRs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC746940TRs {
    public static final EnumC746940TRs DIALOG;
    public static final /* synthetic */ EnumC746940TRs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC746940TRs POST_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC746940TRs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC746940TRs enumC746940TRs = new EnumC746940TRs("POST_PAGE", 0, "post_page");
        POST_PAGE = enumC746940TRs;
        EnumC746940TRs enumC746940TRs2 = new EnumC746940TRs("DIALOG", 1, "dialog");
        DIALOG = enumC746940TRs2;
        EnumC746940TRs[] enumC746940TRsArr = {enumC746940TRs, enumC746940TRs2};
        LLILLJJLI = enumC746940TRsArr;
        LLILLL = new C2254308sP(enumC746940TRsArr);
    }

    public static EnumC746940TRs[] values() {
        return (EnumC746940TRs[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC746940TRs valueOf(String str) {
        return (EnumC746940TRs) C08FF.LIZ(EnumC746940TRs.class, str);
    }

    public EnumC746940TRs(String str, int i, String str2) {
        this.LL = str2;
    }
}
