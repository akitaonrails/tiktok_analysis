package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC094600Xg {
    public static final EnumC094600Xg DEFAULT_STYLE;
    public static final EnumC094600Xg FONT_STYLE_1;
    public static final /* synthetic */ EnumC094600Xg[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC094600Xg> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC094600Xg enumC094600Xg = new EnumC094600Xg("DEFAULT_STYLE", 0);
        DEFAULT_STYLE = enumC094600Xg;
        EnumC094600Xg enumC094600Xg2 = new EnumC094600Xg("FONT_STYLE_1", 1);
        FONT_STYLE_1 = enumC094600Xg2;
        EnumC094600Xg[] enumC094600XgArr = {enumC094600Xg, enumC094600Xg2};
        LL = enumC094600XgArr;
        LLILLJJLI = new C2254308sP(enumC094600XgArr);
    }

    public static EnumC094600Xg[] values() {
        return (EnumC094600Xg[]) LL.clone();
    }

    public static EnumC094600Xg valueOf(String str) {
        return (EnumC094600Xg) C08FF.LIZ(EnumC094600Xg.class, str);
    }

    public EnumC094600Xg(String str, int i) {
    }
}
