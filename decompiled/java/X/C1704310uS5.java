package X;

import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0uS5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel$loadMafUser$1", f = "RecSwipeViewModel.kt", l = {403}, m = "invokeSuspend")
public final class C1704310uS5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecSwipeViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1263870izh LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704310uS5(RecSwipeViewModel recSwipeViewModel, boolean z, C1263870izh c1263870izh, InterfaceC1364105Vn<? super C1704310uS5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recSwipeViewModel;
        this.LLILLL = z;
        this.LLILZ = c1263870izh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704310uS5(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("RecSwipeViewModel@199f.loadMafUser$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(584));
            C1DFB c1dfb = C0PEM.LIZJ;
            C1704350uS9 c1704350uS9 = new C1704350uS9(this.LLILZ, this.LLILLJJLI, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c1704350uS9);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("RecSwipeViewModel@199f.loadMafUser$1");
                return objLJFF;
            }
        }
        AbstractC323330Clv<C1261860iwS> abstractC323330Clv = (AbstractC323330Clv) objLJI;
        C1704340uS8 c1704340uS8 = (C1704340uS8) this.LLILLJJLI.LL.getValue();
        if (!c1704340uS8.LJFF) {
            c1704340uS8.LJFF = true;
            C1704320uS6 c1704320uS6 = c1704340uS8.LIZJ;
            if (c1704320uS6 != null) {
                c1704320uS6.stop();
                long j = c1704320uS6.LIZJ - c1704320uS6.LIZIZ;
                C1704320uS6 c1704320uS62 = c1704340uS8.LIZLLL;
                if (c1704320uS62 != null) {
                    c1704320uS62.stop();
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1704390uSD(abstractC323330Clv, c1704340uS8, j, c1704320uS62.LIZJ - c1704320uS62.LIZIZ, null), 3);
                }
            }
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadMafUser finished ");
        sbLIZ.append(abstractC323330Clv);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI.kl2(abstractC323330Clv, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecSwipeViewModel@199f.loadMafUser$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
