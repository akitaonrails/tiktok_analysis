package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Qm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.popup.manager.EcUgSparkManager$addSparkClientListener$1$invoke$2$1$onPageFinished$1", f = "EcUgSparkManager.kt", l = {210, 211}, m = "invokeSuspend")
public final class C1351005Qm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1351005Qm(int i, InterfaceC1364105Vn<? super C1351005Qm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1351005Qm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcUgSparkManager@315.addSparkClientListener$1$invoke$2$1$onPageFinished$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1435305jb.LIZIZ(((long) this.LLILLJJLI) * 1000, "draw_end_resume_h5");
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EcUgSparkManager@315.addSparkClientListener$1$invoke$2$1$onPageFinished$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("EcUgSparkManager@315.addSparkClientListener$1$invoke$2$1$onPageFinished$1");
                return objLJFF;
            }
        }
        this.LL = 2;
        if (C1056170dah.LIZ(this) == objLJFF) {
            C1C7U.LIZIZ("EcUgSparkManager@315.addSparkClientListener$1$invoke$2$1$onPageFinished$1");
            return objLJFF;
        }
        C1435305jb.LIZIZ(((long) this.LLILLJJLI) * 1000, "draw_end_resume_h5");
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcUgSparkManager@315.addSparkClientListener$1$invoke$2$1$onPageFinished$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
