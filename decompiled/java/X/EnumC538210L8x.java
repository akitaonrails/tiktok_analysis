package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC538210L8x {
    public static final EnumC538210L8x LIVE_PHOTO;
    public static final /* synthetic */ EnumC538210L8x[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC538210L8x PHOTO;
    public static final EnumC538210L8x VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC538210L8x> getEntries() {
        return LLILLL;
    }

    static {
        EnumC538210L8x enumC538210L8x = new EnumC538210L8x("PHOTO", 0, "photo");
        PHOTO = enumC538210L8x;
        EnumC538210L8x enumC538210L8x2 = new EnumC538210L8x("VIDEO", 1, "video");
        VIDEO = enumC538210L8x2;
        EnumC538210L8x enumC538210L8x3 = new EnumC538210L8x("LIVE_PHOTO", 2, "livephoto");
        LIVE_PHOTO = enumC538210L8x3;
        EnumC538210L8x[] enumC538210L8xArr = {enumC538210L8x, enumC538210L8x2, enumC538210L8x3};
        LLILLJJLI = enumC538210L8xArr;
        LLILLL = new C2254308sP(enumC538210L8xArr);
    }

    public static EnumC538210L8x[] values() {
        return (EnumC538210L8x[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC538210L8x valueOf(String str) {
        return (EnumC538210L8x) C08FF.LIZ(EnumC538210L8x.class, str);
    }

    public EnumC538210L8x(String str, int i, String str2) {
        this.LL = str2;
    }
}
