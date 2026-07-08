package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.tab.v2.DramaPicksRepo$getLoadMoreData$resp$1", f = "DramaPicksRepo.kt", l = {DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL}, m = "invokeSuspend")
public final class C591890NJj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SeriesFeedResp>, Object> {
    public int LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591890NJj(Integer num, List<String> list, List<String> list2, List<String> list3, boolean z, InterfaceC1364105Vn<? super C591890NJj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = num;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = list3;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591890NJj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("DramaPicksRepo@bee8.getLoadMoreData$resp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C1574280r4M.LIZ.getClass();
            SeriesFeedRepository seriesFeedRepository = (SeriesFeedRepository) C1574280r4M.LIZIZ.getValue();
            Integer num = this.LLILLJJLI;
            List<String> list = this.LLILLL;
            List<String> list2 = this.LLILZ;
            List<String> list3 = this.LLILZIL;
            boolean z = this.LLILZLL;
            this.LL = 1;
            objLIZ = seriesFeedRepository.LIZ(2, false, false, null, "load_more", num, list, list2, list3, true, 0, z, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("DramaPicksRepo@bee8.getLoadMoreData$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DramaPicksRepo@bee8.getLoadMoreData$resp$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SeriesFeedResp> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
