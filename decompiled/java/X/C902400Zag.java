package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import com.ss.android.ugc.aweme.social.sticker.model.base.RelationshipCelebrationInfo;
import com.ss.android.ugc.aweme.social.sticker.model.base.StoryRelationshipCelebrationMaterialsResponse;
import com.ss.android.ugc.aweme.social.sticker.model.base.StoryRelationshipCelebrationsResponse;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zag, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.friendanniversary.RelationCelebrationRepo$preloadDataFromDisk$1", f = "RelationCelebrationRepo.kt", l = {}, m = "invokeSuspend")
public final class C902400Zag extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C902400Zag(String str, Function0<Unit> function0, InterfaceC1364105Vn<? super C902400Zag> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C902400Zag(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        StoryRelationshipCelebrationsResponse storyRelationshipCelebrationsResponse;
        List<RelationshipCelebrationInfo> celebrations;
        List<RelationshipCelebrationTarget> list;
        C902380Zae c902380ZaeLIZ;
        StoryRelationshipCelebrationMaterialsResponse storyRelationshipCelebrationMaterialsResponse;
        Map<String, StorySocialEventStickerData> materials;
        C1C7U.LIZ("RelationCelebrationRepo@82bf.preloadDataFromDisk$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C902390Zaf c902390Zaf = C902390Zaf.LIZ;
        String str = this.LL;
        c902390Zaf.getClass();
        Keva keva = C902390Zaf.LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("info");
        sbLIZ.append(str);
        String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), "");
        if (string.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                Type type = new TypeToken<StoryRelationshipCelebrationsResponse>() { // from class: X.00Wv
                }.getType();
                c1227904rF.getClass();
                Object objLIZJ = C1227904rF.LIZJ(string, type);
                if ((objLIZJ instanceof StoryRelationshipCelebrationsResponse) && (storyRelationshipCelebrationsResponse = (StoryRelationshipCelebrationsResponse) objLIZJ) != null && (celebrations = storyRelationshipCelebrationsResponse.getCelebrations()) != null) {
                    C902390Zaf.LIZIZ.put(str, celebrations);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        List<RelationshipCelebrationInfo> list2 = C902390Zaf.LIZIZ.get(str);
        if (list2 != null) {
            for (RelationshipCelebrationInfo relationshipCelebrationInfo : list2) {
                try {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(relationshipCelebrationInfo.celebrationStartTime);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    Keva keva2 = C902390Zaf.LJII;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("materials");
                    sbLIZ3.append(strLIZIZ);
                    String string2 = keva2.getString(C2188811AlT.LIZIZ(sbLIZ3), "");
                    if (string2.length() > 0) {
                        C1227904rF c1227904rF2 = C1227904rF.LIZ;
                        Type type2 = new TypeToken<StoryRelationshipCelebrationMaterialsResponse>() { // from class: X.0Zai
                        }.getType();
                        c1227904rF2.getClass();
                        Object objLIZJ2 = C1227904rF.LIZJ(string2, type2);
                        if (objLIZJ2 instanceof StoryRelationshipCelebrationMaterialsResponse) {
                            storyRelationshipCelebrationMaterialsResponse = (StoryRelationshipCelebrationMaterialsResponse) objLIZJ2;
                        } else {
                            storyRelationshipCelebrationMaterialsResponse = null;
                        }
                        Map<String, Map<String, StorySocialEventStickerData>> map = C902390Zaf.LIZJ;
                        if (storyRelationshipCelebrationMaterialsResponse != null) {
                            materials = storyRelationshipCelebrationMaterialsResponse.getMaterials();
                        } else {
                            materials = null;
                        }
                        map.put(strLIZIZ, materials);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        }
        List<RelationshipCelebrationInfo> list3 = C902390Zaf.LIZIZ.get(this.LL);
        if (list3 != null) {
            String str2 = this.LL;
            for (RelationshipCelebrationInfo relationshipCelebrationInfo2 : list3) {
                Integer num = relationshipCelebrationInfo2.celebrationType;
                if (num != null && num.intValue() == 8 && (list = relationshipCelebrationInfo2.celebratingTargets) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (RelationshipCelebrationTarget relationshipCelebrationTarget : list) {
                        C902390Zaf c902390Zaf2 = C902390Zaf.LIZ;
                        String str3 = relationshipCelebrationTarget.celebratingUserId;
                        if (str3 == null) {
                            str3 = "";
                        }
                        c902390Zaf2.getClass();
                        if (C902390Zaf.LIZLLL(str3) != null) {
                            arrayList.add(relationshipCelebrationTarget);
                        }
                    }
                    StoryFriendAnniversaryService storyFriendAnniversaryService = C902390Zaf.LJI;
                    if (storyFriendAnniversaryService != null && (c902380ZaeLIZ = storyFriendAnniversaryService.LIZ(str2)) != null) {
                        c902380ZaeLIZ.LJIIJJI(arrayList);
                    }
                }
            }
        }
        Function0<Unit> function0 = this.LLILLJJLI;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RelationCelebrationRepo@82bf.preloadDataFromDisk$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
