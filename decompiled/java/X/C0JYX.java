package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.vm.SubOnlyLiveVipListVM;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JYX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JYX extends C09AY implements Function1<C0JBB, C0JBB> {
    public final /* synthetic */ SubOnlyLiveVipListVM LL;
    public final /* synthetic */ AbstractC1623806Xk<Boolean> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JYX(SubOnlyLiveVipListVM subOnlyLiveVipListVM, AbstractC1623806Xk<Boolean> abstractC1623806Xk) {
        super(1);
        this.LL = subOnlyLiveVipListVM;
        this.LLILLJJLI = abstractC1623806Xk;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JBB invoke(C0JBB c0jbb) {
        int i;
        Object objValueOf;
        int i2;
        C0JBB c0jbb2 = c0jbb;
        C493830JYf c493830JYf = this.LL.LLIZ;
        if (c493830JYf != null) {
            i = c493830JYf.LIZIZ;
            objValueOf = Integer.valueOf(c493830JYf.LIZIZ);
        } else {
            i = 1;
            objValueOf = 0L;
        }
        if (Intrinsics.LJFF(objValueOf, 0)) {
            i2 = this.LL.LLILZIL;
        } else {
            i2 = this.LL.LLILZ;
        }
        ArrayList arrayList = new ArrayList();
        SubOnlyLiveVipListVM subOnlyLiveVipListVM = this.LL;
        if (!((ArrayList) subOnlyLiveVipListVM.LLILZLL).isEmpty()) {
            arrayList.add(C497740JfY.LJIJI(2131857045));
        }
        if (true ^ ((ArrayList) subOnlyLiveVipListVM.LLILLL).isEmpty()) {
            arrayList.add(C497740JfY.LJIJI(2131857044));
        }
        return C0JBB.LIZ(c0jbb2, i, this.LLILLJJLI, c493830JYf, null, i2, null, arrayList, 40);
    }
}
