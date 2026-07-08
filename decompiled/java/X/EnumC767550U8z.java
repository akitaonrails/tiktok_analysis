package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U8z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC767550U8z {
    public static final EnumC767550U8z BEAUTY;
    public static final EnumC767550U8z FILTER;
    public static final EnumC767550U8z GIFT;
    public static final /* synthetic */ EnumC767550U8z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC767550U8z NONE;
    public static final EnumC767550U8z PLACEHOLDER;
    public static final EnumC767550U8z STICKER_EFFECT;

    public static InterfaceC2044707zh<EnumC767550U8z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC767550U8z enumC767550U8z = new EnumC767550U8z("NONE", 0);
        NONE = enumC767550U8z;
        EnumC767550U8z enumC767550U8z2 = new EnumC767550U8z("PLACEHOLDER", 1);
        PLACEHOLDER = enumC767550U8z2;
        EnumC767550U8z enumC767550U8z3 = new EnumC767550U8z("STICKER_EFFECT", 2);
        STICKER_EFFECT = enumC767550U8z3;
        EnumC767550U8z enumC767550U8z4 = new EnumC767550U8z("BEAUTY", 3);
        BEAUTY = enumC767550U8z4;
        EnumC767550U8z enumC767550U8z5 = new EnumC767550U8z("FILTER", 4);
        FILTER = enumC767550U8z5;
        EnumC767550U8z enumC767550U8z6 = new EnumC767550U8z("GIFT", 5);
        GIFT = enumC767550U8z6;
        EnumC767550U8z[] enumC767550U8zArr = {enumC767550U8z, enumC767550U8z2, enumC767550U8z3, enumC767550U8z4, enumC767550U8z5, enumC767550U8z6};
        LL = enumC767550U8zArr;
        LLILLJJLI = new C2254308sP(enumC767550U8zArr);
    }

    public static EnumC767550U8z[] values() {
        return (EnumC767550U8z[]) LL.clone();
    }

    public static EnumC767550U8z valueOf(String str) {
        return (EnumC767550U8z) C08FF.LIZ(EnumC767550U8z.class, str);
    }

    public EnumC767550U8z(String str, int i) {
    }
}
