package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ixv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.source.UserCardDataSource$getAndInsertRelatedUserList$relatedUserList$1", f = "UserCardDataSource.kt", l = {286}, m = "invokeSuspend")
public final class C1262770ixv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1261860iwS>>, Object> {
    public int LL;
    public final /* synthetic */ C1261860iwS LLILLJJLI;
    public final /* synthetic */ C1263080iyQ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1262770ixv(C1261860iwS c1261860iwS, C1263080iyQ c1263080iyQ, InterfaceC1364105Vn<? super C1262770ixv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1261860iwS;
        this.LLILLL = c1263080iyQ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1262770ixv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCardDataSource@8e56.getAndInsertRelatedUserList$relatedUserList$1");
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
            C1261860iwS c1261860iwS = this.LLILLJJLI;
            EnumC1262370ixH enumC1262370ixH = this.LLILLL.LLILZ.apiConfig.LIZ;
            this.LL = 1;
            obj = ((InterfaceC1262740ixs) C1262760ixu.LIZIZ.getValue()).LIZ(enumC1262370ixH, c1261860iwS, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UserCardDataSource@8e56.getAndInsertRelatedUserList$relatedUserList$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("UserCardDataSource@8e56.getAndInsertRelatedUserList$relatedUserList$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1261860iwS>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
