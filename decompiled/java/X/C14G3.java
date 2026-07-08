package X;

import X.InterfaceC1618180sDA;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.14G3, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14G3<T extends InterfaceC1618180sDA<T>> {
    public static final C14G7 LJ = new C14G7();
    public final Function0<T> LIZ;
    public final Class<T> LIZIZ = (Class<T>) LIZ().getClass();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(341));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, (C14G3<InterfaceC1618180sDA<Object>>) 451));

    public final T LIZ() {
        return this.LIZ.invoke();
    }

    public C14G3(AwS574S0100000_30 awS574S0100000_30) {
        this.LIZ = awS574S0100000_30;
    }

    public final T LIZIZ(Object obj) {
        T t = (T) ((LinkedHashMap) this.LIZJ.getValue()).get(obj);
        if (t == null) {
            return (T) LIZ();
        }
        return t;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1618180sDA LIZJ(X.C14GK r6, X.C14G9 r7) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14G3.LIZJ(X.14GK, X.14G9):X.0sDA");
    }
}
