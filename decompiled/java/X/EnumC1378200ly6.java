package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ly6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1378200ly6 {
    public static final EnumC1378200ly6 FAILED;
    public static final EnumC1378200ly6 INITIALIZED;
    public static final /* synthetic */ EnumC1378200ly6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1378200ly6 RESOURCE_COMPOSED;
    public static final EnumC1378200ly6 VIDEO_SAVED;

    public static InterfaceC2044707zh<EnumC1378200ly6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1378200ly6 enumC1378200ly6 = new EnumC1378200ly6("INITIALIZED", 0);
        INITIALIZED = enumC1378200ly6;
        EnumC1378200ly6 enumC1378200ly62 = new EnumC1378200ly6("VIDEO_SAVED", 1);
        VIDEO_SAVED = enumC1378200ly62;
        EnumC1378200ly6 enumC1378200ly63 = new EnumC1378200ly6("RESOURCE_COMPOSED", 2);
        RESOURCE_COMPOSED = enumC1378200ly63;
        EnumC1378200ly6 enumC1378200ly64 = new EnumC1378200ly6("FAILED", 3);
        FAILED = enumC1378200ly64;
        EnumC1378200ly6[] enumC1378200ly6Arr = {enumC1378200ly6, enumC1378200ly62, enumC1378200ly63, enumC1378200ly64};
        LL = enumC1378200ly6Arr;
        LLILLJJLI = new C2254308sP(enumC1378200ly6Arr);
    }

    public static EnumC1378200ly6[] values() {
        return (EnumC1378200ly6[]) LL.clone();
    }

    public static EnumC1378200ly6 valueOf(String str) {
        return (EnumC1378200ly6) C08FF.LIZ(EnumC1378200ly6.class, str);
    }

    public EnumC1378200ly6(String str, int i) {
    }
}
