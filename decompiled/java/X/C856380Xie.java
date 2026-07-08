package X;

import android.text.Editable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commerce.tools.mission.MissionUser;
import com.ss.android.ugc.aweme.creative.model.HashtagsModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0Xie, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856380Xie {
    public static final C856380Xie LIZ = new C856380Xie();

    public static String LIZ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel) throws Throwable {
        C855530XhH c855530XhH;
        boolean z;
        ArrayList arrayListLIZ;
        Editable editableP;
        ExtraMentionUserModel mentionUserModel;
        List<User> listLIZJ;
        List<String> list;
        List<String> customizedStatement;
        Collection<AVChallenge> collectionInfoStickerChallenges;
        List<AVChallenge> readTextChallenges;
        int i;
        boolean z2;
        C0ZI0 c0zi0 = new C0ZI0(c19eg);
        C857480XkQ c857480XkQLIZ = new C856430Xij(new AwS558S0100000_14(c0zi0, 1301), new C858450Xlz(new C857960XlC(true, C855550XhJ.LIZ()))).LIZ();
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            c855530XhH = new C855520XhG(videoPublishEditModel.creativeModel.transientPostPageModel.LJJIIZ);
        } else {
            c855530XhH = new C855530XhH();
        }
        C857730Xkp c857730Xkp = new C857730Xkp(c19eg, videoPublishEditModel, c855530XhH, c857480XkQLIZ, null);
        final C856860XjQ c856860XjQ = new C856860XjQ(c19eg, c0zi0, videoPublishEditModel);
        c856860XjQ.LJFF = o.LJIIZILJ.getCurrentUserID();
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            IAVPublishService iAVPublishService = C1429320nIY.LIZ;
            c856860XjQ.LJIIIIZZ = new C855520XhG(C1428470nHB.LJJZZI(videoPublishEditModel));
        } else {
            c856860XjQ.LJIIIIZZ = new C855530XhH();
        }
        c0zi0.setConfig(c856860XjQ.LJIIIIZZ);
        c0zi0.addTextChangedListener(new C913990ZtN(new C855040XgU(), 1));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c0zi0.getContext());
        if (numLIZJ != null) {
            c0zi0.setMentionTextColor(numLIZJ.intValue());
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1p, c0zi0.getContext());
        if (numLIZJ2 != null) {
            c0zi0.setPlaceHolderColor(numLIZJ2.intValue());
        }
        if (c856860XjQ.LJ) {
            c0zi0.setFixLengthInFront(c856860XjQ.LIZLLL);
            c0zi0.setChainString(c856860XjQ.LIZLLL);
        }
        c0zi0.setFragmentActivity(c19eg);
        c857730Xkp.LJIIIIZZ("post");
        String chain = videoPublishEditModel.getChain();
        C0CHQ.LIZ().getPublishService().LJIIJJI();
        if (C856610Xj1.LIZ(videoPublishEditModel)) {
            CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
            chain = captionModel.chain;
            z = captionModel.disableDeleteChain;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(chain)) {
            c856860XjQ.LIZLLL = chain;
            c856860XjQ.LJ = z;
        }
        c0zi0.setEmoticonFilter(0);
        c0zi0.addTextChangedListener(new C856950XjZ() { // from class: X.0XjV
            {
                super("FakeTitleModule");
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
            
                r5 = -1;
             */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0130  */
            @Override // X.C856950XjZ, android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void afterTextChanged(android.text.Editable r14) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 330
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C856910XjV.afterTextChanged(android.text.Editable):void");
            }

            @Override // X.C856950XjZ, android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                Character chLJLLJ;
                super.onTextChanged(charSequence, i2, i3, i4);
                int i5 = i2 + i3;
                boolean z3 = true;
                if ((charSequence != null && charSequence.length() == 0) || i5 < 0 || charSequence == null || i5 >= charSequence.length()) {
                    return;
                }
                int i6 = i4 - i3;
                C856860XjQ c856860XjQ2 = c856860XjQ;
                if (charSequence == null || (chLJLLJ = C13LN.LJLLJ(i5, charSequence)) == null || chLJLLJ.charValue() != '\n' || i6 != 1) {
                    z3 = false;
                }
                c856860XjQ2.LJI = z3;
                C856860XjQ c856860XjQ3 = c856860XjQ;
                if (!c856860XjQ3.LJI) {
                    i5 = -1;
                }
                c856860XjQ3.LJII = i5;
            }
        });
        c0zi0.setCreationId(videoPublishEditModel.getCreationId());
        if (videoPublishEditModel.isDuet()) {
            c0zi0.setVideoType(1);
        } else if (videoPublishEditModel.isCommentReply()) {
            c0zi0.setVideoType(3);
        }
        List<AVTextExtraStruct> structList = videoPublishEditModel.getStructList();
        if (structList != null) {
            for (AVTextExtraStruct aVTextExtraStruct : structList) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('#');
                sbLIZ.append(aVTextExtraStruct.hashTagName);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                int length = strLIZIZ.length() - 1;
                int i2 = 0;
                boolean z3 = false;
                while (i2 <= length) {
                    if (!z3) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (Intrinsics.LJI(strLIZIZ.charAt(i), 32) <= 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z3) {
                        if (!z2) {
                            z3 = true;
                        } else {
                            i2++;
                        }
                    } else {
                        if (!z2) {
                            break;
                        }
                        length--;
                    }
                }
                String string = strLIZIZ.subSequence(i2, length + 1).toString();
                if (!C856940XjY.LIZJ(string)) {
                    ((HashSet) c856860XjQ.LIZIZ.LLJLILLLLZIIL).add(string);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        List<AVChallenge> list2 = videoPublishEditModel.challenges;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        TextStickerChallenges textStickerChallenges = videoPublishEditModel.getTextStickerChallenges();
        if (textStickerChallenges != null && (readTextChallenges = textStickerChallenges.getReadTextChallenges()) != null) {
            arrayList.addAll(readTextChallenges);
        }
        ((HashSet) c856860XjQ.LIZIZ.LLJLILLLLZIIL).clear();
        if (Intrinsics.LJFF(videoPublishEditModel.creativeModel.templateSchemaData.schemaTag, "template_schema")) {
            List<String> list3 = videoPublishEditModel.creativeModel.pugcTemplateData.hashtags;
            ArrayList arrayList2 = new ArrayList();
            for (String str : list3) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('#');
                sbLIZ2.append(str);
                if (PatternProtector.compile(C856940XjY.LJ()).matcher(C2188811AlT.LIZIZ(sbLIZ2)).matches()) {
                    arrayList2.add(str);
                }
            }
            if (!arrayList2.isEmpty()) {
                c856860XjQ.LIZIZ(arrayList2);
            }
        }
        c856860XjQ.LIZ(arrayList);
        StickerChallenge stickerChallenge = videoPublishEditModel.getStickerChallenge();
        if (stickerChallenge != null && (collectionInfoStickerChallenges = stickerChallenge.infoStickerChallenges()) != null && (!collectionInfoStickerChallenges.isEmpty())) {
            ArrayList arrayList3 = new ArrayList();
            List<AVChallenge> list4 = videoPublishEditModel.challenges;
            if (list4 != null && !list4.isEmpty()) {
                for (AVChallenge aVChallenge : collectionInfoStickerChallenges) {
                    if (aVChallenge != null && !videoPublishEditModel.challenges.contains(aVChallenge)) {
                        arrayList3.add(aVChallenge);
                    }
                }
            } else {
                arrayList3.addAll(collectionInfoStickerChallenges);
            }
            c856860XjQ.LIZ(arrayList3);
        }
        AVChallenge recordChallenge = videoPublishEditModel.creativeModel.commerceModel.getRecordChallenge();
        if (recordChallenge != null && !videoPublishEditModel.mIsFromDraft) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(recordChallenge);
            c856860XjQ.LIZ(arrayList4);
        }
        List<AVChallenge> recordEffectChallenges = videoPublishEditModel.getRecordEffectChallenges();
        if (!recordEffectChallenges.isEmpty()) {
            c856860XjQ.LIZ(recordEffectChallenges);
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        if (!videoPublishEditModel.mIsFromDraft && aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.challenge != null) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(aVMusicExtractAVMusic.challenge);
            c856860XjQ.LIZ(arrayList5);
        }
        Mission mission = videoPublishEditModel.creativeModel.commerceModel.getMission();
        if (mission != null) {
            List<String> challengeNames = mission.getChallengeNames();
            if (challengeNames != null) {
                c856860XjQ.LIZIZ(challengeNames);
            }
            List<MissionUser> mentionedUsers = mission.getMentionedUsers();
            if (mentionedUsers != null && (!mentionedUsers.isEmpty())) {
                for (MissionUser missionUser : mentionedUsers) {
                    if (mission.isDuet() || (mission.getCustomizedStatement() != null && (customizedStatement = mission.getCustomizedStatement()) != null && (!customizedStatement.isEmpty()))) {
                        c856860XjQ.LIZIZ.LJIIJ(0, missionUser.getNickname(), missionUser.getUid(), missionUser.getSecUid());
                    } else {
                        c856860XjQ.LIZIZ.LJIIIZ(missionUser.getNickname(), missionUser.getUid(), missionUser.getSecUid(), false);
                    }
                }
            }
        }
        c856860XjQ.LIZ(c857730Xkp.LIZ());
        HashtagsModel hashtagsModel = videoPublishEditModel.creativeModel.initialModel.hashtagsModel;
        if (hashtagsModel != null && (list = hashtagsModel.hashtags) != null) {
            c856860XjQ.LIZIZ(list);
        }
        if (videoPublishEditModel.getMentionUserModel() != null && (mentionUserModel = videoPublishEditModel.getMentionUserModel()) != null && (listLIZJ = C574480Mg2.LIZJ(mentionUserModel)) != null && !listLIZJ.isEmpty()) {
            for (User user : listLIZJ) {
                c856860XjQ.LIZIZ.LJIIIZ(user.getNickname(), user.getUid(), user.getSecUid(), false);
            }
        }
        c856860XjQ.LIZIZ.LJJJI(true);
        C0ZI0 c0zi02 = c856860XjQ.LIZIZ;
        if (c0zi02.LLJILJILJ) {
            if (c0zi02.LLJJL) {
                c0zi02.setShouldDisableTrim(false);
            } else {
                c0zi02.setHasUrlTransforming(false);
                if (C2204961BRm.p(c856860XjQ.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhusPOjLgUHfb9+qeo4MxG", null)) != null && (editableP = C2204961BRm.p(c856860XjQ.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhusPOjLgUHfb9+qeo4MxG", null))) != null) {
                    editableP.delete(c856860XjQ.LIZIZ.getUrlStart(), c856860XjQ.LIZIZ.getUrlEnd());
                }
                C0ZI0 c0zi03 = c856860XjQ.LIZIZ;
                c0zi03.setUrlEnd(c0zi03.getUrlStart());
                c856860XjQ.LIZIZ.setTransformingUrlRemoved(true);
            }
        }
        C0ZI0 c0zi04 = c856860XjQ.LIZIZ;
        c0zi04.getClass();
        C0DSM.LIZ(c0zi04);
        String strLJJIJIIJI = c856860XjQ.LIZIZ.LJJIJIIJI(true);
        if (strLJJIJIIJI == null) {
            strLJJIJIIJI = "";
        }
        videoPublishEditModel.setTitle(strLJJIJIIJI);
        List<TextExtraStruct> listLJJIJIL = c856860XjQ.LIZIZ.LJJIJIL(c856860XjQ.LJFF, true);
        if (listLJJIJIL != null && (arrayListLIZ = C19881612qc.LIZ(C19881612qc.LIZLLL(listLJJIJIL, new C858720XmQ()))) != null) {
            videoPublishEditModel.setStructList(new ArrayList(arrayListLIZ));
        }
        c857730Xkp.LJIIJJI(true);
        String title = videoPublishEditModel.getTitle();
        if (title == null) {
            return "";
        }
        return title;
    }
}
