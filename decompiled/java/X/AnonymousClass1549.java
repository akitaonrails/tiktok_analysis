package X;

import android.app.Activity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParam;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParamKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.music.model.MusicRecallInfo;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1549, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1549 {
    public static final Map LJ(String str, Map map) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "fix_recommend_extra_video_uri_opt", true, true)) {
            return map;
        }
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (linkedHashMap.containsKey("video_uri")) {
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("video_uri", str);
            return linkedHashMap;
        }
        return map;
    }

    public static final C15O7<MusicList> LIZ(int i, int i2, boolean z, String str, final String str2, IMusicRequestParam iMusicRequestParam) {
        int i3;
        int i4;
        boolean zLJI = MethodIDManager.LJI(202194);
        if (!Intrinsics.LJFF("profile_photo", str) && !Intrinsics.LJFF("ai_avatar", str)) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        ChooseMusicApi.API api = ChooseMusicApi.LIZ;
        int soundPageScene = iMusicRequestParam.getSoundPageScene();
        if (!C290510Ba5.LIZ() && (ChooseMusicApi.LIZLLL() || ((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LJ())) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        C15O7 c15o7LIZLLL = api.LJIILJJIL(i, i2, z, soundPageScene, i4, i3, iMusicRequestParam.getShootWay(), iMusicRequestParam.getContentType(), iMusicRequestParam.getContentSource(), iMusicRequestParam.getInfoStickerList(), iMusicRequestParam.getMvId(), iMusicRequestParam.getChallengeId(), iMusicRequestParam.getTextContent(), iMusicRequestParam.getEffectId(), iMusicRequestParam.getCreationId(), Long.valueOf(iMusicRequestParam.getVideoDuration()), Boolean.valueOf(iMusicRequestParam.getUnlimitedOnly()), iMusicRequestParam.getPinnedMusicId()).LIZLLL(new InterfaceC2385309Wh() { // from class: X.12NR
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                C1C7U.LIZ("ChooseMusicApiWrapKt@f8c.getHotMusicList$1");
                MusicList musicList = (MusicList) c15o7.LJIIL();
                if (musicList != null) {
                    C686250Qvv.LIZJ(null, str2, musicList.items, null);
                    C686250Qvv.LIZIZ("hot_music", musicList.items);
                }
                C1C7U.LIZIZ("ChooseMusicApiWrapKt@f8c.getHotMusicList$1");
                return musicList;
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return c15o7LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C15O7<com.ss.android.ugc.aweme.music.model.MusicList> LIZIZ(int r34, int r35, final java.lang.String r36, final int r37, com.ss.android.ugc.aweme.music.model.IMusicRequestParam r38, final java.lang.String r39, java.lang.String r40) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1549.LIZIZ(int, int, java.lang.String, int, com.ss.android.ugc.aweme.music.model.IMusicRequestParam, java.lang.String, java.lang.String):X.15O7");
    }

    public static final C15O7<MusicList> LIZLLL(int i, int i2, final String str, final int i3, IMusicRequestParam iMusicRequestParam, final String str2, String str3, String str4) {
        LinkedHashMap linkedHashMap;
        boolean z;
        String str5;
        int i4;
        int i5;
        String str6;
        TypedString typedString;
        TypedString typedString2;
        TypedString typedString3;
        TypedString typedString4;
        TypedString typedString5;
        TypedString typedString6;
        String strJ3;
        String string;
        String string2;
        Object c098200Yq;
        Activity activityLIZ;
        Boolean boolValueOf;
        ICreativeSAAService iCreativeSAAService;
        Activity activityLIZIZ;
        Map mapLJ = LJ(str, iMusicRequestParam.getRecommendExtra());
        C0XED c0xed = C526890KlT.LIZIZ;
        TypedByteArray typedByteArray = null;
        if (mapLJ != null) {
            linkedHashMap = new LinkedHashMap(mapLJ);
        } else {
            linkedHashMap = null;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(c0xed.LJFF(linkedHashMap));
        if (!iMusicRequestParam.getWithoutUnderstanding() && C123100dR.LIZ(str2)) {
            linkedHashMap2.put("understanding_key", str2);
        }
        boolean z2 = true;
        if (str4.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            linkedHashMap2.put("local_emb", str4);
        }
        String str7 = "";
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ai_music_request_change_from_params", true, true)) {
            str5 = "";
        } else {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            } else {
                activityLIZ = null;
            }
            if (activityLIZ != null && (iCreativeSAAService = (ICreativeSAAService) PluggableExtentionKt.pluggableSpi$default(ICreativeSAAService.class, false, false, false, 14, null)) != null) {
                boolValueOf = Boolean.valueOf(iCreativeSAAService.isShootScene(activityLIZ));
            } else {
                boolValueOf = null;
            }
            str5 = (!Intrinsics.LJFF(boolValueOf, Boolean.TRUE) || i2 <= 2) ? "" : "shoot_page";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request api:getRecommendMusicList2-->extra:");
        sbLIZ.append(C13LP.LJJLIIIJ(linkedHashMap2.entrySet(), null, null, null, 0, null, AFwS261S0000000_22.get$arr$(32), 31));
        C201955140j.LJIILIIL("RecommendMusic", C2188811AlT.LIZIZ(sbLIZ));
        JSONObject jSONObject = IMusicRequestParamKt.toJSONObject(linkedHashMap2, null);
        if (i == 0 && iMusicRequestParam.getCanFetchingSimilarSong() && iMusicRequestParam.getMusicID() != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class);
        if (iCommerceMediaService != null && iCommerceMediaService.LJIILLIIL()) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        String strLJIIIZ = C2211631BhB.LJIIIZ();
        if (!iMusicRequestParam.getWithoutUnderstanding()) {
            if (str3.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                try {
                    C0VSJ c0vsj = new C0VSJ(str3);
                    if (c0vsj.exists() && c0vsj.isFile()) {
                        c098200Yq = new TypedByteArray("application/octet-stream", C09BH.LJ(c0vsj), new String[0]);
                    } else {
                        c098200Yq = null;
                    }
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                typedByteArray = (TypedByteArray) c098200Yq;
            }
        }
        ChooseMusicApi.API api = ChooseMusicApi.LIZ;
        TypedString typedString7 = new TypedString(String.valueOf(i));
        TypedString typedString8 = new TypedString(String.valueOf(i2));
        TypedString typedString9 = new TypedString("shoot_page");
        TypedString typedString10 = new TypedString(str5);
        if (str == null) {
            str6 = "";
        } else {
            str6 = str;
        }
        TypedString typedString11 = new TypedString(str6);
        TypedString typedString12 = new TypedString("1");
        String microAppId = iMusicRequestParam.getMicroAppId();
        if (microAppId == null) {
            microAppId = "";
        }
        TypedString typedString13 = new TypedString(microAppId);
        String musicID = iMusicRequestParam.getMusicID();
        String str8 = "";
        if (musicID != null) {
            str7 = musicID;
        }
        TypedString typedString14 = new TypedString(str7);
        TypedString typedString15 = new TypedString(String.valueOf(i4));
        TypedString typedString16 = new TypedString(String.valueOf(i3));
        TypedString typedString17 = new TypedString(String.valueOf(i5));
        String shootWay = iMusicRequestParam.getShootWay();
        if (shootWay == null) {
            shootWay = str8;
        }
        TypedString typedString18 = new TypedString(shootWay);
        String contentType = iMusicRequestParam.getContentType();
        if (contentType == null) {
            contentType = str8;
        }
        TypedString typedString19 = new TypedString(contentType);
        String contentSource = iMusicRequestParam.getContentSource();
        if (contentSource == null) {
            contentSource = str8;
        }
        TypedString typedString20 = new TypedString(contentSource);
        String infoStickerList = iMusicRequestParam.getInfoStickerList();
        if (infoStickerList == null) {
            infoStickerList = str8;
        }
        TypedString typedString21 = new TypedString(infoStickerList);
        String mvId = iMusicRequestParam.getMvId();
        if (mvId == null) {
            mvId = str8;
        }
        TypedString typedString22 = new TypedString(mvId);
        String challengeId = iMusicRequestParam.getChallengeId();
        if (challengeId == null) {
            challengeId = str8;
        }
        TypedString typedString23 = new TypedString(challengeId);
        String textContent = iMusicRequestParam.getTextContent();
        if (textContent == null) {
            textContent = str8;
        }
        TypedString typedString24 = new TypedString(textContent);
        String effectId = iMusicRequestParam.getEffectId();
        if (effectId == null) {
            effectId = str8;
        }
        TypedString typedString25 = new TypedString(effectId);
        String creationId = iMusicRequestParam.getCreationId();
        if (creationId == null) {
            creationId = str8;
        }
        TypedString typedString26 = new TypedString(creationId);
        TypedString typedString27 = new TypedString(String.valueOf(iMusicRequestParam.getVideoDuration()));
        if (strLJIIIZ == null) {
            strLJIIIZ = str8;
        }
        TypedString typedString28 = new TypedString(strLJIIIZ);
        Long firstMusicId = iMusicRequestParam.getFirstMusicId();
        if (firstMusicId != null && (string2 = firstMusicId.toString()) != null) {
            str8 = string2;
        }
        TypedString typedString29 = new TypedString(str8);
        Long replaceMusicIndex = iMusicRequestParam.getReplaceMusicIndex();
        if (replaceMusicIndex != null && (string = replaceMusicIndex.toString()) != null) {
            typedString = new TypedString(string);
        } else {
            typedString = null;
        }
        String strValueOf = String.valueOf(iMusicRequestParam.getUnlimitedOnly());
        if (strValueOf != null) {
            typedString2 = new TypedString(strValueOf);
        } else {
            typedString2 = null;
        }
        TypedString typedString30 = new TypedString(String.valueOf(iMusicRequestParam.getMusicTag()));
        if (jSONObject != null && (strJ3 = C786410Ut5.J3(jSONObject)) != null) {
            typedString3 = new TypedString(strJ3);
        } else {
            typedString3 = null;
        }
        String strippedMetasongId = iMusicRequestParam.getStrippedMetasongId();
        if (strippedMetasongId != null) {
            typedString4 = new TypedString(strippedMetasongId);
        } else {
            typedString4 = null;
        }
        String itemId = iMusicRequestParam.getItemId();
        if (itemId != null) {
            typedString5 = new TypedString(itemId);
        } else {
            typedString5 = null;
        }
        String pinnedMusicId = iMusicRequestParam.getPinnedMusicId();
        if (pinnedMusicId != null) {
            typedString6 = new TypedString(pinnedMusicId);
        } else {
            typedString6 = null;
        }
        return api.getRecommendMusicListFromAIWithFrame(typedString7, typedString8, typedString9, typedString10, typedString11, typedString12, typedString13, typedString14, typedString15, typedString16, typedString17, typedString18, typedString19, typedString20, typedString21, typedString22, typedString23, typedString24, typedString25, typedString26, typedString27, typedString28, typedString29, typedString, typedString2, typedString30, typedString3, typedString4, typedString5, typedString6, typedByteArray).LIZLLL(new InterfaceC2385309Wh() { // from class: X.12NT
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7 c15o7) {
                Object objValueOf;
                List<Music> list;
                C1C7U.LIZ("ChooseMusicApiWrapKt@f8c.getRecommendMusicList2$2");
                MusicList musicList = (MusicList) c15o7.LJIIL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getRecommendMusicList2 from net api success, size=");
                if (musicList != null && (list = musicList.items) != null) {
                    objValueOf = Integer.valueOf(list.size());
                } else {
                    objValueOf = null;
                }
                sbLIZ2.append(objValueOf);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (musicList != null) {
                    List<Music> list2 = musicList.items;
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    for (Music music : list2) {
                        if (hashSet.add(Long.valueOf(music.getId()))) {
                            arrayList.add(music);
                        }
                    }
                    musicList.items = arrayList;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    List<MusicRecallInfo> list3 = musicList.recallInfo;
                    if (list3 != null) {
                        for (MusicRecallInfo musicRecallInfo : list3) {
                            if (musicRecallInfo != null && musicRecallInfo.recallReason != null) {
                                linkedHashMap3.put(Long.valueOf(musicRecallInfo.id), musicRecallInfo.recallReason);
                            }
                        }
                    }
                    List<Long> list4 = musicList.mSimilarSongIDs;
                    if (list4 != null) {
                        for (Music music2 : musicList.items) {
                            music2.setSimilarTag(Integer.valueOf(list4.contains(Long.valueOf(music2.getId())) ? 1 : 0));
                        }
                    }
                    String str9 = "";
                    String str10 = "panel";
                    if (str2 != null) {
                        C686250Qvv.LIZ(i3, str2, musicList.items, C0A1G.LIZ());
                        List<Music> list5 = musicList.items;
                        String str11 = str2;
                        StringBuilder sb = new StringBuilder();
                        if (i3 != 0) {
                            str10 = "capsule";
                        }
                        sb.append(str10);
                        sb.append("-AI");
                        if (str2 != null) {
                            str9 = "-uri";
                        }
                        sb.append(str9);
                        C686250Qvv.LIZJ(str11, sb.toString(), list5, linkedHashMap3);
                    } else {
                        C686250Qvv.LIZ(i3, str, musicList.items, C0A1G.LIZ());
                        List<Music> list6 = musicList.items;
                        String str12 = str;
                        StringBuilder sb2 = new StringBuilder();
                        if (i3 != 0) {
                            str10 = "capsule";
                        }
                        sb2.append(str10);
                        sb2.append("-AI");
                        if (str != null) {
                            str9 = "-uri";
                        }
                        sb2.append(str9);
                        C686250Qvv.LIZJ(str12, sb2.toString(), list6, linkedHashMap3);
                    }
                    C686250Qvv.LIZIZ("ai_music", musicList.items);
                }
                C1C7U.LIZIZ("ChooseMusicApiWrapKt@f8c.getRecommendMusicList2$2");
                return musicList;
            }
        });
    }
}
