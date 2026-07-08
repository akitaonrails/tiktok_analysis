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

/* JADX INFO: renamed from: X.1Dci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2259821Dci extends AbstractC1513210pTr {
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
            Type type = new TypeToken<ArrayList<Map<String, ? extends Object>>>() { // from class: X.0XJo
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
            LJIIIIZZ(false);
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
                                        LJIIJ(((TTMParamData) obj2).getArrayItem(i), zLIZIZ);
                                    } finally {
                                    }
                                }
                            }
                        } else if (tTMParamData.getType() == 10 || tTMParamData.getType() == 0) {
                            synchronized (this) {
                                try {
                                    LJIIJ((TTMParamData) obj2, zLIZIZ);
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

    public final void LJIIIIZZ(boolean z) {
        EliminationRule eliminationRule;
        Integer numValueOf;
        int iIntValue;
        EliminationRule eliminationRule2;
        boolean z2;
        List listLJI;
        EliminationRule eliminationRule3;
        TTMFeatureRule tTMFeatureRule = this.LIZ.rule;
        if (tTMFeatureRule != null && (eliminationRule2 = tTMFeatureRule.elimination) != null) {
            Long lValueOf = Long.valueOf(eliminationRule2.lastTime);
            if (lValueOf.longValue() > 0) {
                long jLongValue = lValueOf.longValue();
                TTMFeatureRule tTMFeatureRule2 = this.LIZ.rule;
                if (tTMFeatureRule2 != null && (eliminationRule3 = tTMFeatureRule2.elimination) != null && eliminationRule3.natureDay) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.LJI) {
                    if (z2) {
                        C2239981Clo.LJ(this.LJIIIIZZ, jLongValue);
                    } else {
                        C2239981Clo.LJII(this.LJIIIIZZ, jLongValue);
                    }
                } else {
                    if (z2) {
                        listLJI = C2239981Clo.LIZLLL(jLongValue, this.LJII);
                    } else {
                        listLJI = C2239981Clo.LJI(jLongValue, this.LJII);
                    }
                    this.LJII = Collections.synchronizedList(listLJI);
                }
            }
        }
        TTMFeatureRule tTMFeatureRule3 = this.LIZ.rule;
        if (tTMFeatureRule3 != null && (eliminationRule = tTMFeatureRule3.elimination) != null && (iIntValue = (numValueOf = Integer.valueOf(eliminationRule.lastN)).intValue()) > 0 && (!this.LJI ? this.LJII.size() > iIntValue : this.LJIIIIZZ.size() > iIntValue)) {
            int iIntValue2 = numValueOf.intValue();
            if (this.LJI) {
                int size = this.LJIIIIZZ.size() - iIntValue2;
                for (int i = 0; i < size; i++) {
                    this.LJIIIIZZ.LIZIZ(0);
                }
            } else {
                this.LJII = Collections.synchronizedList(new ArrayList(C13LP.LLD(iIntValue2, this.LJII)));
            }
        }
        this.LJIIJ = System.currentTimeMillis();
        if (z) {
            if (Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
                C1510720pPq.LIZ(new ARunnableS135S0100000_35(this, 37));
            } else {
                LIZ(false);
            }
        }
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
                    LJIIIIZZ(true);
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

    /* JADX WARN: Failed to find 'out' block for switch in B:637:0x0a17. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:1006:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1020:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1023:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1037:0x084a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1040:0x0820 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1052:0x093a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1082:0x06d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1115:0x0c6b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1141:0x0a05 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1192:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1208:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1242:0x0591 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1264:0x03a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x0ced  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x0d03  */
    /* JADX WARN: Removed duplicated region for block: B:868:0x0a72 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:874:0x0c86 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:882:0x04b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:908:0x05ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.tiktok.ttm.TTMParamData r38, boolean r39) {
        /*
            Method dump skipped, instruction units count: 3460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2259821Dci.LJIIJ(com.tiktok.ttm.TTMParamData, boolean):void");
    }

    public C2259821Dci(FeatureItem featureItem, String str, C1513160pTm c1513160pTm, boolean z, boolean z2, boolean z3) {
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
            C1513160pTm.LJIIJJI(new ARunnableS135S0100000_35(this, 36));
        }
        LIZLLL();
    }
}
