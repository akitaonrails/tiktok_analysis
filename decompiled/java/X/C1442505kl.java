package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05kl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.tiktok.kmp.fcp.engine.FcpDecisionEngineImpl$execute$1", f = "FcpDecisionEngineImpl.kt", l = {41, 42}, m = "invokeSuspend")
public final class C1442505kl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1443905kz LLILLJJLI;
    public final /* synthetic */ C1443005kq LLILLL;
    public final /* synthetic */ InterfaceC1444205l2 LLILZ;
    public final /* synthetic */ Function1<C1178104jD, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1442505kl(AbstractC1443905kz abstractC1443905kz, C1443005kq c1443005kq, InterfaceC1444205l2 interfaceC1444205l2, Function1<? super C1178104jD, Unit> function1, InterfaceC1364105Vn<? super C1442505kl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1443905kz;
        this.LLILLL = c1443005kq;
        this.LLILZ = interfaceC1444205l2;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1442505kl(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1178104jD c1178104jD;
        C1C7U.LIZ("FcpDecisionEngineImpl@1cec.execute$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                    c1178104jD = (C1178104jD) obj;
                } else {
                    C155000ia.LIZIZ(obj);
                    c1178104jD = (C1178104jD) obj;
                }
            } else {
                C155000ia.LIZIZ(obj);
                AbstractC1443905kz abstractC1443905kz = this.LLILLJJLI;
                if (abstractC1443905kz instanceof C1443805ky) {
                    C1443005kq c1443005kq = this.LLILLL;
                    InterfaceC1444205l2 interfaceC1444205l2 = this.LLILZ;
                    this.LL = 1;
                    obj = c1443005kq.LIZJ(interfaceC1444205l2, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("FcpDecisionEngineImpl@1cec.execute$1");
                        return objLJFF;
                    }
                    c1178104jD = (C1178104jD) obj;
                } else if (abstractC1443905kz instanceof C1443205ks) {
                    C1443005kq c1443005kq2 = this.LLILLL;
                    InterfaceC1444205l2 interfaceC1444205l22 = this.LLILZ;
                    List<String> list = ((C1443205ks) abstractC1443905kz).LIZ;
                    this.LL = 2;
                    obj = c1443005kq2.LJI(interfaceC1444205l22, list, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("FcpDecisionEngineImpl@1cec.execute$1");
                        return objLJFF;
                    }
                    c1178104jD = (C1178104jD) obj;
                } else {
                    throw new C1954807lC();
                }
            }
            this.LLILZIL.invoke(c1178104jD);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILZIL.invoke(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FcpDecisionEngineImpl@1cec.execute$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
