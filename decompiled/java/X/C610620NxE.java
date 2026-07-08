package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.dc.core.PORef;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dc.core.LayeredDiskCache$openPagedRead$2$readChunk$result$1$2$results$1$1", f = "LayeredDiskCache.kt", l = {318}, m = "invokeSuspend")
public final class C610620NxE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C610660NxI<? extends Object>>>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC610630NxF<?> LLILLJJLI;
    public final /* synthetic */ List<PORef> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610620NxE(InterfaceC610630NxF<?> interfaceC610630NxF, List<PORef> list, InterfaceC1364105Vn<? super C610620NxE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC610630NxF;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610620NxE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        C1C7U.LIZ("LayeredDiskCache@f330.openPagedRead$2$readChunk$result$1$2$results$1$1");
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
                InterfaceC610630NxF<?> interfaceC610630NxF = this.LLILLJJLI;
                List<PORef> list2 = this.LLILLL;
                this.LL = 1;
                obj = interfaceC610630NxF.LIZ(list2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LayeredDiskCache@f330.openPagedRead$2$readChunk$result$1$2$results$1$1");
                    return objLJFF;
                }
            }
            list = (List) obj;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pagedRead batchRead failed for store=");
            sbLIZ.append(this.LLILLJJLI.getClass().getSimpleName());
            C1720106oR.LIZIZ("LayeredDiskCache", C2188811AlT.LIZIZ(sbLIZ), th);
            list = null;
        }
        C1C7U.LIZIZ("LayeredDiskCache@f330.openPagedRead$2$readChunk$result$1$2$results$1$1");
        return list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C610660NxI<? extends Object>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
