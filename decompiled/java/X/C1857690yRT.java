package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS126S1100000_12;
import kotlin.jvm.internal.AwS128S1200000_12;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yRT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857690yRT {
    public static final int LJIIJ(int i) {
        Integer numLIZJ;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null && (numLIZJ = C1308910kAL.LIZJ(i, topActivity)) != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    public static final boolean LJIIJJI(Context context) {
        Activity activityLIZ;
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || activityLIZ.isDestroyed() || activityLIZ.isFinishing()) {
            return false;
        }
        return true;
    }

    public static final int LJIIIZ(float f, int i) {
        return Color.argb(C814420VxA.LIZIZ(Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static void LJIIL(C1856470yPV c1856470yPV, ViewGroup viewGroup) {
        try {
            if (c1856470yPV.getParent() == null) {
                viewGroup.addView(c1856470yPV, -1);
            }
            if (!Intrinsics.LJFF(c1856470yPV.getParent(), viewGroup)) {
                ViewParent parent = c1856470yPV.getParent();
                if (parent != null && (parent instanceof ViewGroup)) {
                    C786410Ut5.LJJJLZIJ(c1856470yPV, (ViewGroup) parent);
                }
                viewGroup.addView(c1856470yPV, -1);
                C189200o6.m2constructorimpl(Unit.LIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LJIILJJIL(View view, Float f) {
        if (view != null) {
            view.setOutlineProvider(new C1387210mCd(f, null, null, null, null));
            view.setClipToOutline(true);
        }
    }

    public static final void LIZIZ(ViewGroup viewGroup, int i, Function2<? super ViewGroup, ? super Context, ? extends View> function2) {
        if (viewGroup.getContext() == null) {
            return;
        }
        int childCount = i - viewGroup.getChildCount();
        if (childCount > 0) {
            int i2 = 0;
            do {
                if (viewGroup.getChildCount() < i) {
                    viewGroup.addView(function2.invoke(viewGroup, viewGroup.getContext()));
                }
                i2++;
            } while (i2 < childCount);
            return;
        }
        int i3 = -childCount;
        if (viewGroup.getChildCount() >= i3) {
            try {
                C786410Ut5.LJJZ(viewGroup.getChildCount() - i3, i3, viewGroup);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final void LJIILIIL(final C1295960jpS c1295960jpS, String str, final Function0<Unit> function0) {
        if (str == null) {
            return;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists()) {
            final C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(new C0VSP(c0vsj), null);
            c1292030jj7LJ.LIZIZ(new InterfaceC1292040jj8<C1294720jnS>() { // from class: X.14J1
                @Override // X.InterfaceC1292040jj8
                public final void onResult(C1294720jnS c1294720jnS) {
                    C1294720jnS c1294720jnS2 = c1294720jnS;
                    if (c1294720jnS2 != null) {
                        c1295960jpS.setComposition(c1294720jnS2);
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        c1292030jj7LJ.LJII(this);
                    }
                }
            });
            c1292030jj7LJ.LIZ(new C20308914dL(c1292030jj7LJ, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJII(android.widget.ImageView r3, int r4, int r5, boolean r6) {
        /*
            if (r6 != 0) goto Lf
            android.app.Activity r0 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            r2 = 0
            if (r0 == 0) goto L10
            boolean r0 = X.C960203pA.LIZIZ(r0)
            if (r0 == 0) goto L10
        Lf:
            r2 = 1
        L10:
            X.0GdJ r1 = new X.0GdJ
            r1.<init>()
            X.0yRS r0 = X.C1857680yRS.LIZ
            int r0 = r0.LJIIIZ(r2)
            r1.LIZ = r0
            r1.LIZIZ = r4
            r1.LIZJ = r5
            android.content.Context r0 = r3.getContext()
            com.bytedance.tux.drawable.TuxIconDrawable r0 = r1.LIZ(r0)
            r3.setImageDrawable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1857690yRT.LJII(android.widget.ImageView, int, int, boolean):void");
    }

    public static final void LJFF(SmartImageView smartImageView, String str, int i, int i2, boolean z) {
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        if (smartImageView instanceof SmartImageView) {
            c1331670kl3LJIIIZ.LJJ(smartImageView);
        } else {
            c1331670kl3LJIIIZ.LJJI(smartImageView);
        }
        if (z) {
            c1331670kl3LJIIIZ.LJJI = C1332130kln.LIZIZ();
        }
        c1331670kl3LJIIIZ.LJIIIIZZ = i;
        c1331670kl3LJIIIZ.LJIIIZ = i2;
        c1331670kl3LJIIIZ.LJIIJJI();
    }

    public static void LIZ(TuxTextView tuxTextView, String str, Integer num, String str2, AwS571S0100000_27 awS571S0100000_27, int i) {
        int iIntValue;
        SpannableString spannableString;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            awS571S0100000_27 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) tuxTextView.getText());
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        if (str == null) {
            str = C20642515q3.LJI(2131828523);
        }
        sbLIZ2.append(str);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        int length = strLIZIZ.length();
        int length2 = strLIZIZ2.length();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 82;
        }
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(iIntValue);
        Typeface typeface = c444890HcV.getTypeface();
        if (C07Q4.LIZ()) {
            spannableString = new SpannableString(strLIZIZ2);
            LIZJ(spannableString, length, length2, Integer.valueOf(LJIIJ(R.attr.a1j)), typeface, new AwS126S1100000_12(str2, (String) awS571S0100000_27, (Function0<Unit>) 6));
        } else {
            spannableString = new SpannableString(strLIZIZ2);
            LJ(spannableString, length, length2, Integer.valueOf(LJIIJ(R.attr.a1j)), typeface, new AwS128S1200000_12(str2, tuxTextView, awS571S0100000_27, 2));
        }
        tuxTextView.setText(spannableString);
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        tuxTextView.setHighlightColor(0);
    }

    public static final void LIZJ(Spannable spannable, int i, int i2, Integer num, Typeface typeface, Function1 function1) {
        C786410Ut5.o2(spannable, new C1775660wJA(function1, num, typeface, 1), i, i2, 33);
    }

    @InterfaceC1294060jmO
    public static final void LJ(Spannable spannable, int i, int i2, Integer num, Typeface typeface, Function0 function0) {
        C786410Ut5.o2(spannable, new C1775660wJA(function0, num, typeface, 2), i, i2, 33);
    }

    public static void LJI(ImageView imageView, int i, int i2, int i3, int i4, Float f, int i5) {
        int iFloatValue;
        int iFloatValue2;
        Float f2 = f;
        int i6 = i4;
        if ((i5 & 8) != 0) {
            i6 = R.attr.a02;
        }
        if ((i5 & 16) != 0) {
            f2 = null;
        }
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            boolean zLIZIZ = C960203pA.LIZIZ(topActivity);
            if (C0QSF.LIZ()) {
                C1857680yRS c1857680yRS = C1857680yRS.LIZ;
                if (f2 != null) {
                    f2.floatValue();
                    iFloatValue = (int) (f2.floatValue() * i);
                } else {
                    iFloatValue = i;
                }
                Integer numValueOf = Integer.valueOf(iFloatValue);
                if (f2 != null) {
                    f2.floatValue();
                    iFloatValue2 = (int) (f2.floatValue() * i2);
                } else {
                    iFloatValue2 = i2;
                }
                LJIIIIZZ(imageView, i, i2, i3, i6, c1857680yRS.LJI(numValueOf, Integer.valueOf(iFloatValue2)).LIZ(imageView.getContext()), zLIZIZ, f2);
                return;
            }
            C844350XAj.LIZ.LIZIZ(new C428260Gqm(imageView, i, i2, i3, i6, zLIZIZ), zLIZIZ);
        }
    }

    public static final void LJIIIIZZ(ImageView imageView, int i, int i2, int i3, int i4, Drawable drawable, boolean z, Float f) {
        float fFloatValue;
        int iLJIIIZ;
        if (f != null) {
            fFloatValue = f.floatValue();
        } else if (C07IF.LIZ()) {
            fFloatValue = 1.0f;
        } else {
            fFloatValue = 0.74f;
        }
        if (drawable == null) {
            C1857680yRS c1857680yRS = C1857680yRS.LIZ;
            Integer numValueOf = Integer.valueOf((int) (i * fFloatValue));
            Integer numValueOf2 = Integer.valueOf((int) (i2 * fFloatValue));
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (C07IF.LIZ()) {
                iLJIIIZ = R.raw.icon_color_default_avatar;
            } else {
                iLJIIIZ = c1857680yRS.LJIIIZ(z);
            }
            c419910GdJ.LIZ = iLJIIIZ;
            if (numValueOf != null) {
                c419910GdJ.LIZIZ = numValueOf.intValue();
            }
            if (numValueOf2 != null) {
                c419910GdJ.LIZJ = numValueOf2.intValue();
            }
            drawable = c419910GdJ.LIZ(imageView.getContext());
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(i3);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c384050F3z.LJII = i;
        c384050F3z.LJI = i2;
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        c384050F3z.LJFF = Integer.valueOf(i4);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c384050F3z.LIZ(imageView.getContext()), drawable});
        float f2 = (1.0f - fFloatValue) / 2;
        int i5 = (int) (i * f2);
        int i6 = (int) (i2 * f2);
        layerDrawable.setLayerInset(1, i5, i6, i5, i6);
        imageView.setBackground(layerDrawable);
    }
}
