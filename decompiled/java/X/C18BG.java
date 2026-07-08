package X;

import Y.ARunnableS132S0100000_32;
import android.os.Handler;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.bcm.impl.BcmServiceImpl;
import com.bytedance.android.bcm.impl.model.BcmPageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS116S1000000_32;
import kotlin.jvm.internal.AwS181S1100000_32;
import kotlin.text.Regex;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18BG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BG implements C18BH {
    @Override // X.C18BH
    public final void LIZ(final String str, PageInfo pageInfo, BcmParams bcmParams, Object obj) {
        int iIntValue;
        boolean z;
        Map<String, BcmParams> unitParamsV1;
        final String simpleName;
        if (bcmParams != null && (pageInfo instanceof BcmPageInfo)) {
            C20338214i4.LIZ.getClass();
            List listSingletonList = Collections.singletonList("ecom_entrance");
            FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
            featureModelLIZJ.getClass();
            Object objLIZIZ = C1972007ny.LIZIZ(featureModelLIZJ, "enable_bcm_report", Integer.valueOf(featureModelLIZJ.enableBcmReport));
            if (!(objLIZIZ instanceof Integer)) {
                objLIZIZ = null;
            }
            Integer num = (Integer) objLIZIZ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = featureModelLIZJ.enableBcmReport;
            }
            featureModelLIZJ.enableBcmReport = iIntValue;
            if (iIntValue == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("api", "createJumpSourceBtmToken");
                    try {
                        jSONObject.put("biz", C13LP.LJJLIIIJ(listSingletonList, null, null, null, 0, null, AFwS257S0000000_19.get$arr$(10), 31));
                        JSONObject jSONObject2 = bcmParams.toJSONObject();
                        if (jSONObject2 != null) {
                            jSONObject.put("params", C786410Ut5.J3(jSONObject2));
                        }
                        jSONObject.put("page_btm", pageInfo.getPageBtm());
                        jSONObject.put("host", pageInfo.getClassName());
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                String pageBtm = pageInfo.getPageBtm();
                if (pageBtm == null) {
                    pageBtm = "";
                }
                ConcurrentHashMap<String, Integer> concurrentHashMap = C20338214i4.LIZIZ;
                Integer num2 = concurrentHashMap.get(pageBtm);
                if (num2 == null) {
                    num2 = 0;
                }
                concurrentHashMap.put(pageBtm, Integer.valueOf(num2.intValue() + 1));
                C786410Ut5.LJLIIL(3000L, (Handler) C20321214fK.LIZ.getValue(), new ARunnableS132S0100000_32(jSONObject, 11));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("ecom_entrance", bcmParams);
            if (C18CS.LIZ.LIZJ().LIZJ().LIZ() == 1) {
                C21240218Ae c21240218Ae = C18AQ.LIZ;
                final BcmParams bcmParamsCopy = bcmParams.copy();
                if (obj != null) {
                    simpleName = obj.getClass().getSimpleName();
                } else {
                    simpleName = "page is null";
                }
                C18AQ.LIZ(new C18AO(str, simpleName, bcmParamsCopy) { // from class: X.18Ai
                    public static final Regex LIZLLL = new Regex("\\.e.*$");
                    public final String LIZ;
                    public final BcmParams LIZIZ;
                    public final String LIZJ;

                    @Override // X.C18AZ
                    public final BcmParams getBcmParams() {
                        return this.LIZIZ;
                    }

                    @Override // X.C18AZ
                    public final String getBtm() {
                        return this.LIZJ;
                    }

                    @Override // X.C18AO
                    public final void LIZ(C18AD c18ad) {
                        String str2 = this.LIZJ;
                        C18AE.LIZLLL(3014, c18ad, C18C3.LIZIZ(str2), str2, this.LIZ, 96);
                    }

                    {
                        BcmParams bcmParamsCopy2;
                        this.LIZ = simpleName;
                        if (bcmParamsCopy != null) {
                            bcmParamsCopy2 = bcmParamsCopy.copy();
                        } else {
                            bcmParamsCopy2 = null;
                        }
                        this.LIZIZ = bcmParamsCopy2;
                        this.LIZJ = LIZLLL.replace(str, "");
                    }
                });
            }
            BcmServiceImpl.INSTANCE.checkBcmBizAndKey(pageInfo, "ecom_entrance", bcmParams, "createJumpSourceBtmToken");
            if (C18CS.LIZ.LIZLLL().LJIJJLI() == 1 && (unitParamsV1 = ((BcmPageInfo) pageInfo).getUnitParamsV1()) != null) {
                unitParamsV1.put("ecom_entrance", bcmParams.copy());
            }
            BcmPageInfo bcmPageInfo = (BcmPageInfo) pageInfo;
            C212369188x c212369188x = new C212369188x(bcmPageInfo.getPageParams(), linkedHashMap, bcmPageInfo.getUnitParamsV1());
            AnonymousClass1891 anonymousClass1891 = AnonymousClass1891.LIZ;
            AnonymousClass1891.LIZLLL(str, c212369188x);
            return;
        }
        AnonymousClass1891 anonymousClass18912 = AnonymousClass1891.LIZ;
        C212369188x c212369188xLIZJ = AnonymousClass1891.LIZJ(str);
        if (c212369188xLIZJ != null) {
            C18CK.LIZ("BcmServiceImpl", new AwS181S1100000_32(str, c212369188xLIZJ, 9), false);
        } else {
            if (pageInfo instanceof BcmPageInfo) {
                C212369188x c212369188xSnapshot = ((BcmPageInfo) pageInfo).snapshot();
                AnonymousClass1891.LIZLLL(str, c212369188xSnapshot);
                C18CK.LIZ("BcmServiceImpl", new AwS181S1100000_32(str, c212369188xSnapshot, 10), false);
                return;
            }
            C18CK.LIZ("BcmServiceImpl", new AwS116S1000000_32(str, 3), false);
        }
    }
}
