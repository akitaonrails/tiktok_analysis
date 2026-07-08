package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GZA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZA {
    public static final Rect LIZ = new Rect();

    public static final void LIZIZ(View view) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        Object tag = view.getTag(R.id.yzp);
        if ((tag instanceof View.OnLayoutChangeListener) && (onLayoutChangeListener = (View.OnLayoutChangeListener) tag) != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        view.getOverlay().clear();
    }

    public static final void LIZ(final View view, int i, float f, final float f2) {
        String strValueOf;
        float fWidth;
        view.getOverlay().clear();
        Context context = view.getContext();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.LiveAlertBadge, 0, R.style.jn);
        final C416880GWg c416880GWg = new C416880GWg(context, typedArrayObtainStyledAttributes.getColor(R$styleable.LiveAlertBadge_live_badgeTextColor, -1), typedArrayObtainStyledAttributes.getColor(R$styleable.LiveAlertBadge_live_badgeBackgroundColor, -16777216), typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.LiveAlertBadge_live_badgeDotSize, iLIZIZ));
        typedArrayObtainStyledAttributes.recycle();
        c416880GWg.LIZJ = 0;
        int i2 = 1;
        char c = 1;
        while (true) {
            i2 *= 10;
            if (c == 2) {
                break;
            } else {
                c = 2;
            }
        }
        int i3 = i2 - 1;
        if (i > i3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i3);
            sbLIZ.append('+');
            strValueOf = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strValueOf = String.valueOf(i);
        }
        c416880GWg.LJFF = strValueOf;
        int length = strValueOf.length();
        if (length != 0) {
            if (length != 1) {
                c416880GWg.LIZLLL = (int) Math.ceil(c416880GWg.LJIIL);
                c416880GWg.LJ = (int) Math.ceil((((double) c416880GWg.LJIIL) * 0.6666666666666666d) + ((double) c416880GWg.LJIIIIZZ.measureText(c416880GWg.LJFF)));
            } else {
                c416880GWg.LJ = (int) Math.ceil(c416880GWg.LJIIL);
                c416880GWg.LIZLLL = (int) Math.ceil(c416880GWg.LJIIL);
            }
        } else {
            int i4 = c416880GWg.LIZJ;
            c416880GWg.LJ = i4;
            c416880GWg.LIZLLL = i4;
        }
        final float fLIZIZ = C418440Gaw.LIZIZ(8);
        c416880GWg.LJII = f - fLIZIZ;
        if (C497740JfY.LJJ()) {
            fWidth = f2 - fLIZIZ;
        } else {
            view.getDrawingRect(LIZ);
            fWidth = ((r0.width() - f2) - c416880GWg.LJ) + fLIZIZ;
        }
        c416880GWg.LJI = fWidth;
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: X.0GZB
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
                float fWidth2;
                C416880GWg c416880GWg2 = c416880GWg;
                float f3 = f2;
                float f4 = fLIZIZ;
                View view3 = view;
                if (C497740JfY.LJJ()) {
                    fWidth2 = f3 - f4;
                } else {
                    view3.getDrawingRect(C0GZA.LIZ);
                    fWidth2 = ((r0.width() - f3) - c416880GWg2.LJ) + f4;
                }
                c416880GWg2.LJI = fWidth2;
            }
        };
        view.setTag(R.id.yzp, onLayoutChangeListener);
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        view.getOverlay().add(c416880GWg);
    }
}
