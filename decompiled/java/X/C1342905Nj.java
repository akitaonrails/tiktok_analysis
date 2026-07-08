package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Nj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.sparkpreload.ViewCleanupManager$schedule$job$1", f = "ViewCleanupManager.kt", l = {29, 31}, m = "invokeSuspend")
public final class C1342905Nj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ InterfaceC1105930esx LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342905Nj(int i, String str, Function0<Unit> function0, String str2, InterfaceC1105930esx interfaceC1105930esx, InterfaceC1364105Vn<? super C1342905Nj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = function0;
        this.LLILZIL = str2;
        this.LLILZLL = interfaceC1105930esx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1342905Nj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ViewCleanupManager@d500.schedule$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILZ.invoke();
                    C054G c054g = C1342805Ni.LIZ;
                    C1342805Ni.LIZ(this.LLILZLL, null);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ViewCleanupManager@d500.schedule$job$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = ((long) this.LLILLJJLI) * 1000;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ViewCleanupManager@d500.schedule$job$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1343005Nk c1343005Nk = new C1343005Nk(this.LLILLL, this.LLILZIL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1343005Nk) == objLJFF) {
            C1C7U.LIZIZ("ViewCleanupManager@d500.schedule$job$1");
            return objLJFF;
        }
        this.LLILZ.invoke();
        C054G c054g2 = C1342805Ni.LIZ;
        C1342805Ni.LIZ(this.LLILZLL, null);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ViewCleanupManager@d500.schedule$job$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
