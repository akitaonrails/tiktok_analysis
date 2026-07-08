package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14Bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20223914Bh {
    public static final EnumC20223914Bh ANSIX923Padding;
    public static final C20224314Bl Companion;
    public static final EnumC20223914Bh ISO10126Padding;
    public static final /* synthetic */ EnumC20223914Bh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20223914Bh NoPadding;
    public static final EnumC20223914Bh PKCS7Padding;
    public static final EnumC20223914Bh ZeroPadding;

    public static InterfaceC2044707zh<EnumC20223914Bh> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.14Bl] */
    static {
        EnumC20223914Bh enumC20223914Bh = new EnumC20223914Bh("NoPadding", 0);
        NoPadding = enumC20223914Bh;
        EnumC20223914Bh enumC20223914Bh2 = new EnumC20223914Bh("PKCS7Padding", 1);
        PKCS7Padding = enumC20223914Bh2;
        EnumC20223914Bh enumC20223914Bh3 = new EnumC20223914Bh("ANSIX923Padding", 2);
        ANSIX923Padding = enumC20223914Bh3;
        EnumC20223914Bh enumC20223914Bh4 = new EnumC20223914Bh("ISO10126Padding", 3);
        ISO10126Padding = enumC20223914Bh4;
        EnumC20223914Bh enumC20223914Bh5 = new EnumC20223914Bh("ZeroPadding", 4);
        ZeroPadding = enumC20223914Bh5;
        EnumC20223914Bh[] enumC20223914BhArr = {enumC20223914Bh, enumC20223914Bh2, enumC20223914Bh3, enumC20223914Bh4, enumC20223914Bh5};
        LL = enumC20223914BhArr;
        LLILLJJLI = new C2254308sP(enumC20223914BhArr);
        Companion = new Object() { // from class: X.14Bl
        };
    }

    public static EnumC20223914Bh[] values() {
        return (EnumC20223914Bh[]) LL.clone();
    }

    public static EnumC20223914Bh valueOf(String str) {
        return (EnumC20223914Bh) C08FF.LIZ(EnumC20223914Bh.class, str);
    }

    public EnumC20223914Bh(String str, int i) {
    }
}
