package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dam, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.perf.FindFriendsBehaviorMonitor", f = "FindFriendsBehaviorMonitor.kt", l = {144, 144}, m = "invokeContactAPI")
public final class C1056220dam<T> extends AbstractC23140094w {
    public Function1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1056210dal LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056220dam(C1056210dal c1056210dal, InterfaceC1364105Vn<? super C1056220dam> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1056210dal;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindFriendsBehaviorMonitor@e3e.invokeContactAPI$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(this, null);
        C1C7U.LIZIZ("FindFriendsBehaviorMonitor@e3e.invokeContactAPI$1");
        return objLIZLLL;
    }
}
