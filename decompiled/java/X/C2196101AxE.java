package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.ads.MinisIaaT4bConfigModel;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.iaa.MinisRewardedAdData;
import com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196101AxE {
    public static long LIZJ;
    public static final C2196101AxE LIZ = new C2196101AxE();
    public static final ConcurrentHashMap<String, MinisRewardedAdData> LIZIZ = new ConcurrentHashMap<>();
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public static void LIZJ(String str) {
        C1227904rF c1227904rF = C1227904rF.LIZ;
        ConcurrentHashMap<String, MinisRewardedAdData> concurrentHashMap = LIZIZ;
        c1227904rF.getClass();
        String strLJI = C1227904rF.LJI(concurrentHashMap);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, MinisRewardedAdData> entry : concurrentHashMap.entrySet()) {
            String key = entry.getKey();
            MinisRewardedAdData value = entry.getValue();
            String str2 = value.clientKey;
            if (str2 != null && str2.equals(str)) {
                linkedHashMap.put(key, value);
            }
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroyInstanceWhenExitMinis，map json:");
        sbLIZ.append(strLJI);
        sbLIZ.append(", tempAdInstanceInfoMap:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(linkedHashMap));
        C2188811AlT.LIZIZ(sbLIZ);
        C2196681AyA c2196681AyA = C2196681AyA.LIZ;
        List listLLIIII = C13LP.LLIIII(linkedHashMap.keySet());
        c2196681AyA.getClass();
        C2196681AyA.LIZIZ(listLLIIII);
        ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService != null) {
            iCommerceSaasService.LIZ(C13LP.LLIIII(linkedHashMap.keySet()));
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            LIZIZ.remove(((Map.Entry) it2.next()).getKey());
        }
    }

    public static InterfaceC2194811Av9 LIZ(int i, Integer num, String str) {
        InterfaceC2194811Av9 interfaceC2194811Av9 = (InterfaceC2194811Av9) C1909107dp.LIZJ(InterfaceC2194811Av9.class, null);
        interfaceC2194811Av9.setSuccess(Boolean.FALSE);
        interfaceC2194811Av9.setErrorCode(Integer.valueOf(i));
        interfaceC2194811Av9.setErrorMsg(str);
        interfaceC2194811Av9.setSubErrorCode(num);
        return interfaceC2194811Av9;
    }

    public static InterfaceC2194851AvD LIZIZ(int i, Integer num, String str) {
        InterfaceC2194851AvD interfaceC2194851AvD = (InterfaceC2194851AvD) C1909107dp.LIZJ(InterfaceC2194851AvD.class, null);
        interfaceC2194851AvD.setSuccess(Boolean.FALSE);
        interfaceC2194851AvD.setErrorCode(Integer.valueOf(i));
        interfaceC2194851AvD.setErrorMsg(str);
        interfaceC2194851AvD.setSubErrorCode(num);
        return interfaceC2194851AvD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(CompletionBlock completionBlock, String str, boolean z) {
        String str2;
        String enterFrom;
        Map map;
        InterfaceC1032100cxs interfaceC1032100cxsLIZIZ;
        C1048270dNx c1048270dNx;
        C1048270dNx c1048270dNx2;
        TiktokMinisQueryParams tiktokMinisQueryParams;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestRewardAds, start, adInstanceUniqueId:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        MinisRewardedAdData minisRewardedAdData = null;
        String str3 = "";
        if (z) {
            C1232850iBf c1232850iBf = C2196131AxH.LJIJJ;
            int i2 = c1232850iBf.LIZ;
            String str4 = c1232850iBf.LIZIZ;
            if (str4 == null) {
                str4 = "";
            }
            InterfaceC2194851AvD interfaceC2194851AvDLIZIZ = LIZIZ(i2, c1232850iBf.LIZJ, str4);
            C2196701AyC.LIZ.getClass();
            C2196701AyC.LJIILJJIL(null, true, c1232850iBf);
            C2196201AxO.LIZLLL(c1232850iBf);
            String str5 = c1232850iBf.LIZIZ;
            if (str5 != null) {
                str3 = str5;
            }
            completionBlock.onFailure(1, str3, interfaceC2194851AvDLIZIZ);
            return;
        }
        if (str != null && str.length() != 0) {
            ConcurrentHashMap<String, MinisRewardedAdData> concurrentHashMap = LIZIZ;
            if (concurrentHashMap.containsKey(str) && (minisRewardedAdData = concurrentHashMap.get(str)) != null) {
                HashMap map2 = new HashMap();
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                MinisIaaT4bConfigModel minisIaaT4bConfigModel = C1910007dy.LIZ;
                MinisIaaT4bConfigModel minisIaaT4bConfigModel2 = (MinisIaaT4bConfigModel) settingsManagerLIZLLL.LJIIIIZZ("minis_iaa_tt4b_config", MinisIaaT4bConfigModel.class, minisIaaT4bConfigModel);
                if (minisIaaT4bConfigModel2 != null) {
                    minisIaaT4bConfigModel = minisIaaT4bConfigModel2;
                }
                double d = minisIaaT4bConfigModel.closeButtonDelaySeconds;
                if (d > 0.0d) {
                    map2.put("close_button_delay_seconds", Double.valueOf(d));
                }
                String str6 = minisRewardedAdData.clientKey;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = minisRewardedAdData.videoId;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = minisRewardedAdData.adPlacementId;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = minisRewardedAdData.rit;
                if (str9 == null) {
                    str9 = "";
                }
                if (str9.length() == 0) {
                    C1232850iBf c1232850iBf2 = C2196131AxH.LJIILL;
                    int i3 = c1232850iBf2.LIZ;
                    String str10 = c1232850iBf2.LIZIZ;
                    if (str10 == null) {
                        str10 = "";
                    }
                    InterfaceC2194851AvD interfaceC2194851AvDLIZIZ2 = LIZIZ(i3, c1232850iBf2.LIZJ, str10);
                    C2196701AyC.LIZ.getClass();
                    C2196701AyC.LJIILJJIL(minisRewardedAdData, true, c1232850iBf2);
                    C2196201AxO.LIZLLL(c1232850iBf2);
                    String str11 = c1232850iBf2.LIZIZ;
                    if (str11 != null) {
                        str3 = str11;
                    }
                    completionBlock.onFailure(1, str3, interfaceC2194851AvDLIZIZ2);
                    return;
                }
                MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
                if (minisMetaResp == null || (str2 = minisMetaResp.minisCategory) == null) {
                    str2 = "";
                }
                SchemaParserData schemaParserData = C2195221Avo.LJII;
                if (schemaParserData == null) {
                    enterFrom = "";
                } else {
                    enterFrom = schemaParserData.getEnterFrom();
                }
                SchemaParserData schemaParserData2 = C2195221Avo.LJII;
                if (schemaParserData2 == null || (tiktokMinisQueryParams = schemaParserData2.tiktokMinisParams) == null || (map = tiktokMinisQueryParams.logExtra) == null) {
                    map = new HashMap();
                }
                HashMap map3 = new HashMap();
                map3.put("rit", str9);
                map3.put("reward_minis_id", str6);
                map3.put("reward_video_id", str7);
                map3.put("ad_unit_id", str8);
                map3.put("reward_unique_id", str);
                map3.put("reward_minis_enter_from", enterFrom);
                map3.put("reward_minis_category", str2);
                Object obj = map.get("gip_task_id");
                if (!(obj instanceof String) || obj == null) {
                    obj = "";
                }
                map3.put("gip_task_id", obj);
                Object obj2 = map.get("gip_task_name");
                if (!(obj2 instanceof String) || obj2 == null) {
                    obj2 = "";
                }
                map3.put("gip_task_name", obj2);
                map3.put("video_id", str7);
                Object obj3 = map.get("fyf_card_id");
                if (!(obj3 instanceof String) || obj3 == null) {
                    obj3 = "";
                }
                map3.put("fyf_card_id", obj3);
                if (Intrinsics.LJFF(str2, "short_drama") && (c1048270dNx2 = C2195221Avo.LJIIL) != null) {
                    String str12 = c1048270dNx2.LIZ;
                    if (str12 != null) {
                        map3.put("minis_drama_collection_id", str12);
                    }
                    String str13 = c1048270dNx2.LIZIZ;
                    if (str13 != null) {
                        map3.put("minis_short_drama_inner_feed_episode_num_uid", str13);
                    }
                }
                HashMap map4 = new HashMap();
                map4.put("rit", str9);
                map4.put("reward_unique_id", str);
                map4.put("reward_minis_id", str6);
                map4.put("reward_video_id", str7);
                map4.put("ad_unit_id", str8);
                map4.put("reward_minis_category", str2);
                if (Intrinsics.LJFF(str2, "short_drama") && (c1048270dNx = C2195221Avo.LJIIL) != null) {
                    String str14 = c1048270dNx.LIZ;
                    if (str14 != null) {
                        map4.put("minis_drama_collection_id", str14);
                    }
                    String str15 = c1048270dNx.LIZIZ;
                    if (str15 != null) {
                        map4.put("minis_short_drama_inner_feed_episode_num_uid", str15);
                    }
                }
                ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
                if (iCommerceSaasService != null) {
                    interfaceC1032100cxsLIZIZ = iCommerceSaasService.LIZIZ(str);
                } else {
                    interfaceC1032100cxsLIZIZ = 0;
                }
                if (minisRewardedAdData.hasShown) {
                    C1232850iBf c1232850iBf3 = C2196131AxH.LJII;
                    int i4 = c1232850iBf3.LIZ;
                    String str16 = c1232850iBf3.LIZIZ;
                    if (str16 == null) {
                        str16 = "";
                    }
                    InterfaceC2194851AvD interfaceC2194851AvDLIZIZ3 = LIZIZ(i4, c1232850iBf3.LIZJ, str16);
                    C2196701AyC.LIZ.getClass();
                    C2196701AyC.LJIILJJIL(minisRewardedAdData, true, c1232850iBf3);
                    C2196201AxO.LIZLLL(c1232850iBf3);
                    String str17 = c1232850iBf3.LIZIZ;
                    if (str17 != null) {
                        str3 = str17;
                    }
                    completionBlock.onFailure(0, str3, interfaceC2194851AvDLIZIZ3);
                    return;
                }
                if (interfaceC1032100cxsLIZIZ == 0) {
                    C1232850iBf c1232850iBf4 = C2196131AxH.LJIILLIIL;
                    int i5 = c1232850iBf4.LIZ;
                    String str18 = c1232850iBf4.LIZIZ;
                    if (str18 == null) {
                        str18 = "";
                    }
                    InterfaceC2194851AvD interfaceC2194851AvDLIZIZ4 = LIZIZ(i5, c1232850iBf4.LIZJ, str18);
                    C2196701AyC.LIZ.getClass();
                    C2196701AyC.LJIILJJIL(minisRewardedAdData, true, c1232850iBf4);
                    C2196201AxO.LIZLLL(c1232850iBf4);
                    String str19 = c1232850iBf4.LIZIZ;
                    if (str19 != null) {
                        str3 = str19;
                    }
                    completionBlock.onFailure(0, str3, interfaceC2194851AvDLIZIZ4);
                    return;
                }
                if (!LIZLLL.compareAndSet(false, true)) {
                    C1232850iBf c1232850iBf5 = C2196131AxH.LJIIJ;
                    int i6 = c1232850iBf5.LIZ;
                    String str20 = c1232850iBf5.LIZIZ;
                    if (str20 == null) {
                        str20 = "";
                    }
                    InterfaceC2194851AvD interfaceC2194851AvDLIZIZ5 = LIZIZ(i6, c1232850iBf5.LIZJ, str20);
                    C2196701AyC.LIZ.getClass();
                    C2196701AyC.LJIILJJIL(null, true, c1232850iBf5);
                    C2196201AxO.LIZLLL(c1232850iBf5);
                    String str21 = c1232850iBf5.LIZIZ;
                    if (str21 == null) {
                        str21 = "";
                    }
                    completionBlock.onFailure(1, str21, interfaceC2194851AvDLIZIZ5);
                    return;
                }
                try {
                    minisRewardedAdData.adRequestTime = Long.valueOf(System.currentTimeMillis());
                    interfaceC1032100cxsLIZIZ.start(true, map2, map3, map4, null);
                    minisRewardedAdData.hasShown = true;
                    C2196681AyA.LIZ.getClass();
                    C2196681AyA.LIZLLL.put(str6, str);
                    C1227904rF.LIZ.getClass();
                    C1227904rF.LJI(map3);
                    C1227904rF.LJI(map4);
                    InterfaceC2194851AvD interfaceC2194851AvD = (InterfaceC2194851AvD) C1909107dp.LIZJ(InterfaceC2194851AvD.class, null);
                    interfaceC2194851AvD.setSuccess(Boolean.TRUE);
                    interfaceC2194851AvD.setErrorCode(0);
                    C1232850iBf c1232850iBf6 = C2196131AxH.LIZIZ;
                    C2196701AyC.LIZ.getClass();
                    C2196701AyC.LJIILJJIL(minisRewardedAdData, false, c1232850iBf6);
                    completionBlock.onSuccess(interfaceC2194851AvD, "");
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LIZLLL.set(false);
                    C1232850iBf c1232850iBf7 = C2196131AxH.LJIJ;
                    int i7 = c1232850iBf7.LIZ;
                    String str22 = c1232850iBf7.LIZIZ;
                    if (str22 == null) {
                        str22 = "";
                    }
                    InterfaceC2194851AvD interfaceC2194851AvDLIZIZ6 = LIZIZ(i7, c1232850iBf7.LIZJ, str22);
                    C2196701AyC.LIZ.getClass();
                    C2196701AyC.LJIILJJIL(null, true, c1232850iBf7);
                    C2196201AxO.LIZLLL(c1232850iBf7);
                    String str23 = c1232850iBf7.LIZIZ;
                    if (str23 != null) {
                        str3 = str23;
                    }
                    completionBlock.onFailure(1, str3, interfaceC2194851AvDLIZIZ6);
                    return;
                }
            }
            C1232850iBf c1232850iBf8 = C2196131AxH.LJI;
            int i8 = c1232850iBf8.LIZ;
            String str24 = c1232850iBf8.LIZIZ;
            if (str24 == null) {
                str24 = "";
            }
            InterfaceC2194851AvD interfaceC2194851AvDLIZIZ7 = LIZIZ(i8, c1232850iBf8.LIZJ, str24);
            C2196701AyC.LIZ.getClass();
            C2196701AyC.LJIILJJIL(minisRewardedAdData, true, c1232850iBf8);
            C2196201AxO.LIZLLL(c1232850iBf8);
            String str25 = c1232850iBf8.LIZIZ;
            if (str25 != null) {
                str3 = str25;
            }
            completionBlock.onFailure(1, str3, interfaceC2194851AvDLIZIZ7);
            return;
        }
        C1232850iBf c1232850iBf9 = C2196131AxH.LJFF;
        int i9 = c1232850iBf9.LIZ;
        String str26 = c1232850iBf9.LIZIZ;
        if (str26 == null) {
            str26 = "";
        }
        InterfaceC2194851AvD interfaceC2194851AvDLIZIZ8 = LIZIZ(i9, c1232850iBf9.LIZJ, str26);
        C2196701AyC.LIZ.getClass();
        C2196701AyC.LJIILJJIL(null, true, c1232850iBf9);
        C2196201AxO.LIZLLL(c1232850iBf9);
        String str27 = c1232850iBf9.LIZIZ;
        if (str27 != null) {
            str3 = str27;
        }
        completionBlock.onFailure(1, str3, interfaceC2194851AvDLIZIZ8);
    }
}
