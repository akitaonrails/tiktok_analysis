package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS159S0101000_19;

/* JADX INFO: renamed from: X.0iiv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253470iiv {
    public static final void LIZ(View view, boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.s5q);
        C1253900ijc c1253900ijcLJLIIIL = C19252910Tv.LIZIZ.LIZLLL().LJI().LJLIIIL(viewGroup2.getContext(), (TuxTextView) view.findViewById(R.id.s1h), (TuxIconView) view.findViewById(R.id.s1e), view.findViewById(R.id.t25), z);
        View childAt = viewGroup2.getChildAt(0);
        if ((childAt instanceof LinearLayout) && (viewGroup = (ViewGroup) childAt) != null) {
            viewGroup.addView(c1253900ijcLJLIIIL);
            if (c1253900ijcLJLIIIL != null) {
                ViewGroup.LayoutParams layoutParams = c1253900ijcLJLIIIL.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                    C786410Ut5.W5(c1253900ijcLJLIIIL, layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
    }

    public static final void LIZJ(int i, View view) {
        C1253900ijc c1253900ijc;
        View viewFindViewById = view.findViewById(R.id.s5q);
        View childAt = ((ViewGroup) view.findViewById(R.id.s5r)).getChildAt(1);
        if (childAt instanceof C1253900ijc) {
            c1253900ijc = (C1253900ijc) childAt;
        } else {
            c1253900ijc = null;
        }
        C430110Gtl.LIZ(viewFindViewById, new AwS159S0101000_19(i, c1253900ijc, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.view.View r20, int r21, boolean r22, int r23) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1253470iiv.LIZIZ(android.view.View, int, boolean, int):void");
    }
}
