package X;

import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.SeaUserRightViewHolderV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.03oT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.userright.SeaUserRightViewHolderV2$onClick$1$1$2", f = "SeaUserRightViewHolderV2.kt", l = {}, m = "invokeSuspend")
public final class C955903oT extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SeaUserRightViewHolderV2 LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C955903oT(SeaUserRightViewHolderV2 seaUserRightViewHolderV2, String str, InterfaceC1364105Vn<? super C955903oT> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = seaUserRightViewHolderV2;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C955903oT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        C1C7U.LIZ("SeaUserRightViewHolderV2@5810.onClick$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View view = this.LL.itemView;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        SmartRouter.buildRoute(context, this.LLILLJJLI).open();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaUserRightViewHolderV2@5810.onClick$1$1$2");
        return unit;
    }
}
