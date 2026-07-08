package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zip, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1906890zip {
    public static final EnumC1906890zip CONTENT;
    public static final EnumC1906890zip HEAD;
    public static final /* synthetic */ EnumC1906890zip[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1906890zip NAME;
    public static final EnumC1906890zip PHOTO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1906890zip> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1906890zip enumC1906890zip = new EnumC1906890zip("HEAD", 0, "head");
        HEAD = enumC1906890zip;
        EnumC1906890zip enumC1906890zip2 = new EnumC1906890zip("NAME", 1, "name");
        NAME = enumC1906890zip2;
        EnumC1906890zip enumC1906890zip3 = new EnumC1906890zip("PHOTO", 2, "photo");
        PHOTO = enumC1906890zip3;
        EnumC1906890zip enumC1906890zip4 = new EnumC1906890zip("CONTENT", 3, "content");
        CONTENT = enumC1906890zip4;
        EnumC1906890zip[] enumC1906890zipArr = {enumC1906890zip, enumC1906890zip2, enumC1906890zip3, enumC1906890zip4};
        LLILLJJLI = enumC1906890zipArr;
        LLILLL = new C2254308sP(enumC1906890zipArr);
    }

    public static EnumC1906890zip[] values() {
        return (EnumC1906890zip[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1906890zip valueOf(String str) {
        return (EnumC1906890zip) C08FF.LIZ(EnumC1906890zip.class, str);
    }

    public EnumC1906890zip(String str, int i, String str2) {
        this.LL = str2;
    }
}
