package X;

import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel$expandMoreItem$3", f = "RepostInteractListViewModel.kt", l = {603}, m = "invokeSuspend")
public final class C1358340lS4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1358360lS6 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ RepostInteractListViewModel LLILZIL;
    public final /* synthetic */ List<RepostReplyStruct> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358340lS4(C1358360lS6 c1358360lS6, int i, int i2, RepostInteractListViewModel repostInteractListViewModel, List<RepostReplyStruct> list, InterfaceC1364105Vn<? super C1358340lS4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1358360lS6;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = repostInteractListViewModel;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1358340lS4(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0267  */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358340lS4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
