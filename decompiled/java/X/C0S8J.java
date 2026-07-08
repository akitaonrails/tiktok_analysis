package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S8J, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl$fetchListOfAwemesVhs$5$fetchJobs$2$deferred$1", f = "PaidContentVideoHotSwapServiceImpl.kt", l = {368}, m = "invokeSuspend")
public final class C0S8J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C0S81> LLILLL;
    public final /* synthetic */ Function2<List<? extends Aweme>, Boolean, Unit> LLILZ;
    public final /* synthetic */ List<C0S81> LLILZIL;
    public final /* synthetic */ PaidContentVideoHotSwapServiceImpl LLILZLL;
    public final /* synthetic */ C0S8O LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0S8J(List<C0S81> list, Function2<? super List<? extends Aweme>, ? super Boolean, Unit> function2, List<C0S81> list2, PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl, C0S8O c0s8o, InterfaceC1364105Vn<? super C0S8J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = function2;
        this.LLILZIL = list2;
        this.LLILZLL = paidContentVideoHotSwapServiceImpl;
        this.LLIZ = c0s8o;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0S8J c0s8j = new C0S8J(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0s8j.LLILLJJLI = obj;
        return c0s8j;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0108 A[LOOP:2: B:37:0x0102->B:39:0x0108, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e A[LOOP:3: B:41:0x0128->B:43:0x012e, LOOP_END] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0S8J.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
