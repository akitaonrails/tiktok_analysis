package X;

import com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult;

/* JADX INFO: renamed from: X.0LSP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LSP {
    public static final C381550Exd LIZ(QuotaResult quotaResult) {
        int iIntValue;
        int iIntValue2;
        Integer num = quotaResult.quotaRemain;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        Integer num2 = quotaResult.quota;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            iIntValue2 = 0;
        }
        return new C381550Exd("", iIntValue, iIntValue2, quotaResult.errorCode, quotaResult.errorMsg, quotaResult.errorSource, null, 64);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C381540Exc LIZIZ(X.C0LSZ r76) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LSP.LIZIZ(X.0LSZ):X.0Exc");
    }
}
