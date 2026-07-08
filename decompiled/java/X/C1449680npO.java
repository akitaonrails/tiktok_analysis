package X;

import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StoryAnniversaryStickerModel;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerMobParam;
import com.ss.android.ugc.aweme.creative.model.story.stickercreate.StorySocialEventStickerModel;
import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventPrepareData;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryCardUISlot;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0npO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1449680npO extends C2217421BqW implements Function1<StorySocialEventPrepareData, Unit> {
    public C1449680npO(StoryFriendAnniversaryCardUISlot storyFriendAnniversaryCardUISlot) {
        super(1, storyFriendAnniversaryCardUISlot, StoryFriendAnniversaryCardUISlot.class, "modifyPrepareDataFuc", "modifyPrepareDataFuc(Lcom/ss/android/ugc/aweme/social/sticker/model/StorySocialEventPrepareData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(StorySocialEventPrepareData storySocialEventPrepareData) {
        String str;
        String str2;
        StorySocialEventStickerData storySocialEventStickerDataLJ;
        StorySocialEventPrepareData storySocialEventPrepareData2 = storySocialEventPrepareData;
        StoryFriendAnniversaryCardUISlot storyFriendAnniversaryCardUISlot = (StoryFriendAnniversaryCardUISlot) this.receiver;
        storyFriendAnniversaryCardUISlot.getClass();
        StorySocialEventStickerModel enterEditParam = storySocialEventPrepareData2.getEnterEditParam();
        RelationshipCelebrationTarget relationshipCelebrationTarget = storyFriendAnniversaryCardUISlot.LLLF;
        if (relationshipCelebrationTarget != null) {
            str = relationshipCelebrationTarget.celebratingUserId;
        } else {
            str = null;
        }
        enterEditParam.setFriendAnniversaryModel(new StoryAnniversaryStickerModel(str));
        RelationshipCelebrationTarget relationshipCelebrationTarget2 = storyFriendAnniversaryCardUISlot.LLLF;
        if (relationshipCelebrationTarget2 != null && (str2 = relationshipCelebrationTarget2.celebratingUserId) != null) {
            StoryFriendAnniversaryService storyFriendAnniversaryServiceOp = storyFriendAnniversaryCardUISlot.op();
            if (storyFriendAnniversaryServiceOp != null && storyFriendAnniversaryServiceOp.LIZ(C461720I8s.LIZIZ()) != null && (storySocialEventStickerDataLJ = C902380Zae.LJ(str2)) != null) {
                storySocialEventPrepareData2.setStickerData(storySocialEventStickerDataLJ);
            }
            StorySocialEventStickerMobParam mobData = storySocialEventPrepareData2.getEnterEditParam().getMobData();
            mobData.setShootWay("anniversary_to_story");
            mobData.setEnterFrom("chat");
            mobData.setEnterMethod("chat_anniversary_prompt");
            storySocialEventPrepareData2.getEnterEditParam().getCommonStickerData().setHeight(1920);
            storySocialEventPrepareData2.getEnterEditParam().getCommonStickerData().setWidth(1080);
        }
        return Unit.LIZ;
    }
}
