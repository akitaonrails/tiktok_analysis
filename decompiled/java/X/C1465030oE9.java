package X;

import Y.AComparatorS48S0000000_29;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.stickers.AddYoursStickerExtras;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.StickerContainerService;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.chatroom.DMGroupChatStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.donation.DonationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.emojislider.EmojiSliderStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.interactiveemoji.InteractiveEmojiStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkAnchorModel;
import com.ss.android.ugc.aweme.tools.sticker.core.link.LinkStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.live.LiveCountDownStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.LiveEventStoryStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.LiveShareStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.location.LocationStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.poll.PollStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesResponseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.secretreplies.SecretRepliesStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.hashtag.HashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.sharedcomment.SharedCommentStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.socialavatar.SocialAvatarStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.InteractAreaModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextHashtagModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMentionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS272S0000000_29;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import nv7.c0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oE9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465030oE9 {
    public static final C1465030oE9 LIZ = new C1465030oE9();

    public static List LJ(VideoPublishEditModel videoPublishEditModel) {
        C0CHQ.LIZ().getPublishService().LJJJLL();
        List<CreateAnchorInfo> listLJI = C1431870nMf.LJI(videoPublishEditModel);
        ArrayList arrayList = new ArrayList();
        for (CreateAnchorInfo createAnchorInfo : listLJI) {
            if (createAnchorInfo.getType() == EnumC1430380nKG.DONATION_STICKER.getTYPE()) {
                arrayList.add(createAnchorInfo);
            }
        }
        return arrayList;
    }

    public static List LJFF(StickerNewEngineModel stickerNewEngineModel) {
        if (!C0FWJ.LIZ()) {
            return C13BV.INSTANCE;
        }
        List<DonationStickerModel> list = stickerNewEngineModel.donationStickers;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<DonationStickerModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getInteractStickerStruct());
        }
        return C123P.LJ(arrayList);
    }

    public static C1866270yfJ LJI(VideoPublishEditModel videoPublishEditModel) {
        return new C1866270yfJ(null, null, new AwS566S0100000_22(videoPublishEditModel, 817), new AwS566S0100000_22(videoPublishEditModel, 818), new AwS566S0100000_22(videoPublishEditModel, 819), C300240Bpm.LIZ(), 3);
    }

    public static void LIZ(List list, VideoPublishEditModel videoPublishEditModel) {
        Unit unit;
        List<SingleImageData> imageList;
        ImageStickerInfoNewEngine stickerInfoNewEngine;
        List<StickerModel> allStickers;
        ImageStickerInfoNewEngine stickerInfoNewEngine2;
        List<StickerModel> allStickers2;
        for (AddYoursStickerModel addYoursStickerModel : videoPublishEditModel.creativeModel.stickerModel.addYoursStickerModels) {
            FrameLayout.LayoutParams layoutParamsLJ = c0.LIZ.LJ(9, 16);
            InteractStickerStruct interactStickerStruct = C390140FRk.LIZ(addYoursStickerModel, layoutParamsLJ.width, layoutParamsLJ.height).getInteractStickerStruct();
            AddYoursStickerStruct addYoursStickerStruct = interactStickerStruct.getAddYoursStickerStruct();
            if (addYoursStickerStruct != null) {
                List<AddYoursStickerExtras> list2 = videoPublishEditModel.creativeModel.stickerModel.addYoursStickerExtras;
                if (!list2.isEmpty()) {
                    addYoursStickerStruct.setFromItemId(((AddYoursStickerExtras) ListProtector.get(list2, 0)).getFromItemId());
                    addYoursStickerStruct.setFromQuestion(Boolean.valueOf(((AddYoursStickerExtras) ListProtector.get(list2, 0)).isFromQA()));
                }
            }
            if (C573130Mdr.LIZ() && C1428470nHB.LJJZZI(videoPublishEditModel) && C1428470nHB.LIZIZ(videoPublishEditModel)) {
                interactStickerStruct.setNoGlobal(true);
            }
            interactStickerStruct.setAddYoursStickerStruct(addYoursStickerStruct);
            list.add(interactStickerStruct);
        }
        List<CommentStickerModel> list3 = videoPublishEditModel.creativeModel.stickerModel.commentStickerModels;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator<CommentStickerModel> it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getInteractStickerStruct());
        }
        list.addAll(arrayList);
        List<TextStickerModel> list4 = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list4, 10));
        Iterator<TextStickerModel> it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().getInteractStickerStruct());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            InteractStickerStruct interactStickerStruct2 = (InteractStickerStruct) obj;
            if (!((Boolean) C0AED.LIZ.getValue()).booleanValue() || interactStickerStruct2.getType() != 20) {
                arrayList3.add(obj);
            }
        }
        list.addAll(arrayList3);
        Iterator<LocationStickerModel> it4 = videoPublishEditModel.creativeModel.stickerModel.locationStickerModels.iterator();
        while (true) {
            unit = null;
            if (!it4.hasNext()) {
                break;
            }
            LocationStickerModel next = it4.next();
            list.add(next.getInteractStickerStruct());
            next.setPoiData(null);
        }
        List<PollStickerModel> list5 = videoPublishEditModel.creativeModel.stickerModel.pollStickers;
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list5, 10));
        Iterator<PollStickerModel> it5 = list5.iterator();
        while (it5.hasNext()) {
            arrayList4.add(it5.next().getInteractStickerStruct());
        }
        list.addAll(arrayList4);
        list.addAll(C0FMY.LIZ(videoPublishEditModel.creativeModel.stickerModel.textStickerModels));
        List<TextStickerModel> list6 = videoPublishEditModel.creativeModel.stickerModel.textStickerModels;
        ArrayList arrayList5 = new ArrayList();
        for (TextStickerModel textStickerModel : list6) {
            List<TextHashtagModel> hashtagList = textStickerModel.getHashtagList();
            if (hashtagList != null) {
                for (TextHashtagModel textHashtagModel : hashtagList) {
                    textHashtagModel.setBaseSticker(textStickerModel.getBaseStickerModel());
                    arrayList5.add(textHashtagModel.getInteractStickerStruct());
                }
            }
        }
        list.addAll(arrayList5);
        List<InteractAreaModel> list7 = videoPublishEditModel.creativeModel.stickerModel.interactStickerStructs;
        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(list7, 10));
        Iterator<InteractAreaModel> it6 = list7.iterator();
        while (it6.hasNext()) {
            arrayList6.add(it6.next().generateInteractStruct());
        }
        list.addAll(arrayList6);
        List<DonationStickerModel> list8 = videoPublishEditModel.creativeModel.stickerModel.donationStickers;
        ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(list8, 10));
        Iterator<DonationStickerModel> it7 = list8.iterator();
        while (it7.hasNext()) {
            arrayList7.add(it7.next().getInteractStickerStruct());
        }
        list.addAll(arrayList7);
        if (C1428520nHG.LJJIIZI(videoPublishEditModel) || C1429880nJS.LIZ(videoPublishEditModel)) {
            List<MusicStickerModel> list9 = videoPublishEditModel.creativeModel.stickerModel.musicStickerModels;
            ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(list9, 10));
            Iterator<MusicStickerModel> it8 = list9.iterator();
            while (it8.hasNext()) {
                arrayList8.add(it8.next().getInteractStickerStruct());
            }
            list.addAll(arrayList8);
        }
        List<LiveCountDownStickerModel> list10 = videoPublishEditModel.creativeModel.stickerModel.liveCountDownStickerModel;
        ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(list10, 10));
        Iterator<LiveCountDownStickerModel> it9 = list10.iterator();
        while (it9.hasNext()) {
            arrayList9.add(it9.next().getInteractStickerStruct());
        }
        list.addAll(arrayList9);
        List<LiveEventCountDownStickerModel> list11 = videoPublishEditModel.creativeModel.stickerModel.liveEventCountDownStickerModel;
        ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(list11, 10));
        Iterator<LiveEventCountDownStickerModel> it10 = list11.iterator();
        while (it10.hasNext()) {
            arrayList10.add(it10.next().getInteractStickerStruct());
        }
        list.addAll(arrayList10);
        Iterator<InteractiveEmojiStickerModel> it11 = videoPublishEditModel.creativeModel.stickerModel.interactiveEmojiStickerModels.iterator();
        while (it11.hasNext()) {
            list.add(it11.next().getInteractStickerStruct());
        }
        List<EmojiSliderStickerModel> list12 = videoPublishEditModel.creativeModel.stickerModel.emojiSliderStickerModels;
        ArrayList arrayList11 = new ArrayList(C15438062q.LJIJJ(list12, 10));
        Iterator<EmojiSliderStickerModel> it12 = list12.iterator();
        while (it12.hasNext()) {
            arrayList11.add(it12.next().getInteractStickerStruct());
        }
        list.addAll(arrayList11);
        List<LinkStickerModel> list13 = videoPublishEditModel.creativeModel.stickerModel.linkStickerModels;
        ArrayList arrayList12 = new ArrayList(C15438062q.LJIJJ(list13, 10));
        Iterator<LinkStickerModel> it13 = list13.iterator();
        while (it13.hasNext()) {
            arrayList12.add(it13.next().getInteractStickerStruct());
        }
        list.addAll(arrayList12);
        List<LinkAnchorModel> list14 = videoPublishEditModel.creativeModel.stickerModel.linkStoryAnchorModels;
        ArrayList arrayList13 = new ArrayList(C15438062q.LJIJJ(list14, 10));
        Iterator<LinkAnchorModel> it14 = list14.iterator();
        while (it14.hasNext()) {
            arrayList13.add(it14.next().getInteractStickerStruct());
        }
        list.addAll(arrayList13);
        List<MentionStickerModel> list15 = videoPublishEditModel.creativeModel.stickerModel.mentionStickerModel;
        ArrayList arrayList14 = new ArrayList(C15438062q.LJIJJ(list15, 10));
        Iterator<MentionStickerModel> it15 = list15.iterator();
        while (it15.hasNext()) {
            arrayList14.add(it15.next().getInteractStickerStruct());
        }
        list.addAll(arrayList14);
        List<HashTagStickerModel> list16 = videoPublishEditModel.creativeModel.stickerModel.hashtagStickerModel;
        ArrayList arrayList15 = new ArrayList(C15438062q.LJIJJ(list16, 10));
        Iterator<HashTagStickerModel> it16 = list16.iterator();
        while (it16.hasNext()) {
            arrayList15.add(it16.next().getInteractStickerStruct());
        }
        list.addAll(arrayList15);
        List<LiveShareStickerModel> list17 = videoPublishEditModel.creativeModel.stickerModel.liveShareStickerModels;
        ArrayList arrayList16 = new ArrayList(C15438062q.LJIJJ(list17, 10));
        Iterator<LiveShareStickerModel> it17 = list17.iterator();
        while (it17.hasNext()) {
            arrayList16.add(it17.next().getInteractStickerStruct());
        }
        list.addAll(arrayList16);
        List<SecretRepliesStickerModel> list18 = videoPublishEditModel.creativeModel.stickerModel.secretRepliesStickerModel;
        ArrayList arrayList17 = new ArrayList(C15438062q.LJIJJ(list18, 10));
        Iterator<SecretRepliesStickerModel> it18 = list18.iterator();
        while (it18.hasNext()) {
            arrayList17.add(it18.next().getInteractStickerStruct());
        }
        list.addAll(arrayList17);
        List<SecretRepliesResponseStickerModel> list19 = videoPublishEditModel.creativeModel.stickerModel.secretRepliesResponseStickerModel;
        ArrayList arrayList18 = new ArrayList(C15438062q.LJIJJ(list19, 10));
        Iterator<SecretRepliesResponseStickerModel> it19 = list19.iterator();
        while (it19.hasNext()) {
            arrayList18.add(it19.next().getInteractStickerStruct());
        }
        list.addAll(arrayList18);
        List<SocialAvatarStickerModel> list20 = videoPublishEditModel.creativeModel.stickerModel.socialAvatarStickerModels;
        ArrayList arrayList19 = new ArrayList(C15438062q.LJIJJ(list20, 10));
        Iterator<SocialAvatarStickerModel> it20 = list20.iterator();
        while (it20.hasNext()) {
            arrayList19.add(it20.next().getInteractStickerStruct());
        }
        list.addAll(arrayList19);
        List<SharedCommentStickerModel> list21 = videoPublishEditModel.creativeModel.stickerModel.sharedCommentStickerModels;
        ArrayList arrayList20 = new ArrayList(C15438062q.LJIJJ(list21, 10));
        Iterator<SharedCommentStickerModel> it21 = list21.iterator();
        while (it21.hasNext()) {
            arrayList20.add(it21.next().getInteractStickerStruct());
        }
        list.addAll(arrayList20);
        List<LiveEventStoryStickerModel> list22 = videoPublishEditModel.creativeModel.stickerModel.liveEventStoryStickerModel;
        ArrayList arrayList21 = new ArrayList(C15438062q.LJIJJ(list22, 10));
        Iterator<LiveEventStoryStickerModel> it22 = list22.iterator();
        while (it22.hasNext()) {
            arrayList21.add(it22.next().getInteractStickerStruct());
        }
        list.addAll(arrayList21);
        List<DMGroupChatStickerModel> list23 = videoPublishEditModel.creativeModel.stickerModel.dmGroupChatStickerModel;
        ArrayList arrayList22 = new ArrayList(C15438062q.LJIJJ(list23, 10));
        Iterator<DMGroupChatStickerModel> it23 = list23.iterator();
        while (it23.hasNext()) {
            arrayList22.add(it23.next().getInteractStickerStruct());
        }
        list.addAll(arrayList22);
        ArrayList arrayList23 = new ArrayList();
        List<ArticleStickerModel> list24 = videoPublishEditModel.creativeModel.stickerModel.articleStickers;
        ArrayList arrayList24 = new ArrayList(C15438062q.LJIJJ(list24, 10));
        Iterator<ArticleStickerModel> it24 = list24.iterator();
        while (it24.hasNext()) {
            arrayList24.add(it24.next().getInteractStickerStruct());
        }
        arrayList23.addAll(arrayList24);
        C1429840nJO c1429840nJO = C1429840nJO.LIZ;
        int type = EnumC1466150oFx.ARTICLE.getType();
        c1429840nJO.getClass();
        ArrayList arrayList25 = new ArrayList();
        try {
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData != null && (stickerInfoNewEngine2 = imageAlbumData.getStickerInfoNewEngine()) != null && (allStickers2 = stickerInfoNewEngine2.getAllStickers()) != null) {
                ArrayList arrayList26 = new ArrayList(C15438062q.LJIJJ(allStickers2, 10));
                Iterator<StickerModel> it25 = allStickers2.iterator();
                while (it25.hasNext()) {
                    arrayList26.add(it25.next().getInteractStickerStruct());
                }
                ArrayList arrayList27 = new ArrayList();
                for (Object obj2 : arrayList26) {
                    if (((InteractStickerStruct) obj2).getType() == type) {
                        arrayList27.add(obj2);
                    }
                }
                arrayList25.addAll(arrayList27);
            }
            ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null) {
                int i = 0;
                for (SingleImageData singleImageData : imageList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        SingleImageData singleImageData2 = singleImageData;
                        if (singleImageData2 != null && (stickerInfoNewEngine = singleImageData2.getStickerInfoNewEngine()) != null && (allStickers = stickerInfoNewEngine.getAllStickers()) != null) {
                            ArrayList arrayList28 = new ArrayList(C15438062q.LJIJJ(allStickers, 10));
                            Iterator<StickerModel> it26 = allStickers.iterator();
                            while (it26.hasNext()) {
                                InteractStickerStruct interactStickerStruct3 = it26.next().getInteractStickerStruct();
                                interactStickerStruct3.setMaterialIndex(i);
                                arrayList28.add(interactStickerStruct3);
                            }
                            ArrayList arrayList29 = new ArrayList();
                            for (Object obj3 : arrayList28) {
                                if (((InteractStickerStruct) obj3).getType() == type) {
                                    arrayList29.add(obj3);
                                }
                            }
                            arrayList25.addAll(arrayList29);
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        arrayList23.addAll(arrayList25);
        list.addAll(C13LP.LL(arrayList23, 1));
    }

    public static void LIZIZ(JSONArray jSONArray, StickerNewEngineModel stickerNewEngineModel) {
        String commentMsg;
        String strLIZIZ;
        String userName;
        String commentMsg2;
        AddYoursStickerModel addYoursStickerModel = (AddYoursStickerModel) C13LP.LJJJLZIJ(0, stickerNewEngineModel.addYoursStickerModels);
        if (addYoursStickerModel != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(addYoursStickerModel.getTopicText());
            LIZJ(jSONArray, 19, arrayList);
        }
        PollStickerModel pollStickerModel = (PollStickerModel) C13LP.LJJJLZIJ(0, stickerNewEngineModel.pollStickers);
        if (pollStickerModel != null) {
            try {
                jSONArray.put(new JSONObject().put("type", 3).put("data", new JSONObject(GsonProtectorUtils.toJson(o.LJIJ.getRetrofitFactoryGson(), C1429860nJQ.LIZ(pollStickerModel.getInteractStickerStruct().getPollStruct())))));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        List<TextStickerModel> list = stickerNewEngineModel.textStickerModels;
        ArrayList arrayList2 = new ArrayList();
        Iterator<TextStickerModel> it2 = list.iterator();
        while (it2.hasNext()) {
            List<TextMentionModel> mentionList = it2.next().getMentionList();
            if (mentionList != null) {
                Iterator<TextMentionModel> it3 = mentionList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(it3.next().getUsername());
                }
            }
        }
        if (!(!arrayList2.isEmpty())) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            LIZJ(jSONArray, 16, arrayList2);
        }
        CommentStickerModel commentStickerModel = (CommentStickerModel) C13LP.LJJJLZIJ(0, stickerNewEngineModel.commentStickerModels);
        if (commentStickerModel != null) {
            ArrayList arrayList3 = new ArrayList();
            CommentVideoModel commentStickerModel2 = commentStickerModel.getCommentStickerModel();
            if (commentStickerModel2 != null && (commentMsg2 = commentStickerModel2.getCommentMsg()) != null) {
                arrayList3.add(commentMsg2);
                LIZJ(jSONArray, 8, arrayList3);
            }
        }
        Iterator<LiveCountDownStickerModel> it4 = stickerNewEngineModel.liveCountDownStickerModel.iterator();
        while (it4.hasNext()) {
            String title = it4.next().getTitle();
            if (title != null) {
                LIZJ(jSONArray, 12, C1697810uHb.LJ(title));
            }
        }
        for (MentionStickerModel mentionStickerModel : stickerNewEngineModel.mentionStickerModel) {
            if (mentionStickerModel.getUser() != null) {
                String[] strArr = new String[1];
                boolean useNickName = mentionStickerModel.getUseNickName();
                User user = mentionStickerModel.getUser();
                if (useNickName) {
                    strLIZIZ = C19630911rH.LIZ(user);
                } else {
                    strLIZIZ = C19630911rH.LIZIZ(user);
                }
                strArr[0] = strLIZIZ;
                LIZJ(jSONArray, 16, C1697810uHb.LJ(strArr));
            } else {
                String[] strArr2 = new String[1];
                if (mentionStickerModel.getUseNickName()) {
                    userName = mentionStickerModel.getNickname();
                } else {
                    userName = mentionStickerModel.getUserName();
                }
                strArr2[0] = userName;
                LIZJ(jSONArray, 16, C1697810uHb.LJ(strArr2));
            }
        }
        Iterator<HashTagStickerModel> it5 = stickerNewEngineModel.hashtagStickerModel.iterator();
        while (it5.hasNext()) {
            String hashtagName = it5.next().getHashtagName();
            if (hashtagName != null) {
                LIZJ(jSONArray, 17, C1697810uHb.LJ(hashtagName));
            }
        }
        Iterator<EmojiSliderStickerModel> it6 = stickerNewEngineModel.emojiSliderStickerModels.iterator();
        while (it6.hasNext()) {
            String questionText = it6.next().getQuestionText();
            if (questionText != null) {
                LIZJ(jSONArray, 21, C1697810uHb.LJ(questionText));
            }
        }
        Iterator<LinkStickerModel> it7 = stickerNewEngineModel.linkStickerModels.iterator();
        while (it7.hasNext()) {
            LIZJ(jSONArray, 22, C1697810uHb.LJ(it7.next().getDisplayText()));
        }
        Iterator<SecretRepliesStickerModel> it8 = stickerNewEngineModel.secretRepliesStickerModel.iterator();
        while (it8.hasNext()) {
            String questionText2 = it8.next().getQuestionText();
            if (questionText2 != null) {
                LIZJ(jSONArray, 23, C1697810uHb.LJ(questionText2));
            }
        }
        Iterator<SecretRepliesResponseStickerModel> it9 = stickerNewEngineModel.secretRepliesResponseStickerModel.iterator();
        while (it9.hasNext()) {
            String responseText = it9.next().getResponseText();
            if (responseText != null) {
                LIZJ(jSONArray, 23, C1697810uHb.LJ(responseText));
            }
        }
        Iterator<SharedCommentStickerModel> it10 = stickerNewEngineModel.sharedCommentStickerModels.iterator();
        while (it10.hasNext()) {
            String[] strArr3 = new String[1];
            CommentVideoModel commentModel = it10.next().getCommentModel();
            if (commentModel != null) {
                commentMsg = commentModel.getCommentMsg();
            } else {
                commentMsg = null;
            }
            strArr3[0] = commentMsg;
            LIZJ(jSONArray, 24, strArr3);
        }
    }

    public static final void LIZJ(JSONArray jSONArray, int i, Object obj) {
        try {
            jSONArray.put(new JSONObject().put("type", i).put("data", new JSONArray(GsonProtectorUtils.toJson(o.LJIJ.getRetrofitFactoryGson(), obj))));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(final float f, final ViewStub viewStub, final FrameLayout.LayoutParams layoutParams, final FrameLayout frameLayout, final C19EG c19eg, final LifecycleOwner lifecycleOwner, final VideoPublishEditModel videoPublishEditModel, final String str, final Function0 function0, final Function0 function02, final Function1 function1) {
        if (!C1466090oFr.LJIIL(videoPublishEditModel.creativeModel.stickerModel)) {
            return;
        }
        new SafeHandler(lifecycleOwner).post(new Runnable() { // from class: X.11rB
            public final void LIZ() {
                C1465030oE9 c1465030oE9 = C1465030oE9.LIZ;
                ViewStub viewStub2 = viewStub;
                FrameLayout frameLayout2 = frameLayout;
                c1465030oE9.getClass();
                if (viewStub2 != null) {
                    viewStub2.setLayoutResource(R.layout.fac);
                    frameLayout2 = (FrameLayout) C786410Ut5.LJLLLL(viewStub2);
                    if (frameLayout2 == null) {
                        return;
                    }
                } else if (frameLayout2 == null) {
                    return;
                } else {
                    C786410Ut5.LJZ(0, frameLayout2);
                }
                FrameLayout.LayoutParams layoutParams2 = layoutParams;
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                FrameLayout.LayoutParams layoutParams4 = layoutParams;
                layoutParams3.topMargin = layoutParams4.topMargin;
                layoutParams3.leftMargin = layoutParams4.leftMargin;
                layoutParams3.rightMargin = layoutParams4.rightMargin;
                layoutParams3.bottomMargin = layoutParams4.bottomMargin;
                layoutParams3.setMarginStart(layoutParams4.getMarginStart());
                C19607711nX c19607711nXLJIJI = StickerContainerService.LIZ().LJIJI();
                C786410Ut5.a6(frameLayout2, layoutParams3);
                EnumC19589411ka enumC19589411ka = EnumC19589411ka.PREVIEW;
                FrameLayout.LayoutParams layoutParams5 = layoutParams;
                C19592311l3 c19592311l3 = new C19592311l3(layoutParams5.width, layoutParams5.height, f);
                C1866270yfJ c1866270yfJ = new C1866270yfJ(null, null, new AwS573S0100000_29(videoPublishEditModel, 786), new AwS573S0100000_29(videoPublishEditModel, 787), new AwS573S0100000_29(videoPublishEditModel, 788), C300240Bpm.LIZ(), 3);
                C19EG c19eg2 = c19eg;
                c19607711nXLJIJI.LIZJ(new C19591211ks(enumC19589411ka, frameLayout2, c19592311l3, c19eg2, c1866270yfJ, null, function0, function02, new AwS272S0000000_29(c19eg2, 0), new AwS272S0000000_29(c19eg, 1), false, lifecycleOwner, null, null, 13344));
                List listLJLLLL = C13LP.LJLLLL(new AComparatorS48S0000000_29(2), C1466090oFr.LJFF(videoPublishEditModel.creativeModel.stickerModel));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJLLLL) {
                    StickerModel stickerModel = (StickerModel) obj;
                    if (!(stickerModel instanceof TextStickerModel) || !((TextStickerModel) stickerModel).isVERenderSticker()) {
                        arrayList.add(obj);
                    }
                }
                if (((Number) C1402790mbl.LIZ.getValue()).intValue() != 0 && Intrinsics.LJFF(str, "video_post_page_preview_page")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((StickerModel) obj2).getStickerType() != EnumC1466150oFx.ADD_YOURS) {
                            arrayList2.add(obj2);
                        }
                    }
                    arrayList = arrayList2;
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((StickerModel) it2.next()).getInteractStickerStruct());
                }
                c19607711nXLJIJI.LIZLLL(arrayList3, arrayList, null, null);
                Function1<View, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(frameLayout2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NewEnginePublishKtBridge@78c0.buildSticker$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NewEnginePublishKtBridge@78c0.buildSticker$1");
            }
        });
    }
}
