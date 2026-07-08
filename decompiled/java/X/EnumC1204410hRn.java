package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1204410hRn {
    public static final EnumC1204410hRn CACHE;
    public static final C1204420hRo Companion;
    public static final /* synthetic */ EnumC1204410hRn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1204410hRn PRELOAD;
    public static final EnumC1204410hRn REFRESH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1204410hRn> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0hRo] */
    static {
        EnumC1204410hRn enumC1204410hRn = new EnumC1204410hRn("REFRESH", 0, "refresh");
        REFRESH = enumC1204410hRn;
        EnumC1204410hRn enumC1204410hRn2 = new EnumC1204410hRn("CACHE", 1, "cache");
        CACHE = enumC1204410hRn2;
        EnumC1204410hRn enumC1204410hRn3 = new EnumC1204410hRn("PRELOAD", 2, "preload");
        PRELOAD = enumC1204410hRn3;
        EnumC1204410hRn[] enumC1204410hRnArr = {enumC1204410hRn, enumC1204410hRn2, enumC1204410hRn3};
        LLILLJJLI = enumC1204410hRnArr;
        LLILLL = new C2254308sP(enumC1204410hRnArr);
        Companion = new Object() { // from class: X.0hRo
        };
    }

    public static EnumC1204410hRn[] values() {
        return (EnumC1204410hRn[]) LLILLJJLI.clone();
    }

    public final String getSourceStr() {
        return this.LL;
    }

    public static EnumC1204410hRn valueOf(String str) {
        return (EnumC1204410hRn) C08FF.LIZ(EnumC1204410hRn.class, str);
    }

    public EnumC1204410hRn(String str, int i, String str2) {
        this.LL = str2;
    }
}
