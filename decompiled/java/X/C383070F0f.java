package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0F0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383070F0f {
    public final View LIZ;
    public final Function1<C0F04, Unit> LIZIZ;
    public final Function1<C379170Etn, Float> LIZJ;
    public final Function0<Unit> LIZLLL;
    public InterfaceC383170F0p LJ;
    public InterfaceC383270F0z LJFF;
    public final C2252321DDq LJI;
    public final C2252321DDq LJII;
    public final C01GW LJIIIIZZ;
    public final C383080F0g LJIIIZ;
    public final C01GW LJIIJ;
    public final C383120F0k LJIIJJI;
    public final C383230F0v LJIIL;
    public boolean LJIILIIL;
    public C382700EzU LJIILJJIL;
    public AnonymousClass0956 LJIILL;

    public final void LIZIZ(int i) {
        C2252321DDq c2252321DDq;
        this.LIZIZ.invoke(new C0F04() { // from class: X.0F05
        });
        int i2 = C382760Eza.LIZ[this.LJIILJJIL.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                c2252321DDq = this.LJI;
            } else {
                throw new C1954807lC();
            }
        } else {
            c2252321DDq = this.LJII;
        }
        if (i >= 0 && i < ((Collection) c2252321DDq.getValue()).size()) {
            c2252321DDq.setValue(C13LP.LJLIIIL(ListProtector.get((List) c2252321DDq.getValue(), i), (Iterable) c2252321DDq.getValue()));
        }
    }

    public final void LIZ(C379170Etn c379170Etn, int i) {
        C2252321DDq c2252321DDq;
        List listLJLILLLLZI;
        int i2 = C382760Eza.LIZ[this.LJIILJJIL.LIZ.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                c2252321DDq = this.LJI;
            } else {
                throw new C1954807lC();
            }
        } else {
            c2252321DDq = this.LJII;
        }
        if (i == -1) {
            listLJLILLLLZI = C13LP.LJLILLLLZI(c379170Etn, (Collection) c2252321DDq.getValue());
        } else {
            ArrayList arrayList = new ArrayList((Collection) c2252321DDq.getValue());
            listLJLILLLLZI = arrayList;
            if (i >= 0) {
                int size = arrayList.size();
                listLJLILLLLZI = arrayList;
                if (i < size) {
                    ListProtector.set(arrayList, i, c379170Etn);
                    listLJLILLLLZI = arrayList;
                }
            }
        }
        c2252321DDq.setValue(listLJLILLLLZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C383070F0f(View view, Function1<? super C0F04, Unit> function1, Function1<? super C379170Etn, Float> function12, Function0<Unit> function0) {
        this.LIZ = view;
        this.LIZIZ = function1;
        this.LIZJ = function12;
        this.LIZLLL = function0;
        C1DFH c1dfh = C0PEM.LIZ;
        C054G c054gLIZ = C2296808zG.LIZ(C2107308Nj.LIZ);
        C13BV c13bv = C13BV.INSTANCE;
        this.LJI = C1BNE.LIZ(c13bv);
        this.LJII = C1BNE.LIZ(c13bv);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 274));
        this.LJIIIIZZ = c01gwLIZIZ;
        this.LJIIIZ = new C383080F0g((ViewGroup) c01gwLIZIZ.getValue(), new C383160F0o(this), new C383140F0m(this), function12, function0);
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS549S0100000_5(this, 273));
        this.LJIIJ = c01gwLIZIZ2;
        this.LJIIJJI = new C383120F0k((ViewGroup) c01gwLIZIZ2.getValue(), new C383150F0n(this), new C383130F0l(this), function0);
        this.LJIIL = new C383230F0v(view, new C383040F0c(this));
        this.LJIILJJIL = new C382700EzU(EnumC382750EzZ.VIDEO);
        C23250099c.LIZLLL(c054gLIZ, null, null, new C383100F0i(this, null), 3);
        C23250099c.LIZLLL(c054gLIZ, null, null, new C383110F0j(this, null), 3);
    }
}
