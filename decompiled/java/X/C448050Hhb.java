package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Hhb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew$updateDataWhenLynxReady$1$1", f = "DynamicSingleIntermediateFragmentNew.kt", l = {578}, m = "invokeSuspend")
public final class C448050Hhb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DynamicSingleIntermediateFragmentNew LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C448050Hhb(DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew, Function0<Unit> function0, String str, InterfaceC1364105Vn<? super C448050Hhb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dynamicSingleIntermediateFragmentNew;
        this.LLILLL = function0;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C448050Hhb(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zAwait;
        C1C7U.LIZ("DynamicSingleIntermediateFragmentNew@4e1a.updateDataWhenLynxReady$1$1");
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
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                zAwait = this.LLILLJJLI.LLLIIL.await(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zAwait = false;
            }
            C2238608ps c2238608ps = C2108208Ns.LIZ;
            C448060Hhc c448060Hhc = new C448060Hhc(this.LLILLL, jCurrentTimeMillis, this.LLILZ, zAwait, this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c448060Hhc) == objLJFF) {
                C1C7U.LIZIZ("DynamicSingleIntermediateFragmentNew@4e1a.updateDataWhenLynxReady$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DynamicSingleIntermediateFragmentNew@4e1a.updateDataWhenLynxReady$1$1");
        return unit;
    }
}
