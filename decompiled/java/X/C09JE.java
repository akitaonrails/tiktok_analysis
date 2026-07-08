package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09JE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl$retryDownloadByTaskId$1", f = "CreationAsyncTaskManagerImpl.kt", l = {}, m = "invokeSuspend")
public final class C09JE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CreationAsyncTaskManagerImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09JE(CreationAsyncTaskManagerImpl creationAsyncTaskManagerImpl, String str, String str2, InterfaceC1364105Vn<? super C09JE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = creationAsyncTaskManagerImpl;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09JE(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskManagerImpl@3207.retryDownloadByTaskId$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC542770LQl<C09JG, AbsTaskOutput> interfaceC542770LQl = this.LL.LIZIZ.get(this.LLILLJJLI);
        if (interfaceC542770LQl == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.retryDownloadByTaskId$1");
            return unit;
        }
        this.LL.LJJJ(interfaceC542770LQl, new C09JF(this.LLILLL));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.retryDownloadByTaskId$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
