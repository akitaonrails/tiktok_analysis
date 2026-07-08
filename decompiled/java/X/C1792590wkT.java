package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wkT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792590wkT extends AbstractC1791620wiu {
    /* JADX WARN: Type inference failed for: r0v36, types: [X.0wkV] */
    public C1792590wkT(C1792740wki c1792740wki) {
        Object objLJIIIZ;
        AbstractC1794600wni abstractC1794600wni;
        String strLIZ;
        this.LIZ = c1792740wki.LIZJ;
        String str = c1792740wki.LIZLLL;
        this.LIZIZ = str;
        String strLIZ2 = "";
        if (str.equals("inapp")) {
            String str2 = c1792740wki.LIZ().LIZ;
            Long lValueOf = Long.valueOf(c1792740wki.LIZ().LIZIZ);
            C1791650wix c1791650wix = new C1791650wix(this.LIZ, str2, lValueOf.longValue(), c1792740wki.LIZ().LIZJ);
            this.LJ = c1791650wix;
            int i = C1790270wgj.LIZ;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("product_id", c1791650wix.LIZ);
                strLIZ2 = C1790270wgj.LIZ(C786410Ut5.J3(jSONObject));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c1791650wix.LIZIZ = strLIZ2;
        } else {
            List list = c1792740wki.LJIIIIZZ;
            if (list == null || list.size() == 0) {
                this.LJFF = null;
            }
            String str3 = this.LIZ;
            List<C1792640wkY> list2 = c1792740wki.LJIIIIZZ;
            ArrayList arrayList = new ArrayList();
            for (C1792640wkY c1792640wkY : list2) {
                ArrayList arrayList2 = new ArrayList();
                for (C1792600wkU c1792600wkU : (ArrayList) c1792640wkY.LIZLLL.LIZ) {
                    arrayList2.add(new C1791640wiw(c1792600wkU.LIZ, c1792600wkU.LIZIZ, c1792600wkU.LIZJ, c1792600wkU.LIZLLL, c1792600wkU.LJ, c1792600wkU.LJFF));
                }
                String str4 = c1792640wkY.LIZJ;
                String str5 = c1792640wkY.LIZ;
                C1791630wiv c1791630wiv = new C1791630wiv(str3, str4, str5, c1792640wkY.LIZIZ, arrayList2, c1792640wkY.LJ);
                int i2 = C1790270wgj.LIZ;
                C1796570wqt c1796570wqtLIZ = C1795360wow.LIZIZ().LIZ();
                if (c1796570wqtLIZ == null) {
                    abstractC1794600wni = null;
                } else {
                    C199596137q c199596137q = c1796570wqtLIZ.LIZ;
                    if (c199596137q != null) {
                        objLJIIIZ = c199596137q.LJIIIZ(str3);
                    } else {
                        objLJIIIZ = null;
                    }
                    abstractC1794600wni = (AbstractC1794600wni) objLJIIIZ;
                }
                JSONObject jSONObject2 = new JSONObject();
                if (abstractC1794600wni != null) {
                    try {
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.put(abstractC1794600wni.LJFF);
                        jSONObject2.put("channel_purchase_ids", jSONArray);
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw new RuntimeException(e2);
                    }
                }
                try {
                    jSONObject2.put("product_id", str3);
                    jSONObject2.put("offer_id_token", str4);
                    jSONObject2.put("base_plan_id", str5);
                    jSONObject2.put("offer_id", c1791630wiv.LIZJ);
                    strLIZ = C1790270wgj.LIZ(C786410Ut5.J3(jSONObject2));
                } catch (JSONException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    strLIZ = "";
                }
                c1791630wiv.LJFF = strLIZ;
                arrayList.add(c1791630wiv);
            }
            this.LJFF = arrayList;
        }
        this.LIZJ = c1792740wki.LJ;
        this.LIZLLL = c1792740wki.LJFF;
        this.LJI = new Object() { // from class: X.0wkV
        };
    }
}
