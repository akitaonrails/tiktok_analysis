package X;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0soC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641140soC {
    public static final C1641140soC LIZ = new C1641140soC();

    public static final List<Integer> LIZLLL() {
        return C1697810uHb.LJIILJJIL(Integer.valueOf(R.layout.fvr), Integer.valueOf(R.layout.fvq));
    }

    public static final C1642680sqg LIZIZ(Context context) {
        C1642680sqg c1642680sqg = new C1642680sqg(14, context, false);
        c1642680sqg.setOnlyBoldOnSelection(C12VA.LIZ().LIZJ);
        return c1642680sqg;
    }

    public static final C1642680sqg LIZJ(Context context, boolean z) {
        C1642680sqg c1642680sqg = new C1642680sqg(6, context, z);
        c1642680sqg.setOnlyBoldOnSelection(C12VA.LIZ().LIZJ);
        return c1642680sqg;
    }

    public static final C1662870tNF LIZ(Context context, Function1<? super TextView, Unit> function1, Function1<? super C1641170soF, Unit> function12) {
        C1641170soF c1641170soF = new C1641170soF(context);
        function12.invoke(c1641170soF);
        boolean z = c1641170soF.LIZIZ;
        int i = c1641170soF.LIZJ;
        int i2 = c1641170soF.LJ;
        int i3 = c1641170soF.LJFF;
        int i4 = c1641170soF.LJI;
        int i5 = c1641170soF.LJII;
        int i6 = c1641170soF.LJIIIIZZ;
        boolean z2 = c1641170soF.LJIIIZ;
        int i7 = c1641170soF.LJIIJ;
        int i8 = c1641170soF.LJIIJJI;
        int i9 = c1641170soF.LJIIL;
        int i10 = c1641170soF.LJIILIIL;
        int i11 = c1641170soF.LJIILL;
        boolean z3 = c1641170soF.LJIILLIIL;
        boolean z4 = c1641170soF.LJIIZILJ;
        int i12 = c1641170soF.LJIJI;
        int i13 = c1641170soF.LJIJJLI;
        int i14 = c1641170soF.LJIL;
        int i15 = c1641170soF.LIZLLL;
        if (i15 == -1) {
            i15 = i;
        }
        boolean z5 = c1641170soF.LJIJ;
        boolean z6 = c1641170soF.LJJ;
        int i16 = c1641170soF.LJIJJ;
        int i17 = c1641170soF.LJIILJJIL;
        boolean z7 = c1641170soF.LJJI;
        boolean z8 = c1641170soF.LJJII;
        int i18 = c1641170soF.LJJIII;
        if (i18 == -1) {
            i18 = i;
        }
        C1662870tNF c1662870tNF = new C1662870tNF(context, z, i, i2, i3, i4, i5, i6, z2, 12, 20, i7, i8, i9, i10, i11, z3, z4, i12, i13, i14, 2, i15, z5, z6, false, i16, i17, z7, false, z8, i18, 536870912, 0);
        TextView textView = c1662870tNF.getTextView();
        if (textView != null) {
            if (C12VA.LIZ().LJFF) {
                textView.setTextSize(12.0f);
                C19734012Iw.LIZJ(textView);
            } else {
                textView.setTextSize(11.0f);
                textView.setTypeface(Typeface.defaultFromStyle(0));
            }
            if (function1 != null) {
                function1.invoke(textView);
            }
        }
        return c1662870tNF;
    }
}
