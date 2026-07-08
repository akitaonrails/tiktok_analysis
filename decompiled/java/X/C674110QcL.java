package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674110QcL {
    public final Context LIZ;
    public final Function0<Context> LIZIZ;
    public final View LIZJ;
    public final C418060GaK LIZLLL;
    public final TuxIconView LJ;
    public final EditText LJFF;
    public final EditText LJI;
    public final EditText LJII;
    public final View LJIIIIZZ;
    public final TuxIconView LJIIIZ;
    public final View LJIIJ;
    public final View LJIIJJI;
    public final TuxIconView LJIIL;
    public final TuxTextView LJIILIIL;
    public final C427110Gov LJIILJJIL;
    public final TuxIconView LJIILL;
    public final View LJIILLIIL;

    public final void LIZ(C674160QcQ c674160QcQ) {
        View view = this.LJIIIIZZ;
        if (view != null) {
            C786410Ut5.T4(view, c674160QcQ.LIZ);
        }
        TuxIconView tuxIconView = this.LJIIIZ;
        if (tuxIconView != null) {
            C786410Ut5.x5(tuxIconView, c674160QcQ.LIZIZ);
        }
        View view2 = this.LJIIJ;
        if (view2 != null) {
            C786410Ut5.T4(view2, c674160QcQ.LIZJ);
        }
        View view3 = this.LJIIJJI;
        if (view3 != null) {
            C786410Ut5.T4(view3, c674160QcQ.LIZLLL);
        }
        EditText editText = this.LJFF;
        if (editText != null) {
            float f = c674160QcQ.LJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(editText);
            editText.setAlpha(f);
        }
        EditText editText2 = this.LJI;
        if (editText2 != null) {
            float f2 = c674160QcQ.LJFF;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(editText2);
            editText2.setAlpha(f2);
        }
        EditText editText3 = this.LJII;
        if (editText3 != null) {
            float f3 = c674160QcQ.LJI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(editText3);
            editText3.setAlpha(f3);
        }
        TuxTextView tuxTextView = this.LJIILIIL;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, c674160QcQ.LJII);
        }
        TuxIconView tuxIconView2 = this.LJIILL;
        if (tuxIconView2 != null) {
            C786410Ut5.x5(tuxIconView2, c674160QcQ.LJIIIIZZ);
        }
        View view4 = this.LJIILLIIL;
        if (view4 != null) {
            C786410Ut5.T4(view4, c674160QcQ.LJIIIZ);
        }
    }

    public final void LIZIZ(C674180QcS c674180QcS) {
        View view = this.LIZJ;
        ViewGroup.LayoutParams layoutParams = null;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.LayoutParams) && layoutParams2 != null) {
                layoutParams2.height = c674180QcS.LIZ;
                C786410Ut5.W5(view, layoutParams2);
            }
        }
        TuxIconView tuxIconView = this.LJIIIZ;
        if (tuxIconView != null) {
            C786410Ut5.Uc(tuxIconView, c674180QcS.LIZIZ);
        }
        View view2 = this.LJIIJ;
        if (view2 != null) {
            C786410Ut5.Jc(view2, c674180QcS.LIZJ);
        }
        View view3 = this.LJIIJJI;
        if (view3 != null) {
            C786410Ut5.Jc(view3, c674180QcS.LIZLLL);
        }
        C427110Gov c427110Gov = this.LJIILJJIL;
        if (c427110Gov != null) {
            ViewGroup.LayoutParams layoutParams3 = c427110Gov.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                layoutParams = layoutParams3;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                marginLayoutParams.setMarginEnd(c674180QcS.LJ);
                marginLayoutParams.bottomMargin = c674180QcS.LJFF;
                C786410Ut5.W5(c427110Gov, marginLayoutParams);
            }
        }
    }

    public final void LIZJ(C674070QcH c674070QcH) {
        LIZIZ(c674070QcH.LIZ);
        LIZ(c674070QcH.LIZIZ);
        LJ(c674070QcH.LIZJ);
        C674080QcI c674080QcI = c674070QcH.LIZLLL;
        Boolean bool = c674080QcI.LIZ;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            C418060GaK c418060GaK = this.LIZLLL;
            if (c418060GaK != null) {
                C680790Qn7.LIZ.getClass();
                c418060GaK.setEnabled(zBooleanValue);
                c418060GaK.setClickable(zBooleanValue);
            }
            EditText editText = this.LJI;
            if (editText != null) {
                C680790Qn7.LIZ.getClass();
                editText.setEnabled(zBooleanValue);
                editText.setClickable(zBooleanValue);
            }
        }
        Boolean bool2 = c674080QcI.LIZIZ;
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            View view = this.LJIIJJI;
            if (view != null) {
                C680790Qn7.LIZ.getClass();
                view.setEnabled(zBooleanValue2);
                view.setClickable(zBooleanValue2);
            }
            TuxIconView tuxIconView = this.LJIIL;
            if (tuxIconView != null) {
                C680790Qn7.LIZ.getClass();
                tuxIconView.setEnabled(zBooleanValue2);
                tuxIconView.setClickable(zBooleanValue2);
            }
        }
        Boolean bool3 = c674080QcI.LIZJ;
        if (bool3 != null) {
            boolean zBooleanValue3 = bool3.booleanValue();
            TuxIconView tuxIconView2 = this.LJIIIZ;
            if (tuxIconView2 != null) {
                C680790Qn7.LIZ.getClass();
                tuxIconView2.setEnabled(zBooleanValue3);
                tuxIconView2.setClickable(zBooleanValue3);
            }
        }
        Boolean bool4 = c674080QcI.LIZLLL;
        if (bool4 != null) {
            boolean zBooleanValue4 = bool4.booleanValue();
            TuxTextView tuxTextView = this.LJIILIIL;
            if (tuxTextView != null) {
                C680790Qn7.LIZ.getClass();
                tuxTextView.setEnabled(zBooleanValue4);
                tuxTextView.setClickable(zBooleanValue4);
            }
        }
        Boolean bool5 = c674080QcI.LJ;
        if (bool5 != null) {
            boolean zBooleanValue5 = bool5.booleanValue();
            TuxIconView tuxIconView3 = this.LJIILL;
            if (tuxIconView3 != null) {
                C680790Qn7.LIZ.getClass();
                tuxIconView3.setEnabled(zBooleanValue5);
                tuxIconView3.setClickable(zBooleanValue5);
            }
        }
        Boolean bool6 = c674080QcI.LJFF;
        if (bool6 != null) {
            boolean zBooleanValue6 = bool6.booleanValue();
            C427110Gov c427110Gov = this.LJIILJJIL;
            if (c427110Gov != null) {
                C680790Qn7.LIZ.getClass();
                c427110Gov.setEnabled(zBooleanValue6);
                c427110Gov.setClickable(zBooleanValue6);
            }
        }
        LIZLLL(c674070QcH.LJ);
    }

    public final void LIZLLL(C674170QcR c674170QcR) {
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3;
        GradientDrawable gradientDrawable;
        Integer numLIZJ4;
        Integer numLIZJ5;
        TuxIconView tuxIconView = this.LJ;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(c674170QcR.LIZ);
        }
        Context contextInvoke = this.LIZIZ.invoke();
        if ((contextInvoke != null || (contextInvoke = this.LIZ) != null) && (numLIZJ = C1308910kAL.LIZJ(c674170QcR.LIZIZ, contextInvoke)) != null) {
            int iIntValue = numLIZJ.intValue();
            TuxIconView tuxIconView2 = this.LJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColor(iIntValue);
            }
        }
        Context context = this.LIZ;
        if (context != null && (numLIZJ5 = C1308910kAL.LIZJ(c674170QcR.LIZJ, context)) != null) {
            int iIntValue2 = numLIZJ5.intValue();
            C418060GaK c418060GaK = this.LIZLLL;
            if (c418060GaK != null) {
                c418060GaK.setContentColor(iIntValue2);
            }
        }
        Integer num = c674170QcR.LIZLLL;
        if (num != null) {
            int iIntValue3 = num.intValue();
            EditText editText = this.LJII;
            if (editText != null) {
                editText.setHint(C20642515q3.LJI(iIntValue3));
            }
        }
        C427110Gov c427110Gov = this.LJIILJJIL;
        if (c427110Gov != null) {
            c427110Gov.setText(C20642515q3.LJI(c674170QcR.LJ));
        }
        Context contextInvoke2 = this.LIZIZ.invoke();
        if ((contextInvoke2 != null || (contextInvoke2 = this.LIZ) != null) && (numLIZJ2 = C1308910kAL.LIZJ(c674170QcR.LJFF, contextInvoke2)) != null) {
            int iIntValue4 = numLIZJ2.intValue();
            C427110Gov c427110Gov2 = this.LJIILJJIL;
            if (c427110Gov2 != null) {
                c427110Gov2.setTextColor(iIntValue4);
            }
        }
        Context contextInvoke3 = this.LIZIZ.invoke();
        if ((contextInvoke3 != null || (contextInvoke3 = this.LIZ) != null) && (numLIZJ3 = C1308910kAL.LIZJ(c674170QcR.LJI, contextInvoke3)) != null) {
            int iIntValue5 = numLIZJ3.intValue();
            C427110Gov c427110Gov3 = this.LJIILJJIL;
            if (c427110Gov3 != null) {
                C680790Qn7.LIZ.getClass();
                Drawable background = c427110Gov3.getBackground();
                Drawable drawableMutate = null;
                if (background != null) {
                    drawableMutate = background.mutate();
                }
                if ((drawableMutate instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) drawableMutate) != null) {
                    gradientDrawable.setColor(iIntValue5);
                    c427110Gov3.setBackground(gradientDrawable);
                }
            }
        }
        Context context2 = this.LIZ;
        if (context2 != null && (numLIZJ4 = C1308910kAL.LIZJ(c674170QcR.LJII, context2)) != null) {
            int iIntValue6 = numLIZJ4.intValue();
            TuxIconView tuxIconView3 = this.LJIILL;
            if (tuxIconView3 != null) {
                tuxIconView3.setTintColor(iIntValue6);
            }
        }
    }

    public final void LJ(C674090QcJ c674090QcJ) {
        Boolean bool = c674090QcJ.LIZ;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            EditText editText = this.LJFF;
            if (editText != null) {
                C680790Qn7.LIZ.getClass();
                C680790Qn7.LIZ(editText, zBooleanValue);
            }
        }
        Boolean bool2 = c674090QcJ.LIZIZ;
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            EditText editText2 = this.LJI;
            if (editText2 != null) {
                C680790Qn7.LIZ.getClass();
                C680790Qn7.LIZ(editText2, zBooleanValue2);
            }
        }
        Boolean bool3 = c674090QcJ.LIZJ;
        if (bool3 != null) {
            boolean zBooleanValue3 = bool3.booleanValue();
            EditText editText3 = this.LJII;
            if (editText3 != null) {
                C680790Qn7.LIZ.getClass();
                C680790Qn7.LIZ(editText3, zBooleanValue3);
            }
        }
        Boolean bool4 = c674090QcJ.LIZLLL;
        if (bool4 != null) {
            boolean zBooleanValue4 = bool4.booleanValue();
            C418060GaK c418060GaK = this.LIZLLL;
            if (c418060GaK != null) {
                C680790Qn7.LIZ.getClass();
                C680790Qn7.LIZ(c418060GaK, zBooleanValue4);
            }
        }
        Boolean bool5 = c674090QcJ.LIZJ;
        if (bool5 != null) {
            boolean zBooleanValue5 = bool5.booleanValue();
            EditText editText4 = this.LJII;
            if (editText4 != null) {
                C680790Qn7.LIZ.getClass();
                C680790Qn7.LIZ(editText4, zBooleanValue5);
            }
        }
        Boolean bool6 = c674090QcJ.LJFF;
        if (bool6 != null) {
            boolean zBooleanValue6 = bool6.booleanValue();
            TuxIconView tuxIconView = this.LJIILL;
            if (tuxIconView != null) {
                C680790Qn7.LIZ.getClass();
                C680790Qn7.LIZ(tuxIconView, zBooleanValue6);
            }
        }
        Boolean bool7 = c674090QcJ.LJI;
        if (bool7 != null) {
            boolean zBooleanValue7 = bool7.booleanValue();
            View view = this.LJIILLIIL;
            if (view != null) {
                C680790Qn7.LIZ.getClass();
                C680790Qn7.LIZ(view, zBooleanValue7);
            }
        }
    }

    public C674110QcL(Context context, Function0 function0, View view, C418060GaK c418060GaK, TuxIconView tuxIconView, EditText editText, EditText editText2, EditText editText3, View view2, TuxIconView tuxIconView2, View view3, View view4, TuxIconView tuxIconView3, TuxTextView tuxTextView, C427110Gov c427110Gov, TuxIconView tuxIconView4, ChoreographerFrameCallbackC674130QcN choreographerFrameCallbackC674130QcN) {
        this.LIZ = context;
        this.LIZIZ = function0;
        this.LIZJ = view;
        this.LIZLLL = c418060GaK;
        this.LJ = tuxIconView;
        this.LJFF = editText;
        this.LJI = editText2;
        this.LJII = editText3;
        this.LJIIIIZZ = view2;
        this.LJIIIZ = tuxIconView2;
        this.LJIIJ = view3;
        this.LJIIJJI = view4;
        this.LJIIL = tuxIconView3;
        this.LJIILIIL = tuxTextView;
        this.LJIILJJIL = c427110Gov;
        this.LJIILL = tuxIconView4;
        this.LJIILLIIL = choreographerFrameCallbackC674130QcN;
    }
}
