package Y;

import X.C09JN;
import X.C0BWZ;
import X.C0YNP;
import X.C0YNY;
import X.C0ZZV;
import X.C11NZ;
import X.C11S5;
import X.C1227904rF;
import X.C1C7U;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C23112093u;
import X.C902380Zae;
import X.C902390Zaf;
import X.InterfaceC420801kM;
import X.InterfaceC874680YTa;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import com.ss.android.ugc.aweme.im.messagelist.protocols.LiveCardViewModel;
import com.ss.android.ugc.aweme.social.service.ICelebrationDataService;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import com.ss.android.ugc.aweme.social.sticker.model.base.RelationshipCelebrationInfo;
import com.ss.android.ugc.aweme.social.sticker.model.base.RelationshipInfo;
import com.ss.android.ugc.aweme.social.sticker.model.base.StoryRelationshipCelebrationMaterialsResponse;
import com.ss.android.ugc.aweme.social.sticker.model.base.StoryRelationshipCelebrationsResponse;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AfS47S1100000_14 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS47S1100000_14 afS47S1100000_14, Object obj) {
        C1C7U.LIZ("LiveCardViewModel@1233.fetchRoomInfo$1$1");
        ((LiveCardViewModel) afS47S1100000_14.l1).AQ2().put(afS47S1100000_14.s0, obj);
        C1C7U.LIZIZ("LiveCardViewModel@1233.fetchRoomInfo$1$1");
    }

    public static final void accept$1(AfS47S1100000_14 afS47S1100000_14, Object obj) {
        C1C7U.LIZ("LiveCardViewModel@1233.fetchRoomInfo$1$2");
        Throwable th = (Throwable) obj;
        if (th instanceof C23112093u) {
            ((LiveCardViewModel) afS47S1100000_14.l1).AQ2().put(afS47S1100000_14.s0, null);
            switch (((C23112093u) th).getErrorCode()) {
                case 4003110:
                    ((LiveCardViewModel) afS47S1100000_14.l1).BQ2().put(afS47S1100000_14.s0, C0ZZV.ERROR_CODE_AGE_RESTRICTION);
                    break;
                case 4003157:
                    ((LiveCardViewModel) afS47S1100000_14.l1).BQ2().put(afS47S1100000_14.s0, C0ZZV.ERROR_CODE_LCC_RESTRICTION);
                    break;
                case 4003160:
                    ((LiveCardViewModel) afS47S1100000_14.l1).BQ2().put(afS47S1100000_14.s0, C0ZZV.ERROR_CODE_REGION_BLOCK);
                    break;
                case 4003175:
                    ((LiveCardViewModel) afS47S1100000_14.l1).BQ2().put(afS47S1100000_14.s0, C0ZZV.ERROR_CODE_RESTRICTED_MODE_CHILD);
                    break;
                case 4003176:
                    ((LiveCardViewModel) afS47S1100000_14.l1).BQ2().put(afS47S1100000_14.s0, C0ZZV.ERROR_CODE_RESTRICTED_MODE_PARENT);
                    break;
                case 4003182:
                    ((LiveCardViewModel) afS47S1100000_14.l1).BQ2().put(afS47S1100000_14.s0, C0ZZV.ERROR_CODE_EC_LIMIT);
                    break;
                case 4003185:
                    ((LiveCardViewModel) afS47S1100000_14.l1).BQ2().put(afS47S1100000_14.s0, C0ZZV.ERROR_CODE_EC_LIMIT_RM_PARENT);
                    break;
                case 4003186:
                    ((LiveCardViewModel) afS47S1100000_14.l1).BQ2().put(afS47S1100000_14.s0, C0ZZV.ERROR_CODE_EC_LIMIT_RM_CHILD);
                    break;
            }
        }
        ((LiveCardViewModel) afS47S1100000_14.l1).zQ2().put(afS47S1100000_14.s0, Boolean.FALSE);
        ((LiveCardViewModel) afS47S1100000_14.l1).LLJ.LIZJ(Unit.LIZ);
        Collection<Boolean> collectionValues = ((LiveCardViewModel) afS47S1100000_14.l1).zQ2().values();
        if (!collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                if (!(!((Boolean) it2.next()).booleanValue())) {
                }
            }
            ((LiveCardViewModel) afS47S1100000_14.l1).LLJIJIL.setValue(Boolean.TRUE);
        } else {
            ((LiveCardViewModel) afS47S1100000_14.l1).LLJIJIL.setValue(Boolean.TRUE);
        }
        C1C7U.LIZIZ("LiveCardViewModel@1233.fetchRoomInfo$1$2");
    }

    public static final void accept$2(AfS47S1100000_14 afS47S1100000_14, Object obj) {
        List<RelationshipCelebrationTarget> list;
        C902380Zae c902380ZaeLIZ;
        C1C7U.LIZ("RelationCelebrationRepo@82bf.loadMaterials$job$1");
        StoryRelationshipCelebrationMaterialsResponse storyRelationshipCelebrationMaterialsResponse = (StoryRelationshipCelebrationMaterialsResponse) obj;
        Map<String, Map<String, StorySocialEventStickerData>> map = C902390Zaf.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(afS47S1100000_14.s0);
        sbLIZ.append(((RelationshipCelebrationInfo) afS47S1100000_14.l1).celebrationStartTime);
        map.put(C2188811AlT.LIZIZ(sbLIZ), storyRelationshipCelebrationMaterialsResponse.getMaterials());
        C902390Zaf c902390Zaf = C902390Zaf.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(afS47S1100000_14.s0);
        sbLIZ2.append(((RelationshipCelebrationInfo) afS47S1100000_14.l1).celebrationStartTime);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        c902390Zaf.getClass();
        Keva keva = C902390Zaf.LJII;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("materials");
        sbLIZ3.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(storyRelationshipCelebrationMaterialsResponse);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("saveRequestDataIntoKeva materials: ");
        sbLIZ4.append(strLJI);
        C2188811AlT.LIZIZ(sbLIZ4);
        keva.storeString(strLIZIZ2, strLJI);
        Iterator<Map.Entry<String, StorySocialEventStickerData>> it2 = storyRelationshipCelebrationMaterialsResponse.getMaterials().entrySet().iterator();
        while (it2.hasNext()) {
            Function0<Unit> function0 = C902390Zaf.LJFF.get(it2.next().getKey());
            if (function0 != null) {
                function0.invoke();
            }
        }
        String.valueOf(storyRelationshipCelebrationMaterialsResponse.getMaterials());
        if (!C0BWZ.LIZ() && (list = ((RelationshipCelebrationInfo) afS47S1100000_14.l1).celebratingTargets) != null) {
            String str = afS47S1100000_14.s0;
            StoryFriendAnniversaryService storyFriendAnniversaryService = C902390Zaf.LJI;
            if (storyFriendAnniversaryService != null && (c902380ZaeLIZ = storyFriendAnniversaryService.LIZ(str)) != null) {
                c902380ZaeLIZ.LJIIJJI(list);
            }
        }
        C1C7U.LIZIZ("RelationCelebrationRepo@82bf.loadMaterials$job$1");
    }

    public static final void accept$3(AfS47S1100000_14 afS47S1100000_14, Object obj) {
        long jCurrentTimeMillis;
        StoryFriendAnniversaryService storyFriendAnniversaryService;
        C902380Zae c902380ZaeLIZ;
        C1C7U.LIZ("RelationCelebrationRepo@82bf.requestStoryFriendAnniversaryData$job$1");
        StoryRelationshipCelebrationsResponse storyRelationshipCelebrationsResponse = (StoryRelationshipCelebrationsResponse) obj;
        List<RelationshipCelebrationInfo> celebrations = storyRelationshipCelebrationsResponse.getCelebrations();
        if (celebrations != null) {
            String str = afS47S1100000_14.s0;
            for (RelationshipCelebrationInfo relationshipCelebrationInfo : celebrations) {
                Integer num = relationshipCelebrationInfo.celebrationType;
                if (num != null && num.intValue() == 8) {
                    List<RelationshipCelebrationInfo> celebrations2 = storyRelationshipCelebrationsResponse.getCelebrations();
                    if (celebrations2 != null) {
                        C902390Zaf.LIZIZ.put(str, celebrations2);
                    }
                    List<RelationshipCelebrationTarget> list = relationshipCelebrationInfo.celebratingTargets;
                    if (list != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("request data success: ");
                        sbLIZ.append(list.size());
                        C2188811AlT.LIZIZ(sbLIZ);
                        if (C0BWZ.LIZ() && (storyFriendAnniversaryService = C902390Zaf.LJI) != null && (c902380ZaeLIZ = storyFriendAnniversaryService.LIZ(str)) != null) {
                            c902380ZaeLIZ.LJIIJJI(list);
                        }
                    }
                    C902390Zaf.LIZ.getClass();
                    Long l = relationshipCelebrationInfo.celebrationStartTime;
                    if (l != null) {
                        jCurrentTimeMillis = l.longValue();
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    ArrayList arrayList = new ArrayList();
                    List<RelationshipCelebrationTarget> list2 = relationshipCelebrationInfo.celebratingTargets;
                    if (list2 != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (RelationshipCelebrationTarget relationshipCelebrationTarget : list2) {
                            if (relationshipCelebrationTarget.celebratingUserId != null) {
                                arrayList2.add(relationshipCelebrationTarget);
                            }
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            InterfaceC420801kM interfaceC420801kMLJJLL = null;
                            Long lValueOf = null;
                            interfaceC420801kMLJJLL = null;
                            if (it2.hasNext()) {
                                RelationshipCelebrationTarget relationshipCelebrationTarget2 = (RelationshipCelebrationTarget) it2.next();
                                String str2 = relationshipCelebrationTarget2.celebratingUserId;
                                if (str2 != null) {
                                    lValueOf = Long.valueOf(CastLongProtector.parseLong(str2));
                                }
                                String strLIZLLL = C0YNP.LIZLLL(lValueOf);
                                Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
                                if (lLJIILIIL == null) {
                                    break;
                                }
                                long jLJJIJIIJI = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJJIJIIJI(strLIZLLL, new int[]{1, 15}, new long[]{lLJIILIIL.longValue()});
                                String str3 = relationshipCelebrationTarget2.celebratingUserId;
                                if (str3 != null) {
                                    arrayList.add(new RelationshipInfo(str3, Long.valueOf(jLJJIJIIJI), null));
                                }
                            } else {
                                ICelebrationDataService iCelebrationDataService = (ICelebrationDataService) PluggableExtentionKt.pluggableSpi$default(ICelebrationDataService.class, false, false, false, 14, null);
                                if (iCelebrationDataService != null) {
                                    C1227904rF.LIZ.getClass();
                                    String strLJI = C1227904rF.LJI(arrayList);
                                    if (strLJI == null) {
                                        strLJI = "";
                                    }
                                    C11NZ c11nzLIZ = iCelebrationDataService.LIZ(jCurrentTimeMillis, strLJI);
                                    if (c11nzLIZ != null) {
                                        interfaceC420801kMLJJLL = c11nzLIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS47S1100000_14(relationshipCelebrationInfo, str, 2), new C09JN() { // from class: X.00P5
                                            @Override // X.C09JN
                                            public final void accept(Object obj2) {
                                                C1C7U.LIZ("RelationCelebrationRepo@82bf.loadMaterials$job$2");
                                                C1C7U.LIZIZ("RelationCelebrationRepo@82bf.loadMaterials$job$2");
                                            }
                                        });
                                    }
                                }
                                ((ArrayList) C902390Zaf.LJIIIIZZ).add(interfaceC420801kMLJJLL);
                            }
                        }
                    }
                    C902390Zaf.LIZ.getClass();
                    Keva keva = C902390Zaf.LJII;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("info");
                    sbLIZ2.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    C1227904rF.LIZ.getClass();
                    String strLJI2 = C1227904rF.LJI(storyRelationshipCelebrationsResponse);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("saveRequestDataIntoKeva data: ");
                    sbLIZ3.append(strLJI2);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    keva.storeString(strLIZIZ, strLJI2);
                }
            }
        }
        Function0 function0 = (Function0) afS47S1100000_14.l1;
        if (function0 != null) {
            function0.invoke();
        }
        C902390Zaf.LIZIZ.put(afS47S1100000_14.s0, storyRelationshipCelebrationsResponse.getCelebrations());
        C1C7U.LIZIZ("RelationCelebrationRepo@82bf.requestStoryFriendAnniversaryData$job$1");
    }

    public AfS47S1100000_14(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
