package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ory, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489720ory {
    public static JSONObject LIZ;
    public static final Lock LIZIZ;
    public static final Lock LIZJ;

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        LIZIZ = reentrantReadWriteLock.readLock();
        LIZJ = reentrantReadWriteLock.writeLock();
    }

    public static int LIZ(URL url, C1489740os0 c1489740os0) {
        JSONArray jSONArrayOptJSONArray;
        int i;
        JSONArray jSONArrayOptJSONArray2;
        int i2;
        JSONObject jSONObjectOptJSONObject;
        if (url == null) {
            return -1;
        }
        try {
            Lock lock = LIZIZ;
            lock.lock();
            JSONObject jSONObject = LIZ;
            if (jSONObject == null) {
                lock.unlock();
                return -1;
            }
            if (jSONObject.optInt("enabled", 0) > 0) {
                JSONArray jSONArrayOptJSONArray3 = LIZ.optJSONArray("rule_list");
                if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() != 0) {
                    for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray3.optJSONObject(i3);
                        if (jSONObjectOptJSONObject2 != null) {
                            if (jSONObjectOptJSONObject2.has("host_eq")) {
                                jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("host_eq");
                                i = 1;
                            } else if (jSONObjectOptJSONObject2.has("host_wc")) {
                                jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("host_wc");
                                i = 2;
                            } else {
                                continue;
                            }
                            if (jSONArrayOptJSONArray != null && LIZIZ(i, url.getHost(), jSONArrayOptJSONArray)) {
                                if (jSONObjectOptJSONObject2.has("path_eq")) {
                                    jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("path_eq");
                                    i2 = 3;
                                } else if (jSONObjectOptJSONObject2.has("path_prefix")) {
                                    jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("path_prefix");
                                    i2 = 4;
                                } else if (jSONObjectOptJSONObject2.has("path_contain")) {
                                    jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("path_contain");
                                    i2 = 5;
                                } else if (jSONObjectOptJSONObject2.has("path_pattern")) {
                                    jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("path_pattern");
                                    i2 = 6;
                                } else {
                                    continue;
                                }
                                if (jSONArrayOptJSONArray2 != null && LIZIZ(i2, url.getPath(), jSONArrayOptJSONArray2) && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("value")) != null) {
                                    c1489740os0.LIZ = jSONObjectOptJSONObject.optInt("conn_to", -1);
                                    c1489740os0.LIZIZ = jSONObjectOptJSONObject.optInt("read_to", -1);
                                    c1489740os0.LIZJ = jSONObjectOptJSONObject.optInt("write_to", -1);
                                    int iOptInt = jSONObjectOptJSONObject.optInt("pro_to", -1);
                                    LIZIZ.unlock();
                                    return iOptInt;
                                }
                            }
                        }
                    }
                } else {
                    lock.unlock();
                    return -1;
                }
            } else {
                lock.unlock();
                return -1;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZIZ.unlock();
        return -1;
    }

    public static boolean LIZIZ(int i, String str, JSONArray jSONArray) {
        if (str != null && !str.isEmpty() && jSONArray.length() != 0) {
            try {
                switch (i) {
                    case 1:
                    case 3:
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            String strOptString = jSONArray.optString(i2);
                            if (!TextUtils.isEmpty(strOptString) && str.equals(strOptString)) {
                                return true;
                            }
                        }
                        return false;
                    case 2:
                        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                            String strOptString2 = jSONArray.optString(i3);
                            if (!TextUtils.isEmpty(strOptString2) && C2088908Gh.LIZIZ(str, strOptString2)) {
                                return true;
                            }
                        }
                        return false;
                    case 4:
                        for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                            String strOptString3 = jSONArray.optString(i4);
                            if (!TextUtils.isEmpty(strOptString3) && str.startsWith(strOptString3)) {
                                return true;
                            }
                        }
                        return false;
                    case 5:
                        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                            String strOptString4 = jSONArray.optString(i5);
                            if (!TextUtils.isEmpty(strOptString4) && str.contains(strOptString4)) {
                                return true;
                            }
                        }
                        return false;
                    case 6:
                        for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                            String strOptString5 = jSONArray.optString(i6);
                            if (!TextUtils.isEmpty(strOptString5) && str.matches(strOptString5)) {
                                return true;
                            }
                        }
                        return false;
                    default:
                        return false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }
}
