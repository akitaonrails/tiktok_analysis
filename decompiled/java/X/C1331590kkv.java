package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.lighten.loader.FrescoImageLoaderImpl;

/* JADX INFO: renamed from: X.0kkv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331590kkv {
    public static C1331070kk5 LIZ(ImageView imageView, C1331510kkn c1331510kkn) {
        if (imageView != null && c1331510kkn != null) {
            C1331100kk8 c1331100kk8 = new C1331100kk8();
            C1331730kl9 c1331730kl9 = c1331510kkn.LJJI;
            if (c1331730kl9 != null) {
                c1331100kk8 = FrescoImageLoaderImpl.circleConvertRoundParams(c1331100kk8, c1331730kl9);
            }
            Resources resources = imageView.getResources();
            C1331090kk7 c1331090kk7 = new C1331090kk7(resources);
            c1331090kk7.LJIILJJIL = c1331510kkn.LJIJJLI;
            c1331090kk7.LJIIZILJ = c1331100kk8;
            EnumC1338240kve enumC1338240kve = c1331510kkn.LJJ;
            if (enumC1338240kve != null) {
                c1331090kk7.LJIIL = C1323010kX5.LIZ(enumC1338240kve);
            }
            int i = c1331510kkn.LJIILL;
            if (i > 0) {
                c1331090kk7.LJ = resources.getDrawable(i);
                EnumC1338240kve enumC1338240kve2 = c1331510kkn.LJIIZILJ;
                if (enumC1338240kve2 != null) {
                    c1331090kk7.LJFF = C1323010kX5.LIZ(enumC1338240kve2);
                }
            } else {
                Drawable drawable = c1331510kkn.LJIILLIIL;
                if (drawable != null) {
                    c1331090kk7.LJ = drawable;
                    EnumC1338240kve enumC1338240kve3 = c1331510kkn.LJIIZILJ;
                    if (enumC1338240kve3 != null) {
                        c1331090kk7.LJFF = C1323010kX5.LIZ(enumC1338240kve3);
                    }
                }
            }
            int i2 = c1331510kkn.LJIJ;
            if (i2 > 0) {
                c1331090kk7.LJIIIIZZ = resources.getDrawable(i2);
                EnumC1338240kve enumC1338240kve4 = c1331510kkn.LJIJI;
                if (enumC1338240kve4 != null) {
                    c1331090kk7.LJIIIZ = C1323010kX5.LIZ(enumC1338240kve4);
                }
            } else {
                Drawable drawable2 = c1331510kkn.LJIJJ;
                if (drawable2 != null) {
                    c1331090kk7.LJIIIIZZ = drawable2;
                    EnumC1338240kve enumC1338240kve5 = c1331510kkn.LJIJI;
                    if (enumC1338240kve5 != null) {
                        c1331090kk7.LJIIIZ = C1323010kX5.LIZ(enumC1338240kve5);
                    }
                }
            }
            Drawable drawable3 = c1331510kkn.LJJJ;
            if (drawable3 != null) {
                c1331090kk7.LJI = drawable3;
            }
            int i3 = c1331510kkn.LJIILJJIL;
            if (i3 >= 0) {
                c1331090kk7.LIZJ = i3;
            }
            return c1331090kk7.LIZ();
        }
        return null;
    }
}
