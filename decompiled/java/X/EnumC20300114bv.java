package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.14bv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20300114bv {
    public static final EnumC20300114bv ANY;
    public static final EnumC20300114bv FOCUS;
    public static final EnumC20300114bv LAYOUT;
    public static final /* synthetic */ EnumC20300114bv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20300114bv SCROLL;

    public static InterfaceC2044707zh<EnumC20300114bv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC20300114bv enumC20300114bv = new EnumC20300114bv("LAYOUT", 0);
        LAYOUT = enumC20300114bv;
        EnumC20300114bv enumC20300114bv2 = new EnumC20300114bv("SCROLL", 1);
        SCROLL = enumC20300114bv2;
        EnumC20300114bv enumC20300114bv3 = new EnumC20300114bv("FOCUS", 2);
        FOCUS = enumC20300114bv3;
        EnumC20300114bv enumC20300114bv4 = new EnumC20300114bv("ANY", 3);
        ANY = enumC20300114bv4;
        EnumC20300114bv[] enumC20300114bvArr = {enumC20300114bv, enumC20300114bv2, enumC20300114bv3, enumC20300114bv4};
        LL = enumC20300114bvArr;
        LLILLJJLI = new C2254308sP(enumC20300114bvArr);
    }

    public static EnumC20300114bv[] values() {
        return (EnumC20300114bv[]) LL.clone();
    }

    public static EnumC20300114bv valueOf(String str) {
        return (EnumC20300114bv) C08FF.LIZ(EnumC20300114bv.class, str);
    }

    public EnumC20300114bv(String str, int i) {
    }
}
