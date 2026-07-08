package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.data.LimitedSizeHashMap;
import com.ss.ugc.live.sdk.message.interfaces.EventListener;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.1By1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222071By1 implements IInterceptor {
    public final InterfaceC2222101By4 LL;
    public final LimitedSizeHashMap LLILLJJLI;
    public final LimitedSizeHashMap LLILLL;

    public final void LIZIZ() {
        this.LLILLJJLI.clear();
        this.LLILLL.clear();
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        C2222271ByL c2222271ByLLIZLLL;
        C2222271ByL c2222271ByLLIZLLL2;
        if (C2221841Bxe.LIZJ(iMessage.getGeneralMessageType())) {
            if (this.LLILLL.containsKey(Long.valueOf(iMessage.getOuterMessageId()))) {
                InterfaceC2222101By4 interfaceC2222101By4 = this.LL;
                if (interfaceC2222101By4 != null && (c2222271ByLLIZLLL2 = interfaceC2222101By4.LIZLLL()) != null) {
                    Iterator it2 = ((CopyOnWriteArrayList) c2222271ByLLIZLLL2.LIZ).iterator();
                    while (it2.hasNext()) {
                        ((EventListener) it2.next()).onDeduplicateInterceptorMessage(iMessage);
                    }
                }
                return true;
            }
            this.LLILLL.put(Long.valueOf(iMessage.getOuterMessageId()), null);
            return false;
        }
        if (this.LLILLJJLI.containsKey(Long.valueOf(iMessage.getOuterMessageId()))) {
            InterfaceC2222101By4 interfaceC2222101By42 = this.LL;
            if (interfaceC2222101By42 != null && (c2222271ByLLIZLLL = interfaceC2222101By42.LIZLLL()) != null) {
                Iterator it3 = ((CopyOnWriteArrayList) c2222271ByLLIZLLL.LIZ).iterator();
                while (it3.hasNext()) {
                    ((EventListener) it3.next()).onDeduplicateInterceptorMessage(iMessage);
                }
            }
            return true;
        }
        this.LLILLJJLI.put(Long.valueOf(iMessage.getOuterMessageId()), null);
        return false;
    }

    public C2222071By1(int i, InterfaceC2222101By4 interfaceC2222101By4) {
        this.LL = interfaceC2222101By4;
        this.LLILLJJLI = new LimitedSizeHashMap(i);
        this.LLILLL = new LimitedSizeHashMap(i);
    }
}
