package X;

import com.ss.android.ugc.aweme.tako.TakoNewInitTask;

/* JADX INFO: renamed from: X.058A, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoNewInitTask", f = "TakoNewInitTask.kt", l = {42}, m = "takoInit")
public final class C058A extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoNewInitTask LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C058A(TakoNewInitTask takoNewInitTask, InterfaceC1364105Vn<? super C058A> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = takoNewInitTask;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoNewInitTask@cd8f.takoInit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("TakoNewInitTask@cd8f.takoInit$1");
        return objLIZ;
    }
}
