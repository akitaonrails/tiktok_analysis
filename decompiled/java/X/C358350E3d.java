package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E3d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.frame.VideoFrameCache$removeRequest$1", f = "VideoFrameCache.kt", l = {}, m = "invokeSuspend")
public final class C358350E3d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C370920EgU LL;
    public final /* synthetic */ InterfaceC371030Egf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C358350E3d(C370920EgU c370920EgU, InterfaceC371030Egf interfaceC371030Egf, InterfaceC1364105Vn<? super C358350E3d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c370920EgU;
        this.LLILLJJLI = interfaceC371030Egf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C358350E3d(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoFrameCache@ba6a.removeRequest$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C370920EgU c370920EgU = this.LL;
        List<InterfaceC371030Egf> list = c370920EgU.LLILZIL;
        InterfaceC371030Egf interfaceC371030Egf = this.LLILLJJLI;
        synchronized (list) {
            try {
                ((ArrayList) c370920EgU.LLILZIL).remove(interfaceC371030Egf);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoFrameCache@ba6a.removeRequest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
