package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import java.util.List;

/* JADX INFO: renamed from: X.0pN4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509000pN4 extends FeatureProducer {
    public static final C1509000pN4 LIZIZ = new C1509000pN4();
    public static boolean LIZJ = true;
    public static String LIZLLL = "f_live";
    public static final C1487590ooX<AbstractC1509490pNr> LJ = new C1487590ooX<>("f_play", 48);

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZLLL;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(List<FeatureItem> list) {
        if (LIZJ) {
            LIZJ = false;
            FeatureServiceManager.Companion.getClass();
            C1510050pOl.LIZ().addAppLogListener(C1509010pN5.LIZIZ);
        }
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZLLL = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ae, code lost:
    
        r1 = (java.lang.Integer) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b0, code lost:
    
        if (r1 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b2, code lost:
    
        r1 = com.ss.android.ugc.aweme.feature.info.LiveSessionFeatureInfo.Companion.obtainRecentInfoList(r1.intValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c2, code lost:
    
        if ((!r1.isEmpty()) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c4, code lost:
    
        r2 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d1, code lost:
    
        if (r1.hasNext() == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d3, code lost:
    
        r0 = r1.next().getFeature(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01dd, code lost:
    
        if (r0 != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01df, code lost:
    
        r0 = java.lang.Float.valueOf(-999.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e6, code lost:
    
        r2.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ea, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ec, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01ee, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01ef, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f0, code lost:
    
        if (r22 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01f2, code lost:
    
        r22.code = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01f4, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r19.equals("live_volume_decrease_cnt") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0107, code lost:
    
        if (r19.equals("live_volume_increase_cnt") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0111, code lost:
    
        if (r19.equals("live_volume_label") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011b, code lost:
    
        if (r19.equals("live_volume_level") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0125, code lost:
    
        if (r19.equals("live_room_id") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014e, code lost:
    
        if (r19.equals("live_volume_change") == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0186, code lost:
    
        if (r20 == null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0188, code lost:
    
        r1 = r20.opt("function");
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0194, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, "getRange") == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0196, code lost:
    
        r1 = r20.opt("params");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019c, code lost:
    
        if (r1 == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a0, code lost:
    
        if ((r1 instanceof org.json.JSONObject) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01a2, code lost:
    
        r1 = ((org.json.JSONObject) r1).opt("range");
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ac, code lost:
    
        if ((r1 instanceof java.lang.Integer) == false) goto L111;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFeatureInternal(java.lang.String r19, org.json.JSONObject r20, java.lang.String r21, com.ss.ugc.clientai.core.api.meta.ReturnCode r22) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1509000pN4.getFeatureInternal(java.lang.String, org.json.JSONObject, java.lang.String, com.ss.ugc.clientai.core.api.meta.ReturnCode):java.lang.Object");
    }
}
