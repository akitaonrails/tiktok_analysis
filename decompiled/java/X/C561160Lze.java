package X;

import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$initHead$1", f = "DraftBoxFragment.kt", l = {1078, 1086}, m = "invokeSuspend")
public final class C561160Lze extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ DraftBoxFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561160Lze(DraftBoxFragment draftBoxFragment, InterfaceC1364105Vn<? super C561160Lze> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = draftBoxFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561160Lze(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jCurrentTimeMillis;
        Object objLJI = obj;
        C1C7U.LIZ("DraftBoxFragment@80e.initHead$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DraftBoxFragment@80e.initHead$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = this.LL;
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            jCurrentTimeMillis = System.currentTimeMillis();
            C0M03 c0m03CS = this.LLILLL.cS();
            C561130Lzb c561130LzbWR = this.LLILLL.WR();
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            c0m03CS.getClass();
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C561250Lzn(c0m03CS, null, null, c561130LzbWR, null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("DraftBoxFragment@80e.initHead$1");
                return objLJFF;
            }
        }
        long jLongValue = ((Number) objLJI).longValue();
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("memorySize = ");
        sbLIZ.append(jLongValue);
        sbLIZ.append(" , ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C201955140j.LJIJJ(c0may, "DraftBoxFragment", C2188811AlT.LIZIZ(sbLIZ));
        DraftBoxFragment draftBoxFragment = this.LLILLL;
        draftBoxFragment.LLJLL = jLongValue;
        AnonymousClass0880.LIZ(draftBoxFragment.dS().LLILLL, C2286608xc.LJFF(jLongValue));
        this.LLILLL.cS().LJIIJ = jLongValue;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C561080LzW c561080LzW = new C561080LzW(this.LLILLL, null);
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c561080LzW) == objLJFF) {
            C1C7U.LIZIZ("DraftBoxFragment@80e.initHead$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.initHead$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
