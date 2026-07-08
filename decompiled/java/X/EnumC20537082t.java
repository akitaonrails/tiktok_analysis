package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.082t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20537082t {
    public static final EnumC20537082t ACTION_TYPE_ADVANCED;
    public static final EnumC20537082t ACTION_TYPE_SEMI_POP;
    public static final /* synthetic */ EnumC20537082t[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20537082t> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20537082t enumC20537082t = new EnumC20537082t("ACTION_TYPE_SEMI_POP", 0, 1);
        ACTION_TYPE_SEMI_POP = enumC20537082t;
        EnumC20537082t enumC20537082t2 = new EnumC20537082t("ACTION_TYPE_ADVANCED", 1, 2);
        ACTION_TYPE_ADVANCED = enumC20537082t2;
        EnumC20537082t[] enumC20537082tArr = {enumC20537082t, enumC20537082t2};
        LLILLJJLI = enumC20537082tArr;
        LLILLL = new C2254308sP(enumC20537082tArr);
    }

    public static EnumC20537082t[] values() {
        return (EnumC20537082t[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC20537082t valueOf(String str) {
        return (EnumC20537082t) C08FF.LIZ(EnumC20537082t.class, str);
    }

    public EnumC20537082t(String str, int i, int i2) {
        this.LL = i2;
    }
}
