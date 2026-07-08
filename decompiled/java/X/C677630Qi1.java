package X;

import android.content.Context;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qi1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.BaseMixLoadMoreRepo$doLoadMoreChunkRequest$1$2$1$onNext$1$1", f = "BaseMixLoadMoreRepo.kt", l = {428, 464}, m = "invokeSuspend")
public final class C677630Qi1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LinkedBlockingQueue<AnonymousClass0957<C1399005dk>> LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ C675270QeD LLILZIL;
    public final /* synthetic */ AbstractC677510Qhp LLILZLL;
    public final /* synthetic */ MixPageViewModel LLIZ;
    public final /* synthetic */ n LLIZLLLIL;
    public final /* synthetic */ Context LLJ;
    public final /* synthetic */ C677540Qhs LLJI;
    public final /* synthetic */ n LLJIJIL;
    public final /* synthetic */ Map<String, Object> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677630Qi1(LinkedBlockingQueue<AnonymousClass0957<C1399005dk>> linkedBlockingQueue, C013C c013c, C675270QeD c675270QeD, AbstractC677510Qhp abstractC677510Qhp, MixPageViewModel mixPageViewModel, n nVar, Context context, C677540Qhs c677540Qhs, n nVar2, Map<String, Object> map, InterfaceC1364105Vn<? super C677630Qi1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = linkedBlockingQueue;
        this.LLILZ = c013c;
        this.LLILZIL = c675270QeD;
        this.LLILZLL = abstractC677510Qhp;
        this.LLIZ = mixPageViewModel;
        this.LLIZLLLIL = nVar;
        this.LLJ = context;
        this.LLJI = c677540Qhs;
        this.LLJIJIL = nVar2;
        this.LLJILJIL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C677630Qi1 c677630Qi1 = new C677630Qi1(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c677630Qi1.LLILLJJLI = obj;
        return c677630Qi1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008a -> B:22:0x0093). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0140 -> B:44:0x0125). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:50:0x015d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C677630Qi1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
