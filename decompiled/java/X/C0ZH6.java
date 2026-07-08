package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.im.callback.IIMUnder16Proxy;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0ZH6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZH6 {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC1643306c3 LIZ(PrivacySettingsFeature privacySettingsFeature) {
        if (privacySettingsFeature == null) {
            return EnumC1643306c3.NO_ONE;
        }
        if (!LIZJ(privacySettingsFeature)) {
            return EnumC1643306c3.NO_ONE;
        }
        if (C1689706jX.LIZ()) {
            int iLJIILLIIL = privacySettingsFeature.LJIILLIIL();
            if (iLJIILLIIL != 1) {
                if (iLJIILLIIL != 4) {
                    return EnumC1643306c3.NO_ONE;
                }
                return EnumC1643306c3.FRIENDS;
            }
            return EnumC1643306c3.PUBLIC;
        }
        if (privacySettingsFeature.LJIILLIIL() == 1) {
            return EnumC1643306c3.FRIENDS;
        }
        return EnumC1643306c3.NO_ONE;
    }

    public static boolean LIZIZ(PrivacySettingsFeature privacySettingsFeature) {
        Boolean bool;
        if (privacySettingsFeature == null || !LIZJ(privacySettingsFeature)) {
            return false;
        }
        String strLIZ = C0ZJN.LIZ();
        ReentrantReadWriteLock.ReadLock lock = C891910Yyr.LIZIZ.readLock();
        lock.lock();
        try {
            C0ZH7 c0zh7 = C891910Yyr.LIZ.get(strLIZ);
            Object obj = null;
            if (c0zh7 != null && System.currentTimeMillis() - c0zh7.LIZIZ < Mp4ScreenVideoLoadTimeout.CONTROL) {
                obj = c0zh7.LIZ;
            }
            lock.unlock();
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
                return bool.booleanValue();
            }
            return privacySettingsFeature.LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lock.unlock();
            throw th;
        }
    }

    public static boolean LIZJ(PrivacySettingsFeature privacySettingsFeature) {
        if (privacySettingsFeature == null || !C896370ZEl.LIZ() || !((C1400340mXo) C0I0B.LJFF.LIZ()).isLogin()) {
            return false;
        }
        IIMUnder16Proxy.LIZIZ.getClass();
        IIMUnder16Proxy value = C597290Nbj.LIZIZ.getValue();
        if (value != null && value.LIZJ()) {
            return false;
        }
        return privacySettingsFeature.LJIJJ();
    }
}
