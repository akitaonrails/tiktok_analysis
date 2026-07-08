package X;

import androidx.lifecycle.Observer;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RD6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RD6 {
    public final C01GW LIZ = C452501pT.LIZIZ(new C0RD5());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C0RD7());

    public final HashMap<String, Observer<C0RD4>> LIZJ() {
        return (HashMap) this.LIZ.getValue();
    }

    public final void LIZ(String str, Observer observer) {
        LIZJ().put(str, observer);
    }

    public final void LIZIZ(String str, final Function1 function1) {
        LIZJ().put(str, new Observer() { // from class: X.0MTP
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                Object obj2;
                C0RD4 c0rd4 = (C0RD4) obj;
                Function1<T, Unit> function12 = function1;
                if (c0rd4 == null || (obj2 = c0rd4.LIZIZ) == null) {
                    obj2 = null;
                }
                function12.invoke((T) obj2);
            }
        });
    }
}
