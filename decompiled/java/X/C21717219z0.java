package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import g1c.AjS15S0000000_33;
import g1c.AjS73S0100000_33;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19z0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21717219z0 {
    public static final void LIZ(View view) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        while (!linkedList.isEmpty()) {
            View view2 = (View) linkedList.poll();
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    linkedList.add(viewGroup.getChildAt(i));
                }
            }
            if (view2 != null) {
                C786410Ut5.I7(new AjS15S0000000_33(8), view2);
            }
        }
    }

    public static final void LIZIZ(View view) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        while (!linkedList.isEmpty()) {
            View view2 = (View) linkedList.poll();
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    linkedList.add(viewGroup.getChildAt(i));
                }
            }
            if (view2 != null) {
                view2.setEnabled(false);
            }
        }
    }

    public static final void LIZLLL(View view, Function0<Unit> function0) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        while (!linkedList.isEmpty()) {
            View view2 = (View) linkedList.poll();
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    linkedList.add(viewGroup.getChildAt(i));
                }
            }
            if (view2 != null) {
                C786410Ut5.I7(new AjS73S0100000_33(function0, 7), view2);
            }
        }
    }

    public static final void LIZJ(TuxTextView tuxTextView, C21717319z1 c21717319z1, boolean z) {
        String str;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4 = null;
        if (c21717319z1 != null) {
            str = c21717319z1.LIZ;
        } else {
            str = null;
        }
        C0H1U.LJIIL(tuxTextView, str, true);
        if (c21717319z1 != null) {
            num = c21717319z1.LIZIZ;
            num2 = c21717319z1.LIZLLL;
        } else {
            num = null;
            num2 = null;
        }
        tuxTextView.setTextColorRes(C7736030k.LIZ(num, num2));
        if (c21717319z1 != null) {
            num3 = c21717319z1.LIZJ;
            num4 = c21717319z1.LJ;
        } else {
            num3 = null;
        }
        tuxTextView.setTuxFont(C7736030k.LIZJ(num3, num4));
        if (z) {
            tuxTextView.getPaint().setFlags(16);
            tuxTextView.getPaint().setAntiAlias(true);
        }
    }
}
