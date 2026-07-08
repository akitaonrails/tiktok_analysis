package X;

import com.facebook.FacebookRequestError;

/* JADX INFO: renamed from: X.0WVE, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WVE extends C1BJO {
    public static final C0WVF Companion = new Object() { // from class: X.0WVF
    };
    public static final long serialVersionUID = 1;
    public final FacebookRequestError LL;

    @Override // X.C1BJO, java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{FacebookServiceException: ");
        sbLIZ.append("httpResponseCode: ");
        sbLIZ.append(this.LL.requestStatusCode);
        sbLIZ.append(", facebookErrorCode: ");
        sbLIZ.append(this.LL.errorCode);
        sbLIZ.append(", facebookErrorType: ");
        sbLIZ.append(this.LL.errorType);
        sbLIZ.append(", message: ");
        sbLIZ.append(this.LL.LIZ());
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final FacebookRequestError getRequestError() {
        return this.LL;
    }

    public C0WVE(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.LL = facebookRequestError;
    }
}
