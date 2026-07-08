package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS99S0100000_33;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1A7R, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A7R extends C0FC9<C1890107al, C1A7W> {
    public final C1889707ah LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public ConstraintLayout LLJJL;
    public FrameLayout LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public TuxIconView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public final C01GW LLJLL;

    public final LinearLayout LLLLLJLJLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.b6z);
            this.LLJL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final TuxTextView LLLLLL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJLILLLLZIIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.b71);
            this.LLJLILLLLZIIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final ConstraintLayout LLLLLLIL() {
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJL;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.pp3);
            this.LLJJL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public C1A7R(C1889707ah c1889707ah, C1DRG c1drg) {
        super(c1drg);
        this.LLJJJJJIL = c1889707ah;
        this.LLJJJJLIIL = c1drg;
        this.LLJLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 822));
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        TuxTextView tuxTextViewLLLLLL;
        Integer num;
        Integer num2;
        super.onViewCreated(view, bundle);
        View viewRequireView = requireView();
        KeyEvent.Callback callbackFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = viewRequireView.findViewById(R.id.ppb);
            this.LLJJLIIIJLLLLLLLZ = (FrameLayout) callbackFindViewById;
        }
        ViewGroup viewGroup = (ViewGroup) callbackFindViewById;
        if (viewGroup != null) {
            C0EG9.LIZ(viewGroup, new AwS577S0100000_33(this, 3670));
        }
        if (C357780E0y.LIZ()) {
            View viewRequireView2 = requireView();
            KeyEvent.Callback callbackFindViewById2 = this.LLJLIL;
            if (callbackFindViewById2 == null) {
                callbackFindViewById2 = viewRequireView2.findViewById(R.id.b70);
                this.LLJLIL = (TuxIconView) callbackFindViewById2;
            }
            TuxIconView tuxIconView = (TuxIconView) callbackFindViewById2;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_quadrilateral);
            }
        }
        C1889707ah c1889707ah = this.LLJJJJJIL;
        if (c1889707ah != null && (num2 = c1889707ah.LIZ) != null) {
            int iIntValue = num2.intValue();
            View viewRequireView3 = requireView();
            KeyEvent.Callback callbackFindViewById3 = this.LLJLIL;
            if (callbackFindViewById3 == null) {
                callbackFindViewById3 = viewRequireView3.findViewById(R.id.b70);
                this.LLJLIL = (TuxIconView) callbackFindViewById3;
            }
            TuxIconView tuxIconView2 = (TuxIconView) callbackFindViewById3;
            if (tuxIconView2 != null) {
                tuxIconView2.setIconRes(iIntValue);
            }
        }
        C1889707ah c1889707ah2 = this.LLJJJJJIL;
        if (c1889707ah2 != null && (num = c1889707ah2.LIZIZ) != null) {
            int iIntValue2 = num.intValue();
            TuxTextView tuxTextViewLLLLLL2 = LLLLLL();
            if (tuxTextViewLLLLLL2 != null) {
                tuxTextViewLLLLLL2.setText(iIntValue2);
            }
        }
        if (C293810BfP.LIZ()) {
            LinearLayout linearLayoutLLLLLJLJLL = LLLLLJLJLL();
            if (linearLayoutLLLLLJLJLL != null) {
                ViewGroup.LayoutParams layoutParams = linearLayoutLLLLLJLJLL.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
                    C786410Ut5.W5(linearLayoutLLLLLJLJLL, layoutParams);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
            LinearLayout linearLayoutLLLLLJLJLL2 = LLLLLJLJLL();
            if (linearLayoutLLLLLJLJLL2 != null) {
                C426750GoL.LJIIIZ(linearLayoutLLLLLJLJLL2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 20);
            }
            LinearLayout linearLayoutLLLLLJLJLL3 = LLLLLJLJLL();
            if (linearLayoutLLLLLJLJLL3 != null) {
                C426750GoL.LJIIL(linearLayoutLLLLLJLJLL3, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), 20);
            }
            TuxTextView tuxTextViewLLLLLL3 = LLLLLL();
            if (tuxTextViewLLLLLL3 != null) {
                C426750GoL.LJIIL(tuxTextViewLLLLLL3, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11))), null, 27);
            }
            ConstraintLayout constraintLayoutLLLLLLIL = LLLLLLIL();
            if (constraintLayoutLLLLLLIL != null) {
                ViewGroup.LayoutParams layoutParams2 = constraintLayoutLLLLLLIL.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
                    C786410Ut5.W5(constraintLayoutLLLLLLIL, layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
            }
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.1A7S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1890107al) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS612S0100000_33(this, 109));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.1A7T
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1890107al) obj).LIZIZ);
            }
        }, Lifecycle.State.STARTED, new AwS612S0100000_33(this, 110));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.1A7U
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1890107al) obj).LIZJ;
            }
        }, Lifecycle.State.STARTED, new AwS612S0100000_33(this, 111));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.1A7V
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1890107al) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS612S0100000_33(this, 112));
        LinearLayout linearLayoutLLLLLJLJLL4 = LLLLLJLJLL();
        if (linearLayoutLLLLLJLJLL4 != null) {
            C786410Ut5.I7(new AkS99S0100000_33(this, 0), linearLayoutLLLLLJLJLL4);
        }
        ConstraintLayout constraintLayoutLLLLLLIL2 = LLLLLLIL();
        if (constraintLayoutLLLLLLIL2 != null) {
            C786410Ut5.I7(new AkS99S0100000_33(this, 1), constraintLayoutLLLLLLIL2);
        }
        InterfaceC357900E1k interfaceC357900E1k = (InterfaceC357900E1k) this.LLJLL.getValue();
        if (interfaceC357900E1k != null && interfaceC357900E1k.oI1() && (tuxTextViewLLLLLL = LLLLLL()) != null) {
            tuxTextViewLLLLLL.setTuxFont(62);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.c24, viewGroup, false);
    }
}
