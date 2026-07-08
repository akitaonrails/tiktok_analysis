package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xI2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1813400xI2 {
    public static final EnumC1813400xI2 EMPTY;
    public static final EnumC1813400xI2 FAILED;
    public static final /* synthetic */ EnumC1813400xI2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1813400xI2 LOADING;
    public static final EnumC1813400xI2 SUCCESS;
    public static final EnumC1813400xI2 UNKNOWN;

    public static InterfaceC2044707zh<EnumC1813400xI2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1813400xI2 enumC1813400xI2 = new EnumC1813400xI2("SUCCESS", 0);
        SUCCESS = enumC1813400xI2;
        EnumC1813400xI2 enumC1813400xI22 = new EnumC1813400xI2("EMPTY", 1);
        EMPTY = enumC1813400xI22;
        EnumC1813400xI2 enumC1813400xI23 = new EnumC1813400xI2("FAILED", 2);
        FAILED = enumC1813400xI23;
        EnumC1813400xI2 enumC1813400xI24 = new EnumC1813400xI2("LOADING", 3);
        LOADING = enumC1813400xI24;
        EnumC1813400xI2 enumC1813400xI25 = new EnumC1813400xI2("UNKNOWN", 4);
        UNKNOWN = enumC1813400xI25;
        EnumC1813400xI2[] enumC1813400xI2Arr = {enumC1813400xI2, enumC1813400xI22, enumC1813400xI23, enumC1813400xI24, enumC1813400xI25};
        LL = enumC1813400xI2Arr;
        LLILLJJLI = new C2254308sP(enumC1813400xI2Arr);
    }

    public static EnumC1813400xI2[] values() {
        return (EnumC1813400xI2[]) LL.clone();
    }

    public static EnumC1813400xI2 valueOf(String str) {
        return (EnumC1813400xI2) C08FF.LIZ(EnumC1813400xI2.class, str);
    }

    public EnumC1813400xI2(String str, int i) {
    }
}
