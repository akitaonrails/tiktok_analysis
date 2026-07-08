package X;

import com.bytedance.android.livesdk.gift.event.GoodyBagUpdateEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.goodybag.presenter.GoodyBagPresenter$handleEvent$1$1", f = "GoodyBagPresenter.kt", l = {}, m = "invokeSuspend")
public final class C314200CTi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1104590eqn LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314200CTi(C1104590eqn c1104590eqn, InterfaceC1364105Vn<? super C314200CTi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1104590eqn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314200CTi(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoodyBagPresenter@6f83.handleEvent$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        DataChannel dataChannel = this.LL.LIZ;
        if (dataChannel != null) {
            dataChannel.zW(GoodyBagUpdateEvent.class, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoodyBagPresenter@6f83.handleEvent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
