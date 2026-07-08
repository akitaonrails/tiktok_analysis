package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05iC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1426605iC {
    public static final EnumC1426605iC APPLY_EFFECT;
    public static final EnumC1426605iC CONVERT_MINI_DRAFT_MODEL;
    public static final EnumC1426605iC DOWNLOAD_RES;
    public static final EnumC1426605iC FETCH_MINI_DRAFT;
    public static final /* synthetic */ EnumC1426605iC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1426605iC> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1426605iC enumC1426605iC = new EnumC1426605iC("DOWNLOAD_RES", 0);
        DOWNLOAD_RES = enumC1426605iC;
        EnumC1426605iC enumC1426605iC2 = new EnumC1426605iC("FETCH_MINI_DRAFT", 1);
        FETCH_MINI_DRAFT = enumC1426605iC2;
        EnumC1426605iC enumC1426605iC3 = new EnumC1426605iC("CONVERT_MINI_DRAFT_MODEL", 2);
        CONVERT_MINI_DRAFT_MODEL = enumC1426605iC3;
        EnumC1426605iC enumC1426605iC4 = new EnumC1426605iC("APPLY_EFFECT", 3);
        APPLY_EFFECT = enumC1426605iC4;
        EnumC1426605iC[] enumC1426605iCArr = {enumC1426605iC, enumC1426605iC2, enumC1426605iC3, enumC1426605iC4};
        LL = enumC1426605iCArr;
        LLILLJJLI = new C2254308sP(enumC1426605iCArr);
    }

    public static EnumC1426605iC[] values() {
        return (EnumC1426605iC[]) LL.clone();
    }

    public static EnumC1426605iC valueOf(String str) {
        return (EnumC1426605iC) C08FF.LIZ(EnumC1426605iC.class, str);
    }

    public EnumC1426605iC(String str, int i) {
    }
}
