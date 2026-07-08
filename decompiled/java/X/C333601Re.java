package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.util.CommentThreadUtil$callInBackground$1", f = "CommentThreadUtil.kt", l = {21}, m = "invokeSuspend")
public final class C333601Re extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Runnable LLILLJJLI;
    public final /* synthetic */ Runnable LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C333601Re(Runnable runnable, Runnable runnable2, InterfaceC1364105Vn<? super C333601Re> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = runnable;
        this.LLILLL = runnable2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C333601Re(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentThreadUtil@2101.callInBackground$1");
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
            this.LLILLJJLI.run();
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C333701Rf c333701Rf = new C333701Rf(this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c333701Rf) == objLJFF) {
                C1C7U.LIZIZ("CommentThreadUtil@2101.callInBackground$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentThreadUtil@2101.callInBackground$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
