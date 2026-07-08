package com.benchmark.strategy.nativePort;

import X.C1155904fd;
import X.C1556750qc5;
import X.C2079408Cq;
import X.C21308918aF;
import X.C21309718aN;
import X.C806930Vl5;
import X.InterfaceC21309118aH;
import com.benchmark.ByteBenchBundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class ByteBenchStrategyPort {
    public int mOriginId;
    public C21308918aF mSettings;
    public InterfaceC21309118aH mStrategyInfoCallback;
    public ConcurrentHashMap<String, C1155904fd> mStrategyRegisterMap = new ConcurrentHashMap<>();

    private native void native_clearStrategyCache(int i, String str);

    private native boolean native_contains(int i, String str);

    private native String native_getAllChildrenSpaceID(int i);

    private native String native_getDeviceAllFeatureForServer(int i);

    private native String native_getOneSpaceKeyList(int i, String str);

    private native String native_getOneSpaceStrategyList(int i, String str, String str2);

    private native void native_init(long j);

    private native boolean native_obtainBoolStrategy(int i, String str, boolean z, String str2, String str3, boolean z2);

    private native float native_obtainFloatStrategy(int i, String str, float f, String str2, String str3, boolean z);

    private native int native_obtainIntStrategy(int i, String str, int i2, String str2, String str3, boolean z);

    private native long native_obtainLongStrategy(int i, String str, long j, String str2, String str3, boolean z);

    private native boolean native_obtainStaticBoolStrategy(int i, String str, boolean z);

    private native float native_obtainStaticFloatStrategy(int i, String str, float f);

    private native int native_obtainStaticIntStrategy(int i, String str, int i2);

    private native long native_obtainStaticLongStrategy(int i, String str, long j);

    private native String native_obtainStaticStrStrategy(int i, String str, String str2);

    private native String native_obtainStrStrategy(int i, String str, String str2, String str3, String str4, boolean z);

    private native void native_openRepo(int i);

    private native void native_registerBXStrategyInfoCallback(int i);

    private native void native_registerBoolStrategy(int i, String str, boolean z, long j);

    private native void native_registerFloatStrategy(int i, String str, float f, long j);

    private native void native_registerIntStrategy(int i, String str, int i2, long j);

    private native void native_registerLongStrategy(int i, String str, long j, long j2);

    private native void native_registerStrStrategy(int i, String str, String str2, long j);

    private native void native_release(int i);

    private native void native_unregisterStrategy(int i, String str);

    public void strategyInfoCallback(int i, int i2, String str) {
    }

    public String[] getAllChildrenSpaceID() {
        if (C2079408Cq.LIZIZ) {
            return native_getAllChildrenSpaceID(getRepoName()).split(",");
        }
        return null;
    }

    public int getRepoName() {
        int i = this.mOriginId;
        if (i > 0) {
            return i;
        }
        C21309718aN c21309718aN = C21309718aN.LJIIZILJ;
        if (c21309718aN != null) {
            return c21309718aN.LIZJ;
        }
        return 0;
    }

    public void openRepo() {
        if (C2079408Cq.LIZIZ) {
            native_openRepo(getRepoName());
        }
    }

    public ByteBenchStrategyPort(int i) {
        this.mOriginId = i;
    }

    public void clearStrategyCache(String str) {
        if (C2079408Cq.LIZIZ) {
            native_clearStrategyCache(getRepoName(), str);
        }
    }

    public boolean contains(String str) {
        if (C2079408Cq.LIZIZ) {
            return native_contains(getRepoName(), str);
        }
        return false;
    }

    public void getDeviceFeatureForServer(HashMap<String, String> map) {
        if (C2079408Cq.LIZIZ) {
            try {
                JSONObject jSONObject = new JSONObject(native_getDeviceAllFeatureForServer(getRepoName()));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, String.valueOf((float) jSONObject.optDouble(next)));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public List<C1556750qc5> getOneSpaceKeyList(String str) {
        if (!C2079408Cq.LIZIZ) {
            return null;
        }
        String strNative_getOneSpaceKeyList = native_getOneSpaceKeyList(getRepoName(), str);
        if (strNative_getOneSpaceKeyList.isEmpty()) {
            return null;
        }
        String[] strArrSplit = strNative_getOneSpaceKeyList.split(",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            C1556750qc5 c1556750qc5 = new C1556750qc5();
            String[] strArrSplit2 = str2.split("-");
            if (strArrSplit2.length >= 3) {
                c1556750qc5.LIZ = strArrSplit2[0];
                c1556750qc5.LIZIZ = CastIntegerProtector.parseInt(strArrSplit2[1]);
                c1556750qc5.LIZJ = CastIntegerProtector.parseInt(strArrSplit2[2]);
                arrayList.add(c1556750qc5);
            }
        }
        return arrayList;
    }

    public int init(C21308918aF c21308918aF) {
        this.mSettings = c21308918aF;
        if (!C2079408Cq.LIZIZ) {
            return -3;
        }
        ByteBenchBundle byteBenchBundleObtain = ByteBenchBundle.obtain();
        C806930Vl5.LIZ("ByteBenchStrategyPort");
        c21308918aF.getClass();
        byteBenchBundleObtain.setLong("update_interval_time", 0L);
        byteBenchBundleObtain.setBool("open_real_time_decision", true);
        byteBenchBundleObtain.setInt("second_app_id", 0);
        byteBenchBundleObtain.setString("access_key", c21308918aF.LIZIZ);
        byteBenchBundleObtain.setString("secret_key", c21308918aF.LIZJ);
        byteBenchBundleObtain.setInt("try_count", c21308918aF.LIZ);
        byteBenchBundleObtain.setInt("origin_id", this.mOriginId);
        byteBenchBundleObtain.setInt("bytebench_app_id", this.mSettings.LIZLLL);
        native_init(byteBenchBundleObtain.getHandle());
        byteBenchBundleObtain.recycle();
        return 0;
    }

    public void registerBXStrategyInfoCallback(InterfaceC21309118aH interfaceC21309118aH) {
        if (C2079408Cq.LIZIZ) {
            native_registerBXStrategyInfoCallback(getRepoName());
        }
    }

    public boolean registerBoolStrategy(C1155904fd<Boolean> c1155904fd) {
        if (!C2079408Cq.LIZIZ) {
            return false;
        }
        ConcurrentHashMap<String, C1155904fd> concurrentHashMap = this.mStrategyRegisterMap;
        c1155904fd.getClass();
        concurrentHashMap.put(null, c1155904fd);
        getRepoName();
        throw null;
    }

    public boolean registerFloatStrategy(C1155904fd<Float> c1155904fd) {
        if (!C2079408Cq.LIZIZ) {
            return false;
        }
        ConcurrentHashMap<String, C1155904fd> concurrentHashMap = this.mStrategyRegisterMap;
        c1155904fd.getClass();
        concurrentHashMap.put(null, c1155904fd);
        getRepoName();
        throw null;
    }

    public boolean registerIntStrategy(C1155904fd<Integer> c1155904fd) {
        if (!C2079408Cq.LIZIZ) {
            return false;
        }
        ConcurrentHashMap<String, C1155904fd> concurrentHashMap = this.mStrategyRegisterMap;
        c1155904fd.getClass();
        concurrentHashMap.put(null, c1155904fd);
        getRepoName();
        throw null;
    }

    public boolean registerLongStrategy(C1155904fd<Long> c1155904fd) {
        if (!C2079408Cq.LIZIZ) {
            return false;
        }
        ConcurrentHashMap<String, C1155904fd> concurrentHashMap = this.mStrategyRegisterMap;
        c1155904fd.getClass();
        concurrentHashMap.put(null, c1155904fd);
        getRepoName();
        throw null;
    }

    public boolean registerStrStrategy(C1155904fd<String> c1155904fd) {
        if (C2079408Cq.LIZIZ) {
            ConcurrentHashMap<String, C1155904fd> concurrentHashMap = this.mStrategyRegisterMap;
            c1155904fd.getClass();
            concurrentHashMap.put(null, c1155904fd);
            native_registerStrStrategy(getRepoName(), null, null, 0L);
            return false;
        }
        return false;
    }

    public void release(int i) {
        if (C2079408Cq.LIZIZ) {
            native_release(i);
        }
    }

    public void unregisterStrategy(String str) {
        if (C2079408Cq.LIZIZ) {
            native_unregisterStrategy(getRepoName(), str);
        }
        this.mStrategyRegisterMap.remove(str);
    }

    private void update(String str, Object obj) {
        this.mStrategyRegisterMap.get(str);
    }

    public JSONObject getOneSpaceStrategyList(String str, String str2) {
        String strNative_getOneSpaceStrategyList;
        if (C2079408Cq.LIZIZ && (strNative_getOneSpaceStrategyList = native_getOneSpaceStrategyList(getRepoName(), str, str2)) != null && !strNative_getOneSpaceStrategyList.isEmpty()) {
            try {
                return new JSONObject(strNative_getOneSpaceStrategyList);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    public boolean obtainStaticBoolStrategy(String str, boolean z) {
        if (C2079408Cq.LIZIZ) {
            return native_obtainStaticBoolStrategy(getRepoName(), str, z);
        }
        return z;
    }

    public float obtainStaticFloatStrategy(String str, float f) {
        if (C2079408Cq.LIZIZ) {
            return native_obtainStaticFloatStrategy(getRepoName(), str, f);
        }
        return f;
    }

    public int obtainStaticIntStrategy(String str, int i) {
        if (C2079408Cq.LIZIZ) {
            return native_obtainStaticIntStrategy(getRepoName(), str, i);
        }
        return i;
    }

    public long obtainStaticLongStrategy(String str, long j) {
        if (C2079408Cq.LIZIZ) {
            return native_obtainStaticLongStrategy(getRepoName(), str, j);
        }
        return j;
    }

    public String obtainStaticStrStrategy(String str, String str2) {
        if (C2079408Cq.LIZIZ) {
            return native_obtainStaticStrStrategy(getRepoName(), str, str2);
        }
        return str2;
    }

    public void strategyNativeCallback(String str, float f) {
        update(str, Float.valueOf(f));
    }

    public void strategyNativeCallback(String str, int i) {
        update(str, Integer.valueOf(i));
    }

    public void strategyNativeCallback(String str, long j) {
        update(str, Long.valueOf(j));
    }

    public void strategyNativeCallback(String str, boolean z) {
        update(str, Boolean.valueOf(z));
    }

    public void strategyNativeCallback(String str, String str2) {
        update(str, str2);
    }

    public boolean obtainBoolStrategy(String str, boolean z, String str2, String str3, boolean z2) {
        if (!C2079408Cq.LIZIZ) {
            return z;
        }
        return native_obtainBoolStrategy(getRepoName(), str, z, str2, str3, z2);
    }

    public float obtainFloatStrategy(String str, float f, String str2, String str3, boolean z) {
        if (!C2079408Cq.LIZIZ) {
            return f;
        }
        return native_obtainFloatStrategy(getRepoName(), str, f, str2, str3, z);
    }

    public int obtainIntStrategy(String str, int i, String str2, String str3, boolean z) {
        if (!C2079408Cq.LIZIZ) {
            return i;
        }
        return native_obtainIntStrategy(getRepoName(), str, i, str2, str3, z);
    }

    public long obtainLongStrategy(String str, long j, String str2, String str3, boolean z) {
        if (!C2079408Cq.LIZIZ) {
            return j;
        }
        return native_obtainLongStrategy(getRepoName(), str, j, str2, str3, z);
    }

    public String obtainStrStrategy(String str, String str2, String str3, String str4, boolean z) {
        if (!C2079408Cq.LIZIZ) {
            return str2;
        }
        return native_obtainStrStrategy(getRepoName(), str, str2, str3, str4, z);
    }
}
