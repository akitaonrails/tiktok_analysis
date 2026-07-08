package X;

import com.bytedance.android.livesdk.comp.impl.pcs.infra.datacenter.fetcher.Fetcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.01a8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.infra.datacenter.fetcher.Fetcher$requestApi$1", f = "Fetcher.kt", l = {40}, m = "invokeSuspend")
public final class C357401a8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Fetcher LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C357401a8(Fetcher fetcher, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = fetcher;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C357401a8 c357401a8 = new C357401a8(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c357401a8.LLILLJJLI = obj;
        return c357401a8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZLLL = obj;
        C1C7U.LIZ("Fetcher@eed5.requestApi$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZLLL);
            } else {
                C155000ia.LIZIZ(objLIZLLL);
                Object obj2 = this.LLILLJJLI;
                String strReplace = new Regex("\\?.*").replace(a0.LJJJJZ("/webcast", this.LLILLL), "");
                String simpleName = obj2.getClass().getSimpleName();
                C357501a9 c357501a9 = new C357501a9(this.LLILZ, this.LLILLL, null);
                this.LL = 1;
                objLIZLLL = C1808280x9m.LIZ.LIZLLL(simpleName, strReplace, C2097608Jq.LJ(), AnonymousClass0207.get$arr$(153), c357501a9, this);
                if (objLIZLLL == objLJFF) {
                    C1C7U.LIZIZ("Fetcher@eed5.requestApi$1");
                    return objLJFF;
                }
            }
            Fetcher fetcher = this.LLILZ;
            C23250099c.LIZLLL((InterfaceC497601wk) fetcher.LIZIZ.getValue(), null, null, new C357301a7(fetcher, this.LLILLL, (n) ((C470590Icr) objLIZLLL).data, null), 3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Fetcher fetcher2 = this.LLILZ;
            C23250099c.LIZLLL((InterfaceC497601wk) fetcher2.LIZIZ.getValue(), null, null, new C357201a6(fetcher2, this.LLILLL, th, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Fetcher@eed5.requestApi$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
