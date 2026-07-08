package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1769280w8s {
    public static final EnumC1769280w8s FAILED;
    public static final EnumC1769280w8s HIDING;
    public static final /* synthetic */ EnumC1769280w8s[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1769280w8s SHOWING;
    public static final EnumC1769280w8s UNEXECUTED;

    public static InterfaceC2044707zh<EnumC1769280w8s> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1769280w8s enumC1769280w8s = new EnumC1769280w8s("UNEXECUTED", 0);
        UNEXECUTED = enumC1769280w8s;
        EnumC1769280w8s enumC1769280w8s2 = new EnumC1769280w8s("SHOWING", 1);
        SHOWING = enumC1769280w8s2;
        EnumC1769280w8s enumC1769280w8s3 = new EnumC1769280w8s("HIDING", 2);
        HIDING = enumC1769280w8s3;
        EnumC1769280w8s enumC1769280w8s4 = new EnumC1769280w8s("FAILED", 3);
        FAILED = enumC1769280w8s4;
        EnumC1769280w8s[] enumC1769280w8sArr = {enumC1769280w8s, enumC1769280w8s2, enumC1769280w8s3, enumC1769280w8s4};
        LL = enumC1769280w8sArr;
        LLILLJJLI = new C2254308sP(enumC1769280w8sArr);
    }

    public static EnumC1769280w8s[] values() {
        return (EnumC1769280w8s[]) LL.clone();
    }

    public static EnumC1769280w8s valueOf(String str) {
        return (EnumC1769280w8s) C08FF.LIZ(EnumC1769280w8s.class, str);
    }

    public EnumC1769280w8s(String str, int i) {
    }
}
