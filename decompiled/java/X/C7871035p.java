package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.035p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7871035p extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7871035p(String str, OrderSubmitAssemViewModel orderSubmitAssemViewModel, String str2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = orderSubmitAssemViewModel;
        this.LLILLL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (Intrinsics.LJFF(this.LL, "place_order")) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLILLJJLI;
            orderSubmitAssemViewModel.withState(new AwS580S0100000_1(orderSubmitAssemViewModel, 391));
        }
        if (this.LLILLL != null) {
            this.LLILLJJLI.f351h0 = false;
        }
        this.LLILLJJLI.setState(AFwS228S0000000_1.get$arr$(432));
        return Unit.LIZ;
    }
}
