package X;

import X.InterfaceC663970Q2p;
import java.util.HashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Q48, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q48<T extends InterfaceC663970Q2p> {
    public final HashMap<String, Function2<T, InterfaceC663910Q2j, T>> LIZ = new HashMap<>();

    public final void LIZ(C19719912Dl c19719912Dl, Function2 function2) {
        HashMap<String, Function2<T, InterfaceC663910Q2j, T>> map = this.LIZ;
        String strLIZLLL = c19719912Dl.LIZLLL();
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        map.put(strLIZLLL, new C0Q4C(function2));
    }
}
