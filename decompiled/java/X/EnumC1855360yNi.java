package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yNi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1855360yNi {
    public static final EnumC1855360yNi CANCEL_TIP;
    public static final EnumC1855360yNi DEFAULT;
    public static final EnumC1855360yNi DEFAULT_TIP;
    public static final /* synthetic */ EnumC1855360yNi[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1855360yNi LONG_PRESS_TIP;
    public static final EnumC1855360yNi MSG_TOO_SHORT_TIP;
    public static final EnumC1855360yNi UN_RECOGNIZE_TIP;
    public final int LL;
    public final int LLILLJJLI;
    public final Integer LLILLL;

    public static InterfaceC2044707zh<EnumC1855360yNi> getEntries() {
        return LLILZIL;
    }

    static {
        int i = 0;
        EnumC1855360yNi enumC1855360yNi = new EnumC1855360yNi(i, i, i, LivePreviewCTASmartDisplayManager.DEFAULT);
        DEFAULT = enumC1855360yNi;
        int i2 = R.attr.a1k;
        EnumC1855360yNi enumC1855360yNi2 = new EnumC1855360yNi(1, 2131849840, i2, "DEFAULT_TIP");
        DEFAULT_TIP = enumC1855360yNi2;
        EnumC1855360yNi enumC1855360yNi3 = new EnumC1855360yNi(2, 2131849842, i2, "LONG_PRESS_TIP");
        LONG_PRESS_TIP = enumC1855360yNi3;
        int i3 = R.attr.zs;
        EnumC1855360yNi enumC1855360yNi4 = new EnumC1855360yNi(3, 2131849841, i3, "CANCEL_TIP");
        CANCEL_TIP = enumC1855360yNi4;
        EnumC1855360yNi enumC1855360yNi5 = new EnumC1855360yNi(4, 2131849843, R.attr.zs, Integer.valueOf(R.raw.icon_exclamation_mark_triangle_fill), "UN_RECOGNIZE_TIP");
        UN_RECOGNIZE_TIP = enumC1855360yNi5;
        EnumC1855360yNi enumC1855360yNi6 = new EnumC1855360yNi(5, 2131849844, i3, "MSG_TOO_SHORT_TIP");
        MSG_TOO_SHORT_TIP = enumC1855360yNi6;
        EnumC1855360yNi[] enumC1855360yNiArr = {enumC1855360yNi, enumC1855360yNi2, enumC1855360yNi3, enumC1855360yNi4, enumC1855360yNi5, enumC1855360yNi6};
        LLILZ = enumC1855360yNiArr;
        LLILZIL = new C2254308sP(enumC1855360yNiArr);
    }

    public static EnumC1855360yNi[] values() {
        return (EnumC1855360yNi[]) LLILZ.clone();
    }

    public final int getColorAttrRes() {
        return this.LLILLJJLI;
    }

    public final Integer getIconRes() {
        return this.LLILLL;
    }

    public final int getTextRes() {
        return this.LL;
    }

    public static EnumC1855360yNi valueOf(String str) {
        return (EnumC1855360yNi) C08FF.LIZ(EnumC1855360yNi.class, str);
    }

    public /* synthetic */ EnumC1855360yNi(int i, int i2, int i3, String str) {
        this(i, i2, i3, null, str);
    }

    public EnumC1855360yNi(int i, int i2, int i3, Integer num, String str) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = num;
    }
}
