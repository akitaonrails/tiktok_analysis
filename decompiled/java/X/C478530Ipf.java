package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ipf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.container.model.MultiTopLiveDataManagerV2$preloadHangoutTabTopLive$1", f = "MultiTopLiveDataManagerV2.kt", l = {410}, m = "invokeSuspend")
public final class C478530Ipf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C478530Ipf(InterfaceC1364105Vn<? super C478530Ipf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C478530Ipf(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiTopLiveDataManagerV2@5859.preloadHangoutTabTopLive$1");
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
                C478590Ipl c478590Ipl = C478590Ipl.LIZ;
                this.LL = 1;
                if (c478590Ipl.LIZ("top_module_ui_preload", this) == objLJFF) {
                    C1C7U.LIZIZ("MultiTopLiveDataManagerV2@5859.preloadHangoutTabTopLive$1");
                    return objLJFF;
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF("MultiTopLiveDataManagerV2", "preloadHangoutTabTopLive catch Exception", e2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiTopLiveDataManagerV2@5859.preloadHangoutTabTopLive$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C478530Ipf(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
