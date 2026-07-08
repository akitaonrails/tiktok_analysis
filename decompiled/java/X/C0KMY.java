package X;

import Y.AfS1S0300100_7;
import Y.AfS2S0200100_7;
import android.app.Activity;
import com.bytedance.android.pgc.wallet.base.subscribe.PGCCreateContractResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS290S0000000_7;
import kotlin.jvm.internal.AwS136S0400000_7;
import kotlin.jvm.internal.AwS443S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0KMY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KMY extends AbstractC516540KNo<PGCCreateContractResult> {
    public C0KFM LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(223));
    public final C0KNE LJFF = new C0KNE(null);
    public final C01GW LJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 554));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS551S0100000_7(this, 555));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(222));

    public final void LIZJ() {
        this.LJFF.LIZJ = System.currentTimeMillis();
        C0KFM c0kfm = this.LIZLLL;
        if (c0kfm != null) {
            C516490KNj c516490KNj = (C516490KNj) this.LJI.getValue();
            AwS443S0200000_7 awS443S0200000_7 = new AwS443S0200000_7(this, c0kfm, 2);
            C516160KMc c516160KMcLIZ = AbstractC516150KMb.LIZ(c516490KNj.LIZLLL, c0kfm, 0L, null, null, null, 30);
            c516490KNj.LIZLLL.getClass();
            AbstractC516150KMb.LIZJ(c516160KMcLIZ);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C11NZ c11nzLJ = c516490KNj.LIZLLL.LJ(c0kfm);
            if (c11nzLJ != null) {
                c11nzLJ.LJJLL(new AfS2S0200100_7(jCurrentTimeMillis, c516490KNj, c0kfm, 2), new AfS1S0300100_7(jCurrentTimeMillis, awS443S0200000_7, c516490KNj, c0kfm, 1));
            }
        }
    }

    public final void LIZLLL() {
        this.LJFF.LIZJ = System.currentTimeMillis();
        C0KFM c0kfm = this.LIZLLL;
        if (c0kfm != null) {
            C516490KNj c516490KNj = (C516490KNj) this.LJI.getValue();
            AFwS290S0000000_7 aFwS290S0000000_7 = AFwS290S0000000_7.get$arr$(15);
            C516160KMc c516160KMcLIZ = AbstractC516150KMb.LIZ(c516490KNj.LIZLLL, c0kfm, 0L, null, null, null, 30);
            c516490KNj.LIZLLL.getClass();
            AbstractC516150KMb.LIZJ(c516160KMcLIZ);
            long jCurrentTimeMillis = System.currentTimeMillis();
            C11NZ c11nzLJ = c516490KNj.LIZLLL.LJ(c0kfm);
            if (c11nzLJ != null) {
                c11nzLJ.LJJLL(new AfS2S0200100_7(jCurrentTimeMillis, c516490KNj, c0kfm, 3), new AfS1S0300100_7(jCurrentTimeMillis, aFwS290S0000000_7, c516490KNj, c0kfm, 2));
            }
        }
    }

    @Override // X.AbstractC516540KNo
    public final void LIZ(PGCCreateContractResult pGCCreateContractResult) throws JSONException {
        Unit unit;
        Object c098200Yq;
        PGCCreateContractResult pGCCreateContractResult2 = pGCCreateContractResult;
        C0KFM c0kfm = this.LIZLLL;
        if (c0kfm != null) {
            C516180KMe c516180KMe = (C516180KMe) this.LJII.getValue();
            if (!c516180KMe.LIZJ) {
                C0KNB c0knb = C0KNB.LL;
                if (!C0KNB.LLILLJJLI) {
                    C2203431BLp.LIZIZ.LJI(134217803, 1, c0knb);
                    C0KNB.LLILLJJLI = true;
                }
                C0KNB.LLILLL.add(c516180KMe);
                c516180KMe.LIZJ = true;
            }
            C0KFM c0kfm2 = this.LIZLLL;
            int i = 0;
            if (c0kfm2 != null) {
                String str = c0kfm2.LJIIIZ;
                EnumC513480KBu enumC513480KBu = EnumC513480KBu.NORMAL_SUBSCRIPTION;
                C513470KBt.LIZIZ(str, 0, enumC513480KBu);
                C513470KBt.LIZIZ(c0kfm2.LJIIIZ, 1, enumC513480KBu);
                C513470KBt.LIZIZ(c0kfm2.LJIIIZ, 2, enumC513480KBu);
            }
            C516650KNz c516650KNz = this.LIZJ;
            C0KNE c0kne = this.LJFF;
            C516600KNu c516600KNu = new C516600KNu(c516650KNz, c0kne);
            AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(this, 331);
            boolean zLIZ = c0kfm.LIZ();
            c0kfm.LIZJ.get();
            C516000KLm.LIZ.LJI(zLIZ, pGCCreateContractResult2.contractId, c0kfm.LIZLLL, c0kfm.LIZIZ, C0KM8.LIZ(), c0kfm);
            HashMap<String, Object> map = c0kfm.LJIJJLI;
            if (map != null) {
                map.put("order_id", pGCCreateContractResult2.contractId);
            }
            HashMap<String, Object> map2 = c0kfm.LJIJJLI;
            if (map2 != null) {
                map2.put("biz_content", pGCCreateContractResult2.bizContent);
            }
            HashMap<String, Object> map3 = c0kfm.LJIJJLI;
            if (map3 != null) {
                map3.put("livesub_create_contract_intent", Integer.valueOf(c0kfm.LJIIZILJ));
            }
            C516400KNa c516400KNa = new C516400KNa(c0kfm.LIZJ.get());
            c0kfm.LIZ = c516400KNa;
            c516400KNa.LLILZIL = true;
            c0kne.LIZ.put("bizContent", pGCCreateContractResult2.bizContent);
            c0kne.LIZ.put("duration", Long.valueOf(System.currentTimeMillis() - c0kne.LIZJ));
            try {
                HashMap<String, Object> map4 = c0kne.LIZ;
                new Object() { // from class: X.0KOL
                }.getClass();
                try {
                    c098200Yq = C292701Bl.LIZ().LJIILL(pGCCreateContractResult2);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = "";
                }
                map4.put("product", (String) c098200Yq);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c516600KNu.LIZIZ.LIZ.put("contractId", pGCCreateContractResult2.contractId);
            C0KNS.LIZ("ttlive_create_subscription", c516600KNu.LIZIZ.LIZ);
            C516410KNb c516410KNb = C516410KNb.LIZ;
            HashMap<String, Object> map5 = c516600KNu.LIZIZ.LIZ;
            c516410KNb.getClass();
            try {
                C0K77 c0k77LIZ = C516410KNb.LIZ();
                if (c0k77LIZ != null) {
                    c0k77LIZ.LJIJJLI(map5);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            AwS136S0400000_7 awS136S0400000_7 = new AwS136S0400000_7(c516600KNu, c0kfm, pGCCreateContractResult2, awS586S0100000_7, 0);
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C516000KLm c516000KLm = C516000KLm.LIZ;
                Boolean boolValueOf = Boolean.valueOf(zLIZ);
                String str2 = pGCCreateContractResult2.contractId;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                int value = C0KPI.FAILED.getValue();
                String str3 = c0kfm.LIZLLL;
                String str4 = c0kfm.LIZIZ;
                Map linkedHashMap = c0kfm.LJ;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                c0kfm.LIZJ.get();
                C516100KLw c516100KLwLIZ = C0KM8.LIZ();
                C516400KNa c516400KNa2 = c0kfm.LIZ;
                if (c516400KNa2 != null) {
                    i = c516400KNa2.LLILZLL;
                }
                c516000KLm.LJ(boolValueOf, str2, jCurrentTimeMillis2, value, LSPassThroughRecordSizeConfig.DEFAULT, "", str3, str4, linkedHashMap, c516100KLwLIZ, i, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(boolean r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KMY.LJ(boolean):boolean");
    }

    @Override // X.AbstractC516540KNo
    public final void LIZIZ(String str, String str2, boolean z) {
        C0KFM c0kfm = this.LIZLLL;
        if (c0kfm == null) {
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C516370KMx(this, str, c0kfm, z, str2, null), 3);
    }

    public static void LJFF(C0KMY c0kmy, int i, Integer num, int i2, Exception exc, C516260KMm c516260KMm, Integer num2, int i3) {
        Activity activity;
        Map<String, String> mapLJ;
        String strLIZ;
        String str;
        int iIntValue;
        int iIntValue2;
        WeakReference<Activity> weakReference;
        C516260KMm c516260KMm2 = c516260KMm;
        Integer num3 = num;
        if ((i3 & 2) != 0) {
            num3 = null;
        }
        if ((i3 & 16) != 0) {
            c516260KMm2 = null;
        }
        if ((i3 & 32) != 0) {
            num2 = null;
        }
        C0KFM c0kfm = c0kmy.LIZLLL;
        if (c0kfm != null && (weakReference = c0kfm.LIZJ) != null) {
            activity = weakReference.get();
        } else {
            activity = null;
        }
        C0KFM c0kfm2 = c0kmy.LIZLLL;
        if (c0kfm2 == null || (mapLJ = c0kfm2.LJ) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            return;
        }
        C0K6E c0k6eLIZ = C09OK.LIZ(null, exc);
        if (c0k6eLIZ.LJ) {
            Integer num4 = c0k6eLIZ.LIZ;
            if (num4 != null) {
                iIntValue2 = num4.intValue();
            } else {
                iIntValue2 = 0;
            }
            strLIZ = C516570KNr.LIZ(iIntValue2);
        } else if (i == 2) {
            strLIZ = "query_order";
        } else {
            int value = C0KPI.PENDING.getValue();
            if (num3 != null && num3.intValue() == value) {
                strLIZ = "pending";
            } else {
                int value2 = C0KPI.CANCELLED.getValue();
                if (num3 != null && num3.intValue() == value2) {
                    strLIZ = "cancel";
                } else {
                    int value3 = C0KPI.FAILED.getValue();
                    if (num3 != null && num3.intValue() == value3) {
                        strLIZ = "google-apple";
                    } else {
                        strLIZ = "unknown";
                    }
                }
            }
        }
        C0KFM c0kfm3 = c0kmy.LIZLLL;
        if (c0kfm3 == null || (str = c0kfm3.LIZIZ) == null) {
            str = "";
        }
        C0KNO c0kno = new C0KNO(activity, i, i2, num3, strLIZ, exc, mapLJ, c516260KMm2, str);
        c0kno.LJIIJ = c0kfm3;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        c0kno.LJIIJJI = iIntValue;
        c0kno.LJIIIZ = ((C516140KMa) c0kmy.LJ.getValue()).LIZ(i2, activity);
        C0KNJ.LIZIZ(c0kno);
        C0KMW.LIZ.getClass();
        C0KMW.LIZIZ(i2, strLIZ, mapLJ);
        C0KMW.LIZ(i2, strLIZ, mapLJ);
    }
}
