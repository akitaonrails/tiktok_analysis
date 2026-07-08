package X;

import com.ss.android.ugc.aweme.base.vm.MentionListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CZV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.MentionListViewModel$packMentionRecommendUsersWithCache$2", f = "MentionListViewModel.kt", l = {363, 364}, m = "invokeSuspend")
public final class C0CZV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C20611915l7>>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ MentionListViewModel LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CZV(MentionListViewModel mentionListViewModel, long j, InterfaceC1364105Vn<? super C0CZV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = mentionListViewModel;
        this.LLIZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CZV c0czv = new C0CZV(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c0czv.LLILZIL = obj;
        return c0czv;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017f A[LOOP:2: B:54:0x0179->B:56:0x017f, LOOP_END] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CZV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C20611915l7>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
