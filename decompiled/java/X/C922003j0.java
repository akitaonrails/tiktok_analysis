package X;

import android.text.TextUtils;
import java.util.List;

/* JADX INFO: renamed from: X.03j0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C922003j0 {
    public boolean LIZ = true;
    public String LIZIZ = "";
    public String LIZJ;
    public String LIZLLL;
    public List<C922003j0> LJ;

    public final String LIZ() {
        return !TextUtils.isEmpty(this.LIZJ) ? this.LIZJ : TextUtils.isEmpty(this.LIZLLL) ? C928803k6.LIZ(this.LIZIZ, new String[0]) : C928803k6.LIZ(this.LIZIZ, this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{mIsValid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mErrorMessage='");
        sbLIZ.append(LIZ());
        sbLIZ.append('\'');
        sbLIZ.append(", mChildElementValidity=");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(String str, String... strArr) {
        this.LIZIZ = str;
        if (strArr.length > 0) {
            this.LIZLLL = strArr[0];
        }
    }
}
