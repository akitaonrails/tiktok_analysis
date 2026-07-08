package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0FUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C391040FUw {
    public static final C391040FUw LIZ = new C391040FUw();
    public static final Keva LIZIZ = Keva.getRepo("text_sticker_keva");

    public static void LIZIZ() {
        LIZIZ.storeInt("edit_text_tux_bubble_1", 1);
    }

    public static void LJFF() {
        LIZIZ.storeBoolean("info_sticker_hint_set", true);
    }

    public static boolean LJI() {
        return LIZIZ.getInt("edit_text_tux_bubble_1", 0) == 0;
    }

    public static void LIZ(boolean z) {
        int i = 4;
        if (z) {
            LIZIZ.storeInt("change_text_toast_shown", 4);
            return;
        }
        Keva keva = LIZIZ;
        int i2 = keva.getInt("change_text_toast_shown", 0) + 1;
        if (i2 <= 4) {
            i = i2;
        }
        keva.storeInt("change_text_toast_shown", i);
    }

    public static void LIZJ(boolean z) {
        int i = 4;
        if (z) {
            LIZIZ.storeInt("read_text_toast_shown", 4);
            return;
        }
        Keva keva = LIZIZ;
        int i2 = keva.getInt("read_text_toast_shown", 0) + 1;
        if (i2 <= 4) {
            i = i2;
        }
        keva.storeInt("read_text_toast_shown", i);
    }

    public static void LIZLLL(String str) {
        LIZIZ.storeString("fallback_fonts_config", str);
    }

    public static void LJ(String str) {
        LIZIZ.storeString("fallback_fonts_unzip_path", str);
    }

    public static boolean LJII(int i, String str) {
        Keva keva = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("highlight_hint_should_show");
        sbLIZ.append(str);
        int i2 = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        if (i2 >= i) {
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("highlight_hint_should_show");
        sbLIZ2.append(str);
        keva.storeInt(C2188811AlT.LIZIZ(sbLIZ2), i2 + 1);
        return true;
    }
}
