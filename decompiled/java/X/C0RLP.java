package X;

import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.assem.AdAssemUtils;
import com.ss.android.ugc.aweme.commercialize.feed.assem.FeedCommerceAssem;
import com.ss.android.ugc.aweme.commercialize.feed.assem.IAdAssemUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RLP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RLP extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ FeedCommerceAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RLP(FeedCommerceAssem feedCommerceAssem, View view) {
        super(1);
        this.LL = feedCommerceAssem;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Assembler assembler) {
        boolean z;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        C19719912Dl c19719912DlLIZ;
        Assembler assembler2 = assembler;
        assembler2.LQ2(this.LL, new C0RLW());
        assembler2.LQ2(this.LL, new C0RLV());
        assembler2.LQ2(this.LL, new C0RLX());
        IAdAssemUtils iAdAssemUtilsLIZIZ = AdAssemUtils.LIZIZ();
        if (iAdAssemUtilsLIZIZ != null && (c19719912DlLIZ = iAdAssemUtilsLIZIZ.LIZ()) != null) {
            assembler2.LQ2(this.LL, new C0RK1(c19719912DlLIZ));
        }
        Aweme aweme2 = ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme();
        if (aweme2 != null && AwemeExtKt.isAdTraffic(aweme2)) {
            z = true;
        } else {
            z = false;
        }
        if (z && (aweme = ((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme()) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getFollowerLabel() != null) {
            assembler2.MQ2(this.LL, AFwS243S0000000_11.get$arr$(26));
        }
        assembler2.MQ2(this.LL, new C694090RKl());
        if (C07CW.LIZ()) {
            FeedCommerceAssem feedCommerceAssem = this.LL;
            assembler2.LQ2(feedCommerceAssem, new C0RLO(feedCommerceAssem, this.LLILLJJLI));
        }
        FeedCommerceAssem feedCommerceAssem2 = this.LL;
        assembler2.KQ2(feedCommerceAssem2, new C0RLU(feedCommerceAssem2));
        if (!C294480BgU.LIZIZ() && ((baseFeedPageParams = ((VideoItemParams) C631370Opb.LIZ(this.LL)).baseFeedPageParams) == null || (c2189821An6 = baseFeedPageParams.param) == null || c2189821An6.getAdBISurveyLandingPage() == null)) {
            FeedCommerceAssem feedCommerceAssem3 = this.LL;
            assembler2.LQ2(feedCommerceAssem3, new C0RLQ(feedCommerceAssem3));
        }
        FeedCommerceAssem feedCommerceAssem4 = this.LL;
        assembler2.KQ2(feedCommerceAssem4, new C0RLR(feedCommerceAssem4));
        FeedCommerceAssem feedCommerceAssem5 = this.LL;
        assembler2.KQ2(feedCommerceAssem5, new C0RLS(feedCommerceAssem5));
        FeedCommerceAssem feedCommerceAssem6 = this.LL;
        assembler2.KQ2(feedCommerceAssem6, new C0RLT(feedCommerceAssem6));
        FeedCommerceAssem feedCommerceAssem7 = this.LL;
        assembler2.KQ2(feedCommerceAssem7, new AwS590S0100000_11(feedCommerceAssem7, 45));
        FeedCommerceAssem feedCommerceAssem8 = this.LL;
        assembler2.KQ2(feedCommerceAssem8, new AwS590S0100000_11(feedCommerceAssem8, 46));
        if (!Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_text")) {
            if (Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_photos")) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    if (!SettingsManager.LIZ("commerce_interaction_repeat_create_optimize_setting", true)) {
                        FeedCommerceAssem feedCommerceAssem9 = this.LL;
                        assembler2.LQ2(feedCommerceAssem9, new AwS590S0100000_11(feedCommerceAssem9, 47));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                }
            }
        } else {
            FeedCommerceAssem feedCommerceAssem92 = this.LL;
            assembler2.LQ2(feedCommerceAssem92, new AwS590S0100000_11(feedCommerceAssem92, 47));
        }
        if (Intrinsics.LJFF(this.LL.jm().LIZ(), "cell_photos")) {
            FeedCommerceAssem feedCommerceAssem10 = this.LL;
            assembler2.LQ2(feedCommerceAssem10, new AwS590S0100000_11(feedCommerceAssem10, 48));
        }
        if (!C693680RIw.LIZ() && this.LL.LJJIJL().findViewById(R.id.b4o) != null) {
            C0RJE.LIZJ(assembler2, this.LL, new AwS590S0100000_11(this.LL.ep().LJFF(), (C13IQ<? extends BaseCellTriggerComponent<? extends C03H5>>) 49));
        }
        if (C1017070cZd.LLJJ(((VideoItemParams) C631370Opb.LIZ(this.LL)).getAweme())) {
            FeedCommerceAssem feedCommerceAssem11 = this.LL;
            assembler2.KQ2(feedCommerceAssem11, new AwS590S0100000_11(feedCommerceAssem11, 50));
        }
        FeedCommerceAssem feedCommerceAssem12 = this.LL;
        assembler2.LQ2(feedCommerceAssem12, new AwS590S0100000_11(feedCommerceAssem12, 51));
        return Unit.LIZ;
    }
}
