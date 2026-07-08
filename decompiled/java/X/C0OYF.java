package X;

import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OYF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentListViewModel$clickExpandSecondlyCommentButton$2", f = "BulletinCommentListViewModel.kt", l = {259}, m = "invokeSuspend")
public final class C0OYF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0OTS LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLILLL;
    public final /* synthetic */ C0OYG LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C0OYG LLILZLL;
    public final /* synthetic */ BulletinCommentListViewModel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OYF(List<InterfaceC1891350zJl> list, C0OYG c0oyg, int i, C0OYG c0oyg2, BulletinCommentListViewModel bulletinCommentListViewModel, InterfaceC1364105Vn<? super C0OYF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c0oyg;
        this.LLILZIL = i;
        this.LLILZLL = c0oyg2;
        this.LLIZ = bulletinCommentListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OYF(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02db A[PHI: r3
      0x02db: PHI (r3v14 java.util.ArrayList) = (r3v13 java.util.ArrayList), (r3v18 java.util.ArrayList) binds: [B:58:0x0130, B:60:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 1061
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0OYF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
