package X;

import com.bytedance.im.core.proto.Response;

/* JADX INFO: renamed from: X.0Y8K, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y8K extends Exception {
    public static final C0Y8L Companion = new C0Y8L();
    public final int LL;
    public final String LLILLJJLI;
    public final Response LLILLL;

    public final boolean isClientOrNetworkFailure() {
        return this.LLILLL == null;
    }

    public final boolean isRecoverableFailure() {
        int i = this.LL;
        return i == -1014 || i == -1031;
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMessage() {
        return this.LLILLJJLI;
    }

    public final Response getErrorResponse() {
        return this.LLILLL;
    }

    public C0Y8K(int i, String str, Response response) {
        super(str);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = response;
    }
}
