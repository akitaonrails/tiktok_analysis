package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aikit.api.common.AITaskService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Lbc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.wavepublish.aigc.AIGCAuthTask$execute$1", f = "AIGCAuthTask.kt", l = {42}, m = "invokeSuspend")
public final class C546260Lbc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AITaskService LLILLJJLI;
    public final /* synthetic */ C546270Lbd LLILLL;
    public final /* synthetic */ C1431070nLN LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C546260Lbc(AITaskService aITaskService, C546270Lbd c546270Lbd, C1431070nLN c1431070nLN, InterfaceC1364105Vn<? super C546260Lbc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aITaskService;
        this.LLILLL = c546270Lbd;
        this.LLILZ = c1431070nLN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C546260Lbc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C546230LbZ next;
        C1897207bu c1897207buInvoke;
        C0LO3 c0lo3;
        Function1<C542120LNy, C1897207bu> function1;
        C1C7U.LIZ("AIGCAuthTask@5b3d.execute$1");
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
                AITaskService aITaskService = this.LLILLJJLI;
                CreativeModel creativeModel = this.LLILLL.LLILZLL.getCreativeModel();
                boolean z = this.LLILLL.LLIZ;
                this.LL = 1;
                obj = aITaskService.LIZJ(creativeModel, z, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("AIGCAuthTask@5b3d.execute$1");
                    return objLJFF;
                }
            }
            C542120LNy c542120LNy = (C542120LNy) obj;
            Iterator<C546230LbZ> it2 = C546300Lbg.LIZIZ(this.LLILLL.LLILZLL.getCreativeModel(), false).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ, c542120LNy.LIZ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C546230LbZ c546230LbZ = next;
            if (c546230LbZ != null && (c0lo3 = (C0LO3) c546230LbZ.LJIIJ.getValue()) != null && (function1 = c0lo3.LJ) != null) {
                c1897207buInvoke = function1.invoke(c542120LNy);
            } else {
                c1897207buInvoke = null;
            }
            if (!c542120LNy.LJ() && c1897207buInvoke != null) {
                C1431070nLN c1431070nLN = this.LLILZ;
                String str = c1897207buInvoke.LIZ;
                if (str == null) {
                    str = "";
                }
                c1431070nLN.LIZLLL(c1897207buInvoke.LIZIZ, new RuntimeException(str));
            } else {
                this.LLILZ.LJ(null, false);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZ.LIZLLL(13, th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCAuthTask@5b3d.execute$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
