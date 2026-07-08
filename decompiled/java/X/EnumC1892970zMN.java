package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zMN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1892970zMN {
    public static final EnumC1892970zMN LLILZ;
    public static final EnumC1892970zMN LLILZIL;
    public static final EnumC1892970zMN LLILZLL;
    public static final /* synthetic */ EnumC1892970zMN[] LLIZ;
    public final String LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    static {
        EnumC1892970zMN enumC1892970zMN = new EnumC1892970zMN(0, 2131847169, R.raw.icon_compass, "VIEW_ON_BROWSER", "view_on_browser");
        LLILZ = enumC1892970zMN;
        EnumC1892970zMN enumC1892970zMN2 = new EnumC1892970zMN(1, 2131847172, R.raw.icon_arrow_clockwise, "REFRESH", "refresh");
        LLILZIL = enumC1892970zMN2;
        EnumC1892970zMN enumC1892970zMN3 = new EnumC1892970zMN(2, 2131847164, R.raw.icon_link, "COPY_LINK", "copy_link");
        LLILZLL = enumC1892970zMN3;
        EnumC1892970zMN[] enumC1892970zMNArr = {enumC1892970zMN, enumC1892970zMN2, enumC1892970zMN3};
        LLIZ = enumC1892970zMNArr;
        new C2254308sP(enumC1892970zMNArr);
    }

    public static EnumC1892970zMN[] values() {
        return (EnumC1892970zMN[]) LLIZ.clone();
    }

    public static EnumC1892970zMN valueOf(String str) {
        return (EnumC1892970zMN) C08FF.LIZ(EnumC1892970zMN.class, str);
    }

    public EnumC1892970zMN(int i, int i2, int i3, String str, String str2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
    }
}
