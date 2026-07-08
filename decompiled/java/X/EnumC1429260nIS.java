package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nIS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1429260nIS {
    public static final EnumC1429260nIS CANCELED;
    public static final EnumC1429260nIS EXECUTING;
    public static final EnumC1429260nIS FAILED;
    public static final /* synthetic */ EnumC1429260nIS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1429260nIS NONE;
    public static final EnumC1429260nIS SUCCESS;

    public static InterfaceC2044707zh<EnumC1429260nIS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1429260nIS enumC1429260nIS = new EnumC1429260nIS("NONE", 0);
        NONE = enumC1429260nIS;
        EnumC1429260nIS enumC1429260nIS2 = new EnumC1429260nIS("EXECUTING", 1);
        EXECUTING = enumC1429260nIS2;
        EnumC1429260nIS enumC1429260nIS3 = new EnumC1429260nIS("SUCCESS", 2);
        SUCCESS = enumC1429260nIS3;
        EnumC1429260nIS enumC1429260nIS4 = new EnumC1429260nIS("FAILED", 3);
        FAILED = enumC1429260nIS4;
        EnumC1429260nIS enumC1429260nIS5 = new EnumC1429260nIS("CANCELED", 4);
        CANCELED = enumC1429260nIS5;
        EnumC1429260nIS[] enumC1429260nISArr = {enumC1429260nIS, enumC1429260nIS2, enumC1429260nIS3, enumC1429260nIS4, enumC1429260nIS5};
        LL = enumC1429260nISArr;
        LLILLJJLI = new C2254308sP(enumC1429260nISArr);
    }

    public static EnumC1429260nIS[] values() {
        return (EnumC1429260nIS[]) LL.clone();
    }

    public static EnumC1429260nIS valueOf(String str) {
        return (EnumC1429260nIS) C08FF.LIZ(EnumC1429260nIS.class, str);
    }

    public EnumC1429260nIS(String str, int i) {
    }
}
