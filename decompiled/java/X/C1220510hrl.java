package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hrl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentSortListVM$fetchCommentList$8", f = "CommentListAssemVM.kt", l = {752, 849, 878}, m = "invokeSuspend")
public final class C1220510hrl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1344210l5H LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C1220590hrt LLIZLLLIL;
    public final /* synthetic */ C259800zU<C1344500l5k> LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ C118300cf LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1220590hrt>> LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1220510hrl(boolean z, C1344210l5H c1344210l5H, C118300cf c118300cf, String str, String str2, C1220590hrt c1220590hrt, C259800zU<C1344500l5k> c259800zU, boolean z2, int i, String str3, int i2, boolean z3, C118300cf c118300cf2, String str4, InterfaceC1364105Vn<? super AbstractC316870CbV<C1220590hrt>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C1220510hrl> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = z;
        this.LLILZ = c1344210l5H;
        this.LLILZIL = c118300cf;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = c1220590hrt;
        this.LLJ = c259800zU;
        this.LLJI = z2;
        this.LLJIJIL = i;
        this.LLJILJIL = str3;
        this.LLJILJILJ = i2;
        this.LLJILLL = z3;
        this.LLJJ = c118300cf2;
        this.LLJJI = str4;
        this.LLJJIII = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1220510hrl c1220510hrl = new C1220510hrl(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
        c1220510hrl.LLILLJJLI = obj;
        return c1220510hrl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0144  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1220510hrl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
