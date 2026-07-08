package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceRes;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceResCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData;

/* JADX INFO: renamed from: X.0w8h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.task.uitask.impl.TooltipTask", f = "TooltipTask.kt", l = {100, 121, 171}, m = "show")
public final class C1769170w8h extends AbstractC23140094w {
    public ReachCfgData LL;
    public DiversionEntranceRes LLILLJJLI;
    public DiversionEntranceResCfg LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1769080w8Y LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1769170w8h(C1769080w8Y c1769080w8Y, InterfaceC1364105Vn<? super C1769170w8h> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1769080w8Y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TooltipTask@5896.show$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZLL.LIZIZ(this);
        C1C7U.LIZIZ("TooltipTask@5896.show$1");
        return objLIZIZ;
    }
}
