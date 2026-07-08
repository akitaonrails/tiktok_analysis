package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0pNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1509420pNk extends FeatureProducer {
    public static ArrayList<AbstractC1509490pNr> LIZJ;
    public static final C1509420pNk LIZIZ = new C1509420pNk();
    public static int LIZLLL = -1;
    public static String LJ = "f_feed";

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LJ;
    }

    public static Object LIZ(AbstractC1509490pNr abstractC1509490pNr) {
        n nVar;
        ArrayList arrayList;
        k kVarLJJIIZ;
        String strLJIL;
        try {
            Object feature = abstractC1509490pNr.getFeature("play_time_prob_dist");
            if (feature == null) {
                Object feature2 = abstractC1509490pNr.getFeature("video_meta_json");
                if (feature2 instanceof n) {
                    nVar = (n) feature2;
                } else {
                    nVar = null;
                }
                if (nVar != null && (kVarLJJIIZ = nVar.LJJIIZ("play_time_prob_dist")) != null && (strLJIL = kVarLJJIIZ.LJIL()) != null) {
                    new p();
                    k kVarLIZJ = p.LIZJ(strLJIL);
                    boolean z = true;
                    if (!(kVarLIZJ instanceof h)) {
                        z = false;
                    }
                    if (!z) {
                        return new ArrayList();
                    }
                    arrayList = new ArrayList();
                    Iterator<k> it2 = kVarLIZJ.LJIIL().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Float.valueOf(it2.next().LJIIJ()));
                    }
                    abstractC1509490pNr.setFeature("play_time_prob_dist", arrayList);
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    return new ArrayList();
                }
                return arrayList;
            }
            return feature;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
            return new ArrayList();
        }
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LJ = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0275 A[LOOP:1: B:148:0x024f->B:162:0x0275, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x027c A[EDGE_INSN: B:292:0x027c->B:165:0x027c BREAK  A[LOOP:1: B:148:0x024f->B:162:0x0275], SYNTHETIC] */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getFeatureInternal(java.lang.String r21, org.json.JSONObject r22, java.lang.String r23, com.ss.ugc.clientai.core.api.meta.ReturnCode r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1509420pNk.getFeatureInternal(java.lang.String, org.json.JSONObject, java.lang.String, com.ss.ugc.clientai.core.api.meta.ReturnCode):java.lang.Object");
    }
}
