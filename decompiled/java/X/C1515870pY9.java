package X;

import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;

/* JADX INFO: renamed from: X.0pY9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515870pY9<T> extends Response<T> implements InterfaceC1201180hMa, C0X12, InterfaceC1515810pY3, InterfaceC1515800pY2 {
    public C1494600ozq<?> LL;
    public String LLILLJJLI;

    public C1515870pY9() {
        this(0);
    }

    @Override // X.InterfaceC1515810pY3
    public final void LIZ() {
    }

    @Override // X.InterfaceC1515800pY2
    public final void LIZIZ(C0PQA c0pqa) {
    }

    @Override // X.InterfaceC1201180hMa
    public final /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    @Override // X.C0X12
    public final String getRequestId() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1201180hMa
    public final C1494600ozq<?> getRequestInfo() {
        return this.LL;
    }

    public C1515870pY9(int i) {
        super(-1, null, null, null, null);
    }

    @Override // X.C0X12
    public final void setRequestId(String str) {
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC1201180hMa
    public final void setRequestInfo(C1494600ozq<?> c1494600ozq) {
        this.LL = c1494600ozq;
    }

    public static C1515870pY9 LIZJ(C1515870pY9 c1515870pY9, ECMixMallPageDTO eCMixMallPageDTO) {
        return new C1515870pY9(c1515870pY9.code, c1515870pY9.message, eCMixMallPageDTO, c1515870pY9.chunkIndex, c1515870pY9.logId);
    }

    public C1515870pY9(int i, String str, T t, Integer num, String str2) {
        super(i, str, t, num, str2);
    }
}
