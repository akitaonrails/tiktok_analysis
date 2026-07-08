package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* JADX INFO: renamed from: X.1E9r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276771E9r implements InterfaceC914930Zut<C960260b60> {
    public final /* synthetic */ C2276751E9p LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC2276761E9q> LIZIZ;

    @Override // X.InterfaceC914930Zut
    public final void onSuccess(C960260b60 c960260b60) {
        C960260b60 c960260b602 = c960260b60;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("response=");
        sbLIZ.append(c960260b602);
        C20441214yg.LIZIZ("QuickBattleBuildConnection", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.getClass();
        InterfaceC2276761E9q interfaceC2276761E9q = (InterfaceC2276761E9q) C1909107dp.LIZJ(InterfaceC2276761E9q.class, null);
        interfaceC2276761E9q.setSettings(c960260b602.LIZ);
        interfaceC2276761E9q.setSessionId(c960260b602.LIZIZ);
        interfaceC2276761E9q.setErrorCode(c960260b602.LIZJ);
        interfaceC2276761E9q.setErrorMsg(c960260b602.LIZLLL);
        this.LIZIZ.onSuccess(interfaceC2276761E9q, "");
    }

    public C2276771E9r(C2276751E9p c2276751E9p, CompletionBlock<InterfaceC2276761E9q> completionBlock) {
        this.LIZ = c2276751E9p;
        this.LIZIZ = completionBlock;
    }

    @Override // X.InterfaceC914930Zut
    public final void LIZ(int i, String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("code=");
        sbLIZ.append(i);
        sbLIZ.append("; errorMsg=");
        sbLIZ.append(str);
        sbLIZ.append("; throwable=");
        sbLIZ.append(th);
        C20441214yg.LIZIZ("QuickBattleBuildConnection", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.getClass();
        InterfaceC2276761E9q interfaceC2276761E9q = (InterfaceC2276761E9q) C1909107dp.LIZJ(InterfaceC2276761E9q.class, null);
        interfaceC2276761E9q.setSettings("");
        interfaceC2276761E9q.setSessionId("");
        interfaceC2276761E9q.setErrorCode(Integer.valueOf(i));
        interfaceC2276761E9q.setErrorMsg(str);
        this.LIZIZ.onSuccess(interfaceC2276761E9q, "");
    }
}
