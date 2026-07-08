package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1862960yZy {
    public static final EnumC1862960yZy ASK_VIDEO;
    public static final /* synthetic */ EnumC1862960yZy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1862960yZy PURE_QUERIES;
    public static final EnumC1862960yZy RECIPE;
    public static final EnumC1862960yZy TEMPLATE_CREATE;
    public static final EnumC1862960yZy TRIP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1862960yZy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1862960yZy enumC1862960yZy = new EnumC1862960yZy("ASK_VIDEO", 0, "after_feed");
        ASK_VIDEO = enumC1862960yZy;
        EnumC1862960yZy enumC1862960yZy2 = new EnumC1862960yZy("TRIP", 1, "experience_decision_travel");
        TRIP = enumC1862960yZy2;
        EnumC1862960yZy enumC1862960yZy3 = new EnumC1862960yZy("RECIPE", 2, "experience_decision_menu");
        RECIPE = enumC1862960yZy3;
        EnumC1862960yZy enumC1862960yZy4 = new EnumC1862960yZy("TEMPLATE_CREATE", 3, "image_generation_guide");
        TEMPLATE_CREATE = enumC1862960yZy4;
        EnumC1862960yZy enumC1862960yZy5 = new EnumC1862960yZy("PURE_QUERIES", 4, "query_guide");
        PURE_QUERIES = enumC1862960yZy5;
        EnumC1862960yZy[] enumC1862960yZyArr = {enumC1862960yZy, enumC1862960yZy2, enumC1862960yZy3, enumC1862960yZy4, enumC1862960yZy5};
        LLILLJJLI = enumC1862960yZyArr;
        LLILLL = new C2254308sP(enumC1862960yZyArr);
    }

    public static EnumC1862960yZy[] values() {
        return (EnumC1862960yZy[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static EnumC1862960yZy valueOf(String str) {
        return (EnumC1862960yZy) C08FF.LIZ(EnumC1862960yZy.class, str);
    }

    public EnumC1862960yZy(String str, int i, String str2) {
        this.LL = str2;
    }
}
