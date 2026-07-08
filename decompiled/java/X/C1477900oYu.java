package X;

import android.text.TextUtils;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0oYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477900oYu implements InterfaceC1477240oXq {
    public final InterfaceC1482870ogv LIZIZ;
    public final InterfaceC1477730oYd LIZJ;

    @Override // X.InterfaceC1477240oXq
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC1477240oXq
    public final String getName() {
        return "EngineCacheUrlHook";
    }

    @Override // X.InterfaceC1477240oXq
    public final /* synthetic */ boolean isValid() {
        return true;
    }

    @Override // X.InterfaceC1477240oXq
    public final C1477210oXn LIZ(C1477250oXr c1477250oXr) {
        String strLJJIII;
        int iLJJLIIIJJI;
        C1478000oZ4 c1478000oZ4 = c1477250oXr.LIZJ;
        C1476750oX3 c1476750oX3 = c1478000oZ4.LIZ;
        SimVideoUrlModel simVideoUrlModel = null;
        if (c1476750oX3 != null) {
            simVideoUrlModel = new SimVideoUrlModel();
            if (c1476750oX3.getUrlKey() != null) {
                simVideoUrlModel.setSourceId(c1476750oX3.getUrlKey());
            }
            if (c1476750oX3.getFileHash() != null) {
                simVideoUrlModel.setFileHash(c1476750oX3.getFileHash());
            }
            simVideoUrlModel.setHeight(c1476750oX3.getHeight());
            simVideoUrlModel.setWidth(c1476750oX3.getWidth());
            simVideoUrlModel.setSize(c1476750oX3.getSize());
            if (c1476750oX3.getUri() != null) {
                simVideoUrlModel.setUri(c1476750oX3.getUri());
            }
            if (c1476750oX3.getUrlKey() != null) {
                simVideoUrlModel.setUrlKey(c1476750oX3.getUrlKey());
            }
            if (c1476750oX3.getUrlList() != null) {
                simVideoUrlModel.setUrlList(c1476750oX3.getUrlList());
            }
            if (c1476750oX3.getaK() != null) {
                simVideoUrlModel.setaK(c1476750oX3.getaK());
            }
        }
        InterfaceC1477730oYd interfaceC1477730oYd = this.LIZJ;
        if (interfaceC1477730oYd == null || (strLJJIII = interfaceC1477730oYd.LIZ(simVideoUrlModel)) == null || TextUtils.isEmpty(strLJJIII)) {
            strLJJIII = this.LIZIZ.LJJIII(simVideoUrlModel, simVideoUrlModel.getSourceId(), c1478000oZ4.LIZJ);
        }
        if (C582130MsN.LIZ().getConfig().getAppConfig().isDebug()) {
            InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1478160oZK.LIZ();
            if (interfaceC1482870ogvLIZ != null) {
                iLJJLIIIJJI = interfaceC1482870ogvLIZ.LJJLIIIJJI(simVideoUrlModel);
            } else {
                iLJJLIIIJJI = 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EngineCacheUrlHook: hitCacheSize:");
            sbLIZ.append(iLJJLIIIJJI);
            sbLIZ.append(" ,proxyUrl:");
            sbLIZ.append(strLJJIII);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return new C1477210oXn(strLJJIII, this);
    }

    @Override // X.InterfaceC1477240oXq
    public final C1477210oXn LIZJ(InterfaceC1477990oZ3 interfaceC1477990oZ3) {
        SimVideoUrlModel simVideoUrlModel;
        long jLongValue;
        String sourceId;
        int iLJJLIIIJJI;
        C1478010oZ5 c1478010oZ5 = ((C1477250oXr) interfaceC1477990oZ3).LIZLLL;
        C1477890oYt c1477890oYt = c1478010oZ5.LIZIZ;
        String str = c1478010oZ5.LIZ;
        if (c1477890oYt == null) {
            simVideoUrlModel = null;
        } else {
            simVideoUrlModel = new SimVideoUrlModel();
            simVideoUrlModel.setSourceId(String.valueOf(c1477890oYt.subId));
            if (c1477890oYt.url != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(c1477890oYt.url);
                simVideoUrlModel.setUrlList(arrayList);
            }
            String str2 = c1477890oYt.uri;
            if (str2 != null) {
                simVideoUrlModel.setUri(str2);
            }
            simVideoUrlModel.setFormat("cla");
            Long l = c1477890oYt.feedBornTime;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = -1;
            }
            simVideoUrlModel.setPb2AwemeMillis(jLongValue);
            simVideoUrlModel.setClaVideoId(str);
        }
        InterfaceC1482870ogv interfaceC1482870ogv = this.LIZIZ;
        if (simVideoUrlModel == null) {
            sourceId = "";
        } else {
            sourceId = simVideoUrlModel.getSourceId();
        }
        String strLJJIII = interfaceC1482870ogv.LJJIII(simVideoUrlModel, sourceId, c1478010oZ5.LIZJ);
        if (C582130MsN.LIZ().getConfig().getAppConfig().isDebug()) {
            InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1478160oZK.LIZ();
            if (interfaceC1482870ogvLIZ != null) {
                iLJJLIIIJJI = interfaceC1482870ogvLIZ.LJJLIIIJJI(simVideoUrlModel);
            } else {
                iLJJLIIIJJI = 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EngineCacheUrlHook: hitCacheSize:");
            sbLIZ.append(iLJJLIIIJJI);
            sbLIZ.append(" ,proxyUrl:");
            sbLIZ.append(strLJJIII);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return new C1477210oXn(strLJJIII, this);
    }

    @Override // X.InterfaceC1477240oXq
    public final C1477210oXn LIZLLL(C1477250oXr c1477250oXr) {
        String bitRatedRatioUri;
        String urlKey;
        String strLJJIII;
        String[] strArr;
        C1477270oXt c1477270oXt = c1477250oXr.LIZIZ;
        SimVideoUrlModel simVideoUrlModel = c1477270oXt.LIZ;
        if (simVideoUrlModel == null) {
            return new C1477210oXn("", this);
        }
        int iLJJLIIIJJI = 0;
        if (!simVideoUrlModel.isUseMdlAndVideoCache() && (strArr = c1477270oXt.LIZJ) != null && strArr.length > 0) {
            return new C1477210oXn(strArr[0], this);
        }
        InterfaceC1477730oYd interfaceC1477730oYd = this.LIZJ;
        if (interfaceC1477730oYd == null || (strLJJIII = interfaceC1477730oYd.LIZ(simVideoUrlModel)) == null || TextUtils.isEmpty(strLJJIII)) {
            C01GW c01gw = C1474810oTv.LJLI;
            if (((Boolean) c01gw.getValue()).booleanValue()) {
                bitRatedRatioUri = c1477270oXt.LIZIZ;
            } else {
                bitRatedRatioUri = simVideoUrlModel.getBitRatedRatioUri();
            }
            if (simVideoUrlModel.getHitBitrate() == null) {
                urlKey = "hit";
            } else {
                urlKey = simVideoUrlModel.getHitBitrate().getUrlKey();
            }
            if (C1481110oe5.LIZ) {
                C1481110oe5.LIZIZ("EngineCacheUrlHook", C786410Ut5.j4("proxyUrl check: FixMDLProxyKey:%s, match?:%s, inputKey:%s, hitKey:%s, checkKey:%s", new Object[]{c01gw.getValue(), Boolean.valueOf(TextUtils.equals(c1477270oXt.LIZIZ, urlKey)), c1477270oXt.LIZIZ, urlKey, simVideoUrlModel.getBitRatedRatioUri()}));
            }
            strLJJIII = this.LIZIZ.LJJIII(simVideoUrlModel, bitRatedRatioUri, c1477270oXt.LIZJ);
        }
        if (C582130MsN.LIZ().getConfig().getAppConfig().isDebug()) {
            InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1478160oZK.LIZ();
            if (interfaceC1482870ogvLIZ != null) {
                iLJJLIIIJJI = interfaceC1482870ogvLIZ.LJJLIIIJJI(simVideoUrlModel);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EngineCacheUrlHook: hitCacheSize:");
            sbLIZ.append(iLJJLIIIJJI);
            sbLIZ.append(" ,proxyUrl:");
            sbLIZ.append(strLJJIII);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return new C1477210oXn(strLJJIII, this);
    }

    public C1477900oYu(InterfaceC1482870ogv interfaceC1482870ogv, InterfaceC1477730oYd interfaceC1477730oYd) {
        this.LIZIZ = interfaceC1482870ogv;
        this.LIZJ = interfaceC1477730oYd;
    }
}
