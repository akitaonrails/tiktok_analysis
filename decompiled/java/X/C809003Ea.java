package X;

import android.graphics.drawable.Drawable;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03Ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C809003Ea {
    public static final C809003Ea LIZ = new C809003Ea();

    public static void LIZ(SmartImageView smartImageView, Icon icon) {
        Image imageRequireImageForEcDarkMode;
        int iLIZIZ;
        if (icon != null && (imageRequireImageForEcDarkMode = icon.requireImageForEcDarkMode(smartImageView.getContext())) != null) {
            C03DZ.LIZJ(smartImageView);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            Drawable drawableLIZ = c384050F3z.LIZ(smartImageView.getContext());
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageRequireImageForEcDarkMode);
            c1331670kl3LIZLLL.LJJ = EnumC1338240kve.FIT_CENTER;
            c1331670kl3LIZLLL.LJJIIZI(drawableLIZ);
            c1331670kl3LIZLLL.LJIL(drawableLIZ);
            c1331670kl3LIZLLL.LJJ(smartImageView);
            Integer viewWidth = icon.getViewWidth();
            int iLIZIZ2 = 0;
            if (viewWidth != null) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(viewWidth));
            } else {
                iLIZIZ = 0;
            }
            Integer viewHeight = icon.getViewHeight();
            if (viewHeight != null) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(viewHeight));
            }
            if (iLIZIZ > 0 && iLIZIZ2 > 0) {
                C1744700vVE.LJII(smartImageView, iLIZIZ, iLIZIZ2);
                c1331670kl3LIZLLL.LJIIIIZZ = iLIZIZ;
                c1331670kl3LIZLLL.LJIIIZ = iLIZIZ2;
            }
            c1331670kl3LIZLLL.LJIIJJI();
            return;
        }
        smartImageView.setImageDrawable(null);
        C03DZ.LIZ(smartImageView);
    }
}
