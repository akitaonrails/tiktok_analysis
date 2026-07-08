package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153630g7t {
    public static final EnumC1153630g7t HINT;
    public static final /* synthetic */ EnumC1153630g7t[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1153630g7t PRE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1153630g7t> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1153630g7t enumC1153630g7t = new EnumC1153630g7t("PRE", 0, 1);
        PRE = enumC1153630g7t;
        EnumC1153630g7t enumC1153630g7t2 = new EnumC1153630g7t("HINT", 1, 2);
        HINT = enumC1153630g7t2;
        EnumC1153630g7t[] enumC1153630g7tArr = {enumC1153630g7t, enumC1153630g7t2};
        LLILLJJLI = enumC1153630g7tArr;
        LLILLL = new C2254308sP(enumC1153630g7tArr);
    }

    public static EnumC1153630g7t[] values() {
        return (EnumC1153630g7t[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1153630g7t valueOf(String str) {
        return (EnumC1153630g7t) C08FF.LIZ(EnumC1153630g7t.class, str);
    }

    public EnumC1153630g7t(String str, int i, int i2) {
        this.LL = i2;
    }
}
