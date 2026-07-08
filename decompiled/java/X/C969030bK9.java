package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.JoinRtcChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;

/* JADX INFO: renamed from: X.0bK9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969030bK9 implements InterfaceC966890bGh<JoinRtcChannelResult> {
    public final /* synthetic */ C1AXM LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.InterfaceC966890bGh
    public final void LIZ(JoinRtcChannelResult joinRtcChannelResult) {
        String strLLIIII = this.LIZ.LLIIII(1204);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJLLL());
        sbLIZ.append(":forceJoinRtcChannel onSucceeded try to invalidate sei");
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (this.LIZ.LL.LJFF.LJJJZ()) {
            C1AXM c1axm = this.LIZ;
            c1axm.LJLLILLLL(c1axm.LLJJJ, null, c1axm.LL.LJFF.LJJLIIIJLJLI(), true);
        }
        this.LIZ.LL(this.LIZIZ);
    }

    public C969030bK9(C1AXM c1axm, boolean z) {
        this.LIZ = c1axm;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC966890bGh
    public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
        String strLLIIII = this.LIZ.LLIIII(1205);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJLLL());
        sbLIZ.append(":forceJoinRtcChannel onFailed error = ");
        sbLIZ.append(linkCoreError);
        C1AZW.LJFF(strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
    }
}
