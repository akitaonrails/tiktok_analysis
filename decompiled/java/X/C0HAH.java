package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.Icon;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HAH, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HAH {
    public static final C0HAH LIZ = new C0HAH();

    public static final ConstraintLayout LIZIZ(Context context, String str, C0HAI c0hai) {
        int iLIZ;
        int iGenerateViewId = View.generateViewId();
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_star_fill);
        Integer numLIZJ = C1308910kAL.LIZJ(c0hai.LJI(), context);
        if (numLIZJ != null) {
            tuxIconView.setTintColor(numLIZJ.intValue());
        }
        tuxIconView.setId(iGenerateViewId);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(c0hai.LIZIZ());
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setIncludeFontPadding(false);
        Integer numLIZJ2 = C1308910kAL.LIZJ(c0hai.LIZJ(), context);
        if (numLIZJ2 != null) {
            iLIZ = numLIZJ2.intValue();
        } else {
            iLIZ = C446980Hfs.LIZ(context, R.color.di);
        }
        tuxTextView.setTextColor(iLIZ);
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(c0hai.LIZLLL());
        c384050F3z.LIZIZ = Integer.valueOf(c0hai.LJIIIZ());
        constraintLayout.setBackground(c384050F3z.LIZ(context));
        constraintLayout.setPadding(c0hai.LJ(), 0, c0hai.LJ(), 0);
        C19ME c19me = new C19ME(c0hai.H2(), c0hai.H2());
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        c19me.setMargins(0, c0hai.LJFF(), 0, 0);
        constraintLayout.addView(tuxIconView, c19me);
        C19ME c19me2 = new C19ME(-2, c0hai.getItemHeight());
        c19me2.setMarginStart(context.getResources().getDimensionPixelSize(R.dimen.ug));
        c19me2.startToEnd = iGenerateViewId;
        c19me2.constrainedWidth = true;
        c19me2.endToEnd = 0;
        c19me2.topToTop = 0;
        c19me2.bottomToBottom = 0;
        constraintLayout.addView(tuxTextView, c19me2);
        return constraintLayout;
    }

    public static void LIZJ(TuxTextView tuxTextView, Drawable drawable, Image image) {
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

    public static final TuxTextView LIZ(Context context, String str, C0HAI c0hai, Icon icon) {
        int iLIZ;
        Image imageLIZIZ;
        C1331670kl3 c1331670kl3LIZLLL;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(c0hai.LIZLLL());
        c384050F3z.LIZIZ = Integer.valueOf(c0hai.LJIIIZ());
        tuxTextView.setBackground(c384050F3z.LIZ(context));
        tuxTextView.setPadding(c0hai.LJ(), 0, c0hai.LJ(), 0);
        tuxTextView.setGravity(16);
        tuxTextView.setIncludeFontPadding(false);
        tuxTextView.setText(str);
        tuxTextView.setTuxFont(c0hai.LIZIZ());
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        Integer numLIZJ = C1308910kAL.LIZJ(c0hai.LIZJ(), context);
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
                C0HAH c0hah = LIZ;
                GradientDrawable gradientDrawable = new GradientDrawable();
                c0hah.getClass();
                LIZJ(tuxTextView, gradientDrawable, imageLIZIZ);
                c1331670kl3LIZLLL.LJJIIJ(new C463070IDx(context, tuxTextView, imageLIZIZ, 0));
            }
        }
        return tuxTextView;
    }
}
