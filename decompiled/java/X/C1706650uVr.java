package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0uVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.live.LSLiveShopBagAnimHelper$shrinkToBagAnim$2", f = "LSLiveShopBagAnimHelper.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C1706650uVr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1706650uVr(InterfaceC1364105Vn<? super C1706650uVr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1706650uVr(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LSLiveShopBagAnimHelper@d47a.shrinkToBagAnim$2");
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
            if (AnonymousClass0958.LIZIZ(10000L, this) == objLJFF) {
                C1C7U.LIZIZ("LSLiveShopBagAnimHelper@d47a.shrinkToBagAnim$2");
                return objLJFF;
            }
        }
        InterfaceC1706670uVt interfaceC1706670uVt = C1706660uVs.LIZLLL;
        if (interfaceC1706670uVt != null) {
            interfaceC1706670uVt.LJII();
        }
        C099F c099f = C1706660uVs.LIZIZ;
        if (c099f != null) {
            Unit unit = Unit.LIZ;
            if (!c099f.isCompleted()) {
                c099f.LJIIZILJ(unit);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LSLiveShopBagAnimHelper@d47a.shrinkToBagAnim$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1706650uVr(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
