package X;

import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.BottomInputAssemV2;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.additional.AdditionalAreaAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.InputInnerAssem;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.voice.VoiceInputAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.bing.TakoAnswerBingAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.chatreply.TakoAnswerChatReplyAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.feedguide.TakoAnswerFeedEntranceGuideAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.image.TakoAnswerImageAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.imagedisclaimer.TakoAnswerImageDisclaimerAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.languagestyle.TakoLanguageStyleHintAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.loading.TakoAnswerLoadingAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.mix.TakoAnswerMixAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.product.TakoAnswerProductAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.reference.TakoAnswerReferenceAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.retry.TakoAnswerBubbleRetryAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.retry.TakoAnswerRetryAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.shortcut.TakoAnswerShortcutAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.text.TakoAnswerTextAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.text.TakoMultiBubbleAnswerTextAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.user.TakoAnswerUserAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.userlanding.TakoUserLandingStoryAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.userlist.TakoAnswerUserListAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.video.TakoAnswerStrongVideoListAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.video.TakoAnswerVideoListAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.videoenhanced.TakoAnswerVideoEnhancedAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.answer.videogeneration.TakoAnswerVideoGenerationAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.carry.actionbar.hint.TakoCarryActionHintAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.carry.actionbar.introduction.TakoCarryActionIntroductionAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.carry.bot.TakoBotSeeConversationAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.carry.feed.TakoCarryFeedCardAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.carry.search.TakoCarrySearchAnswerCardAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.carry.send.TakoCarriedSendAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.carry.userlanding.TakoUserLandingCardAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.carry.welcome.TakoWelcomeCardAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.disclaimer.AIBotPinnedDisclaimerAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.disclaimer.TakoDisclaimerAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.interceptor.TakoInterceptorAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.memory.TakoMemoryHintAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.novel.choice.TakoNovelChoiceAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.novel.divider.TakoNovelChapterDividerAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.novel.image.TakoNovelImageAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.novel.text.TakoNovelTextAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.p010default.TakoDefaultAnswerAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.p010default.TakoDefaultSendAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.send.imagetext.TakoSendImageTextAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.send.text.TakoSendTextAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.sendvideo.TakoSendVideoAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.sharetotako.ShareVideoToTakoAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.sug.TakoFirstSugTitleAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.sug.TakoSugListCardAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.sug.TakoSugLynxCardAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.time.TakoMsgTimeAssem;
import com.ss.android.ugc.aweme.tako.botpage.components.loading.TakoLoadingAssem;
import com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugAssem;
import com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugListCardAssem;
import com.ss.android.ugc.aweme.tako.nimblecard.NimbleCardAnswerAssem;
import com.ss.android.ugc.aweme.tako.nimblecard.flexnimble.protocol.FlexNimbleCardAnswerAssem;
import com.ss.android.ugc.aweme.tako.otherpage.share.cards.sharetitle.TakoShareTitleAssem;
import com.ss.android.ugc.aweme.tako.ui.TakoContentAssem;
import java.util.List;

/* JADX INFO: renamed from: X.0ySH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858190ySH {
    public static final List<C13IQ<?>> LIZ;

    static {
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        c13dvLIZIZ.add(C13LE.LIZ(TakoMiddlePageSugListCardAssem.class));
        if (((Boolean) C1859107Px.LIZ.getValue()).booleanValue()) {
            c13dvLIZIZ.add(C13LE.LIZ(TakoMiddlePageSugAssem.class));
        }
        c13dvLIZIZ.add(C13LE.LIZ(TakoShareTitleAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoSugListCardAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoLanguageStyleHintAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoBotSeeConversationAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoNovelChapterDividerAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoInterceptorAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoMemoryHintAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(AIBotPinnedDisclaimerAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoMsgTimeAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoCarryActionHintAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoSugLynxCardAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoFirstSugTitleAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoUserLandingCardAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoContentAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(ShareVideoToTakoAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoLoadingAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoDisclaimerAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerImageDisclaimerAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerBingAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerChatReplyAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerFeedEntranceGuideAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerImageAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerLoadingAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerMixAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerProductAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerReferenceAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerBubbleRetryAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerRetryAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerShortcutAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerTextAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoMultiBubbleAnswerTextAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerUserAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoUserLandingStoryAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerUserListAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerStrongVideoListAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerVideoListAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerVideoEnhancedAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoAnswerVideoGenerationAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoCarryActionIntroductionAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoCarryFeedCardAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoCarrySearchAnswerCardAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoCarriedSendAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoWelcomeCardAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoDefaultAnswerAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoDefaultSendAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoNovelChoiceAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoNovelImageAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoNovelTextAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoSendImageTextAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoSendTextAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(TakoSendVideoAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(NimbleCardAnswerAssem.class));
        c13dvLIZIZ.add(C13LE.LIZ(FlexNimbleCardAnswerAssem.class));
        C1858210ySJ.LIZ.getClass();
        if (C1858210ySJ.LIZ()) {
            c13dvLIZIZ.add(C13LE.LIZ(BottomInputAssemV2.class));
            c13dvLIZIZ.add(C13LE.LIZ(AdditionalAreaAssem.class));
            c13dvLIZIZ.add(C13LE.LIZ(InputInnerAssem.class));
            c13dvLIZIZ.add(C13LE.LIZ(VoiceInputAssem.class));
        }
        LIZ = C1697820uHc.LIZ(c13dvLIZIZ);
    }
}
