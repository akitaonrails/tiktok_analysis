package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS252S0000000_16;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0d0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033920d0o extends AbstractC1033980d0u implements InterfaceC1034190d1F {
    public final Map<C1033970d0t, RunnableC1033910d0n> LLILZ;

    public final void LJIILJJIL() {
        Iterator it2 = ((LinkedHashMap) this.LLILZ).values().iterator();
        while (it2.hasNext()) {
            ((RunnableC1033910d0n) it2.next()).LIZIZ();
        }
        ((LinkedHashMap) this.LLILZ).clear();
    }

    @Override // X.AbstractC1033980d0u
    public final void LJI() {
        super.LJI();
        LJIILJJIL();
    }

    @Override // X.AbstractC1033980d0u
    public final void LIZLLL() {
        LJIILJJIL();
    }

    public C1033920d0o(InterfaceC1034260d1M interfaceC1034260d1M) {
        super(interfaceC1034260d1M);
        this.LLILZ = new LinkedHashMap();
    }

    @Override // X.AbstractC1033980d0u
    public final void LJIIIIZZ(int i) {
        C1033970d0t c1033970d0tLIZIZ = LIZIZ(i);
        if (c1033970d0tLIZIZ == null) {
            return;
        }
        RunnableC1033910d0n runnableC1033910d0n = (RunnableC1033910d0n) ((LinkedHashMap) this.LLILZ).get(c1033970d0tLIZIZ);
        if (runnableC1033910d0n != null) {
            if (runnableC1033910d0n.LLILLJJLI == i) {
                return;
            }
            runnableC1033910d0n.LIZIZ();
            this.LLILZ.remove(c1033970d0tLIZIZ);
        }
        RunnableC1033910d0n runnableC1033910d0n2 = new RunnableC1033910d0n(c1033970d0tLIZIZ, i);
        runnableC1033910d0n2.LLILLL = this;
        this.LLILZ.put(c1033970d0tLIZIZ, runnableC1033910d0n2);
        runnableC1033910d0n2.LIZJ();
    }

    @Override // X.AbstractC1033980d0u
    public final void LJIIJJI(int i) {
        RunnableC1033910d0n runnableC1033910d0nRemove;
        super.LJIIJJI(i);
        C1033970d0t c1033970d0tLIZIZ = LIZIZ(i);
        if (c1033970d0tLIZIZ != null && (runnableC1033910d0nRemove = this.LLILZ.remove(c1033970d0tLIZIZ)) != null) {
            runnableC1033910d0nRemove.LIZIZ();
        }
    }

    @Override // X.InterfaceC1034190d1F
    public final void LIZ(C1033970d0t c1033970d0t, int i) throws JSONException {
        RunnableC1033910d0n runnableC1033910d0nRemove = this.LLILZ.remove(c1033970d0t);
        if (runnableC1033910d0nRemove == null) {
            return;
        }
        LJIILIIL(c1033970d0t, i, AFwS252S0000000_16.get$arr$(515));
        runnableC1033910d0nRemove.LIZIZ();
    }
}
