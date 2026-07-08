package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final /* synthetic */ class C1709450uaN extends C2217421BqW implements Function1<EnumC334240D8k, C1192680h8s> {
    public C1709450uaN(InterfaceC1192660h8q interfaceC1192660h8q) {
        super(1, interfaceC1192660h8q, C1709430uaL.class, "getSummaryViewNode", "getSummaryViewNode(Lcom/ss/android/ugc/aweme/pipo/cashier/CashierSummaryScene;)Lcom/ss/android/ugc/aweme/pipo/cashier/SummaryViewNode;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1192680h8s invoke(EnumC334240D8k enumC334240D8k) {
        Iterator it2 = ((ArrayList) ((C1709430uaL) this.receiver).LLILZLL).iterator();
        while (it2.hasNext()) {
            C1192680h8s c1192680h8sLIZ = ((InterfaceC1709520uaU) it2.next()).LIZ();
            if (c1192680h8sLIZ != null) {
                return c1192680h8sLIZ;
            }
        }
        return null;
    }
}
