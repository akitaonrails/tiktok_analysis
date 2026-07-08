package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0hkR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215970hkR {
    public static final C11G4 LIZ(C127K c127k) {
        C127M accessory = c127k.getAccessory();
        if (accessory instanceof C11G4) {
            return (C11G4) accessory;
        }
        return null;
    }

    public static final String LIZIZ(C127K c127k) {
        CharSequence charSequenceLJIIL;
        String string;
        C11G4 c11g4LIZ = LIZ(c127k);
        if (c11g4LIZ == null || (charSequenceLJIIL = c11g4LIZ.LJIIL()) == null || (string = charSequenceLJIIL.toString()) == null) {
            return "";
        }
        return string;
    }

    public static final void LIZLLL(C127K c127k, String str) {
        LinearLayoutCompat linearLayoutCompat;
        C11G4 c11g4LIZ = LIZ(c127k);
        if (c11g4LIZ == null) {
            return;
        }
        c11g4LIZ.LJIILJJIL(str);
        TuxTextView tuxTextView = (TuxTextView) c127k.findViewById(R.id.y3j);
        if (C1EDI.LJ()) {
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C1216270hkv.LIZIZ(0)), Integer.valueOf(C1216270hkv.LIZIZ(6)), Integer.valueOf(C1216270hkv.LIZIZ(0)), Integer.valueOf(C1216270hkv.LIZIZ(6)), 16);
            C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C1216270hkv.LIZIZ(16)), 0, 0, 0, false, 16);
            if (tuxTextView.getResources().getConfiguration().screenWidthDp < 320) {
                layoutParams.width = C1216270hkv.LIZIZ(100);
            } else {
                layoutParams.width = C1216270hkv.LIZIZ(110);
            }
            layoutParams.height = -1;
            C786410Ut5.R6(tuxTextView, layoutParams);
            tuxTextView.setTuxFont(41);
            tuxTextView.setTextColorRes(R.attr.a1j);
            tuxTextView.setGravity(8388627);
        } else {
            C426750GoL.LJIIIZ(tuxTextView, null, Integer.valueOf(C1216270hkv.LIZIZ(14)), null, Integer.valueOf(C1216270hkv.LIZIZ(14)), false, 21);
        }
        C11G3 c11g3 = c11g4LIZ.LIZIZ;
        if (C1EDI.LJ()) {
            View view = (View) ((View) c11g3.getParent()).getParent();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = -1;
            C426750GoL.LJIIIZ(view, 0, 0, 0, 0, false, 16);
            C426750GoL.LJIIL(view, 0, 0, 0, 0, 16);
            C786410Ut5.W5(view, layoutParams2);
            View view2 = (View) c11g3.getParent();
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            layoutParams3.height = -1;
            C426750GoL.LJIIIZ(view2, 0, 0, 0, 0, false, 16);
            C426750GoL.LJIIL(view2, 0, 0, 0, 0, 16);
            C786410Ut5.W5(view2, layoutParams3);
        }
        if (C1EDI.LJ()) {
            C426750GoL.LJIIIZ(c11g3, 0, 0, 0, 0, false, 16);
            View childAt = c11g3.getChildAt(0);
            if ((childAt instanceof LinearLayoutCompat) && (linearLayoutCompat = (LinearLayoutCompat) childAt) != null) {
                C19ME c19me = (C19ME) c11g3.getLayoutParams();
                c19me.startToEnd = R.id.y3j;
                c19me.endToEnd = 0;
                ((ViewGroup.MarginLayoutParams) c19me).width = C1216270hkv.LIZIZ(0);
                c19me.horizontalWeight = 1.0f;
                ((ViewGroup.MarginLayoutParams) c19me).height = -1;
                c127k.setGravity(16);
                C786410Ut5.X5(c19me, c11g3);
                ViewGroup.LayoutParams layoutParams4 = linearLayoutCompat.getLayoutParams();
                layoutParams4.width = -1;
                layoutParams4.height = -1;
                linearLayoutCompat.setGravity(16);
                C426750GoL.LJIIL(linearLayoutCompat, 0, 0, 0, 0, 16);
                C426750GoL.LJIIIZ(linearLayoutCompat, 0, 0, 0, 0, false, 16);
                C786410Ut5.i6(linearLayoutCompat, layoutParams4);
                TuxIconView tuxIconView = (TuxIconView) c11g3.findViewById(R.id.k1_);
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) tuxIconView.getLayoutParams();
                layoutParams5.width = C1216270hkv.LIZIZ(16);
                layoutParams5.height = C1216270hkv.LIZIZ(16);
                C426750GoL.LJIIL(tuxIconView, 0, 0, 0, 0, 16);
                C426750GoL.LJIIIZ(tuxIconView, 0, 0, Integer.valueOf(C1216270hkv.LIZIZ(16)), 0, false, 16);
                layoutParams5.gravity = 8388629;
                C786410Ut5.M6(tuxIconView, layoutParams5);
            } else {
                return;
            }
        }
        TuxTextView tuxTextView2 = (TuxTextView) c11g3.findViewById(R.id.m4r);
        if (C1EDI.LJ()) {
            tuxTextView2.setGravity(16);
            tuxTextView2.setTextAlignment(5);
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) tuxTextView2.getLayoutParams();
            layoutParams6.gravity = 8388627;
            C426750GoL.LJIIL(tuxTextView2, Integer.valueOf(C1216270hkv.LIZIZ(10)), null, Integer.valueOf(C1216270hkv.LIZIZ(8)), null, 26);
            C426750GoL.LJIIIZ(tuxTextView2, 0, 0, 0, 0, false, 16);
            layoutParams6.width = C1216270hkv.LIZIZ(0);
            layoutParams6.height = -1;
            layoutParams6.weight = 1.0f;
            C786410Ut5.R6(tuxTextView2, layoutParams6);
            tuxTextView2.setTuxFont(42);
            tuxTextView2.setTextColorRes(R.attr.a1h);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void LIZJ(C127K c127k, String str, boolean z) {
        ?? r15;
        int i;
        int i2;
        LinearLayoutCompat linearLayoutCompat;
        C11G4 c11g4LIZ = LIZ(c127k);
        if (c11g4LIZ == null) {
            return;
        }
        c11g4LIZ.LJIILJJIL(str);
        TuxTextView tuxTextView = (TuxTextView) c127k.findViewById(R.id.y3j);
        int i3 = 0;
        if (C1EDI.LJ()) {
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            r15 = 0;
            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C1216270hkv.LIZIZ(0)), Integer.valueOf(C1216270hkv.LIZIZ(6)), Integer.valueOf(C1216270hkv.LIZIZ(0)), Integer.valueOf(C1216270hkv.LIZIZ(6)), 16);
            i3 = 0;
            C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(C1216270hkv.LIZIZ(16)), 0, 0, 0, false, 16);
            if (tuxTextView.getResources().getConfiguration().screenWidthDp < 320) {
                layoutParams.width = C1216270hkv.LIZIZ(100);
            } else {
                layoutParams.width = C1216270hkv.LIZIZ(110);
            }
            layoutParams.height = -1;
            C786410Ut5.R6(tuxTextView, layoutParams);
            tuxTextView.setTuxFont(41);
            tuxTextView.setTextColorRes(R.attr.a1j);
            tuxTextView.setGravity(8388627);
        } else {
            r15 = 0;
            C426750GoL.LJIIIZ(tuxTextView, null, Integer.valueOf(C1216270hkv.LIZIZ(14)), null, Integer.valueOf(C1216270hkv.LIZIZ(14)), false, 21);
        }
        C11G3 c11g3 = c11g4LIZ.LIZIZ;
        if (C1EDI.LJ()) {
            View view = (View) ((View) c11g3.getParent()).getParent();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.height = -1;
            C426750GoL.LJIIIZ(view, Integer.valueOf(i3), Integer.valueOf(i3), Integer.valueOf(i3), Integer.valueOf(i3), r15, 16);
            C426750GoL.LJIIL(view, Integer.valueOf((int) r15), Integer.valueOf((int) r15), Integer.valueOf((int) r15), Integer.valueOf((int) r15), 16);
            C786410Ut5.W5(view, layoutParams2);
            View view2 = (View) c11g3.getParent();
            ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
            layoutParams3.height = -1;
            C426750GoL.LJIIIZ(view2, Integer.valueOf((int) r15), Integer.valueOf((int) r15), Integer.valueOf((int) r15), Integer.valueOf((int) r15), r15, 16);
            C426750GoL.LJIIL(view2, Integer.valueOf((int) r15), Integer.valueOf((int) r15), Integer.valueOf((int) r15), Integer.valueOf((int) r15), 16);
            C786410Ut5.W5(view2, layoutParams3);
        }
        Integer numValueOf = Integer.valueOf((int) r15);
        Integer numValueOf2 = Integer.valueOf((int) r15);
        Integer numValueOf3 = Integer.valueOf((int) r15);
        Integer numValueOf4 = Integer.valueOf((int) r15);
        boolean z2 = r15;
        C426750GoL.LJIIIZ(c11g3, numValueOf, numValueOf2, numValueOf3, numValueOf4, z2, 16);
        if (C1EDI.LJ()) {
            View childAt = c11g3.getChildAt(z2 ? 1 : 0);
            if ((childAt instanceof LinearLayoutCompat) && (linearLayoutCompat = (LinearLayoutCompat) childAt) != null) {
                C19ME c19me = (C19ME) c11g3.getLayoutParams();
                c19me.startToEnd = R.id.y3j;
                c19me.endToEnd = z2 ? 1 : 0;
                ((ViewGroup.MarginLayoutParams) c19me).width = C1216270hkv.LIZIZ(z2 ? 1 : 0);
                c19me.horizontalWeight = 1.0f;
                ((ViewGroup.MarginLayoutParams) c19me).height = -1;
                c127k.setGravity(16);
                C786410Ut5.X5(c19me, c11g3);
                ViewGroup.LayoutParams layoutParams4 = linearLayoutCompat.getLayoutParams();
                layoutParams4.width = -1;
                layoutParams4.height = -1;
                linearLayoutCompat.setGravity(16);
                C426750GoL.LJIIL(linearLayoutCompat, Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(z2 ? 1 : 0), 16);
                C426750GoL.LJIIIZ(linearLayoutCompat, Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(z2 ? 1 : 0), z2, 16);
                C786410Ut5.i6(linearLayoutCompat, layoutParams4);
                TuxIconView tuxIconView = (TuxIconView) c11g3.findViewById(R.id.k1_);
                LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) tuxIconView.getLayoutParams();
                layoutParams5.width = C1216270hkv.LIZIZ(16);
                layoutParams5.height = C1216270hkv.LIZIZ(16);
                C426750GoL.LJIIL(tuxIconView, Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(z2 ? 1 : 0), 16);
                C426750GoL.LJIIIZ(tuxIconView, Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(z2 ? 1 : 0), Integer.valueOf(C1216270hkv.LIZIZ(16)), Integer.valueOf(z2 ? 1 : 0), false, 16);
                layoutParams5.gravity = 8388629;
                C786410Ut5.M6(tuxIconView, layoutParams5);
                i = 16;
            } else {
                return;
            }
        } else {
            i = 16;
            C426750GoL.LJIIIZ(c11g3, Integer.valueOf(C1216270hkv.LIZIZ(z2 ? 1 : 0)), Integer.valueOf(C1216270hkv.LIZIZ(14)), null, Integer.valueOf(C1216270hkv.LIZIZ(14)), z2, 20);
            LJFF(c127k, 41, R.attr.a1j);
        }
        TuxTextView tuxTextView2 = (TuxTextView) c11g3.findViewById(R.id.m4r);
        if (C1EDI.LJ()) {
            tuxTextView2.setGravity(i);
            tuxTextView2.setTextAlignment(5);
            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) tuxTextView2.getLayoutParams();
            layoutParams6.gravity = 8388627;
            C426750GoL.LJIIL(tuxTextView2, Integer.valueOf(C1216270hkv.LIZIZ(10)), null, Integer.valueOf(C1216270hkv.LIZIZ(8)), null, 26);
            C426750GoL.LJIIIZ(tuxTextView2, 0, 0, 0, 0, false, 16);
            layoutParams6.width = C1216270hkv.LIZIZ(0);
            layoutParams6.height = -1;
            layoutParams6.weight = 1.0f;
            C786410Ut5.R6(tuxTextView2, layoutParams6);
            tuxTextView2.setTuxFont(41);
        } else {
            tuxTextView2.setTuxFont(102);
            tuxTextView2.getLayoutParams().width = C1216270hkv.LIZIZ(175);
        }
        if (z) {
            i2 = R.attr.a0d;
        } else {
            i2 = R.attr.a1p;
        }
        tuxTextView2.setTextColorRes(i2);
    }

    public static final void LJ(C127K c127k, CharSequence charSequence, boolean z) {
        int i;
        int length;
        C11G4 c11g4LIZ = LIZ(c127k);
        if (c11g4LIZ == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = c11g4LIZ.LJIIL();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        Context context = c127k.getContext();
        if (z) {
            i = R.attr.a1h;
        } else {
            i = R.attr.uh;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
            if (charSequence != null) {
                length = charSequence.length();
            } else {
                length = 0;
            }
            C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, 0, length, 17);
        }
        c11g4LIZ.LJIILJJIL(spannableStringBuilder);
        c127k.setAccessory(c11g4LIZ);
    }

    public static final void LJFF(C127K c127k, int i, int i2) {
        ((TuxTextView) c127k.findViewById(R.id.y3j)).setTuxFont(i);
        ((TuxTextView) c127k.findViewById(R.id.y3j)).setTextColorRes(i2);
    }
}
