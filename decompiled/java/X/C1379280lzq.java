package X;

import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lzq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1379280lzq {
    public static boolean LIZJ() {
        EnumC584570MwJ enumC584570MwJXo1;
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(null);
        if (iAutoAScrollAbilityLIZIZ == null || (enumC584570MwJXo1 = iAutoAScrollAbilityLIZIZ.xo1()) == null) {
            enumC584570MwJXo1 = EnumC584570MwJ.AUTO_SCROLL_STATE_STOP;
        }
        return enumC584570MwJXo1 == EnumC584570MwJ.AUTO_SCROLL_STATE_STOP;
    }

    public static int LIZ() {
        if (LIZJ()) {
            C19252910Tv.LIZIZ.LIZLLL().LJIILL().LJLLLLLL(R.raw.icon_auto_scroll_fill);
            return R.raw.icon_auto_scroll_fill;
        }
        C19252910Tv.LIZIZ.LIZLLL().LJIILL().LJLLLLLL(R.raw.icon_auto_scroll_off_fill);
        return R.raw.icon_auto_scroll_off_fill;
    }

    public static int LIZIZ() {
        if (LIZJ()) {
            C19252910Tv.LIZIZ.LIZLLL().LJIILL().LJLLLLLL(R.raw.icon_auto_scroll);
            return R.raw.icon_auto_scroll;
        }
        C19252910Tv.LIZIZ.LIZLLL().LJIILL().LJLLLLLL(R.raw.icon_auto_scroll_off);
        return R.raw.icon_auto_scroll_off;
    }
}
