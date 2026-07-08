package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1059610dgF extends AbstractC1063600dmg {
    public volatile InterfaceC1059630dgH LLILLJJLI;
    public C1059620dgG LLILLL;
    public SparkContext LLILZ;

    public abstract InterfaceC1059630dgH LIZ(SparkContext sparkContext);

    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, X.0qEH] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r1v11, types: [X.0dgG, X.1BQt] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, X.0qEH] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // X.InterfaceC1063710dmr
    public final void realHandle(Map<String, ? extends Object> map, final InterfaceC801410VcB interfaceC801410VcB, EnumC1063300dmC enumC1063300dmC) {
        AbstractC1835360xrS abstractC1835360xrSLIZ;
        JSONObject jSONObject;
        String str;
        ?? LJFF;
        C1537480q70 c1537480q70LIZIZ;
        SparkContext sparkContext;
        Context context;
        Uri uriLIZ;
        boolean z;
        InterfaceC1059630dgH interfaceC1059630dgH = this.LLILLJJLI;
        Integer numValueOf = Integer.valueOf(C386801es.DEFAULT);
        Activity activityLIZLLL = null;
        if (interfaceC1059630dgH == null) {
            synchronized (this) {
                try {
                    if (this.LLILLJJLI == null) {
                        C1544610qIV c1544610qIV = this.LL;
                        if (c1544610qIV != null) {
                            str = c1544610qIV.LIZLLL;
                        } else {
                            str = null;
                        }
                        C259800zU c259800zU = new C259800zU();
                        if (str == null) {
                            LJFF = 0;
                        } else {
                            C1529870puj.LIZ.getClass();
                            LJFF = C1529870puj.LJFF(str);
                        }
                        c259800zU.element = LJFF;
                        if (LJFF == 0 || (c1537480q70LIZIZ = LJFF.getHybridContext()) == null) {
                            SparkContext.Companion.getClass();
                            c1537480q70LIZIZ = C1529880puk.LIZIZ(str);
                            if (c1537480q70LIZIZ == null) {
                                C1544610qIV c1544610qIV2 = this.LL;
                                if (c1544610qIV2 != null) {
                                    c1537480q70LIZIZ = (C1537480q70) c1544610qIV2.LIZIZ(C1537480q70.class);
                                } else {
                                    c1537480q70LIZIZ = null;
                                }
                            }
                        }
                        if (c1537480q70LIZIZ instanceof SparkContext) {
                            sparkContext = (SparkContext) c1537480q70LIZIZ;
                        } else {
                            sparkContext = null;
                        }
                        this.LLILZ = sparkContext;
                        if (sparkContext == null) {
                            Pair[] pairArr = new Pair[2];
                            boolean z2 = false;
                            pairArr[0] = new Pair("code", numValueOf);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("sparkContext is null, kitView isExist: ");
                            if (c259800zU.element != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            sbLIZ.append(z);
                            sbLIZ.append(", containerId isExist: ");
                            if (str != null) {
                                z2 = true;
                            }
                            sbLIZ.append(z2);
                            sbLIZ.append(", need to check it with JSB team");
                            pairArr[1] = new Pair("msg", C2188811AlT.LIZIZ(sbLIZ));
                            interfaceC801410VcB.LIZ(C2097608Jq.LJIIIIZZ(pairArr));
                            return;
                        }
                        InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) c259800zU.element;
                        final ?? LJIJJ = interfaceC1541990qEH;
                        if (interfaceC1541990qEH == null) {
                            LJIJJ = sparkContext.LJIJJ();
                        }
                        c259800zU.element = LJIJJ;
                        if (LJIJJ == 0) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("code", numValueOf);
                            linkedHashMap.put("msg", "view is null, not in spark environment, need to check it with JSB team");
                            interfaceC801410VcB.LIZ(linkedHashMap);
                            return;
                        }
                        ?? r1 = new C2204771BQt() { // from class: X.0dgG
                            @Override // X.C2204771BQt
                            public final void LIZ(Object obj) {
                                if (obj instanceof JSONObject) {
                                    LJIJJ.LIZ("downloadMediaStatusChange", (JSONObject) obj);
                                }
                            }
                        };
                        View viewE1 = LJIJJ.e1();
                        if (viewE1 != null) {
                            context = viewE1.getContext();
                        } else {
                            context = null;
                        }
                        r1.LIZ = context;
                        r1.LIZLLL = LJIJJ.e1();
                        InterfaceC1531560pxS interfaceC1531560pxS = LJIJJ.getHybridContext().hybridParams;
                        if (interfaceC1531560pxS != null) {
                            uriLIZ = interfaceC1531560pxS.LIZ();
                        } else {
                            uriLIZ = null;
                        }
                        r1.LIZIZ = String.valueOf(uriLIZ);
                        this.LLILLL = r1;
                        SparkContext sparkContext2 = this.LLILZ;
                        if (sparkContext2 != null) {
                            this.LLILLJJLI = LIZ(sparkContext2);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        InterfaceC1059630dgH interfaceC1059630dgH2 = this.LLILLJJLI;
        if (interfaceC1059630dgH2 != null) {
            abstractC1835360xrSLIZ = interfaceC1059630dgH2.LIZ();
            if (abstractC1835360xrSLIZ != null && this.LLILLL != null && this.LLILZ != null) {
                Object obj = map.get("real_original_params");
                Object obj2 = map;
                if (obj != null) {
                    obj2 = obj;
                }
                if (obj2 instanceof JSONObject) {
                    jSONObject = (JSONObject) obj2;
                } else {
                    jSONObject = new JSONObject();
                }
                C1059620dgG c1059620dgG = this.LLILLL;
                if (c1059620dgG != null) {
                    C1544610qIV c1544610qIV3 = this.LL;
                    if (c1544610qIV3 != null) {
                        activityLIZLLL = c1544610qIV3.LIZLLL();
                    }
                    c1059620dgG.LIZ = activityLIZLLL;
                    Object objLIZ = C1305930k5X.LIZ(C786410Ut5.J3(jSONObject), abstractC1835360xrSLIZ);
                    InterfaceC1807620x8i interfaceC1807620x8i = new InterfaceC1807620x8i() { // from class: X.0dgE
                        @Override // X.InterfaceC1807620x8i
                        public final void onFailed() throws JSONException {
                            InterfaceC1531560pxS interfaceC1531560pxS2;
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("code", 0);
                            jSONObject2.put("error_msg", "");
                            SparkContext sparkContext3 = this.LIZ.LLILZ;
                            if (((sparkContext3 == null || (interfaceC1531560pxS2 = sparkContext3.hybridParams) == null) ? null : interfaceC1531560pxS2.getType()) != EnumC1067640dtC.WEB) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("data", jSONObject2);
                                jSONObject2 = jSONObject3;
                            }
                            jSONObject2.put("code", 0);
                            interfaceC801410VcB.LIZ(C2348609Ie.LIZIZ(jSONObject2));
                        }

                        @Override // X.InterfaceC1807620x8i
                        public final void LIZ(Object obj3) throws JSONException {
                            JSONObject jSONObject2;
                            EnumC1067640dtC type;
                            InterfaceC1531560pxS interfaceC1531560pxS2;
                            if (obj3 instanceof JSONObject) {
                                jSONObject2 = (JSONObject) obj3;
                            } else if (obj3 != null) {
                                jSONObject2 = new JSONObject(GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, obj3));
                            } else {
                                jSONObject2 = new JSONObject();
                            }
                            if (!jSONObject2.has("code")) {
                                jSONObject2.put("code", 1);
                            }
                            SparkContext sparkContext3 = this.LIZ.LLILZ;
                            if (sparkContext3 != null && (interfaceC1531560pxS2 = sparkContext3.hybridParams) != null) {
                                type = interfaceC1531560pxS2.getType();
                            } else {
                                type = null;
                            }
                            if (type != EnumC1067640dtC.WEB) {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("data", jSONObject2);
                                jSONObject3.put("code", jSONObject2.optInt("code", 1));
                                jSONObject2 = jSONObject3;
                            }
                            interfaceC801410VcB.LIZ(C2348609Ie.LIZIZ(jSONObject2));
                        }

                        @Override // X.InterfaceC1807620x8i
                        public final void LIZIZ(JSONObject jSONObject2) throws JSONException {
                            EnumC1067640dtC type;
                            JSONObject jSONObject3;
                            InterfaceC1531560pxS interfaceC1531560pxS2;
                            SparkContext sparkContext3 = this.LIZ.LLILZ;
                            if (sparkContext3 != null && (interfaceC1531560pxS2 = sparkContext3.hybridParams) != null) {
                                type = interfaceC1531560pxS2.getType();
                            } else {
                                type = null;
                            }
                            if (type == EnumC1067640dtC.WEB) {
                                jSONObject3 = jSONObject2;
                            } else {
                                jSONObject3 = new JSONObject();
                                jSONObject3.put("data", jSONObject2);
                            }
                            jSONObject3.put("code", jSONObject2.optInt("code", 1));
                            interfaceC801410VcB.LIZ(C2348609Ie.LIZIZ(jSONObject3));
                        }
                    };
                    abstractC1835360xrSLIZ.LLILZ = c1059620dgG;
                    abstractC1835360xrSLIZ.LLILLL = interfaceC1807620x8i;
                    abstractC1835360xrSLIZ.LJII(objLIZ, c1059620dgG);
                    return;
                }
                return;
            }
        } else {
            abstractC1835360xrSLIZ = null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("code", numValueOf);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("bridge is null, not in spark environment, need to check it with JSB team; currentBridge: ");
        sbLIZ2.append(abstractC1835360xrSLIZ);
        sbLIZ2.append(" && callContext: ");
        sbLIZ2.append(this.LLILLL);
        sbLIZ2.append(" && sparkContext: ");
        sbLIZ2.append(this.LLILZ);
        linkedHashMap2.put("msg", C2188811AlT.LIZIZ(sbLIZ2));
        interfaceC801410VcB.LIZ(linkedHashMap2);
    }
}
