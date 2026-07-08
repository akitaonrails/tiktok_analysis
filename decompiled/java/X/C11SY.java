package X;

import Y.AfS198S0100000_29;
import Y.AkS490S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11SY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11SY extends C11TE implements C11NM {
    public final C11NL LIZIZ = new C11NL();

    @Override // X.C11NM
    public final void release() {
        this.LIZIZ.release();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.11SZ, java.lang.Object] */
    @Override // X.C11TE
    public final C11SZ LJJIJIIJIL(InterfaceC19505211Sw interfaceC19505211Sw, InterfaceC19505211Sw interfaceC19505211Sw2, C11TH c11th) {
        C19504711Sr c19504711Sr = new C19504711Sr(interfaceC19505211Sw, interfaceC19505211Sw2, c11th);
        final C11JF c11jf = (C11JF) ((InterfaceC19503911Sj) interfaceC19505211Sw).LJFF().LJJJLZIJ((C11RO) C1212620hf2.LIZLLL.getValue()).LJJIL(new C19774912Yp(new AwS608S0100000_29(c19504711Sr, (C19504711Sr<Object, Object, Object, Object>) 527), 1)).LJJJ(new AkS490S0100000_29(new AwS608S0100000_29(c19504711Sr, (C19504711Sr<Object, Object, Object, Object>) 532), 3), false).LJJLL(new AfS198S0100000_29(new AwS608S0100000_29(c19504711Sr, (C19504711Sr<Object, Object, Object, Object>) 533), 20), new AfS198S0100000_29(C115K.LL, 21));
        ?? r1 = new C11NM(c11jf) { // from class: X.11SZ
            public final InterfaceC420801kM LIZIZ;

            @Override // X.C11NM
            public final void release() {
                if (this.LIZIZ.isDisposed()) {
                    return;
                }
                this.LIZIZ.dispose();
            }

            {
                this.LIZIZ = c11jf;
            }
        };
        this.LIZIZ.LIZIZ.LIZ(r1);
        return r1;
    }
}
