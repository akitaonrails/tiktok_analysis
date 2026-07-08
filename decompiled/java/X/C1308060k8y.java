package X;

import com.bytedance.android.starship.IDataProvider;
import com.bytedance.android.starship.IDataStore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS208S0000000_20;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0k8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308060k8y {
    public static int LIZIZ;
    public static boolean LIZLLL;
    public static final C1308060k8y LIZ = new C1308060k8y();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final C01GW LJ = C452501pT.LIZIZ(new C313680CRi());
    public static final C1308110k93 LJFF = new IDataProvider() { // from class: X.0k93
        @Override // com.bytedance.android.starship.IDataProvider, X.InterfaceC1307050k7L
        public final String getName() {
            return "TestDataProvider";
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0022 A[ORIG_RETURN, RETURN] */
        @Override // com.bytedance.android.starship.IDataProvider, X.InterfaceC1307050k7L
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object getData(java.lang.String r11) {
            /*
                r10 = this;
                int r9 = r11.hashCode()
                r0 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r8 = java.lang.Float.valueOf(r0)
                r0 = 1
                java.lang.Long r7 = java.lang.Long.valueOf(r0)
                java.lang.String r6 = "data"
                java.lang.String r5 = "float"
                java.lang.String r4 = "long"
                java.lang.String r3 = "int"
                java.lang.String r2 = "string"
                r0 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                switch(r9) {
                    case -891985903: goto L24;
                    case 104431: goto L2b;
                    case 107868: goto L32;
                    case 3322014: goto L4c;
                    case 3327612: goto L5d;
                    case 97526364: goto L64;
                    default: goto L22;
                }
            L22:
                r8 = 0
            L23:
                return r8
            L24:
                boolean r0 = r11.equals(r2)
                if (r0 == 0) goto L22
                return r6
            L2b:
                boolean r0 = r11.equals(r3)
                if (r0 == 0) goto L22
                return r1
            L32:
                java.lang.String r0 = "map"
                boolean r0 = r11.equals(r0)
                if (r0 == 0) goto L22
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r0.put(r2, r6)
                r0.put(r4, r7)
                r0.put(r5, r8)
                r0.put(r3, r1)
                return r0
            L4c:
                java.lang.String r0 = "list"
                boolean r0 = r11.equals(r0)
                if (r0 == 0) goto L22
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                r8.add(r1)
                return r8
            L5d:
                boolean r0 = r11.equals(r4)
                if (r0 == 0) goto L22
                return r7
            L64:
                boolean r0 = r11.equals(r5)
                if (r0 != 0) goto L23
                goto L22
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1308110k93.getData(java.lang.String):java.lang.Object");
        }
    };
    public static final C1308090k91 LJI = new IDataStore() { // from class: X.0k91
        public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();

        @Override // com.bytedance.android.starship.IDataProvider, X.InterfaceC1307050k7L
        public final String getName() {
            return "TestDataStore";
        }

        @Override // com.bytedance.android.starship.IDataProvider, X.InterfaceC1307050k7L
        public final Object getData(String str) {
            return this.LIZ.get(str);
        }

        @Override // com.bytedance.android.starship.IDataStore
        public final boolean setData(String str, Object obj) {
            if (obj == null) {
                this.LIZ.remove(str);
                return true;
            }
            this.LIZ.put(str, obj);
            return true;
        }
    };
    public static final C01GW LJII = C452501pT.LIZIZ(new C1308070k8z());
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(49));

    public static void LIZ(long j, String str, String str2) throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jSONObject = new JSONObject();
            jSONObject.put("error_msg", "parse result error");
            jSONObject.put("result", (Object) null);
        }
        jSONObject.put("time_cost", j);
        jSONObject.put("strategy_name", str);
        AppLogNewUtils.onEventV3("starship_cpp_strategy_run", jSONObject);
    }
}
