package X;

import android.app.Activity;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1059420dfw extends AbstractC1063600dmg {
    public static Class<?> LLILLL;
    public static Method LLILZ;
    public static final ConcurrentHashMap<String, InterfaceC801410VcB> LLILZIL = new ConcurrentHashMap<>();
    public static final Set<IESJsBridge> LLILZLL = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public volatile InterfaceC1051760dTa LLILLJJLI;

    public abstract InterfaceC1051760dTa LIZ(C1059490dg3 c1059490dg3);

    public C1059440dfy LIZIZ() {
        return null;
    }

    public final void LIZJ(Map<String, ? extends Object> map, InterfaceC801410VcB interfaceC801410VcB) throws Throwable {
        Activity activityLIZLLL;
        Method method;
        Method[] methods;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject((String) map.get("real_raw_req"));
        C1058910df7 c1058910df7 = new C1058910df7();
        c1058910df7.LIZJ = jSONObject2.optString("func");
        c1058910df7.LIZ = JSONObjectProtectorUtils.getString(jSONObject2, "__msg_type");
        c1058910df7.LIZLLL = jSONObject2.optJSONObject("params");
        c1058910df7.LIZIZ = jSONObject2.optString("__callback_id");
        c1058910df7.LJ = jSONObject2.optInt("JSSDK");
        c1058910df7.LJFF = jSONObject2.optString("namespace");
        c1058910df7.LJI = jSONObject2.optString("__iframe_url");
        c1058910df7.LJIIJ = jSONObject2.optString("permissionGroup", "private");
        c1058910df7.LJIIJJI = true;
        c1058910df7.LJII = Boolean.TRUE;
        LLILZIL.put(c1058910df7.LIZIZ, interfaceC801410VcB);
        try {
            C1544610qIV c1544610qIV = this.LL;
            if (c1544610qIV != null && (activityLIZLLL = c1544610qIV.LIZLLL()) != null) {
                if (LLILLL == null) {
                    LLILLL = Class.forName("com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod");
                }
                Class<?> cls = LLILLL;
                if (cls != null && cls.isInstance(this.LLILLJJLI)) {
                    if (LLILZ == null) {
                        Class<?> cls2 = LLILLL;
                        if (cls2 != null && (methods = cls2.getMethods()) != null) {
                            int length = methods.length;
                            for (int i = 0; i < length; i++) {
                                method = methods[i];
                                if (Intrinsics.LJFF(method.getName(), "attach") && method.getParameterTypes().length == 1 && Intrinsics.LJFF(method.getParameterTypes()[0], WeakReference.class)) {
                                    break;
                                }
                            }
                            method = null;
                            LLILZ = method;
                        } else {
                            method = null;
                            LLILZ = method;
                        }
                    }
                    Method method2 = LLILZ;
                    if (method2 != null) {
                        C2204961BRm.a0(method2, this.LLILLJJLI, new Object[]{new WeakReference(activityLIZLLL)}, new C0WZX("dzBzEhEpEcvSUUUuTBbKdVxsexEyAJRVwRJCdRVVzmawt7/p5EIKFrQsGvQ1eWCOwHNziipWKTj3qtg55ZkxrCnXb0vzpYF8", null));
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        InterfaceC1051760dTa interfaceC1051760dTa = this.LLILLJJLI;
        if (interfaceC1051760dTa != null) {
            interfaceC1051760dTa.call(c1058910df7, jSONObject);
        }
        if (c1058910df7.LJIIJJI) {
            interfaceC801410VcB.LIZ(C2348609Ie.LIZIZ(jSONObject));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040 A[Catch: all -> 0x011a, TryCatch #1 {all -> 0x011a, blocks: (B:5:0x0018, B:7:0x001c, B:9:0x0020, B:11:0x0024, B:13:0x002f, B:23:0x0052, B:25:0x005c, B:30:0x0072, B:33:0x007e, B:35:0x0086, B:36:0x008d, B:38:0x009b, B:39:0x009f, B:42:0x00a7, B:45:0x00c6, B:27:0x0060, B:29:0x006a, B:46:0x00d8, B:50:0x00f3, B:53:0x00fe, B:15:0x0035, B:17:0x0040, B:19:0x0044), top: B:75:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050 A[PHI: r9 r10 r11
      0x0050: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v2 java.lang.String), (r9v7 java.lang.String) binds: [B:16:0x003e, B:19:0x0044, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0050: PHI (r10v3 X.0q70) = (r10v0 X.0q70), (r10v2 X.0q70), (r10v4 X.0q70) binds: [B:16:0x003e, B:19:0x0044, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x0050: PHI (r11v3 X.0qEH) = (r11v1 X.0qEH), (r11v1 X.0qEH), (r11v4 X.0qEH) binds: [B:16:0x003e, B:19:0x0044, B:14:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[Catch: all -> 0x011a, TryCatch #1 {all -> 0x011a, blocks: (B:5:0x0018, B:7:0x001c, B:9:0x0020, B:11:0x0024, B:13:0x002f, B:23:0x0052, B:25:0x005c, B:30:0x0072, B:33:0x007e, B:35:0x0086, B:36:0x008d, B:38:0x009b, B:39:0x009f, B:42:0x00a7, B:45:0x00c6, B:27:0x0060, B:29:0x006a, B:46:0x00d8, B:50:0x00f3, B:53:0x00fe, B:15:0x0035, B:17:0x0040, B:19:0x0044), top: B:75:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
    @Override // X.InterfaceC1063710dmr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void realHandle(java.util.Map<java.lang.String, ? extends java.lang.Object> r20, X.InterfaceC801410VcB r21, X.EnumC1063300dmC r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1059420dfw.realHandle(java.util.Map, X.0VcB, X.0dmC):void");
    }
}
