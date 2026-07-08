package X;

import com.bytedance.ies.xbridge.base.runtime.depend.IHostLogDepend;
import com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackDataDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEventGroup;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEventParams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wHz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774930wHz implements InterfaceC1774910wHx {
    public final Map<String, Object> LIZ = C2097608Jq.LJ();
    public final C13BV LIZIZ;
    public final C13BV LIZJ;
    public final C13BV LIZLLL;

    public C1774930wHz() {
        C13BV c13bv = C13BV.INSTANCE;
        this.LIZIZ = c13bv;
        this.LIZJ = c13bv;
        this.LIZLLL = c13bv;
    }

    @Override // X.InterfaceC1774910wHx
    public final Map<String, Object> LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1774910wHx
    public final List<String> LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1774910wHx
    public final List<String> LJFF() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1774910wHx
    public final C13BV LJI() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1774910wHx
    public final Map<String, ECMixMallTrackEventGroup> LIZIZ(C1775190wIP c1775190wIP) {
        ECMixMallTrackDataDTO eCMixMallTrackDataDTO = c1775190wIP.LIZ;
        if (eCMixMallTrackDataDTO != null) {
            return eCMixMallTrackDataDTO.ad;
        }
        return null;
    }

    @Override // X.InterfaceC1774910wHx
    public final Map<String, Object> LIZJ(C1774840wHq c1774840wHq) {
        return c1774840wHq.LIZJ;
    }

    @Override // X.InterfaceC1774910wHx
    public final void LJ(InterfaceC1773310wFN interfaceC1773310wFN, String str, Map<String, ? extends Object> map, ECMixMallTrackEventParams eCMixMallTrackEventParams, C1774840wHq c1774840wHq) {
        Object obj;
        String str2;
        Object obj2;
        String str3;
        Object obj3;
        String str4;
        Object obj4;
        String str5;
        Object obj5;
        String str6;
        Object obj6;
        IHostLogDepend iHostLogDepend;
        Map<String, Object> map2;
        Map<String, Object> map3;
        Map<String, Object> map4;
        Map<String, Object> map5;
        Map<String, Object> map6;
        Map<String, Object> map7;
        String str7 = null;
        if (c1774840wHq == null || (map7 = c1774840wHq.LIZIZ) == null || (obj = map7.get("tag")) == null) {
            Map<String, Object> map8 = eCMixMallTrackEventParams.adParams;
            if (map8 != null) {
                obj = map8.get("tag");
            } else {
                obj = null;
            }
        }
        if ((obj instanceof String) && (str2 = (String) obj) != null) {
            if (c1774840wHq == null || (map6 = c1774840wHq.LIZIZ) == null || (obj2 = map6.get("label")) == null) {
                Map<String, Object> map9 = eCMixMallTrackEventParams.adParams;
                if (map9 != null) {
                    obj2 = map9.get("label");
                } else {
                    obj2 = null;
                }
            }
            if ((obj2 instanceof String) && (str3 = (String) obj2) != null) {
                if (c1774840wHq == null || (map5 = c1774840wHq.LIZIZ) == null || (obj3 = map5.get("refer")) == null) {
                    Map<String, Object> map10 = eCMixMallTrackEventParams.adParams;
                    if (map10 != null) {
                        obj3 = map10.get("refer");
                    } else {
                        obj3 = null;
                    }
                }
                if (obj3 instanceof String) {
                    str4 = (String) obj3;
                } else {
                    str4 = null;
                }
                if (c1774840wHq == null || (map4 = c1774840wHq.LIZIZ) == null || (obj4 = map4.get("group_id")) == null) {
                    Map<String, Object> map11 = eCMixMallTrackEventParams.adParams;
                    if (map11 != null) {
                        obj4 = map11.get("group_id");
                    } else {
                        obj4 = null;
                    }
                }
                if (obj4 instanceof String) {
                    str5 = (String) obj4;
                } else {
                    str5 = null;
                }
                if (c1774840wHq == null || (map3 = c1774840wHq.LIZIZ) == null || (obj5 = map3.get("log_extra")) == null) {
                    Map<String, Object> map12 = eCMixMallTrackEventParams.adParams;
                    if (map12 != null) {
                        obj5 = map12.get("log_extra");
                    } else {
                        obj5 = null;
                    }
                }
                if (obj5 instanceof String) {
                    str6 = (String) obj5;
                } else {
                    str6 = null;
                }
                if (c1774840wHq == null || (map2 = c1774840wHq.LIZIZ) == null || (obj6 = map2.get("creative_id")) == null) {
                    Map<String, Object> map13 = eCMixMallTrackEventParams.adParams;
                    if (map13 != null) {
                        obj6 = map13.get("creative_id");
                    } else {
                        obj6 = null;
                    }
                }
                if (obj6 instanceof String) {
                    str7 = (String) obj6;
                }
                C1064330dnr c1064330dnr = new C1064330dnr(str3, str2, str4, str5, str7, str6, new C1323820kYO(new JSONObject(C2097608Jq.LJIIZILJ(new LinkedHashMap(map)))));
                try {
                    C1871520ynm c1871520ynm = C1871520ynm.LJIIL;
                    if (c1871520ynm != null && (iHostLogDepend = c1871520ynm.LIZIZ) != null) {
                        iHostLogDepend.handleReportADLog(null, "", c1064330dnr, new IReportADLogResultCallback() { // from class: X.0wI0
                            @Override // com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback
                            public final void onFailure(int i, String str8) {
                                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onFailure = code: ");
                                sbLIZ.append(i);
                                sbLIZ.append("; msg: ");
                                sbLIZ.append(str8);
                                C2188811AlT.LIZIZ(sbLIZ);
                                c599820Nfo.getClass();
                                C599820Nfo.LIZIZ();
                            }

                            @Override // com.bytedance.ies.xbridge.base.runtime.depend.IReportADLogResultCallback
                            public final void onSuccess(C1870890yml c1870890yml, String str8) {
                                C599820Nfo c599820Nfo = C599820Nfo.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onSuccess = result: ");
                                sbLIZ.append(c1870890yml);
                                sbLIZ.append("; msg: ");
                                sbLIZ.append(str8);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c599820Nfo.getClass();
                                C599820Nfo.LIZ("ECMMKAdTrackReporter", strLIZIZ);
                            }
                        }, EnumC1059790dgX.LYNX);
                    }
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
    }
}
