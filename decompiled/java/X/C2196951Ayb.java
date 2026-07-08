package X;

import Y.AkS326S0200000_19;
import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import com.ss.android.ugc.aweme.minis.model.MinisMeta;
import com.ss.android.ugc.aweme.minis.model.MinisMetaBulkResponse;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.NetworkResponse;
import com.ss.android.ugc.aweme.minis.model.RecommendMinisMetasResponse;
import com.ss.android.ugc.aweme.minis.request.IMetaServiceApi;
import com.ss.android.ugc.aweme.minis.settings.MinisConfigSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.1Ayb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196951Ayb {
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("video_id", "gip_task_id", "video_creator_id", "anchor_click_id", "is_gip_anchor");
    public final Application LIZ;
    public final IMetaServiceApi LIZIZ;

    public C2196951Ayb(Application application) {
        this.LIZ = application;
        IMetaServiceApi.LIZ.getClass();
        this.LIZIZ = C1232860iBg.LIZ();
    }

    public static boolean LJI(SchemaParserData schemaParserData) {
        EnumC2192711Arl enumC2192711Arl;
        boolean z;
        Boolean boolValueOf = null;
        if (schemaParserData != null) {
            enumC2192711Arl = schemaParserData.minisStage;
        } else {
            enumC2192711Arl = null;
        }
        if (enumC2192711Arl != EnumC2192711Arl.MINIS_STAGE_PROD) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("isLocalMetaCacheEnabled, result:false, minisStage:");
            sbLIZ.append(enumC2192711Arl);
            sbLIZ.append(", skip");
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        MinisConfigSettings.MetaCache metaCache = MinisConfigSettings.LIZ().metaCache;
        if (metaCache != null) {
            z = metaCache.enable;
        } else {
            z = true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isLocalMetaCacheEnabled, result:");
        sbLIZ2.append(z);
        sbLIZ2.append(", settings enable:");
        MinisConfigSettings.MetaCache metaCache2 = MinisConfigSettings.LIZ().metaCache;
        if (metaCache2 != null) {
            boolValueOf = Boolean.valueOf(metaCache2.enable);
        }
        sbLIZ2.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ2);
        return z;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public final AbstractC19484711Kz<NetworkResponse<List<MinisMetaResp>>> LIZ(final List<SchemaParserData> list) {
        String str;
        Integer numValueOf;
        EnumC2192711Arl enumC2192711Arl;
        EnumC2192711Arl enumC2192711Arl2;
        String str2;
        NetworkResponse networkResponse = new NetworkResponse(null, -1, false, null, false, null, null);
        if (list.isEmpty()) {
            int i = C2187451AjH.LIZ;
            return AbstractC19484711Kz.LJIJJLI(networkResponse);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<SchemaParserData> it2 = list.iterator();
        while (true) {
            str = null;
            if (!it2.hasNext()) {
                break;
            }
            SchemaParserData next = it2.next();
            String str3 = next.clientKey;
            if (str3 != null && str3.length() != 0 && (str2 = next.clientKey) != null) {
                arrayList.add(str2);
            }
        }
        if (arrayList.isEmpty()) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchMetaData, invalid clientKey:");
            sbLIZ.append(arrayList);
            C2188811AlT.LIZIZ(sbLIZ);
            return AbstractC19484711Kz.LJIJJLI(networkResponse);
        }
        SchemaParserData schemaParserData = (SchemaParserData) C13LP.LJJJLL(list);
        if (schemaParserData != null && (enumC2192711Arl2 = schemaParserData.minisStage) != null) {
            numValueOf = Integer.valueOf(enumC2192711Arl2.ordinal());
        } else {
            numValueOf = null;
        }
        SchemaParserData schemaParserData2 = (SchemaParserData) C13LP.LJJJLL(list);
        if (schemaParserData2 != null) {
            enumC2192711Arl = schemaParserData2.minisStage;
        } else {
            enumC2192711Arl = null;
        }
        if (enumC2192711Arl == EnumC2192711Arl.MINIS_STAGE_DEBUG) {
            numValueOf = Integer.valueOf(EnumC2192711Arl.MINIS_STAGE_PROD.ordinal());
        }
        SchemaParserData schemaParserData3 = (SchemaParserData) C13LP.LJJJLL(list);
        if (schemaParserData3 != null) {
            str = schemaParserData3.minisSource;
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new NetworkResponse(null, -1, false, null, false, null, null);
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = System.currentTimeMillis();
        return AbstractC19484711Kz.LJIJJ(this.LIZIZ.LJFF(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62), numValueOf, str)).LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.0iRH
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                int iOrdinal;
                int iIntValue;
                SchemaParserData next2;
                MinisMetaBulkResponse minisMetaBulkResponse = (MinisMetaBulkResponse) obj;
                try {
                    C1227904rF.LIZ.getClass();
                    String strLJI = C1227904rF.LJI(minisMetaBulkResponse);
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("middleWare, refresh, resp:");
                    sbLIZ2.append(strLJI);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    long jCurrentTimeMillis = System.currentTimeMillis() - c238400w2.element;
                    String str4 = minisMetaBulkResponse.status_msg;
                    int i4 = minisMetaBulkResponse.status_code;
                    if (i4 == 0) {
                        for (MinisMetaResp minisMetaResp : minisMetaBulkResponse.metaInfos) {
                            Integer num = minisMetaResp.minisStatus;
                            if (num != null) {
                                iOrdinal = num.intValue();
                            } else {
                                iOrdinal = EnumC1386420mBM.MINIS_STATUS_UNKNOWN.ordinal();
                            }
                            Integer num2 = minisMetaResp.statusCode;
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            Iterator<SchemaParserData> it3 = list.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                    if (Intrinsics.LJFF(next2.clientKey, minisMetaResp.clientKey)) {
                                        break;
                                    }
                                } else {
                                    next2 = null;
                                    break;
                                }
                            }
                            SchemaParserData schemaParserData4 = next2;
                            if (schemaParserData4 != null) {
                                C2196951Ayb c2196951Ayb = this;
                                JSONArray jSONArray = C2196361Axe.LIZ;
                                C2196361Axe.LJIILIIL(true, iOrdinal, iIntValue, jCurrentTimeMillis, schemaParserData4);
                                c2196951Ayb.getClass();
                                c2196951Ayb.LJII(schemaParserData4, C2196951Ayb.LIZIZ(minisMetaResp, 0));
                            }
                        }
                        C259800zU<NetworkResponse<List<MinisMetaResp>>> c259800zU2 = c259800zU;
                        C2196951Ayb c2196951Ayb2 = this;
                        List<MinisMetaResp> list2 = minisMetaBulkResponse.metaInfos;
                        c2196951Ayb2.getClass();
                        c259800zU2.element = (T) new NetworkResponse(list2, Integer.valueOf(i4), false, null, false, null, null);
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fetchMetaData, error response, server statusCode:");
                        sbLIZ3.append(i4);
                        sbLIZ3.append(", statusMsg:");
                        sbLIZ3.append(str4);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        C259800zU<NetworkResponse<List<MinisMetaResp>>> c259800zU3 = c259800zU;
                        C2196951Ayb c2196951Ayb3 = this;
                        List<MinisMetaResp> list3 = minisMetaBulkResponse.metaInfos;
                        c2196951Ayb3.getClass();
                        c259800zU3.element = (T) new NetworkResponse(list3, Integer.valueOf(i4), false, null, false, null, null);
                    }
                    return AbstractC19484711Kz.LJIJJLI(c259800zU.element);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i5 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("fetchMetaData, error occurred, exception:");
                    sbLIZ4.append(e);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - c238400w2.element;
                    int i6 = minisMetaBulkResponse.status_code;
                    for (SchemaParserData schemaParserData5 : list) {
                        JSONArray jSONArray2 = C2196361Axe.LIZ;
                        C2196361Axe.LJIILIIL(false, EnumC1386420mBM.MINIS_STATUS_UNKNOWN.ordinal(), i6, jCurrentTimeMillis2, schemaParserData5);
                    }
                    c259800zU.element.errorCode = -1;
                    return AbstractC19484711Kz.LJIJJLI(c259800zU.element);
                }
            }
        }).LJJI(new AkS326S0200000_19(list, c238400w2, 1));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public final C11HW LJFF(String str) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new NetworkResponse(null, -1, false, null, false, null, null);
        return AbstractC19484711Kz.LJIJJ(this.LIZIZ.LJ(str)).LJIIZILJ(new AkS326S0200000_19(this, c259800zU, 5)).LJJI(new InterfaceC1487280oo2() { // from class: X.01So
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                String string;
                Throwable th = (Throwable) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchMinisLinkParseMeta, error occurred, cause:");
                Throwable cause = th.getCause();
                if (cause != null) {
                    string = cause.toString();
                } else {
                    string = null;
                }
                sbLIZ.append(string);
                C2188811AlT.LIZIZ(sbLIZ);
                return AbstractC19484711Kz.LJIILLIIL(th);
            }
        });
    }

    public final void LJIIIIZZ(NetworkResponse<RecommendMinisMetasResponse> networkResponse) {
        RecommendMinisMetasResponse recommendMinisMetasResponse;
        Integer num;
        if (networkResponse != null && (recommendMinisMetasResponse = networkResponse.data) != null) {
            ArrayList<MinisMetaResp> arrayList = new ArrayList();
            List<MinisMeta> list = recommendMinisMetasResponse.metas;
            if (list != null) {
                int i = 0;
                for (MinisMeta minisMeta : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        MinisMeta minisMeta2 = minisMeta;
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("toMinisMetaRespList, minisStatus:");
                        sbLIZ.append(minisMeta2.minisStatus);
                        sbLIZ.append(", clientKey:");
                        sbLIZ.append(minisMeta2.clientKey);
                        C2188811AlT.LIZIZ(sbLIZ);
                        String str = minisMeta2.clientKey;
                        Integer num2 = minisMeta2.minisType;
                        Integer num3 = minisMeta2.minisTechType;
                        Integer num4 = minisMeta2.minisStatus;
                        arrayList.add(new MinisMetaResp(str, minisMeta2.clientKeyType, num2, num3, num4, minisMeta2.name, minisMeta2.description, minisMeta2.iconUrl, minisMeta2.iconBigUrl, minisMeta2.appVersion, minisMeta2.minisUrl, minisMeta2.privacyUrl, minisMeta2.allowedDomains, minisMeta2.config, minisMeta2.packageConfig, minisMeta2.updateTime, minisMeta2.tosUrl, minisMeta2.scopes, minisMeta2.entity, Integer.valueOf(EnumC2192711Arl.MINIS_STAGE_PROD.ordinal()), minisMeta2.minisCategory, recommendMinisMetasResponse.statusCode, recommendMinisMetasResponse.statusMsg, minisMeta2.merchantId, null, null, 50331648, null));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                for (MinisMetaResp minisMetaResp : arrayList) {
                    int i4 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("saveRecommendDataIfStatusOk, minisMetaResp:");
                    sbLIZ2.append(minisMetaResp);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    String str2 = minisMetaResp.clientKey;
                    Integer num5 = minisMetaResp.minisStatus;
                    if (str2 != null && str2.length() != 0) {
                        int iOrdinal = EnumC1386420mBM.MINIS_STATUS_ONLINE.ordinal();
                        if (num5 != null && num5.intValue() == iOrdinal) {
                            if (networkResponse != null) {
                                num = networkResponse.errorCode;
                            } else {
                                num = null;
                            }
                            C08ST.LIZLLL(C786410Ut5.M3(this.LIZ), str2, new NetworkResponse(minisMetaResp, num, false, null, false, null, null));
                        } else {
                            C08ST.LIZJ(C786410Ut5.M3(this.LIZ), str2);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("saveRecommendDataIfStatusOk, minisStatus:");
                            sbLIZ3.append(num5);
                            sbLIZ3.append(", skip");
                            C2188811AlT.LIZIZ(sbLIZ3);
                        }
                    }
                }
                return;
            }
        }
        int i5 = C2187451AjH.LIZ;
    }

    public static NetworkResponse LIZIZ(MinisMetaResp minisMetaResp, int i) {
        return new NetworkResponse(minisMetaResp, Integer.valueOf(i), false, null, false, null, null);
    }

    public static NetworkResponse LIZJ(int i, boolean z) {
        if (!z) {
            i = -1;
        }
        return new NetworkResponse(null, Integer.valueOf(i), false, null, false, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC19484711Kz<com.ss.android.ugc.aweme.minis.model.NetworkResponse<com.ss.android.ugc.aweme.minis.model.MinisMetaResp>> LJ(com.ss.android.ugc.aweme.minis.common.SchemaParserData r25, java.util.LinkedHashMap<java.lang.String, java.lang.String> r26) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2196951Ayb.LJ(com.ss.android.ugc.aweme.minis.common.SchemaParserData, java.util.LinkedHashMap):X.11Kz");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJII(SchemaParserData schemaParserData, NetworkResponse networkResponse) {
        String str;
        MinisMetaResp minisMetaResp;
        boolean zLJI = LJI(schemaParserData);
        if (!zLJI) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("saveDataIfStatusOk, enableLocalMetaCache:");
            sbLIZ.append(zLJI);
            sbLIZ.append(", skip");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        Integer num = null;
        if (networkResponse != null && (minisMetaResp = (MinisMetaResp) networkResponse.data) != null) {
            str = minisMetaResp.clientKey;
        } else {
            str = null;
            if (networkResponse != null) {
            }
            int iOrdinal = EnumC1386420mBM.MINIS_STATUS_ONLINE.ordinal();
            if (num == null && num.intValue() == iOrdinal) {
                C08ST.LIZLLL(C786410Ut5.M3(this.LIZ), str, networkResponse);
                return;
            }
            C08ST.LIZJ(C786410Ut5.M3(this.LIZ), str);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("saveDataIfStatusOk, minisStatus:");
            sbLIZ2.append(num);
            sbLIZ2.append(", skip");
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        MinisMetaResp minisMetaResp2 = (MinisMetaResp) networkResponse.data;
        if (minisMetaResp2 != null) {
            num = minisMetaResp2.minisStatus;
        }
        int iOrdinal2 = EnumC1386420mBM.MINIS_STATUS_ONLINE.ordinal();
        if (num == null) {
        }
        C08ST.LIZJ(C786410Ut5.M3(this.LIZ), str);
        int i22 = C2187451AjH.LIZ;
        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
        sbLIZ22.append("saveDataIfStatusOk, minisStatus:");
        sbLIZ22.append(num);
        sbLIZ22.append(", skip");
        C2188811AlT.LIZIZ(sbLIZ22);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v1, types: [T, com.ss.android.ugc.aweme.minis.model.NetworkResponse] */
    public static AbstractC19484711Kz LIZLLL(final C2196951Ayb c2196951Ayb, final SchemaParserData schemaParserData, boolean z, LinkedHashMap linkedHashMap, int i) {
        ?? LJ;
        Map<String, ? extends Object> map;
        String string;
        String str;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        boolean z2 = z;
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            linkedHashMap2 = null;
        }
        c2196951Ayb.getClass();
        final boolean zLIZ = C297070Bkf.LIZ();
        new NetworkResponse(null, -1, false, null, false, null, null);
        if (schemaParserData == null) {
            int i2 = C2187451AjH.LIZ;
            return AbstractC19484711Kz.LJIJJLI(LIZJ(20010002, zLIZ));
        }
        if (zLIZ && (((str = schemaParserData.schemaUrl) == null || str.length() == 0) && schemaParserData.tiktokMinisParams == null)) {
            int i3 = C2187451AjH.LIZ;
            return AbstractC19484711Kz.LJIJJLI(LIZJ(20010002, true));
        }
        String str2 = schemaParserData.clientKey;
        if (str2 != null && str2.length() != 0) {
            int iOrdinal = schemaParserData.minisStage.ordinal();
            if (schemaParserData.minisStage == EnumC2192711Arl.MINIS_STAGE_DEBUG) {
                iOrdinal = EnumC2192711Arl.MINIS_STAGE_PROD.ordinal();
            }
            String str3 = schemaParserData.minisSource;
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = new NetworkResponse(null, -1, false, null, false, null, null);
            final C238400w2 c238400w2 = new C238400w2();
            c238400w2.element = System.currentTimeMillis();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            if (linkedHashMap2 != null) {
                linkedHashMap3.putAll(linkedHashMap2);
            }
            TiktokMinisQueryParams tiktokMinisQueryParams = schemaParserData.tiktokMinisParams;
            if (tiktokMinisQueryParams == null || (map = tiktokMinisQueryParams.logExtra) == null || map.get("is_gip_anchor") == null) {
                LJ = C2097608Jq.LJ();
            } else {
                LJ = new LinkedHashMap();
                for (String str4 : LIZJ) {
                    Object obj = map.get(str4);
                    if (obj == null || (string = obj.toString()) == null) {
                        string = "";
                    }
                    if (string.length() > 0) {
                        LJ.put(str4, string);
                    }
                }
            }
            for (Map.Entry entry : LJ.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (!linkedHashMap3.containsKey(key)) {
                    linkedHashMap3.put(key, value);
                }
            }
            C1227904rF.LIZ.getClass();
            return AbstractC19484711Kz.LJIJJ(c2196951Ayb.LIZIZ.LIZLLL(str2, Integer.valueOf(iOrdinal), str3, z2, C1227904rF.LJI(linkedHashMap3))).LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.0iRI
                /* JADX WARN: Not initialized variable reg: 1, insn: 0x014a: IGET (r0 I:X.00w2) = (r1 I:X.0iRI) (LINE:16777546) X.0iRI.LL X.00w2, block:B:49:0x0132 */
                /* JADX WARN: Type inference failed for: r1v0, types: [X.0iRI] */
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj2) {
                    ?? r1;
                    int iOrdinal2;
                    int i4;
                    int iOrdinal3;
                    int iIntValue;
                    int iIntValue2;
                    Integer num;
                    String str5;
                    MinisMetaResp minisMetaResp = (MinisMetaResp) obj2;
                    int iIntValue3 = 0;
                    try {
                        C1227904rF.LIZ.getClass();
                        String strLJI = C1227904rF.LJI(minisMetaResp);
                        int i5 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("middleWare, refresh, resp:");
                        sbLIZ.append(strLJI);
                        C2188811AlT.LIZIZ(sbLIZ);
                        long jCurrentTimeMillis = System.currentTimeMillis() - c238400w2.element;
                        Integer num2 = minisMetaResp.minisStatus;
                        if (num2 != null) {
                            iOrdinal3 = num2.intValue();
                        } else {
                            iOrdinal3 = EnumC1386420mBM.MINIS_STATUS_UNKNOWN.ordinal();
                        }
                        Integer num3 = minisMetaResp.statusCode;
                        if (num3 != null) {
                            iIntValue = num3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        Integer num4 = minisMetaResp.statusCode;
                        String str6 = minisMetaResp.statusMsg;
                        if (num4 != null && num4.intValue() == 0) {
                            JSONArray jSONArray = C2196361Axe.LIZ;
                            C2196361Axe.LJIILIIL(true, iOrdinal3, iIntValue, jCurrentTimeMillis, schemaParserData);
                            C259800zU<NetworkResponse<MinisMetaResp>> c259800zU2 = c259800zU;
                            c2196951Ayb.getClass();
                            c259800zU2.element = (T) C2196951Ayb.LIZIZ(minisMetaResp, 0);
                            if (zLIZ && iOrdinal3 == EnumC1386420mBM.MINIS_STATUS_ONLINE.ordinal()) {
                                c2196951Ayb.getClass();
                                String str7 = minisMetaResp.minisUrl;
                                if (str7 != null && str7.length() != 0) {
                                    String str8 = minisMetaResp.name;
                                    if (str8 != null && str8.length() != 0) {
                                        String str9 = minisMetaResp.config;
                                        if ((str9 == null || str9.length() == 0) && ((str5 = minisMetaResp.packageConfig) == null || str5.length() == 0)) {
                                            num = 20110006;
                                        }
                                    } else {
                                        num = 20110005;
                                    }
                                } else {
                                    num = 20110004;
                                }
                                if (num != null) {
                                    C259800zU<NetworkResponse<MinisMetaResp>> c259800zU3 = c259800zU;
                                    int iIntValue4 = num.intValue();
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("fetchMetaData, meta payload invalid, code=");
                                    sbLIZ2.append(iIntValue4);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    c259800zU3.element.errorCode = Integer.valueOf(iIntValue4);
                                }
                            }
                            c2196951Ayb.LJII(schemaParserData, c259800zU.element);
                            return AbstractC19484711Kz.LJII(new C1266110j3J(c259800zU, 1));
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("fetchMetaData, error response, server statusCode:");
                        sbLIZ3.append(num4);
                        sbLIZ3.append(", statusMsg:");
                        sbLIZ3.append(str6);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        JSONArray jSONArray2 = C2196361Axe.LIZ;
                        C2196361Axe.LJIILIIL(false, iOrdinal3, iIntValue, jCurrentTimeMillis, schemaParserData);
                        C259800zU<NetworkResponse<MinisMetaResp>> c259800zU4 = c259800zU;
                        C2196951Ayb c2196951Ayb2 = c2196951Ayb;
                        if (num4 != null) {
                            iIntValue2 = num4.intValue();
                        } else {
                            iIntValue2 = -1;
                        }
                        c2196951Ayb2.getClass();
                        c259800zU4.element = (T) C2196951Ayb.LIZIZ(minisMetaResp, iIntValue2);
                        return AbstractC19484711Kz.LJIJJLI(c259800zU.element);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int i6 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("fetchMetaData, error occurred, exception:");
                        sbLIZ4.append(e);
                        C2188811AlT.LIZIZ(sbLIZ4);
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - c238400w2.element;
                        Integer num5 = minisMetaResp.minisStatus;
                        if (num5 != null) {
                            iOrdinal2 = num5.intValue();
                        } else {
                            iOrdinal2 = EnumC1386420mBM.MINIS_STATUS_UNKNOWN.ordinal();
                        }
                        Integer num6 = minisMetaResp.statusCode;
                        if (num6 != null) {
                            iIntValue3 = num6.intValue();
                        }
                        JSONArray jSONArray3 = C2196361Axe.LIZ;
                        C2196361Axe.LJIILIIL(false, iOrdinal2, iIntValue3, jCurrentTimeMillis2, schemaParserData);
                        NetworkResponse<MinisMetaResp> networkResponse = c259800zU.element;
                        if (zLIZ && (e instanceof s)) {
                            i4 = 20120002;
                        } else {
                            i4 = -1;
                        }
                        networkResponse.errorCode = i4;
                        return AbstractC19484711Kz.LJIJJLI(c259800zU.element);
                    }
                }
            }).LJJI(new InterfaceC1487280oo2() { // from class: X.0iRL
                /* JADX WARN: Removed duplicated region for block: B:22:0x0065 A[PHI: r1
                  0x0065: PHI (r1v8 X.0ozZ) = (r1v2 X.0ozZ), (r1v10 X.0ozZ) binds: [B:21:0x0063, B:17:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.InterfaceC1487280oo2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r12) {
                    /*
                        r11 = this;
                        java.lang.Throwable r12 = (java.lang.Throwable) r12
                        java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                        java.lang.String r0 = "fetchMetaData, error occurred, cause:"
                        r1.append(r0)
                        java.lang.Throwable r0 = r12.getCause()
                        r3 = 0
                        if (r0 == 0) goto Lbb
                        java.lang.String r0 = r0.toString()
                    L16:
                        r1.append(r0)
                        X.C2188811AlT.LIZIZ(r1)
                        long r7 = java.lang.System.currentTimeMillis()
                        X.00w2 r0 = r1
                        long r0 = r0.element
                        long r7 = r7 - r0
                        X.0mBM r0 = X.EnumC1386420mBM.MINIS_STATUS_UNKNOWN
                        int r5 = r0.ordinal()
                        r6 = -1
                        org.json.JSONArray r0 = X.C2196361Axe.LIZ
                        r4 = 0
                        com.ss.android.ugc.aweme.minis.common.SchemaParserData r9 = r2
                        X.C2196361Axe.LJIILIIL(r4, r5, r6, r7, r9)
                        boolean r0 = r3
                        if (r0 == 0) goto Lbe
                        X.1Ayb r0 = r4
                        r0.getClass()
                        boolean r0 = r12 instanceof X.C1494690ozz
                        if (r0 == 0) goto L46
                        r2 = r12
                        X.0ozz r2 = (X.C1494690ozz) r2
                        if (r2 != 0) goto L50
                    L46:
                        java.lang.Throwable r2 = r12.getCause()
                        boolean r0 = r2 instanceof X.C1494690ozz
                        if (r0 == 0) goto Lb9
                        X.0ozz r2 = (X.C1494690ozz) r2
                    L50:
                        boolean r0 = r12 instanceof X.C1494430ozZ
                        if (r0 == 0) goto L59
                        r1 = r12
                        X.0ozZ r1 = (X.C1494430ozZ) r1
                        if (r1 != 0) goto L65
                    L59:
                        java.lang.Throwable r1 = r12.getCause()
                        boolean r0 = r1 instanceof X.C1494430ozZ
                        if (r0 == 0) goto Lab
                        X.0ozZ r1 = (X.C1494430ozZ) r1
                        if (r1 == 0) goto Lab
                    L65:
                        int r0 = r1.getStatusCode()
                        java.lang.String r2 = java.lang.String.valueOf(r0)
                    L6d:
                        java.lang.String r1 = r12.getLocalizedMessage()
                        if (r1 != 0) goto L79
                        java.lang.String r1 = r12.getMessage()
                        if (r1 == 0) goto L80
                    L79:
                        int r0 = r1.length()
                        if (r0 <= 0) goto L80
                        r3 = r1
                    L80:
                        kotlin.Pair r0 = new kotlin.Pair
                        r0.<init>(r2, r3)
                        java.lang.Object r2 = r0.getFirst()
                        java.lang.String r2 = (java.lang.String) r2
                        java.lang.Object r1 = r0.getSecond()
                        java.lang.String r1 = (java.lang.String) r1
                        com.ss.android.ugc.aweme.minis.model.NetworkResponse r3 = new com.ss.android.ugc.aweme.minis.model.NetworkResponse
                        r4 = 0
                        r0 = 200(0xc8, float:2.8E-43)
                        java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                        r6 = 0
                        r7 = r4
                        r8 = r6
                        r9 = r4
                        r10 = r4
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                        r3.netCode = r2
                        r3.netError = r1
                        X.11Hj r0 = X.AbstractC19484711Kz.LJIJJLI(r3)
                        return r0
                    Lab:
                        if (r2 == 0) goto Lb6
                        int r0 = r2.getCronetInternalErrorCode()
                        java.lang.String r2 = java.lang.String.valueOf(r0)
                        goto L6d
                    Lb6:
                        java.lang.String r2 = "0"
                        goto L6d
                    Lb9:
                        r2 = r3
                        goto L50
                    Lbb:
                        r0 = r3
                        goto L16
                    Lbe:
                        X.11Is r0 = X.AbstractC19484711Kz.LJIILLIIL(r12)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1242570iRL.apply(java.lang.Object):java.lang.Object");
                }
            });
        }
        int i4 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchMetaData, invalid clientKey:");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        return AbstractC19484711Kz.LJIJJLI(LIZJ(20110003, zLIZ));
    }
}
