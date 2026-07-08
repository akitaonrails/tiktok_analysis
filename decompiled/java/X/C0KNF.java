package X;

import com.bytedance.android.livesdk.model.message.PushContractStatusResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KNF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KNF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PushContractStatusResult LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KNF(PushContractStatusResult pushContractStatusResult) {
        super(0);
        this.LL = pushContractStatusResult;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C516050KLr c516050KLr = C516050KLr.LIZ;
        String str = this.LL.contractid;
        c516050KLr.getClass();
        Iterator it2 = ((ArrayList) C15438062q.LJIJJLI(((LinkedHashMap) C516050KLr.LIZIZ).values())).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((C0KM2) next).LIZ, str)) {
                if (next != null) {
                    Set<C0KOA> set = C0KNB.LLILLL;
                    PushContractStatusResult pushContractStatusResult = this.LL;
                    Iterator<C0KOA> it3 = set.iterator();
                    while (it3.hasNext()) {
                        it3.next().LIZ(pushContractStatusResult);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
