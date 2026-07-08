package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;

/* JADX INFO: renamed from: X.0QDF, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDF {
    public static final C0QDF LIZ = new C0QDF();

    public static String LIZ(Aweme aweme, Integer num) {
        LogPbBean logPbBean;
        String imprId;
        int iIntValue;
        String strLJIJ;
        LogPbBean logPbBean2;
        if (((Boolean) C04SN.LIZ.getValue()).booleanValue()) {
            if (aweme == null || (logPbBean2 = aweme.getLogPbBean()) == null || (strLJIJ = logPbBean2.getImprId()) == null) {
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                strLJIJ = C735370Ssx.LJIJ(iIntValue, aweme);
                if (strLJIJ == null) {
                    strLJIJ = "";
                }
            }
            if (strLJIJ.length() > 0) {
                return strLJIJ;
            }
            return ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL;
        }
        if (aweme == null || (logPbBean = aweme.getLogPbBean()) == null || (imprId = logPbBean.getImprId()) == null) {
            return ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL;
        }
        return imprId;
    }
}
