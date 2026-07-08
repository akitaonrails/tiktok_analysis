package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* JADX INFO: renamed from: X.0GoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426750GoL {
    public static final Rect LIZ = new Rect();

    public static final boolean LJFF() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    public static final void LIZJ(View view) {
        View.OnLayoutChangeListener onLayoutChangeListener;
        Object tag = view.getTag(R.id.yzp);
        if ((tag instanceof View.OnLayoutChangeListener) && (onLayoutChangeListener = (View.OnLayoutChangeListener) tag) != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        view.getOverlay().clear();
    }

    public static final boolean LIZLLL(Context context) {
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(View view) {
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public static void LJI(View view) {
        view.setImportantForAccessibility(2);
        HandlerHook.viewPostDelay(view, new RunnableC514801zW(view, 163), 1000L);
    }

    public static final LayerDrawable LJIILIIL(Drawable drawable, Drawable drawable2) {
        return new LayerDrawable(new Drawable[]{drawable2, drawable});
    }

    public static final void LIZIZ(C416900GWi c416900GWi, View view, float f, float f2, C416900GWi c416900GWi2) {
        float fWidth;
        if (view.getLayoutDirection() == 1) {
            fWidth = f - f2;
        } else {
            view.getDrawingRect(LIZ);
            fWidth = ((r0.width() - f) - c416900GWi2.LJI) + f2;
        }
        c416900GWi.LJIIIIZZ = fWidth;
    }

    public static final void LJII(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LJIIIIZZ((ViewGroup.MarginLayoutParams) layoutParams, view.getContext(), num, num2, num3, num4, z);
        }
        C786410Ut5.W5(view, layoutParams);
    }

    public static final void LJIIJJI(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z) {
        boolean z2;
        int paddingLeft;
        int paddingTop;
        int paddingRight;
        int paddingBottom;
        if ((num != null || num3 != null) && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (num != null) {
            paddingLeft = num.intValue();
        } else {
            paddingLeft = view.getPaddingLeft();
        }
        if (num2 != null) {
            paddingTop = num2.intValue();
        } else {
            paddingTop = view.getPaddingTop();
        }
        if (num3 != null) {
            paddingRight = num3.intValue();
        } else {
            paddingRight = view.getPaddingRight();
        }
        if (num4 != null) {
            paddingBottom = num4.intValue();
        } else {
            paddingBottom = view.getPaddingBottom();
        }
        if (z2 && LIZLLL(view.getContext())) {
            view.setPadding(paddingRight, paddingTop, paddingLeft, paddingBottom);
        } else {
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    public static /* synthetic */ void LJIIL(View view, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        boolean z;
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        } else {
            z = false;
        }
        LJIIJJI(view, num, num2, num3, num4, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(android.view.ViewGroup.MarginLayoutParams r2, android.content.Context r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.Integer r7, boolean r8) {
        /*
            if (r4 != 0) goto L4
            if (r6 == 0) goto L55
        L4:
            if (r8 == 0) goto L55
            r1 = 1
            boolean r0 = LIZLLL(r3)
            if (r0 == 0) goto L56
            if (r4 == 0) goto L15
            int r0 = r4.intValue()
            r2.rightMargin = r0
        L15:
            if (r6 == 0) goto L1d
            int r0 = r6.intValue()
            r2.leftMargin = r0
        L1d:
            if (r5 == 0) goto L25
            int r0 = r5.intValue()
            r2.topMargin = r0
        L25:
            if (r7 == 0) goto L2d
            int r0 = r7.intValue()
            r2.bottomMargin = r0
        L2d:
            if (r1 == 0) goto L42
            if (r4 == 0) goto L38
            int r0 = r4.intValue()
            r2.setMarginStart(r0)
        L38:
            if (r6 == 0) goto L41
            int r0 = r6.intValue()
            r2.setMarginEnd(r0)
        L41:
            return
        L42:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == 0) goto L4c
            r4.intValue()
            r2.setMarginStart(r0)
        L4c:
            if (r6 == 0) goto L41
            r6.intValue()
            r2.setMarginEnd(r0)
            return
        L55:
            r1 = 0
        L56:
            if (r4 == 0) goto L5e
            int r0 = r4.intValue()
            r2.leftMargin = r0
        L5e:
            if (r6 == 0) goto L1d
            int r0 = r6.intValue()
            r2.rightMargin = r0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C426750GoL.LJIIIIZZ(android.view.ViewGroup$MarginLayoutParams, android.content.Context, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean):void");
    }

    public static /* synthetic */ void LJIIIZ(View view, Integer num, Integer num2, Integer num3, Integer num4, boolean z, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        LJII(view, num, num2, num3, num4, z);
    }

    public static /* synthetic */ void LJIIJ(ViewGroup.MarginLayoutParams marginLayoutParams, Context context, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        boolean z;
        Integer num5 = num3;
        Integer num6 = num2;
        Integer num7 = num;
        Integer num8 = null;
        if ((i & 2) != 0) {
            num7 = null;
        }
        if ((i & 4) != 0) {
            num6 = null;
        }
        if ((i & 8) != 0) {
            num5 = null;
        }
        if ((i & 16) == 0) {
            num8 = num4;
        }
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        LJIIIIZZ(marginLayoutParams, context, num7, num6, num5, num8, z);
    }

    public static void LIZ(final View view, int i, int i2, int i3, int i4, float f, final float f2, String str, int i5, Integer num, Integer num2, int i6) {
        InterfaceC426790GoP c1914007ec;
        final float fLIZIZ;
        if ((i6 & 2) != 0) {
            i2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        if ((i6 & 4) != 0) {
            i3 = 0;
        }
        if ((i6 & 8) != 0) {
            i4 = 2;
        }
        if ((i6 & 16) != 0) {
            f = 0.0f;
        }
        if ((i6 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i6 & 64) != 0) {
            str = "";
        }
        if ((i6 & 128) != 0) {
            i5 = 0;
        }
        if ((i6 & 256) != 0) {
            num = null;
        }
        if ((i6 & 512) != 0) {
            num2 = null;
        }
        view.getOverlay().clear();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        c1914007ec = null;
                    } else {
                        c1914007ec = new C07Y3(str);
                    }
                } else {
                    c1914007ec = new C426800GoQ(i5);
                }
            } else {
                c1914007ec = new C426780GoO(i4, i3);
            }
        } else {
            c1914007ec = new C1914007ec(i2);
        }
        final C416900GWi c416900GWiLIZIZ = C426760GoM.LIZIZ(view.getContext(), null, 62);
        c416900GWiLIZIZ.LJ = i;
        c416900GWiLIZIZ.LIZJ = i2;
        if ((c1914007ec instanceof C426800GoQ) && i5 != 0) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i5;
            c419910GdJ.LIZLLL = Integer.valueOf(c416900GWiLIZIZ.LIZ);
            c419910GdJ.LIZIZ = 44;
            c419910GdJ.LIZJ = 44;
            c416900GWiLIZIZ.LIZLLL = c419910GdJ.LIZ(view.getContext());
        } else if (c1914007ec != null) {
            c416900GWiLIZIZ.LJII = C426760GoM.LIZJ(c1914007ec);
        }
        if (num != null) {
            c416900GWiLIZIZ.LIZIZ = num.intValue();
        }
        if (num2 != null) {
            c416900GWiLIZIZ.LIZ = num2.intValue();
        }
        c416900GWiLIZIZ.LIZ();
        if (i == 0) {
            fLIZIZ = i2 / 2.0f;
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(6);
        }
        c416900GWiLIZIZ.LJIIIZ = f - fLIZIZ;
        LIZIZ(c416900GWiLIZIZ, view, f2, fLIZIZ, c416900GWiLIZIZ);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: X.0GoR
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                C416900GWi c416900GWi = c416900GWiLIZIZ;
                C426750GoL.LIZIZ(c416900GWi, view, f2, fLIZIZ, c416900GWi);
            }
        };
        view.setTag(R.id.yzp, onLayoutChangeListener);
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        view.getOverlay().add(c416900GWiLIZIZ);
    }
}
