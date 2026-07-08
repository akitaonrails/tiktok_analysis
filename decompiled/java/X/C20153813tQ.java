package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.tools.music.monitor.MusicMonitorTaskQueueServiceImpl;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13tQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.monitor.MusicMonitorTaskQueueServiceImpl$processQueue$job$1", f = "MusicMonitorTaskQueueServiceImpl.kt", l = {89}, m = "invokeSuspend")
public final class C20153813tQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MusicMonitorTaskQueueServiceImpl LL;
    public InterfaceC20153913tR LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ MusicMonitorTaskQueueServiceImpl LLILZ;
    public final /* synthetic */ InterfaceC20153913tR<?> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20153813tQ(MusicMonitorTaskQueueServiceImpl musicMonitorTaskQueueServiceImpl, InterfaceC20153913tR<?> interfaceC20153913tR, InterfaceC1364105Vn<? super C20153813tQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = musicMonitorTaskQueueServiceImpl;
        this.LLILZIL = interfaceC20153913tR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20153813tQ(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        MusicMonitorTaskQueueServiceImpl musicMonitorTaskQueueServiceImpl;
        InterfaceC20153913tR<?> interfaceC20153913tR;
        C1C7U.LIZ("MusicMonitorTaskQueueServiceImpl@e3b5.processQueue$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC20153913tR = this.LLILLJJLI;
                    musicMonitorTaskQueueServiceImpl = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                ((IAVPerformance) this.LLILZ.LJI.getValue()).enter(C1BWL.LIZ(), this.LLILZ.LJII);
                musicMonitorTaskQueueServiceImpl = this.LLILZ;
                interfaceC20153913tR = this.LLILZIL;
                musicMonitorTaskQueueServiceImpl.LJ.put(interfaceC20153913tR.getId(), new C20154013tS<>(EnumC1790370wgt.RUNNING, null, 6));
                this.LL = musicMonitorTaskQueueServiceImpl;
                this.LLILLJJLI = interfaceC20153913tR;
                this.LLILLL = 1;
                obj = interfaceC20153913tR.execute();
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MusicMonitorTaskQueueServiceImpl@e3b5.processQueue$job$1");
                    return objLJFF;
                }
            }
            musicMonitorTaskQueueServiceImpl.LJ.put(interfaceC20153913tR.getId(), new C20154013tS<>(EnumC1790370wgt.COMPLETED, obj, 4));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) instanceof CancellationException) {
                this.LLILZ.LJ.put(this.LLILZIL.getId(), new C20154013tS<>(EnumC1790370wgt.FAILED, null, 2));
            } else {
                this.LLILZ.LJ.put(this.LLILZIL.getId(), new C20154013tS<>(EnumC1790370wgt.FAILED, null, 2));
            }
        }
        this.LLILZ.LIZLLL.remove(this.LLILZIL.getId());
        this.LLILZ.LJFF.decrementAndGet();
        this.LLILZ.LIZLLL();
        ((IAVPerformance) this.LLILZ.LJI.getValue()).leave(C1BWL.LIZ(), this.LLILZ.LJII);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicMonitorTaskQueueServiceImpl@e3b5.processQueue$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
