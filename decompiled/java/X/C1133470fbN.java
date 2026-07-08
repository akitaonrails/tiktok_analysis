package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: renamed from: X.0fbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133470fbN implements OnMessageListener {
    public Room LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public InterfaceC1133530fbT LLILZLL;
    public DataChannel LLIZ;
    public final C11NJ LL = new C11NJ();
    public final String LLIZLLLIL = C1136820fgm.LIZJ(this, "gift");
    public volatile boolean LLJ = true;
    public final C1133480fbO LLJI = new C1133480fbO();

    public final void LIZ() {
        IMessageManager iMessageManager;
        this.LLJ = true;
        if (!this.LL.LLILLJJLI) {
            this.LL.dispose();
        }
        DataChannel dataChannel = this.LLIZ;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.removeMessageListener(this);
        }
        C1133480fbO c1133480fbO = this.LLJI;
        c1133480fbO.LIZ.LIZIZ().LIZ();
        c1133480fbO.LIZIZ.LIZIZ().LIZ();
        c1133480fbO.LIZLLL.removeCallbacks(c1133480fbO.LJII);
        c1133480fbO.LJ = false;
        C1136820fgm.LJFF(dataChannel, this.LLIZLLLIL);
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLILLJJLI = null;
    }

    public final void onEvent(C0IF2 c0if2) {
        int i = c0if2.LIZIZ;
        if (i == 3) {
            this.LLILLL = true;
        } else {
            if (i != 4) {
                return;
            }
            this.LLILLL = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x0334  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r17) {
        /*
            Method dump skipped, instruction units count: 1310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1133470fbN.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }
}
