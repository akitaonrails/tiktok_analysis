package X;

import Y.ARunnableS104S0100000_4;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import kotlin.Unit;
import kotlin.jvm.internal.AwS370S0200000_4;

/* JADX INFO: renamed from: X.0H1U, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H1U {
    public static final void LIZIZ(View view) {
        C12ES.LJIILL(8, view);
    }

    public static float LIZLLL(TextView textView) {
        return textView.getPaint().measureText(textView.getText().toString());
    }

    public static void LIZ(TextView textView, View view) {
        C786410Ut5.LJLLLLLL(0, view);
        view.addOnLayoutChangeListener(new C0IDP(textView, 2));
    }

    public static final void LJFF(InterfaceC1334290kpH interfaceC1334290kpH, Image image) {
        C1326790kdB c1326790kdB = C1326790kdB.LIZ;
        C03IT imageUrlModel = image.toImageUrlModel();
        c1326790kdB.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(imageUrlModel);
        c1331670kl3LIZLLL.LJJ(interfaceC1334290kpH);
        C786410Ut5.h3(c1331670kl3LIZLLL);
    }

    public static final void LJI(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            C786410Ut5.W5(view, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void LJII(int i, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static final void LJIIIIZZ(int i, View view) {
        view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final void LJIIIZ(int i, View view) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static final void LJIIJ(int i, View view) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static final View LIZJ(int i, View view, boolean z) {
        return C786410Ut5.Td(C786410Ut5.ne(view.getContext()), i, (ViewGroup) view, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Cl2, android.view.View$OnLayoutChangeListener] */
    public static final Object LJ(final View view, InterfaceC1364105Vn interfaceC1364105Vn, final boolean z) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        ?? r2 = new View.OnLayoutChangeListener() { // from class: X.0Cl2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                view.removeOnLayoutChangeListener(this);
                if (z) {
                    HandlerHook.viewPost(view, new ARunnableS104S0100000_4(c2252611DEt, 20));
                    return;
                }
                InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                Unit unit = Unit.LIZ;
                C189200o6.m2constructorimpl(unit);
                interfaceC20236714Gf.resumeWith(unit);
            }
        };
        c2252611DEt.LJJII(new AwS370S0200000_4(view, (ViewOnLayoutChangeListenerC322780Cl2) r2, 17));
        view.addOnLayoutChangeListener(r2);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    public static final void LJIIJJI(TextView textView, CharSequence charSequence, String str) {
        if (charSequence == null || charSequence.length() == 0) {
            charSequence = str;
        }
        textView.setText(charSequence);
    }

    public static final void LJIIL(TextView textView, CharSequence charSequence, boolean z) {
        int i = 0;
        if (!z && (charSequence == null || charSequence.length() == 0)) {
            return;
        }
        textView.setText(charSequence);
        if (charSequence == null || charSequence.length() == 0) {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, textView);
    }
}
