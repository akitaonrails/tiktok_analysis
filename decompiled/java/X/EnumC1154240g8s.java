package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154240g8s {
    public static final EnumC1154240g8s ERROR;
    public static final /* synthetic */ EnumC1154240g8s[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1154240g8s TIPS;
    public static final EnumC1154240g8s WEAK_ERROR;

    public static InterfaceC2044707zh<EnumC1154240g8s> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154240g8s enumC1154240g8s = new EnumC1154240g8s("ERROR", 0);
        ERROR = enumC1154240g8s;
        EnumC1154240g8s enumC1154240g8s2 = new EnumC1154240g8s("WEAK_ERROR", 1);
        WEAK_ERROR = enumC1154240g8s2;
        EnumC1154240g8s enumC1154240g8s3 = new EnumC1154240g8s("TIPS", 2);
        TIPS = enumC1154240g8s3;
        EnumC1154240g8s[] enumC1154240g8sArr = {enumC1154240g8s, enumC1154240g8s2, enumC1154240g8s3};
        LL = enumC1154240g8sArr;
        LLILLJJLI = new C2254308sP(enumC1154240g8sArr);
    }

    public static EnumC1154240g8s[] values() {
        return (EnumC1154240g8s[]) LL.clone();
    }

    public static EnumC1154240g8s valueOf(String str) {
        return (EnumC1154240g8s) C08FF.LIZ(EnumC1154240g8s.class, str);
    }

    public EnumC1154240g8s(String str, int i) {
    }
}
