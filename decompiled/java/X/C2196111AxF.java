package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.minis.ads.MinisIaaT4bConfigModel;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.iaa.MinisRewardedAdData;
import com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196111AxF extends AbstractC2194661Auu {
    public final boolean LLILLL;

    public C2196111AxF() {
        this(false);
    }

    public C2196111AxF(boolean z) {
        this.LLILLL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(InterfaceC2194671Auv interfaceC2194671Auv, CompletionBlock completionBlock) {
        String str;
        String enterFrom;
        Map map;
        InterfaceC1032100cxs interfaceC1032100cxsLIZIZ;
        C19352310nR c19352310nR;
        boolean z;
        Pair pair;
        int i;
        C1048270dNx c1048270dNx;
        C1048270dNx c1048270dNx2;
        TiktokMinisQueryParams tiktokMinisQueryParams;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle, start, params:");
        sbLIZ.append(interfaceC2194671Auv);
        C2188811AlT.LIZIZ(sbLIZ);
        C2194771Av5 c2194771Av5 = C2194771Av5.LIZ;
        String adId = interfaceC2194671Auv.getAdId();
        boolean z2 = this.LLILLL;
        c2194771Av5.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("requestRewardAds, start, adInstanceUniqueId:");
        sbLIZ2.append(adId);
        C2188811AlT.LIZIZ(sbLIZ2);
        MinisRewardedAdData minisRewardedAdData = null;
        String str2 = "";
        if (z2) {
            C1232850iBf c1232850iBf = C2196131AxH.LJIJJ;
            int i3 = c1232850iBf.LIZ;
            String str3 = c1232850iBf.LIZIZ;
            if (str3 == null) {
                str3 = "";
            }
            InterfaceC2194631Aur interfaceC2194631AurLIZIZ = C2194771Av5.LIZIZ(i3, c1232850iBf.LIZJ, str3);
            C2196701AyC.LIZ.getClass();
            C2196701AyC.LJIIJJI(null, true, c1232850iBf);
            C2196201AxO.LIZIZ(c1232850iBf);
            String str4 = c1232850iBf.LIZIZ;
            if (str4 != null) {
                str2 = str4;
            }
            completionBlock.onFailure(1, str2, interfaceC2194631AurLIZIZ);
        } else if (adId != null && adId.length() != 0) {
            ConcurrentHashMap<String, MinisRewardedAdData> concurrentHashMap = C2194771Av5.LIZIZ;
            if (concurrentHashMap.containsKey(adId) && (minisRewardedAdData = concurrentHashMap.get(adId)) != null) {
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
                String str5 = minisRewardedAdData.clientKey;
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = minisRewardedAdData.videoId;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = minisRewardedAdData.adPlacementId;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = minisRewardedAdData.rit;
                if (str8 == null) {
                    str8 = "";
                }
                if (str8.length() == 0) {
                    C1232850iBf c1232850iBf2 = C2196131AxH.LJIILL;
                    int i4 = c1232850iBf2.LIZ;
                    String str9 = c1232850iBf2.LIZIZ;
                    if (str9 == null) {
                        str9 = "";
                    }
                    InterfaceC2194631Aur interfaceC2194631AurLIZIZ2 = C2194771Av5.LIZIZ(i4, c1232850iBf2.LIZJ, str9);
                    C2196701AyC.LIZ.getClass();
                    C2196701AyC.LJIIJJI(minisRewardedAdData, true, c1232850iBf2);
                    C2196201AxO.LIZIZ(c1232850iBf2);
                    String str10 = c1232850iBf2.LIZIZ;
                    if (str10 != null) {
                        str2 = str10;
                    }
                    completionBlock.onFailure(1, str2, interfaceC2194631AurLIZIZ2);
                } else {
                    MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
                    if (minisMetaResp == null || (str = minisMetaResp.minisCategory) == null) {
                        str = "";
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
                    map3.put("rit", str8);
                    map3.put("reward_minis_id", str5);
                    map3.put("reward_video_id", str6);
                    map3.put("ad_unit_id", str7);
                    map3.put("reward_unique_id", adId);
                    map3.put("reward_minis_enter_from", enterFrom);
                    map3.put("reward_minis_category", str);
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
                    map3.put("video_id", str6);
                    Object obj3 = map.get("fyf_card_id");
                    if (!(obj3 instanceof String) || obj3 == null) {
                        obj3 = "";
                    }
                    map3.put("fyf_card_id", obj3);
                    if (Intrinsics.LJFF(str, "short_drama") && (c1048270dNx2 = C2195221Avo.LJIIL) != null) {
                        String str11 = c1048270dNx2.LIZ;
                        if (str11 != null) {
                            map3.put("minis_drama_collection_id", str11);
                        }
                        String str12 = c1048270dNx2.LIZIZ;
                        if (str12 != null) {
                            map3.put("minis_short_drama_inner_feed_episode_num_uid", str12);
                        }
                    }
                    HashMap map4 = new HashMap();
                    map4.put("rit", str8);
                    map4.put("reward_unique_id", adId);
                    map4.put("reward_minis_id", str5);
                    map4.put("reward_video_id", str6);
                    map4.put("ad_unit_id", str7);
                    map4.put("reward_minis_category", str);
                    if (Intrinsics.LJFF(str, "short_drama") && (c1048270dNx = C2195221Avo.LJIIL) != null) {
                        String str13 = c1048270dNx.LIZ;
                        if (str13 != null) {
                            map4.put("minis_drama_collection_id", str13);
                        }
                        String str14 = c1048270dNx.LIZIZ;
                        if (str14 != null) {
                            map4.put("minis_short_drama_inner_feed_episode_num_uid", str14);
                        }
                    }
                    ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
                    if (iCommerceSaasService != null) {
                        interfaceC1032100cxsLIZIZ = iCommerceSaasService.LIZIZ(adId);
                    } else {
                        interfaceC1032100cxsLIZIZ = 0;
                    }
                    if (minisRewardedAdData.hasShown) {
                        C1232850iBf c1232850iBf3 = C2196131AxH.LJII;
                        int i5 = c1232850iBf3.LIZ;
                        String str15 = c1232850iBf3.LIZIZ;
                        if (str15 == null) {
                            str15 = "";
                        }
                        InterfaceC2194631Aur interfaceC2194631AurLIZIZ3 = C2194771Av5.LIZIZ(i5, c1232850iBf3.LIZJ, str15);
                        C2196701AyC.LIZ.getClass();
                        C2196701AyC.LJIIJJI(minisRewardedAdData, true, c1232850iBf3);
                        C2196201AxO.LIZIZ(c1232850iBf3);
                        String str16 = c1232850iBf3.LIZIZ;
                        if (str16 != null) {
                            str2 = str16;
                        }
                        completionBlock.onFailure(0, str2, interfaceC2194631AurLIZIZ3);
                    } else if (interfaceC1032100cxsLIZIZ == 0) {
                        C1232850iBf c1232850iBf4 = C2196131AxH.LJIILLIIL;
                        int i6 = c1232850iBf4.LIZ;
                        String str17 = c1232850iBf4.LIZIZ;
                        if (str17 == null) {
                            str17 = "";
                        }
                        InterfaceC2194631Aur interfaceC2194631AurLIZIZ4 = C2194771Av5.LIZIZ(i6, c1232850iBf4.LIZJ, str17);
                        C2196701AyC.LIZ.getClass();
                        C2196701AyC.LJIIJJI(minisRewardedAdData, true, c1232850iBf4);
                        C2196201AxO.LIZIZ(c1232850iBf4);
                        String str18 = c1232850iBf4.LIZIZ;
                        if (str18 != null) {
                            str2 = str18;
                        }
                        completionBlock.onFailure(0, str2, interfaceC2194631AurLIZIZ4);
                    } else {
                        C19378810ri c19378810ri = C19378810ri.LIZ;
                        C0N6N c0n6n = C0N6N.MINIS_AD_PLACEMENT_INTERSTITIAL;
                        c19378810ri.getClass();
                        String strLIZIZ = C19378810ri.LIZIZ(c0n6n);
                        Map<String, C19352310nR> map5 = C19378810ri.LIZIZ;
                        if (map5.containsKey(strLIZIZ)) {
                            c19352310nR = (C19352310nR) ((LinkedHashMap) map5).get(strLIZIZ);
                        } else {
                            c19352310nR = null;
                        }
                        if (c19352310nR == null) {
                            pair = new Pair(Boolean.TRUE, null);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("isAdCanShow, isCanShow:");
                            sbLIZ3.append(((Boolean) pair.getFirst()).booleanValue());
                            sbLIZ3.append(", reason:");
                            sbLIZ3.append(pair.getSecond());
                            C2188811AlT.LIZIZ(sbLIZ3);
                        } else {
                            long j = c19352310nR.LIZLLL;
                            int i7 = c19352310nR.LIZIZ;
                            int i8 = c19352310nR.LIZJ;
                            if (System.currentTimeMillis() - j <= C2196121AxG.LIZ().interstitialAdsCloseCoolSeconds * LSPassThroughRecordSizeConfig.DEFAULT) {
                                z = true;
                            } else {
                                z = false;
                            }
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("isAdCanShow, adClosedCount:");
                            sbLIZ4.append(i7);
                            sbLIZ4.append(", adTotalClosedCount:");
                            sbLIZ4.append(i8);
                            sbLIZ4.append(", isTimeTooShort:");
                            sbLIZ4.append(z);
                            sbLIZ4.append(", adRecentClosedTime:");
                            sbLIZ4.append(j);
                            sbLIZ4.append(", interstitialAdsCloseCoolSeconds:");
                            sbLIZ4.append(C2196121AxG.LIZ().interstitialAdsCloseCoolSeconds);
                            C2188811AlT.LIZIZ(sbLIZ4);
                            if (z) {
                                if (i7 >= C2196121AxG.LIZ().interstitialAdsCloseCountLimit) {
                                    pair = new Pair(Boolean.FALSE, EnumC992850bwZ.AD_DISPLAY_TOO_FAST);
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append("isAdCanShow, isCanShow:");
                                    sbLIZ5.append(((Boolean) pair.getFirst()).booleanValue());
                                    sbLIZ5.append(", reason:");
                                    sbLIZ5.append(pair.getSecond());
                                    C2188811AlT.LIZIZ(sbLIZ5);
                                }
                            } else if (i7 >= C2196121AxG.LIZ().interstitialAdsCloseCountLimit) {
                                c19352310nR.LIZIZ = 0;
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("isAdCanShow, isCanShow reset, data:");
                                sbLIZ6.append(c19352310nR);
                                C2188811AlT.LIZIZ(sbLIZ6);
                            }
                            if (i8 >= C2196121AxG.LIZ().interstitialAdsCloseTotalLimits) {
                                pair = new Pair(Boolean.FALSE, EnumC992850bwZ.AD_DISPLAY_COUNT_REACHED);
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append("isAdCanShow, isCanShow:");
                                sbLIZ7.append(((Boolean) pair.getFirst()).booleanValue());
                                sbLIZ7.append(", reason:");
                                sbLIZ7.append(pair.getSecond());
                                C2188811AlT.LIZIZ(sbLIZ7);
                            } else {
                                pair = new Pair(Boolean.TRUE, null);
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("isAdCanShow, isCanShow:");
                                sbLIZ8.append(((Boolean) pair.getFirst()).booleanValue());
                                sbLIZ8.append(", reason:");
                                sbLIZ8.append(pair.getSecond());
                                C2188811AlT.LIZIZ(sbLIZ8);
                            }
                        }
                        if (!((Boolean) pair.getFirst()).booleanValue()) {
                            EnumC992850bwZ enumC992850bwZ = (EnumC992850bwZ) pair.getSecond();
                            if (enumC992850bwZ == null) {
                                i = -1;
                            } else {
                                i = C992860bwa.LIZ[enumC992850bwZ.ordinal()];
                            }
                            if (i != 1) {
                                if (i != 2) {
                                    C1232850iBf c1232850iBf5 = C2196131AxH.LJIIIZ;
                                    int i9 = c1232850iBf5.LIZ;
                                    String str19 = c1232850iBf5.LIZIZ;
                                    if (str19 == null) {
                                        str19 = "";
                                    }
                                    InterfaceC2194631Aur interfaceC2194631AurLIZIZ5 = C2194771Av5.LIZIZ(i9, c1232850iBf5.LIZJ, str19);
                                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                    sbLIZ9.append("adInstanceUniqueId:");
                                    sbLIZ9.append(adId);
                                    sbLIZ9.append(" ad display limit reached, can't show now");
                                    C2188811AlT.LIZIZ(sbLIZ9);
                                    C2196701AyC.LIZ.getClass();
                                    C2196701AyC.LJIIJJI(minisRewardedAdData, true, c1232850iBf5);
                                    C2196201AxO.LIZIZ(c1232850iBf5);
                                    String str20 = c1232850iBf5.LIZIZ;
                                    if (str20 != null) {
                                        str2 = str20;
                                    }
                                    completionBlock.onFailure(0, str2, interfaceC2194631AurLIZIZ5);
                                } else {
                                    C1232850iBf c1232850iBf6 = C2196131AxH.LJIIIZ;
                                    int i10 = c1232850iBf6.LIZ;
                                    String str21 = c1232850iBf6.LIZIZ;
                                    if (str21 == null) {
                                        str21 = "";
                                    }
                                    InterfaceC2194631Aur interfaceC2194631AurLIZIZ6 = C2194771Av5.LIZIZ(i10, c1232850iBf6.LIZJ, str21);
                                    StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                                    sbLIZ10.append("adInstanceUniqueId:");
                                    sbLIZ10.append(adId);
                                    sbLIZ10.append(" ad display limit reached, can't show now");
                                    C2188811AlT.LIZIZ(sbLIZ10);
                                    C2196701AyC.LIZ.getClass();
                                    C2196701AyC.LJIIJJI(minisRewardedAdData, true, c1232850iBf6);
                                    C2196201AxO.LIZIZ(c1232850iBf6);
                                    String str22 = c1232850iBf6.LIZIZ;
                                    if (str22 != null) {
                                        str2 = str22;
                                    }
                                    completionBlock.onFailure(0, str2, interfaceC2194631AurLIZIZ6);
                                }
                            } else {
                                C1232850iBf c1232850iBf7 = C2196131AxH.LJIIIIZZ;
                                int i11 = c1232850iBf7.LIZ;
                                String str23 = c1232850iBf7.LIZIZ;
                                if (str23 == null) {
                                    str23 = "";
                                }
                                InterfaceC2194631Aur interfaceC2194631AurLIZIZ7 = C2194771Av5.LIZIZ(i11, c1232850iBf7.LIZJ, str23);
                                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                sbLIZ11.append("adInstanceUniqueId:");
                                sbLIZ11.append(adId);
                                sbLIZ11.append(" just shown an Ad, can't show now");
                                C2188811AlT.LIZIZ(sbLIZ11);
                                C2196701AyC.LIZ.getClass();
                                C2196701AyC.LJIIJJI(minisRewardedAdData, true, c1232850iBf7);
                                C2196201AxO.LIZIZ(c1232850iBf7);
                                String str24 = c1232850iBf7.LIZIZ;
                                if (str24 != null) {
                                    str2 = str24;
                                }
                                completionBlock.onFailure(0, str2, interfaceC2194631AurLIZIZ7);
                            }
                        } else if (!C2194771Av5.LIZJ.compareAndSet(false, true)) {
                            C1232850iBf c1232850iBf8 = C2196131AxH.LJIIJ;
                            int i12 = c1232850iBf8.LIZ;
                            String str25 = c1232850iBf8.LIZIZ;
                            if (str25 == null) {
                                str25 = "";
                            }
                            InterfaceC2194631Aur interfaceC2194631AurLIZIZ8 = C2194771Av5.LIZIZ(i12, c1232850iBf8.LIZJ, str25);
                            C2196701AyC.LIZ.getClass();
                            C2196701AyC.LJIIJJI(null, true, c1232850iBf8);
                            C2196201AxO.LIZIZ(c1232850iBf8);
                            String str26 = c1232850iBf8.LIZIZ;
                            if (str26 != null) {
                                str2 = str26;
                            }
                            completionBlock.onFailure(1, str2, interfaceC2194631AurLIZIZ8);
                        } else {
                            try {
                                minisRewardedAdData.adRequestTime = Long.valueOf(System.currentTimeMillis());
                                interfaceC1032100cxsLIZIZ.start(true, map2, map3, map4, null);
                                minisRewardedAdData.hasShown = true;
                                C2196681AyA.LIZ.getClass();
                                C2196681AyA.LIZLLL.put(str5, adId);
                                C1227904rF.LIZ.getClass();
                                C1227904rF.LJI(map3);
                                C1227904rF.LJI(map4);
                                InterfaceC2194631Aur interfaceC2194631Aur = (InterfaceC2194631Aur) C1909107dp.LIZJ(InterfaceC2194631Aur.class, null);
                                interfaceC2194631Aur.setSuccess(Boolean.TRUE);
                                interfaceC2194631Aur.setErrorCode(0);
                                C1232850iBf c1232850iBf9 = C2196131AxH.LIZIZ;
                                C2196701AyC.LIZ.getClass();
                                C2196701AyC.LJIIJJI(minisRewardedAdData, false, c1232850iBf9);
                                completionBlock.onSuccess(interfaceC2194631Aur, "");
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C2194771Av5.LIZJ.set(false);
                                C1232850iBf c1232850iBf10 = C2196131AxH.LJIJ;
                                int i13 = c1232850iBf10.LIZ;
                                String str27 = c1232850iBf10.LIZIZ;
                                if (str27 == null) {
                                    str27 = "";
                                }
                                InterfaceC2194631Aur interfaceC2194631AurLIZIZ9 = C2194771Av5.LIZIZ(i13, c1232850iBf10.LIZJ, str27);
                                C2196701AyC.LIZ.getClass();
                                C2196701AyC.LJIIJJI(null, true, c1232850iBf10);
                                C2196201AxO.LIZIZ(c1232850iBf10);
                                String str28 = c1232850iBf10.LIZIZ;
                                if (str28 != null) {
                                    str2 = str28;
                                }
                                completionBlock.onFailure(1, str2, interfaceC2194631AurLIZIZ9);
                            }
                        }
                    }
                }
            } else {
                C1232850iBf c1232850iBf11 = C2196131AxH.LJI;
                int i14 = c1232850iBf11.LIZ;
                String str29 = c1232850iBf11.LIZIZ;
                if (str29 == null) {
                    str29 = "";
                }
                InterfaceC2194631Aur interfaceC2194631AurLIZIZ10 = C2194771Av5.LIZIZ(i14, c1232850iBf11.LIZJ, str29);
                C2196701AyC.LIZ.getClass();
                C2196701AyC.LJIIJJI(minisRewardedAdData, true, c1232850iBf11);
                C2196201AxO.LIZIZ(c1232850iBf11);
                String str30 = c1232850iBf11.LIZIZ;
                if (str30 != null) {
                    str2 = str30;
                }
                completionBlock.onFailure(1, str2, interfaceC2194631AurLIZIZ10);
            }
        } else {
            C1232850iBf c1232850iBf12 = C2196131AxH.LJFF;
            int i15 = c1232850iBf12.LIZ;
            String str31 = c1232850iBf12.LIZIZ;
            if (str31 == null) {
                str31 = "";
            }
            InterfaceC2194631Aur interfaceC2194631AurLIZIZ11 = C2194771Av5.LIZIZ(i15, c1232850iBf12.LIZJ, str31);
            C2196701AyC.LIZ.getClass();
            C2196701AyC.LJIIJJI(null, true, c1232850iBf12);
            C2196201AxO.LIZIZ(c1232850iBf12);
            String str32 = c1232850iBf12.LIZIZ;
            if (str32 != null) {
                str2 = str32;
            }
            completionBlock.onFailure(1, str2, interfaceC2194631AurLIZIZ11);
        }
        int i16 = C2187451AjH.LIZ;
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append("handle, finish, params:");
        sbLIZ12.append(interfaceC2194671Auv);
        C2188811AlT.LIZIZ(sbLIZ12);
    }

    @Override // X.AbstractC1549150qPp
    public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        LIZJ((InterfaceC2194671Auv) xBaseParamModel, completionBlock);
    }
}
