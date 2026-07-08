package X;

import android.location.Location;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.i18n.location.api.internal.GsonHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.1A5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173651A5b {
    public static LocationData LIZIZ(String str) {
        Object obj;
        LocationData locationData;
        int i;
        Object obj2 = null;
        try {
            LocationData locationData2 = (LocationData) ((Gson) GsonHelper.LIZ.getValue()).LJII(str, LocationData.class);
            if (locationData2 != null) {
                if (!locationData2.isCache) {
                    i = 0;
                } else {
                    i = locationData2.cacheType;
                    if (i == 0) {
                        i = 1;
                    }
                }
                locationData2.cacheType = i;
                locationData = locationData2;
            } else {
                locationData = null;
            }
            C189200o6.m2constructorimpl(locationData);
            obj = locationData;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (LocationData) obj2;
    }

    public static LocationData LIZ(Location location, int i) throws Throwable {
        if (location != null) {
            double dLJJZ = C2204961BRm.LJJZ(location, new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oKzkkYkiae5jJWrUF1iVRUw=", null));
            double dLJJZZI = C2204961BRm.LJJZZI(location, new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oKzkkYkiae5jJWrUF1iVRUw=", null));
            long time = location.getTime();
            int i2 = 1;
            if (i != 1) {
                i2 = 0;
            }
            return new LocationData(dLJJZ, dLJJZZI, time, 0, "Success", i2, false, location.getAccuracy(), location.getProvider(), 0, null, null, null, null, null, null, null, null, null, 523840, null);
        }
        return LocationData.LJFF;
    }
}
