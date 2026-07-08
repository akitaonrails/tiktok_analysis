package X;

import Y.AkS485S0100000_24;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.minidrama.common.component.service.MiniDramaLimitedFreePopUpConfig;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedApi;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository;
import com.ss.android.ugc.aweme.series.innerfeed.recommend.DramaFeedRecommendService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rAv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578350rAv extends C09AY implements Function0<SeriesFeedResp> {
    public final /* synthetic */ int LL = 1;
    public final /* synthetic */ String LLILLJJLI = "init_preload";
    public final /* synthetic */ boolean LLILLL = false;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1578350rAv(boolean z) {
        super(0);
        this.LLILZ = z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final SeriesFeedResp invoke() throws ExecutionException, InterruptedException {
        ArrayList arrayList;
        SkylightBlocks skylightBlocksLIZLLL;
        MiniDramaLimitedFreePopUpConfig miniDramaLimitedFreePopUpConfig;
        C1578240rAk c1578240rAk;
        C1578530rBD c1578530rBD;
        String str;
        C1577130r8x c1577130r8x;
        C1578240rAk c1578240rAk2;
        List<Aweme> items;
        SeriesFeedApi seriesFeedApi = SeriesFeedApi.LIZIZ;
        boolean z = this.LL == 1;
        SeriesFeedRepository seriesFeedRepository = SeriesFeedRepository.LIZ;
        boolean zLJFF = Intrinsics.LJFF(this.LLILLJJLI, "init_preload");
        seriesFeedRepository.getClass();
        C1578310rAr c1578310rAr = DramaFeedRecommendService.LIZ;
        c1578310rAr.getClass();
        long jLIZJ = C1578310rAr.LIZ().LIZJ(zLJFF);
        c1578310rAr.getClass();
        String strLIZ = C1578310rAr.LIZ().LIZ();
        boolean z2 = this.LLILLL;
        String str2 = this.LLILLJJLI;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        ComposePbAndJson<C1578410rB1, FeedItemList> composePbAndJson = seriesFeedApi.preloadSeriesFeedList(12, z, jLIZJ, strLIZ, z2 ? 1 : 0, str2, true, this.LLILZ).get();
        Integer numValueOf = Integer.valueOf(this.LL);
        String str4 = C1605000rru.LIZ;
        FeedItemList feedItemListLIZJ = composePbAndJson.LIZJ(new AkS485S0100000_24(numValueOf, 3));
        SkylightBlocks skylightBlocksLIZLLL2 = null;
        if (feedItemListLIZJ == null || (items = feedItemListLIZJ.getItems()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C15438062q.LJIJJ(items, 10));
            for (Aweme aweme : items) {
                AwemeExtKt.appendMobParam(aweme, "enter_from", "homepage_series");
                arrayList.add(aweme);
            }
        }
        List list = arrayList;
        if (arrayList == null) {
            list = C13BV.INSTANCE;
        }
        Boolean boolValueOf = Boolean.valueOf(feedItemListLIZJ != null && feedItemListLIZJ.hasMore == 1);
        C1578410rB1 c1578410rB1 = (C1578410rB1) composePbAndJson.LLILLJJLI;
        if (c1578410rB1 == null || (c1578240rAk2 = c1578410rB1.skylight_model) == null) {
            skylightBlocksLIZLLL = null;
        } else {
            SeriesFeedRepository.LIZ.getClass();
            skylightBlocksLIZLLL = SeriesFeedRepository.LIZLLL(c1578240rAk2);
        }
        C1578410rB1 c1578410rB12 = (C1578410rB1) composePbAndJson.LLILLJJLI;
        Boolean boolValueOf2 = Boolean.valueOf(c1578410rB12 != null ? Intrinsics.LJFF(c1578410rB12.should_show_limited_free_pop, Boolean.TRUE) : false);
        C1578410rB1 c1578410rB13 = (C1578410rB1) composePbAndJson.LLILLJJLI;
        if (c1578410rB13 == null || (c1577130r8x = c1578410rB13.limited_free_pop_up_config) == null) {
            miniDramaLimitedFreePopUpConfig = null;
        } else {
            SeriesFeedRepository.LIZ.getClass();
            miniDramaLimitedFreePopUpConfig = new MiniDramaLimitedFreePopUpConfig(c1577130r8x.title, c1577130r8x.sub_title, c1577130r8x.button_text, c1577130r8x.highlight_text, c1577130r8x.highlight_color, c1577130r8x.pop_up_image_url);
        }
        C1578410rB1 c1578410rB14 = (C1578410rB1) composePbAndJson.LLILLJJLI;
        if (c1578410rB14 != null && (c1578530rBD = c1578410rB14.log_pb) != null && (str = c1578530rBD.impr_id) != null) {
            str3 = str;
        }
        LogPbBean logPbBean = new LogPbBean(str3);
        C1578410rB1 c1578410rB15 = (C1578410rB1) composePbAndJson.LLILLJJLI;
        if (c1578410rB15 != null && (c1578240rAk = c1578410rB15.skylight_model_v2) != null) {
            SeriesFeedRepository.LIZ.getClass();
            skylightBlocksLIZLLL2 = SeriesFeedRepository.LIZLLL(c1578240rAk);
        }
        return new SeriesFeedResp(list, boolValueOf, skylightBlocksLIZLLL, boolValueOf2, miniDramaLimitedFreePopUpConfig, logPbBean, null, "", null, null, null, skylightBlocksLIZLLL2, null, 0);
    }
}
