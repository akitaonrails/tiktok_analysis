package X;

import android.content.Context;
import android.os.Build;
import java.util.List;

/* JADX INFO: renamed from: X.0uHG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1697600uHG {
    @InterfaceC1294060jmO
    public static final String LIZ(int i, boolean z) {
        return i != 1 ? i != 2 ? i != 3 ? "" : z ? "font/TikTok-Display-Bold.otf" : "font/TikTok-Text-Bold.otf" : z ? "font/TikTok-Display-Medium.otf" : "font/TikTok-Text-Medium.otf" : z ? "font/TikTok-Display-Regular.otf" : "font/TikTok-Text-Regular.otf";
    }

    public static final void LIZIZ(Context context) {
        List<String> listLJIIJJI;
        C1697610uHH.LIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "tux_font_cache_v2_enabled", true, false);
        if (Build.VERSION.SDK_INT >= 26) {
            listLJIIJJI = C13BV.INSTANCE;
        } else {
            listLJIIJJI = C1697810uHb.LJIIJJI("font/TikTok-Display-Bold.otf", "font/TikTok-Display-Medium.otf", "font/TikTok-Display-Regular.otf", "font/TikTok-Text-Bold.otf", "font/TikTok-Text-Medium.otf", "font/TikTok-Text-Regular.otf");
        }
        synchronized (new Object() { // from class: X.0uHI
        }) {
            if (context != null) {
                C1301050jxf.LIZ().clear();
                C1301050jxf.LIZ().init(context);
                C1301050jxf.LIZ().LIZIZ(listLJIIJJI);
            }
        }
        C1697630uHJ.LIZLLL(context);
        C1301050jxf.LIZ().LJFF();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C444900HcW LIZJ(int r15, boolean r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1697600uHG.LIZJ(int, boolean, boolean):X.0HcW");
    }
}
