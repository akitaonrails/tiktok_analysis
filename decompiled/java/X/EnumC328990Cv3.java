package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cv3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC328990Cv3 {
    public static final /* synthetic */ EnumC328990Cv3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC328990Cv3 LOAD_MORE;
    public static final EnumC328990Cv3 REFRESH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC328990Cv3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC328990Cv3 enumC328990Cv3 = new EnumC328990Cv3("REFRESH", 0, "refresh");
        REFRESH = enumC328990Cv3;
        EnumC328990Cv3 enumC328990Cv32 = new EnumC328990Cv3("LOAD_MORE", 1, "load more");
        LOAD_MORE = enumC328990Cv32;
        EnumC328990Cv3[] enumC328990Cv3Arr = {enumC328990Cv3, enumC328990Cv32};
        LLILLJJLI = enumC328990Cv3Arr;
        LLILLL = new C2254308sP(enumC328990Cv3Arr);
    }

    public static EnumC328990Cv3[] values() {
        return (EnumC328990Cv3[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC328990Cv3 valueOf(String str) {
        return (EnumC328990Cv3) C08FF.LIZ(EnumC328990Cv3.class, str);
    }

    public EnumC328990Cv3(String str, int i, String str2) {
        this.LL = str2;
    }
}
