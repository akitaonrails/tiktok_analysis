package X;

import com.bytedance.android.live_settings.LiveSettingModel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.1Bde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209441Bde {
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>(512);
    public volatile Map<String, ? extends Object> LIZIZ;
    public volatile Map<String, LiveSettingModel> LIZJ;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r4.equals("java.lang.String[]") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r4.equals("java.lang.String") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r4.equals("float") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        if (r4.equals("boolean") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r4.equals("int") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r4.equals("double") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
    
        if (r4.equals("long") != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        r1 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
    
        if (r1 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007f, code lost:
    
        r5.LIZ.put(r7, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009e, code lost:
    
        LIZIZ(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a1, code lost:
    
        return r6;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Object r6, java.lang.String r7) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r5.LIZ
            java.lang.Object r1 = r0.get(r7)
            if (r1 == 0) goto L9
            return r1
        L9:
            java.util.Map<java.lang.String, ? extends java.lang.Object> r3 = r5.LIZIZ
            java.util.Map<java.lang.String, com.bytedance.android.live_settings.LiveSettingModel> r0 = r5.LIZJ
            r2 = 0
            if (r3 == 0) goto La2
            if (r0 == 0) goto La2
            java.lang.Object r0 = r0.get(r7)
            com.bytedance.android.live_settings.LiveSettingModel r0 = (com.bytedance.android.live_settings.LiveSettingModel) r0
            if (r0 == 0) goto La2
            java.lang.String r4 = r0.getFieldTypeName()
            if (r4 == 0) goto La2
            int r0 = r4.hashCode()
            switch(r0) {
                case -1325958191: goto L68;
                case 104431: goto L5f;
                case 3327612: goto L71;
                case 64711720: goto L56;
                case 97526364: goto L4d;
                case 1195259493: goto L44;
                case 1888107655: goto L3b;
                default: goto L27;
            }
        L27:
            java.lang.Object r3 = r3.get(r7)
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L32
            r2 = r3
            java.lang.String r2 = (java.lang.String) r2
        L32:
            if (r2 == 0) goto L9a
            com.bytedance.android.live_settings.SettingsManager r0 = com.bytedance.android.live_settings.SettingsManager.INSTANCE
            java.lang.reflect.Type r3 = r0.getDefaultValueCustomTypeV2(r6)
            goto L85
        L3b:
            java.lang.String r0 = "java.lang.String[]"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L79
            goto L27
        L44:
            java.lang.String r0 = "java.lang.String"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L79
            goto L27
        L4d:
            java.lang.String r0 = "float"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L79
            goto L27
        L56:
            java.lang.String r0 = "boolean"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L79
            goto L27
        L5f:
            java.lang.String r0 = "int"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L79
            goto L27
        L68:
            java.lang.String r0 = "double"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L79
            goto L27
        L71:
            java.lang.String r0 = "long"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L27
        L79:
            java.lang.Object r1 = r3.get(r7)
            if (r1 == 0) goto L9e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r5.LIZ
            r0.put(r7, r1)
            return r1
        L85:
            com.google.gson.Gson r0 = com.bytedance.android.live_settings.NormalGson.singleton()     // Catch: java.lang.Exception -> L8e
            java.lang.Object r1 = r0.LJIIIIZZ(r2, r3)     // Catch: java.lang.Exception -> L8e
            goto L92
        L8e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L92:
            if (r1 == 0) goto L9a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = r5.LIZ
            r0.put(r7, r1)
            return r1
        L9a:
            r5.LIZIZ(r6, r7)
            return r6
        L9e:
            r5.LIZIZ(r6, r7)
            return r6
        La2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209441Bde.LIZ(java.lang.Object, java.lang.String):java.lang.Object");
    }

    public final void LIZIZ(Object obj, String str) {
        if (obj != null) {
            this.LIZ.put(str, obj);
        }
    }
}
