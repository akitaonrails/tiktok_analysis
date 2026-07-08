package X;

/* JADX INFO: renamed from: X.0KbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520560KbG extends AbstractC520520KbC {
    public InterfaceC420801kM LLILLL;
    public final C520570KbH LLILZ = new C520570KbH();

    public final boolean LIZJ() {
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        return ((interfaceC634840OvC == null || (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) == null || (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) == null) ? null : c1543190qGD.LJIILJJIL) == EnumC1063300dmC.LYNX;
    }

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        InterfaceC420801kM interfaceC420801kM = this.LLILLL;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        EnumC1063300dmC enumC1063300dmC;
        C1543410qGZ c1543410qGZLIZJ;
        C1543190qGD c1543190qGD;
        if (interfaceC634840OvC != null && (c1543410qGZLIZJ = interfaceC634840OvC.LIZJ()) != null && (c1543190qGD = c1543410qGZLIZJ.LIZ.LIZ) != null) {
            enumC1063300dmC = c1543190qGD.LJIILJJIL;
        } else {
            enumC1063300dmC = null;
        }
        if (enumC1063300dmC == EnumC1063300dmC.WEB) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0148  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r20, final com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r21, final X.EnumC1063300dmC r22) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C520560KbG.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
