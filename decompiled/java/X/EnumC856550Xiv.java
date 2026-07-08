package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xiv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC856550Xiv {
    public static final EnumC856550Xiv CROP_TYPE_AUTO_CROP;
    public static final EnumC856550Xiv CROP_TYPE_MANUAL_CROP;
    public static final EnumC856550Xiv CROP_TYPE_UNCHANGED;
    public static final EnumC856550Xiv CROP_TYPE_UNKNOWN;
    public static final /* synthetic */ EnumC856550Xiv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC856550Xiv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC856550Xiv enumC856550Xiv = new EnumC856550Xiv("CROP_TYPE_UNKNOWN", 0);
        CROP_TYPE_UNKNOWN = enumC856550Xiv;
        EnumC856550Xiv enumC856550Xiv2 = new EnumC856550Xiv("CROP_TYPE_UNCHANGED", 1);
        CROP_TYPE_UNCHANGED = enumC856550Xiv2;
        EnumC856550Xiv enumC856550Xiv3 = new EnumC856550Xiv("CROP_TYPE_AUTO_CROP", 2);
        CROP_TYPE_AUTO_CROP = enumC856550Xiv3;
        EnumC856550Xiv enumC856550Xiv4 = new EnumC856550Xiv("CROP_TYPE_MANUAL_CROP", 3);
        CROP_TYPE_MANUAL_CROP = enumC856550Xiv4;
        EnumC856550Xiv[] enumC856550XivArr = {enumC856550Xiv, enumC856550Xiv2, enumC856550Xiv3, enumC856550Xiv4};
        LL = enumC856550XivArr;
        LLILLJJLI = new C2254308sP(enumC856550XivArr);
    }

    public static EnumC856550Xiv[] values() {
        return (EnumC856550Xiv[]) LL.clone();
    }

    public static EnumC856550Xiv valueOf(String str) {
        return (EnumC856550Xiv) C08FF.LIZ(EnumC856550Xiv.class, str);
    }

    public EnumC856550Xiv(String str, int i) {
    }
}
