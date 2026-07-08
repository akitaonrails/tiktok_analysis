package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0295008f {
    public static final EnumC0295008f AUDIT_TEXT_FAIL;
    public static final EnumC0295008f AUDIT_TEXT_NO_PASS;
    public static final EnumC0295008f COMPILE_GIF_FAIL;
    public static final EnumC0295008f COMPILE_IMG_FAIL;
    public static final EnumC0295008f CREATOR_BAN;
    public static final /* synthetic */ EnumC0295008f[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC0295008f MISCELLANEOUS;
    public static final EnumC0295008f UPLOAD_DM_FAIL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC0295008f> getEntries() {
        return LLILLL;
    }

    static {
        EnumC0295008f enumC0295008f = new EnumC0295008f("MISCELLANEOUS", 0, "miscellaneous");
        MISCELLANEOUS = enumC0295008f;
        EnumC0295008f enumC0295008f2 = new EnumC0295008f("AUDIT_TEXT_NO_PASS", 1, "audit_text_no_pass");
        AUDIT_TEXT_NO_PASS = enumC0295008f2;
        EnumC0295008f enumC0295008f3 = new EnumC0295008f("AUDIT_TEXT_FAIL", 2, "audit_text_fail");
        AUDIT_TEXT_FAIL = enumC0295008f3;
        EnumC0295008f enumC0295008f4 = new EnumC0295008f("COMPILE_GIF_FAIL", 3, "compile_gif_fail");
        COMPILE_GIF_FAIL = enumC0295008f4;
        EnumC0295008f enumC0295008f5 = new EnumC0295008f("COMPILE_IMG_FAIL", 4, "compile_img_fail");
        COMPILE_IMG_FAIL = enumC0295008f5;
        EnumC0295008f enumC0295008f6 = new EnumC0295008f("CREATOR_BAN", 5, "creator_ban");
        CREATOR_BAN = enumC0295008f6;
        EnumC0295008f enumC0295008f7 = new EnumC0295008f("UPLOAD_DM_FAIL", 6, "upload_dm_fail");
        UPLOAD_DM_FAIL = enumC0295008f7;
        EnumC0295008f[] enumC0295008fArr = {enumC0295008f, enumC0295008f2, enumC0295008f3, enumC0295008f4, enumC0295008f5, enumC0295008f6, enumC0295008f7};
        LLILLJJLI = enumC0295008fArr;
        LLILLL = new C2254308sP(enumC0295008fArr);
    }

    public static EnumC0295008f[] values() {
        return (EnumC0295008f[]) LLILLJJLI.clone();
    }

    public final String getEtString() {
        return this.LL;
    }

    public static EnumC0295008f valueOf(String str) {
        return (EnumC0295008f) C08FF.LIZ(EnumC0295008f.class, str);
    }

    public EnumC0295008f(String str, int i, String str2) {
        this.LL = str2;
    }
}
