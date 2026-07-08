package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pcs.course.videoeditpage.ui.PcsCourseVideoEditMainAssem;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pcs.course.videoeditpage.ui.PcsCourseVideoEditMainAssem$startAudioCopyRightDetection$1$1", f = "PcsCourseVideoEditMainAssem.kt", l = {}, m = "invokeSuspend")
public final class C1851800yHy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PcsCourseVideoEditMainAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1851800yHy(PcsCourseVideoEditMainAssem pcsCourseVideoEditMainAssem, InterfaceC1364105Vn<? super C1851800yHy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pcsCourseVideoEditMainAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1851800yHy(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0VSJ c0vsjLIZ;
        C2263161Di6 c2263161Di6;
        C1464280oCw c1464280oCw;
        C1C7U.LIZ("PcsCourseVideoEditMainAssem@baff.startAudioCopyRightDetection$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            if (this.LL.ip().getState().LLILZIL == EnumC489460JHk.NOT_STARTED) {
                Future<?> futureSubmit = null;
                try {
                    this.LL.ip().vQ2(EnumC489460JHk.IN_PROGRESS);
                    c2263161Di6 = this.LL.LLJJIJI;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    this.LL.ip().vQ2(EnumC489460JHk.CHECK_ENCOUNTERED_ERROR);
                }
                if (c2263161Di6 != null && (c1464280oCw = (C1464280oCw) c2263161Di6.LIZLLL.getValue()) != null) {
                    c0vsjLIZ = c1464280oCw.LIZ();
                } else {
                    c0vsjLIZ = null;
                }
                C1851770yHv c1851770yHv = C1851770yHv.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LL.ip().getState().LLILLJJLI.LIZ;
                final PcsCourseVideoEditMainAssem pcsCourseVideoEditMainAssem = this.LL;
                InterfaceC1840520xzm interfaceC1840520xzm = new InterfaceC1840520xzm() { // from class: X.0yHz
                    @Override // X.InterfaceC1840520xzm
                    public final void LIZ() {
                        pcsCourseVideoEditMainAssem.ip().vQ2(EnumC489460JHk.RESULT_PASS);
                    }

                    @Override // X.InterfaceC1840520xzm
                    public final void LIZIZ() {
                        pcsCourseVideoEditMainAssem.ip().vQ2(EnumC489460JHk.CHECK_ENCOUNTERED_ERROR);
                    }

                    @Override // X.InterfaceC1840520xzm
                    public final void LIZJ() {
                        pcsCourseVideoEditMainAssem.ip().vQ2(EnumC489460JHk.RESULT_VIOLATION);
                    }

                    @Override // X.InterfaceC1840520xzm
                    public final void LIZLLL() {
                        pcsCourseVideoEditMainAssem.ip().vQ2(EnumC489460JHk.IN_PROGRESS);
                    }
                };
                c1851770yHv.getClass();
                RunnableC1851790yHx runnableC1851790yHx = new RunnableC1851790yHx(c0vsjLIZ, videoPublishEditModel);
                C1851770yHv.LIZJ.put(videoPublishEditModel.getCreationId(), runnableC1851790yHx);
                C1851770yHv.LIZLLL.put(videoPublishEditModel.getCreationId(), interfaceC1840520xzm);
                ExecutorService executorService = C1851770yHv.LIZIZ;
                if (executorService != null) {
                    futureSubmit = executorService.submit(runnableC1851790yHx);
                }
                runnableC1851790yHx.LLILLL = futureSubmit;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PcsCourseVideoEditMainAssem@baff.startAudioCopyRightDetection$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
