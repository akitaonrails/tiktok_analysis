package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC680180Qm8 {
    public static final EnumC680180Qm8 BizAlreadyExist;
    public static final EnumC680180Qm8 BizNotRegister;
    public static final EnumC680180Qm8 ConfigIllegal;
    public static final EnumC680180Qm8 DownloadTemplateJSError;
    public static final /* synthetic */ EnumC680180Qm8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC680180Qm8 TemplateCreateError;
    public static final EnumC680180Qm8 TemplateIsNil;
    public final int LL;

    public static InterfaceC2044707zh<EnumC680180Qm8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC680180Qm8 enumC680180Qm8 = new EnumC680180Qm8("BizAlreadyExist", 0, 100);
        BizAlreadyExist = enumC680180Qm8;
        EnumC680180Qm8 enumC680180Qm82 = new EnumC680180Qm8("ConfigIllegal", 1, 101);
        ConfigIllegal = enumC680180Qm82;
        EnumC680180Qm8 enumC680180Qm83 = new EnumC680180Qm8("BizNotRegister", 2, 102);
        BizNotRegister = enumC680180Qm83;
        EnumC680180Qm8 enumC680180Qm84 = new EnumC680180Qm8("TemplateIsNil", 3, 103);
        TemplateIsNil = enumC680180Qm84;
        EnumC680180Qm8 enumC680180Qm85 = new EnumC680180Qm8("TemplateCreateError", 4, 104);
        TemplateCreateError = enumC680180Qm85;
        EnumC680180Qm8 enumC680180Qm86 = new EnumC680180Qm8("DownloadTemplateJSError", 5, 105);
        DownloadTemplateJSError = enumC680180Qm86;
        EnumC680180Qm8[] enumC680180Qm8Arr = {enumC680180Qm8, enumC680180Qm82, enumC680180Qm83, enumC680180Qm84, enumC680180Qm85, enumC680180Qm86};
        LLILLJJLI = enumC680180Qm8Arr;
        LLILLL = new C2254308sP(enumC680180Qm8Arr);
    }

    public static EnumC680180Qm8[] values() {
        return (EnumC680180Qm8[]) LLILLJJLI.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public static EnumC680180Qm8 valueOf(String str) {
        return (EnumC680180Qm8) C08FF.LIZ(EnumC680180Qm8.class, str);
    }

    public EnumC680180Qm8(String str, int i, int i2) {
        this.LL = i2;
    }
}
