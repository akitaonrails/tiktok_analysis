package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.18hC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21352018hC implements Iterator<C21148417pS> {
    public final C21148417pS LL = new C21148417pS();
    public final StringBuilder LLILLJJLI = new StringBuilder();
    public final int LLILLL;
    public int LLILZ;
    public final /* synthetic */ C21352118hD LLILZIL;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C21148417pS c21148417pS = this.LL;
        c21148417pS.LIZ = "";
        c21148417pS.LIZIZ = "";
        this.LLILLJJLI.setLength(0);
        int i = this.LLILZ;
        String strTrim = null;
        boolean z = false;
        String strTrim2 = null;
        while (true) {
            if (i < this.LLILLL) {
                char cCharAt = this.LLILZIL.LL.charAt(i);
                if (strTrim == null) {
                    if (':' == cCharAt) {
                        if (this.LLILLJJLI.length() > 0) {
                            strTrim = this.LLILLJJLI.toString().trim();
                        }
                        this.LLILLJJLI.setLength(0);
                    } else if (';' == cCharAt) {
                        this.LLILLJJLI.setLength(0);
                    } else if (Character.isWhitespace(cCharAt)) {
                        if (this.LLILLJJLI.length() > 0) {
                            z = true;
                        }
                    } else if (z) {
                        this.LLILLJJLI.setLength(0);
                        this.LLILLJJLI.append(cCharAt);
                        z = false;
                    } else {
                        this.LLILLJJLI.append(cCharAt);
                    }
                } else if (strTrim2 != null) {
                    continue;
                } else if (Character.isWhitespace(cCharAt)) {
                    if (this.LLILLJJLI.length() > 0) {
                        this.LLILLJJLI.append(cCharAt);
                    }
                } else if (';' == cCharAt) {
                    strTrim2 = this.LLILLJJLI.toString().trim();
                    this.LLILLJJLI.setLength(0);
                    if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                        this.LLILZ = i + 1;
                        C21148417pS c21148417pS2 = this.LL;
                        c21148417pS2.LIZ = strTrim;
                        c21148417pS2.LIZIZ = strTrim2;
                        break;
                    }
                } else {
                    this.LLILLJJLI.append(cCharAt);
                }
                i++;
            } else if (strTrim != null && this.LLILLJJLI.length() > 0) {
                String strTrim3 = this.LLILLJJLI.toString().trim();
                C21148417pS c21148417pS3 = this.LL;
                c21148417pS3.LIZ = strTrim;
                c21148417pS3.LIZIZ = strTrim3;
                this.LLILZ = this.LLILLL;
            }
        }
        C21148417pS c21148417pS4 = this.LL;
        return (TextUtils.isEmpty(c21148417pS4.LIZ) || TextUtils.isEmpty(c21148417pS4.LIZIZ)) ? false : true;
    }

    @Override // java.util.Iterator
    public final C21148417pS next() {
        C21148417pS c21148417pS = this.LL;
        String str = c21148417pS.LIZ;
        String str2 = c21148417pS.LIZIZ;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new NoSuchElementException();
        }
        return this.LL;
    }

    public C21352018hC(C21352118hD c21352118hD) {
        this.LLILZIL = c21352118hD;
        this.LLILLL = c21352118hD.LL.length();
    }
}
