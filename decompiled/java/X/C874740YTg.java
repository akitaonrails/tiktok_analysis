package X;

import android.util.LruCache;
import com.bytedance.ies.im.core.send.MessageQueue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0YTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874740YTg implements InterfaceC874840YTq {
    public final C0YHX LIZIZ;
    public final InterfaceC876950Yaj LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C874820YTo(this));
    public final C01GW LJ = C452501pT.LIZIZ(new C874790YTl(this));
    public final C01GW LJFF = C452501pT.LIZIZ(new C874800YTm());
    public C054G LJI = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));

    @Override // X.InterfaceC874840YTq
    public final void LIZ() {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        C882690Yjz.LJFF("SendMessageLooper", "onSDKLogout");
        C2296808zG.LIZJ(this.LJI, null);
        this.LJI = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
        C874760YTi c874760YTi = (C874760YTi) this.LJ.getValue();
        c874760YTi.getClass();
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("MsgSender_CQ", "clear");
        c874760YTi.LIZLLL().clear();
        MessageQueue messageQueue = (MessageQueue) this.LIZLLL.getValue();
        messageQueue.getClass();
        C882400YjW.LIZLLL();
        C882690Yjz.LJIIIZ("MsgSender_MQ", "clear");
        ((Map) messageQueue.LLILLJJLI.getValue()).clear();
        C874810YTn.LIZ.clear();
    }

    @Override // X.InterfaceC874840YTq
    public final boolean LIZJ(String str) {
        boolean zContainsKey;
        if (str != null) {
            C874760YTi c874760YTi = (C874760YTi) this.LJ.getValue();
            synchronized (c874760YTi.LIZLLL()) {
                try {
                    zContainsKey = c874760YTi.LIZLLL().containsKey(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return zContainsKey;
        }
        return false;
    }

    @Override // X.InterfaceC874840YTq
    public final void LIZLLL(C0YTZ c0ytz) {
        String str;
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendMessage: ");
        sbLIZ.append(c0ytz.LJFF);
        C882690Yjz.LJIIIZ("SendMessageLooper", C2188811AlT.LIZIZ(sbLIZ));
        boolean zLJ = c0ytz.LJ();
        C1762406vG c1762406vG = c0ytz.LJIJJLI;
        c1762406vG.getClass();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("stage", "message_task_queue");
        pairArr[1] = new Pair("step", "check_task_valid");
        if (zLJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("result", str);
        pairArr[3] = new Pair("time", c1762406vG.LIZJ());
        c1762406vG.LIZ(C1761806vA.LIZ(pairArr));
        if (!c0ytz.LJ()) {
            C0I0B.LJFF.LIZJ();
            if (!C894660Z7w.LIZJ()) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SendMessageLooper message task is invalid. convId is ");
            sbLIZ2.append(c0ytz.LJFF);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C23250099c.LIZLLL(this.LJI, null, null, new C874770YTj(c0ytz, this, null), 3);
    }

    public C874740YTg(C0YHX c0yhx, InterfaceC876950Yaj interfaceC876950Yaj) {
        this.LIZIZ = c0yhx;
        this.LIZJ = interfaceC876950Yaj;
    }

    @Override // X.InterfaceC874840YTq
    public final void LIZIZ(C869590Y9l c869590Y9l, C874830YTp c874830YTp) {
        ((LruCache) this.LJFF.getValue()).put(c869590Y9l.getUuid(), c874830YTp);
    }
}
