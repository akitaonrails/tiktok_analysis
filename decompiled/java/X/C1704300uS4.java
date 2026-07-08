package X;

import com.ss.android.ugc.aweme.relation.api.PlaceUserInfo;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0uS4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel$loadDataFromMafPush$1", f = "RecSwipeViewModel.kt", l = {374}, m = "invokeSuspend")
public final class C1704300uS4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecSwipeViewModel LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ PlaceUserInfo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1704300uS4(RecSwipeViewModel recSwipeViewModel, Function0<Unit> function0, PlaceUserInfo placeUserInfo, InterfaceC1364105Vn<? super C1704300uS4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recSwipeViewModel;
        this.LLILLL = function0;
        this.LLILZ = placeUserInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1704300uS4(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("RecSwipeViewModel@199f.loadDataFromMafPush$1");
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
            this.LLILLJJLI.setState(AFwS268S0000000_26.get$arr$(466));
            C1DFB c1dfb = C0PEM.LIZJ;
            C1704360uSA c1704360uSA = new C1704360uSA(this.LLILZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c1704360uSA);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecSwipeViewModel@199f.loadDataFromMafPush$1");
                return objLJFF;
            }
        }
        AbstractC323330Clv<C1261860iwS> abstractC323330Clv = (AbstractC323330Clv) obj;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadMafUser finished ");
        sbLIZ.append(abstractC323330Clv);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILLJJLI.kl2(abstractC323330Clv, true);
        this.LLILLL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecSwipeViewModel@199f.loadDataFromMafPush$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
