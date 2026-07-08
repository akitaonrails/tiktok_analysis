package X;

import Y.ARunnableS135S0100000_35;
import android.os.Looper;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ttm.rule.EliminationRule;
import com.ss.ugc.clientai.core.api.meta.ttm.rule.TTMFeatureRule;
import com.tiktok.ttm.TTMParamData;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Dcj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259831Dcj extends AbstractC1513210pTr {
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public List<Map<String, Object>> LJII;
    public C1DYW LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;

    @Override // X.AbstractC1513210pTr
    public final synchronized void LJI() {
        this.LJII = Collections.synchronizedList(new ArrayList());
        this.LJIIIIZZ = new C1DYW();
        this.LJIIIZ = 0L;
        this.LJIIJ = 0L;
    }

    @Override // X.AbstractC1513210pTr
    public final void LJFF() {
        String str;
        String string;
        TTMFeatureRule tTMFeatureRule = this.LIZ.rule;
        if (tTMFeatureRule == null || (str = tTMFeatureRule.cacheType) == null || !str.equals("disk_cache") || LJ() || this.LIZ.name == null) {
            return;
        }
        String strLIZIZ = LIZIZ();
        Keva kevaLJIIIIZZ = this.LIZIZ.LJIIIIZZ();
        if (kevaLJIIIIZZ == null || (string = kevaLJIIIIZZ.getString(strLIZIZ, "")) == null || string.length() == 0 || string == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Type type = new TypeToken<ArrayList<Map<String, ? extends Object>>>() { // from class: X.0XJn
            }.getType();
            if (this.LJ || C23068092c.LIZJ(string)) {
                string = C23068092c.LIZIZ(string);
            }
            if (this.LJI) {
                int i = C1DYW.LIZ;
                C1DYW c1dywLIZ = C1DYX.LIZ(string);
                if (c1dywLIZ != null) {
                    this.LJIIIIZZ = c1dywLIZ;
                }
            } else {
                for (Map map : (ArrayList) this.LIZIZ.LJIIIZ().LJIIIIZZ(string, type)) {
                    if (this.LJFF) {
                        this.LJII.add(C1970607nk.LJ(map));
                    } else {
                        this.LJII.add(new LinkedHashMap(map));
                    }
                }
            }
            LJIIIIZZ(this, "", false, 0, 4);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (this.LIZIZ.LIZIZ().LIZ()) {
                this.LIZIZ.LIZIZ().LJIIJ(jCurrentTimeMillis2, this.LIZLLL);
                this.LIZIZ.LIZIZ().LJ(200, this.LIZLLL);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Keva kevaLJIIIIZZ2 = this.LIZIZ.LJIIIIZZ();
            if (kevaLJIIIIZZ2 != null) {
                kevaLJIIIIZZ2.erase(strLIZIZ);
            }
            long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (this.LIZIZ.LIZIZ().LIZ()) {
                this.LIZIZ.LIZIZ().LJIIJ(jCurrentTimeMillis3, this.LIZLLL);
                this.LIZIZ.LIZIZ().LJ(16, this.LIZLLL);
            }
        }
    }

    @Override // X.AbstractC1513210pTr
    public final synchronized void LIZ(boolean z) {
        String str;
        String json;
        int size;
        int i;
        TTMFeatureRule tTMFeatureRule = this.LIZ.rule;
        if (tTMFeatureRule != null && (str = tTMFeatureRule.cacheType) != null && str.equals("disk_cache")) {
            if (LJ()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!z) {
                TTMFeatureRule tTMFeatureRule2 = this.LIZ.rule;
                if (tTMFeatureRule2 != null) {
                    i = tTMFeatureRule2.diskCacheInternal;
                } else {
                    i = 60;
                }
                if (jCurrentTimeMillis - this.LJIIIZ < i * LSPassThroughRecordSizeConfig.DEFAULT) {
                    return;
                }
            }
            this.LJIIIZ = jCurrentTimeMillis;
            if (this.LIZ.name == null) {
                return;
            }
            String strLIZIZ = LIZIZ();
            if (this.LJI) {
                json = this.LJIIIIZZ.toString();
            } else {
                json = GsonProtectorUtils.toJson(this.LIZIZ.LJIIIZ(), this.LJII);
                json.toString();
            }
            if (this.LJ) {
                json = C23068092c.LIZ(json);
            }
            Keva kevaLJIIIIZZ = this.LIZIZ.LJIIIIZZ();
            if (kevaLJIIIIZZ != null) {
                kevaLJIIIIZZ.storeString(strLIZIZ, json);
            }
            if (this.LIZIZ.LIZIZ().LIZ()) {
                this.LIZIZ.LIZIZ().LIZJ(this.LIZLLL).LIZ = System.currentTimeMillis() - jCurrentTimeMillis;
                C0XEN c0xenLIZIZ = this.LIZIZ.LIZIZ();
                String str2 = this.LIZLLL;
                if (this.LJI) {
                    size = this.LJIIIIZZ.size();
                } else {
                    size = this.LJII.size();
                }
                c0xenLIZIZ.LIZJ(str2).LIZIZ = size;
                this.LIZIZ.LIZIZ().LIZJ(this.LIZLLL).LIZJ = (json.length() * 2) / 1024.0f;
                this.LIZIZ.LIZIZ().LJFF(this.LIZLLL);
            }
        }
    }

    @Override // X.AbstractC1513210pTr
    public final boolean LJII(Object obj) {
        if (!this.LIZIZ.LJI(obj)) {
            return false;
        }
        boolean zLIZIZ = this.LIZIZ.LIZIZ().LIZ.LIZIZ();
        if ((this.LIZIZ.LJII(obj) && this.LIZIZ.LJIIJ(obj)) || (this.LIZIZ.LIZ(obj) && this.LIZIZ.LJIIJ(obj))) {
            Object[] objArrLJ = this.LIZIZ.LJ(obj);
            if (objArrLJ != null) {
                for (Object obj2 : objArrLJ) {
                    if (obj2 instanceof TTMParamData) {
                        TTMParamData tTMParamData = (TTMParamData) obj2;
                        if (tTMParamData.getType() == 1) {
                            int arraySize = tTMParamData.getArraySize();
                            for (int i = 0; i < arraySize; i++) {
                                synchronized (this) {
                                    try {
                                        LJIIIZ(((TTMParamData) obj2).getArrayItem(i), zLIZIZ);
                                    } finally {
                                    }
                                }
                            }
                        } else if (tTMParamData.getType() == 10 || tTMParamData.getType() == 0) {
                            synchronized (this) {
                                try {
                                    LJIIIZ((TTMParamData) obj2, zLIZIZ);
                                } finally {
                                }
                            }
                        }
                    }
                }
                if (Unit.LIZ != null) {
                    this.LIZIZ.LIZLLL(this.LIZLLL, new JSONObject());
                    return true;
                }
            }
            if (zLIZIZ) {
                this.LIZIZ.LIZIZ().LJIIIZ(1, this.LIZLLL);
                this.LIZIZ.LIZIZ().LJI(this.LIZLLL);
            }
            return false;
        }
        if (zLIZIZ) {
            this.LIZIZ.LIZIZ().LJIIIZ(1, this.LIZLLL);
            this.LIZIZ.LIZIZ().LJI(this.LIZLLL);
        }
        return false;
    }

    @Override // X.AbstractC1513210pTr
    public final Object LIZJ(JSONObject jSONObject, boolean z) {
        EliminationRule eliminationRule;
        TTMFeatureRule tTMFeatureRule = this.LIZ.rule;
        List list = null;
        if (tTMFeatureRule != null && (eliminationRule = tTMFeatureRule.elimination) != null) {
            Long lValueOf = Long.valueOf(eliminationRule.lastTime);
            if (lValueOf.longValue() > 0) {
                if (System.currentTimeMillis() - this.LJIIJ > lValueOf.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                    LJIIIIZZ(this, "", true, 0, 4);
                }
            }
        }
        if (!z || !this.LJI || (jSONObject != null && (jSONObject.opt("filter_key") != null || (jSONObject != null && jSONObject.opt("operation") != null)))) {
            if (this.LJI) {
                System.currentTimeMillis();
                C1DYW c1dyw = this.LJIIIIZZ;
                c1dyw.getClass();
                Object objTryCatch = c1dyw.tryCatch(new AwS579S0100000_35(c1dyw, 185));
                if (objTryCatch instanceof List) {
                    list = (List) objTryCatch;
                }
                this.LJII = C19719512Dh.LIZIZ(Collections.synchronizedList(list));
            }
            return C2239981Clo.LJFF(this.LJII, jSONObject);
        }
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x00aa. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(com.tiktok.ttm.TTMParamData r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2259831Dcj.LJIIIZ(com.tiktok.ttm.TTMParamData, boolean):void");
    }

    public static void LJIIIIZZ(C2259831Dcj c2259831Dcj, String str, boolean z, int i, int i2) {
        EliminationRule eliminationRule;
        Integer numValueOf;
        int iIntValue;
        EliminationRule eliminationRule2;
        boolean z2;
        List listLJI;
        EliminationRule eliminationRule3;
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        TTMFeatureRule tTMFeatureRule = c2259831Dcj.LIZ.rule;
        if (tTMFeatureRule != null && (eliminationRule2 = tTMFeatureRule.elimination) != null) {
            Long lValueOf = Long.valueOf(eliminationRule2.lastTime);
            if (lValueOf.longValue() > 0) {
                long jLongValue = lValueOf.longValue();
                TTMFeatureRule tTMFeatureRule2 = c2259831Dcj.LIZ.rule;
                if (tTMFeatureRule2 != null && (eliminationRule3 = tTMFeatureRule2.elimination) != null && eliminationRule3.natureDay) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c2259831Dcj.LJI) {
                    if (z2) {
                        C2239981Clo.LJ(c2259831Dcj.LJIIIIZZ, jLongValue);
                    } else {
                        C2239981Clo.LJII(c2259831Dcj.LJIIIIZZ, jLongValue);
                    }
                } else {
                    if (z2) {
                        listLJI = C2239981Clo.LIZLLL(jLongValue, c2259831Dcj.LJII);
                    } else {
                        listLJI = C2239981Clo.LJI(jLongValue, c2259831Dcj.LJII);
                    }
                    c2259831Dcj.LJII = Collections.synchronizedList(listLJI);
                }
            }
        }
        if (i > 0) {
            Integer numValueOf2 = Integer.valueOf(i);
            int iIntValue2 = numValueOf2.intValue();
            if (!c2259831Dcj.LJI ? c2259831Dcj.LJII.size() > iIntValue2 : c2259831Dcj.LJIIIIZZ.size() > iIntValue2) {
                int iIntValue3 = numValueOf2.intValue();
                if (c2259831Dcj.LJI) {
                    C2239981Clo.LIZJ(c2259831Dcj.LJIIIIZZ, str, iIntValue3);
                } else {
                    c2259831Dcj.LJII = Collections.synchronizedList(C2239981Clo.LIZIZ(iIntValue3, str, c2259831Dcj.LJII));
                }
            }
        } else {
            TTMFeatureRule tTMFeatureRule3 = c2259831Dcj.LIZ.rule;
            if (tTMFeatureRule3 != null && (eliminationRule = tTMFeatureRule3.elimination) != null && (iIntValue = (numValueOf = Integer.valueOf(eliminationRule.lastN)).intValue()) > 0 && (!c2259831Dcj.LJI ? c2259831Dcj.LJII.size() > iIntValue : c2259831Dcj.LJIIIIZZ.size() > iIntValue)) {
                int iIntValue4 = numValueOf.intValue();
                if (c2259831Dcj.LJI) {
                    C2239981Clo.LIZJ(c2259831Dcj.LJIIIIZZ, str, iIntValue4);
                } else {
                    c2259831Dcj.LJII = Collections.synchronizedList(C2239981Clo.LIZIZ(iIntValue4, str, c2259831Dcj.LJII));
                }
            }
        }
        c2259831Dcj.LJIIJ = System.currentTimeMillis();
        if (z) {
            if (Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
                C1510720pPq.LIZ(new ARunnableS135S0100000_35(c2259831Dcj, 34));
            } else {
                c2259831Dcj.LIZ(false);
            }
        }
    }

    public C2259831Dcj(FeatureItem featureItem, String str, C1513160pTm c1513160pTm, boolean z, boolean z2, boolean z3) {
        String str2;
        super(featureItem, str, c1513160pTm);
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = Collections.synchronizedList(new ArrayList());
        this.LJIIIIZZ = new C1DYW();
        TTMFeatureRule tTMFeatureRule = featureItem.rule;
        if (tTMFeatureRule != null && (str2 = tTMFeatureRule.cacheType) != null && str2.equals("disk_cache")) {
            LJFF();
            C1513160pTm.LJIIJJI(new ARunnableS135S0100000_35(this, 35));
        }
        LIZLLL();
    }
}
