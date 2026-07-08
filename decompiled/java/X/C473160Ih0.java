package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePcsAnchorLiveCountdownSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ih0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.toolbar.PcsToolbarAnchorServicePlusBehavior$onLoad$2", f = "PcsToolbarAnchorServicePlusBehavior.kt", l = {184}, m = "invokeSuspend")
public final class C473160Ih0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C473160Ih0(InterfaceC1364105Vn<? super C473160Ih0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C473160Ih0(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PcsToolbarAnchorServicePlusBehavior@57d9.onLoad$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                long value = ((long) LivePcsAnchorLiveCountdownSetting.INSTANCE.getValue()) * 1000;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(value, this) == objLJFF) {
                    C1C7U.LIZIZ("PcsToolbarAnchorServicePlusBehavior@57d9.onLoad$2");
                    return objLJFF;
                }
            }
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131856378));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsToolbarAnchorServicePlusBehavior@57d9.onLoad$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C473160Ih0(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
