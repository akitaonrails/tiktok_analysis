package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hNK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1201640hNK {
    public static final EnumC1201640hNK CANCELLED_ERR;
    public static final EnumC1201640hNK EMPTY_ERR;
    public static final /* synthetic */ EnumC1201640hNK[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1201640hNK LOC_ERR;
    public static final EnumC1201640hNK NETWORK_ERR;
    public static final EnumC1201640hNK SUCCESS;
    public static final EnumC1201640hNK UNKNOWN_ERR;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1201640hNK> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1201640hNK enumC1201640hNK = new EnumC1201640hNK("UNKNOWN_ERR", 0, -1, "unknown_err");
        UNKNOWN_ERR = enumC1201640hNK;
        EnumC1201640hNK enumC1201640hNK2 = new EnumC1201640hNK("SUCCESS", 1, 0, "success");
        SUCCESS = enumC1201640hNK2;
        EnumC1201640hNK enumC1201640hNK3 = new EnumC1201640hNK("NETWORK_ERR", 2, 1, "net_err");
        NETWORK_ERR = enumC1201640hNK3;
        EnumC1201640hNK enumC1201640hNK4 = new EnumC1201640hNK("LOC_ERR", 3, 2, "loc_err");
        LOC_ERR = enumC1201640hNK4;
        EnumC1201640hNK enumC1201640hNK5 = new EnumC1201640hNK("EMPTY_ERR", 4, 3, "empty_err");
        EMPTY_ERR = enumC1201640hNK5;
        EnumC1201640hNK enumC1201640hNK6 = new EnumC1201640hNK("CANCELLED_ERR", 5, 4, "cancel_err");
        CANCELLED_ERR = enumC1201640hNK6;
        EnumC1201640hNK[] enumC1201640hNKArr = {enumC1201640hNK, enumC1201640hNK2, enumC1201640hNK3, enumC1201640hNK4, enumC1201640hNK5, enumC1201640hNK6};
        LLILLL = enumC1201640hNKArr;
        LLILZ = new C2254308sP(enumC1201640hNKArr);
    }

    public static EnumC1201640hNK[] values() {
        return (EnumC1201640hNK[]) LLILLL.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public final String getTypeStr() {
        return this.LLILLJJLI;
    }

    public static EnumC1201640hNK valueOf(String str) {
        return (EnumC1201640hNK) C08FF.LIZ(EnumC1201640hNK.class, str);
    }

    public EnumC1201640hNK(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
