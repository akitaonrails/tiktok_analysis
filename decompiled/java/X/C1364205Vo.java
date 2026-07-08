package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Vo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.EditorProLoaderComponent$testDefaultDispatcher$1", f = "EditorProLoaderComponent.kt", l = {654, 664}, m = "invokeSuspend")
public final class C1364205Vo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0ELA LLILLL;
    public final /* synthetic */ EnumC1364705Vt LLILZ;
    public final /* synthetic */ C0ELH LLILZIL;
    public final /* synthetic */ C0EL6 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1364205Vo(C0ELA c0ela, EnumC1364705Vt enumC1364705Vt, C0ELH c0elh, C0EL6 c0el6, InterfaceC1364105Vn<? super C1364205Vo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0ela;
        this.LLILZ = enumC1364705Vt;
        this.LLILZIL = c0elh;
        this.LLILZLL = c0el6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1364205Vo c1364205Vo = new C1364205Vo(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1364205Vo.LLILLJJLI = obj;
        return c1364205Vo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("EditorProLoaderComponent@12f.testDefaultDispatcher$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EditorProLoaderComponent@12f.testDefaultDispatcher$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C05PN c05pn = new C05PN(this.LLILLL, null);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = C099A.LIZJ(3000L, c05pn, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EditorProLoaderComponent@12f.testDefaultDispatcher$1");
                return objLJFF;
            }
        }
        if (obj == null && C23118094a.LJIIIIZZ(interfaceC497601wk.getCoroutineContext())) {
            C2296808zG.LIZJ(this.LLILLL.LLJ, null);
            C370920EgU.LLJJI = true;
            C0ELA c0ela = this.LLILLL;
            c0ela.LLJ = c0ela.o2();
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1364405Vq c1364405Vq = new C1364405Vq(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null);
            this.LLILLJJLI = null;
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1364405Vq) == objLJFF) {
                C1C7U.LIZIZ("EditorProLoaderComponent@12f.testDefaultDispatcher$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EditorProLoaderComponent@12f.testDefaultDispatcher$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
