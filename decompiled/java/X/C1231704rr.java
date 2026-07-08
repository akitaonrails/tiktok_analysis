package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.04rr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1231704rr {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final C01GW LIZLLL;

    public final void LIZIZ() {
        this.LIZLLL.getValue();
    }

    public final void LIZ(List list, Function1 function1) {
        Iterator it2 = C13LP.LJJJIL(list, this.LIZJ).iterator();
        while (it2.hasNext()) {
            C13LP.LJJLIIIJ((Iterable) it2.next(), null, "", null, 0, null, new AwS581S0100000_2(function1, (Function1<Object, String>) 5), 29);
        }
    }

    public final void LIZJ(List list, Function1 function1) {
        Iterator it2 = C13LP.LJJJIL(list, this.LIZJ).iterator();
        while (it2.hasNext()) {
            C13LP.LJJLIIIJ((Iterable) it2.next(), null, "", null, 0, null, new AwS581S0100000_2(function1, (Function1<Object, String>) 6), 29);
            LIZIZ();
        }
    }

    public C1231704rr(String str, String str2, int i) {
        int i2;
        str2 = (i & 2) != 0 ? null : str2;
        if ((i & 4) != 0) {
            i2 = 25;
        } else {
            i2 = 0;
        }
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i2;
        this.LIZLLL = C452501pT.LIZIZ(new C1166604hM(this));
    }
}
