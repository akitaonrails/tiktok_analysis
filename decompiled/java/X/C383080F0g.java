package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383080F0g extends AbstractC383250F0x {
    public final ViewGroup LIZIZ;
    public final Function1<C379170Etn, Float> LIZJ;
    public final C383650F2l LIZLLL;
    public final C383640F2k LJ;
    public final C01GW LJFF;
    public final C01GW LJI;
    public final C0FX0 LJII;
    public int LJIIIIZZ;
    public final Map<String, Float> LJIIIZ;
    public List<C379170Etn> LJIIJ;

    public final void LIZIZ() {
        Pair pair;
        int iLIZIZ;
        int i = ((View) this.LJFF.getValue()).getLayoutParams().height;
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        int size = this.LJIIJ.size();
        int i2 = i - (iLIZIZ2 + iLIZIZ3);
        int iLJIIIIZZ = C14KQ.LJIIIIZZ(this.LIZ.getContext());
        C369780Eee.LIZ.getClass();
        if (C369780Eee.LIZIZ()) {
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
            int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(66));
            if (size == 1) {
                int iLIZIZ6 = iLJIIIIZZ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) * 2);
                C379170Etn c379170Etn = (C379170Etn) C13LP.LJJJLL(this.LJIIJ);
                if (c379170Etn == null) {
                    pair = new Pair(Integer.valueOf(iLIZIZ6), Integer.valueOf(i2));
                } else {
                    float fLIZ = LIZ(c379170Etn);
                    int i3 = (int) (iLIZIZ6 / fLIZ);
                    if (i3 > i2) {
                        int i4 = (int) (i2 * fLIZ);
                        if (i4 >= iLIZIZ4) {
                            iLIZIZ4 = i4;
                        }
                        pair = new Pair(Integer.valueOf(iLIZIZ4), Integer.valueOf(i2));
                    } else {
                        if (i3 >= iLIZIZ5) {
                            iLIZIZ5 = i3;
                        }
                        int i5 = (int) (iLIZIZ5 * fLIZ);
                        if (i5 <= iLIZIZ6) {
                            iLIZIZ6 = i5;
                        }
                        pair = new Pair(Integer.valueOf(iLIZIZ6), Integer.valueOf(iLIZIZ5));
                    }
                }
            } else {
                int iLIZIZ7 = ((((iLJIIIIZZ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)))) / 2) * 4) / 3;
                if (iLIZIZ7 <= i2) {
                    i2 = iLIZIZ7;
                }
                pair = new Pair(Integer.valueOf((int) ((i2 * 3.0f) / 4.0f)), Integer.valueOf(i2));
            }
        } else {
            if (size == 1 ? (iLIZIZ = ((iLJIIIIZZ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) * 2)) * 4) / 3) <= i2 : size == 2 && (iLIZIZ = ((((iLJIIIIZZ - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)))) / 2) * 4) / 3) <= i2) {
                i2 = iLIZIZ;
            }
            pair = new Pair(Integer.valueOf((int) ((i2 * 3.0f) / 4.0f)), Integer.valueOf(i2));
        }
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        C383650F2l c383650F2l = this.LIZLLL;
        c383650F2l.LIZIZ().getLayoutParams().width = iIntValue;
        c383650F2l.LIZIZ().getLayoutParams().height = iIntValue2;
        c383650F2l.LIZIZ().requestLayout();
        C383640F2k c383640F2k = this.LJ;
        c383640F2k.LIZIZ().getLayoutParams().width = iIntValue;
        c383640F2k.LIZIZ().getLayoutParams().height = iIntValue2;
        c383640F2k.LIZIZ().requestLayout();
    }

    public final float LIZ(C379170Etn c379170Etn) {
        float fLIZ;
        String strLIZIZ = c379170Etn.LIZIZ();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJIIIZ;
        Object objValueOf = linkedHashMap.get(strLIZIZ);
        if (objValueOf == null) {
            if (c379170Etn.LIZJ() && c379170Etn.LIZJ == null) {
                Float fInvoke = this.LIZJ.invoke(c379170Etn);
                if (fInvoke != null) {
                    fLIZ = fInvoke.floatValue();
                } else {
                    fLIZ = 0.75f;
                }
            } else {
                fLIZ = C383680F2o.LIZ(this.LIZ.getContext(), c379170Etn.LIZIZ());
            }
            objValueOf = Float.valueOf(fLIZ);
            linkedHashMap.put(strLIZIZ, objValueOf);
        }
        return ((Number) objValueOf).floatValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0F2j, X.0F2l] */
    public C383080F0g(ViewGroup viewGroup, final C383160F0o c383160F0o, final C383140F0m c383140F0m, Function1 function1, Function0 function0) {
        super(viewGroup);
        this.LIZIZ = viewGroup;
        this.LIZJ = function1;
        final View viewFindViewById = viewGroup.findViewById(R.id.vy8);
        ?? r1 = new AbstractC383630F2j(viewFindViewById, c383160F0o, c383140F0m) { // from class: X.0F2l
            {
                AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(c383160F0o, 1187);
                AwS549S0100000_5 awS549S0100000_52 = new AwS549S0100000_5(c383140F0m, 1188);
            }
        };
        r1.LJIIIIZZ = function0;
        this.LIZLLL = r1;
        C383640F2k c383640F2k = new C383640F2k(viewGroup.findViewById(R.id.h4c), c383160F0o, c383140F0m);
        c383640F2k.LJIIIIZZ = function0;
        this.LJ = c383640F2k;
        this.LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1195));
        this.LJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1194));
        this.LJIIIZ = new LinkedHashMap();
        this.LJIIJ = C13BV.INSTANCE;
        this.LJII = new C0FX0(this, 2);
        C786410Ut5.x3(viewGroup.getViewTreeObserver(), this.LJII);
    }
}
