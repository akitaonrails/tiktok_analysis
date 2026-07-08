package X;

import android.os.Message;
import android.util.Log;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;

/* JADX INFO: renamed from: X.116T, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C116T extends AbstractC666100QAu<SearchSugChallengeList> {
    public int LL;
    public C116U LLILLJJLI;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC666100QAu
    public final void handleData(SearchSugChallengeList searchSugChallengeList) {
        if (searchSugChallengeList != 0) {
            this.mData = searchSugChallengeList;
        }
    }

    @Override // X.AbstractC666100QAu, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        int i = message.what;
        if (i != this.LL) {
            this.mHandler.removeMessages(i);
            return;
        }
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            Throwable th = (Throwable) HandlerHook.getMessageObj(message.obj);
            if (th.getMessage() != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("challenge search failed, message:");
                sbLIZ.append(th.getMessage());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("challenge search failed, stack trace:");
            sbLIZ2.append(Log.getStackTraceString(th));
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (!(HandlerHook.getMessageObj(message.obj) instanceof C116V)) {
            super.handleMsg(message);
        }
    }

    @Override // X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        boolean zLJI = MethodIDManager.LJI(138006);
        if (C10EU.LJIIIIZZ()) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return false;
        }
        if (!super.sendRequest(objArr[0], objArr[1])) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return false;
        }
        this.LL = (this.LL + 1) % 10;
        C116U c116u = this.LLILLJJLI;
        if (c116u != null) {
            c116u.LLILZIL = true;
        }
        this.LLILLJJLI = new C116U(this, objArr);
        C1BVK.LIZIZ().LIZ(this.mHandler, this.LLILLJJLI, this.LL);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return true;
    }
}
