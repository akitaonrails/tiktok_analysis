package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Qc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC840403Qc {
    public static final /* synthetic */ EnumC840403Qc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC840403Qc PRELOAD_API;
    public static final EnumC840403Qc PRELOAD_FULL_DATA_API;
    public static final EnumC840403Qc SOFT_INTERCEPT_DATA;

    public static InterfaceC2044707zh<EnumC840403Qc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC840403Qc enumC840403Qc = new EnumC840403Qc("PRELOAD_API", 0);
        PRELOAD_API = enumC840403Qc;
        EnumC840403Qc enumC840403Qc2 = new EnumC840403Qc("PRELOAD_FULL_DATA_API", 1);
        PRELOAD_FULL_DATA_API = enumC840403Qc2;
        EnumC840403Qc enumC840403Qc3 = new EnumC840403Qc("SOFT_INTERCEPT_DATA", 2);
        SOFT_INTERCEPT_DATA = enumC840403Qc3;
        EnumC840403Qc[] enumC840403QcArr = {enumC840403Qc, enumC840403Qc2, enumC840403Qc3};
        LL = enumC840403QcArr;
        LLILLJJLI = new C2254308sP(enumC840403QcArr);
    }

    public static EnumC840403Qc[] values() {
        return (EnumC840403Qc[]) LL.clone();
    }

    public static EnumC840403Qc valueOf(String str) {
        return (EnumC840403Qc) C08FF.LIZ(EnumC840403Qc.class, str);
    }

    public EnumC840403Qc(String str, int i) {
    }
}
