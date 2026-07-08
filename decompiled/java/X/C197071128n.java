package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.128n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197071128n implements InterfaceC197061128d {
    public final Set<String> LIZ = new LinkedHashSet();

    @Override // X.InterfaceC197061128d
    public final Bundle saveState() {
        C2097608Jq.LJ();
        Pair[] pairArr = new Pair[0];
        Bundle bundleLIZ = C799520VXy.LIZ((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        List listLLIIII = C13LP.LLIIII(this.LIZ);
        C786410Ut5.LJJJIL(bundleLIZ, "classes_to_restore", listLLIIII instanceof ArrayList ? (ArrayList) listLLIIII : new ArrayList(listLLIIII));
        return bundleLIZ;
    }

    public C197071128n(C197066128i c197066128i) {
        c197066128i.LIZJ("androidx.savedstate.Restarter", this);
    }
}
