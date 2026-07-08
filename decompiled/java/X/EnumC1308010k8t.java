package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1308010k8t {
    public static final EnumC1308010k8t APP_LOG;
    public static final EnumC1308010k8t CUSTOM;
    public static final /* synthetic */ EnumC1308010k8t[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1308010k8t> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1308010k8t enumC1308010k8t = new EnumC1308010k8t("CUSTOM", 0);
        CUSTOM = enumC1308010k8t;
        EnumC1308010k8t enumC1308010k8t2 = new EnumC1308010k8t("APP_LOG", 1);
        APP_LOG = enumC1308010k8t2;
        EnumC1308010k8t[] enumC1308010k8tArr = {enumC1308010k8t, enumC1308010k8t2};
        LL = enumC1308010k8tArr;
        LLILLJJLI = new C2254308sP(enumC1308010k8tArr);
    }

    public static EnumC1308010k8t[] values() {
        return (EnumC1308010k8t[]) LL.clone();
    }

    public static EnumC1308010k8t valueOf(String str) {
        return (EnumC1308010k8t) C08FF.LIZ(EnumC1308010k8t.class, str);
    }

    public EnumC1308010k8t(String str, int i) {
    }
}
