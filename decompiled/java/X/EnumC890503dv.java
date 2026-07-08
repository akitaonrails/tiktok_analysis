package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC890503dv {
    public static final /* synthetic */ EnumC890503dv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC890503dv NFC;
    public static final EnumC890503dv OCR;

    public static InterfaceC2044707zh<EnumC890503dv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC890503dv enumC890503dv = new EnumC890503dv("OCR", 0);
        OCR = enumC890503dv;
        EnumC890503dv enumC890503dv2 = new EnumC890503dv("NFC", 1);
        NFC = enumC890503dv2;
        EnumC890503dv[] enumC890503dvArr = {enumC890503dv, enumC890503dv2};
        LL = enumC890503dvArr;
        LLILLJJLI = new C2254308sP(enumC890503dvArr);
    }

    public static EnumC890503dv[] values() {
        return (EnumC890503dv[]) LL.clone();
    }

    public static EnumC890503dv valueOf(String str) {
        return (EnumC890503dv) C08FF.LIZ(EnumC890503dv.class, str);
    }

    public EnumC890503dv(String str, int i) {
    }
}
