package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: Add missing generic type declarations: [SEARCH_RESULT] */
/* JADX INFO: renamed from: X.0iOL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.search.sdk.impl.IMSearchEngine$doQuery$11", f = "IMSearchEngine.kt", l = {122}, m = "invokeSuspend")
public final class C1240710iOL<SEARCH_RESULT> extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends SEARCH_RESULT>>, Object> {
    public int LL;
    public final /* synthetic */ C1240730iON<SEARCH_RESULT> LLILLJJLI;
    public final /* synthetic */ List<C1240340iNk> LLILLL;
    public final /* synthetic */ C1240770iOR LLILZ;
    public final /* synthetic */ C1240760iOQ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240710iOL(C1240730iON<SEARCH_RESULT> c1240730iON, List<C1240340iNk> list, C1240770iOR c1240770iOR, C1240760iOQ c1240760iOQ, InterfaceC1364105Vn<? super C1240710iOL> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1240730iON;
        this.LLILLL = list;
        this.LLILZ = c1240770iOR;
        this.LLILZIL = c1240760iOQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1240710iOL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((a) create((InterfaceC1364105Vn) obj)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSearchEngine@a240.doQuery$11");
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
            InterfaceC1240700iOK<SEARCH_RESULT> interfaceC1240700iOK = this.LLILLJJLI.LIZIZ;
            List<C1240340iNk> list = this.LLILLL;
            C1240770iOR c1240770iOR = this.LLILZ;
            C1240760iOQ c1240760iOQ = this.LLILZIL;
            this.LL = 1;
            obj = interfaceC1240700iOK.LIZ(list, c1240770iOR, c1240760iOQ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMSearchEngine@a240.doQuery$11");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IMSearchEngine@a240.doQuery$11");
        return obj;
    }
}
