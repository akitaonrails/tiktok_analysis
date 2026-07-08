package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05AC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.SkylightFriendsStoryDataCenter$closePagedReadHandle$1", f = "SkylightFriendsStoryDataCenter.kt", l = {331}, m = "invokeSuspend")
public final class C05AC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1455405mq<InterfaceC1891350zJl> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05AC(InterfaceC1455405mq<InterfaceC1891350zJl> interfaceC1455405mq, InterfaceC1364105Vn<? super C05AC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1455405mq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05AC c05ac = new C05AC(this.LLILLL, interfaceC1364105Vn);
        c05ac.LLILLJJLI = obj;
        return c05ac;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightFriendsStoryDataCenter@6193.closePagedReadHandle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC1455405mq<InterfaceC1891350zJl> interfaceC1455405mq = this.LLILLL;
                this.LL = 1;
                if (interfaceC1455405mq.LIZIZ(this) == objLJFF) {
                    C1C7U.LIZIZ("SkylightFriendsStoryDataCenter@6193.closePagedReadHandle$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightFriendsStoryDataCenter@6193.closePagedReadHandle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
