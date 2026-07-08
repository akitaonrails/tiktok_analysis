package X;

import Y.ARunnableS32S0110000_13;
import android.content.Context;
import android.os.Looper;
import com.bytedance.push.third.PushManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VoG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808900VoG implements InterfaceC808880VoE {
    public final Map<Integer, Boolean> LIZ = new ConcurrentHashMap();
    public final C808940VoK LIZIZ = new C808940VoK(this);

    public final boolean LIZ(Context context) {
        boolean z;
        boolean zIsPushAvailable;
        C808950VoL.LIZIZ().getClass();
        Set setKeySet = null;
        if (C808950VoL.LJ()) {
            Map<Integer, AbstractC809510VpF<InterfaceC809530VpH>> map = C809470VpB.LJIIIIZZ(context).LIZ;
            if (map != null) {
                setKeySet = ((HashMap) map).keySet();
            }
            Iterator it2 = setKeySet.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                int iIntValue = ((Integer) it2.next()).intValue();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SenderService.tryConfigPush(");
                sbLIZ.append(iIntValue);
                sbLIZ.append(")");
                C2188811AlT.LIZIZ(sbLIZ);
                if (context == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("SenderService.tryConfigPush(");
                    sbLIZ2.append(iIntValue);
                    sbLIZ2.append(") fail: Context is null!!!");
                    C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    C808950VoL.LIZIZ().getClass();
                    z = true;
                    if (!C808950VoL.LJ() && C808950VoL.LIZLLL().LJIIL()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("SenderService.tryConfigPush(");
                        sbLIZ3.append(iIntValue);
                        sbLIZ3.append(") fail: Is shut push enabled!!!");
                        C2188811AlT.LIZIZ(sbLIZ3);
                    } else {
                        Context contextN3 = C786410Ut5.N3(context);
                        if (AbstractC809480VpC.LJI(iIntValue) && contextN3 != null && PushManager.inst().isPushAvailable(contextN3, iIntValue)) {
                            synchronized (this) {
                                try {
                                    Boolean bool = (Boolean) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(iIntValue));
                                    if (bool != null && bool.booleanValue()) {
                                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                        sbLIZ4.append("SenderService.tryConfigPush(");
                                        sbLIZ4.append(iIntValue);
                                        sbLIZ4.append(") return: Had Registered, return!!!");
                                        C2188811AlT.LIZIZ(sbLIZ4);
                                    } else {
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append("SenderService.tryConfigPush(");
                                        sbLIZ5.append(iIntValue);
                                        sbLIZ5.append(") mPushRegisteredMap put!!!");
                                        C2188811AlT.LIZIZ(sbLIZ5);
                                        ((ConcurrentHashMap) this.LIZ).put(Integer.valueOf(iIntValue), Boolean.TRUE);
                                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                        sbLIZ6.append("SenderService.registerPush(): ");
                                        sbLIZ6.append(iIntValue);
                                        C2188811AlT.LIZIZ(sbLIZ6);
                                        if (AbstractC809480VpC.LJI(iIntValue) && contextN3 != null) {
                                            PushManager.inst().registerPush(contextN3, iIntValue);
                                        }
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            z2 |= z;
                        } else {
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append("SenderService.tryConfigPush(");
                            sbLIZ7.append(iIntValue);
                            sbLIZ7.append(") fail - serverSupport: ");
                            sbLIZ7.append(AbstractC809480VpC.LJI(iIntValue));
                            sbLIZ7.append("; typeAvailable: ");
                            if (contextN3 == null) {
                                zIsPushAvailable = false;
                            } else {
                                zIsPushAvailable = PushManager.inst().isPushAvailable(contextN3, iIntValue);
                            }
                            sbLIZ7.append(zIsPushAvailable);
                            sbLIZ7.append("!!!");
                            C2188811AlT.LIZIZ(sbLIZ7);
                        }
                    }
                }
                z = false;
                z2 |= z;
            }
            C786410Ut5.N3(context);
            return z2;
        }
        Map<Integer, AbstractC809510VpF<InterfaceC809530VpH>> map2 = C809470VpB.LJIIIIZZ(context).LIZ;
        if (map2 != null) {
            setKeySet = ((HashMap) map2).keySet();
        }
        Iterator it3 = setKeySet.iterator();
        while (it3.hasNext()) {
            int iIntValue2 = ((Integer) it3.next()).intValue();
            if (context != null) {
                PushManager.inst().unregisterPush(C786410Ut5.N3(context), iIntValue2);
            }
        }
        ((ConcurrentHashMap) this.LIZ).clear();
        return false;
    }

    public final void LIZIZ(boolean z) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C809030VoT c809030VoT = C809030VoT.LJIIJ;
            c809030VoT.LIZJ("tryUpdateSender_submitRunnable");
            c809030VoT.LIZ("tryUpdateSender_submitRunnable");
            RunnableC823120WQs.LIZIZ(new ARunnableS32S0110000_13(this, z, 7));
            return;
        }
        C809030VoT c809030VoT2 = C809030VoT.LJIIJ;
        c809030VoT2.LIZJ("tryUpdateSender_synchronously");
        c809030VoT2.LIZ("tryUpdateSender_synchronously");
        this.LIZIZ.LIZJ(z);
        c809030VoT2.LJ("tryUpdateSender_synchronously");
        c809030VoT2.LIZLLL("tryUpdateSender_synchronously");
    }
}
