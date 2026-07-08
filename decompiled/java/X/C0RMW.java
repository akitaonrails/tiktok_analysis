package X;

import Y.AfS32S1000000_2;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.collection.sub.component.BasePostViewCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.api.StoryApi;
import com.ss.android.ugc.aweme.story.experiment.feed.StoryAvatarRingVerifyConfig;
import com.ss.android.ugc.aweme.story.feed.avatar.component.panel.FeedAvatarRingVerifyPanelComponent;
import com.ss.android.ugc.aweme.story.feed.common.collection.StoryPlayerListViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryLocalDeleteAbility;
import com.ss.android.ugc.aweme.story.feed.common.collection.component.FeedCollectionProgressBarComponent;
import com.ss.android.ugc.aweme.story.feed.common.collection.component.StoryUploadProgressComponent;
import com.ss.android.ugc.aweme.story.feed.common.sub.ability.PlayEnterBehaviorAbility;
import com.ss.android.ugc.aweme.story.feed.common.sub.note.StoryNoteViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.LiveShareStoryViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.sub.photo.StoryPhotoViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.sub.video.StoryFeedUploadingViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.sub.video.StoryGuideUploadCardVH;
import com.ss.android.ugc.aweme.story.feed.common.sub.video.StoryInvisibleVideoViewHolder;
import com.ss.android.ugc.aweme.story.feed.common.sub.video.StoryVideoViewHolder;
import com.ss.android.ugc.aweme.story.feed.guidecard.BaseStoryGuideCardVH;
import com.ss.android.ugc.aweme.story.feed.guidecard.StoryGuideCardPhotoVH;
import com.ss.android.ugc.aweme.story.feed.guidecard.StoryGuideCardThoughtVH;
import com.ss.android.ugc.aweme.story.feed.guidecard.StoryGuideCardVideoVH;
import com.ss.android.ugc.aweme.story.feed.guidecard.StoryRevealPromoCardVH;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.panel.StoryGuideCardFilterPanelComponentA2;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.panel.StoryGuideCardPreLoadPanelComponent;
import com.ss.android.ugc.aweme.story.feed.guidecard.filter.GuideCardFilterVM;
import com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.addtostorybutton.trigger.AddToStoryButtonFeedTrigger;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.viewholer.StoryImmersiveCollectionVH;
import com.ss.android.ugc.aweme.story.feed.immersive.panel.viewholer.StoryImmersiveUserFeedVH;
import com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryToPostShareVM;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0RMW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RMW implements InterfaceC706770Rnv {
    public static final C0RMW LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C0RMW.class, "vm", "<v#0>", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217401BqU};
        LIZ = new C0RMW();
    }

    @Override // X.InterfaceC706770Rnv
    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> LJIIZILJ() {
        return C13LE.LIZ(StoryUploadProgressComponent.class);
    }

    @Override // X.InterfaceC706770Rnv
    public final boolean LJIJ(int i) {
        return R.id.dyj != i;
    }

    @Override // X.InterfaceC706770Rnv
    public final String LJIJJLI() {
        return "story_card";
    }

    @Override // X.InterfaceC706770Rnv
    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> LJJ() {
        return C13LE.LIZ(FeedCollectionProgressBarComponent.class);
    }

    @Override // X.InterfaceC706770Rnv
    public final PriorityProtocol LJIJJ() {
        return new AddToStoryButtonFeedTrigger();
    }

    @Override // X.InterfaceC706770Rnv
    public final C0RMZ LJIL() {
        return new C0RMZ(C694590RMj.LIZ, C694590RMj.LIZIZ);
    }

    @Override // X.InterfaceC706770Rnv
    public final C13IQ<? extends AbstractC738140SxQ> LJJIII() {
        if (((StoryAvatarRingVerifyConfig) C310670CFt.LIZIZ.getValue()).enable) {
            return C13LE.LIZ(FeedAvatarRingVerifyPanelComponent.class);
        }
        return null;
    }

    @Override // X.InterfaceC706770Rnv
    public final int LJIILL() {
        Object c098200Yq;
        if (!C281310B0v.LIZ()) {
            return 0;
        }
        Keva keva = C287210BNn.LIZLLL;
        if (System.currentTimeMillis() - keva.getLong("key_dislike_time_stamp", 0L) < ((Number) C287210BNn.LIZJ.getValue()).intValue() * 24 * 60 * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
            return 0;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = keva.getString("key_visit_card", "");
        List listLJJLIIIJILLIZJL = (string == null || string.length() == 0) ? C13BV.INSTANCE : a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6);
        if (listLJJLIIIJILLIZJL.isEmpty()) {
            return ((Number) C287210BNn.LIZ.getValue()).intValue();
        }
        int i = 0;
        int i2 = 0;
        for (Object obj : listLJJLIIIJILLIZJL) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            String str = (String) obj;
            try {
                c098200Yq = Long.valueOf(CastLongProtector.parseLong(str));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = 0L;
            }
            long jLongValue = ((Number) c098200Yq).longValue();
            if (str.length() > 0 && jCurrentTimeMillis - jLongValue < 86400000) {
                i++;
            }
            i2 = i3;
        }
        int iIntValue = ((Number) C287210BNn.LIZ.getValue()).intValue() - i;
        if (iIntValue >= 0) {
            return iIntValue;
        }
        return 0;
    }

    @Override // X.InterfaceC706770Rnv
    public final List<C13IQ<? extends AbstractC738140SxQ>> LJJIFFI() {
        if (!C281310B0v.LIZ()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(C13LE.LIZ(StoryGuideCardPreLoadPanelComponent.class));
        arrayList.add(C13LE.LIZ(StoryGuideCardFilterPanelComponentA2.class));
        return arrayList;
    }

    public static boolean LJJIIZI(C2189821An6 c2189821An6) {
        if (Intrinsics.LJFF(c2189821An6.getFrom(), "STORY_ENTRANCE_FRIENDS_TOP_LIST") || Intrinsics.LJFF(c2189821An6.getFrom(), "STORY_ENTRANCE_FYP_TOP_LIST") || Intrinsics.LJFF(c2189821An6.getFrom(), "STORY_ENTRANCE_INBOX_TOP_LIST") || Intrinsics.LJFF(c2189821An6.getFrom(), "STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST_NEW") || (Intrinsics.LJFF(c2189821An6.getFrom(), "STORY_ENTRANCE_ARCHIVE") && C1189504l3.LIZ())) {
            return true;
        }
        return false;
    }

    public static boolean LJJIJ(C0RF0 c0rf0) {
        if (c0rf0 != null && c0rf0.LJIILJJIL == 15) {
            return true;
        }
        return false;
    }

    public static boolean LJJIJIIJI(C2189821An6 c2189821An6) {
        if (Intrinsics.LJFF(c2189821An6.getFrom(), "STORY_ENTRANCE_AVATAR")) {
            return true;
        }
        if (!Intrinsics.LJFF(c2189821An6.getEventType(), "homepage_follow") && !Intrinsics.LJFF(c2189821An6.getEventType(), "homepage_hot") && !Intrinsics.LJFF(c2189821An6.getEventType(), "homepage_nearby") && !Intrinsics.LJFF(c2189821An6.getEventType(), "homepage_friends")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC706770Rnv
    public final void LIZ(Aweme aweme) {
        String aid;
        UserStory userStory;
        UserStoryCurrentInfo currentInfo;
        Integer num;
        Aweme aweme2;
        Story story;
        if (!C729510SjV.LJJIIZ(aweme)) {
            return;
        }
        UserStoryCurrentInfo userStoryCurrentInfoCopy = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(aid, "reveal_story") && aweme != null && (userStory = aweme.getUserStory()) != null && (currentInfo = userStory.getCurrentInfo()) != null && (num = currentInfo.currentIndex) != null) {
            int iIntValue = num.intValue();
            UserStoryCurrentInfo currentInfo2 = userStory.getCurrentInfo();
            if (currentInfo2 != null && (aweme2 = currentInfo2.currentStory) != null && (story = aweme2.getStory()) != null && !story.viewed) {
                return;
            }
            if (userStory.getAllViewed()) {
                userStory.setFirstUnViewedStoryIdx(0);
                userStory.setShouldStartFromUnViewedStoryIdx(true);
                return;
            }
            int nextStoryIndex = userStory.getNextStoryIndex(iIntValue);
            UserStoryCurrentInfo maxViewedInfo = userStory.getMaxViewedInfo();
            if (maxViewedInfo != null) {
                userStoryCurrentInfoCopy = maxViewedInfo.copy(Integer.valueOf(nextStoryIndex - 1), maxViewedInfo.currentStory, maxViewedInfo.dispatchCode);
            }
            userStory.setMaxViewedInfo(userStoryCurrentInfoCopy);
            userStory.setFirstUnViewedStoryIdx(nextStoryIndex);
            userStory.setShouldStartFromUnViewedStoryIdx(true);
        }
    }

    @Override // X.InterfaceC706770Rnv
    public final Map LJ(final C0SR4 c0sr4) {
        return C2097608Jq.LJIIIIZZ(new Pair(12, new C0SZR<StoryGuideCardVideoVH, VideoItemParams>(c0sr4) { // from class: X.0RAp
            @Override // X.C0SZR
            public final String LIZLLL(C0OB8 c0ob8, C0RGF c0rgf, int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0ob8);
                sbLIZ.append(", position: ");
                sbLIZ.append(i);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        }), new Pair(13, new C0SZR<StoryGuideCardPhotoVH, VideoItemParams>(c0sr4) { // from class: X.0RAn
            @Override // X.C0SZR
            public final String LIZLLL(C0OB8 c0ob8, C0RGF c0rgf, int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0ob8);
                sbLIZ.append(", position: ");
                sbLIZ.append(i);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        }), new Pair(14, new C0SZR<StoryGuideCardThoughtVH, VideoItemParams>(c0sr4) { // from class: X.0RAo
            @Override // X.C0SZR
            public final String LIZLLL(C0OB8 c0ob8, C0RGF c0rgf, int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c0ob8);
                sbLIZ.append(", position: ");
                sbLIZ.append(i);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
        }));
    }

    @Override // X.InterfaceC706770Rnv
    public final boolean LJFF(Fragment fragment) {
        IDetailFeedSafService iDetailFeedSafService;
        Fragment fragmentLIZLLL;
        Bundle arguments;
        if (!LJJIIJZLJL(fragment) || (iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null)) == null || (fragmentLIZLLL = iDetailFeedSafService.LIZLLL(fragment)) == null || (arguments = fragmentLIZLLL.getArguments()) == null || arguments.getInt("use_saf") != 2) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC706770Rnv
    public final boolean LJIIJ(Fragment fragment) {
        C0RJN c0rjnLIZIZ;
        C2189821An6 c2189821An6;
        if (C281310B0v.LIZ() || fragment == null || (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment)) == null) {
            return false;
        }
        if (!C1389300mG0.LJJI(c0rjnLIZIZ) && ((c2189821An6 = c0rjnLIZIZ.LIZJ) == null || !c2189821An6.isStoryPage())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC706770Rnv
    public final int LJIIL(Context context) {
        Resources resources;
        if (C0HCN.LIZ() && ((Number) C281250B0p.LIZ.getValue()).intValue() != 1) {
            return 0;
        }
        if (context != null && (resources = context.getResources()) != null) {
            return (int) resources.getDimension(R.dimen.ahy);
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
    }

    @Override // X.InterfaceC706770Rnv
    public final int LJIILJJIL(C19EG c19eg) {
        Resources resources = c19eg.getResources();
        if (resources != null) {
            return (int) resources.getDimension(R.dimen.ahz);
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    }

    @Override // X.InterfaceC706770Rnv
    public final boolean LJIILLIIL(String str) {
        if (C1600750rl3.LJ(str) && C281310B0v.LIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC706770Rnv
    public final boolean LJIJI(Object obj) {
        return obj instanceof BaseStoryGuideCardVH;
    }

    @Override // X.InterfaceC706770Rnv
    public final void LJJI(String str) {
        UserStory userStory;
        List<Aweme> stories;
        if (str != null && str.length() != 0) {
            Aweme awemeLJIIIZ = C728090ShD.LIZ.LJIIIZ(str);
            if (awemeLJIIIZ == null || (userStory = awemeLJIIIZ.getUserStory()) == null || (stories = userStory.getStories()) == null || stories.isEmpty()) {
                awemeLJIIIZ = null;
            }
            C1603960rqE.LIZ = new C728350Shd(str, awemeLJIIIZ);
        }
    }

    @Override // X.InterfaceC706770Rnv
    public final boolean LJJIIJZLJL(Fragment fragment) {
        C0RJN c0rjnLIZIZ;
        C2189821An6 c2189821An6;
        if (!C281310B0v.LIZ() || fragment == null || (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragment)) == null) {
            return false;
        }
        if (!C1389300mG0.LJJI(c0rjnLIZIZ) && ((c2189821An6 = c0rjnLIZIZ.LIZJ) == null || !c2189821An6.isStoryPage())) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC706770Rnv
    public final boolean LIZJ(Aweme aweme, String str) {
        if (!C1601110rld.LIZ() || !C729510SjV.LJJIJIL(aweme)) {
            return false;
        }
        if (!C0RGX.LIZ(Boolean.valueOf(C729510SjV.LJJIJIL(aweme)), false, 2)) {
            return true;
        }
        boolean zLJFF = Intrinsics.LJFF("homepage_hot", str);
        boolean zLJFF2 = Intrinsics.LJFF("homepage_follow", str);
        boolean zLJFF3 = Intrinsics.LJFF("homepage_nearby", str);
        boolean zLJFF4 = Intrinsics.LJFF("homepage_friends", str);
        if (zLJFF || zLJFF2 || zLJFF4 || zLJFF3) {
            return true;
        }
        return !C729980SkG.LJIIIIZZ(aweme);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0123, code lost:
    
        if (r1 == 672000920) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0128, code lost:
    
        if (r1 != 1537078210) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x012e, code lost:
    
        if (r8.equals("STORY_ENTRANCE_DEFAULT") == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0134, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF("notification_page", r7) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x013a, code lost:
    
        if (X.C281310B0v.LIZ() == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0146, code lost:
    
        if (r8.equals("STORY_ENTRANCE_AVATAR") == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x014f, code lost:
    
        if (r8.equals("STORY_ENTRANCE_INBOX_TOP_LIST") == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x015b, code lost:
    
        if (X.C1601110rld.LIZ() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0163, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF("STORY_ENTRANCE_MINE", r8) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x016b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF("STORY_ENTRANCE_OTHER", r8) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0171, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF("STORY_ENTRANCE_AVATAR", r8) != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x017d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF("STORY_ENTRANCE_AVATAR", r8) == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0188, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF("STORY_ENTRANCE_FOLLOWING_FEED_TOP_LIST_NEW", r8) != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0190, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF("STORY_ENTRANCE_FRIENDS_TOP_LIST", r8) != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0198, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF("STORY_ENTRANCE_GUIDE_CARD", r8) != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01a0, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF("STORY_ENTRANCE_FYP_TOP_LIST", r8) != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01a6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF("STORY_ENTRANCE_DEFAULT", r8) == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01ac, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF("chat", r7) == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01b2, code lost:
    
        if (X.C281310B0v.LIZ() == false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if (r7.equals("single_song") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r7.equals("story_widget_extension_large") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        if (r7.equals("story_widget_extension_small") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r7.equals("notification_page") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r7.equals("homepage_follow") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:
    
        if (r7.equals("homepage_nearby") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
    
        if (r7.equals("prop_page") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0088, code lost:
    
        if (r7.equals("homepage_friends") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0091, code lost:
    
        if (r7.equals("personal_homepage") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a9, code lost:
    
        if (r7.equals("chat") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b2, code lost:
    
        if (r7.equals("follow_request") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bb, code lost:
    
        if (r7.equals("others_homepage") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c4, code lost:
    
        if (r7.equals("profile_visitor_list") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ce, code lost:
    
        if (r7.equals("member_list") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e3, code lost:
    
        if (r7.equals("homepage_hot") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fc, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r8, "STORY_ENTRANCE_INBOX_TOP_LIST") == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x010a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r8, "STORY_ENTRANCE_MUSIC_COVER_AVATAR") == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0115, code lost:
    
        if (r8 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0117, code lost:
    
        r1 = r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x011e, code lost:
    
        if (r1 == (-796330400)) goto L118;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC706770Rnv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0RQI LIZLLL(java.lang.String r7, java.lang.String r8) {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RMW.LIZLLL(java.lang.String, java.lang.String):X.0RQI");
    }

    @Override // X.InterfaceC706770Rnv
    public final boolean LJI(C2189821An6 c2189821An6, C0RF0 c0rf0) {
        if (!(c0rf0 instanceof C0RF0) || !LJJIJ(c0rf0) || (C0C64.LJIILLIIL().LJIJ(31744, 0, "add_comment_and_like_bubble", true) & 4) != 4 || !C1601110rld.LIZ() || c2189821An6 == null) {
            return false;
        }
        if (!LJJIJIIJI(c2189821An6) && !LJJIIZI(c2189821An6)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0RGK] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.0RAb] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.0RAd] */
    /* JADX WARN: Type inference failed for: r0v22, types: [X.0RAe] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0RAe] */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.0RGQ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0RAc] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0RAc] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0RAc] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0RAc] */
    @Override // X.InterfaceC706770Rnv
    public final Object LJII(InterfaceC691450RAh interfaceC691450RAh, EnumC706640Rni enumC706640Rni) {
        if (!(interfaceC691450RAh instanceof C0RF0)) {
            return null;
        }
        switch (C706650Rnj.LIZ[enumC706640Rni.ordinal()]) {
            case 1:
                return new StoryPlayerListViewHolder((C0RF0) interfaceC691450RAh);
            case 2:
                return new StoryImmersiveCollectionVH((C0RF0) interfaceC691450RAh, new C0SZL<StoryImmersiveCollectionVH, VideoItemParams>() { // from class: X.0RGQ
                    @Override // X.C0SZL
                    public final String LIZLLL(VideoItemParams videoItemParams) {
                        String aid = videoItemParams.getAweme().getAid();
                        if (aid == null) {
                            return "";
                        }
                        return aid;
                    }
                });
            case 3:
                return new StoryVideoViewHolder((C0RF0) interfaceC691450RAh, new C0SZL<BasePostViewCell, VideoItemParams>() { // from class: X.0RAe
                    @Override // X.C0SZL
                    public final String LIZLLL(VideoItemParams videoItemParams) {
                        String aid = videoItemParams.getAweme().getAid();
                        if (aid == null) {
                            return "";
                        }
                        return aid;
                    }
                });
            case 4:
                return new StoryFeedUploadingViewHolder((C0RF0) interfaceC691450RAh, new C0SZL<BasePostViewCell, VideoItemParams>() { // from class: X.0RAe
                    @Override // X.C0SZL
                    public final String LIZLLL(VideoItemParams videoItemParams) {
                        String aid = videoItemParams.getAweme().getAid();
                        if (aid == null) {
                            return "";
                        }
                        return aid;
                    }
                });
            case 5:
                return new StoryInvisibleVideoViewHolder((C0RF0) interfaceC691450RAh, new C0SZL<BasePostViewCell, VideoItemParams>() { // from class: X.0RAd
                    @Override // X.C0SZL
                    public final String LIZLLL(VideoItemParams videoItemParams) {
                        String aid = videoItemParams.getAweme().getAid();
                        if (aid == null) {
                            return "";
                        }
                        return aid;
                    }
                });
            case 6:
                return new StoryPhotoViewHolder((C0RF0) interfaceC691450RAh, new C0SZL<BasePostViewCell, VideoItemParams>() { // from class: X.0RAb
                    @Override // X.C0SZL
                    public final String LIZLLL(VideoItemParams videoItemParams) {
                        String aid;
                        Aweme aweme = videoItemParams.getAweme();
                        if (aweme == null || (aid = aweme.getAid()) == null) {
                            return "";
                        }
                        return aid;
                    }
                });
            case 7:
                return new StoryImmersiveUserFeedVH((C0RF0) interfaceC691450RAh, new C0SZL<StoryImmersiveUserFeedVH, VideoItemParams>() { // from class: X.0RGK
                    @Override // X.C0SZL
                    public final String LIZLLL(VideoItemParams videoItemParams) {
                        String aid = videoItemParams.getAweme().getAid();
                        if (aid == null) {
                            return "";
                        }
                        return aid;
                    }
                });
            case 8:
                C0RF0 c0rf0 = (C0RF0) interfaceC691450RAh;
                return new StoryGuideCardVideoVH(c0rf0, c0rf0.LJIILLIIL.get(12));
            case BdTuring.TYPE_ECAF /* 9 */:
                C0RF0 c0rf02 = (C0RF0) interfaceC691450RAh;
                return new StoryGuideCardPhotoVH(c0rf02, c0rf02.LJIILLIIL.get(13));
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C0RF0 c0rf03 = (C0RF0) interfaceC691450RAh;
                return new StoryGuideCardThoughtVH(c0rf03, c0rf03.LJIILLIIL.get(14));
            case BdTuring.TYPE_EMAIL /* 11 */:
                return new StoryRevealPromoCardVH((C0RF0) interfaceC691450RAh, new C0SZL<BasePostViewCell, VideoItemParams>() { // from class: X.0RAc
                    @Override // X.C0SZL
                    public final String LIZLLL(VideoItemParams videoItemParams) {
                        String aid;
                        Aweme aweme = videoItemParams.getAweme();
                        if (aweme == null || (aid = aweme.getAid()) == null) {
                            return "";
                        }
                        return aid;
                    }
                });
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return new StoryNoteViewHolder((C0RF0) interfaceC691450RAh, new C0SZL<BasePostViewCell, VideoItemParams>() { // from class: X.0RAc
                    @Override // X.C0SZL
                    public final String LIZLLL(VideoItemParams videoItemParams) {
                        String aid;
                        Aweme aweme = videoItemParams.getAweme();
                        if (aweme == null || (aid = aweme.getAid()) == null) {
                            return "";
                        }
                        return aid;
                    }
                });
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return new StoryGuideUploadCardVH((C0RF0) interfaceC691450RAh, new C0SZL<BasePostViewCell, VideoItemParams>() { // from class: X.0RAc
                    @Override // X.C0SZL
                    public final String LIZLLL(VideoItemParams videoItemParams) {
                        String aid;
                        Aweme aweme = videoItemParams.getAweme();
                        if (aweme == null || (aid = aweme.getAid()) == null) {
                            return "";
                        }
                        return aid;
                    }
                });
            case 14:
                return new LiveShareStoryViewHolder((C0RF0) interfaceC691450RAh, new C0SZL<BasePostViewCell, VideoItemParams>() { // from class: X.0RAc
                    @Override // X.C0SZL
                    public final String LIZLLL(VideoItemParams videoItemParams) {
                        String aid;
                        Aweme aweme = videoItemParams.getAweme();
                        if (aweme == null || (aid = aweme.getAid()) == null) {
                            return "";
                        }
                        return aid;
                    }
                });
            default:
                throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC706770Rnv
    public final void LJIIIZ(C0SZ8 c0sz8, C0RQI c0rqi) {
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        InterfaceC494301wD interfaceC494301wDLIZ2 = null;
        if ((c0sz8 instanceof CommonCellAbility) && (commonCellAbility2 = (CommonCellAbility) c0sz8) != null && (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) != null && (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, FeedCollectionViewPagerAbility.class, null)) != null) {
            interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
        } else {
            C0SZ8 c0sz8LLJLLL = c0sz8.LLJLLL();
            if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, FeedCollectionViewPagerAbility.class, null);
            }
        }
        FeedCollectionViewPagerAbility feedCollectionViewPagerAbility = (FeedCollectionViewPagerAbility) interfaceC494301wDLIZ2;
        if (feedCollectionViewPagerAbility != null) {
            feedCollectionViewPagerAbility.Es0(c0rqi);
        }
    }

    @Override // X.InterfaceC706770Rnv
    public final void LJIIJJI(C0SZ8 c0sz8, String str) {
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        if (c0sz8 != null) {
            InterfaceC494301wD interfaceC494301wDLIZ2 = null;
            if ((c0sz8 instanceof CommonCellAbility) && (commonCellAbility2 = (CommonCellAbility) c0sz8) != null && (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) != null && (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, StoryLocalDeleteAbility.class, null)) != null) {
                interfaceC494301wDLIZ2 = interfaceC494301wDLIZ;
            } else {
                C0SZ8 c0sz8LLJLLL = c0sz8.LLJLLL();
                if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                    interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, StoryLocalDeleteAbility.class, null);
                }
            }
            StoryLocalDeleteAbility storyLocalDeleteAbility = (StoryLocalDeleteAbility) interfaceC494301wDLIZ2;
            if (storyLocalDeleteAbility != null) {
                storyLocalDeleteAbility.LX0(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    @Override // X.InterfaceC706770Rnv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.Aweme LJJII(androidx.fragment.app.Fragment r5, com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r4 = this;
            boolean r0 = X.C729510SjV.LJJIIZ(r6)
            r2 = 0
            if (r0 == 0) goto L30
            if (r6 == 0) goto L35
            com.ss.android.ugc.aweme.feed.model.story.UserStory r0 = r6.getUserStory()
            if (r0 == 0) goto L35
            java.util.List r0 = r0.getStories()
            if (r0 == 0) goto L35
            java.util.Iterator r1 = r0.iterator()
        L19:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r6 = r1.next()
            r0 = r6
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            boolean r0 = X.C708880RrK.LIZ(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L19
        L2e:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = (com.ss.android.ugc.aweme.feed.model.Aweme) r6
        L30:
            if (r5 == 0) goto L42
            goto L37
        L33:
            r6 = r2
            goto L2e
        L35:
            r6 = r2
            goto L30
        L37:
            com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility r1 = X.C0T1R.LIZLLL(r5)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L42
            if (r6 == 0) goto L40
            goto L44
        L40:
            r0 = r2
            goto L48
        L42:
            r1 = r2
            goto L91
        L44:
            java.lang.String r0 = r6.getAid()     // Catch: java.lang.Throwable -> L97
        L48:
            X.0SZ8 r3 = r1.LJJIJIL(r0)     // Catch: java.lang.Throwable -> L97
            if (r3 == 0) goto L42
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L6b
            r0 = r3
            com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility r0 = (com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility) r0     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L6b
            X.0RyY r0 = r0.Fz2()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L6b
            X.0Q7z r1 = X.C1558420qem.LIZIZ(r0)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L6b
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility> r0 = com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L89
        L6b:
            X.0SZ8 r1 = r3.LLJLLL()     // Catch: java.lang.Throwable -> L97
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L95
            com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility r1 = (com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility) r1     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L95
            X.0RyY r0 = r1.Fz2()     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L95
            X.0Q7z r1 = X.C1558420qem.LIZIZ(r0)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L95
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility> r0 = com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r1, r0, r2)     // Catch: java.lang.Throwable -> L97
        L89:
            com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility r0 = (com.ss.android.ugc.aweme.story.feed.common.collection.ability.StoryCollectionCellAbility) r0     // Catch: java.lang.Throwable -> L97
            if (r0 == 0) goto L42
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.o81()     // Catch: java.lang.Throwable -> L97
        L91:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L97
            goto La3
        L95:
            r0 = r2
            goto L89
        L97:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        La3:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto Laa
            r2 = r1
        Laa:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0RMW.LJJII(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.feed.model.Aweme");
    }

    @Override // X.InterfaceC706770Rnv
    public final String LJJIIZ(C0SZ8 c0sz8, Context context) {
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        InterfaceC494301wD interfaceC494301wDLIZ2;
        CommonCellAbility commonCellAbility3;
        InterfaceC713360RyY interfaceC713360RyYFz23;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ3;
        String strRC;
        CommonCellAbility commonCellAbility4;
        InterfaceC713360RyY interfaceC713360RyYFz24;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ4;
        InterfaceC494301wD interfaceC494301wDLIZ3 = null;
        if (!(c0sz8 instanceof Aweme) && c0sz8 != null) {
            if (!(c0sz8 instanceof CommonCellAbility) || (commonCellAbility4 = (CommonCellAbility) c0sz8) == null || (interfaceC713360RyYFz24 = commonCellAbility4.Fz2()) == null || (interfaceC665370Q7zLIZIZ4 = C1558420qem.LIZIZ(interfaceC713360RyYFz24)) == null || (interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ4, PlayEnterBehaviorAbility.class, null)) == null) {
                C0SZ8 c0sz8LLJLLL = c0sz8.LLJLLL();
                if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility3 = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz23 = commonCellAbility3.Fz2()) != null && (interfaceC665370Q7zLIZIZ3 = C1558420qem.LIZIZ(interfaceC713360RyYFz23)) != null) {
                    interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ3, PlayEnterBehaviorAbility.class, null);
                } else {
                    interfaceC494301wDLIZ2 = null;
                }
            }
            PlayEnterBehaviorAbility playEnterBehaviorAbility = (PlayEnterBehaviorAbility) interfaceC494301wDLIZ2;
            if (playEnterBehaviorAbility != null && (strRC = playEnterBehaviorAbility.RC()) != null && strRC.length() != 0) {
                return strRC;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("viewHolder = ");
        sbLIZ.append(c0sz8);
        sbLIZ.append(", StoryPlaySourceAbility = ");
        if (c0sz8 != null) {
            if ((c0sz8 instanceof CommonCellAbility) && (commonCellAbility2 = (CommonCellAbility) c0sz8) != null && (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) != null && (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) != null && (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, PlayEnterBehaviorAbility.class, null)) != null) {
                interfaceC494301wDLIZ3 = interfaceC494301wDLIZ;
            } else {
                C0SZ8 c0sz8LLJLLL2 = c0sz8.LLJLLL();
                if ((c0sz8LLJLLL2 instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL2) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                    interfaceC494301wDLIZ3 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, PlayEnterBehaviorAbility.class, null);
                }
            }
        }
        sbLIZ.append(interfaceC494301wDLIZ3);
        C2188811AlT.LIZIZ(sbLIZ);
        if (((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(context)) {
            return "outer_feed";
        }
        return "inner_feed";
    }

    @Override // X.InterfaceC706770Rnv
    public final void LIZIZ(Boolean bool, final String str, final String str2) {
        String str3;
        Integer numValueOf;
        StoryApi storyApi = StoryApi.LIZIZ;
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        if (bool != null) {
            numValueOf = Integer.valueOf(bool.booleanValue() ? 1 : 0);
        } else {
            numValueOf = null;
        }
        storyApi.reportStoryViewed(str, str3, numValueOf).LJJIJIIJI(C11S5.LIZ()).LJJIIZ(new AfS32S1000000_2(str, 2), new AfS32S1000000_2(str, 3));
        if (C281310B0v.LIZ()) {
            C0CAU.LIZIZ(new Runnable() { // from class: X.0Rxt
                public final void LIZ() {
                    C0RMW.LIZ.getClass();
                    Activity[] activityStack = ActivityStack.getActivityStack();
                    if (activityStack != null) {
                        for (Activity activity : activityStack) {
                            if (activity instanceof InterfaceC1603190roz) {
                                if (activity == null || !(activity instanceof C19EG)) {
                                    return;
                                }
                                ComponentActivity componentActivity = (ComponentActivity) activity;
                                C19719912Dl c19719912DlLIZ = C13LE.LIZ(GuideCardFilterVM.class);
                                AssemVMLazy assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(componentActivity, c19719912DlLIZ), new C5182020e((C13IQ) c19719912DlLIZ, 490), new C452070Ho5(), C724750Sbp.LJII(componentActivity), C724750Sbp.LJIIIZ(componentActivity), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) componentActivity, 1556), AFwS243S0000000_11.get$arr$(756));
                                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C0RMW.LIZIZ;
                                GuideCardFilterVM guideCardFilterVM = (GuideCardFilterVM) assemVMLazy.getValue();
                                if (guideCardFilterVM != null) {
                                    String str4 = str;
                                    String str5 = str2;
                                    if (((C08IK) guideCardFilterVM.LL.getValue()).keySet().contains(str4)) {
                                        return;
                                    }
                                    ((HashMap) guideCardFilterVM.LL.getValue()).put(str4, str5);
                                    guideCardFilterVM.setState(new C712860Rxk(str4, str5));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("StoryFeedService@825.reportStoryViewed$3");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("StoryFeedService@825.reportStoryViewed$3");
                }
            });
        }
    }

    @Override // X.InterfaceC706770Rnv
    public final InterfaceC1370310llN LJJIIJ(final Fragment fragment, final Aweme aweme, final String str) {
        if (C729510SjV.LJIJI(aweme) || !C729980SkG.LJIIIIZZ(aweme) || !C712420Rx2.LIZ(aweme)) {
            return null;
        }
        return new InterfaceC1370310llN(fragment, aweme, str) { // from class: X.0Ss2
            public final Aweme LL;
            public final String LLILLJJLI;
            public final C736950SvV LLILLL;

            @Override // X.InterfaceC1370310llN
            public final float LIZLLL() {
                return -1.0f;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJI() {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJII() {
                return R.raw.icon_play_rectangle_fill;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIIIZZ() {
                return R.raw.icon_play_rectangle_fill;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJIILJJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILL(InterfaceC1362720lZ8 interfaceC1362720lZ8) {
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIJJLI() {
                return 0;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIIZI(View view, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJIJ(ImageView imageView, View view, int i) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJIJIIJIL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJIL() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String LJJIZ() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJI(Context context, BaseSharePackage baseSharePackage) {
            }

            @Override // X.InterfaceC1370310llN
            public final Integer LJJJJIZL() {
                return null;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJJL() {
                return false;
            }

            @Override // X.InterfaceC1370450llb
            public final int LJJJJLI() {
                return 100;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJJLZIJ() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJLIIIJJIZ() {
                return 2131849357;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean LJJLIIIJL() {
                return false;
            }

            @Override // X.InterfaceC1370310llN
            public final boolean enable() {
                return true;
            }

            @Override // X.InterfaceC1370310llN
            public final String key() {
                return "story_to_post";
            }

            @Override // X.InterfaceC1370310llN
            public final String label() {
                return "";
            }

            @Override // X.InterfaceC1370310llN
            public final int LJIIJJI() {
                return !enable() ? 1 : 0;
            }

            @Override // X.InterfaceC1370310llN
            public final C0M7Z LJIIJ() {
                return C0M7Z.ShareButton;
            }

            @Override // X.InterfaceC1370310llN
            public final EnumC1216710hld LJJJZ() {
                return EnumC1216710hld.NORMAL;
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIJJ(TextView textView) {
                C1370320llO.LJ(this, textView);
            }

            @Override // X.InterfaceC1370310llN
            public final int LJJJJ(EnumC1369720lkQ enumC1369720lkQ) {
                return C1370320llO.LIZJ(enumC1369720lkQ);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJI(BaseSharePackage baseSharePackage) {
                this.LLILLL.getValue();
                StoryToPostShareVM.vQ2(this.LL, "story_to_post_show", this.LLILLJJLI, "archive_to_post", "share_board");
            }

            @Override // X.InterfaceC1370310llN
            public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
                StoryToPostShareVM storyToPostShareVM = (StoryToPostShareVM) this.LLILLL.getValue();
                Aweme aweme2 = this.LL;
                String str2 = this.LLILLJJLI;
                StoryToPostShareVM.vQ2(aweme2, "story_to_post_click", str2, "archive_to_post", "share_board");
                C23250099c.LIZLLL((InterfaceC497601wk) storyToPostShareVM.LL.getValue(), null, null, new C735130SsZ(aweme2, storyToPostShareVM, str2, "archive_to_post", "share_board", null), 3);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJJJLL(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIIJ(View view, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZIZ(this, view, baseSharePackage);
            }

            @Override // X.InterfaceC1370310llN
            public final void LJJLIIIJILLIZJL(Context context, BaseSharePackage baseSharePackage) {
                C1370320llO.LIZLLL(context, baseSharePackage, this);
            }

            {
                this.LL = aweme;
                this.LLILLJJLI = str;
                this.LLILLL = new C736950SvV(C13LE.LIZ(StoryToPostShareVM.class), null, new C452070Ho5(), C724750Sbp.LJII(fragment), C1220000hqw.LIZ(fragment instanceof HasDefaultViewModelProviderFactory ? fragment : null), AFwS243S0000000_11.get$arr$(593), new C451460Hn6(fragment, false), new C451620HnM(fragment, true), new C338520DOw(fragment));
            }
        };
    }

    @Override // X.InterfaceC706770Rnv
    public final void LJIILIIL(String str, UserStory userStory, String str2, String str3) {
        new C727100Sfc().LIZ(str, userStory, str2, str3);
    }

    @Override // X.InterfaceC706770Rnv
    public final View LJIIIIZZ(EnumC706640Rni enumC706640Rni, Context context, ViewGroup viewGroup, Fragment fragment, BaseFeedPageParams baseFeedPageParams) {
        int i;
        String from;
        C2189821An6 c2189821An6;
        System.currentTimeMillis();
        String tag = enumC706640Rni.getTag();
        switch (C706650Rnj.LIZ[enumC706640Rni.ordinal()]) {
            case 1:
                i = R.layout.b7p;
                break;
            case 2:
                i = R.layout.fbq;
                break;
            case 3:
            case 4:
            case 14:
                i = R.layout.fc0;
                break;
            case 5:
                i = R.layout.fbu;
                break;
            case 6:
                i = R.layout.fbx;
                break;
            case 7:
                i = R.layout.fcv;
                break;
            case 8:
                i = R.layout.fcd;
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                i = R.layout.fca;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                i = R.layout.fcc;
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                i = R.layout.fbs;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                i = R.layout.fbw;
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                i = R.layout.fbr;
                break;
            default:
                throw new C1954807lC();
        }
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        View viewLIZJ = c1618440sDa.LJJ().LIZJ(tag, context, fragment, i, null, viewGroup, false, true);
        if (enumC706640Rni == EnumC706640Rni.LIST_VIEW || enumC706640Rni == EnumC706640Rni.IMMERSIVE_LIST_VIEW) {
            C0ROW c0rowLJJ = c1618440sDa.LJJ();
            if (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null || (from = c2189821An6.getFrom()) == null) {
                from = "";
            }
            c0rowLJJ.LJFF(context, enumC706640Rni, fragment, from);
        }
        return viewLIZJ;
    }
}
