package X;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08uQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2266808uQ extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C2287508xl LL;
    public final /* synthetic */ C2287408xk LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2266808uQ(C2287508xl c2287508xl, C2287408xk c2287408xk, String str, int i) {
        super(1);
        this.LL = c2287508xl;
        this.LLILLJJLI = c2287408xk;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        this.LL.LIZJ.getClass();
        if (this.LLILLJJLI.LIZLLL.size() >= 10) {
            LinkedHashMap<String, String> linkedHashMap = this.LLILLJJLI.LIZLLL;
            linkedHashMap.remove(C13LP.LJJJJZ(linkedHashMap.keySet()));
        }
        LinkedHashMap<String, String> linkedHashMap2 = this.LLILLJJLI.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(this.LLILZ);
        linkedHashMap2.put(String.valueOf(C2188811AlT.LIZIZ(sbLIZ).hashCode()), str);
        return Unit.LIZ;
    }
}
