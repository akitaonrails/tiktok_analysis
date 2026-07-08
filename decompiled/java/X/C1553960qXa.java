package X;

import Y.ARunnableS31S0101000_20;
import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0qXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553960qXa extends AbstractC1553980qXc {
    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        C1289800jfW.LL.LIZ(null, null);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws Throwable {
        Activity activityLIZLLL;
        Cert certFindCert;
        InterfaceC1554000qXe interfaceC1554000qXe = (InterfaceC1554000qXe) xBaseParamModel;
        C1544050qHb c1544050qHb = C1544050qHb.LIZ;
        String jsbSecureDataflowId = interfaceC1554000qXe.getJsbSecureDataflowId();
        String name = getName();
        c1544050qHb.getClass();
        C443120HZe c443120HZeLIZ = C1544050qHb.LIZ(jsbSecureDataflowId, name);
        int i = 0;
        Sensor sensorLJJL = null;
        if (!((Boolean) c443120HZeLIZ.getFirst()).booleanValue() && c443120HZeLIZ.getSecond() == null) {
            C2382909Vj.LIZ(completionBlock, 0, (String) c443120HZeLIZ.getThird(), null, 4);
            return;
        }
        Number interval = interfaceC1554000qXe.getInterval();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                C1289800jfW c1289800jfW = C1289800jfW.LL;
                int iIntValue = interval.intValue();
                Integer num = (Integer) c443120HZeLIZ.getSecond();
                String hybridUrl = getHybridUrl(enumC1063300dmC);
                c1289800jfW.LIZ(num, null);
                if (iIntValue >= 1 && iIntValue <= 1000) {
                    C1289800jfW.LLILLJJLI = (SensorManager) C786410Ut5.H2(activityLIZLLL, "sensor");
                    BPEAHandler bPEAHandler = new BPEAHandler();
                    C1289800jfW.LLILLL = bPEAHandler;
                    ARunnableS31S0101000_20 aRunnableS31S0101000_20 = new ARunnableS31S0101000_20(iIntValue, interfaceC634840OvC2, 12);
                    C1289800jfW.LLILZ = aRunnableS31S0101000_20;
                    C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS31S0101000_20);
                    int i2 = LSPassThroughRecordSizeConfig.DEFAULT / iIntValue;
                    if (i2 >= 0) {
                        if (i2 < 10) {
                            i = 3;
                        } else if (10 <= i2) {
                            if (i2 < 30) {
                                i = 2;
                            } else if (i2 < 61) {
                                i = 1;
                            }
                        }
                    }
                    if (num == null) {
                        certFindCert = CertProviderManagerKt.findCert("bpea-x_bridge_sensor", 1476415497);
                    } else {
                        certFindCert = CertProviderManagerKt.findCert("bpea-x_bridge_sensor", 1476415497);
                        certFindCert.attachCustomInfo("jsb_referer_url", hybridUrl);
                    }
                    SensorManager sensorManager = C1289800jfW.LLILLJJLI;
                    if (sensorManager != null) {
                        sensorLJJL = C2204961BRm.LJJL(sensorManager, 15, new C0WZX("dzBzEgAjS8/YVFkiQFyXYrVA0GMFcp+4DKrYuhWXK2285AhumM+bjzFtiXOsblKFXfGA1nSaGFI=", null));
                    }
                    try {
                        SensorManager sensorManager2 = C1289800jfW.LLILLJJLI;
                        if (sensorManager2 != null) {
                            C1300690jx5.LIZJ(sensorManager2, c1289800jfW, sensorLJJL, i, certFindCert);
                        }
                    } catch (C838130WuJ e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1554020qXg.class)), "start gyroscope execute success.");
            return;
        }
        int i3 = C2187451AjH.LIZ;
        InterfaceC1297560js2 interfaceC1297560js2 = C1543410qGZ.LJIIIZ;
        C2382909Vj.LIZ(completionBlock, 0, "context is null!!", null, 4);
    }
}
