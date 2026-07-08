package X;

import com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tracking.TrackingEventV3Data;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0x4M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.presentation.assem.body.viewmodel.RechargePanelBodyViewModel$handleCustomItemClicked$1", f = "RechargePanelBodyViewModel.kt", l = {740}, m = "invokeSuspend")
public final class C1804920x4M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RechargePanelBodyViewModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804920x4M(RechargePanelBodyViewModel rechargePanelBodyViewModel, int i, InterfaceC1364105Vn<? super C1804920x4M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = rechargePanelBodyViewModel;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1804920x4M(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map<String, String> mapLIZ;
        long jLongValue;
        Room room;
        Long l;
        Object objLJ = obj;
        C1C7U.LIZ("RechargePanelBodyViewModel@d42d.handleCustomItemClicked$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJ);
            C1805530x5L c1805530x5LWQ2 = this.LLILLJJLI.wQ2();
            if (c1805530x5LWQ2 == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.handleCustomItemClicked$1");
                return unit;
            }
            C1805210x4p c1805210x4p = this.LLILLJJLI.getState().LLILLJJLI;
            RechargePanelBodyViewModel rechargePanelBodyViewModel = this.LLILLJJLI;
            InterfaceC1804890x4J interfaceC1804890x4J = rechargePanelBodyViewModel.LLILZIL;
            C1805370x55 c1805370x55 = rechargePanelBodyViewModel.getState().LLILLJJLI.LJIIL;
            C1805370x55 c1805370x552 = this.LLILLJJLI.getState().LLILLJJLI.LJIILIIL;
            boolean zLIZIZ = c1805210x4p.LIZIZ();
            TrackingEventV3Data trackingEventV3DataXQ2 = this.LLILLJJLI.xQ2(true);
            if (trackingEventV3DataXQ2 != null) {
                mapLIZ = trackingEventV3DataXQ2.LIZ();
            } else {
                mapLIZ = null;
            }
            interfaceC1804890x4J.LJIIJ(c1805530x5LWQ2, true, c1805370x55, c1805370x552, zLIZIZ, mapLIZ, true, this.LLILLJJLI.vQ2());
            InterfaceC1805000x4U interfaceC1805000x4U = this.LLILLJJLI.LLILLL;
            int i2 = this.LLILLL;
            DataChannel dataChannel = c1805530x5LWQ2.LLILZ;
            long ownerUserId = 0;
            if (dataChannel != null && (l = (Long) dataChannel.gg0(C751340Tdc.class)) != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            RechargePanelBodyViewModel rechargePanelBodyViewModel2 = this.LLILLJJLI;
            DataChannel dataChannel2 = c1805530x5LWQ2.LLILZ;
            rechargePanelBodyViewModel2.getClass();
            if (dataChannel2 != null && (room = (Room) dataChannel2.gg0(RoomChannel.class)) != null) {
                ownerUserId = room.getOwnerUserId();
            }
            Map<Integer, Integer> map = C07LT.LIZ;
            int iLIZ = C07LT.LIZ(c1805530x5LWQ2.LLILLL.LJ);
            EnumC1803160x1W enumC1803160x1W = EnumC1803160x1W.USE;
            EnumC587980N4i enumC587980N4i = EnumC587980N4i.STRATEGY_TASK;
            C1126800fQc.LIZ.py();
            C1804970x4R c1804970x4R = new C1804970x4R(i2, new C1804420x3Y(iLIZ, enumC1803160x1W, jLongValue, ownerUserId, null, C1804180x3A.LIZ(), enumC587980N4i, C1134860fdc.LIZ.LIZJ(C07LT.LIZ(c1805530x5LWQ2.LLILLL.LJ), 0), 112), c1805210x4p.LIZ, this.LLILLJJLI.xQ2(true));
            this.LL = 1;
            objLJ = interfaceC1805000x4U.LJ(c1804970x4R, this);
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.handleCustomItemClicked$1");
                return objLJFF;
            }
        }
        C1882907Zb c1882907Zb = (C1882907Zb) objLJ;
        if (c1882907Zb != null) {
            RechargePanelBodyViewModel rechargePanelBodyViewModel3 = this.LLILLJJLI;
            if (c1882907Zb.LIZ) {
                rechargePanelBodyViewModel3.DQ2(new C1557300qcy(c1882907Zb.LIZIZ, c1882907Zb.LIZJ), false);
            } else {
                rechargePanelBodyViewModel3.DQ2(new C1557290qcx(c1882907Zb.LIZIZ), false);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RechargePanelBodyViewModel@d42d.handleCustomItemClicked$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
