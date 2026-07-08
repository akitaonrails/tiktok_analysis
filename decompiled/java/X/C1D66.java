package X;

import Y.AComparatorS509S0100000_10;
import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.viewmodel.lifecycle.ILifecycleProducer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1D66, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D66 {
    public static final /* synthetic */ int LJIIJ = 0;
    public final Context LIZ;
    public final String LIZIZ;
    public final C1D3S LIZJ;
    public final Map<String, List<String>> LIZLLL;
    public C1537720q7O LJ;
    public SparkContext LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS579S0100000_35(this, 267));
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public String LJIIIZ;

    public final void LIZ() {
        C1D62 c1d62 = (C1D62) this.LJII.getValue();
        ((ArrayList) c1d62.LIZIZ).remove(LIZIZ());
        C2250281D5u c2250281D5uLIZIZ = LIZIZ();
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) ((LinkedHashMap) c2250281D5uLIZIZ.LJII).get(c2250281D5uLIZIZ.LIZIZ);
        if (interfaceC497601wk != null) {
            C2296808zG.LIZJ(interfaceC497601wk, null);
        }
        Iterator it2 = ((LinkedHashMap) c2250281D5uLIZIZ.LIZLLL).entrySet().iterator();
        while (it2.hasNext()) {
            try {
                ((InterfaceC2250311D5x) ((Map.Entry) it2.next()).getValue()).destroy();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        ((LinkedHashMap) c2250281D5uLIZIZ.LIZLLL).clear();
        ((LinkedHashMap) c2250281D5uLIZIZ.LJI).clear();
        ((LinkedHashMap) c2250281D5uLIZIZ.LJ).clear();
        ((LinkedHashMap) c2250281D5uLIZIZ.LJFF).clear();
        Set<? extends ILifecycleProducer> set = ((C1D62) this.LJII.getValue()).LIZJ;
        if (set != null) {
            Iterator<T> it3 = set.iterator();
            while (it3.hasNext()) {
                ((ILifecycleProducer) it3.next()).LIZ();
            }
        }
        C1537720q7O c1537720q7O = this.LJ;
        if (c1537720q7O != null) {
            c1537720q7O.LLD(true);
        }
    }

    public final C2250281D5u LIZIZ() {
        return (C2250281D5u) this.LJI.getValue();
    }

    public final C1537720q7O LJFF() {
        C1537720q7O c1537720q7O = this.LJ;
        if (c1537720q7O == null) {
            return null;
        }
        return c1537720q7O;
    }

    public final void LJI(InterfaceC2250311D5x interfaceC2250311D5x) {
        C2250281D5u c2250281D5uLIZIZ = LIZIZ();
        c2250281D5uLIZIZ.getClass();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(interfaceC2250311D5x.getClass());
        c2250281D5uLIZIZ.LIZLLL.put(c19719912DlLIZ, interfaceC2250311D5x);
        for (C1D61 c1d61 : interfaceC2250311D5x.getLifecycleStages()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) c2250281D5uLIZIZ.LJ;
            Object arrayList = linkedHashMap.get(c1d61);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c1d61, arrayList);
            }
            ((List) arrayList).add(c19719912DlLIZ);
        }
        Iterator<C1D61> it2 = interfaceC2250311D5x.getLifecycleStages().iterator();
        while (it2.hasNext()) {
            List list = (List) ((LinkedHashMap) c2250281D5uLIZIZ.LJ).get(it2.next());
            if (list != null && list.size() > 1) {
                C08XD.LJJ(list, new AComparatorS509S0100000_10(c2250281D5uLIZIZ, 1));
            }
        }
        c2250281D5uLIZIZ.LJI.put(c19719912DlLIZ, new C2250321D5y());
    }

    public final void LIZJ(String str, Map<String, ? extends Object> map) {
        LJ(C647780Pay.class, new C647780Pay(str, map));
        LIZLLL(C1D6D.ON_DATA_INIT, null);
    }

    public final void LIZLLL(C1D61 c1d61, C1D3H c1d3h) {
        ((C1D62) this.LJII.getValue()).LIZ(c1d61, c1d3h, null);
    }

    public final <T> void LJ(Class<T> cls, T t) {
        SparkContext sparkContext = this.LJFF;
        if (sparkContext != null) {
            sparkContext.LJJ(cls, t);
        }
    }

    public final void LJII(String str, Map<String, ? extends Object> map) {
        LJ(C647780Pay.class, new C647780Pay(str, map));
        LIZLLL(C1D6D.ON_DATA_UPDATED, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1D66(android.content.Context r12, java.lang.String r13, X.C1D3S r14, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r15) {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1D66.<init>(android.content.Context, java.lang.String, X.1D3S, java.util.Map):void");
    }
}
