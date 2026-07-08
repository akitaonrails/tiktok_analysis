package X;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cjs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023420cjs extends C09AY implements Function1<C1196804mE, Map<String, ? extends Object>> {
    public final /* synthetic */ AbstractC1023470cjx LL;
    public final /* synthetic */ InterfaceC1023400cjq<C443120HZe<String, String, String>> LLILLJJLI;
    public final /* synthetic */ C1023640ckE LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1023420cjs(AbstractC1023470cjx abstractC1023470cjx, InterfaceC1023400cjq<C443120HZe<String, String, String>> interfaceC1023400cjq, C1023640ckE c1023640ckE) {
        super(1);
        this.LL = abstractC1023470cjx;
        this.LLILLJJLI = interfaceC1023400cjq;
        this.LLILLL = c1023640ckE;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Map<String, ? extends Object> invoke(C1196804mE c1196804mE) {
        InterfaceC1023650ckF<?, ?>[] interfaceC1023650ckFArr;
        AbstractC1023470cjx abstractC1023470cjx = this.LL;
        InterfaceC1023650ckF<?, ?>[] keys = this.LLILLJJLI.getKeys();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1023650ckF<?, ?> interfaceC1023650ckF : keys) {
            if (interfaceC1023650ckF instanceof C1023670ckH) {
                arrayList.add(interfaceC1023650ckF);
            }
        }
        C1023670ckH c1023670ckH = (C1023670ckH) C13LP.LJJJLL(arrayList);
        if (c1023670ckH == null || (interfaceC1023650ckFArr = c1023670ckH.LIZ) == null) {
            interfaceC1023650ckFArr = new InterfaceC1023650ckF[0];
        }
        return abstractC1023470cjx.getParams(interfaceC1023650ckFArr, this.LLILLL);
    }
}
