package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1308000k8s {
    public static final EnumC1308000k8s EXPRESSION;
    public static final /* synthetic */ EnumC1308000k8s[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1308000k8s NONE;
    public static final EnumC1308000k8s PITAYA_CEP;
    public static final EnumC1308000k8s TTM_CEP;

    public static InterfaceC2044707zh<EnumC1308000k8s> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1308000k8s enumC1308000k8s = new EnumC1308000k8s("NONE", 0);
        NONE = enumC1308000k8s;
        EnumC1308000k8s enumC1308000k8s2 = new EnumC1308000k8s("EXPRESSION", 1);
        EXPRESSION = enumC1308000k8s2;
        EnumC1308000k8s enumC1308000k8s3 = new EnumC1308000k8s("PITAYA_CEP", 2);
        PITAYA_CEP = enumC1308000k8s3;
        EnumC1308000k8s enumC1308000k8s4 = new EnumC1308000k8s("TTM_CEP", 3);
        TTM_CEP = enumC1308000k8s4;
        EnumC1308000k8s[] enumC1308000k8sArr = {enumC1308000k8s, enumC1308000k8s2, enumC1308000k8s3, enumC1308000k8s4};
        LL = enumC1308000k8sArr;
        LLILLJJLI = new C2254308sP(enumC1308000k8sArr);
    }

    public static EnumC1308000k8s[] values() {
        return (EnumC1308000k8s[]) LL.clone();
    }

    public static EnumC1308000k8s valueOf(String str) {
        return (EnumC1308000k8s) C08FF.LIZ(EnumC1308000k8s.class, str);
    }

    public EnumC1308000k8s(String str, int i) {
    }
}
