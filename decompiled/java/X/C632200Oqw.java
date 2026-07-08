package X;

import com.ss.android.ugc.aweme.network.model.BaseResponse;

/* JADX INFO: renamed from: X.0Oqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632200Oqw extends Throwable {
    public final int LL;
    public final String LLILLJJLI;
    public final BaseResponse LLILLL;

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMsg() {
        return this.LLILLJJLI;
    }

    public final BaseResponse getRawResponse() {
        return this.LLILLL;
    }

    public C632200Oqw(int i, String str, BaseResponse baseResponse) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = baseResponse;
    }
}
