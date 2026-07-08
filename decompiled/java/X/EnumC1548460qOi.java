package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1548460qOi {
    public static final EnumC1548460qOi DEFAULT_DISABLE;
    public static final EnumC1548460qOi FOREST_RESOURCE_PRELOAD;
    public static final /* synthetic */ EnumC1548460qOi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1548460qOi SPARK_PRELAYOUT;
    public static final EnumC1548460qOi SPARK_PRELOAD_FULL_MODE;
    public static final EnumC1548460qOi SPARK_PRELOAD_PENDING_LOAD;
    public static final EnumC1548460qOi SPARK_PRELOAD_PENDING_RUNTIME;

    public static InterfaceC2044707zh<EnumC1548460qOi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1548460qOi enumC1548460qOi = new EnumC1548460qOi("DEFAULT_DISABLE", 0);
        DEFAULT_DISABLE = enumC1548460qOi;
        EnumC1548460qOi enumC1548460qOi2 = new EnumC1548460qOi("FOREST_RESOURCE_PRELOAD", 1);
        FOREST_RESOURCE_PRELOAD = enumC1548460qOi2;
        EnumC1548460qOi enumC1548460qOi3 = new EnumC1548460qOi("SPARK_PRELOAD_PENDING_LOAD", 2);
        SPARK_PRELOAD_PENDING_LOAD = enumC1548460qOi3;
        EnumC1548460qOi enumC1548460qOi4 = new EnumC1548460qOi("SPARK_PRELOAD_PENDING_RUNTIME", 3);
        SPARK_PRELOAD_PENDING_RUNTIME = enumC1548460qOi4;
        EnumC1548460qOi enumC1548460qOi5 = new EnumC1548460qOi("SPARK_PRELOAD_FULL_MODE", 4);
        SPARK_PRELOAD_FULL_MODE = enumC1548460qOi5;
        EnumC1548460qOi enumC1548460qOi6 = new EnumC1548460qOi("SPARK_PRELAYOUT", 5);
        SPARK_PRELAYOUT = enumC1548460qOi6;
        EnumC1548460qOi[] enumC1548460qOiArr = {enumC1548460qOi, enumC1548460qOi2, enumC1548460qOi3, enumC1548460qOi4, enumC1548460qOi5, enumC1548460qOi6};
        LL = enumC1548460qOiArr;
        LLILLJJLI = new C2254308sP(enumC1548460qOiArr);
    }

    public static EnumC1548460qOi[] values() {
        return (EnumC1548460qOi[]) LL.clone();
    }

    public static EnumC1548460qOi valueOf(String str) {
        return (EnumC1548460qOi) C08FF.LIZ(EnumC1548460qOi.class, str);
    }

    public EnumC1548460qOi(String str, int i) {
    }
}
