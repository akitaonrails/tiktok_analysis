package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0oKZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1469010oKZ {
    LLILZ(360, "View360", "v360"),
    LLILZIL(480, "View480", "v480"),
    LLILZLL(540, "View540", "v540"),
    LLIZ(720, "View720", "v720"),
    LLIZLLLIL(864, "View864", "v864"),
    LLJ(960, "View960", "v960"),
    LLJI(1080, "View1080", "v1080"),
    LLJIJIL(1440, "View2k", "v2k"),
    LLJILJIL(2160, "View4k", "v4k");

    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public static EnumC1469010oKZ LIZJ(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        EnumC1469010oKZ enumC1469010oKZ = LLILZLL;
        if (zIsEmpty) {
            return enumC1469010oKZ;
        }
        if ("v360".equals(str)) {
            return LLILZ;
        }
        if ("v480".equals(str)) {
            return LLILZIL;
        }
        if ("v540".equals(str)) {
            return enumC1469010oKZ;
        }
        if ("v720".equals(str)) {
            return LLIZ;
        }
        if ("v864".equals(str)) {
            return LLIZLLLIL;
        }
        if ("v960".equals(str)) {
            return LLJ;
        }
        if ("v1080".equals(str)) {
            return LLJI;
        }
        if ("v2k".equals(str)) {
            return LLJIJIL;
        }
        if ("v4k".equals(str)) {
            return LLJILJIL;
        }
        return enumC1469010oKZ;
    }

    public static EnumC1469010oKZ valueOf(String str) {
        return (EnumC1469010oKZ) C08FF.LIZ(EnumC1469010oKZ.class, str);
    }

    EnumC1469010oKZ(int i, String str, String str2) {
        this.LL = str2;
        this.LLILLJJLI = i;
        this.LLILLL = i;
    }
}
