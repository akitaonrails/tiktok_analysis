package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.helios.apimonitor.permission.IPermissionPopUpService;
import com.bytedance.helios.apimonitor.permission.PermissionPopUpService;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.util.Logger;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.data.PopupMonitorConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: renamed from: X.0mI0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.PopupMonitorServiceImpl$tryStart$1", f = "PopupMonitorServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1390540mI0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1390540mI0(InterfaceC1364105Vn<? super C1390540mI0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1390540mI0(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopupMonitorServiceImpl@8747.tryStart$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PopupMonitorConfig popupMonitorConfig = C1390550mI1.LIZ;
        PopupMonitorConfig popupMonitorConfig2 = C1390570mI3.LIZ;
        PopupMonitorConfig popupMonitorConfigLIZ = (PopupMonitorConfig) C0C64.LJIILLIIL().LJJIIJ(false, "ug_nvv_feed_monitor_phase3", 31744, PopupMonitorConfig.class, C1390570mI3.LIZ, 1);
        Logger.d("PopupMonitorAB", "config from libra: " + popupMonitorConfigLIZ);
        if (popupMonitorConfigLIZ == null) {
            popupMonitorConfigLIZ = C1390560mI2.LIZ();
        }
        C1390550mI1.LIZ = popupMonitorConfigLIZ;
        C1390650mIB c1390650mIB = C1390650mIB.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("-----updateConfig, isEnabled:");
        sbLIZ.append(C1390550mI1.LIZ.isEnabled);
        sbLIZ.append(" isClickEnabled:");
        sbLIZ.append(C1390550mI1.LIZ.isClickEnabled);
        sbLIZ.append(" ruleId: ");
        sbLIZ.append(C1390550mI1.LIZ.ruleId);
        sbLIZ.append(" ruleTitle: ");
        sbLIZ.append(C1390550mI1.LIZ.ruleTitle);
        sbLIZ.append(" feedTrackPageVV: ");
        sbLIZ.append(C1390550mI1.LIZ.feedTrackPageVV);
        sbLIZ.append(" limitDays: ");
        sbLIZ.append(C1390550mI1.LIZ.limitDays);
        C2188811AlT.LIZIZ(sbLIZ);
        c1390650mIB.getClass();
        if (C1390550mI1.LIZLLL(true)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tryStart disabled, active: ");
            PopupMonitorServiceImpl.LIZ.getClass();
            sbLIZ2.append(PopupMonitorServiceImpl.LJJIL());
            C2188811AlT.LIZIZ(sbLIZ2);
            if (PopupMonitorServiceImpl.LJJIL() && C1390550mI1.LIZLLL(false)) {
                PopupMonitorServiceImpl.LJJJJJ();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.tryStart$1");
            return unit;
        }
        int i = PopupMonitorServiceImpl.LIZLLL;
        if (!C1390550mI1.LIZLLL(false) && C1390550mI1.LIZIZ(i)) {
            C13E8<String> c13e8 = C1391850mK7.LIZ;
            C1391850mK7.LJI = AFwS259S0000000_21.get$arr$(50);
            SmartRouter.addInterceptor(new PopupMonitorServiceImpl.PopupMonitorSmartRouterInterceptor());
        }
        PopupMonitorServiceImpl.LIZ.getClass();
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0Vbw
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v6, types: [X.0mHc] */
            public static void LIZ() {
                IPermissionPopUpService iPermissionPopUpService;
                C801240Vbu c801240Vbu = PermissionPopUpService.LL;
                Object objLIZ = C04TD.LIZ(IPermissionPopUpService.class, false);
                if (objLIZ != null) {
                    iPermissionPopUpService = (IPermissionPopUpService) objLIZ;
                } else {
                    if (C04TD.LJIJJLI == null) {
                        synchronized (IPermissionPopUpService.class) {
                            if (C04TD.LJIJJLI == null) {
                                C04TD.LJIJJLI = new PermissionPopUpService();
                            }
                        }
                    }
                    iPermissionPopUpService = C04TD.LJIJJLI;
                }
                if (iPermissionPopUpService != 0) {
                    iPermissionPopUpService.LIZ(new InterfaceC801250Vbv() { // from class: X.0mHc
                        @Override // X.InterfaceC801250Vbv
                        public final void LIZIZ(String[] strArr) {
                            C1390650mIB c1390650mIB2 = C1390650mIB.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("[PUMBAA]onPermissionPopUpShow: ");
                            sbLIZ3.append(C13LQ.LJJJ(strArr, null, null, null, null, 63));
                            C2188811AlT.LIZIZ(sbLIZ3);
                            c1390650mIB2.getClass();
                            PopupMonitorServiceImpl.LIZ.getClass();
                            C23250099c.LIZLLL(PopupMonitorServiceImpl.LIZIZ, null, null, new C1390270mHZ(strArr, PopupMonitorServiceImpl.LJJIJL(), null), 3);
                        }

                        @Override // X.InterfaceC801250Vbv
                        public final void LIZ(String[] strArr, EnumC801210Vbr enumC801210Vbr) {
                            String str;
                            boolean z;
                            C1390650mIB c1390650mIB2 = C1390650mIB.LIZ;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("[PUMBAA]onPermissionPopUpClick: ");
                            sbLIZ3.append(C13LQ.LJJJ(strArr, null, null, null, null, 63));
                            sbLIZ3.append(" - ");
                            sbLIZ3.append(enumC801210Vbr.name());
                            C2188811AlT.LIZIZ(sbLIZ3);
                            c1390650mIB2.getClass();
                            EnumC801210Vbr enumC801210Vbr2 = EnumC801210Vbr.Approve;
                            if (enumC801210Vbr == enumC801210Vbr2) {
                                str = "positive";
                            } else {
                                str = "negative";
                            }
                            PopupMonitorServiceImpl popupMonitorServiceImpl = PopupMonitorServiceImpl.LIZ;
                            String strLJJJ = C13LQ.LJJJ(strArr, null, null, null, null, 63);
                            if (enumC801210Vbr == enumC801210Vbr2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            popupMonitorServiceImpl.getClass();
                            if (PopupMonitorServiceImpl.LJJJJIZL() && C1390550mI1.LIZ.isClickEnabled) {
                                C23250099c.LIZLLL(PopupMonitorServiceImpl.LIZIZ, null, null, new C1390250mHX(strLJJJ, z, str, PopupMonitorServiceImpl.LJJIJL(), null), 3);
                            }
                        }
                    });
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PopupMonitorServiceImpl@8747.startSystemPermissionMonitor$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.startSystemPermissionMonitor$1");
            }
        });
        PopupMonitorServiceImpl.LJI = EnumC1390600mI6.LLILLJJLI;
        C1390650mIB.LJ(0);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.tryStart$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1390540mI0(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
