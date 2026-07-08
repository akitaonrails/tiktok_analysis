package X;

import Y.AObserverS216S0100000_12;
import Y.AcS495S0100000_12;
import com.bytedance.android.live.design.app.LiveDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U4Z, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.livestudio.LiveStudioMonitorNetSpeedListener$onNetworkStatus$3", f = "LiveStudioMonitorNetSpeedListener.kt", l = {70}, m = "invokeSuspend")
public final class C0U4Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0U4X LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U4Z(C0U4X c0u4x, InterfaceC1364105Vn<? super C0U4Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0u4x;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U4Z(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        C1C7U.LIZ("LiveStudioMonitorNetSpeedListener@e3e8.onNetworkStatus$3");
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
            if (AnonymousClass0958.LIZIZ(30000L, this) == objLJFF) {
                C1C7U.LIZIZ("LiveStudioMonitorNetSpeedListener@e3e8.onNetworkStatus$3");
                return objLJFF;
            }
        }
        C0U4X c0u4x = this.LLILLJJLI;
        LiveDialog liveDialog = c0u4x.LIZIZ;
        if (liveDialog != null) {
            boolValueOf = Boolean.valueOf(liveDialog.isShowing());
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJJI(boolValueOf)) {
            if (c0u4x.LIZ.getActivity() != null && c0u4x.LIZIZ == null) {
                C782110Um9 c782110Um9 = new C782110Um9(c0u4x.LIZ.getActivity());
                c782110Um9.LJIIZILJ(2131843645);
                c782110Um9.LJII(2131843644);
                c782110Um9.LJIILIIL(2131843636, new InterfaceC743640TFa() { // from class: X.0U4a
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog2) {
                        liveDialog2.dismiss();
                    }
                });
                c782110Um9.LJIIJ(2131841377, new AcS495S0100000_12(c0u4x, 78));
                c782110Um9.LJIJ = new DialogInterfaceOnDismissListenerC786080UsY(c0u4x, 45);
                c782110Um9.LJIILL = false;
                c0u4x.LIZIZ = c782110Um9.LIZ();
            }
            c0u4x.LIZ.NR().addToShow(48, c0u4x.LIZ, new AObserverS216S0100000_12(c0u4x, 115));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveStudioMonitorNetSpeedListener@e3e8.onNetworkStatus$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
