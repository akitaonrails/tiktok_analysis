package X;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.data.repository.GiftPanelRepositoryImpl$fetchGiftPages$2", f = "GiftPanelRepositoryImpl.kt", l = {43}, m = "invokeSuspend")
public final class C1133280fb4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends List<? extends GiftPage>>>, Object> {
    public int LL;
    public final /* synthetic */ C1133300fb6 LLILLJJLI;
    public final /* synthetic */ C1133270fb3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1133280fb4(C1133300fb6 c1133300fb6, C1133270fb3 c1133270fb3, InterfaceC1364105Vn<? super C1133280fb4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1133300fb6;
        this.LLILLL = c1133270fb3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1133280fb4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("GiftPanelRepositoryImpl@309d.fetchGiftPages$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                c098200Yq = ((C189200o6) obj).m10unboximpl();
            } else {
                C155000ia.LIZIZ(obj);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Repository] fetchGiftPages start - roomId=");
                sbLIZ.append(this.LLILLJJLI.LIZ);
                sbLIZ.append(", source=");
                sbLIZ.append(this.LLILLJJLI.LIZIZ);
                sbLIZ.append(", forceRefresh=");
                sbLIZ.append(this.LLILLJJLI.LJI);
                C20441214yg.LJIIIZ("GiftMVI.Data", C2188811AlT.LIZIZ(sbLIZ));
                C1130360fWM c1130360fWM = this.LLILLL.LIZIZ;
                long j = this.LLILLJJLI.LIZ;
                c1130360fWM.getClass();
                List listLIZ = C1130360fWM.LIZ(j);
                if (listLIZ != null && !this.LLILLJJLI.LJI) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[Repository] fetchGiftPages hit cache - pages=");
                    sbLIZ2.append(((ArrayList) listLIZ).size());
                    C20441214yg.LJIIIZ("GiftMVI.Data", C2188811AlT.LIZIZ(sbLIZ2));
                    C189200o6.m2constructorimpl(listLIZ);
                    C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(listLIZ);
                    C1C7U.LIZIZ("GiftPanelRepositoryImpl@309d.fetchGiftPages$2");
                    return c189200o6M1boximpl;
                }
                C20441214yg.LJIIIZ("GiftMVI.Data", "[Repository] fetchGiftPages requesting from network...");
                C1133290fb5 c1133290fb5 = this.LLILLL.LIZ;
                C1133300fb6 c1133300fb6 = this.LLILLJJLI;
                this.LL = 1;
                c098200Yq = c1133290fb5.LIZ(c1133300fb6, this);
                if (c098200Yq == objLJFF) {
                    C1C7U.LIZIZ("GiftPanelRepositoryImpl@309d.fetchGiftPages$2");
                    return objLJFF;
                }
            }
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[Repository] fetchGiftPages success - pages=");
                sbLIZ3.append(((List) c098200Yq).size());
                C20441214yg.LJIIIZ("GiftMVI.Data", C2188811AlT.LIZIZ(sbLIZ3));
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C20441214yg.LJFF("GiftMVI.Data", "[Repository] fetchGiftPages failed", thM5exceptionOrNullimpl);
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJIIIZ("GiftMVI.Data", "[Repository] fetchGiftPages cancelled");
            throw e;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF("GiftMVI.Data", "[Repository] fetchGiftPages exception", e2);
            c098200Yq = new C098200Yq(e2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl2 = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("GiftPanelRepositoryImpl@309d.fetchGiftPages$2");
        return c189200o6M1boximpl2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends List<? extends GiftPage>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
