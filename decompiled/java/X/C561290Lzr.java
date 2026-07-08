package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$loadRestAll$2", f = "DraftBoxFragment.kt", l = {1480, 1485}, m = "invokeSuspend")
public final class C561290Lzr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftBoxFragment LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C0M0Z LLILZIL;
    public final /* synthetic */ EnumC562200M3e LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561290Lzr(DraftBoxFragment draftBoxFragment, int i, int i2, C0M0Z c0m0z, EnumC562200M3e enumC562200M3e, InterfaceC1364105Vn<? super C561290Lzr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftBoxFragment;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = c0m0z;
        this.LLILZLL = enumC562200M3e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561290Lzr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJIIIZ = obj;
        C1C7U.LIZ("DraftBoxFragment@80e.loadRestAll$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJIIIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DraftBoxFragment@80e.loadRestAll$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJIIIZ);
        } else {
            C155000ia.LIZIZ(objLJIIIZ);
            C0M03 c0m03CS = this.LLILLJJLI.cS();
            DraftBoxFragment draftBoxFragment = this.LLILLJJLI;
            C0M4N c0m4n = new C0M4N(draftBoxFragment.LLLLIILLL, this.LLILLL, this.LLILZ);
            Context context = draftBoxFragment.getContext();
            C0M0Z c0m0z = this.LLILZIL;
            C561130Lzb c561130LzbWR = this.LLILLJJLI.WR();
            EnumC562200M3e enumC562200M3e = this.LLILZLL;
            this.LL = 1;
            objLJIIIZ = c0m03CS.LJIIIZ(c0m4n, context, null, c0m0z, c561130LzbWR, enumC562200M3e, this);
            if (objLJIIIZ == objLJFF) {
                C1C7U.LIZIZ("DraftBoxFragment@80e.loadRestAll$2");
                return objLJFF;
            }
        }
        List list = (List) objLJIIIZ;
        if (list != null && !list.isEmpty()) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C561280Lzq c561280Lzq = new C561280Lzq(this.LLILLJJLI, this.LLILZLL, list, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c561280Lzq) == objLJFF) {
                C1C7U.LIZIZ("DraftBoxFragment@80e.loadRestAll$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.loadRestAll$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
