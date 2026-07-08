package X;

import com.ss.android.ugc.aweme.ml.ab.SmartLivePreviewStreamExperiment;
import com.ss.android.ugc.aweme.ml.ab.SmartPrerenderExperiment;
import com.ss.android.ugc.aweme.ml.impl.SmartServiceBaseImpl;

/* JADX INFO: renamed from: X.0pQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511400pQw extends C1511390pQv {
    public static final C1511400pQw LIZLLL = new C1511400pQw();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.C1511390pQv
    public final AbstractC1511510pR7 LIZIZ(String str) {
        switch (str.hashCode()) {
            case 1076754224:
                if (str.equals(SmartLivePreviewStreamExperiment.SCENE)) {
                    return C1511440pR0.LIZ;
                }
                break;
            case 1113544895:
                if (str.equals(SmartPrerenderExperiment.SCENE)) {
                    return C1511450pR1.LIZ;
                }
                break;
            case 1691937916:
                if (str.equals("homepage_hot")) {
                    return C1511570pRD.LIZLLL;
                }
                break;
            case 1853210144:
                if (str.equals("social_smart_rec_popup_freq_control")) {
                    return C1511230pQf.LIZ;
                }
                break;
        }
        return super.LIZIZ(str);
    }

    @Override // X.C1511390pQv
    public final AbstractC1511510pR7 LIZ(String str, C1510230pP3 c1510230pP3) {
        AbstractC1511510pR7 smartServiceBaseImpl = this.LIZ.get(str);
        if (smartServiceBaseImpl == null) {
            if (c1510230pP3 == null) {
                return null;
            }
            smartServiceBaseImpl = new SmartServiceBaseImpl(c1510230pP3);
            LIZLLL.LIZ.put(str, smartServiceBaseImpl);
        }
        return smartServiceBaseImpl;
    }
}
