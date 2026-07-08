package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06uw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1760406uw implements InterfaceC1760506ux {
    public static final /* synthetic */ EnumC1760406uw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1760406uw SOURCE_LANGUAGE_NOT_DETECTED;
    public static final EnumC1760406uw SOURCE_LANGUAGE_NOT_SUPPORTED;
    public static final EnumC1760406uw TRANSLATION_FAILED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1760406uw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1760406uw enumC1760406uw = new EnumC1760406uw("SOURCE_LANGUAGE_NOT_DETECTED", 0, "source_language_not_detected");
        SOURCE_LANGUAGE_NOT_DETECTED = enumC1760406uw;
        EnumC1760406uw enumC1760406uw2 = new EnumC1760406uw("SOURCE_LANGUAGE_NOT_SUPPORTED", 1, "source_language_not_supported");
        SOURCE_LANGUAGE_NOT_SUPPORTED = enumC1760406uw2;
        EnumC1760406uw enumC1760406uw3 = new EnumC1760406uw("TRANSLATION_FAILED", 2, "translation_failed");
        TRANSLATION_FAILED = enumC1760406uw3;
        EnumC1760406uw[] enumC1760406uwArr = {enumC1760406uw, enumC1760406uw2, enumC1760406uw3};
        LLILLJJLI = enumC1760406uwArr;
        LLILLL = new C2254308sP(enumC1760406uwArr);
    }

    public static EnumC1760406uw[] values() {
        return (EnumC1760406uw[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC1760406uw valueOf(String str) {
        return (EnumC1760406uw) C08FF.LIZ(EnumC1760406uw.class, str);
    }

    public EnumC1760406uw(String str, int i, String str2) {
        this.LL = str2;
    }
}
