package X;

import Y.ACallableS249S0200000_21;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;

/* JADX INFO: renamed from: X.0l8E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346040l8E extends AbstractC1344720l66<BaseCommentResponse> {
    public String LLILLL = "";
    public String LLILZ = "";

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 4) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1344720l66, X.AbstractC666100QAu
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS249S0200000_21(this, objArr, 1), 0);
        return true;
    }

    @Override // X.AbstractC1344720l66
    public final /* bridge */ /* synthetic */ void LJIIJ(BaseCommentResponse baseCommentResponse) {
    }
}
