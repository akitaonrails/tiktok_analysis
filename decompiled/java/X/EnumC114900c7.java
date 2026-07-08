package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00c7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC114900c7 {
    public static final EnumC114900c7 CAPTION_LOG;
    public static final EnumC114900c7 CLA_COMMON_LOG;
    public static final /* synthetic */ EnumC114900c7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC114900c7 TRANSLATION_LOG;
    public final String LL;

    public static InterfaceC2044707zh<EnumC114900c7> getEntries() {
        return LLILLL;
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CLA");
        sbLIZ.append("_COMMON");
        EnumC114900c7 enumC114900c7 = new EnumC114900c7("CLA_COMMON_LOG", 0, C2188811AlT.LIZIZ(sbLIZ));
        CLA_COMMON_LOG = enumC114900c7;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CLA");
        sbLIZ2.append("_CAPTION");
        EnumC114900c7 enumC114900c72 = new EnumC114900c7("CAPTION_LOG", 1, C2188811AlT.LIZIZ(sbLIZ2));
        CAPTION_LOG = enumC114900c72;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("CLA");
        sbLIZ3.append("_TRANSLATION");
        EnumC114900c7 enumC114900c73 = new EnumC114900c7("TRANSLATION_LOG", 2, C2188811AlT.LIZIZ(sbLIZ3));
        TRANSLATION_LOG = enumC114900c73;
        EnumC114900c7[] enumC114900c7Arr = {enumC114900c7, enumC114900c72, enumC114900c73};
        LLILLJJLI = enumC114900c7Arr;
        LLILLL = new C2254308sP(enumC114900c7Arr);
    }

    public static EnumC114900c7[] values() {
        return (EnumC114900c7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC114900c7 valueOf(String str) {
        return (EnumC114900c7) C08FF.LIZ(EnumC114900c7.class, str);
    }

    public EnumC114900c7(String str, int i, String str2) {
        this.LL = str2;
    }
}
