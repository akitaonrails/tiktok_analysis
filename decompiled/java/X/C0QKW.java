package X;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0QKW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QKW extends AbstractC666100QAu<SearchSugResponse> {
    public final /* synthetic */ C0QJX LL;

    public C0QKW(C0QJX c0qjx) {
        this.LL = c0qjx;
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        String str;
        if (objArr == null || objArr.length == 0) {
            return false;
        }
        Object obj = objArr[0];
        if (obj instanceof C668540QKe) {
            str = ((C668540QKe) obj).keywords;
        } else {
            str = "";
        }
        return !TextUtils.isEmpty(str);
    }

    @Override // X.AbstractC666100QAu, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if ((C301410Brf.LIZ() && HandlerHook.getMessageObj(message.obj) == null) || (HandlerHook.getMessageObj(message.obj) instanceof CancellationException)) {
            return;
        }
        if (HandlerHook.getMessageObj(message.obj) instanceof SearchSugResponse) {
            SearchSugResponse searchSugResponse = (SearchSugResponse) HandlerHook.getMessageObj(message.obj);
            C0QKX c0qkx = searchSugResponse.LLILZ;
            if (c0qkx == null || c0qkx.LIZJ) {
                return;
            }
            while (!this.LL.LLIZ.isEmpty()) {
                C0QKX c0qkx2 = (C0QKX) ((LinkedList) this.LL.LLIZ).pollFirst();
                long j = c0qkx2.LIZ;
                long j2 = c0qkx.LIZ;
                if (j < j2) {
                    c0qkx2.LIZ();
                } else if (j == j2) {
                    searchSugResponse.LLILZ = null;
                } else {
                    return;
                }
            }
            return;
        }
        super.handleMsg(message);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    @Override // X.AbstractC666100QAu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean sendRequest(java.lang.Object... r13) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QKW.sendRequest(java.lang.Object[]):boolean");
    }
}
