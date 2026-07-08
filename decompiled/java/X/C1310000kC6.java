package X;

import com.lynx.react.bridge.JavaOnlyMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kC6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310000kC6 {
    public long LIZ;
    public long LIZJ;
    public WeakReference<InterfaceC1310470kCr> LJ;
    public final ArrayList<Long> LIZIZ = new ArrayList<>();
    public boolean LIZLLL = false;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LIZ(long j, String str) {
        InterfaceC1310470kCr interfaceC1310470kCr;
        WeakReference<InterfaceC1310470kCr> weakReference;
        InterfaceC1310470kCr interfaceC1310470kCr2;
        switch (str.hashCode()) {
            case -1930716102:
                if (str.equals("loadBundleStart")) {
                    this.LIZ = j;
                }
                break;
            case 831051791:
                if (str.equals("updateDataStart")) {
                    this.LIZIZ.add(Long.valueOf(j));
                }
                break;
            case 925946781:
                if (str.equals("paintEnd")) {
                    this.LIZJ = j;
                    if (!this.LIZLLL && (weakReference = this.LJ) != null && (interfaceC1310470kCr2 = weakReference.get()) != null) {
                        this.LIZLLL = true;
                        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                        javaOnlyMap.put("entryType", "pipeline");
                        javaOnlyMap.put("name", "loadBundle");
                        javaOnlyMap.put("loadBundleStart", Double.valueOf(this.LIZ / 1000.0d));
                        javaOnlyMap.put("paintEnd", Double.valueOf(this.LIZJ / 1000.0d));
                        interfaceC1310470kCr2.onPerformanceEvent(C1310750kDJ.LJ(javaOnlyMap));
                    }
                    WeakReference<InterfaceC1310470kCr> weakReference2 = this.LJ;
                    if (weakReference2 != null && (interfaceC1310470kCr = weakReference2.get()) != null) {
                        ArrayList<Long> arrayList = new ArrayList(this.LIZIZ);
                        this.LIZIZ.clear();
                        for (Long l : arrayList) {
                            JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                            javaOnlyMap2.put("entryType", "pipeline");
                            javaOnlyMap2.put("name", "updateTriggeredByNative");
                            javaOnlyMap2.put("pipelineStart", Double.valueOf(l.longValue() / 1000.0d));
                            javaOnlyMap2.put("paintEnd", Double.valueOf(this.LIZJ / 1000.0d));
                            interfaceC1310470kCr.onPerformanceEvent(C1310750kDJ.LJ(javaOnlyMap2));
                        }
                        break;
                    }
                }
                break;
        }
    }
}
