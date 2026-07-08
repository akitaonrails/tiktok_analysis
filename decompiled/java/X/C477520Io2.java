package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0Io2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C477520Io2 extends C501470JlZ {
    public final String LLIZLLLIL;
    public final String LLJ;

    @Override // X.C501470JlZ, X.C501520Jle, java.lang.Throwable
    public String getMessage() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" TYPE = CustomApiServerException, url = ");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", xTtLogId = ");
        sbLIZ.append(this.LLJ);
        sbLIZ.append("  ");
        sbLIZ.append(super.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getUrl() {
        return this.LLIZLLLIL;
    }

    public String getxTtLogId() {
        return this.LLJ;
    }

    public C477520Io2(int i, String str, String str2) {
        super(i);
        if (TextUtils.isEmpty(str)) {
            this.LLIZLLLIL = "";
        } else {
            this.LLIZLLLIL = str;
        }
        if (TextUtils.isEmpty(str2)) {
            this.LLJ = "";
        } else {
            this.LLJ = str2;
        }
    }
}
