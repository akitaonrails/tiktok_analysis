package X;

import android.os.Handler;
import android.os.Message;
import com.bytedance.ies.im.core.api.experiment.GroupFakeWriteExperimentData;
import com.bytedance.ies.im.core.send.ConversationQueue$handler$2$1;
import com.bytedance.ies.im.core.send.MessageQueue;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874760YTi implements InterfaceC866830XzV {
    public final MessageQueue LL;
    public final C0YHX LLILLJJLI;
    public final InterfaceC876950Yaj LLILLL;
    public final C01GW LLILZ;
    public volatile int LLILZIL;
    public final C01GW LLILZLL;

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJJJJL(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJLIIIJ(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJLJLI(List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJLL(List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJJZZI(List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLI(String str, List<C0YAE> list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLILLLLZI(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLJI(int i, C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJZI(C0Y8T c0y8t) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LLIIII(int i, String str) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LLIILZL(int i, String str, List list) {
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final int LLLIIII() {
        return 0;
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC867280Y0o
    public final void LLLIZZ(Map<String, C0Y8T> map) {
    }

    public final Map<String, Integer> LIZLLL() {
        return (Map) this.LLILZLL.getValue();
    }

    public final void LIZIZ(String str) {
        Integer numRemove;
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dequeue before[");
        sbLIZ.append(str);
        sbLIZ.append("]: ");
        sbLIZ.append(LIZLLL().size());
        C882690Yjz.LJIIIZ("MsgSender_CQ", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (LIZLLL()) {
            try {
                if (LIZLLL().containsKey(str) && (numRemove = LIZLLL().remove(str)) != null) {
                    int iIntValue = numRemove.intValue();
                    C0YUF c0yufLIZLLL = C882400YjW.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cancelTimeOut[");
                    sbLIZ2.append(str);
                    sbLIZ2.append("]: ");
                    sbLIZ2.append(iIntValue);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C882690Yjz.LJ("MsgSender_CQ");
                    ((ConversationQueue$handler$2$1) this.LLILZ.getValue()).removeMessages(iIntValue);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("dequeue after[");
        sbLIZ3.append(str);
        sbLIZ3.append("]: ");
        sbLIZ3.append(LIZLLL().size());
        C882690Yjz.LJIIIZ("MsgSender_CQ", C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
    public final void LJLL(C1711306n1 c1711306n1) {
        Long l;
        C0Y8T c0y8t;
        C0Y8T c0y8t2;
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSyncConversation[");
        if (c1711306n1 != null) {
            l = c1711306n1.LIZ;
        } else {
            l = null;
        }
        sbLIZ.append(l);
        sbLIZ.append("]: ");
        if (c1711306n1 != null) {
            c0y8t = c1711306n1.LIZIZ;
        } else {
            c0y8t = null;
        }
        sbLIZ.append(c0y8t);
        C882690Yjz.LJIIIZ("MsgSender_CQ", C2188811AlT.LIZIZ(sbLIZ));
        if (c1711306n1 != null && (c0y8t2 = c1711306n1.LIZIZ) != null) {
            LIZIZ(c0y8t2.getConversationId());
            this.LL.LJFF(c0y8t2.getConversationId(), false, null);
        }
    }

    public final void LIZ(int i, String str) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bookTimeOut[");
        sbLIZ.append(str);
        sbLIZ.append("]: ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        C882690Yjz.LJ("MsgSender_CQ");
        Message message = new Message();
        message.what = i;
        message.obj = str;
        ((Handler) this.LLILZ.getValue()).sendMessageDelayed(message, 10000L);
    }

    public final void LIZJ(String str, boolean z) {
        boolean z2;
        if (str == null) {
            return;
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enqueue before[");
        sbLIZ.append(str);
        sbLIZ.append("]: ");
        sbLIZ.append(LIZLLL().size());
        C882690Yjz.LJIIIZ("MsgSender_CQ", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (LIZLLL()) {
            try {
                if (!LIZLLL().containsKey(str)) {
                    z2 = true;
                    this.LLILZIL++;
                    int i = this.LLILZIL;
                    LIZLLL().put(str, Integer.valueOf(i));
                    LIZ(i, str);
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("enqueue after[");
        sbLIZ2.append(str);
        sbLIZ2.append("]: ");
        sbLIZ2.append(LIZLLL().size());
        sbLIZ2.append(", ");
        sbLIZ2.append(z2);
        C882690Yjz.LJIIIZ("MsgSender_CQ", C2188811AlT.LIZIZ(sbLIZ2));
        if (z2) {
            if (z) {
                try {
                    long j = CastLongProtector.parseLong(str);
                    if (((GroupFakeWriteExperimentData) C893380Z2y.LIZIZ.getValue()).enableFakeWrite) {
                        this.LLILLJJLI.LIZ().LJ(j, "send_msg");
                        return;
                    } else {
                        this.LLILLJJLI.LIZ().LJJI(str, j, AbstractC1711506n3.LIZIZ, new C914110ZtZ(this, str, 7));
                        return;
                    }
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C882400YjW.LIZ.getClass();
                    C882400YjW.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("invalid conversationId: ");
                    sbLIZ3.append(str);
                    C882690Yjz.LJFF("MsgSender_CQ", C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
            }
            C882400YjW.LIZLLL();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("create[");
            sbLIZ4.append(str);
            sbLIZ4.append(']');
            C2188811AlT.LIZIZ(sbLIZ4);
            C882690Yjz.LJ("MsgSender_CQ");
            C882400YjW.LIZ();
            C883250Ykt c883250Ykt = C883250Ykt.LL;
            this.LLILLL.LJJIIJ(String.valueOf(C2124408Ty.LIZIZ(C461720I8s.LIZJ(), str)), new C914110ZtZ(this, str, 6));
        }
    }

    public C874760YTi(MessageQueue messageQueue, C0YHX c0yhx, InterfaceC876950Yaj interfaceC876950Yaj) {
        this.LL = messageQueue;
        this.LLILLJJLI = c0yhx;
        this.LLILLL = interfaceC876950Yaj;
        interfaceC876950Yaj.LJI(this);
        this.LLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 27));
        this.LLILZLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(35));
    }
}
