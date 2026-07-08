package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zMM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1892960zMM {
    public static final EnumC1892960zMM DENY;
    public static final EnumC1892960zMM ERROR;
    public static final /* synthetic */ EnumC1892960zMM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1892960zMM LOADING;
    public static final EnumC1892960zMM NOT_NET;
    public static final EnumC1892960zMM SAFE;
    public static final EnumC1892960zMM WARNING;

    public static InterfaceC2044707zh<EnumC1892960zMM> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1892960zMM enumC1892960zMM = new EnumC1892960zMM("ERROR", 0);
        ERROR = enumC1892960zMM;
        EnumC1892960zMM enumC1892960zMM2 = new EnumC1892960zMM("NOT_NET", 1);
        NOT_NET = enumC1892960zMM2;
        EnumC1892960zMM enumC1892960zMM3 = new EnumC1892960zMM("LOADING", 2);
        LOADING = enumC1892960zMM3;
        EnumC1892960zMM enumC1892960zMM4 = new EnumC1892960zMM("SAFE", 3);
        SAFE = enumC1892960zMM4;
        EnumC1892960zMM enumC1892960zMM5 = new EnumC1892960zMM("WARNING", 4);
        WARNING = enumC1892960zMM5;
        EnumC1892960zMM enumC1892960zMM6 = new EnumC1892960zMM("DENY", 5);
        DENY = enumC1892960zMM6;
        EnumC1892960zMM[] enumC1892960zMMArr = {enumC1892960zMM, enumC1892960zMM2, enumC1892960zMM3, enumC1892960zMM4, enumC1892960zMM5, enumC1892960zMM6};
        LL = enumC1892960zMMArr;
        LLILLJJLI = new C2254308sP(enumC1892960zMMArr);
    }

    public static EnumC1892960zMM[] values() {
        return (EnumC1892960zMM[]) LL.clone();
    }

    public static EnumC1892960zMM valueOf(String str) {
        return (EnumC1892960zMM) C08FF.LIZ(EnumC1892960zMM.class, str);
    }

    public EnumC1892960zMM(String str, int i) {
    }
}
