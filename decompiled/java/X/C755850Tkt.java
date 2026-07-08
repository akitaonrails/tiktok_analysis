package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;

/* JADX INFO: renamed from: X.0Tkt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755850Tkt extends AbstractC755860Tku {
    public final ConcurrentHashSet<String> LLILLL = new ConcurrentHashSet<>();

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC755880Tkw interfaceC755880Tkw = (InterfaceC755880Tkw) xBaseParamModel;
        if (!this.LLILLL.contains(interfaceC755880Tkw.getResourceId())) {
            this.LLILLL.add(interfaceC755880Tkw.getResourceId());
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C755840Tks(interfaceC755880Tkw, completionBlock, this, null), 3);
        } else {
            C2382909Vj.LIZ(completionBlock, 0, "is downloading", null, 4);
        }
    }
}
