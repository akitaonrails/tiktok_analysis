package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15zG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20699615zG {
    public static final EnumC20699615zG CLA_NO_CAPTION_REASON_LANG_NOT_SUPPORTED;
    public static final EnumC20699615zG CLA_NO_CAPTION_REASON_NOT_AUTHORIZED;
    public static final EnumC20699615zG CLA_NO_CAPTION_REASON_NO_OP;
    public static final EnumC20699615zG CLA_NO_CAPTION_REASON_OTHER;
    public static final EnumC20699615zG CLA_NO_CAPTION_REASON_SPEECH_UNRECOGNIZED;
    public static final C20699715zH Companion;
    public static final /* synthetic */ EnumC20699615zG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20699615zG> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.15zH] */
    static {
        EnumC20699615zG enumC20699615zG = new EnumC20699615zG("CLA_NO_CAPTION_REASON_NO_OP", 0, 0);
        CLA_NO_CAPTION_REASON_NO_OP = enumC20699615zG;
        EnumC20699615zG enumC20699615zG2 = new EnumC20699615zG("CLA_NO_CAPTION_REASON_OTHER", 1, 1);
        CLA_NO_CAPTION_REASON_OTHER = enumC20699615zG2;
        EnumC20699615zG enumC20699615zG3 = new EnumC20699615zG("CLA_NO_CAPTION_REASON_NOT_AUTHORIZED", 2, 2);
        CLA_NO_CAPTION_REASON_NOT_AUTHORIZED = enumC20699615zG3;
        EnumC20699615zG enumC20699615zG4 = new EnumC20699615zG("CLA_NO_CAPTION_REASON_SPEECH_UNRECOGNIZED", 3, 3);
        CLA_NO_CAPTION_REASON_SPEECH_UNRECOGNIZED = enumC20699615zG4;
        EnumC20699615zG enumC20699615zG5 = new EnumC20699615zG("CLA_NO_CAPTION_REASON_LANG_NOT_SUPPORTED", 4, 4);
        CLA_NO_CAPTION_REASON_LANG_NOT_SUPPORTED = enumC20699615zG5;
        EnumC20699615zG[] enumC20699615zGArr = {enumC20699615zG, enumC20699615zG2, enumC20699615zG3, enumC20699615zG4, enumC20699615zG5};
        LLILLJJLI = enumC20699615zGArr;
        LLILLL = new C2254308sP(enumC20699615zGArr);
        Companion = new Object() { // from class: X.15zH
        };
    }

    public static EnumC20699615zG[] values() {
        return (EnumC20699615zG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20699615zG valueOf(String str) {
        return (EnumC20699615zG) C08FF.LIZ(EnumC20699615zG.class, str);
    }

    public EnumC20699615zG(String str, int i, int i2) {
        this.LL = i2;
    }
}
