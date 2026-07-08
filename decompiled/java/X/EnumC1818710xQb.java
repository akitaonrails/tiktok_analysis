package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0xQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1818710xQb {
    public static final EnumC1818710xQb CROP;
    public static final EnumC1818710xQb LAYOUT;
    public static final /* synthetic */ EnumC1818710xQb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1818710xQb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1818710xQb enumC1818710xQb = new EnumC1818710xQb("LAYOUT", 0);
        LAYOUT = enumC1818710xQb;
        EnumC1818710xQb enumC1818710xQb2 = new EnumC1818710xQb("CROP", 1);
        CROP = enumC1818710xQb2;
        EnumC1818710xQb[] enumC1818710xQbArr = {enumC1818710xQb, enumC1818710xQb2};
        LL = enumC1818710xQbArr;
        LLILLJJLI = new C2254308sP(enumC1818710xQbArr);
    }

    public static EnumC1818710xQb[] values() {
        return (EnumC1818710xQb[]) LL.clone();
    }

    public static EnumC1818710xQb valueOf(String str) {
        return (EnumC1818710xQb) C08FF.LIZ(EnumC1818710xQb.class, str);
    }

    public EnumC1818710xQb(String str, int i) {
    }
}
