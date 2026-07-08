package com.bytedance.amg.minigameruntime.common.platform_misc;

import X.C1531600pxW;
import X.C21346018gE;
import X.C2220181Buy;
import X.C786410Ut5;
import X.InterfaceC1522160piI;
import android.content.Context;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModule;
import com.bytedance.vmsdk.jsbridge.utils.JavaOnlyMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableMapKeySetIterator;
import com.bytedance.vmsdk.jsbridge.utils.WritableMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes24.dex */
public final class JSBridgeCenterWrap extends JSModule {
    public final C1531600pxW ctx;

    @InterfaceC1522160piI
    public final String arrayBufferToBase64(byte[] bArr) {
        return byteArrayToBase64(bArr);
    }

    @InterfaceC1522160piI
    public final byte[] base64ToArrayBuffer(String str) {
        return base64ToByteArray(str);
    }

    @InterfaceC1522160piI
    public final byte[] base64ToByteArray(String str) {
        C1531600pxW c1531600pxW = this.ctx;
        if (c1531600pxW != null && c1531600pxW.LIZ != null && str != null) {
            if (str.length() == 0) {
                return new byte[0];
            }
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode != null) {
                return bArrDecode;
            }
        }
        return new byte[0];
    }

    @InterfaceC1522160piI
    public final String byteArrayToBase64(byte[] bArr) {
        String strEncodeToString;
        C1531600pxW c1531600pxW = this.ctx;
        if (c1531600pxW == null || c1531600pxW.LIZ == null || bArr == null || (strEncodeToString = Base64.encodeToString(bArr, 2)) == null) {
            return "";
        }
        return strEncodeToString;
    }

    @InterfaceC1522160piI
    public final String test(String str) {
        return "AMGMiniGameJSBridgeCenterWrap";
    }

    public JSBridgeCenterWrap(Context context, Object obj) {
        C1531600pxW c1531600pxW;
        super(context, obj);
        if (obj instanceof C1531600pxW) {
            c1531600pxW = (C1531600pxW) obj;
        } else {
            c1531600pxW = null;
        }
        this.ctx = c1531600pxW;
    }

    @InterfaceC1522160piI
    public final String invoke(String str, String str2, int i) {
        C21346018gE c21346018gE;
        String strLJLIIL;
        C1531600pxW c1531600pxW = this.ctx;
        if (c1531600pxW == null || (c21346018gE = c1531600pxW.LIZ) == null || (strLJLIIL = c21346018gE.LJLIIL(i, str, str2)) == null) {
            return "";
        }
        return strLJLIIL;
    }

    @InterfaceC1522160piI
    public final WritableMap invokeMix(String str, ReadableMap readableMap, int i) {
        C21346018gE c21346018gE;
        try {
            String string = readableMap.getString("__params__");
            if (string == null) {
                string = "";
            }
            ReadableMap map = readableMap.getMap("__buffers__");
            if (map == null) {
                map = new JavaOnlyMap();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = map.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                byte[] byteArray = map.getByteArray(strNextKey);
                if (strNextKey != null && byteArray != null) {
                    linkedHashMap.put(strNextKey, byteArray);
                }
            }
            C1531600pxW c1531600pxW = this.ctx;
            if (c1531600pxW != null && (c21346018gE = c1531600pxW.LIZ) != null) {
                return c21346018gE.LJLILLLLZI(i, str, string, linkedHashMap);
            }
            return new JavaOnlyMap();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            e.getMessage();
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.putString("__msg__", C786410Ut5.J3(C2220181Buy.LJFF.LIZ()));
            return javaOnlyMap;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    @X.InterfaceC1522160piI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] invokeSyncBuffer(java.lang.String r6, java.lang.String r7, int r8) {
        /*
            r5 = this;
            X.0pxW r0 = r5.ctx
            r4 = 0
            if (r0 == 0) goto L59
            X.18gE r3 = r0.LIZ
            if (r3 == 0) goto L59
            monitor-enter(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.LJII     // Catch: java.lang.Throwable -> L53
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L15
            byte[] r0 = new byte[r4]     // Catch: java.lang.Throwable -> L53
            goto L56
        L15:
            if (r7 == 0) goto L1e
            int r0 = r7.length()     // Catch: org.json.JSONException -> L29 java.lang.Throwable -> L53
            if (r0 == 0) goto L1e
            goto L20
        L1e:
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            if (r0 != 0) goto L31
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L29 java.lang.Throwable -> L53
            r2.<init>(r7)     // Catch: org.json.JSONException -> L29 java.lang.Throwable -> L53
            goto L32
        L29:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L53
            byte[] r0 = new byte[r4]     // Catch: java.lang.Throwable -> L53
            monitor-exit(r3)
            goto L57
        L31:
            r2 = 0
        L32:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, kotlin.jvm.functions.Function2<org.json.JSONObject, java.lang.Integer, byte[]>> r0 = r3.LIZJ     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r0.get(r6)     // Catch: java.lang.Throwable -> L53
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Throwable -> L53
            if (r1 != 0) goto L40
            byte[] r0 = new byte[r4]     // Catch: java.lang.Throwable -> L53
            monitor-exit(r3)
            goto L57
        L40:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r0 = r1.invoke(r2, r0)     // Catch: java.lang.Throwable -> L4b
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L4b
            goto L51
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L53
            byte[] r0 = new byte[r4]     // Catch: java.lang.Throwable -> L53
        L51:
            monitor-exit(r3)
            goto L57
        L53:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L56:
            monitor-exit(r3)
        L57:
            if (r0 != 0) goto L5b
        L59:
            byte[] r0 = new byte[r4]
        L5b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.amg.minigameruntime.common.platform_misc.JSBridgeCenterWrap.invokeSyncBuffer(java.lang.String, java.lang.String, int):byte[]");
    }

    @InterfaceC1522160piI
    public final void logMessage(int i, String str, String str2) {
        if (i == 0 || i != 1) {
        }
    }
}
