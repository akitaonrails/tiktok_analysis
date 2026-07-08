package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.06Sf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1610306Sf implements InterfaceC1769890w9r {
    public static final C1610306Sf LIZ = new C1610306Sf();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1118));
    public static final List<WeakReference<InterfaceC1541990qEH>> LIZJ = new LinkedList();

    public static void LIZJ(InterfaceC1541990qEH interfaceC1541990qEH) {
        Iterator<WeakReference<InterfaceC1541990qEH>> it2 = LIZJ.iterator();
        while (it2.hasNext()) {
            InterfaceC1541990qEH interfaceC1541990qEH2 = it2.next().get();
            if (interfaceC1541990qEH2 == null || interfaceC1541990qEH2.T0() || interfaceC1541990qEH2 == interfaceC1541990qEH) {
                it2.remove();
            }
        }
    }

    @Override // X.InterfaceC1769890w9r
    public final boolean LIZIZ(String str) {
        return ((List) LIZIZ.getValue()).contains(str);
    }

    @Override // X.InterfaceC1769890w9r
    public final void LIZ(SparkContext sparkContext, String str, String str2) {
        sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.06Sh
            @Override // X.AbstractC1537870q7d
            public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) {
                synchronized (C1610306Sf.LIZ) {
                    try {
                        C1610306Sf.LIZJ(interfaceC1541990qEH);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLJI(InterfaceC1541990qEH interfaceC1541990qEH) {
                if ((interfaceC1541990qEH instanceof C1537710q7N) || (interfaceC1541990qEH instanceof C1537720q7O)) {
                    C1610606Si c1610606Si = C1610606Si.LIZ;
                    c1610606Si.getClass();
                    if (C1610406Sg.LIZ().enable && C1610606Si.LIZIZ.compareAndSet(false, true)) {
                        C1610606Si.LIZIZ();
                        C476250Ilz.LIZ.getClass();
                        C2188561Al4.LJII(c1610606Si);
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZLLL), null, null, new C1610106Sd(interfaceC1541990qEH, null), 3);
                }
            }
        });
    }
}
