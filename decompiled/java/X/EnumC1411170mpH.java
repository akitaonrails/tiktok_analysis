package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1411170mpH {
    public static final /* synthetic */ EnumC1411170mpH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1411170mpH LOADING;
    public static final EnumC1411170mpH LOAD_FAIL;
    public static final EnumC1411170mpH LOAD_SUCCESS;
    public static final EnumC1411170mpH UNKNOWN;

    public static InterfaceC2044707zh<EnumC1411170mpH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1411170mpH enumC1411170mpH = new EnumC1411170mpH("UNKNOWN", 0);
        UNKNOWN = enumC1411170mpH;
        EnumC1411170mpH enumC1411170mpH2 = new EnumC1411170mpH("LOADING", 1);
        LOADING = enumC1411170mpH2;
        EnumC1411170mpH enumC1411170mpH3 = new EnumC1411170mpH("LOAD_SUCCESS", 2);
        LOAD_SUCCESS = enumC1411170mpH3;
        EnumC1411170mpH enumC1411170mpH4 = new EnumC1411170mpH("LOAD_FAIL", 3);
        LOAD_FAIL = enumC1411170mpH4;
        EnumC1411170mpH[] enumC1411170mpHArr = {enumC1411170mpH, enumC1411170mpH2, enumC1411170mpH3, enumC1411170mpH4};
        LL = enumC1411170mpHArr;
        LLILLJJLI = new C2254308sP(enumC1411170mpHArr);
    }

    public static EnumC1411170mpH[] values() {
        return (EnumC1411170mpH[]) LL.clone();
    }

    public static EnumC1411170mpH valueOf(String str) {
        return (EnumC1411170mpH) C08FF.LIZ(EnumC1411170mpH.class, str);
    }

    public EnumC1411170mpH(String str, int i) {
    }
}
