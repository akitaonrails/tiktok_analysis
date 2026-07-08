package X;

import X.InterfaceC1618180sDA;
import Y.ARunnableS130S0100000_30;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS644S0100000_30;

/* JADX INFO: renamed from: X.14G4, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C14G4<T extends InterfaceC1618180sDA<T>> {
    public static List<? extends C14G4<?>> LJ = C13BV.INSTANCE;
    public final C14G3<T> LIZ = new C14G3<>(new AwS574S0100000_30(this, 13));
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 12));
    public final ArrayList<C14G9> LIZJ = new ArrayList<>();
    public final C136V<T> LIZLLL = new C136V<>();

    public abstract T LIZ();

    public C14G4() {
        LJ = C13LP.LJLILLLLZI(this, LJ);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.14G5] */
    public final synchronized C14G5 LIZIZ(final C14GK c14gk, final C14G9 c14g9) {
        if (!this.LIZJ.contains(c14g9)) {
            this.LIZJ.add(c14g9);
        }
        if (c14g9 == C14G9.EXTERNAL) {
            C14G6 c14g6 = (C14G6) this.LIZ.LIZLLL.getValue();
            c14g6.getClass();
            C823050WQl.LIZLLL().execute(new ARunnableS130S0100000_30(c14g6, 54));
        }
        return new C13LC<T>(c14gk, c14g9, this) { // from class: X.14G5
            public final C14GK LIZ;
            public final C14G9 LIZIZ;
            public final C14G4<T> LIZJ;

            @Override // X.C13LC
            public final T LIZIZ() {
                return (T) this.LIZJ.LIZ.LIZJ(this.LIZ, this.LIZIZ);
            }

            @Override // X.C13LC
            public final void LIZ(C19719912Dl c19719912Dl, Function2 function2) {
                C14G4<T> c14g4 = this.LIZJ;
                synchronized (c14g4) {
                    HashMap<String, Function2<T, C14G2, T>> map = ((C14GC) c14g4.LIZIZ.getValue()).LIZ;
                    String strLIZLLL = c19719912Dl.LIZLLL();
                    if (strLIZLLL == null) {
                        strLIZLLL = "";
                    }
                    map.put(strLIZLLL, new AwS644S0100000_30(function2, (Function2<InterfaceC1618180sDA<Object>, Object, InterfaceC1618180sDA<Object>>) 6));
                }
            }

            {
                this.LIZ = c14gk;
                this.LIZIZ = c14g9;
                this.LIZJ = this;
            }
        };
    }
}
