package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vuX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1760390vuX {
    public static final EnumC1760390vuX CREATED;
    public static final EnumC1760390vuX INIT;
    public static final /* synthetic */ EnumC1760390vuX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1760390vuX LOADING;
    public static final EnumC1760390vuX LOAD_FAIL;
    public static final EnumC1760390vuX LOAD_SUCCESS;

    public static InterfaceC2044707zh<EnumC1760390vuX> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1760390vuX enumC1760390vuX = new EnumC1760390vuX("INIT", 0);
        INIT = enumC1760390vuX;
        EnumC1760390vuX enumC1760390vuX2 = new EnumC1760390vuX("CREATED", 1);
        CREATED = enumC1760390vuX2;
        EnumC1760390vuX enumC1760390vuX3 = new EnumC1760390vuX("LOADING", 2);
        LOADING = enumC1760390vuX3;
        EnumC1760390vuX enumC1760390vuX4 = new EnumC1760390vuX("LOAD_SUCCESS", 3);
        LOAD_SUCCESS = enumC1760390vuX4;
        EnumC1760390vuX enumC1760390vuX5 = new EnumC1760390vuX("LOAD_FAIL", 4);
        LOAD_FAIL = enumC1760390vuX5;
        EnumC1760390vuX[] enumC1760390vuXArr = {enumC1760390vuX, enumC1760390vuX2, enumC1760390vuX3, enumC1760390vuX4, enumC1760390vuX5};
        LL = enumC1760390vuXArr;
        LLILLJJLI = new C2254308sP(enumC1760390vuXArr);
    }

    public static EnumC1760390vuX[] values() {
        return (EnumC1760390vuX[]) LL.clone();
    }

    public static EnumC1760390vuX valueOf(String str) {
        return (EnumC1760390vuX) C08FF.LIZ(EnumC1760390vuX.class, str);
    }

    public EnumC1760390vuX(String str, int i) {
    }
}
