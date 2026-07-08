package com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2;

import X.C01IU;
import X.C01JX;
import X.C020Z;
import X.C1516000pYM;
import X.C19748512Ol;
import X.C20441214yg;
import X.C334801Rq;
import X.C356801a2;
import X.InterfaceC927690aFT;
import X.InterfaceC948500an2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.anchor.CountDownForAllV2AnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.guest.CountDownForAllV2GuestViewModel;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS629S0100000_15;
import webcast.data.multi_guest_play.CountdownForAllConfig;
import webcast.data.multi_guest_play.CountdownForAllContent;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC948500an2(name = "COUNT_DOWN_FOR_ALL_V2_SERVICE")
public final class CountDownForAllV2Service<VM extends BaseCountDownForAllV2ViewModel> implements InterfaceC927690aFT {
    public static final /* synthetic */ int LIZIZ = 0;
    public final VM LIZ;

    @Override // X.InterfaceC927690aFT
    public final boolean LIZJ() {
        VM vm = this.LIZ;
        return vm.yQ2() == 1 || vm.yQ2() == 2;
    }

    @Override // X.InterfaceC927690aFT
    public final boolean LJFF() {
        Integer numValueOf = Integer.valueOf(this.LIZ.yQ2());
        if (numValueOf != null) {
            return numValueOf.intValue() == 1 || numValueOf.intValue() == 2 || numValueOf.intValue() == 3;
        }
        return false;
    }

    @Override // X.InterfaceC927690aFT
    public final CountdownForAllConfig getConfig() {
        CountdownForAllContent countdownForAllContentWQ2 = this.LIZ.wQ2();
        if (countdownForAllContentWQ2 != null) {
            return countdownForAllContentWQ2.playConfig;
        }
        return null;
    }

    @Override // X.InterfaceC927690aFT
    public final Long getPlayId() {
        return Long.valueOf(this.LIZ.xQ2());
    }

    @Override // X.InterfaceC927690aFT
    public final String getEffectId() {
        String str;
        CountdownForAllConfig config = getConfig();
        return (config == null || (str = config.resourceId) == null) ? "" : str;
    }

    public CountDownForAllV2Service(VM vm) {
        this.LIZ = vm;
    }

    @Override // X.InterfaceC927690aFT
    public final void LIZ(SeiAppData seiAppData) {
        CountDownForAllV2GuestViewModel countDownForAllV2GuestViewModel;
        Map<String, Map<String, String>> mapLJFF;
        Object objCast;
        Unit unit;
        Object objLJII;
        VM vm = this.LIZ;
        if ((vm instanceof CountDownForAllV2GuestViewModel) && (countDownForAllV2GuestViewModel = (CountDownForAllV2GuestViewModel) vm) != null) {
            C356801a2<SeiAppData> c356801a2 = countDownForAllV2GuestViewModel.LLILLL.LJIILLIIL;
            if (c356801a2.LIZ() && seiAppData != null && (mapLJFF = seiAppData.LJFF()) != null) {
                for (Map.Entry<String, Class<?>> entry : c356801a2.LIZIZ.entrySet()) {
                    String key = entry.getKey();
                    Class<?> value = entry.getValue();
                    Map<String, String> map = mapLJFF.get(key);
                    if (map != null) {
                        try {
                            objLJII = C19748512Ol.LIZIZ.LJII(C1516000pYM.LIZJ(map), value);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C20441214yg.LJ("SeiPlayComponent", th.getMessage());
                            unit = Unit.LIZ;
                        }
                        if (objLJII != null) {
                            c356801a2.LIZJ.put(key, objLJII);
                            unit = Unit.LIZ;
                            if (unit == null) {
                            }
                        }
                    }
                    c356801a2.LIZJ.remove(key);
                }
                for (Map.Entry entry2 : c356801a2.LIZLLL.entrySet()) {
                    Function2 function2 = (Function2) entry2.getKey();
                    Object value2 = entry2.getValue();
                    Class<?> cls = c356801a2.LIZIZ.get(value2);
                    if (cls != null) {
                        Object obj = c356801a2.LIZJ.get(value2);
                        if (obj != null) {
                            objCast = cls.cast(obj);
                        } else {
                            objCast = null;
                        }
                        function2.invoke(seiAppData, objCast);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC927690aFT
    public final long LIZLLL(Long l) {
        return this.LIZ.AQ2(l);
    }

    @Override // X.InterfaceC927690aFT
    public final void LJ(CountdownForAllContent countdownForAllContent) {
        CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel;
        VM vm = this.LIZ;
        if ((vm instanceof CountDownForAllV2AnchorViewModel) && (countDownForAllV2AnchorViewModel = (CountDownForAllV2AnchorViewModel) vm) != null && countdownForAllContent != null) {
            C01IU c01iu = countDownForAllV2AnchorViewModel.LLILZIL;
            c01iu.LJFF(countdownForAllContent, "resumeCountDownForAll");
            c01iu.LJIIJ("resumeCountDownForAll", false);
        }
    }

    @Override // X.InterfaceC927690aFT
    public final void LIZIZ(Long l, Function2<? super String, ? super LiveEffect, Unit> function2) {
        long j;
        String str;
        if (!LJFF()) {
            function2.invoke("", null);
            return;
        }
        long jLIZLLL = LIZLLL(l);
        CountdownForAllConfig config = getConfig();
        if (config != null) {
            j = config.targetScore;
        } else {
            j = 0;
        }
        if (jLIZLLL >= j) {
            function2.invoke("", null);
            return;
        }
        CountdownForAllConfig config2 = getConfig();
        if (config2 != null && (str = config2.resourceId) != null) {
            C01JX.LIZJ(str, true, new C020Z((Function2) function2, (Function2<? super String, ? super LiveEffect, Unit>) this, 2));
        } else {
            function2.invoke("", null);
        }
    }

    @Override // X.InterfaceC927690aFT
    public final void LJI(CountdownForAllConfig countdownForAllConfig, C334801Rq c334801Rq, AwS629S0100000_15 awS629S0100000_15) {
        CountDownForAllV2AnchorViewModel countDownForAllV2AnchorViewModel;
        VM vm = this.LIZ;
        if ((vm instanceof CountDownForAllV2AnchorViewModel) && (countDownForAllV2AnchorViewModel = (CountDownForAllV2AnchorViewModel) vm) != null) {
            countDownForAllV2AnchorViewModel.GQ2(countdownForAllConfig, c334801Rq, awS629S0100000_15);
        }
    }
}
