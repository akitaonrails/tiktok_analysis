package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;

/* JADX INFO: renamed from: X.0z0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879630z0r extends AbstractC1879090yzz {
    public final ConcurrentHashSet<String> LLILLL = new ConcurrentHashSet<>();

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1879100z00 interfaceC1879100z00 = (InterfaceC1879100z00) xBaseParamModel;
        if (!this.LLILLL.contains(interfaceC1879100z00.getResourceId())) {
            this.LLILLL.add(interfaceC1879100z00.getResourceId());
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1879620z0q(interfaceC1879100z00, completionBlock, this, null), 3);
        } else {
            C2382909Vj.LIZ(completionBlock, 0, "is applying effect", null, 4);
        }
    }
}
