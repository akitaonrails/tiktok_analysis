package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.0wjn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1792170wjn extends C1793980wmi {
    public String LIZ;
    public String LIZIZ;
    public long LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public HashMap<String, ?> LJI;
    public boolean LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJJI;
    public final long LJIILJJIL;
    public String LJIIJ = "";
    public String LJIILIIL = "";
    public Map<String, String> LJIIL = new TreeMap();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IapPayRequest{mSign='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mMerchantId='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mTimestamp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mDid='");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('\'');
        sbLIZ.append(", mUid='");
        sbLIZ.append(this.LJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mBizContent='");
        sbLIZ.append(this.LJFF);
        sbLIZ.append('\'');
        sbLIZ.append(", mIsSubscription=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", mRequestHost=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mProductId='");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", mExtraPayload='");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append('\'');
        sbLIZ.append(", mHasCreateOrderOnServer=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", mPayRequestParams=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", mStartPayTimeStamp=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(", mClientFlow=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1792170wjn(long j) {
        this.LJIILJJIL = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(HashMap map) {
        C1152610g6F c1152610g6F = ((C1795210woh) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZ()).LIZ.LJFF.LJIIIIZZ;
        c1152610g6F.LIZ();
        List<String> list = c1152610g6F.LIZJ.bizTrackWhiteList;
        HashMap<String, ?> map2 = new HashMap<>();
        for (Map.Entry entry : map.entrySet()) {
            if (list.contains(entry.getKey())) {
                map2.put(entry.getKey(), entry.getValue());
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("biz_");
                sbLIZ.append((String) entry.getKey());
                map2.put(C2188811AlT.LIZIZ(sbLIZ), entry.getValue());
            }
        }
        this.LJI = map2;
    }
}
