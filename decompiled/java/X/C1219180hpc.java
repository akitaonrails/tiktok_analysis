package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hpc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tuc.mask.contentclassification.ContentClassificationMaskConfig$updateAge$1$onFinish$1", f = "ContentClassificationMaskConfig.kt", l = {187}, m = "invokeSuspend")
public final class C1219180hpc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C101N LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219180hpc(C101N c101n, InterfaceC1364105Vn<? super C1219180hpc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c101n;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219180hpc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContentClassificationMaskConfig@bc27.updateAge$1$onFinish$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C1219170hpb c1219170hpb = new C1219170hpb(this.LLILLJJLI, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c1219170hpb);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ContentClassificationMaskConfig@bc27.updateAge$1$onFinish$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.getClass();
            this.LLILLJJLI.LIZLLL.invoke((Aweme) obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContentClassificationMaskConfig@bc27.updateAge$1$onFinish$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
