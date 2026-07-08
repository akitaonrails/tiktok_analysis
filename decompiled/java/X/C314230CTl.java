package X;

import com.bytedance.android.livesdk.dataChannel.ShareJoinInGoodyBagToast;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.goodybag.presenter.GoodyBagPresenter$observerEvent$4$1$1$1", f = "GoodyBagPresenter.kt", l = {321}, m = "invokeSuspend")
public final class C314230CTl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1104590eqn LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314230CTl(C1104590eqn c1104590eqn, InterfaceC1364105Vn<? super C314230CTl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1104590eqn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314230CTl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoodyBagPresenter@6f83.observerEvent$4$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("GoodyBagPresenter@6f83.observerEvent$4$1$1$1");
                return objLJFF;
            }
        }
        DataChannel dataChannel = this.LLILLJJLI.LIZ;
        if (dataChannel != null) {
            dataChannel.LC0(ShareJoinInGoodyBagToast.class, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoodyBagPresenter@6f83.observerEvent$4$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
