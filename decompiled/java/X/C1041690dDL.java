package X;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: X.0dDL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041690dDL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Uri uri, Bundle bundle, C1041600dDC c1041600dDC) {
        Object obj;
        Object objLIZJ = null;
        if (uri == null) {
            obj = null;
        } else {
            C1041700dDM c1041700dDM = new C1041700dDM();
            AbstractC1041890dDf.LIZIZ(c1041700dDM, Uri.class, uri);
            Object objLIZJ2 = c1041700dDM.LIZJ.LIZJ();
            if (objLIZJ2 != null) {
                C1041720dDO c1041720dDO = new C1041720dDO();
                AbstractC1041890dDf.LIZIZ(c1041720dDO, Uri.class, objLIZJ2);
                objLIZJ = c1041720dDO.LIZIZ.LIZJ();
            }
            obj = objLIZJ;
            objLIZJ = objLIZJ2;
        }
        if (bundle != null) {
            AbstractC1041890dDf.LIZIZ(c1041600dDC, Bundle.class, bundle);
        }
        if (objLIZJ != null) {
            AbstractC1041890dDf.LIZIZ(c1041600dDC, Uri.class, objLIZJ);
        }
        if (obj != null) {
            AbstractC1041890dDf.LIZIZ(c1041600dDC, Uri.class, obj);
        }
    }
}
