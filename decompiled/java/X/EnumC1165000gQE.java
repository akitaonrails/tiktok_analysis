package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gQE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1165000gQE {
    public static final EnumC1165000gQE ERROR;
    public static final EnumC1165000gQE IDLE;
    public static final /* synthetic */ EnumC1165000gQE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1165000gQE LOADING;
    public static final EnumC1165000gQE SUCCESS;

    public static InterfaceC2044707zh<EnumC1165000gQE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1165000gQE enumC1165000gQE = new EnumC1165000gQE("IDLE", 0);
        IDLE = enumC1165000gQE;
        EnumC1165000gQE enumC1165000gQE2 = new EnumC1165000gQE("LOADING", 1);
        LOADING = enumC1165000gQE2;
        EnumC1165000gQE enumC1165000gQE3 = new EnumC1165000gQE("SUCCESS", 2);
        SUCCESS = enumC1165000gQE3;
        EnumC1165000gQE enumC1165000gQE4 = new EnumC1165000gQE("ERROR", 3);
        ERROR = enumC1165000gQE4;
        EnumC1165000gQE[] enumC1165000gQEArr = {enumC1165000gQE, enumC1165000gQE2, enumC1165000gQE3, enumC1165000gQE4};
        LL = enumC1165000gQEArr;
        LLILLJJLI = new C2254308sP(enumC1165000gQEArr);
    }

    public static EnumC1165000gQE[] values() {
        return (EnumC1165000gQE[]) LL.clone();
    }

    public static EnumC1165000gQE valueOf(String str) {
        return (EnumC1165000gQE) C08FF.LIZ(EnumC1165000gQE.class, str);
    }

    public EnumC1165000gQE(String str, int i) {
    }
}
