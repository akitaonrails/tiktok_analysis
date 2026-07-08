package X;

import Y.ACallableS432S0100000_29;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVSearchChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editor.recommendhashtag.EditInfo;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtag;
import com.ss.android.ugc.gamora.editor.recommendhashtag.RecommendHashtagResponse;
import com.ss.android.ugc.gamora.editor.recommendhashtag.SearchRecommendChallengeList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.112C, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C112C {
    public static boolean LIZIZ;
    public static C11JF LIZJ;
    public static int LJ;
    public static int LJI;
    public static boolean LJII;
    public static C11JF LJIIIIZZ;
    public static RecommendHashtagResponse LJIIIZ;
    public static SearchRecommendChallengeList LJIIJ;
    public static C11PQ<RecommendHashtagResponse> LJIIJJI;
    public static C11PQ<SearchRecommendChallengeList> LJIIL;
    public static EditInfo LJIILIIL;
    public static final C112C LIZ = new C112C();
    public static EditInfo LIZLLL = new EditInfo(null, null, null, null, null, null);
    public static final List<RecommendHashtag> LJFF = new ArrayList();

    public static void LIZIZ() {
        EditInfo editInfo = LJIILIIL;
        if (editInfo == null) {
            return;
        }
        LJIIL = new C11PQ<>();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C112B(editInfo, null), 3);
    }

    public static final AVSearchChallengeList LJFF(SearchRecommendChallengeList searchRecommendChallengeList) {
        if (searchRecommendChallengeList == null) {
            return null;
        }
        AVSearchChallengeList aVSearchChallengeList = new AVSearchChallengeList();
        List<AVChallenge> list = searchRecommendChallengeList.items;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (AVChallenge aVChallenge : list) {
            AVSearchChallenge aVSearchChallenge = new AVSearchChallenge();
            aVSearchChallenge.challenge = aVChallenge;
            aVSearchChallenge.LIZ = true;
            arrayList.add(aVSearchChallenge);
        }
        aVSearchChallengeList.items = arrayList;
        aVSearchChallengeList.keyword = "";
        LogPbBean logPbBean = new LogPbBean(null);
        logPbBean.setImprId(searchRecommendChallengeList.logId);
        aVSearchChallengeList.logPb = logPbBean;
        return aVSearchChallengeList;
    }

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, C1462070o9N c1462070o9N) {
        LJIILIIL = LIZJ(videoPublishEditModel, c1462070o9N);
        if (!r1.isEqualWith(LIZLLL)) {
            LJIIL = null;
        }
    }

    public static EditInfo LIZJ(VideoPublishEditModel videoPublishEditModel, C1462070o9N c1462070o9N) {
        String musicId;
        ArrayList arrayList;
        String infoStickerIds;
        ArrayList arrayList2;
        String textContent;
        String str;
        ArrayList arrayList3;
        ArrayList<StickerItemModel> arrayList4;
        String textStr;
        TextStickerData textStickerData;
        List<SingleImageData> imageList;
        String commentMsg;
        List listLJJLIIIJILLIZJL;
        C122Q c122q;
        List listLJJLIIIJILLIZJL2;
        String stickerID;
        List listLJJLIIIJILLIZJL3;
        ArrayList arrayList5 = new ArrayList();
        if (C123100dR.LIZ(videoPublishEditModel.getStickerID()) && (stickerID = videoPublishEditModel.getStickerID()) != null && (listLJJLIIIJILLIZJL3 = a0.LJJLIIIJILLIZJL(stickerID, new String[]{","}, 0, 6)) != null) {
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL3, 10));
            Iterator it2 = listLJJLIIIJILLIZJL3.iterator();
            while (it2.hasNext()) {
                arrayList6.add(it2.next());
            }
            arrayList5.addAll(arrayList6);
        }
        ArrayList<EffectPointModel> arrayList7 = videoPublishEditModel.creativeModel.editEffectModel.effectList;
        ArrayList arrayList8 = new ArrayList();
        for (EffectPointModel effectPointModel : arrayList7) {
            if (C123100dR.LIZ(effectPointModel.getKey())) {
                arrayList8.add(effectPointModel);
            }
        }
        ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(arrayList8, 10));
        Iterator it3 = arrayList8.iterator();
        while (it3.hasNext()) {
            arrayList9.add(((EffectPointModel) it3.next()).getKey());
        }
        arrayList5.addAll(arrayList9);
        ArrayList arrayListLJ = null;
        if (arrayList5.isEmpty()) {
            arrayList5 = null;
        }
        MusicObject musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
        if (musicObject != null) {
            musicId = MusicBeanUtilKt.getMusicId(musicObject);
        } else {
            musicId = null;
        }
        if (C123100dR.LIZ(musicId)) {
            arrayList = new ArrayList();
            musicId.toString();
            arrayList.add(musicId);
        } else {
            arrayList = null;
        }
        InfoStickerModel infoStickerModel = videoPublishEditModel.getInfoStickerModel();
        if (infoStickerModel != null) {
            infoStickerIds = infoStickerModel.getInfoStickerIds();
        } else {
            infoStickerIds = null;
        }
        if (C123100dR.LIZ(infoStickerIds) && infoStickerIds != null && (listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(infoStickerIds, new String[]{","}, 0, 6)) != null) {
            arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL2, 10));
            Iterator it4 = listLJJLIIIJILLIZJL2.iterator();
            while (it4.hasNext()) {
                arrayList2.add(it4.next());
            }
        } else {
            arrayList2 = null;
        }
        ArrayList arrayList10 = new ArrayList();
        if (c1462070o9N != null && (c122q = c1462070o9N.LLLLLJLJLL) != null) {
            textContent = c122q.getTextContent();
        } else {
            textContent = null;
        }
        if (C123100dR.LIZ(textContent) && textContent != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(textContent, new String[]{","}, 0, 6)) != null) {
            arrayList10.addAll(listLJJLIIIJILLIZJL);
        }
        Iterator<HashTagStickerModel> it5 = videoPublishEditModel.creativeModel.stickerModel.hashtagStickerModel.iterator();
        while (true) {
            str = "";
            if (!it5.hasNext()) {
                break;
            }
            String hashtagName = it5.next().getHashtagName();
            if (hashtagName != null) {
                str = hashtagName;
            }
            arrayList10.add(str);
        }
        Iterator<CommentStickerModel> it6 = videoPublishEditModel.creativeModel.stickerModel.commentStickerModels.iterator();
        while (it6.hasNext()) {
            CommentVideoModel commentStickerModel = it6.next().getCommentStickerModel();
            if (commentStickerModel != null && (commentMsg = commentStickerModel.getCommentMsg()) != null) {
                arrayList10.add(commentMsg);
            }
        }
        if (arrayList10.isEmpty()) {
            arrayList10 = null;
        }
        if (C1416310mxZ.LJJLIIIJJIZ(videoPublishEditModel)) {
            List<TextStickerModel> listLIZJ = C363730ENv.LIZJ(videoPublishEditModel);
            arrayList3 = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
            Iterator it7 = ((ArrayList) listLIZJ).iterator();
            while (it7.hasNext()) {
                arrayList3.add(((TextStickerModel) it7.next()).getTextStr());
            }
        } else {
            InlineCaptionModel inlineCaptionModel = videoPublishEditModel.creativeModel.inlineCaptionModel;
            if (inlineCaptionModel != null && inlineCaptionModel.utterances != null) {
                if (inlineCaptionModel != null && (arrayList4 = inlineCaptionModel.utterances) != null) {
                    ArrayList arrayList11 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                    Iterator<StickerItemModel> it8 = arrayList4.iterator();
                    while (it8.hasNext()) {
                        try {
                            textStickerData = (TextStickerData) new Gson().LJIIIIZZ(it8.next().extra, new TypeToken<TextStickerData>() { // from class: X.112E
                            }.getType());
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (textStickerData == null || (textStr = textStickerData.getTextStr()) == null) {
                            textStr = "";
                        }
                        arrayList11.add(textStr);
                    }
                    arrayList3 = new ArrayList();
                    for (Object obj : arrayList11) {
                        if (C123100dR.LIZ((String) obj)) {
                            arrayList3.add(obj);
                        }
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                arrayList3 = null;
            }
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
                imageList = C13BV.INSTANCE;
            }
            ArrayList arrayList12 = new ArrayList();
            for (SingleImageData singleImageData : imageList) {
                if (C123100dR.LIZ(singleImageData.getFilterInfo().getFilterId())) {
                    arrayList12.add(singleImageData);
                }
            }
            arrayListLJ = new ArrayList(C15438062q.LJIJJ(arrayList12, 10));
            Iterator it9 = arrayList12.iterator();
            while (it9.hasNext()) {
                arrayListLJ.add(((SingleImageData) it9.next()).getFilterInfo().getFilterId());
            }
        } else if (C123100dR.LIZ(videoPublishEditModel.getSelectedFilterId())) {
            arrayListLJ = new ArrayList();
            String selectedFilterId = videoPublishEditModel.getSelectedFilterId();
            if (selectedFilterId != null) {
                str = selectedFilterId;
            }
            arrayListLJ.add(str);
        } else if (C123100dR.LIZ(videoPublishEditModel.getCurFilterIds())) {
            String[] strArr = new String[1];
            String curFilterIds = videoPublishEditModel.getCurFilterIds();
            if (curFilterIds != null) {
                str = curFilterIds;
            }
            strArr[0] = str;
            arrayListLJ = C1697810uHb.LJ(strArr);
        }
        return new EditInfo(arrayList5, arrayList, arrayList2, arrayList10, arrayList3, arrayListLJ);
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel, C1462070o9N c1462070o9N) {
        EditInfo editInfoLIZJ = LIZJ(videoPublishEditModel, c1462070o9N);
        LJIIJJI = new C11PQ<>();
        C15O7.LIZJ(new ACallableS432S0100000_29(editInfoLIZJ, 9));
    }

    public static void LIZLLL(String str, int i, EditInfo editInfo) {
        String json;
        LIZIZ = false;
        LIZLLL = editInfo;
        ((ArrayList) LJFF).clear();
        LJI = 0;
        if (!editInfo.hasInfo()) {
            json = "";
        } else {
            json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), editInfo);
        }
        if (str == null && json.length() == 0) {
            C11PQ<SearchRecommendChallengeList> c11pq = LJIIL;
            if (c11pq != null) {
                c11pq.onError(new AnonymousClass1129(1003L, "upload result and editInfo are all null"));
                return;
            }
            return;
        }
        C112D c112d = (C112D) C0CHQ.LIZ().getNetworkService().createDefaultRetrofit(C112D.class);
        if (str == null) {
            str = "";
        }
        LJIIIIZZ = (C11JF) c112d.LIZIZ(str, "publish_page", i, json).LJLJJI(5L, TimeUnit.SECONDS, new C098D() { // from class: X.111K
            @Override // X.C098D
            public final void LIZIZ(InterfaceC626120Oh8<? super SearchRecommendChallengeList> interfaceC626120Oh8) {
                interfaceC626120Oh8.onError(new RuntimeException("time out"));
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.111O
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RecommendHashtagUtils@10e4.realFetchChallenges$2");
                C11PQ<SearchRecommendChallengeList> c11pq2 = C112C.LJIIL;
                if (c11pq2 != null) {
                    c11pq2.onNext(obj);
                }
                C11JF c11jf = C112C.LJIIIIZZ;
                if (c11jf != null && (!c11jf.isDisposed())) {
                    c11jf.dispose();
                }
                C1C7U.LIZIZ("RecommendHashtagUtils@10e4.realFetchChallenges$2");
            }
        }, new C09JN() { // from class: X.111M
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RecommendHashtagUtils@10e4.realFetchChallenges$3");
                Throwable th = (Throwable) obj;
                C11PQ<SearchRecommendChallengeList> c11pq2 = C112C.LJIIL;
                if (c11pq2 != null) {
                    c11pq2.onError(th);
                }
                C11JF c11jf = C112C.LJIIIIZZ;
                if (c11jf != null && (!c11jf.isDisposed())) {
                    c11jf.dispose();
                }
                C1C7U.LIZIZ("RecommendHashtagUtils@10e4.realFetchChallenges$3");
            }
        });
    }

    public static void LJ(String str, int i, EditInfo editInfo) {
        String json;
        LIZIZ = false;
        LIZLLL = editInfo;
        ((ArrayList) LJFF).clear();
        LJI = 0;
        if (!editInfo.hasInfo()) {
            json = "";
        } else {
            json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), editInfo);
        }
        if (str == null && json.length() == 0) {
            C11PQ<RecommendHashtagResponse> c11pq = LJIIJJI;
            if (c11pq != null) {
                c11pq.onError(new AnonymousClass1129(1003L, "upload result and editInfo are all null"));
                return;
            }
            return;
        }
        C112D c112d = (C112D) C0CHQ.LIZ().getNetworkService().createDefaultRetrofit(C112D.class);
        if (str == null) {
            str = "";
        }
        LJIIIIZZ = (C11JF) c112d.LIZ(str, "publish_page", i, json).LJLJJI(5L, TimeUnit.SECONDS, new C098D() { // from class: X.111J
            @Override // X.C098D
            public final void LIZIZ(InterfaceC626120Oh8<? super RecommendHashtagResponse> interfaceC626120Oh8) {
                interfaceC626120Oh8.onError(new RuntimeException("time out"));
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.111N
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RecommendHashtagUtils@10e4.realFetchResult$2");
                C11PQ<RecommendHashtagResponse> c11pq2 = C112C.LJIIJJI;
                if (c11pq2 != null) {
                    c11pq2.onNext(obj);
                }
                C11JF c11jf = C112C.LJIIIIZZ;
                if (c11jf != null && (!c11jf.isDisposed())) {
                    c11jf.dispose();
                }
                C1C7U.LIZIZ("RecommendHashtagUtils@10e4.realFetchResult$2");
            }
        }, new C09JN() { // from class: X.111L
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("RecommendHashtagUtils@10e4.realFetchResult$3");
                Throwable th = (Throwable) obj;
                C11PQ<RecommendHashtagResponse> c11pq2 = C112C.LJIIJJI;
                if (c11pq2 != null) {
                    c11pq2.onError(th);
                }
                C11JF c11jf = C112C.LJIIIIZZ;
                if (c11jf != null && (!c11jf.isDisposed())) {
                    c11jf.dispose();
                }
                C1C7U.LIZIZ("RecommendHashtagUtils@10e4.realFetchResult$3");
            }
        });
    }
}
