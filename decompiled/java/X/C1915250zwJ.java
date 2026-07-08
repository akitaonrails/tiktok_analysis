package X;

import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;

/* JADX INFO: renamed from: X.0zwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915250zwJ {
    public final boolean LIZ;
    public final int LIZIZ;
    public final CollectConsentParam LIZJ;
    public final String LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FBVInfoAccessDecisionResult(needCollectConsent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resultCode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", collectConsentParam=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rowData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1915250zwJ(boolean z, int i, CollectConsentParam collectConsentParam, String str) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = collectConsentParam;
        this.LIZLLL = str;
    }
}
