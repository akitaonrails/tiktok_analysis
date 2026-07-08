package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hwH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1223310hwH {
    public static final EnumC1223310hwH EMPTY;
    public static final EnumC1223310hwH ERROR;
    public static final /* synthetic */ EnumC1223310hwH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1223310hwH LOADING;
    public static final EnumC1223310hwH SUCCESS;

    public static InterfaceC2044707zh<EnumC1223310hwH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1223310hwH enumC1223310hwH = new EnumC1223310hwH("EMPTY", 0);
        EMPTY = enumC1223310hwH;
        EnumC1223310hwH enumC1223310hwH2 = new EnumC1223310hwH("ERROR", 1);
        ERROR = enumC1223310hwH2;
        EnumC1223310hwH enumC1223310hwH3 = new EnumC1223310hwH("LOADING", 2);
        LOADING = enumC1223310hwH3;
        EnumC1223310hwH enumC1223310hwH4 = new EnumC1223310hwH("SUCCESS", 3);
        SUCCESS = enumC1223310hwH4;
        EnumC1223310hwH[] enumC1223310hwHArr = {enumC1223310hwH, enumC1223310hwH2, enumC1223310hwH3, enumC1223310hwH4};
        LL = enumC1223310hwHArr;
        LLILLJJLI = new C2254308sP(enumC1223310hwHArr);
    }

    public static EnumC1223310hwH[] values() {
        return (EnumC1223310hwH[]) LL.clone();
    }

    public static EnumC1223310hwH valueOf(String str) {
        return (EnumC1223310hwH) C08FF.LIZ(EnumC1223310hwH.class, str);
    }

    public EnumC1223310hwH(String str, int i) {
    }
}
