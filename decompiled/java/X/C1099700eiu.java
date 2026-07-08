package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eiu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099700eiu {
    public static int LIZ;
    public static C1099720eiw LIZIZ;
    public static final Queue<C1099720eiw> LIZJ = new LinkedList();

    public static void LIZIZ(ViewGroup viewGroup) {
        C1099690eit c1099690eit;
        C19ME c19me;
        Function0<Unit> function0;
        C1099720eiw c1099720eiw = LIZIZ;
        if (c1099720eiw != null && (c1099690eit = c1099720eiw.LIZ) != null) {
            if (c1099690eit.LIZJ == EnumC1099670eir.SHOW && (function0 = c1099690eit.LJFF) != null) {
                function0.invoke();
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                c19me.leftToRight = R.id.mlc;
                c19me.rightToLeft = R.id.tml;
                ((ViewGroup.MarginLayoutParams) c19me).width = 0;
                C786410Ut5.W5(viewGroup, c19me);
            }
            LIZIZ = null;
            C1099720eiw c1099720eiw2 = (C1099720eiw) ((LinkedList) LIZJ).poll();
            if (c1099720eiw2 != null) {
                LIZIZ = c1099720eiw2;
                LIZ(viewGroup, c1099720eiw2.LIZ);
                C19748612Om.LIZ(viewGroup, c1099720eiw2.LIZIZ);
            }
        }
    }

    public static void LIZ(View view, C1099690eit c1099690eit) {
        C19ME c19me;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            int i = C1085020eLE.LIZ[c1099690eit.LIZLLL.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    c19me.rightToLeft = -1;
                } else {
                    throw new C1954807lC();
                }
            } else {
                c19me.leftToRight = -1;
            }
            ((ViewGroup.MarginLayoutParams) c19me).width = c1099690eit.LJ;
            C786410Ut5.W5(view, c19me);
        }
    }
}
