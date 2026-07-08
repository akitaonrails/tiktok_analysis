package X;

import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361230EEf {
    public static Drawable LIZ;

    public static void LIZ(C19EG c19eg, String str, InterfaceC359850E8x interfaceC359850E8x) {
        C361980EHc c361980EHcLJ;
        boolean z;
        int iLIZ;
        int iLIZ2;
        int iLIZ3;
        int iLIZ4;
        if (interfaceC359850E8x != null) {
            c361980EHcLJ = interfaceC359850E8x.LJ("bottom_item_edit_background");
        } else {
            c361980EHcLJ = null;
        }
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (c361980EHcLJ != null) {
                if (c361980EHcLJ.LIZIZ("IMAGE_URI") != null) {
                    c361980EHcLJ.LJIIJJI.remove("IMAGE_URI");
                }
                if (c361980EHcLJ.LIZIZ("small_icon_res_id") != null) {
                    c361980EHcLJ.LJIIJJI.remove("small_icon_res_id");
                }
                if (interfaceC359850E8x != null) {
                    interfaceC359850E8x.LJIIJJI(c361980EHcLJ);
                    return;
                }
                return;
            }
            return;
        }
        if (c361980EHcLJ == null) {
            return;
        }
        Object objLIZIZ = c361980EHcLJ.LIZIZ("IMAGE_URI");
        if (objLIZIZ == null || !Intrinsics.LJFF(objLIZIZ, str)) {
            c361980EHcLJ.LJIIJJI.put("IMAGE_URI", str);
        }
        if (c361980EHcLJ.LIZIZ("small_icon_res_id") == null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(c19eg, R.style.y0);
            if (LIZ == null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                if (C0EJA.LJI()) {
                    iLIZ = C0EGK.LIZ(10);
                } else {
                    iLIZ = C0EGK.LIZ(13);
                }
                c419910GdJ.LIZIZ = iLIZ;
                if (C0EJA.LJI()) {
                    iLIZ2 = C0EGK.LIZ(10);
                } else {
                    iLIZ2 = C0EGK.LIZ(13);
                }
                c419910GdJ.LIZJ = iLIZ2;
                c419910GdJ.LIZ = R.raw.icon_x_mark_fill_tiny;
                c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(contextThemeWrapper);
                C384050F3z c384050F3z = new C384050F3z();
                if (C0EJA.LJI()) {
                    iLIZ3 = C0EGK.LIZ(12);
                } else {
                    iLIZ3 = C0EGK.LIZ(14);
                }
                c384050F3z.LJII = iLIZ3;
                if (C0EJA.LJI()) {
                    iLIZ4 = C0EGK.LIZ(12);
                } else {
                    iLIZ4 = C0EGK.LIZ(14);
                }
                c384050F3z.LJI = iLIZ4;
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.zh);
                c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
                LIZ = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(contextThemeWrapper));
            }
            Drawable drawable = LIZ;
            if (drawable != null) {
                c361980EHcLJ.LJIIJJI.put("small_icon_res_id", drawable);
            }
        }
        if (interfaceC359850E8x == null) {
            return;
        }
        interfaceC359850E8x.LJIIJJI(c361980EHcLJ);
    }
}
