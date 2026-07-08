package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419880GdG {
    public static C416900GWi LIZ(int i, Context context) {
        String strValueOf;
        C416900GWi c416900GWi = null;
        if (context == null || i <= 0) {
            return null;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxAlertBadge, R.attr.xd, 0);
        if (typedArrayObtainStyledAttributes != null) {
            c416900GWi = new C416900GWi(typedArrayObtainStyledAttributes.getInt(R$styleable.TuxAlertBadge__tux_badgeFont, 0), typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAlertBadge__tux_badgeTextColor, -1), typedArrayObtainStyledAttributes.getColor(R$styleable.TuxAlertBadge__tux_badgeBackgroundColor, -16777216), typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxAlertBadge_tux_badgeDotSize, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
            typedArrayObtainStyledAttributes.recycle();
        }
        if (!C0BXV.LIZ()) {
            if (c416900GWi != null) {
                if (i > 9) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(9);
                    sbLIZ.append('+');
                    strValueOf = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strValueOf = String.valueOf(i);
                }
                c416900GWi.LJII = strValueOf;
                c416900GWi.LIZ();
                c416900GWi.setBounds(0, 0, c416900GWi.LJI, c416900GWi.LJFF);
            }
        } else if (c416900GWi != null) {
            c416900GWi.LIZ();
            c416900GWi.setBounds(0, 0, c416900GWi.LJI, c416900GWi.LJFF);
        }
        return c416900GWi;
    }

    public static C419890GdH LIZIZ(Context context, int i, TuxTextView tuxTextView, int i2, int i3) {
        Drawable drawableLIZ;
        int iLIZIZ;
        if (context == null || (drawableLIZ = LIZ(i, context)) == null) {
            return null;
        }
        if (C0BXV.LIZ()) {
            if (tuxTextView == null) {
                return null;
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_down_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            tuxIconDrawableLIZ.setBounds(0, 0, i2, i3);
            C419860GdE c419860GdE = new C419860GdE(tuxIconDrawableLIZ, drawableLIZ);
            if (tuxTextView.getHeight() > 0) {
                iLIZIZ = tuxTextView.getHeight();
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
            }
            c419860GdE.setBounds(0, 0, c419860GdE.getIntrinsicWidth(), iLIZIZ);
            int i4 = C2187451AjH.LIZ;
            C1720106oR.LJI("ProfileInfoNicknameBadgeManager", "width: " + c419860GdE.getIntrinsicWidth() + ", height: " + iLIZIZ);
            drawableLIZ = c419860GdE;
        }
        C419890GdH c419890GdH = new C419890GdH(drawableLIZ, 2);
        c419890GdH.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), 0, C444960Hcc.LIZIZ());
        return c419890GdH;
    }
}
