package X;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0e93, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077470e93 implements InterfaceC469360Ias {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onPageScrollStateChanged$1(C1077470e93 c1077470e93, int i) {
    }

    public static final void onPageScrolled$0(C1077470e93 c1077470e93, int i, float f, int i2) {
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        switch (this.$t) {
            case 0:
                onPageScrollStateChanged$0(this, i);
                break;
            case 1:
                onPageScrollStateChanged$1(this, i);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        switch (this.$t) {
            case 0:
                onPageScrolled$0(this, i, f, i2);
                break;
            case 1:
                onPageScrolled$1(this, i, f, i2);
                break;
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        switch (this.$t) {
            case 0:
                onPageSelected$0(this, i);
                break;
            case 1:
                onPageSelected$1(this, i);
                break;
        }
    }

    public static final void onPageScrollStateChanged$0(C1077470e93 c1077470e93, int i) {
        if (i != 0) {
            if (i == 1) {
                ((C1011930cRL) c1077470e93.l0).LJJJJ();
                ((C1011930cRL) c1077470e93.l0).LLLZIL = true;
                return;
            }
            return;
        }
        C1011930cRL c1011930cRL = (C1011930cRL) c1077470e93.l0;
        if (c1011930cRL.LLLLZLLIL != c1011930cRL.LLLLZLLLI - 1 || !c1011930cRL.LLLZIIL) {
            return;
        }
        c1011930cRL.LLFFF(0, false);
        int i2 = C2510609se.LIZ;
    }

    public static final void onPageSelected$0(C1077470e93 c1077470e93, int i) {
        ((C1011930cRL) c1077470e93.l0).LLLLZLLIL = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPageSelected currentPos");
        sbLIZ.append(((C1011930cRL) c1077470e93.l0).LLLLZLLIL);
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        int i2 = C2510609se.LIZ;
        Function1<Integer, Unit> function1 = ((C1011950cRN) c1077470e93.l1).LIZLLL;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    public static final void onPageSelected$1(C1077470e93 c1077470e93, int i) {
        LinearLayout linearLayout = ((C1051950dTt) c1077470e93.l0).LL;
        if (linearLayout == null) {
            linearLayout = null;
        }
        View childAt = linearLayout.getChildAt(i);
        View view = ((C1051950dTt) c1077470e93.l0).LLILLL;
        if (view != null) {
            view.setSelected(false);
        }
        if (childAt != null) {
            childAt.setSelected(true);
            ((C1051950dTt) c1077470e93.l0).LLILLL = childAt;
        }
        InterfaceC1051960dTu interfaceC1051960dTu = (InterfaceC1051960dTu) c1077470e93.l1;
        if (interfaceC1051960dTu != null) {
            interfaceC1051960dTu.onSelect(i);
        }
    }

    public C1077470e93(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onPageScrolled$1(C1077470e93 c1077470e93, int i, float f, int i2) {
        C1051950dTt c1051950dTt = (C1051950dTt) c1077470e93.l0;
        View view = c1051950dTt.LLILLJJLI;
        if (view == null) {
            view = null;
        }
        c1051950dTt.LIZ(f, i, view);
    }
}
