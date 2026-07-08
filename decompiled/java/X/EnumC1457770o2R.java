package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0o2R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1457770o2R {
    public static final EnumC1457770o2R CANCEL;
    public static final EnumC1457770o2R FAIL;
    public static final EnumC1457770o2R IDLE;
    public static final /* synthetic */ EnumC1457770o2R[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1457770o2R LOADING;
    public static final EnumC1457770o2R SUCCESS;

    public static InterfaceC2044707zh<EnumC1457770o2R> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1457770o2R enumC1457770o2R = new EnumC1457770o2R("IDLE", 0);
        IDLE = enumC1457770o2R;
        EnumC1457770o2R enumC1457770o2R2 = new EnumC1457770o2R("LOADING", 1);
        LOADING = enumC1457770o2R2;
        EnumC1457770o2R enumC1457770o2R3 = new EnumC1457770o2R("SUCCESS", 2);
        SUCCESS = enumC1457770o2R3;
        EnumC1457770o2R enumC1457770o2R4 = new EnumC1457770o2R("FAIL", 3);
        FAIL = enumC1457770o2R4;
        EnumC1457770o2R enumC1457770o2R5 = new EnumC1457770o2R("CANCEL", 4);
        CANCEL = enumC1457770o2R5;
        EnumC1457770o2R[] enumC1457770o2RArr = {enumC1457770o2R, enumC1457770o2R2, enumC1457770o2R3, enumC1457770o2R4, enumC1457770o2R5};
        LL = enumC1457770o2RArr;
        LLILLJJLI = new C2254308sP(enumC1457770o2RArr);
    }

    public static EnumC1457770o2R[] values() {
        return (EnumC1457770o2R[]) LL.clone();
    }

    public static EnumC1457770o2R valueOf(String str) {
        return (EnumC1457770o2R) C08FF.LIZ(EnumC1457770o2R.class, str);
    }

    public EnumC1457770o2R(String str, int i) {
    }
}
