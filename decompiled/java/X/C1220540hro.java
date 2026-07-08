package X;

import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentSortListVM$fetchCommentList$1", f = "CommentListAssemVM.kt", l = {613, 616, 618, 636}, m = "invokeSuspend")
public final class C1220540hro extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1344210l5H LL;
    public Object LLILLJJLI;
    public C1220590hrt LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public InterfaceC1364105Vn LLILZLL;
    public CommentItemList LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public /* synthetic */ Object LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ C1344210l5H LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ C1220590hrt LLJJI;
    public final /* synthetic */ String LLJJIII;
    public final /* synthetic */ String LLJJIJI;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1220590hrt>> LLJJIJIIJIL;
    public final /* synthetic */ int LLJJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1220540hro(String str, C1344210l5H c1344210l5H, boolean z, String str2, C1220590hrt c1220590hrt, String str3, String str4, InterfaceC1364105Vn<? super AbstractC316870CbV<C1220590hrt>> interfaceC1364105Vn, int i, InterfaceC1364105Vn<? super C1220540hro> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLJILJIL = str;
        this.LLJILJILJ = c1344210l5H;
        this.LLJILLL = z;
        this.LLJJ = str2;
        this.LLJJI = c1220590hrt;
        this.LLJJIII = str3;
        this.LLJJIJI = str4;
        this.LLJJIJIIJIL = interfaceC1364105Vn;
        this.LLJJIJIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1220540hro c1220540hro = new C1220540hro(this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, interfaceC1364105Vn);
        c1220540hro.LLJIJIL = obj;
        return c1220540hro;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1220540hro.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
