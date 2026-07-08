package X;

import com.ss.android.ugc.aweme.app.api.RequestLog;

/* JADX INFO: renamed from: X.0pY4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1515820pY4<T> implements InterfaceC1201180hMa, C0X12, InterfaceC1515810pY3 {
    public InterfaceC644200POo<T> LL;
    public final boolean LLILLJJLI;
    public String LLILLL;
    public C1494600ozq LLILZ;
    public C0PQA LLILZIL;
    public InterfaceC1515700pXs LLILZLL;

    @Override // X.InterfaceC1515810pY3
    public void LIZ() {
    }

    @Override // X.InterfaceC1201180hMa
    public final /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public C0PQA LIZIZ() {
        return this.LLILZIL;
    }

    @Override // X.C0X12
    public final String getRequestId() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1201180hMa
    public C1494600ozq getRequestInfo() {
        return this.LLILZ;
    }

    public C1515820pY4(InterfaceC644200POo<T> interfaceC644200POo) {
        this(interfaceC644200POo, Boolean.FALSE);
    }

    public final C1515840pY6 LIZJ(InterfaceC1515570pXf interfaceC1515570pXf) {
        return new C1515840pY6(new C1515850pY7(this, interfaceC1515570pXf), this);
    }

    public final void LIZLLL(C0POE<T> c0poe) {
        this.LL.LIZ(c0poe);
        if (!this.LLILLJJLI) {
            this.LL = null;
        }
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.LLILLL = str;
    }

    @Override // X.InterfaceC1201180hMa
    public void setRequestInfo(C1494600ozq c1494600ozq) {
        this.LLILZ = c1494600ozq;
        InterfaceC1515700pXs interfaceC1515700pXs = this.LLILZLL;
        if (interfaceC1515700pXs != null) {
            interfaceC1515700pXs.LIZ(c1494600ozq);
        }
    }

    public C1515820pY4(InterfaceC644200POo<T> interfaceC644200POo, Boolean bool) {
        this.LLILLL = "";
        this.LL = interfaceC644200POo;
        this.LLILLJJLI = bool.booleanValue();
    }
}
