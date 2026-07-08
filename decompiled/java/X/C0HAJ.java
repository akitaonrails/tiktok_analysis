package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HAJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HAJ {
    public static final C0HAJ LIZ = new C0HAJ();

    public static void LIZIZ(TuxTextView tuxTextView, Drawable drawable, Image image) {
        int iLIZIZ;
        int iLIZIZ2;
        Integer width = image.getWidth();
        if (width != null) {
            iLIZIZ = width.intValue();
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        }
        Integer height = image.getHeight();
        if (height != null) {
            iLIZIZ2 = height.intValue();
        } else {
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        }
        drawable.setBounds(0, 0, iLIZIZ, iLIZIZ2);
        tuxTextView.setCompoundDrawables(drawable, null, null, null);
        tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
    }

    public static final TuxTextView LIZ(Context context, String str, C0HAK c0hak, Icon icon) {
        int iLIZ;
        Image imageLIZIZ;
        C1331670kl3 c1331670kl3LIZLLL;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(c0hak.LIZLLL());
        c384050F3z.LIZIZ = Integer.valueOf(c0hak.LJIIIZ());
        tuxTextView.setBackground(c384050F3z.LIZ(context));
        tuxTextView.setPadding(c0hak.LJ(), 0, c0hak.LJ(), 0);
        tuxTextView.setGravity(16);
        tuxTextView.setIncludeFontPadding(false);
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(c0hak.LIZIZ());
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        Integer numLIZJ = C1308910kAL.LIZJ(c0hak.LIZJ(), context);
        if (numLIZJ != null) {
            iLIZ = numLIZJ.intValue();
        } else {
            iLIZ = C446980Hfs.LIZ(context, R.color.di);
        }
        tuxTextView.setTextColor(iLIZ);
        if (icon != null && (imageLIZIZ = C038L.LIZIZ(icon, context)) != null) {
            if (imageLIZIZ.getUrls() != null) {
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                C03IT c03it = new C03IT(imageLIZIZ.getUrls());
                c1326790kdB.getClass();
                c1331670kl3LIZLLL = C1326790kdB.LIZLLL(c03it);
            } else if (imageLIZIZ.getUri() != null) {
                C1326790kdB c1326790kdB2 = C1326790kdB.LIZ;
                String uri = imageLIZIZ.getUri();
                c1326790kdB2.getClass();
                c1331670kl3LIZLLL = C1326790kdB.LIZLLL(uri);
            }
            if (c1331670kl3LIZLLL != null) {
                C0HAJ c0haj = LIZ;
                GradientDrawable gradientDrawable = new GradientDrawable();
                c0haj.getClass();
                LIZIZ(tuxTextView, gradientDrawable, imageLIZIZ);
                c1331670kl3LIZLLL.LJJIIJ(new C463070IDx(context, tuxTextView, imageLIZIZ, 1));
            }
        }
        return tuxTextView;
    }
}
