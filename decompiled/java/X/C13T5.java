package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;

/* JADX INFO: renamed from: X.13T5, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13T5 extends C13T3 {
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final ConcurrentHashMap<String, C13T4> LJIILL;
    public final AtomicBoolean LJIILLIIL;

    @Override // X.C13T3, X.C13UG
    public final Pair<Integer, Long> LJIIJ() {
        return new Pair<>(0, 0L);
    }

    @Override // X.C13T3
    public final Collection<C20014813Sw> LJJI() {
        Collection<C13T4> collectionValues = this.LJIILL.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = collectionValues.iterator();
        if (!it2.hasNext()) {
            return arrayList;
        }
        it2.next().getClass();
        throw null;
    }

    @Override // X.C13T3, X.C13UG
    public final String LJIIL() {
        return this.LJIILJJIL;
    }

    @Override // X.C13T3, X.C13UG
    public final String LJIILIIL() {
        return this.LJIILIIL;
    }

    public C13T5(String str) {
        super(new C13U8(new C13U7()));
        this.LJIILIIL = "resource";
        this.LJIILJJIL = str;
        this.LJIILL = new ConcurrentHashMap<>();
        this.LJIILLIIL = new AtomicBoolean(false);
    }

    @Override // X.C13T3
    public final boolean LJIL(List<String> list) {
        if (list.size() != 5) {
            return false;
        }
        C1876890ywR c1876890ywR = EnumC1876880ywQ.Companion;
        Object obj = ListProtector.get(list, 0);
        c1876890ywR.getClass();
        if (obj == null || !EnumC1876880ywQ.byToken.containsKey(obj)) {
            return false;
        }
        return true;
    }

    @Override // X.C13T3
    public final void LJJII(List<String> list) {
        Object obj = ListProtector.get(list, 1);
        String str = (String) ListProtector.get(list, 2);
        C13T4 c13t4 = this.LJIILL.get(obj);
        if (c13t4 == null) {
            this.LJFF++;
            return;
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL((String) ListProtector.get(list, 3));
        Long lLJIILIIL2 = C2095008Iq.LJIILIIL((String) ListProtector.get(list, 4));
        if (lLJIILIIL != null && lLJIILIIL2 != null) {
            if (!c13t4.LIZJ(str).exists()) {
                throw null;
            }
            throw null;
        }
        this.LJFF++;
    }

    @Override // X.C13T3
    public final String LJJ(EnumC1876880ywQ enumC1876880ywQ, C20014813Sw c20014813Sw) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1876880ywQ.getOperators());
        sbLIZ.append(' ');
        sbLIZ.append(c20014813Sw.LIZIZ);
        sbLIZ.append(' ');
        sbLIZ.append(c20014813Sw.LIZ);
        sbLIZ.append(' ');
        sbLIZ.append(c20014813Sw.LJ);
        sbLIZ.append(' ');
        sbLIZ.append(c20014813Sw.LIZLLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
