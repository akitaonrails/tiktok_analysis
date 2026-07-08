package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1017980cb6 {
    public static final C1018020cbA Companion;
    public static final EnumC1017980cb6 DOWNLOAD_CANCELED;
    public static final EnumC1017980cb6 DOWNLOAD_PAUSED;
    public static final EnumC1017980cb6 DOWNLOAD_STARTED;
    public static final EnumC1017980cb6 DOWNLOAD_WAITING;
    public static final EnumC1017980cb6 FAILED;
    public static final EnumC1017980cb6 INSTALL_STARTED;
    public static final EnumC1017980cb6 INSTALL_SUCCESS;
    public static final /* synthetic */ EnumC1017980cb6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1017980cb6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1017980cb6 enumC1017980cb6 = new EnumC1017980cb6("DOWNLOAD_WAITING", 0, 0);
        DOWNLOAD_WAITING = enumC1017980cb6;
        EnumC1017980cb6 enumC1017980cb62 = new EnumC1017980cb6("DOWNLOAD_STARTED", 1, 1);
        DOWNLOAD_STARTED = enumC1017980cb62;
        EnumC1017980cb6 enumC1017980cb63 = new EnumC1017980cb6("DOWNLOAD_PAUSED", 2, 2);
        DOWNLOAD_PAUSED = enumC1017980cb63;
        EnumC1017980cb6 enumC1017980cb64 = new EnumC1017980cb6("INSTALL_STARTED", 3, 3);
        INSTALL_STARTED = enumC1017980cb64;
        EnumC1017980cb6 enumC1017980cb65 = new EnumC1017980cb6("INSTALL_SUCCESS", 4, 4);
        INSTALL_SUCCESS = enumC1017980cb65;
        EnumC1017980cb6 enumC1017980cb66 = new EnumC1017980cb6("FAILED", 5, -1);
        FAILED = enumC1017980cb66;
        EnumC1017980cb6 enumC1017980cb67 = new EnumC1017980cb6("DOWNLOAD_CANCELED", 6, -2);
        DOWNLOAD_CANCELED = enumC1017980cb67;
        EnumC1017980cb6[] enumC1017980cb6Arr = {enumC1017980cb6, enumC1017980cb62, enumC1017980cb63, enumC1017980cb64, enumC1017980cb65, enumC1017980cb66, enumC1017980cb67};
        LLILLJJLI = enumC1017980cb6Arr;
        LLILLL = new C2254308sP(enumC1017980cb6Arr);
        Companion = new C1018020cbA();
    }

    public static EnumC1017980cb6[] values() {
        return (EnumC1017980cb6[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1017980cb6 valueOf(String str) {
        return (EnumC1017980cb6) C08FF.LIZ(EnumC1017980cb6.class, str);
    }

    public EnumC1017980cb6(String str, int i, int i2) {
        this.LL = i2;
    }
}
