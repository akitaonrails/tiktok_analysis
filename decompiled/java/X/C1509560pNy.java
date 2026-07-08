package X;

import com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509560pNy extends FeatureProducer {
    public static boolean LIZJ;
    public static JSONObject LJIIIZ;
    public static ArrayList<C1509690pOB> LJIIJ;
    public static boolean LJIIJJI;
    public static final C1509560pNy LIZIZ = new C1509560pNy();
    public static String LIZLLL = "f_session";
    public static final int LJ = 10;
    public static final C1487590ooX<C1509690pOB> LJFF = new C1487590ooX<>("f_session", 16);
    public static final C1509680pOA LJI = new MemoryFeatureInfo() { // from class: X.0pOA
        @Override // com.ss.android.ugc.aweme.feature.info.MemoryFeatureInfo
        public final String toString() {
            return super.toString();
        }
    };
    public static boolean LJII = true;
    public static int LJIIIIZZ = -1;

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZLLL;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(List<FeatureItem> list) {
        C1509610pO3.LIZIZ.getClass();
        C1509610pO3.LIZJ = true;
        LIZJ = true;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZLLL = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x013e, code lost:
    
        if (r8.equals("lastSequenceId") != false) goto L93;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099  */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFeatureInternal(java.lang.String r8, org.json.JSONObject r9, java.lang.String r10, com.ss.ugc.clientai.core.api.meta.ReturnCode r11) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1509560pNy.getFeatureInternal(java.lang.String, org.json.JSONObject, java.lang.String, com.ss.ugc.clientai.core.api.meta.ReturnCode):java.lang.Object");
    }
}
