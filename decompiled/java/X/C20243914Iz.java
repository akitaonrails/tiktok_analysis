package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14Iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20243914Iz {
    public static final void LIZ(final C1295960jpS c1295960jpS, String str, final Function0<Unit> function0) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists()) {
            final C1292030jj7<C1294720jnS> c1292030jj7LJ = C1294250jmh.LJ(new C0VSP(c0vsj), null);
            c1292030jj7LJ.LIZIZ(new InterfaceC1292040jj8<C1294720jnS>() { // from class: X.14J0
                @Override // X.InterfaceC1292040jj8
                public final void onResult(C1294720jnS c1294720jnS) {
                    C1294720jnS c1294720jnS2 = c1294720jnS;
                    if (c1294720jnS2 != null) {
                        c1295960jpS.setComposition(c1294720jnS2);
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        c1292030jj7LJ.LJII(this);
                    }
                }
            });
            c1292030jj7LJ.LIZ(new C20308914dL(c1292030jj7LJ, 2));
        }
    }
}
