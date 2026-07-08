package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.q;
import com.tiktok.strategycenter.settings.ISettingsManagerDelegate;
import com.tiktok.strategycenter.settings.SettingsManager;

/* JADX INFO: renamed from: X.1BcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208771BcZ implements ISettingsManagerDelegate {
    public static final C2208771BcZ LIZ;

    static {
        C2208771BcZ c2208771BcZ = new C2208771BcZ();
        LIZ = c2208771BcZ;
        ISettingsManagerDelegate.Companion.getClass();
        SettingsManager.INSTANCE.setInstance$ttm_strategy_center_release(c2208771BcZ);
    }

    @Override // com.tiktok.strategycenter.settings.ISettingsManagerDelegate
    public final String getSettingsJsonValue(String str) {
        Object objLJIIJJI = C0C59.LJ().LJIIJJI(str, true);
        if (objLJIIJJI instanceof String) {
            return (String) objLJIIJJI;
        }
        try {
            if (objLJIIJJI instanceof q) {
                return ((q) objLJIIJJI).LJIL();
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    @Override // com.tiktok.strategycenter.settings.ISettingsManagerDelegate
    public final boolean getSettingsBoolean(String str, boolean z) {
        Object objLJIIJJI = C0C59.LJ().LJIIJJI(str, false);
        if (objLJIIJJI instanceof Boolean) {
            return ((Boolean) objLJIIJJI).booleanValue();
        }
        try {
            if (objLJIIJJI instanceof q) {
                return ((q) objLJIIJJI).LJ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return z;
    }

    @Override // com.tiktok.strategycenter.settings.ISettingsManagerDelegate
    public final double getSettingsDouble(String str, double d) {
        Object objLJIIJJI = C0C59.LJ().LJIIJJI(str, false);
        if (objLJIIJJI instanceof Number) {
            return ((Number) objLJIIJJI).doubleValue();
        }
        try {
            if (objLJIIJJI instanceof q) {
                return ((q) objLJIIJJI).LJIIIZ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return d;
    }

    @Override // com.tiktok.strategycenter.settings.ISettingsManagerDelegate
    public final float getSettingsFloat(String str, float f) {
        Object objLJIIJJI = C0C59.LJ().LJIIJJI(str, false);
        if (objLJIIJJI instanceof Number) {
            return ((Number) objLJIIJJI).floatValue();
        }
        try {
            if (objLJIIJJI instanceof q) {
                return ((q) objLJIIJJI).LJIIJ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return f;
    }

    @Override // com.tiktok.strategycenter.settings.ISettingsManagerDelegate
    public final int getSettingsInt(String str, int i) {
        Object objLJIIJJI = C0C59.LJ().LJIIJJI(str, false);
        if (objLJIIJJI instanceof Number) {
            return ((Number) objLJIIJJI).intValue();
        }
        try {
            if (objLJIIJJI instanceof q) {
                return ((q) objLJIIJJI).LJIIJJI();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return i;
    }

    @Override // com.tiktok.strategycenter.settings.ISettingsManagerDelegate
    public final long getSettingsLong(String str, long j) {
        Object objLJIIJJI = C0C59.LJ().LJIIJJI(str, false);
        if (objLJIIJJI instanceof Number) {
            return ((Number) objLJIIJJI).longValue();
        }
        try {
            if (objLJIIJJI instanceof q) {
                return ((q) objLJIIJJI).LJIIZILJ();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return j;
    }

    @Override // com.tiktok.strategycenter.settings.ISettingsManagerDelegate
    public final String getSettingsString(String str, String str2) {
        Object objLJIIJJI = C0C59.LJ().LJIIJJI(str, false);
        if (objLJIIJJI instanceof String) {
            return (String) objLJIIJJI;
        }
        try {
            if (objLJIIJJI instanceof q) {
                return ((q) objLJIIJJI).LJIL();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return str2;
    }
}
