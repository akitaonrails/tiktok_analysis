package X;

import com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService;
import com.ss.android.ugc.aweme.base.vm.MentionListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.MentionListViewModel$mixSearchRefresh$2$sugDeferred$1", f = "MentionListViewModel.kt", l = {507}, m = "invokeSuspend")
public final class C0CZZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C237600vu>, Object> {
    public int LL;
    public final /* synthetic */ MentionListViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CZZ(MentionListViewModel mentionListViewModel, long j, String str, InterfaceC1364105Vn<? super C0CZZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mentionListViewModel;
        this.LLILLL = j;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CZZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionListViewModel@ff55.mixSearchRefresh$2$sugDeferred$1");
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
            HorizontalMentionMixSearchService horizontalMentionMixSearchServiceWQ2 = this.LLILLJJLI.wQ2();
            MentionListViewModel mentionListViewModel = this.LLILLJJLI;
            String str = mentionListViewModel.LLILLJJLI;
            C13BV c13bv = C13BV.INSTANCE;
            long j = this.LLILLL;
            String str2 = this.LLILZ;
            C20612815lG c20612815lG = mentionListViewModel.LL;
            this.LL = 1;
            obj = horizontalMentionMixSearchServiceWQ2.LJIIL(str, c13bv, j, str2, c20612815lG, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MentionListViewModel@ff55.mixSearchRefresh$2$sugDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MentionListViewModel@ff55.mixSearchRefresh$2$sugDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C237600vu> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
