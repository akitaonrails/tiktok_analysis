package X;

import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import com.ss.android.ugc.aweme.series.feed.tab.common.repo.SeriesFeedRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.tab.v2.DramaPicksRepo$getInitFetchData$resp$res$2", f = "DramaPicksRepo.kt", l = {136}, m = "invokeSuspend")
public final class C591880NJi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SeriesFeedResp>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591880NJi(boolean z, String str, C259800zU<String> c259800zU, boolean z2, InterfaceC1364105Vn<? super C591880NJi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = c259800zU;
        this.LLILZIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591880NJi(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("DramaPicksRepo@bee8.getInitFetchData$resp$res$2");
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
            boolean z = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ.element;
            C13BV c13bv = C13BV.INSTANCE;
            boolean z2 = this.LLILZIL;
            this.LL = 1;
            objLIZ = seriesFeedRepository.LIZ(1, true, z, str, str2, null, null, c13bv, c13bv, true, 0, z2, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("DramaPicksRepo@bee8.getInitFetchData$resp$res$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DramaPicksRepo@bee8.getInitFetchData$resp$res$2");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SeriesFeedResp> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
