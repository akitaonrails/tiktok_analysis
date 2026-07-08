package X;

import Y.AkS485S0100000_24;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.feed.model.VideoControl;
import com.ss.android.ugc.aweme.minidrama.common.component.service.MiniDramaLimitedFreePopUpConfig;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedApi;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository;
import com.ss.android.ugc.aweme.series.innerfeed.recommend.DramaFeedRecommendService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0rAw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository$fetchFeedList$2", f = "SeriesFeedRepo.kt", l = {}, m = "invokeSuspend")
public final class C1578360rAw extends C09AX implements Function1<InterfaceC1364105Vn<? super SeriesFeedResp>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ List<String> LLILZLL;
    public final /* synthetic */ List<String> LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1578360rAw(int i, String str, boolean z, String str2, Integer num, List<String> list, List<String> list2, List<String> list3, boolean z2, boolean z3, InterfaceC1364105Vn<? super C1578360rAw> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = str2;
        this.LLILZIL = num;
        this.LLILZLL = list;
        this.LLIZ = list2;
        this.LLIZLLLIL = list3;
        this.LLJ = z2;
        this.LLJI = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1578360rAw(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super SeriesFeedResp> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws ExecutionException, InterruptedException {
        boolean z;
        int iIntValue;
        ArrayList arrayList;
        String str;
        boolean z2;
        SkylightBlocks skylightBlocksLIZLLL;
        boolean zLJFF;
        MiniDramaLimitedFreePopUpConfig miniDramaLimitedFreePopUpConfig;
        Integer num;
        String str2;
        C1577130r8x c1577130r8x;
        C1578240rAk c1578240rAk;
        C1578530rBD c1578530rBD;
        List<Aweme> items;
        List<Aweme> items2;
        VideoControl videoControl;
        C1C7U.LIZ("SeriesFeedRepository@2c07.fetchFeedList$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SeriesFeedApi seriesFeedApi = SeriesFeedApi.LIZIZ;
        if (this.LL == 1) {
            z = true;
        } else {
            z = false;
        }
        SeriesFeedRepository seriesFeedRepository = SeriesFeedRepository.LIZ;
        boolean zLJFF2 = Intrinsics.LJFF(this.LLILLJJLI, "init_preload");
        seriesFeedRepository.getClass();
        C1578310rAr c1578310rAr = DramaFeedRecommendService.LIZ;
        c1578310rAr.getClass();
        long jLIZJ = C1578310rAr.LIZ().LIZJ(zLJFF2);
        c1578310rAr.getClass();
        String strLIZ = C1578310rAr.LIZ().LIZ();
        boolean z3 = this.LLILLL;
        String str3 = this.LLILZ;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.LLILLJJLI;
        if (str4 == null) {
            str4 = "";
        }
        Integer num2 = this.LLILZIL;
        if (num2 != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        Iterable iterable = this.LLILZLL;
        if (iterable == null) {
            iterable = C13BV.INSTANCE;
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(iterable, ",", null, null, 0, null, null, 62);
        Iterable iterable2 = this.LLIZ;
        if (iterable2 == null) {
            iterable2 = C13BV.INSTANCE;
        }
        String strLJJLIIIJ2 = C13LP.LJJLIIIJ(iterable2, ",", null, null, 0, null, null, 62);
        Iterable iterable3 = this.LLIZLLLIL;
        if (iterable3 == null) {
            iterable3 = C13BV.INSTANCE;
        }
        ComposePbAndJson<C1578400rB0, FeedItemList> composePbAndJson = seriesFeedApi.fetchSeriesFeedList(12, z, jLIZJ, strLIZ, z3 ? 1 : 0, str3, str4, iIntValue, strLJJLIIIJ, strLJJLIIIJ2, C13LP.LJJLIIIJ(iterable3, ",", null, null, 0, null, null, 62), this.LLJ, false, "", false, 1, this.LLJI).get();
        Integer numLJ = C2286608xc.LJ(this.LL);
        String str5 = C1605000rru.LIZ;
        FeedItemList feedItemListLIZJ = composePbAndJson.LIZJ(new AkS485S0100000_24(numLJ, 0));
        C1578370rAx.LIZ.getClass();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "short_drama_struct_preprocess", true, false) && feedItemListLIZJ != null && (items2 = feedItemListLIZJ.getItems()) != null) {
            for (Aweme aweme : items2) {
                if (aweme != null) {
                    PaidContentInfo paidContentInfo = aweme.mPaidContentInfo;
                    if (paidContentInfo != null) {
                        C718180SFc.LIZ(paidContentInfo);
                    }
                    if (C718190SFd.LIZLLL(aweme, "homepage_series") && (videoControl = aweme.getVideoControl()) != null) {
                        videoControl.showProgressBar = 0;
                    }
                }
            }
        }
        String str6 = null;
        if (feedItemListLIZJ != null && (items = feedItemListLIZJ.getItems()) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(items, 10));
            for (Aweme aweme2 : items) {
                AwemeExtKt.appendMobParam(aweme2, "enter_from", "homepage_series");
                aweme2.setRequestId(feedItemListLIZJ.getRequestId());
                arrayList.add(aweme2);
            }
        } else {
            arrayList = null;
        }
        C1578400rB0 c1578400rB0 = (C1578400rB0) composePbAndJson.LLILLJJLI;
        if (c1578400rB0 == null || (c1578530rBD = c1578400rB0.log_pb) == null || (str = c1578530rBD.impr_id) == null) {
            str = "";
        }
        LogPbBean logPbBean = new LogPbBean(str);
        C584850Mwl.LIZ.LJI(feedItemListLIZJ.getRequestId(), logPbBean);
        List list = arrayList;
        if (arrayList == null) {
            list = C13BV.INSTANCE;
        }
        if (feedItemListLIZJ.hasMore == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z2);
        C1578400rB0 c1578400rB02 = (C1578400rB0) composePbAndJson.LLILLJJLI;
        if (c1578400rB02 != null && (c1578240rAk = c1578400rB02.skylight_model) != null) {
            SeriesFeedRepository.LIZ.getClass();
            skylightBlocksLIZLLL = SeriesFeedRepository.LIZLLL(c1578240rAk);
        } else {
            skylightBlocksLIZLLL = null;
        }
        C1578400rB0 c1578400rB03 = (C1578400rB0) composePbAndJson.LLILLJJLI;
        if (c1578400rB03 != null) {
            zLJFF = Intrinsics.LJFF(c1578400rB03.should_show_limited_free_pop, true);
        } else {
            zLJFF = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(zLJFF);
        C1578400rB0 c1578400rB04 = (C1578400rB0) composePbAndJson.LLILLJJLI;
        if (c1578400rB04 != null && (c1577130r8x = c1578400rB04.limited_free_pop_up_config) != null) {
            SeriesFeedRepository.LIZ.getClass();
            miniDramaLimitedFreePopUpConfig = new MiniDramaLimitedFreePopUpConfig(c1577130r8x.title, c1577130r8x.sub_title, c1577130r8x.button_text, c1577130r8x.highlight_text, c1577130r8x.highlight_color, c1577130r8x.pop_up_image_url);
        } else {
            miniDramaLimitedFreePopUpConfig = null;
        }
        C1578400rB0 c1578400rB05 = (C1578400rB0) composePbAndJson.LLILLJJLI;
        if (c1578400rB05 != null) {
            num = c1578400rB05.drama_tab_block_reason;
            str2 = c1578400rB05.drama_tab_block_text;
            str6 = c1578400rB05.feedback_link;
        } else {
            num = null;
            str2 = null;
        }
        SeriesFeedResp seriesFeedResp = new SeriesFeedResp(list, boolValueOf, skylightBlocksLIZLLL, boolValueOf2, miniDramaLimitedFreePopUpConfig, logPbBean, null, "", num, str2, str6, null, null, 0);
        C1C7U.LIZIZ("SeriesFeedRepository@2c07.fetchFeedList$2");
        return seriesFeedResp;
    }
}
