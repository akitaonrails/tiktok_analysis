package X;

import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rjC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1599600rjC extends C2217421BqW implements Function1<C626160OhC, Unit> {
    public final /* synthetic */ SkylightListViewModel LL;
    public final /* synthetic */ C1598650rhf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1599600rjC(SkylightListViewModel skylightListViewModel, C1598650rhf c1598650rhf) {
        super(1, C1449605lu.class, "onSuccess2", "subscribeState$onSuccess2(Lcom/ss/android/ugc/aweme/inbox/skylight/plat/SkylightListViewModel;Lcom/ss/android/ugc/aweme/inbox/widget/multi/vh/SkylightContainerVH;Lcom/bytedance/ext_power_list/LoadingState;)V", 0);
        this.LL = skylightListViewModel;
        this.LLILLJJLI = c1598650rhf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C626160OhC c626160OhC) {
        C1598650rhf.c6(this.LL, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
