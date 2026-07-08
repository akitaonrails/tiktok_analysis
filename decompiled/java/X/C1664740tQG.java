package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0tQG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1664740tQG implements InterfaceC1731706qJ {
    public final /* synthetic */ AbstractC1664760tQI LL;
    public final /* synthetic */ Class LLILLJJLI;

    public /* synthetic */ C1664740tQG(AbstractC1664760tQI abstractC1664760tQI, Class cls) {
        this.LL = abstractC1664760tQI;
        this.LLILLJJLI = cls;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    @Override // X.InterfaceC1731706qJ
    public final Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        Object obj2;
        AbstractC1664760tQI abstractC1664760tQI = this.LL;
        Class cls = this.LLILLJJLI;
        if (abstractC1664760tQI != null) {
            if (abstractC1664760tQI.LIZ == 0) {
                synchronized (abstractC1664760tQI) {
                    try {
                        if (abstractC1664760tQI.LIZ == 0) {
                            abstractC1664760tQI.LIZ = abstractC1664760tQI.LIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            obj2 = abstractC1664760tQI.LIZ;
        } else {
            obj2 = null;
        }
        LinkedHashSet<InterfaceC1664730tQF> linkedHashSet = C1664770tQJ.LIZ;
        if (linkedHashSet != null) {
            Iterator<InterfaceC1664730tQF> it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(obj, new Pair<>(cls, obj2));
            }
        }
        return obj2;
    }
}
