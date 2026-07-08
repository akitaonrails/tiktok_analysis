package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XEJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XEJ extends FeatureProducer {
    public final String LIZIZ;
    public String LIZLLL;
    public int LIZJ = 2;
    public final Map<FeatureItem, AbstractC1513210pTr> LJ = new LinkedHashMap();
    public final Map<String, FeatureItem> LJFF = new LinkedHashMap();

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return this.LIZLLL;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final int getSourceType() {
        return this.LIZJ;
    }

    public C0XEJ(String str) {
        this.LIZIZ = str;
        this.LIZLLL = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f2 A[SYNTHETIC] */
    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void enableProducer(java.util.List<com.ss.ugc.clientai.core.api.meta.FeatureItem> r26) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XEJ.enableProducer(java.util.List):void");
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        this.LIZLLL = str;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setSourceType(int i) {
        this.LIZJ = i;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final boolean saveValueToProducer(String str, Object obj) {
        AbstractC1513210pTr abstractC1513210pTr;
        Object obj2 = ((LinkedHashMap) this.LJFF).get(str);
        if (obj2 != null && (abstractC1513210pTr = (AbstractC1513210pTr) ((LinkedHashMap) this.LJ).get(obj2)) != null) {
            if (abstractC1513210pTr.LJII(obj)) {
                notifyGlobalFeatureChange(str, 2);
                triggerFeatureChangeListener(str);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        Object objLIZJ;
        Object obj = ((LinkedHashMap) this.LJFF).get(str);
        if (obj != null) {
            if (returnCode != null) {
                returnCode.code = 200;
            }
            AbstractC1513210pTr abstractC1513210pTr = (AbstractC1513210pTr) ((LinkedHashMap) this.LJ).get(obj);
            if (abstractC1513210pTr != null && (objLIZJ = abstractC1513210pTr.LIZJ(jSONObject, u.LJJIIJZLJL(str2, "psp_", false))) != null) {
                return objLIZJ;
            }
            if (returnCode == null) {
                return null;
            }
            returnCode.code = 1;
            return null;
        }
        if (returnCode != null) {
            returnCode.code = 1;
        }
        return null;
    }
}
