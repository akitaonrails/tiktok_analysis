package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y0O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1840900y0O {
    public static final EnumC1840900y0O EMPTY;
    public static final EnumC1840900y0O ERROR;
    public static final /* synthetic */ EnumC1840900y0O[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1840900y0O LOADING;
    public static final EnumC1840900y0O SUCCESS;

    public static InterfaceC2044707zh<EnumC1840900y0O> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1840900y0O enumC1840900y0O = new EnumC1840900y0O("LOADING", 0);
        LOADING = enumC1840900y0O;
        EnumC1840900y0O enumC1840900y0O2 = new EnumC1840900y0O("SUCCESS", 1);
        SUCCESS = enumC1840900y0O2;
        EnumC1840900y0O enumC1840900y0O3 = new EnumC1840900y0O("ERROR", 2);
        ERROR = enumC1840900y0O3;
        EnumC1840900y0O enumC1840900y0O4 = new EnumC1840900y0O("EMPTY", 3);
        EMPTY = enumC1840900y0O4;
        EnumC1840900y0O[] enumC1840900y0OArr = {enumC1840900y0O, enumC1840900y0O2, enumC1840900y0O3, enumC1840900y0O4};
        LL = enumC1840900y0OArr;
        LLILLJJLI = new C2254308sP(enumC1840900y0OArr);
    }

    public static EnumC1840900y0O[] values() {
        return (EnumC1840900y0O[]) LL.clone();
    }

    public static EnumC1840900y0O valueOf(String str) {
        return (EnumC1840900y0O) C08FF.LIZ(EnumC1840900y0O.class, str);
    }

    public EnumC1840900y0O(String str, int i) {
    }
}
