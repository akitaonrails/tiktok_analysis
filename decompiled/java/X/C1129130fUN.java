package X;

import com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.presentation.viewmodel.GiftPanelCoordinatorViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import njp.a;

/* JADX INFO: renamed from: X.0fUN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.presentation.viewmodel.GiftPanelCoordinatorViewModel$requestRetry$1", f = "GiftPanelCoordinatorViewModel.kt", l = {246}, m = "invokeSuspend")
public final class C1129130fUN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ GiftPanelCoordinatorViewModel LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129130fUN(GiftPanelCoordinatorViewModel giftPanelCoordinatorViewModel, long j, InterfaceC1364105Vn<? super C1129130fUN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = giftPanelCoordinatorViewModel;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1129130fUN c1129130fUN = new C1129130fUN(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1129130fUN.LLILLJJLI = obj;
        return c1129130fUN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Object objLIZIZ = obj;
        C1C7U.LIZ("GiftPanelCoordinatorViewModel@b358.requestRetry$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                    C155000ia.LIZIZ(objLIZIZ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZIZ);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                if (this.LLILLL.LLILZIL.LIZ() <= 0) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.requestRetry$1");
                    return unit;
                }
                C1129080fUI c1129080fUILIZ = C1129080fUI.LIZ(this.LLILLL.yQ2());
                GiftPanelCoordinatorViewModel giftPanelCoordinatorViewModel = this.LLILLL;
                giftPanelCoordinatorViewModel.LLILZIL.getClass();
                giftPanelCoordinatorViewModel.LLILZIL = new C1125130fNv(c1129080fUILIZ);
                this.LLILLL.zQ2(AFwS254S0000000_17.get$arr$(48));
                C1128850fTv c1128850fTv = (C1128850fTv) ((C1130060fVs) this.LLILLL.LLILZ.getValue()).LJII.getValue();
                EnumC1129670fVF enumC1129670fVF = EnumC1129670fVF.NETWORK_ONLY;
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                objLIZIZ = c1128850fTv.LIZIZ(c1129080fUILIZ, enumC1129670fVF, null, null, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.requestRetry$1");
                    return objLJFF;
                }
            }
            AbstractC991550buT abstractC991550buT = (AbstractC991550buT) objLIZIZ;
            C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
            if (!this.LLILLL.xQ2(this.LLILZ, "retry")) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.requestRetry$1");
                return unit2;
            }
            if (abstractC991550buT instanceof C1129140fUO) {
                this.LLILLL.vQ2((C1129140fUO) abstractC991550buT, EnumC1129600fV8.RETRY);
            } else if (abstractC991550buT instanceof C991540buS) {
                this.LLILLL.zQ2(new AwS596S0100000_17(abstractC991550buT, 122));
            } else {
                throw new C1954807lC();
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.requestRetry$1");
            return unit3;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Coordinator] requestRetry cancelled - roomId=");
            sbLIZ.append(this.LLILLL.LLILZIL.LIZ());
            C20441214yg.LJFF("GiftPanel.Coord", C2188811AlT.LIZIZ(sbLIZ), e);
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.requestRetry$1");
            return unit4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
