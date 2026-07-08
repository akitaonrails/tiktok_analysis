package X;

import Y.AgS205S0200000_19;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iyY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.source.UserCardDataSource$init$3", f = "UserCardDataSource.kt", l = {185}, m = "invokeSuspend")
public final class C1263160iyY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1263080iyQ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263160iyY(C1263080iyQ c1263080iyQ, InterfaceC1364105Vn<? super C1263160iyY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1263080iyQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1263160iyY c1263160iyY = new C1263160iyY(this.LLILLL, interfaceC1364105Vn);
        c1263160iyY.LLILLJJLI = obj;
        return c1263160iyY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCardDataSource@8e56.init$3");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C2252321DDq c2252321DDq = this.LLILLL.LJIIL().LJIIIZ;
            if (c2252321DDq == null) {
                c2252321DDq = null;
            }
            C414301jJ c414301jJ = new C414301jJ(c2252321DDq, this.LLILLL.LJIIIZ().LJII, new C1263180iya(null));
            AgS205S0200000_19 agS205S0200000_19 = new AgS205S0200000_19(this.LLILLL, interfaceC497601wk, 3);
            this.LL = 1;
            if (c414301jJ.collect(agS205S0200000_19, this) == objLJFF) {
                C1C7U.LIZIZ("UserCardDataSource@8e56.init$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCardDataSource@8e56.init$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
