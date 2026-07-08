package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01pX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.CreationAsyncTaskManagerImpl$getAIGCQuota$2$1", f = "CreationAsyncTaskManagerImpl.kt", l = {}, m = "invokeSuspend")
public final class C452901pX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Pair<Integer, Integer>, Unit> LL;
    public final /* synthetic */ Pair<Integer, Integer> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C452901pX(Function1<? super Pair<Integer, Integer>, Unit> function1, Pair<Integer, Integer> pair, InterfaceC1364105Vn<? super C452901pX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = pair;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C452901pX(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationAsyncTaskManagerImpl@3207.getAIGCQuota$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationAsyncTaskManagerImpl@3207.getAIGCQuota$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
