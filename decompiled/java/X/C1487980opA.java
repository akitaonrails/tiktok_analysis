package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0opA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1487980opA extends C09AY implements InterfaceC1631630sYr<String, Map<String, ? extends Object>, Map<String, ? extends Object>, C1757320vpa, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1765200w2I LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1487890op1 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1487980opA(String str, C1765200w2I c1765200w2I, String str2, C1487890op1 c1487890op1) {
        super(4);
        this.LL = str;
        this.LLILLJJLI = c1765200w2I;
        this.LLILLL = str2;
        this.LLILZ = c1487890op1;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2, C1757320vpa c1757320vpa) {
        Map<String, ? extends Object> mapLIZJ;
        Collection<String> collectionValues;
        Set setLLIIJI;
        C1757320vpa c1757320vpa2 = c1757320vpa;
        String str2 = this.LL;
        if (str2 != null && str2.length() > 0 && map != null) {
            mapLIZJ = C2097908Jt.LIZJ(new Pair(this.LL, map));
        } else {
            mapLIZJ = null;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.LLILLJJLI.LJFF().get(this.LLILLL);
        if (concurrentHashMap != null && (collectionValues = concurrentHashMap.values()) != null && (setLLIIJI = C13LP.LLIIJI(collectionValues)) != null) {
            C1765200w2I c1765200w2I = this.LLILLJJLI;
            C1487890op1 c1487890op1 = this.LLILZ;
            Iterator it2 = setLLIIJI.iterator();
            while (it2.hasNext()) {
                c1765200w2I.LJIILIIL((String) it2.next(), mapLIZJ, c1757320vpa2, c1487890op1);
            }
        }
        return Unit.LIZ;
    }
}
