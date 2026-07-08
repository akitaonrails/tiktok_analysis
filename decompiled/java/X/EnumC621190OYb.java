package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC621190OYb {
    public static final EnumC621190OYb BULLETIN_FRONT_STYLE_DARK;
    public static final EnumC621190OYb BULLETIN_FRONT_STYLE_LIGHT;
    public static final EnumC621190OYb BULLETIN_FRONT_STYLE_NONE;
    public static final /* synthetic */ EnumC621190OYb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC621190OYb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC621190OYb enumC621190OYb = new EnumC621190OYb("BULLETIN_FRONT_STYLE_NONE", 0, 0);
        BULLETIN_FRONT_STYLE_NONE = enumC621190OYb;
        EnumC621190OYb enumC621190OYb2 = new EnumC621190OYb("BULLETIN_FRONT_STYLE_LIGHT", 1, 1);
        BULLETIN_FRONT_STYLE_LIGHT = enumC621190OYb2;
        EnumC621190OYb enumC621190OYb3 = new EnumC621190OYb("BULLETIN_FRONT_STYLE_DARK", 2, 2);
        BULLETIN_FRONT_STYLE_DARK = enumC621190OYb3;
        EnumC621190OYb[] enumC621190OYbArr = {enumC621190OYb, enumC621190OYb2, enumC621190OYb3};
        LLILLJJLI = enumC621190OYbArr;
        LLILLL = new C2254308sP(enumC621190OYbArr);
    }

    public static EnumC621190OYb[] values() {
        return (EnumC621190OYb[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC621190OYb valueOf(String str) {
        return (EnumC621190OYb) C08FF.LIZ(EnumC621190OYb.class, str);
    }

    public EnumC621190OYb(String str, int i, int i2) {
        this.LL = i2;
    }
}
