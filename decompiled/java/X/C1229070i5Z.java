package X;

import com.ss.android.ugc.aweme.publicgroup.data.GroupCompositeType;

/* JADX INFO: renamed from: X.0i5Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.manager.PublicGroupStateManager", f = "PublicGroupStateManager.kt", l = {200}, m = "checkEntranceValid")
public final class C1229070i5Z extends AbstractC23140094w {
    public GroupCompositeType LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1229040i5W LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1229070i5Z(C1229040i5W c1229040i5W, InterfaceC1364105Vn<? super C1229070i5Z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1229040i5W;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PublicGroupStateManager@ce.checkEntranceValid$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("PublicGroupStateManager@ce.checkEntranceValid$1");
        return objLIZIZ;
    }
}
