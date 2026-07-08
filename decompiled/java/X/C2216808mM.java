package X;

import com.ss.android.ugc.aweme.mixsearch.IMixSearchService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08mM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.section.LocalSearchUserChunk$subscribeToSearch$2$1$1", f = "LocalSearchUserChunk.kt", l = {64}, m = "invokeSuspend")
public final class C2216808mM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C316810CbP>, Object> {
    public int LL;
    public final /* synthetic */ IMixSearchService LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2216808mM(IMixSearchService iMixSearchService, String str, InterfaceC1364105Vn<? super C2216808mM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMixSearchService;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2216808mM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LocalSearchUserChunk@7804.subscribeToSearch$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IMixSearchService iMixSearchService = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = iMixSearchService.LIZJ(str, C13BV.INSTANCE, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LocalSearchUserChunk@7804.subscribeToSearch$2$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("LocalSearchUserChunk@7804.subscribeToSearch$2$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C316810CbP> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
