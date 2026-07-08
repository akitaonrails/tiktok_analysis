package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fDA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.presentation.viewmodel.GiftPanelCoordinatorViewModel$launchBackgroundRefresh$1", f = "GiftPanelCoordinatorViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1118460fDA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1129080fUI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1118460fDA(C1129080fUI c1129080fUI, InterfaceC1364105Vn<? super C1118460fDA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1129080fUI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1118460fDA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        C1C7U.LIZ("GiftPanelCoordinatorViewModel@b358.launchBackgroundRefresh$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long j = this.LL.LIZ;
        if (j <= 0) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.launchBackgroundRefresh$1");
            return unit;
        }
        try {
            if (UserService.getInstance().user().getCurrentUserId() == this.LL.LIZIZ) {
                z = true;
            } else {
                z = false;
            }
            C1129650fVD giftRepository = GiftManager.inst().getGiftRepository();
            if (z) {
                z2 = true;
            } else {
                z2 = false;
            }
            giftRepository.LJFF(3, j, z2, null, "");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Coordinator] Background syncGiftList completed - roomId=");
            sbLIZ.append(j);
            C20441214yg.LJIIIZ("GiftPanel.Coord", C2188811AlT.LIZIZ(sbLIZ));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[Coordinator] Background syncGiftList cancelled - roomId=");
            sbLIZ2.append(j);
            C20441214yg.LJIIIZ("GiftPanel.Coord", C2188811AlT.LIZIZ(sbLIZ2));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.launchBackgroundRefresh$1");
            return unit2;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF("GiftPanel.Coord", "[Coordinator] Background syncGiftList failed", e2);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("GiftPanelCoordinatorViewModel@b358.launchBackgroundRefresh$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
