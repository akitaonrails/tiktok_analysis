package X;

import com.bytedance.android.livesdk.model.message.PushContractStatusResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KN0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KN0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PushContractStatusResult LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KN0(PushContractStatusResult pushContractStatusResult) {
        super(0);
        this.LL = pushContractStatusResult;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0KMK c0kmk = C0KMK.LIZ;
        String str = this.LL.contractid;
        c0kmk.getClass();
        Iterator it2 = ((ArrayList) C15438062q.LJIJJLI(((LinkedHashMap) C0KMK.LIZIZ).values())).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (Intrinsics.LJFF(((C0KML) next).LIZ, str)) {
                if (next != null) {
                    Set<C0KO8> set = C516350KMv.LIZJ;
                    PushContractStatusResult pushContractStatusResult = this.LL;
                    Iterator<C0KO8> it3 = set.iterator();
                    while (it3.hasNext()) {
                        it3.next().LIZ(pushContractStatusResult);
                    }
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ignore the contract id ");
        sbLIZ.append(this.LL.contractid);
        C20441214yg.LIZIZ("ContractStatusUpdateHelper", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }
}
