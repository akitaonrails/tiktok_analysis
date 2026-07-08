package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0yYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862150yYf extends C1862240yYo {
    public Integer LIZIZ;
    public Integer LIZJ;
    public String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchChainStatus(status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", errorDesc=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZJ(int i) {
        int iIntValue;
        Integer numValueOf = Integer.valueOf(i);
        this.LIZJ = numValueOf;
        HashMap<String, Object> map = this.LIZ;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = -1;
        }
        map.put("error_code", Integer.valueOf(iIntValue));
    }

    public final void LIZLLL(String str) {
        this.LIZLLL = str;
        HashMap<String, Object> map = this.LIZ;
        if (str == null) {
            str = "";
        }
        map.put("error_desc", str);
    }

    public final void LJ(int i) {
        Integer numValueOf = Integer.valueOf(i);
        this.LIZIZ = numValueOf;
        HashMap<String, Object> map = this.LIZ;
        Object obj = numValueOf;
        if (numValueOf == null) {
            obj = "";
        }
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, obj);
    }

    public final void LIZIZ(int i, int i2, String str, boolean z) {
        LJ(i);
        LIZJ(i2);
        if (str == null) {
            str = "not define";
        }
        LIZLLL(str);
        if (i != 0 && !z) {
            C1862130yYd.LIZ.getClass();
            if (!C1862130yYd.LIZIZ && C1862130yYd.LIZ()) {
                C1862130yYd.LJII();
            }
        }
    }
}
