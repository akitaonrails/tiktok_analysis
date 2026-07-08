package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0m6R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383370m6R {
    public static final Context LIZ = C2213981Bky.LIZIZ.getApplicationContext();

    public static final Context LJIIL() {
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null) {
            return abstractC1387200mCcLJFF.LIZIZ();
        }
        return null;
    }

    public static final Context LJIILIIL() {
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null) {
            return abstractC1387200mCcLJFF.LJIIIIZZ();
        }
        return null;
    }

    public static final View LJ(View view) {
        AbstractC1387200mCc abstractC1387200mCcLIZ;
        if (view != null && (abstractC1387200mCcLIZ = C520040KaQ.LIZ(view)) != null) {
            return abstractC1387200mCcLIZ.LJI();
        }
        return null;
    }

    public static final int LJFF(int i) {
        Integer numLIZJ;
        Context contextLJIILIIL = LJIILIIL();
        if (contextLJIILIIL != null && (numLIZJ = C1308910kAL.LIZJ(i, contextLJIILIIL)) != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    public static final ViewGroup.MarginLayoutParams LJI(View view) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return null;
        }
        return (ViewGroup.MarginLayoutParams) layoutParams;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC665370Q7z LJIIIIZZ(X.C19EG r3) {
        /*
            X.0mCc r1 = X.C1906580ziK.LJ()
            r2 = 0
            if (r1 == 0) goto L2b
            boolean r0 = r1 instanceof X.C1397950mTx
            if (r0 == 0) goto L1e
            X.0mTx r1 = (X.C1397950mTx) r1
            android.app.Activity r1 = r1.LIZLLL
            boolean r0 = r1 instanceof X.C19EG
            if (r0 == 0) goto L2b
            X.19EG r1 = (X.C19EG) r1
            if (r1 == 0) goto L2b
            X.0Q7z r0 = X.C1558360qeg.LJI(r1, r2)
        L1b:
            if (r0 == 0) goto L2b
            return r0
        L1e:
            boolean r0 = r1 instanceof X.C1844400y62
            if (r0 == 0) goto L2b
            X.0y62 r1 = (X.C1844400y62) r1
            F extends androidx.fragment.app.Fragment & X.198i r0 = r1.LIZLLL
            X.0Q7z r0 = X.C1558360qeg.LJFF(r0, r2)
            goto L1b
        L2b:
            if (r3 == 0) goto L32
            X.0Q7z r2 = X.C1558360qeg.LJI(r3, r2)
            return r2
        L32:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1383370m6R.LJIIIIZZ(X.19EG):X.0Q7z");
    }

    public static final int LJIIIZ(C19EG c19eg) {
        View rootView = c19eg.findViewById(R.id.content).getRootView();
        int iLIZJ = C497820Jfg.LIZJ(c19eg);
        Rect rect = new Rect();
        rootView.getWindowVisibleDisplayFrame(rect);
        int iLIZ = C497820Jfg.LIZ(c19eg);
        int i = rect.bottom - iLIZJ;
        if (i >= ((double) iLIZ) * 0.85d) {
            return i;
        }
        return iLIZ;
    }

    public static final String LJIIJ(int i) {
        if (i != -1 && i != 0) {
            return LIZ.getString(i);
        }
        return "";
    }

    public static final String LJIIJJI(int i) {
        try {
            return LJIIJ(i);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static final void LIZ(View view, Function1<? super ViewGroup.LayoutParams, Unit> function1) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null) {
            function1.invoke(layoutParams);
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static final void LIZIZ(View view, Function1<? super ViewGroup.MarginLayoutParams, Unit> function1) {
        ViewGroup.MarginLayoutParams marginLayoutParamsLJI;
        if (view != null && (marginLayoutParamsLJI = LJI(view)) != null) {
            function1.invoke(marginLayoutParamsLJI);
            C786410Ut5.W5(view, marginLayoutParamsLJI);
        }
    }

    public static final float LJII(View view, boolean z) {
        Fragment fragmentLIZ;
        if (z && (fragmentLIZ = C897460ZIq.LIZ(view)) != null) {
            View view2 = fragmentLIZ.getView();
            C19EG activity = fragmentLIZ.getActivity();
            if (view2 != null && activity != null) {
                return (activity.getWindow().getDecorView().getHeight() - view2.getHeight()) - C14KQ.LIZLLL(activity);
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static final void LJIILJJIL(int i, int i2, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (i != layoutParams.width || i2 != layoutParams.height) {
            layoutParams.width = i;
            layoutParams.height = i2;
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static final SpannableString LIZLLL(TuxTextView tuxTextView, String str, String str2, final Function0 function0) {
        SpannableString spannableString = new SpannableString(str2);
        int iLJJJ = a0.LJJJ(str2, str, 0, false, 6);
        final int iLIZIZ = a.LIZIZ(com.zhiliaoapp.musically.R.attr.a1n, LIZ);
        final C238400w2 c238400w2 = new C238400w2();
        int length = str.length() + iLJJJ;
        if (iLJJJ >= 0 && length < str2.length() && iLJJJ <= length) {
            C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.011x
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - c238400w2.element >= 600) {
                        function0.invoke();
                    }
                    c238400w2.element = jCurrentTimeMillis;
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setColor(iLIZIZ);
                    textPaint.setUnderlineText(false);
                }
            }, iLJJJ, length, 34);
        }
        if (tuxTextView != null) {
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
            tuxTextView.setHighlightColor(0);
        }
        return spannableString;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILL(android.view.View r4, int r5, int r6, int r7) {
        /*
            r0 = r7 & 1
            r3 = 0
            if (r0 == 0) goto L13
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L72
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L72
            int r5 = r1.topMargin
        L13:
            r0 = r7 & 2
            if (r0 == 0) goto L25
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L70
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L70
            int r6 = r1.bottomMargin
        L25:
            r0 = r7 & 4
            if (r0 == 0) goto L6e
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L6e
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L6e
            int r2 = r1.getMarginStart()
        L39:
            r0 = r7 & 8
            if (r0 == 0) goto L4d
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L4d
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L4d
            int r3 = r1.getMarginEnd()
        L4d:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L6d
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L6d
            int r0 = r1.topMargin
            if (r0 != r5) goto L74
            int r0 = r1.bottomMargin
            if (r0 != r6) goto L74
            int r0 = r1.getMarginStart()
            if (r0 != r2) goto L74
            int r0 = r1.getMarginEnd()
            if (r0 != r3) goto L74
        L6d:
            return
        L6e:
            r2 = 0
            goto L39
        L70:
            r6 = 0
            goto L25
        L72:
            r5 = 0
            goto L13
        L74:
            r1.topMargin = r5
            r1.bottomMargin = r6
            r1.setMarginStart(r2)
            r1.setMarginEnd(r3)
            X.C786410Ut5.W5(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1383370m6R.LJIILL(android.view.View, int, int, int):void");
    }

    public static void LIZJ(View view, Integer num, Integer num2, Integer num3, Integer num4, int i) {
        int paddingStart;
        int paddingTop;
        int paddingEnd;
        int paddingBottom;
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
        if (view != null) {
            if (num != null) {
                paddingStart = num.intValue();
            } else {
                paddingStart = view.getPaddingStart();
            }
            if (num2 != null) {
                paddingTop = num2.intValue();
            } else {
                paddingTop = view.getPaddingTop();
            }
            if (num3 != null) {
                paddingEnd = num3.intValue();
            } else {
                paddingEnd = view.getPaddingEnd();
            }
            if (num4 != null) {
                paddingBottom = num4.intValue();
            } else {
                paddingBottom = view.getPaddingBottom();
            }
            view.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
        }
    }
}
