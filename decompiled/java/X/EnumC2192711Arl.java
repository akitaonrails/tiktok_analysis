package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Arl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2192711Arl {
    public static final C2192741Aro Companion;
    public static final /* synthetic */ EnumC2192711Arl[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2192711Arl MINIS_STAGE_AUDIT;
    public static final EnumC2192711Arl MINIS_STAGE_DEBUG;
    public static final EnumC2192711Arl MINIS_STAGE_MINIS_DEBUG;
    public static final EnumC2192711Arl MINIS_STAGE_NATIVE_DEBUG;
    public static final EnumC2192711Arl MINIS_STAGE_PREVIEW;
    public static final EnumC2192711Arl MINIS_STAGE_PROD;
    public static final EnumC2192711Arl MINIS_STAGE_UNKNOWN;

    public static InterfaceC2044707zh<EnumC2192711Arl> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.1Aro] */
    static {
        EnumC2192711Arl enumC2192711Arl = new EnumC2192711Arl("MINIS_STAGE_UNKNOWN", 0);
        MINIS_STAGE_UNKNOWN = enumC2192711Arl;
        EnumC2192711Arl enumC2192711Arl2 = new EnumC2192711Arl("MINIS_STAGE_PROD", 1);
        MINIS_STAGE_PROD = enumC2192711Arl2;
        EnumC2192711Arl enumC2192711Arl3 = new EnumC2192711Arl("MINIS_STAGE_DEBUG", 2);
        MINIS_STAGE_DEBUG = enumC2192711Arl3;
        EnumC2192711Arl enumC2192711Arl4 = new EnumC2192711Arl("MINIS_STAGE_PREVIEW", 3);
        MINIS_STAGE_PREVIEW = enumC2192711Arl4;
        EnumC2192711Arl enumC2192711Arl5 = new EnumC2192711Arl("MINIS_STAGE_AUDIT", 4);
        MINIS_STAGE_AUDIT = enumC2192711Arl5;
        EnumC2192711Arl enumC2192711Arl6 = new EnumC2192711Arl("MINIS_STAGE_NATIVE_DEBUG", 5);
        MINIS_STAGE_NATIVE_DEBUG = enumC2192711Arl6;
        EnumC2192711Arl enumC2192711Arl7 = new EnumC2192711Arl("MINIS_STAGE_MINIS_DEBUG", 6);
        MINIS_STAGE_MINIS_DEBUG = enumC2192711Arl7;
        EnumC2192711Arl[] enumC2192711ArlArr = {enumC2192711Arl, enumC2192711Arl2, enumC2192711Arl3, enumC2192711Arl4, enumC2192711Arl5, enumC2192711Arl6, enumC2192711Arl7};
        LL = enumC2192711ArlArr;
        LLILLJJLI = new C2254308sP(enumC2192711ArlArr);
        Companion = new Object() { // from class: X.1Aro
        };
    }

    public static EnumC2192711Arl[] values() {
        return (EnumC2192711Arl[]) LL.clone();
    }

    public static EnumC2192711Arl valueOf(String str) {
        return (EnumC2192711Arl) C08FF.LIZ(EnumC2192711Arl.class, str);
    }

    public EnumC2192711Arl(String str, int i) {
    }
}
