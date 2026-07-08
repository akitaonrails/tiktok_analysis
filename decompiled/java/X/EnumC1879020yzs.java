package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1879020yzs {
    public static final EnumC1879020yzs CALCULATION;
    public static final EnumC1879020yzs CONTEXT;
    public static final EnumC1879020yzs DB;
    public static final /* synthetic */ EnumC1879020yzs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1879020yzs LOGIC;
    public static final EnumC1879020yzs NET;
    public static final EnumC1879020yzs PARAM;
    public static final EnumC1879020yzs USER_ACTION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1879020yzs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1879020yzs enumC1879020yzs = new EnumC1879020yzs("CONTEXT", 0, "ctx");
        CONTEXT = enumC1879020yzs;
        EnumC1879020yzs enumC1879020yzs2 = new EnumC1879020yzs("PARAM", 1, "param");
        PARAM = enumC1879020yzs2;
        EnumC1879020yzs enumC1879020yzs3 = new EnumC1879020yzs("LOGIC", 2, "logic");
        LOGIC = enumC1879020yzs3;
        EnumC1879020yzs enumC1879020yzs4 = new EnumC1879020yzs("NET", 3, "net");
        NET = enumC1879020yzs4;
        EnumC1879020yzs enumC1879020yzs5 = new EnumC1879020yzs("DB", 4, "db");
        DB = enumC1879020yzs5;
        EnumC1879020yzs enumC1879020yzs6 = new EnumC1879020yzs("CALCULATION", 5, "calc");
        CALCULATION = enumC1879020yzs6;
        EnumC1879020yzs enumC1879020yzs7 = new EnumC1879020yzs("USER_ACTION", 6, "usr");
        USER_ACTION = enumC1879020yzs7;
        EnumC1879020yzs[] enumC1879020yzsArr = {enumC1879020yzs, enumC1879020yzs2, enumC1879020yzs3, enumC1879020yzs4, enumC1879020yzs5, enumC1879020yzs6, enumC1879020yzs7};
        LLILLJJLI = enumC1879020yzsArr;
        LLILLL = new C2254308sP(enumC1879020yzsArr);
    }

    public static EnumC1879020yzs[] values() {
        return (EnumC1879020yzs[]) LLILLJJLI.clone();
    }

    public final String getDescribe() {
        return this.LL;
    }

    public static EnumC1879020yzs valueOf(String str) {
        return (EnumC1879020yzs) C08FF.LIZ(EnumC1879020yzs.class, str);
    }

    public EnumC1879020yzs(String str, int i, String str2) {
        this.LL = str2;
    }
}
