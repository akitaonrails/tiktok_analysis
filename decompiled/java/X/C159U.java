package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.159U, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.feed.popcard.EcLiveProductCard$onLynxCardAnimationStart$1", f = "EcLiveProductCard.kt", l = {890}, m = "invokeSuspend")
public final class C159U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C212206182q LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159U(int i, C212206182q c212206182q, InterfaceC1364105Vn<? super C159U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c212206182q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C159U(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("EcLiveProductCard@521a.onLynxCardAnimationStart$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("EcLiveProductCard@521a.onLynxCardAnimationStart$1");
                return objLJFF;
            }
        }
        int i2 = this.LLILLJJLI;
        C212206182q c212206182q = this.LLILLL;
        if (i2 == c212206182q.LLJJJ && !c212206182q.LLJJJJJIL && c212206182q.LLJJJJ) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("lynx overlay signal fallback timeout, roomId=");
            C212207182r c212207182r = this.LLILLL.LLJJI;
            if (c212207182r != null) {
                str = c212207182r.LIZJ;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            this.LLILLL.LJIILLIIL();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcLiveProductCard@521a.onLynxCardAnimationStart$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcLiveProductCard@521a.onLynxCardAnimationStart$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
