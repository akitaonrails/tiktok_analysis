package X;

import com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.presentation.viewmodel.GiftPanelCoordinatorViewModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fUM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.presentation.viewmodel.GiftPanelCoordinatorViewModel$requestApplyExternalGiftPages$1", f = "GiftPanelCoordinatorViewModel.kt", l = {286}, m = "invokeSuspend")
public final class C1129120fUM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ GiftPanelCoordinatorViewModel LLILLL;
    public final /* synthetic */ List<GiftPage> LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1129120fUM(GiftPanelCoordinatorViewModel giftPanelCoordinatorViewModel, List<? extends GiftPage> list, int i, long j, long j2, InterfaceC1364105Vn<? super C1129120fUM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = giftPanelCoordinatorViewModel;
        this.LLILZ = list;
        this.LLILZIL = i;
        this.LLILZLL = j;
        this.LLIZ = j2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1129120fUM c1129120fUM = new C1129120fUM(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1129120fUM.LLILLJJLI = obj;
        return c1129120fUM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        Long lLJFF;
        Object objLIZ = obj;
        C1C7U.LIZ("GiftPanelCoordinatorViewModel@b358.requestApplyExternalGiftPages$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                    C155000ia.LIZIZ(objLIZ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZ);
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C1129080fUI c1129080fUIYQ2 = this.LLILLL.yQ2();
                C1128850fTv c1128850fTv = (C1128850fTv) ((C1130060fVs) this.LLILLL.LLILZ.getValue()).LJII.getValue();
                List<GiftPage> list = this.LLILZ;
                Room room = c1129080fUIYQ2.LJIIIIZZ;
                Integer numLJ = C2286608xc.LJ(this.LLILZIL);
                long j = this.LLILZLL;
                if (j > 0) {
                    lLJFF = C2286608xc.LJFF(j);
                } else {
                    lLJFF = null;
                }
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                objLIZ = C1128850fTv.LIZ(c1128850fTv, list, room, c1129080fUIYQ2, false, false, null, null, numLJ, lLJFF, 112);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.requestApplyExternalGiftPages$1");
                    return objLJFF;
                }
            }
            C1129140fUO c1129140fUO = (C1129140fUO) objLIZ;
            C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
            if (!this.LLILLL.xQ2(this.LLIZ, "external_update")) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.requestApplyExternalGiftPages$1");
                return unit;
            }
            this.LLILLL.vQ2(c1129140fUO, EnumC1129600fV8.EXTERNAL_UPDATE);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.requestApplyExternalGiftPages$1");
            return unit2;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Coordinator] requestApplyExternalGiftPages cancelled - roomId=");
            sbLIZ.append(this.LLILLL.LLILZIL.LIZ());
            C20441214yg.LJFF("GiftPanel.Coord", C2188811AlT.LIZIZ(sbLIZ), e);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.requestApplyExternalGiftPages$1");
            return unit3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
