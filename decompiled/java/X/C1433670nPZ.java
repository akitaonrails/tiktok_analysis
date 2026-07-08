package X;

import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import java.util.Objects;

/* JADX INFO: renamed from: X.0nPZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433670nPZ extends RuntimeException {
    public final SynthetiseResult LL;
    public C1433230nOr LLILLJJLI;

    public int getCode() {
        return this.LL.ret;
    }

    public String getVESDKErrorCode() {
        return this.LL.getVESDKErrorCode();
    }

    public C1433230nOr getCancelCause() {
        return this.LLILLJJLI;
    }

    public SynthetiseResult getResult() {
        return this.LL;
    }

    public void setCancelCause(C1433230nOr c1433230nOr) {
        Objects.requireNonNull(c1433230nOr);
        this.LLILLJJLI = c1433230nOr;
    }

    public C1433670nPZ(String str, SynthetiseResult synthetiseResult) {
        super(str);
        this.LLILLJJLI = new C1433700nPc().LIZ();
        this.LL = synthetiseResult;
    }

    public C1433670nPZ(Throwable th, SynthetiseResult synthetiseResult) {
        super(th);
        this.LLILLJJLI = new C1433700nPc().LIZ();
        this.LL = synthetiseResult;
    }
}
