package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.relation.model.MaFListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.feed.ITTRecUserBigCardViewModel$handleBigCardAweme$1", f = "ITTRecUserBigCardViewModel.kt", l = {198}, m = "invokeSuspend")
public final class C1007290cJr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ InterfaceC19229810Ky LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007290cJr(Aweme aweme, InterfaceC19229810Ky interfaceC19229810Ky, InterfaceC1364105Vn<? super C1007290cJr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = interfaceC19229810Ky;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007290cJr(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ITTRecUserBigCardViewModel@6f7.handleBigCardAweme$1");
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
            C07N5 c07n5 = C07N5.LIZ;
            Aweme aweme = this.LLILLJJLI;
            this.LL = 1;
            c07n5.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZ, new C1007280cJq(aweme, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ITTRecUserBigCardViewModel@6f7.handleBigCardAweme$1");
                return objLJFF;
            }
        }
        MaFListResponse maFListResponse = (MaFListResponse) obj;
        if (maFListResponse == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ITTRecUserBigCardViewModel@6f7.handleBigCardAweme$1");
            return unit;
        }
        this.LLILLL.kl2(this.LLILLL.XB1().LIZ(maFListResponse), true);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ITTRecUserBigCardViewModel@6f7.handleBigCardAweme$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
