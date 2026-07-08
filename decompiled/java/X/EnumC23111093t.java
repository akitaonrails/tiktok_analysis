package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.093t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC23111093t {
    public static final EnumC23111093t CLOUD_TOKEN;
    public static final /* synthetic */ EnumC23111093t[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC23111093t NOT_STARTED;
    public static final EnumC23111093t OIDC;

    public static InterfaceC2044707zh<EnumC23111093t> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC23111093t enumC23111093t = new EnumC23111093t("NOT_STARTED", 0);
        NOT_STARTED = enumC23111093t;
        EnumC23111093t enumC23111093t2 = new EnumC23111093t("OIDC", 1);
        OIDC = enumC23111093t2;
        EnumC23111093t enumC23111093t3 = new EnumC23111093t("CLOUD_TOKEN", 2);
        CLOUD_TOKEN = enumC23111093t3;
        EnumC23111093t[] enumC23111093tArr = {enumC23111093t, enumC23111093t2, enumC23111093t3};
        LL = enumC23111093tArr;
        LLILLJJLI = new C2254308sP(enumC23111093tArr);
    }

    public static EnumC23111093t[] values() {
        return (EnumC23111093t[]) LL.clone();
    }

    public static EnumC23111093t valueOf(String str) {
        return (EnumC23111093t) C08FF.LIZ(EnumC23111093t.class, str);
    }

    public EnumC23111093t(String str, int i) {
    }
}
