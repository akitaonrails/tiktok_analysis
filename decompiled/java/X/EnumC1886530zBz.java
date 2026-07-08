package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1886530zBz {
    public static final /* synthetic */ EnumC1886530zBz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1886530zBz LOADING;
    public static final EnumC1886530zBz READY;
    public static final EnumC1886530zBz SHOW_DIALOG_FAIL_AUTO_IDV;
    public static final EnumC1886530zBz SHOW_DIALOG_RETRY;
    public static final EnumC1886530zBz SUCCESS;

    public static InterfaceC2044707zh<EnumC1886530zBz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1886530zBz enumC1886530zBz = new EnumC1886530zBz("READY", 0);
        READY = enumC1886530zBz;
        EnumC1886530zBz enumC1886530zBz2 = new EnumC1886530zBz("LOADING", 1);
        LOADING = enumC1886530zBz2;
        EnumC1886530zBz enumC1886530zBz3 = new EnumC1886530zBz("SUCCESS", 2);
        SUCCESS = enumC1886530zBz3;
        EnumC1886530zBz enumC1886530zBz4 = new EnumC1886530zBz("SHOW_DIALOG_FAIL_AUTO_IDV", 3);
        SHOW_DIALOG_FAIL_AUTO_IDV = enumC1886530zBz4;
        EnumC1886530zBz enumC1886530zBz5 = new EnumC1886530zBz("SHOW_DIALOG_RETRY", 4);
        SHOW_DIALOG_RETRY = enumC1886530zBz5;
        EnumC1886530zBz[] enumC1886530zBzArr = {enumC1886530zBz, enumC1886530zBz2, enumC1886530zBz3, enumC1886530zBz4, enumC1886530zBz5};
        LL = enumC1886530zBzArr;
        LLILLJJLI = new C2254308sP(enumC1886530zBzArr);
    }

    public static EnumC1886530zBz[] values() {
        return (EnumC1886530zBz[]) LL.clone();
    }

    public static EnumC1886530zBz valueOf(String str) {
        return (EnumC1886530zBz) C08FF.LIZ(EnumC1886530zBz.class, str);
    }

    public EnumC1886530zBz(String str, int i) {
    }
}
