package X;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0XMA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XMA {
    public String LIZ;
    public TypedOutput LIZIZ;
    public final AbstractC842530X3j LIZJ;

    public C0XMA(Request request) {
        String method = request.getMethod();
        if (method != null) {
            this.LIZ = method;
            this.LIZIZ = request.getBody();
            this.LIZJ = request.getRequestBody();
            return;
        }
        throw new NullPointerException("Method must not be null.");
    }

    public final void LIZ(TypedOutput typedOutput, String str) {
        if (!a0.LJJJIL(str)) {
            if (C2396109aB.LJIIL(str)) {
                this.LIZ = str;
                this.LIZIZ = typedOutput;
                return;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("method ");
                sbLIZ.append(str);
                sbLIZ.append(" must not have a request body.");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        throw new IllegalArgumentException("method.length() == 0");
    }
}
