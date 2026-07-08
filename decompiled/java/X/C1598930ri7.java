package X;

import android.util.Log;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.IStoryInboxService;
import com.ss.android.ugc.aweme.story.inbox.OnThisDayResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryGetFeedByPageResponse;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxPreloadComponent;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxPreloadComponentV2;
import com.ss.android.ugc.aweme.story.inbox.view.InboxSkylightHighlightDivider;
import com.ss.android.ugc.aweme.story.inbox.view.InboxSkylightHighlightsCell;
import com.ss.android.ugc.aweme.story.inbox.view.StoryInboxCell;
import com.ss.android.ugc.aweme.story.inbox.view.StoryLoadMoreLoadingCell;
import com.ss.android.ugc.aweme.story.inbox.view.StoryOnThisDayInboxCell;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ri7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1598930ri7 implements IStoryInboxService {
    public static final C1598930ri7 LIZ = new C1598930ri7();
    public static C11NJ LIZIZ = new C11NJ();
    public static volatile String LIZJ;

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>>[] getOnThisDayCell() {
        return new Class[]{StoryOnThisDayInboxCell.class};
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>>[] getStoryCell() {
        return new Class[]{StoryInboxCell.class, InboxSkylightHighlightsCell.class, InboxSkylightHighlightDivider.class};
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final C13IQ<? extends AbstractC738140SxQ> getStoryInboxPreloadComponent() {
        return C13LE.LIZ(StoryInboxPreloadComponent.class);
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final C13IQ<? extends AbstractC738140SxQ> getStoryInboxPreloadComponentV2() {
        return C13LE.LIZ(StoryInboxPreloadComponentV2.class);
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final void cancelPreloadTask() {
        C11NJ c11nj = LIZIZ;
        if (c11nj != null) {
            c11nj.dispose();
        }
        LIZIZ = null;
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final void markColdStart() {
        C1219820hqe.LIZ.getClass();
        C1219820hqe.LIZIZ = System.currentTimeMillis();
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final void preloadData() {
        C614770O9j.LIZIZ.LIZ().LIZJ("StoryInboxPreload");
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final void registerStoryInnerPushHandler() {
        if (C1599230rib.LIZ.compareAndSet(false, true)) {
            C729960SkE c729960SkE = new C729960SkE();
            C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
            c1908480zlO.LJIILL(c729960SkE, c729960SkE.LIZJ());
            c1908480zlO.LJ(c729960SkE);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final void resetDataCenterStatus() {
        C614770O9j.LIZIZ.LIZ().resetDataCenterStatus();
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final boolean canShowStoryCell() {
        return C1601110rld.LIZ() && !C295190Bhd.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final Class<? extends PowerLoadingCell> getStoryFooterCell() {
        if (C1599090riN.LIZ()) {
            return StoryLoadMoreLoadingCell.class;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final void preloadOnBoot() {
        C11NJ c11nj;
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            return;
        }
        if ((((Boolean) C139300g3.LIZ.getValue()).booleanValue() && C1906580ziK.LJI()) || (c11nj = LIZIZ) == null) {
            return;
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        LIZJ = curUser != null ? curUser.getUid() : null;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxSkylightPreload", "story preloadOnBoot");
        C1219820hqe.LIZ.getClass();
        C1219820hqe.LIZJ = System.currentTimeMillis();
        c11nj.LIZ(fetchStoryItems(0L, C1599090riN.LIZ() ? C1599090riN.LIZIZ().preloadPageCount : C0BV5.LIZ(), null, EnumC1596540reG.INBOX_TAB, EnumC1582650rHr.INBOX_UPDATE_PRELOAD.getType(), null).LJL(C11S5.LIZ()).LJJLL(new C09JN() { // from class: X.0hee
            @Override // X.C09JN
            public final void accept(Object obj) {
                String uid;
                C1C7U.LIZ("StoryInboxService@5d4b.preloadOnBoot$1");
                StoryGetFeedByPageResponse storyGetFeedByPageResponse = (StoryGetFeedByPageResponse) obj;
                C1598930ri7.LIZ.getClass();
                User curUser2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                if (curUser2 != null && (uid = curUser2.getUid()) != null && Intrinsics.LJFF(uid, C1598930ri7.LIZJ)) {
                    C614770O9j.LIZIZ.LIZ().LJIIJJI(storyGetFeedByPageResponse);
                }
                C1219820hqe.LIZ.getClass();
                C1219820hqe.LIZLLL = System.currentTimeMillis();
                C1219820hqe.LIZ(true, "");
                C1C7U.LIZIZ("StoryInboxService@5d4b.preloadOnBoot$1");
            }
        }, new C09JN() { // from class: X.0hed
            @Override // X.C09JN
            public final void accept(Object obj) {
                int errorCode;
                C1C7U.LIZ("StoryInboxService@5d4b.preloadOnBoot$2");
                Throwable th = (Throwable) obj;
                C1219820hqe c1219820hqe = C1219820hqe.LIZ;
                String stackTraceString = Log.getStackTraceString(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error_code = ");
                if (th instanceof C23112093u) {
                    errorCode = ((C23112093u) th).getErrorCode();
                } else {
                    errorCode = -1;
                }
                sbLIZ.append(errorCode);
                sbLIZ.append('\n');
                sbLIZ.append(th.getMessage());
                sbLIZ.append('\n');
                sbLIZ.append(stackTraceString);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1219820hqe.getClass();
                C1219820hqe.LIZLLL = System.currentTimeMillis();
                C1219820hqe.LIZ(false, strLIZIZ);
                C1C7U.LIZIZ("StoryInboxService@5d4b.preloadOnBoot$2");
            }
        }));
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final InterfaceC1597940rgW getOnThisDayService() {
        return C1599630rjF.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final C1598870ri1 convertDayResponseToItem(OnThisDayResponse onThisDayResponse) {
        C1598940ri8.LIZ.getClass();
        if (onThisDayResponse != null) {
            try {
                if (C1598940ri8.LIZIZ(onThisDayResponse)) {
                    return new C1598870ri1(onThisDayResponse.getAweme(), onThisDayResponse.getViewCount(), onThisDayResponse.isPosted(), onThisDayResponse.getPastMemoryKey(), onThisDayResponse.getPriority(), onThisDayResponse.getAwemes(), null, false, "has_post");
                }
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final void sendViewedMemorableView(String str) {
        C1598940ri8.LIZ.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(C1598940ri8.LIZIZ)), null, null, new C316801Ks(str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final boolean shouldShowShootingEntrance(boolean z, boolean z2) {
        if (C1601110rld.LIZ() && !C295190Bhd.LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.story.inbox.IStoryInboxService
    public final C11NZ<StoryGetFeedByPageResponse> fetchStoryItems(long j, long j2, String str, EnumC1596540reG enumC1596540reG, int i, String str2) {
        int i2;
        int friendCount;
        Long lValueOf;
        int i3;
        User curUser;
        User curUser2;
        boolean zLJFF = Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE);
        EnumC1596540reG enumC1596540reG2 = EnumC1596540reG.INBOX_TAB;
        int followingCount = 0;
        if (enumC1596540reG == enumC1596540reG2 && C1256440ini.LIZ()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null && (curUser2 = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser()) != null) {
            friendCount = curUser2.getFriendCount();
        } else {
            friendCount = 0;
        }
        IAccountUserService iAccountUserServiceLJFF2 = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF2 != null && (curUser = ((AbstractC848400XPy) iAccountUserServiceLJFF2).getCurUser()) != null) {
            followingCount = curUser.getFollowingCount();
        }
        Long lValueOf2 = null;
        if (enumC1596540reG != enumC1596540reG2 || !C1599090riN.LIZ() || (i3 = C1599090riN.LIZIZ().maxStoryTotalCount) <= 0) {
            lValueOf = null;
        } else {
            lValueOf = Long.valueOf(i3);
        }
        if (enumC1596540reG == enumC1596540reG2 && C1599090riN.LIZ()) {
            lValueOf2 = Long.valueOf(C1599090riN.LIZIZ().maxPackUserStoryCount);
        }
        return C614770O9j.LIZIZ.LJ().LJIJ(j, Long.valueOf(j2), str, enumC1596540reG, friendCount, followingCount, Boolean.valueOf(zLJFF), i2, i, lValueOf, lValueOf2, str2).LJJIJIIJIL(new C09JN() { // from class: X.0hei
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("StoryInboxService@5d4b.fetchStoryItems$1");
                C1C7U.LIZIZ("StoryInboxService@5d4b.fetchStoryItems$1");
            }
        });
    }
}
