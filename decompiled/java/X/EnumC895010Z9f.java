package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC895010Z9f {
    public static final /* synthetic */ EnumC895010Z9f[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC895010Z9f SPARK_BACK_V1;
    public static final EnumC895010Z9f SPARK_V1;
    public final String LL;

    public static InterfaceC2044707zh<EnumC895010Z9f> getEntries() {
        return LLILLL;
    }

    static {
        EnumC895010Z9f enumC895010Z9f = new EnumC895010Z9f("SPARK_V1", 0, "spark_v1");
        SPARK_V1 = enumC895010Z9f;
        EnumC895010Z9f enumC895010Z9f2 = new EnumC895010Z9f("SPARK_BACK_V1", 1, "spark_back_v1");
        SPARK_BACK_V1 = enumC895010Z9f2;
        EnumC895010Z9f[] enumC895010Z9fArr = {enumC895010Z9f, enumC895010Z9f2};
        LLILLJJLI = enumC895010Z9fArr;
        LLILLL = new C2254308sP(enumC895010Z9fArr);
    }

    public static EnumC895010Z9f[] values() {
        return (EnumC895010Z9f[]) LLILLJJLI.clone();
    }

    public final String getLightInteractionName() {
        return this.LL;
    }

    public static EnumC895010Z9f valueOf(String str) {
        return (EnumC895010Z9f) C08FF.LIZ(EnumC895010Z9f.class, str);
    }

    public EnumC895010Z9f(String str, int i, String str2) {
        this.LL = str2;
    }
}
