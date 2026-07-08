package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.MiniDramaCardInfo;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.model.DramaDNUFeedCardConfig;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.service.ISeriesCommonETService;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r9E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577300r9E extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DramaDNUFeedCardConfig LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ Long LLILZ;
    public final /* synthetic */ HomeViewPagerAbility LLILZIL;
    public final /* synthetic */ C1577330r9H LLILZLL;
    public final /* synthetic */ Long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1577300r9E(DramaDNUFeedCardConfig dramaDNUFeedCardConfig, Context context, Aweme aweme, Long l, HomeViewPagerAbility homeViewPagerAbility, C1577330r9H c1577330r9H, Long l2) {
        super(0);
        this.LL = dramaDNUFeedCardConfig;
        this.LLILLJJLI = context;
        this.LLILLL = aweme;
        this.LLILZ = l;
        this.LLILZIL = homeViewPagerAbility;
        this.LLILZLL = c1577330r9H;
        this.LLIZ = l2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        C19EG c19eg;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        List listL32;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ2;
        MiniDramaCardInfo miniDramaCardInfo;
        Boolean bool = this.LL.shouldShowCard;
        Boolean bool2 = Boolean.FALSE;
        if (Intrinsics.LJFF(bool, bool2)) {
            C1440005kM.LIZ(new C584950Mwv(true, false, "permission_deny"));
            str = this.LL.notShowCardToast;
        } else {
            str = Intrinsics.LJFF(this.LL.shouldShowInnerFeed, bool2) ? this.LL.notShowInnerFeedToast : null;
        }
        Activity activityLIZ = C1388190mED.LIZ(this.LLILLJJLI);
        if (activityLIZ != null && str != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        if (!Intrinsics.LJFF(this.LL.shouldShowCard, bool2) && !Intrinsics.LJFF(this.LL.shouldShowInnerFeed, bool2)) {
            PaidContentInfo paidContentInfo = this.LLILLL.mPaidContentInfo;
            if (Intrinsics.LJFF((paidContentInfo == null || (miniDramaCardInfo = paidContentInfo.getMiniDramaCardInfo()) == null) ? null : miniDramaCardInfo.cardType, "drama_guide")) {
                Activity activityLIZ2 = C2421209eE.LIZ();
                if (!(activityLIZ2 instanceof C19EG) || (c19eg = (C19EG) activityLIZ2) == null || (mainActivityScopeLIZJ = C0S4U.LIZJ(c19eg)) == null || (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) == null || (listL32 = homeTabAbilityLIZ.l32()) == null) {
                    this.LLILZLL.LIZ(this.LLILLL, this.LLIZ);
                } else {
                    Iterator it2 = listL32.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!Intrinsics.LJFF(((InterfaceC1583870rJp) it2.next()).tag(), "Drama")) {
                            i++;
                        } else if (i >= 0) {
                            ISeriesCommonETService.LIZ.getClass();
                            ISeriesCommonETService iSeriesCommonETServiceLIZ = C718550SGn.LIZ();
                            if (iSeriesCommonETServiceLIZ != null) {
                                C1577310r9F c1577310r9F = C1577310r9F.LIZ;
                                Aweme aweme = this.LLILLL;
                                c1577310r9F.getClass();
                                iSeriesCommonETServiceLIZ.setDramaTabETParam(C2097608Jq.LJIIIIZZ(new Pair("source_series_card_type", C1577310r9F.LIZ(aweme)), new Pair("source_series_card_id", C1577310r9F.LIZIZ(this.LLILLL)), new Pair("source_series_card_button", "collection")));
                            }
                            ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
                            if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ2 = iSeriesFeedServiceLIZIZ.LIZIZ()) != null) {
                                Long l = this.LLILZ;
                                interfaceC1577520r9aLIZIZ2.LJIIJ(l != null ? l.toString() : null, false);
                            }
                            ISeriesFeedService iSeriesFeedServiceLIZIZ2 = C0RRR.LIZIZ();
                            if (iSeriesFeedServiceLIZIZ2 != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ2.LIZIZ()) != null) {
                                C1577310r9F c1577310r9F2 = C1577310r9F.LIZ;
                                Aweme aweme2 = this.LLILLL;
                                c1577310r9F2.getClass();
                                interfaceC1577520r9aLIZIZ.LJ("homepage_hot", "fyf_special_shape_card", C1577310r9F.LIZIZ(aweme2));
                            }
                            HomeViewPagerAbility homeViewPagerAbility = this.LLILZIL;
                            if (homeViewPagerAbility != null) {
                                homeViewPagerAbility.Cl2(i, true, false);
                            }
                        }
                    }
                }
            } else {
                this.LLILZLL.LIZ(this.LLILLL, this.LLIZ);
            }
        }
        return Unit.LIZ;
    }
}
