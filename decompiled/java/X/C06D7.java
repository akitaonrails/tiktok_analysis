package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.06D7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06D7 extends C06DA {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C054G LLILLL;
    public volatile C1598406Nq LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C06D7.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C06D7() {
        C1598406Nq c1598406Nq = this.LLILZ;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LLILZ;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LLILZ = c1598406Nq;
                }
            }
        }
        this.LLILLL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C23250099c.LIZLLL(this.LLILLL, null, null, new C06D9((C06D8) xBaseParamModel, this, completionBlock, null), 3);
    }
}
