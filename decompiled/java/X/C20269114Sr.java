package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.detail.related.TakoRelatedWordExtPassInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEntranceRequestInfo;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAITemplates;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoBannerCustomizedInfo;
import com.ss.android.ugc.aweme.tako.router.model.TakoAutoSendData;
import com.ss.android.ugc.aweme.tako.router.model.TakoCreativeTaskInfo;
import com.ss.android.ugc.aweme.tako.router.model.TakoInteractGuideData;
import com.ss.android.ugc.aweme.tako.router.model.TakoTemplateInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.14Sr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20269114Sr {
    public static final C20269114Sr LIZ = new C20269114Sr();

    public static Map LIZIZ(TakoRelatedWordExtPassInfo takoRelatedWordExtPassInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = takoRelatedWordExtPassInfo.wordId;
        if (str != null && str.length() > 0) {
            linkedHashMap.put("word_id", str);
        }
        String str2 = takoRelatedWordExtPassInfo.imprId;
        if (str2 != null && str2.length() > 0) {
            linkedHashMap.put("impr_id", str2);
        }
        String str3 = takoRelatedWordExtPassInfo.recallInfo;
        if (str3 != null && str3.length() > 0) {
            linkedHashMap.put("recall_info", str3);
        }
        String str4 = takoRelatedWordExtPassInfo.searchIntent;
        if (str4 != null && str4.length() > 0) {
            linkedHashMap.put("search_intent", str4);
        }
        String str5 = takoRelatedWordExtPassInfo.takoIntent;
        if (str5 != null && str5.length() > 0) {
            linkedHashMap.put("tako_intent", str5);
        }
        return linkedHashMap;
    }

    public static Map LIZJ(TakoBannerCustomizedInfo takoBannerCustomizedInfo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = takoBannerCustomizedInfo.wordId;
        if (str != null && str.length() > 0) {
            linkedHashMap.put("word_id", str);
        }
        String str2 = takoBannerCustomizedInfo.imprId;
        if (str2 != null && str2.length() > 0) {
            linkedHashMap.put("impr_id", str2);
        }
        String str3 = takoBannerCustomizedInfo.recallInfo;
        if (str3 != null && str3.length() > 0) {
            linkedHashMap.put("recall_info", str3);
        }
        String str4 = takoBannerCustomizedInfo.searchIntent;
        if (str4 != null && str4.length() > 0) {
            linkedHashMap.put("search_intent", str4);
        }
        String str5 = takoBannerCustomizedInfo.takoIntent;
        if (str5 != null && str5.length() > 0) {
            linkedHashMap.put("tako_intent", str5);
        }
        return linkedHashMap;
    }

    public static void LJI(Map map, Map map2) {
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str.length() > 0 && str2.length() > 0) {
                    map.put(str, str2);
                }
            }
        }
    }

    public static void LIZLLL(Context context, Aweme aweme, String str, String str2, EnumC20234414Fi enumC20234414Fi, String str3, List list, String str4, EnumC1864410ycJ enumC1864410ycJ, String str5, Map map, Map map2, Map map3, Map map4, TakoRelatedWordExtPassInfo takoRelatedWordExtPassInfo) {
        Integer numLIZIZ;
        int iLIZ;
        String str6;
        TakoAITemplates takoAITemplates;
        TakoAITemplates takoAITemplates2;
        String strLIZJ;
        C20269114Sr c20269114Sr = LIZ;
        if (context != null) {
            C14EG c14egLIZ = LIZ(c20269114Sr, aweme, null, str2, null, str, str3, list, enumC20234414Fi, enumC1864410ycJ, null, null, str5, null, map, map2, map3, map4, str4, 3200);
            c14egLIZ.LJI(new AwS609S0100000_30(takoRelatedWordExtPassInfo, 49));
            TakoAutoSendData takoAutoSendData = c14egLIZ.LJII;
            if (takoAutoSendData != null) {
                C1561220qjI.LIZ.getClass();
                List<TakoAITemplates> list2 = null;
                if (C1561220qjI.LIZ()) {
                    if (takoRelatedWordExtPassInfo != null) {
                        strLIZJ = takoRelatedWordExtPassInfo.LIZJ();
                    } else {
                        strLIZJ = null;
                    }
                    numLIZIZ = C1853740yL6.LIZIZ(strLIZJ);
                } else {
                    numLIZIZ = null;
                }
                if (takoRelatedWordExtPassInfo != null) {
                    list2 = takoRelatedWordExtPassInfo.aiTemplates;
                }
                TakoAITemplates takoAITemplates3 = (TakoAITemplates) C1856050yOp.LIZ(0, list2);
                if (takoAITemplates3 != null && takoAITemplates3.LIZ()) {
                    if (C1561220qjI.LIZ()) {
                        iLIZ = C1853740yL6.LIZ(numLIZIZ);
                    } else {
                        iLIZ = 4;
                    }
                } else {
                    iLIZ = 0;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (takoRelatedWordExtPassInfo != null && takoRelatedWordExtPassInfo.LJ()) {
                    takoRelatedWordExtPassInfo.getClass();
                    Gson gsonLIZ = C597040NbK.LIZ();
                    List<TakoAITemplates> list3 = takoRelatedWordExtPassInfo.aiTemplates;
                    String str7 = "";
                    if (list3 == null || (takoAITemplates2 = (TakoAITemplates) C13LP.LJJJLL(list3)) == null || (str6 = takoAITemplates2.taskType) == null) {
                        str6 = "";
                    }
                    String json = GsonProtectorUtils.toJson(gsonLIZ, new TakoCreativeTaskInfo(str6));
                    if (json == null) {
                        json = "";
                    }
                    linkedHashMap.put("creative_task_info", json);
                    linkedHashMap.put("mode_source", "after_feed");
                    List<TakoAITemplates> list4 = takoRelatedWordExtPassInfo.aiTemplates;
                    if (list4 != null && (takoAITemplates = (TakoAITemplates) C1856050yOp.LIZ(0, list4)) != null && takoAITemplates.LIZ()) {
                        String strLIZIZ = takoRelatedWordExtPassInfo.LIZIZ();
                        if (strLIZIZ != null) {
                            str7 = strLIZIZ;
                        }
                        linkedHashMap.put("image_template_id", str7);
                    }
                }
                takoAutoSendData.setRequestInfo(new TakoEntranceRequestInfo(null, null, null, linkedHashMap, Integer.valueOf(iLIZ), numLIZIZ));
            }
            c14egLIZ.LJII(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJFF(Context context, Aweme aweme, String str, String str2, String str3, List list, String str4, List list2, EnumC1854550yMP enumC1854550yMP, TakoTemplateInfo takoTemplateInfo, EnumC1864410ycJ enumC1864410ycJ, Map map, Map map2, Map map3, Map map4, int i) {
        int iLIZ;
        Map map5 = map3;
        Map map6 = map2;
        List list3 = list2;
        Map map7 = map;
        String str5 = str4;
        Map map8 = map4;
        EnumC1854550yMP enumC1854550yMP2 = enumC1854550yMP;
        List list4 = list;
        C20269114Sr c20269114Sr = LIZ;
        if ((i & 64) != 0) {
            list4 = null;
        }
        if ((i & 128) != 0) {
            str5 = null;
        }
        if ((i & 256) != 0) {
            list3 = null;
        }
        if ((i & 512) != 0) {
            enumC1854550yMP2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            map7 = null;
        }
        if ((i & 8192) != 0) {
            map6 = null;
        }
        if ((i & 16384) != 0) {
            map5 = null;
        }
        if ((i & 32768) != 0) {
            map8 = null;
        }
        if (context != null) {
            C14EG c14egLIZ = LIZ(c20269114Sr, aweme, null, str2, null, str, str3, list4, null, enumC1864410ycJ, null, null, null, null, map6, map5, map8, null, null, 408960);
            TakoAutoSendData takoAutoSendData = c14egLIZ.LJII;
            if (takoAutoSendData != null) {
                C1561220qjI.LIZ.getClass();
                if (C1561220qjI.LIZ()) {
                    iLIZ = C1853740yL6.LIZ(takoTemplateInfo.generateType);
                } else {
                    iLIZ = 4;
                }
                takoAutoSendData.setRequestInfo(new TakoEntranceRequestInfo(null, null, null, map7, Integer.valueOf(iLIZ), takoTemplateInfo.generateType));
            }
            TakoInteractGuideData takoInteractGuideData = c14egLIZ.LJIIIZ;
            if (takoInteractGuideData != 0) {
                takoInteractGuideData.setInputTextContent(str5);
                takoInteractGuideData.setInputImageUrls(list3);
                takoInteractGuideData.setFirstRoundSugSource(null);
                takoInteractGuideData.setInputSkillLabel(enumC1854550yMP2);
                takoInteractGuideData.setTemplateInfo(takoTemplateInfo);
            }
            c14egLIZ.LJII(context);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C14EG LIZ(C20269114Sr c20269114Sr, Aweme aweme, C2189821An6 c2189821An6, String str, Long l, String str2, String str3, List list, EnumC20234414Fi enumC20234414Fi, EnumC1864410ycJ enumC1864410ycJ, InterfaceC19396010uU interfaceC19396010uU, InterfaceC19395910uT interfaceC19395910uT, String str4, Map map, Map map2, Map map3, Map map4, Map map5, String str5, int i) {
        String eventType;
        long jLongValue;
        long jCurrentTimeMillis;
        C20269214Ss c20269214Ss;
        String eventType2;
        String aid;
        T tValueOf;
        String str6 = str5;
        Map map6 = map5;
        Map map7 = map4;
        Map map8 = map3;
        Map map9 = map2;
        Map map10 = map;
        String str7 = str4;
        InterfaceC19395910uT interfaceC19395910uT2 = interfaceC19395910uT;
        InterfaceC19396010uU interfaceC19396010uU2 = interfaceC19396010uU;
        List list2 = list;
        String str8 = str3;
        EnumC1864410ycJ enumC1864410ycJ2 = enumC1864410ycJ;
        EnumC20234414Fi enumC20234414Fi2 = enumC20234414Fi;
        String strLIZIZ = str2;
        if ((i & 16) != 0) {
            strLIZIZ = null;
        }
        if ((i & 32) != 0) {
            str8 = null;
        }
        if ((i & 64) != 0) {
            list2 = null;
        }
        if ((i & 256) != 0) {
            enumC20234414Fi2 = null;
        }
        if ((i & 512) != 0) {
            enumC1864410ycJ2 = EnumC1864410ycJ.FULL_SCREEN;
        }
        if ((i & 1024) != 0) {
            interfaceC19396010uU2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            interfaceC19395910uT2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str7 = null;
        }
        if ((i & 8192) != 0) {
            map10 = null;
        }
        if ((i & 16384) != 0) {
            map9 = null;
        }
        if ((32768 & i) != 0) {
            map8 = null;
        }
        if ((65536 & i) != 0) {
            map7 = null;
        }
        if ((131072 & i) != 0) {
            map6 = null;
        }
        if ((i & 262144) != 0) {
            str6 = null;
        }
        c20269114Sr.getClass();
        C1864020ybg c1864020ybg = C1864020ybg.LIZ;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        long jCurrentTimeMillis2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c1864020ybg.getClass();
        if (jLongValue <= 0) {
            c20269214Ss = null;
        } else {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            InterfaceC581770Mrn interfaceC581770MrnLJLJL = c1er1.LJLJL();
            boolean zLJJJLL = c1er1.LJJJLL(eventType);
            if (zLJJJLL) {
                jCurrentTimeMillis2 = (System.currentTimeMillis() - interfaceC581770MrnLJLJL.LIZIZ()) + interfaceC581770MrnLJLJL.LIZLLL();
                jCurrentTimeMillis = interfaceC581770MrnLJLJL.LJFF();
            } else {
                jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
            }
            c20269214Ss = new C20269214Ss(jCurrentTimeMillis2, jCurrentTimeMillis, zLJJJLL);
        }
        C259800zU c259800zU = new C259800zU();
        if (c20269214Ss != null) {
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            C1864020ybg.LJIILLIIL(c20269214Ss.LIZ + c20269214Ss.LIZIZ, aid);
            if (c20269214Ss.LIZJ) {
                tValueOf = Long.valueOf(c20269214Ss.LIZIZ / 1000);
            } else {
                tValueOf = 0;
            }
            c259800zU.element = tValueOf;
        }
        if (strLIZIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (c2189821An6 == null || (eventType2 = c2189821An6.getEventType()) == null) {
                eventType2 = "";
            }
            sbLIZ.append(eventType2);
            sbLIZ.append("_tikbot");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C14FY c14fy = new C14FY(enumC1864410ycJ2, interfaceC19396010uU2, interfaceC19395910uT2, str8, list2, null, enumC20234414Fi2, map7, str7, map6, aweme, str6, c2189821An6, c259800zU, map8, map10, map9);
        C14EG c14eg = new C14EG(strLIZIZ, str);
        c14fy.invoke(c14eg);
        return c14eg;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(android.content.Context r29, com.ss.android.ugc.aweme.feed.model.Aweme r30, X.C2189821An6 r31, java.lang.String r32, java.lang.Long r33, java.lang.String r34, java.util.List r35, com.ss.android.ugc.aweme.tako.model.AIBotInfo r36, java.lang.String r37, java.util.List r38, java.lang.String r39, X.EnumC1864410ycJ r40, X.InterfaceC19396010uU r41, X.InterfaceC19395910uT r42, java.lang.String r43, java.util.Map r44, java.util.Map r45, java.util.Map r46, java.util.Map r47, X.C718360SFu r48, int r49) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20269114Sr.LJ(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, X.1An6, java.lang.String, java.lang.Long, java.lang.String, java.util.List, com.ss.android.ugc.aweme.tako.model.AIBotInfo, java.lang.String, java.util.List, java.lang.String, X.0ycJ, X.10uU, X.10uT, java.lang.String, java.util.Map, java.util.Map, java.util.Map, java.util.Map, X.0SFu, int):void");
    }
}
