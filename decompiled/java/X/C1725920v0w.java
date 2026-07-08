package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0v0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725920v0w extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC1725900v0u LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1725920v0w(AbstractC1725900v0u abstractC1725900v0u, String str) {
        super(0);
        this.LL = abstractC1725900v0u;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AbstractC1725900v0u abstractC1725900v0u = this.LL;
        String str = this.LLILLJJLI;
        synchronized (abstractC1725900v0u) {
            abstractC1725900v0u.LIZIZ.add(str);
            Map<String, C1726040v18> map = abstractC1725900v0u.LIZ;
            if (map != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                    if (true ^ ((C1726040v18) entry.getValue()).LIZJ) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    C1726040v18 c1726040v18 = (C1726040v18) entry2.getValue();
                    List<String> list = c1726040v18.LIZIZ;
                    Set<String> set = abstractC1725900v0u.LIZIZ;
                    Iterator<String> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            abstractC1725900v0u.LIZIZ(str2, c1726040v18);
                            break;
                        }
                        if (!set.contains(it2.next())) {
                            break;
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
