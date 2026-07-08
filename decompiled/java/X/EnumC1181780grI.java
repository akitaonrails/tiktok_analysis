package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0grI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1181780grI {
    public static final /* synthetic */ EnumC1181780grI[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1181780grI LOADING;
    public static final EnumC1181780grI LOAD_FINISH;
    public static final EnumC1181780grI NOT_LOAD;

    public static InterfaceC2044707zh<EnumC1181780grI> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1181780grI enumC1181780grI = new EnumC1181780grI("NOT_LOAD", 0);
        NOT_LOAD = enumC1181780grI;
        EnumC1181780grI enumC1181780grI2 = new EnumC1181780grI("LOADING", 1);
        LOADING = enumC1181780grI2;
        EnumC1181780grI enumC1181780grI3 = new EnumC1181780grI("LOAD_FINISH", 2);
        LOAD_FINISH = enumC1181780grI3;
        EnumC1181780grI[] enumC1181780grIArr = {enumC1181780grI, enumC1181780grI2, enumC1181780grI3};
        LL = enumC1181780grIArr;
        LLILLJJLI = new C2254308sP(enumC1181780grIArr);
    }

    public static EnumC1181780grI[] values() {
        return (EnumC1181780grI[]) LL.clone();
    }

    public static EnumC1181780grI valueOf(String str) {
        return (EnumC1181780grI) C08FF.LIZ(EnumC1181780grI.class, str);
    }

    public EnumC1181780grI(String str, int i) {
    }
}
