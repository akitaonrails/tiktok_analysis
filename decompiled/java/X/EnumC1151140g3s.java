package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g3s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1151140g3s {
    public static final EnumC1151140g3s FAILED;
    public static final EnumC1151140g3s INIT;
    public static final /* synthetic */ EnumC1151140g3s[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1151140g3s SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1151140g3s> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1151140g3s enumC1151140g3s = new EnumC1151140g3s("INIT", 0, "initial");
        INIT = enumC1151140g3s;
        EnumC1151140g3s enumC1151140g3s2 = new EnumC1151140g3s("SUCCESS", 1, "success");
        SUCCESS = enumC1151140g3s2;
        EnumC1151140g3s enumC1151140g3s3 = new EnumC1151140g3s("FAILED", 2, "failed");
        FAILED = enumC1151140g3s3;
        EnumC1151140g3s[] enumC1151140g3sArr = {enumC1151140g3s, enumC1151140g3s2, enumC1151140g3s3};
        LLILLJJLI = enumC1151140g3sArr;
        LLILLL = new C2254308sP(enumC1151140g3sArr);
    }

    public static EnumC1151140g3s[] values() {
        return (EnumC1151140g3s[]) LLILLJJLI.clone();
    }

    public final String getState() {
        return this.LL;
    }

    public static EnumC1151140g3s valueOf(String str) {
        return (EnumC1151140g3s) C08FF.LIZ(EnumC1151140g3s.class, str);
    }

    public EnumC1151140g3s(String str, int i, String str2) {
        this.LL = str2;
    }
}
