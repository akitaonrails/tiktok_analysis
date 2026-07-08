package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreHeaderAssem;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.event.UpdateHeaderEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.mix.assem.StoreHeaderAssem$onReceiveEvent$1$1", f = "StoreHeaderAssem.kt", l = {}, m = "invokeSuspend")
public final class C433140Gye extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoreHeaderAssem LL;
    public final /* synthetic */ UpdateHeaderEvent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433140Gye(StoreHeaderAssem storeHeaderAssem, UpdateHeaderEvent updateHeaderEvent, InterfaceC1364105Vn<? super C433140Gye> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storeHeaderAssem;
        this.LLILLJJLI = updateHeaderEvent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433140Gye(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoreHeaderAssem@6802.onReceiveEvent$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View viewLJJIJL = this.LL.LJJIJL();
        if (!(viewLJJIJL instanceof FrameLayout)) {
            viewLJJIJL = null;
        }
        Float f = this.LLILLJJLI.stickyHeight;
        if (f != null && f.floatValue() > 0.0f) {
            int iLIZ = ((int) C0H9H.LIZ(this.LLILLJJLI.stickyHeight.floatValue())) + this.LL.So();
            if (viewLJJIJL != null) {
                viewLJJIJL.setMinimumHeight(iLIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoreHeaderAssem@6802.onReceiveEvent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
