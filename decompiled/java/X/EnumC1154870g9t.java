package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154870g9t {
    public static final EnumC1154870g9t GECKO;
    public static final EnumC1154870g9t IMAGE_MODEL;
    public static final /* synthetic */ EnumC1154870g9t[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154870g9t UNKNOWN;

    public static InterfaceC2044707zh<EnumC1154870g9t> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154870g9t enumC1154870g9t = new EnumC1154870g9t("GECKO", 0);
        GECKO = enumC1154870g9t;
        EnumC1154870g9t enumC1154870g9t2 = new EnumC1154870g9t("IMAGE_MODEL", 1);
        IMAGE_MODEL = enumC1154870g9t2;
        EnumC1154870g9t enumC1154870g9t3 = new EnumC1154870g9t("UNKNOWN", 2);
        UNKNOWN = enumC1154870g9t3;
        EnumC1154870g9t[] enumC1154870g9tArr = {enumC1154870g9t, enumC1154870g9t2, enumC1154870g9t3};
        LL = enumC1154870g9tArr;
        LLILLJJLI = new C2254308sP(enumC1154870g9tArr);
    }

    public static EnumC1154870g9t[] values() {
        return (EnumC1154870g9t[]) LL.clone();
    }

    public static EnumC1154870g9t valueOf(String str) {
        return (EnumC1154870g9t) C08FF.LIZ(EnumC1154870g9t.class, str);
    }

    public EnumC1154870g9t(String str, int i) {
    }
}
