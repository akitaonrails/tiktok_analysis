package X;

import androidx.lifecycle.ViewModelKt;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0wEK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772660wEK extends AbstractC1771860wD2 implements InterfaceC1774100wGe {
    public final String LLILLL = "ECMMKImpressionService";
    public final long LLILZ;
    public InterfaceC594140NSa LLILZIL;
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<k>> LLILZLL;
    public final ConcurrentHashMap<String, Pair<String, n>> LLIZ;
    public AnonymousClass0956 LLIZLLLIL;
    public int LLJ;
    public final List<AbstractC1773210wFD> LLJI;

    @Override // X.AbstractC1771860wD2
    public final void LJI() {
        AnonymousClass0956 anonymousClass0956 = this.LLIZLLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLIZ.clear();
        this.LLILZLL.clear();
    }

    public C1772660wEK() {
        C1773020wEu.LIZ.getClass();
        this.LLILZ = C1773020wEu.LIZIZ().impressionReportInterval;
        this.LLILZLL = new ConcurrentHashMap<>();
        this.LLIZ = new ConcurrentHashMap<>();
        this.LLJI = new ArrayList();
    }

    @Override // X.AbstractC1771860wD2
    public final void LIZLLL() {
        this.LLIZLLLIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(LIZIZ().LJIIIIZZ()), C0PEM.LIZJ, null, new C0NK8(this, null), 2);
        this.LLILZIL = LIZIZ().LIZLLL().LJIIIIZZ;
        LIZIZ().LIZJ().LIZ(InterfaceC1774100wGe.class, this);
        C1774130wGh.LIZ.getClass();
        if (C1774130wGh.LIZ().enableDelayExposureEvent) {
            LIZIZ().LIZLLL().LJ.getBodyList().LJ(new AwS588S0100000_9(this, 612));
        }
    }

    @Override // X.InterfaceC1774100wGe
    public final void LJIIIZ(AbstractC1773210wFD abstractC1773210wFD) {
        C1775180wIO c1775180wIO;
        C1772690wEN c1772690wEN;
        n nVar;
        CopyOnWriteArrayList<k> copyOnWriteArrayListPutIfAbsent;
        CopyOnWriteArrayList<k> copyOnWriteArrayListPutIfAbsent2;
        if (abstractC1773210wFD != null) {
            C1775190wIP c1775190wIP = abstractC1773210wFD.LJII;
            if (c1775190wIP != null && (c1775180wIO = c1775190wIP.LIZIZ) != null && (c1772690wEN = c1775180wIO.LIZ) != null && (nVar = c1772690wEN.LJIIIZ) != null) {
                h hVar = c1775190wIP.LIZLLL;
                if (hVar != null) {
                    c1775190wIP.LIZLLL = null;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1772690wEN.LJIIIIZZ);
                    sbLIZ.append('_');
                    sbLIZ.append(c1772690wEN.LIZLLL);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    ConcurrentHashMap<String, CopyOnWriteArrayList<k>> concurrentHashMap = this.LLILZLL;
                    CopyOnWriteArrayList<k> copyOnWriteArrayList = concurrentHashMap.get(strLIZIZ);
                    if (copyOnWriteArrayList == null && (copyOnWriteArrayListPutIfAbsent2 = concurrentHashMap.putIfAbsent(strLIZIZ, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
                        copyOnWriteArrayList = copyOnWriteArrayListPutIfAbsent2;
                    }
                    CopyOnWriteArrayList<k> copyOnWriteArrayList2 = copyOnWriteArrayList;
                    Iterator<k> it2 = hVar.iterator();
                    while (it2.hasNext()) {
                        copyOnWriteArrayList2.add(it2.next());
                    }
                    this.LLIZ.putIfAbsent(strLIZIZ, new Pair<>("impression_items", nVar));
                } else {
                    h hVar2 = c1775190wIP.LIZJ;
                    if (hVar2 != null) {
                        c1775190wIP.LIZJ = null;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(c1772690wEN.LJIIIIZZ);
                        sbLIZ2.append('_');
                        sbLIZ2.append(c1772690wEN.LIZLLL);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        ConcurrentHashMap<String, CopyOnWriteArrayList<k>> concurrentHashMap2 = this.LLILZLL;
                        CopyOnWriteArrayList<k> copyOnWriteArrayList3 = concurrentHashMap2.get(strLIZIZ2);
                        if (copyOnWriteArrayList3 == null && (copyOnWriteArrayListPutIfAbsent = concurrentHashMap2.putIfAbsent(strLIZIZ2, (copyOnWriteArrayList3 = new CopyOnWriteArrayList<>()))) != null) {
                            copyOnWriteArrayList3 = copyOnWriteArrayListPutIfAbsent;
                        }
                        CopyOnWriteArrayList<k> copyOnWriteArrayList4 = copyOnWriteArrayList3;
                        Iterator<k> it3 = hVar2.iterator();
                        while (it3.hasNext()) {
                            copyOnWriteArrayList4.add(it3.next());
                        }
                        this.LLIZ.putIfAbsent(strLIZIZ2, new Pair<>("feed_list", nVar));
                    }
                }
            }
            C1775190wIP c1775190wIP2 = abstractC1773210wFD.LJII;
            if (c1775190wIP2 != null && c1775190wIP2.LJII) {
                return;
            }
            C1774130wGh.LIZ.getClass();
            if (C1774130wGh.LIZ().enableDelayExposureEvent && this.LLJ != 0) {
                ((ArrayList) this.LLJI).add(abstractC1773210wFD);
            } else {
                LJIILIIL(abstractC1773210wFD);
            }
            C1775190wIP c1775190wIP3 = abstractC1773210wFD.LJII;
            if (c1775190wIP3 == null) {
                return;
            }
            c1775190wIP3.LJII = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(X.AbstractC1773210wFD r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L47
            X.0wIP r0 = r7.LJII
            if (r0 == 0) goto L47
            java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r2 = r0.LJ
        L9:
            X.0wIP r0 = r7.LJII
            if (r0 == 0) goto Lf
            java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> r5 = r0.LJI
        Lf:
            java.lang.String r4 = "ec_mix_mall_add_exposure"
            if (r5 == 0) goto L2c
            X.0wFN r0 = r6.LIZIZ()
            X.0NqI r3 = r0.getEventCenter()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "exposed_data"
            r1.<init>(r0, r5)
            java.util.Map r2 = X.C2097908Jt.LIZJ(r1)
            r1 = 1
            r0 = 0
            r3.LIZLLL(r4, r2, r0, r1)
        L2b:
            return
        L2c:
            if (r2 == 0) goto L2b
            X.0wFN r0 = r6.LIZIZ()
            X.0NqI r3 = r0.getEventCenter()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "exposure"
            r1.<init>(r0, r2)
            java.util.Map r2 = X.C2097908Jt.LIZJ(r1)
            r1 = 1
            r0 = 0
            r3.LIZLLL(r4, r2, r0, r1)
            return
        L47:
            r2 = r5
            if (r7 == 0) goto Lf
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1772660wEK.LJIILIIL(X.0wFD):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009a -> B:12:0x0029). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ab -> B:12:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1772660wEK.LJIILLIIL(X.05Vn):java.lang.Object");
    }
}
