package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS592S0100000_13;
import kotlin.jvm.internal.AwS627S0100000_13;

/* JADX INFO: renamed from: X.0Wqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C835870Wqf extends AbstractC835880Wqg {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(250));

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        C835850Wqd.LIZ.getClass();
        C835850Wqd.LJ = true;
        C835850Wqd.LJI = true;
        try {
            if (C570350MYn.LIZ()) {
                ((C835770WqV) this.LLILLL.getValue()).LIZJ(new AwS592S0100000_13(completionBlock, (CompletionBlock<InterfaceC835900Wqi>) 69));
            } else {
                ((C835770WqV) this.LLILLL.getValue()).LIZIZ(new AwS592S0100000_13(completionBlock, (CompletionBlock<InterfaceC835900Wqi>) 70), new AwS627S0100000_13(completionBlock, (CompletionBlock<InterfaceC835900Wqi>) 1));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C835850Wqd c835850Wqd = C835850Wqd.LIZ;
            String strValueOf = String.valueOf(thM5exceptionOrNullimpl.getMessage());
            c835850Wqd.getClass();
            ((ArrayList) C835850Wqd.LJII).add(strValueOf);
            C835850Wqd.LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("upload error ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
