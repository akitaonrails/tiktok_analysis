package X;

import Y.ALAdapterS9S0110000_25;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS62S0200000_25;
import iyl.i3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS604S0100000_25;
import u4.q0;

/* JADX INFO: renamed from: X.0tHE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1659140tHE extends AbstractC1659350tHZ {
    public static final int LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
    public final List<View> LLIZ;
    public final InterfaceC1659200tHK LLIZLLLIL;
    public View LLJ;
    public TuxIconView LLJI;
    public C0FJM LLJIJIL;
    public FrameLayout LLJILJIL;
    public TuxTextView LLJILJILJ;
    public SmartImageView LLJILLL;
    public C1295960jpS LLJJ;
    public ImageView LLJJI;
    public ImageView LLJJIII;
    public final HashMap<Integer, String> LLJJIJI;
    public final int LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final int LLJJJ;
    public final boolean LLJJJIL;
    public C1664680tQA<i3> LLJJJJ;
    public String LLJJJJJIL;
    public boolean LLJJJJLIIL;

    @Override // X.AbstractC1659350tHZ
    public int LJIIIIZZ() {
        return R.layout.d9z;
    }

    public void LJIIL() {
    }

    @Override // X.InterfaceC1657880tFC
    public C1654400t9a LIZLLL() {
        View viewLJJI = LJJI();
        SmartImageView smartImageViewLJIJI = LJIJI();
        FrameLayout frameLayout = this.LLJILJIL;
        if (frameLayout != null) {
            return new C1654400t9a(viewLJJI, smartImageViewLJIJI, frameLayout, LJIJJ(), LJJ(), this.LLJIJIL);
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final i3 LJIILLIIL() {
        C1664680tQA<i3> c1664680tQA = this.LLJJJJ;
        if (c1664680tQA != null) {
            return c1664680tQA.LIZ;
        }
        return null;
    }

    public final SmartImageView LJIJI() {
        SmartImageView smartImageView = this.LLJILLL;
        if (smartImageView != null) {
            return smartImageView;
        }
        return null;
    }

    public final TuxIconView LJIJJ() {
        TuxIconView tuxIconView = this.LLJI;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        return null;
    }

    public final C1295960jpS LJIJJLI() {
        C1295960jpS c1295960jpS = this.LLJJ;
        if (c1295960jpS != null) {
            return c1295960jpS;
        }
        return null;
    }

    public final TuxTextView LJJ() {
        TuxTextView tuxTextView = this.LLJILJILJ;
        if (tuxTextView != null) {
            return tuxTextView;
        }
        return null;
    }

    public final View LJJI() {
        View view = this.LLJ;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // X.AbstractC1659350tHZ, X.InterfaceC1657880tFC
    public void LJ() {
        LJJIIJZLJL();
        super.LJ();
    }

    public final void LJJIIJZLJL() {
        C786410Ut5.LLFF(0, LJIJI());
        C0FJM c0fjm = this.LLJIJIL;
        if (c0fjm != null) {
            C786410Ut5.w0(c0fjm, 8);
        }
        C786410Ut5.LLLLZLL(LJJ(), 8);
        ImageView imageView = this.LLJJIII;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
    }

    @Override // X.AbstractC1659350tHZ
    public final List<View> LJIIIZ() {
        return this.LLIZ;
    }

    public int LJIIZILJ() {
        return this.LLJJJ;
    }

    public int LJIJ() {
        return this.LLJJIJIIJIL;
    }

    public boolean LJIL() {
        return this.LLJJJIL;
    }

    private final String LJIILJJIL(int i) {
        HashMap<Integer, String> map = this.LLJJIJI;
        Integer numValueOf = Integer.valueOf(i);
        String strLJI = map.get(numValueOf);
        if (strLJI == null) {
            strLJI = C20642515q3.LJI(i);
            map.put(numValueOf, strLJI);
        }
        return strLJI;
    }

    @Override // X.InterfaceC1657880tFC
    public final void LIZ(i3 i3Var) {
        C1664680tQA<i3> c1664680tQA = this.LLJJJJ;
        if (c1664680tQA != null) {
            c1664680tQA.LIZLLL(new AwS604S0100000_25(i3Var, 596), true);
        }
    }

    public void LIZJ(final i3 i3Var) {
        boolean z;
        if (this.LLJJJJ != null) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindViewHolder,isStateInit:");
        sbLIZ.append(z);
        sbLIZ.append(",config:");
        sbLIZ.append(i3Var);
        C201955140j.LJIILIIL("ToolbarItemHolder", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJJJIL = i3Var.LLJLIL;
        if (!z) {
            this.LLJJJJ = new C1664680tQA<>(i3Var);
            LJJIFFI(new C2217381BqS() { // from class: X.0tHJ
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((i3) obj).LLILLL;
                }
            }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 590));
            LJJIFFI(new C2217381BqS() { // from class: X.0tGy
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((i3) obj).LL);
                }
            }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 592));
            LJJIFFI(new C2217381BqS() { // from class: X.0hi8
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Float.valueOf(((i3) obj).LLJJLIIIJLLLLLLLZ);
                }
            }, Lifecycle.State.STARTED, new AwS600S0100000_21(this, 280));
            LJJIFFI(new C2217381BqS() { // from class: X.0tFL
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((i3) obj).LLILZLL);
                }
            }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 598));
            LJJIFFI(new C2217381BqS() { // from class: X.0tFO
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((i3) obj).LLILZIL;
                }
            }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 599));
            if (!this.LLJJJJLIIL) {
                LJJIFFI(new C2217381BqS() { // from class: X.0tHG
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((i3) obj).LLJIJIL);
                    }
                }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 600));
            }
            LJJIFFI(new C2217381BqS() { // from class: X.0tFM
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((i3) obj).LLILLJJLI);
                }
            }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 601));
            LJJIFFI(new C2217381BqS() { // from class: X.0ZiX
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((i3) obj).LLIZ);
                }
            }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 602));
            LJJIFFI(new C2217381BqS() { // from class: X.0tHF
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((i3) obj).LLIZLLLIL);
                }
            }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 604));
            LJJIFFI(new C2217381BqS() { // from class: X.0tHI
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((i3) obj).LLJ);
                }
            }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 606));
            LJJIFFI(new C2217381BqS() { // from class: X.0tFN
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Integer.valueOf(((i3) obj).LLJJI);
                }
            }, Lifecycle.State.STARTED, new AwS604S0100000_25(this, 609));
            LJJIII(this, new C2217381BqS() { // from class: X.0tFP
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((i3) obj).LLJILLL;
                }
            }, new AwS604S0100000_25(this, 610));
            if (!this.LLJJJJLIIL) {
                LJJIII(this, new C2217381BqS() { // from class: X.0tFQ
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((i3) obj).LLJJIII;
                    }
                }, new AwS604S0100000_25(this, 612));
            }
            LJIIL();
            LJIILIIL(0);
        } else {
            this.LLJJJJ.LIZLLL(new AwS604S0100000_25(i3Var, 597), true);
        }
        View view = this.LLILZ;
        if (view != null) {
            view.setContentDescription(LJJ().getText());
            q0.LJJIFFI(view, i3Var.LLJILJIL);
            q0.LJIJ(view, new C20094213jo() { // from class: X.0mRH
                @Override // X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    accessibilityNodeInfoCompat.setClassName(Button.class.getName());
                    accessibilityNodeInfoCompat.addAction(new C20092413jW(16, this.LIZ.LJIILL(i3Var)));
                }
            });
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC1659350tHZ
    public void LJIIJJI(View view) {
        ImageView imageView;
        View viewLJIJI = view;
        this.LLJ = viewLJIJI;
        this.LLJILJIL = (FrameLayout) viewLJIJI.findViewById(R.id.cw5);
        this.LLJILJILJ = (TuxTextView) viewLJIJI.findViewById(R.id.y7m);
        this.LLJILLL = (SmartImageView) viewLJIJI.findViewById(R.id.y74);
        this.LLJJ = (C1295960jpS) viewLJIJI.findViewById(R.id.y7d);
        this.LLJI = (TuxIconView) viewLJIJI.findViewById(R.id.y7h);
        this.LLJJI = (ImageView) viewLJIJI.findViewById(R.id.ll5);
        this.LLJJIII = (ImageView) viewLJIJI.findViewById(R.id.lxg);
        C1657820tF6.LIZ.getClass();
        if (C1657820tF6.LIZIZ() && (imageView = this.LLJJI) != null) {
            imageView.setImageResource(R.drawable.au5);
        }
        SmartImageView smartImageViewLJIJI = LJIJI();
        FrameLayout frameLayout = this.LLJILJIL;
        if (frameLayout != null) {
            C1654400t9a c1654400t9a = new C1654400t9a(viewLJIJI, smartImageViewLJIJI, frameLayout, LJIJJ(), LJJ(), this.LLJIJIL);
            if (C295350Bht.LIZ()) {
                LJJIIJZLJL();
            }
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_toolbar_click_on_icon_view", true, false)) {
                viewLJIJI = LJIJI();
            }
            C786410Ut5.I7(new AkS62S0200000_25(this, c1654400t9a, 1), viewLJIJI);
            viewLJIJI.setOnLongClickListener(new ViewOnLongClickListenerC1698090uI3(this, c1654400t9a, 0));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public void LJIILIIL(int i) {
        Function1<C1459730o5b, Unit> function1;
        i3 i3VarLJIILLIIL = LJIILLIIL();
        if (i3VarLJIILLIIL != null && (function1 = i3VarLJIILLIIL.LLJJ) != null) {
            function1.invoke(new C1459730o5b(LJIJI(), LJJ(), i, this.LLJIJIL, this.LLJJIII, LJIJJLI()));
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final CharSequence LJIILL(i3 i3Var) {
        String itemTag = i3Var.LLILLL.getItemTag();
        switch (itemTag.hashCode()) {
            case -1480275166:
                if (!itemTag.equals("reverse_camera")) {
                    return null;
                }
                return LJIILJJIL(2131823261);
            case -1393028996:
                if (!itemTag.equals("beauty")) {
                    return null;
                }
                if (i3Var.LLIZ) {
                    return LJIILJJIL(2131823267);
                }
                return LJIILJJIL(2131823266);
            case -1274492040:
                if (!itemTag.equals("filter")) {
                    return null;
                }
                return LJIILJJIL(2131823253);
            case 3556653:
                if (!itemTag.equals("text")) {
                    return null;
                }
                return LJIILJJIL(2131823254);
            case 108285963:
                if (!itemTag.equals("ratio")) {
                    return null;
                }
                return LJIILJJIL(2131823181);
            case 109641799:
                if (!itemTag.equals("speed")) {
                    return null;
                }
                return LJIILJJIL(2131823256);
            case 110364485:
                if (!itemTag.equals("timer")) {
                    return null;
                }
                return LJIILJJIL(2131823255);
            default:
                return null;
        }
    }

    public final void LJJIIJ(AbstractC1659040tH4 abstractC1659040tH4, boolean z) {
        boolean z2;
        long j;
        Animator animator;
        boolean z3;
        int i;
        Animator animator2;
        if (this.LLJILJILJ == null) {
            return;
        }
        if (this.LLILZIL && (abstractC1659040tH4 instanceof AbstractC1659030tH3)) {
            abstractC1659040tH4.getClass();
            if (abstractC1659040tH4 instanceof C1659020tH2) {
                abstractC1659040tH4 = C1659080tH8.LIZ;
            } else if (abstractC1659040tH4 instanceof C1659010tH1) {
                abstractC1659040tH4 = C1659070tH7.LIZ;
            } else {
                throw new C1954807lC();
            }
        }
        float f = 0.5f;
        if (abstractC1659040tH4 instanceof AbstractC1659050tH5) {
            Object tag = LJJ().getTag();
            if ((tag instanceof Animator) && (animator2 = (Animator) tag) != null) {
                animator2.cancel();
            }
            if ((abstractC1659040tH4 instanceof C1659080tH8) && !z) {
                z3 = true;
            } else {
                z3 = false;
            }
            TuxTextView tuxTextViewLJJ = LJJ();
            if (z3) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextViewLJJ, i);
            TuxTextView tuxTextViewLJJ2 = LJJ();
            if (z3) {
                i3 i3VarLJIILLIIL = LJIILLIIL();
                if (i3VarLJIILLIIL == null || i3VarLJIILLIIL.LLIZLLLIL) {
                    f = 1.0f;
                }
            } else {
                f = 0.0f;
            }
            C786410Ut5.B5(tuxTextViewLJJ2, f);
            return;
        }
        if (!(abstractC1659040tH4 instanceof AbstractC1659030tH3)) {
            return;
        }
        Object tag2 = LJJ().getTag();
        if ((tag2 instanceof Animator) && (animator = (Animator) tag2) != null) {
            animator.cancel();
        }
        if ((abstractC1659040tH4 instanceof C1659020tH2) && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        float alpha = LJJ().getAlpha();
        if (z2) {
            i3 i3VarLJIILLIIL2 = LJIILLIIL();
            if (i3VarLJIILLIIL2 == null || i3VarLJIILLIIL2.LLIZLLLIL) {
                f = 1.0f;
            }
        } else {
            f = 0.0f;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(LJJ(), (Property<TuxTextView, Float>) View.ALPHA, alpha, f);
        if (z2) {
            j = 250;
        } else {
            j = 200;
        }
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.addListener(new ALAdapterS9S0110000_25(this, z2, 0));
        LJJ().setTag(objectAnimatorOfFloat);
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public C1659140tHE(LifecycleOwner lifecycleOwner, List<View> list, InterfaceC1659200tHK interfaceC1659200tHK) {
        super(lifecycleOwner, list);
        this.LLIZ = list;
        this.LLIZLLLIL = interfaceC1659200tHK;
        this.LLJJIJI = new HashMap<>();
        this.LLJJIJIIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLJJIJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
        this.LLJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        this.LLJJJIL = true;
    }

    public static void LJJIII(C1659140tHE c1659140tHE, C2217381BqS c2217381BqS, Function1 function1) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        C1664680tQA<i3> c1664680tQA = c1659140tHE.LLJJJJ;
        if (c1664680tQA != null) {
            c1664680tQA.LIZ(c2217381BqS).LJIIIZ(c1659140tHE, state, new AwS601S0100000_22(function1, (Function1<? super Map<Integer, String>, Unit>) 662));
        }
    }

    public final void LJJIFFI(C2217381BqS c2217381BqS, Lifecycle.State state, Function1 function1) {
        C1664680tQA<i3> c1664680tQA = this.LLJJJJ;
        if (c1664680tQA == null) {
            return;
        }
        c1664680tQA.LIZ(c2217381BqS).LJIIIZ(this, state, function1);
    }
}
