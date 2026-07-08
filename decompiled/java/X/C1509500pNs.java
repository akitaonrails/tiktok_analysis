package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509500pNs extends FeatureProducer {
    public static boolean LIZJ;
    public static JSONObject LJI;
    public static ArrayList<AbstractC1509490pNr> LJII;
    public static final C1509500pNs LIZIZ = new C1509500pNs();
    public static String LIZLLL = "f_ad_play";
    public static final C1487590ooX<AbstractC1509490pNr> LJ = new C1487590ooX<>("f_ad_play", 48);
    public static int LJFF = -1;

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZLLL;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(List<FeatureItem> list) {
        LIZJ = true;
        C1509610pO3.LIZIZ.getClass();
        C1509610pO3.LIZJ = true;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZLLL = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:141:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0050 A[SYNTHETIC] */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFeatureInternal(java.lang.String r8, org.json.JSONObject r9, java.lang.String r10, com.ss.ugc.clientai.core.api.meta.ReturnCode r11) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1509500pNs.getFeatureInternal(java.lang.String, org.json.JSONObject, java.lang.String, com.ss.ugc.clientai.core.api.meta.ReturnCode):java.lang.Object");
    }
}
