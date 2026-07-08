package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qGX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543390qGX implements InterfaceC1543220qGG {
    public final String LIZ;
    public InterfaceC634840OvC LIZIZ;
    public final C1543510qGj LIZJ = new C1543510qGj(0);
    public final ConcurrentHashMap<EnumC1063300dmC, ConcurrentHashMap<String, InterfaceC1063710dmr>> LIZLLL = new ConcurrentHashMap<>();

    public C1543390qGX(String str) {
        this.LIZ = str;
    }

    public final InterfaceC1063710dmr LIZIZ(C1543190qGD c1543190qGD, String str) throws IllegalAccessException, InstantiationException {
        EnumC1063300dmC enumC1063300dmCLIZ = C1543040qFy.LIZ(c1543190qGD);
        Class<? extends InterfaceC1063710dmr> clsLIZ = this.LIZJ.LIZ(enumC1063300dmCLIZ, str);
        if (clsLIZ == null) {
            return null;
        }
        InterfaceC1063710dmr interfaceC1063710dmrNewInstance = clsLIZ.newInstance();
        ConcurrentHashMap<String, InterfaceC1063710dmr> concurrentHashMap = this.LIZLLL.get(enumC1063300dmCLIZ);
        if (concurrentHashMap == null) {
            this.LIZLLL.put(enumC1063300dmCLIZ, new ConcurrentHashMap<>());
            concurrentHashMap = this.LIZLLL.get(enumC1063300dmCLIZ);
        }
        concurrentHashMap.put(str, interfaceC1063710dmrNewInstance);
        return interfaceC1063710dmrNewInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[PHI: r0
      0x0044: PHI (r0v7 com.lynx.react.bridge.ReadableMap) = (r0v6 com.lynx.react.bridge.ReadableMap), (r0v8 com.lynx.react.bridge.ReadableMap) binds: [B:19:0x003b, B:21:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1543220qGG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1543190qGD r5, X.C1543910qHN r6, X.C1543250qGJ r7) throws java.lang.IllegalAccessException, org.json.JSONException, java.lang.InstantiationException {
        /*
            r4 = this;
            java.lang.String r0 = r6.LJFF
            X.0dmr r3 = r4.LIZIZ(r5, r0)
            if (r3 != 0) goto Lc
            X.C1543400qGY.LIZ(r7)
            return
        Lc:
            X.0OvC r0 = r4.LIZIZ
            if (r0 == 0) goto L13
            r3.setBridgeContext(r0)
        L13:
            java.lang.Object r2 = r6.LJIIIIZZ
            r0 = 1
            r6.LIZLLL = r0
            boolean r0 = r2 instanceof org.json.JSONObject
            if (r0 == 0) goto L2b
            X.0qIH r1 = new X.0qIH
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            X.0qH6 r0 = r6.LIZ()
            r1.<init>(r3, r2, r0)
        L27:
            r1.LIZJ(r7)
        L2a:
            return
        L2b:
            boolean r0 = r2 instanceof com.lynx.react.bridge.ReadableMap
            if (r0 == 0) goto L2a
            X.0qIK r1 = new X.0qIK
            com.lynx.react.bridge.ReadableMap r2 = (com.lynx.react.bridge.ReadableMap) r2
            if (r2 == 0) goto L40
            java.lang.String r0 = "data"
            com.lynx.react.bridge.ReadableMap r0 = r2.getMap(r0)
            if (r0 != 0) goto L44
            r0 = r2
            if (r2 != 0) goto L44
        L40:
            r1.<init>(r3, r2)
            goto L27
        L44:
            r2 = r0
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1543390qGX.LIZ(X.0qGD, X.0qHN, X.0qGJ):void");
    }
}
