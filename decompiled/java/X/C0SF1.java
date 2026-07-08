package X;

import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SF1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SF1 extends C09AY implements Function1<Object, Unit> {
    public final /* synthetic */ C718770SHj LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SF1(C718770SHj c718770SHj, Aweme aweme) {
        super(1);
        this.LL = c718770SHj;
        this.LLILLJJLI = aweme;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        if (obj instanceof TextExtraStruct) {
            C21415018rM c21415018rM = this.LL.LLJZ;
            if (c21415018rM == null) {
                c21415018rM = null;
            }
            this.LL.LLILLJJLI.KQ2((TextExtraStruct) obj, C2211631BhB.LJIJ(c21415018rM, "c6053", "d2507", null, null));
        } else if (Intrinsics.LJFF(obj, C0GWY.class) && !((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJIIIZ(this.LLILLJJLI)) {
            this.LL.LLILLJJLI.LQ2();
            new AwS555S0100000_11(this.LLILLJJLI, 1555).invoke();
        }
        return Unit.LIZ;
    }
}
