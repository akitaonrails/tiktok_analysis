package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0WFI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0WFI implements InterfaceC810050Vq7 {
    public final SharedPreferences LIZ;
    public final Map<InterfaceC810260VqS, SharedPreferences.OnSharedPreferenceChangeListener> LIZIZ = new ConcurrentHashMap();

    @Override // X.InterfaceC810050Vq7
    public final void LIZ(Context context, String str, String str2) {
    }

    @Override // X.InterfaceC810050Vq7
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC810050Vq7
    public SharedPreferences.Editor edit() {
        return this.LIZ.edit();
    }

    @Override // X.InterfaceC810050Vq7
    public final float LIZJ(String str) {
        return getFloat(str, 0.0f);
    }

    @Override // X.InterfaceC810050Vq7
    public final boolean contains(String str) {
        return this.LIZ.contains(str);
    }

    @Override // X.InterfaceC810050Vq7
    public final boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // X.InterfaceC810050Vq7
    public final int getInt(String str) {
        return getInt(str, 0);
    }

    @Override // X.InterfaceC810050Vq7
    public final long getLong(String str) {
        return getLong(str, 0L);
    }

    @Override // X.InterfaceC810050Vq7
    public final String getString(String str) {
        return getString(str, null);
    }

    public C0WFI(Context context, String str) {
        this.LIZ = C810670Vr7.LIZJ(context, 0, str);
    }

    @Override // X.InterfaceC810050Vq7
    public final boolean getBoolean(String str, boolean z) {
        try {
            return this.LIZ.getBoolean(str, z);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return z;
        }
    }

    @Override // X.InterfaceC810050Vq7
    public final float getFloat(String str, float f) {
        try {
            return this.LIZ.getFloat(str, f);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return f;
        }
    }

    @Override // X.InterfaceC810050Vq7
    public final int getInt(String str, int i) {
        try {
            return this.LIZ.getInt(str, i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return i;
        }
    }

    @Override // X.InterfaceC810050Vq7
    public final long getLong(String str, long j) {
        try {
            return this.LIZ.getLong(str, j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return j;
        }
    }

    @Override // X.InterfaceC810050Vq7
    public final String getString(String str, String str2) {
        try {
            return this.LIZ.getString(str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str2;
        }
    }
}
