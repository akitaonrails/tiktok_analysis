package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;

/* JADX INFO: renamed from: X.1E9s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276781E9s implements InterfaceC914930Zut<C960260b60> {
    public final /* synthetic */ C2276701E9k LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC2276791E9t> LIZIZ;

    @Override // X.InterfaceC914930Zut
    public final void onSuccess(C960260b60 c960260b60) {
        C960260b60 c960260b602 = c960260b60;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("response=");
        sbLIZ.append(c960260b602);
        C20441214yg.LIZIZ("QuickCohostBuildConnection", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.getClass();
        InterfaceC2276791E9t interfaceC2276791E9t = (InterfaceC2276791E9t) C1909107dp.LIZJ(InterfaceC2276791E9t.class, null);
        interfaceC2276791E9t.setSettings(c960260b602.LIZ);
        interfaceC2276791E9t.setSessionId(c960260b602.LIZIZ);
        interfaceC2276791E9t.setErrorCode(c960260b602.LIZJ);
        interfaceC2276791E9t.setErrorMsg(c960260b602.LIZLLL);
        this.LIZIZ.onSuccess(interfaceC2276791E9t, "");
    }

    public C2276781E9s(C2276701E9k c2276701E9k, CompletionBlock<InterfaceC2276791E9t> completionBlock) {
        this.LIZ = c2276701E9k;
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
        C20441214yg.LIZIZ("QuickCohostBuildConnection", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.getClass();
        InterfaceC2276791E9t interfaceC2276791E9t = (InterfaceC2276791E9t) C1909107dp.LIZJ(InterfaceC2276791E9t.class, null);
        interfaceC2276791E9t.setSettings("");
        interfaceC2276791E9t.setSessionId("");
        interfaceC2276791E9t.setErrorCode(Integer.valueOf(i));
        interfaceC2276791E9t.setErrorMsg(str);
        this.LIZIZ.onSuccess(interfaceC2276791E9t, "");
    }
}
