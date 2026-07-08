package X;

import Y.ARunnableS131S0100000_31;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.autocaption.refactor.CLACaptionAssemV2;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.16HN, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16HN implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
            case 7:
                onGlobalLayout$7(this);
                break;
            case 8:
                onGlobalLayout$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onGlobalLayout$9(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(C16HN c16hn) {
        if (((CLACaptionAssemV2) c16hn.l0).LLL.getValue() != null) {
            InteractBizTopAreaAttachAbility interactBizTopAreaAttachAbility = (InteractBizTopAreaAttachAbility) ((CLACaptionAssemV2) c16hn.l0).LLL.getValue();
            if (interactBizTopAreaAttachAbility != null) {
                interactBizTopAreaAttachAbility.XT(((CLACaptionAssemV2) c16hn.l0).LLLIILIL);
            }
            InteractBizTopAreaAttachAbility interactBizTopAreaAttachAbility2 = (InteractBizTopAreaAttachAbility) ((CLACaptionAssemV2) c16hn.l0).LLL.getValue();
            if (interactBizTopAreaAttachAbility2 != null) {
                interactBizTopAreaAttachAbility2.ij2(((CLACaptionAssemV2) c16hn.l0).LLLIILIL);
            }
        }
        RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) ((CLACaptionAssemV2) c16hn.l0).LLJZIJLIL.getValue();
        if (rootCellCommonAbility != null) {
            rootCellCommonAbility.ek(c16hn);
        }
    }

    public static final void onGlobalLayout$1(C16HN c16hn) {
        C786410Ut5.C3(((ViewOnClickListenerC20639415pY) c16hn.l0).getViewTreeObserver(), c16hn);
        ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY = (ViewOnClickListenerC20639415pY) c16hn.l0;
        viewOnClickListenerC20639415pY.LLJJIJI = viewOnClickListenerC20639415pY.getMeasuredWidth();
        ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY2 = (ViewOnClickListenerC20639415pY) c16hn.l0;
        viewOnClickListenerC20639415pY2.LLJJIJIIJIL = viewOnClickListenerC20639415pY2.LLIZLLLIL.getMeasuredWidth();
        ViewGroup.LayoutParams layoutParams = ((ViewOnClickListenerC20639415pY) c16hn.l0).LLJ.getLayoutParams();
        ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY3 = (ViewOnClickListenerC20639415pY) c16hn.l0;
        layoutParams.width = viewOnClickListenerC20639415pY3.LLJJIJI - viewOnClickListenerC20639415pY3.LLJILLL;
        C786410Ut5.R6(viewOnClickListenerC20639415pY3.LLJ, layoutParams);
    }

    public static final void onGlobalLayout$2(C16HN c16hn) {
        ViewTreeObserver viewTreeObserver;
        int marginStart;
        int marginEnd;
        C15QK c15qk = (C15QK) c16hn.l0;
        ViewGroup viewGroup = c15qk.LLLL;
        if (viewGroup != null) {
            int width = (viewGroup.getWidth() - ((View) c15qk.LLLIIII.getValue()).getWidth()) - c15qk.LLLLILI().getWidth();
            ViewGroup.LayoutParams layoutParams = ((View) c15qk.LLLIIL.getValue()).getLayoutParams();
            int marginEnd2 = 0;
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                marginStart = 0;
            }
            int i = width - marginStart;
            ViewGroup.LayoutParams layoutParams2 = ((View) c15qk.LLLIIL.getValue()).getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
            } else {
                marginEnd = 0;
            }
            int i2 = i - marginEnd;
            ViewGroup.LayoutParams layoutParams3 = c15qk.LLLLILI().getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginEnd2 = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
            }
            Integer numValueOf = Integer.valueOf(i2 - marginEnd2);
            ((TextView) ((C15QK) c16hn.l0).LLLIIIL.getValue()).setMaxWidth(numValueOf.intValue());
        }
        ViewGroup viewGroup2 = ((C15QK) c16hn.l0).LLLL;
        if (viewGroup2 != null && (viewTreeObserver = viewGroup2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c16hn);
            C2187701Ajg.LIZIZ(viewTreeObserver, c16hn, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$3(C16HN c16hn) {
        C20518715Qr c20518715Qr = (C20518715Qr) c16hn.l0;
        HandlerHook.viewPost(c20518715Qr.LIZ, new ARunnableS131S0100000_31(c20518715Qr, 130));
    }

    public static final void onGlobalLayout$4(C16HN c16hn) {
        int height = ((C20514815Pe) c16hn.l0).getHeight();
        Integer num = ((C20514815Pe) c16hn.l0).LLJLLL;
        if (num == null || num.intValue() != height) {
            ((C20514815Pe) c16hn.l0).LLJLLL = Integer.valueOf(height);
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior = ((C20514815Pe) c16hn.l0).LLJLILLLLZIIL;
            if (bottomSheetBehavior == null) {
                bottomSheetBehavior = null;
            }
            bottomSheetBehavior.setPeekHeight(height);
        }
    }

    public static final void onGlobalLayout$5(C16HN c16hn) {
        C786410Ut5.C3(((C20516315Pt) c16hn.l0).LLILZ.getViewTreeObserver(), c16hn);
        if (((C20516315Pt) c16hn.l0).LLIZ.getLineCount() + ((C20516315Pt) c16hn.l0).LLIZLLLIL.getLineCount() >= 3) {
            C20516415Pu c20516415Pu = ((C20516315Pt) c16hn.l0).LLJILJILJ;
            C20516415Pu c20516415Pu2 = null;
            if (c20516415Pu == null) {
                c20516415Pu = null;
            }
            CharSequence charSequence = c20516415Pu.LJIIIIZZ;
            if (charSequence != null && charSequence.length() != 0) {
                C20516315Pt c20516315Pt = (C20516315Pt) c16hn.l0;
                C20516415Pu c20516415Pu3 = c20516315Pt.LLJILJILJ;
                if (c20516415Pu3 != null) {
                    c20516415Pu2 = c20516415Pu3;
                }
                if (!c20516415Pu2.LJIIZILJ) {
                    C786410Ut5.LJZ(8, c20516315Pt.LLILZLL);
                }
            }
        }
    }

    public static final void onGlobalLayout$6(C16HN c16hn) {
        View view = ((C20515515Pl) c16hn.l0).LLILZ;
        BottomSheetBehavior<LinearLayout> bottomSheetBehavior = null;
        if (view == null) {
            view = null;
        }
        int height = view.getHeight();
        Integer num = ((C20515515Pl) c16hn.l0).LLIZLLLIL;
        if (num == null || num.intValue() != height) {
            ((C20515515Pl) c16hn.l0).LLIZLLLIL = Integer.valueOf(height);
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior2 = ((C20515515Pl) c16hn.l0).LLILZIL;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior = bottomSheetBehavior2;
            }
            bottomSheetBehavior.setPeekHeight(height);
        }
    }

    public static final void onGlobalLayout$7(C16HN c16hn) {
        int height = ((C20514915Pf) c16hn.l0).getHeight();
        Integer num = ((C20514915Pf) c16hn.l0).LLJLLL;
        if (num == null || num.intValue() != height) {
            ((C20514915Pf) c16hn.l0).LLJLLL = Integer.valueOf(height);
            BottomSheetBehavior<LinearLayout> bottomSheetBehavior = ((C20514915Pf) c16hn.l0).LLJLILLLLZIIL;
            if (bottomSheetBehavior == null) {
                bottomSheetBehavior = null;
            }
            bottomSheetBehavior.setPeekHeight(height);
        }
    }

    public static final void onGlobalLayout$8(C16HN c16hn) {
        C786410Ut5.C3(((C20516215Ps) c16hn.l0).LLILZ.getViewTreeObserver(), c16hn);
        if (((C20516215Ps) c16hn.l0).LLIZ.getLineCount() + ((C20516215Ps) c16hn.l0).LLIZLLLIL.getLineCount() >= 3) {
            C1057450dcl c1057450dcl = ((C20516215Ps) c16hn.l0).LLJILJILJ;
            C1057450dcl c1057450dcl2 = null;
            if (c1057450dcl == null) {
                c1057450dcl = null;
            }
            CharSequence charSequence = c1057450dcl.LJI;
            if (charSequence != null && charSequence.length() != 0) {
                C20516215Ps c20516215Ps = (C20516215Ps) c16hn.l0;
                C1057450dcl c1057450dcl3 = c20516215Ps.LLJILJILJ;
                if (c1057450dcl3 != null) {
                    c1057450dcl2 = c1057450dcl3;
                }
                if (!c1057450dcl2.LJIILLIIL) {
                    C786410Ut5.LJZ(8, c20516215Ps.LLILZLL);
                }
            }
        }
    }

    public static final void onGlobalLayout$9(C16HN c16hn) {
        C20379814om c20379814om = (C20379814om) c16hn.l0;
        View view = c20379814om.LIZ;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(c20379814om.LIZLLL);
            int iLJIIIIZZ = C12ES.LJIIIIZZ(view.getContext());
            int i = iLJIIIIZZ - c20379814om.LIZLLL.bottom;
            if (iLJIIIIZZ > 0 && i != c20379814om.LIZJ) {
                c20379814om.LIZJ = i;
                if (i > 200) {
                    Function2<? super Boolean, ? super Integer, Unit> function2 = c20379814om.LIZIZ;
                    if (function2 != null) {
                        function2.invoke(Boolean.TRUE, Integer.valueOf(i));
                        return;
                    }
                    return;
                }
                Function2<? super Boolean, ? super Integer, Unit> function22 = c20379814om.LIZIZ;
                if (function22 == null) {
                    return;
                }
                function22.invoke(Boolean.FALSE, Integer.valueOf(Math.abs(i)));
            }
        }
    }

    public C16HN(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
