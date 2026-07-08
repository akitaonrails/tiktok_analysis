package X;

import com.bytedance.android.live.network.response.BaseResponse;

/* JADX INFO: renamed from: X.0Jlc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501500Jlc extends C501490Jlb {
    public final BaseResponse LLILLJJLI;

    public C501500Jlc() {
        super(-2);
    }

    @Override // X.C501490Jlb, X.C501520Jle, java.lang.Throwable
    public String getMessage() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" TYPE = ResponseNoDataException ");
        sbLIZ.append(super.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BaseResponse getResponse() {
        return this.LLILLJJLI;
    }

    public C501500Jlc(BaseResponse baseResponse) {
        super(-2);
        this.LLILLJJLI = baseResponse;
    }
}
