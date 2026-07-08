package X;

import com.ss.android.ugc.aweme.tako.TakoInitTask;

/* JADX INFO: renamed from: X.0CrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoInitTask", f = "TakoInitTask.kt", l = {80}, m = "takoInit")
public final class C326680CrK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoInitTask LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326680CrK(TakoInitTask takoInitTask, InterfaceC1364105Vn<? super C326680CrK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = takoInitTask;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoInitTask@e202.takoInit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("TakoInitTask@e202.takoInit$1");
        return objLIZ;
    }
}
