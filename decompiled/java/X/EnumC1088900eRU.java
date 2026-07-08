package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.0eRU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1088900eRU {
    public static final EnumC1088900eRU ICON;
    public static final EnumC1088900eRU ICON_LAND;
    public static final EnumC1088900eRU ICON_TITLE_HORIZONTAL;
    public static final EnumC1088900eRU ICON_TITLE_HORIZONTAL_ARROW;
    public static final EnumC1088900eRU ICON_TITLE_HORIZONTAL_ARROW_OPT;
    public static final EnumC1088900eRU ICON_TITLE_HORIZONTAL_ARROW_OPT_LIVE_HOST;
    public static final EnumC1088900eRU ICON_WITH_TEXT;
    public static final EnumC1088900eRU ICON_WITH_TEXT_EFFECT;
    public static final /* synthetic */ EnumC1088900eRU[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final ViewGroup.LayoutParams LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1088900eRU> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1088900eRU enumC1088900eRU = new EnumC1088900eRU("ICON", 0, R.layout.h5g, new ViewGroup.MarginLayoutParams((int) C497740JfY.LIZIZ(44.0f), (int) C497740JfY.LIZIZ(56.0f)));
        ICON = enumC1088900eRU;
        EnumC1088900eRU enumC1088900eRU2 = new EnumC1088900eRU("ICON_WITH_TEXT", 1, R.layout.h5i, new ViewGroup.MarginLayoutParams((int) C497740JfY.LIZIZ(44.0f), (int) C497740JfY.LIZIZ(56.0f)));
        ICON_WITH_TEXT = enumC1088900eRU2;
        EnumC1088900eRU enumC1088900eRU3 = new EnumC1088900eRU("ICON_TITLE_HORIZONTAL", 2, R.layout.h5p, new ViewGroup.LayoutParams(-1, (int) C497740JfY.LIZIZ(48.0f)));
        ICON_TITLE_HORIZONTAL = enumC1088900eRU3;
        EnumC1088900eRU enumC1088900eRU4 = new EnumC1088900eRU("ICON_TITLE_HORIZONTAL_ARROW", 3, R.layout.h5q, new ViewGroup.LayoutParams(-1, (int) C497740JfY.LIZIZ(48.0f)));
        ICON_TITLE_HORIZONTAL_ARROW = enumC1088900eRU4;
        EnumC1088900eRU enumC1088900eRU5 = new EnumC1088900eRU("ICON_TITLE_HORIZONTAL_ARROW_OPT", 4, R.layout.h5l, new ViewGroup.LayoutParams(-1, (int) C497740JfY.LIZIZ(48.0f)));
        ICON_TITLE_HORIZONTAL_ARROW_OPT = enumC1088900eRU5;
        EnumC1088900eRU enumC1088900eRU6 = new EnumC1088900eRU("ICON_TITLE_HORIZONTAL_ARROW_OPT_LIVE_HOST", 5, R.layout.f916h5m, new ViewGroup.LayoutParams(-1, (int) C497740JfY.LIZIZ(48.0f)));
        ICON_TITLE_HORIZONTAL_ARROW_OPT_LIVE_HOST = enumC1088900eRU6;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) C497740JfY.LIZIZ(36.0f), (int) C497740JfY.LIZIZ(64.0f));
        if (C497740JfY.LJJ()) {
            marginLayoutParams.rightMargin = (int) C497740JfY.LIZIZ(12.0f);
        } else {
            marginLayoutParams.leftMargin = (int) C497740JfY.LIZIZ(12.0f);
        }
        EnumC1088900eRU enumC1088900eRU7 = new EnumC1088900eRU("ICON_LAND", 6, R.layout.h5f, marginLayoutParams);
        ICON_LAND = enumC1088900eRU7;
        EnumC1088900eRU enumC1088900eRU8 = new EnumC1088900eRU("ICON_WITH_TEXT_EFFECT", 7, R.layout.h5k, new ViewGroup.MarginLayoutParams((C497740JfY.LJIIZILJ() - ((int) C497740JfY.LIZIZ(17.0f))) / 4, -2));
        ICON_WITH_TEXT_EFFECT = enumC1088900eRU8;
        EnumC1088900eRU[] enumC1088900eRUArr = {enumC1088900eRU, enumC1088900eRU2, enumC1088900eRU3, enumC1088900eRU4, enumC1088900eRU5, enumC1088900eRU6, enumC1088900eRU7, enumC1088900eRU8};
        LLILLL = enumC1088900eRUArr;
        LLILZ = new C2254308sP(enumC1088900eRUArr);
    }

    public static EnumC1088900eRU[] values() {
        return (EnumC1088900eRU[]) LLILLL.clone();
    }

    public final boolean getHasText() {
        return this == ICON_WITH_TEXT || this == ICON_WITH_TEXT_EFFECT;
    }

    public final boolean getHasTitle() {
        return this == ICON_TITLE_HORIZONTAL || this == ICON_TITLE_HORIZONTAL_ARROW || this == ICON_TITLE_HORIZONTAL_ARROW_OPT || this == ICON_TITLE_HORIZONTAL_ARROW_OPT_LIVE_HOST;
    }

    public final boolean isBottomToolbar() {
        return this == ICON || this == ICON_WITH_TEXT || this == ICON_LAND;
    }

    public final boolean isPopup() {
        return this == ICON_TITLE_HORIZONTAL || this == ICON_TITLE_HORIZONTAL_ARROW || this == ICON_TITLE_HORIZONTAL_ARROW_OPT || this == ICON_WITH_TEXT_EFFECT || this == ICON_TITLE_HORIZONTAL_ARROW_OPT_LIVE_HOST;
    }

    public final int getLayoutId() {
        return this.LL;
    }

    public final ViewGroup.LayoutParams getLayoutParams() {
        return this.LLILLJJLI;
    }

    public static EnumC1088900eRU valueOf(String str) {
        return (EnumC1088900eRU) C08FF.LIZ(EnumC1088900eRU.class, str);
    }

    public EnumC1088900eRU(String str, int i, int i2, ViewGroup.LayoutParams layoutParams) {
        this.LL = i2;
        this.LLILLJJLI = layoutParams;
    }
}
