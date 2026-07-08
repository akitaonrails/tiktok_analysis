package X;

import com.squareup.wire.Message;
import com.ss.android.ugc.aweme.app.api.RequestLog;

/* JADX INFO: renamed from: X.0pY5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515830pY5<P extends Message, J> implements InterfaceC1201180hMa, C0X12 {
    public final P LL;
    public C1494600ozq LLILLJJLI;
    public String LLILLL = "";

    @Override // X.InterfaceC1201180hMa
    public final /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    @Override // X.C0X12
    public final String getRequestId() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1201180hMa
    public final C1494600ozq getRequestInfo() {
        return this.LLILLJJLI;
    }

    public C1515830pY5(P p) {
        if (p != null) {
            this.LL = p;
            return;
        }
        throw new IllegalArgumentException("wrong args");
    }

    @Override // X.C0X12
    public final void setRequestId(String str) {
        this.LLILLL = str;
    }

    @Override // X.InterfaceC1201180hMa
    public final void setRequestInfo(C1494600ozq c1494600ozq) {
        this.LLILLJJLI = c1494600ozq;
    }
}
