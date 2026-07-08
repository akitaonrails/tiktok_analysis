package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: renamed from: X.0IIV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IIV implements OnMessageListener {
    public DataChannel LL;
    public C0IEB LLILLJJLI;

    public static void LIZIZ(boolean z) {
        if (z) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).T31();
        } else {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Wr2();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d7, code lost:
    
        if (r2 != null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r6) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IIV.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public final void LIZ(DataChannel dataChannel, C0IEB c0ieb) {
        IMessageManager iMessageManager;
        this.LL = dataChannel;
        this.LLILLJJLI = c0ieb;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addMessageListener(C001A.ACCESS_RECALL_MESSAGE.getIntType(), this);
        }
    }
}
