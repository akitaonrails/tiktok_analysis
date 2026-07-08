package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.vm.SubOnlyLiveVipListVM;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JYZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JYZ extends C09AY implements Function1<C0JBB, C0JBB> {
    public final /* synthetic */ SubOnlyLiveVipListVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JYZ(SubOnlyLiveVipListVM subOnlyLiveVipListVM) {
        super(1);
        this.LL = subOnlyLiveVipListVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JBB invoke(C0JBB c0jbb) {
        SubOnlyLiveVipListVM subOnlyLiveVipListVM = this.LL;
        return C0JBB.LIZ(c0jbb, 1, null, null, subOnlyLiveVipListVM.LLILLL, subOnlyLiveVipListVM.LLILZ, null, null, 102);
    }
}
