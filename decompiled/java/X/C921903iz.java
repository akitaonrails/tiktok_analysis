package X;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;

/* JADX INFO: renamed from: X.03iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C921903iz {
    public static final C921903iz LIZ = new C921903iz();

    public static void LIZ(Object obj, String str) {
        LIZIZ(4, obj, str);
    }

    public static void LIZIZ(int i, Object obj, String str) {
        String strLIZIZ;
        String strValueOf;
        int i2;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        IECommerceHostService iECommerceHostService;
        boolean z2;
        String name2;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("ec_pay_enable_built_in_test_alog", false)) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name3 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name2 = iECommerceHostService.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (!((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
                return;
            }
        }
        try {
            if (C123100dR.LIZ(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EcPayment_");
                sbLIZ.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "EcPayment_Cashier";
            }
            if (obj instanceof Throwable) {
                strValueOf = Log.getStackTraceString((Throwable) obj);
            } else if (obj instanceof String) {
                strValueOf = (String) obj;
            } else {
                strValueOf = String.valueOf(obj);
            }
            int length = strValueOf.length();
            int i3 = 0;
            while (i3 < length) {
                int i4 = i3 + SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                if (i4 > length) {
                    i2 = length;
                } else {
                    i2 = i4;
                }
                String strSubstring = strValueOf.substring(i3, i2);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name4 = ILogDependencyService.class.getName();
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                }
                ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).crashlyticsWrapperLog(i, strLIZIZ, strSubstring);
                i3 = i4;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
