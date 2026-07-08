package X;

/* JADX INFO: renamed from: X.0gs5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182270gs5 extends AbstractC1182280gs6 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057 A[Catch: all -> 0x0081, TryCatch #1 {all -> 0x0081, blocks: (B:3:0x0004, B:9:0x001d, B:11:0x0023, B:12:0x0030, B:14:0x0036, B:16:0x0048, B:17:0x0051, B:20:0x005b, B:22:0x0061, B:23:0x0065, B:19:0x0057, B:7:0x0012, B:5:0x000a), top: B:31:0x0004, inners: #0 }] */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r9, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r10, X.EnumC1063300dmC r11) {
        /*
            r8 = this;
            X.0gs8 r9 = (X.InterfaceC1182300gs8) r9
            r4 = 0
            r3 = 0
            java.lang.String r5 = r9.getSessionID()     // Catch: java.lang.Throwable -> L81
            if (r5 == 0) goto L1c
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object>> r0 = X.C1180470gpB.LIZ     // Catch: java.lang.Throwable -> L11
            boolean r7 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> L11
            goto L1d
        L11:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L81
            X.0hTX r1 = X.C1205490hTX.LIZ     // Catch: java.lang.Throwable -> L81
            X.1EMR r0 = X.C1EMR.POI_SESSION_MANAGER_ERR     // Catch: java.lang.Throwable -> L81
            r1.LJ(r0, r2)     // Catch: java.lang.Throwable -> L81
        L1c:
            r7 = 0
        L1d:
            java.util.Map r0 = X.C1180470gpB.LIZ(r5)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L57
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L81
            r6.<init>()     // Catch: java.lang.Throwable -> L81
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L81
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L81
        L30:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L51
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L81
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L81
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L81
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L30
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> L81
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L81
            r6.add(r0)     // Catch: java.lang.Throwable -> L81
            goto L30
        L51:
            java.util.Map r5 = X.C2097608Jq.LJIILLIIL(r6)     // Catch: java.lang.Throwable -> L81
            if (r5 != 0) goto L5b
        L57:
            java.util.Map r5 = X.C2097608Jq.LJ()     // Catch: java.lang.Throwable -> L81
        L5b:
            java.lang.Class<X.0gs7> r1 = X.InterfaceC1182290gs7.class
            X.0OvC r0 = r8.IBridgeSdkContext     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L7e
            java.lang.String r0 = r0.getContainerID()     // Catch: java.lang.Throwable -> L81
        L65:
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r2 = X.C1909107dp.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L81
            r1 = r2
            X.0gs7 r1 = (X.InterfaceC1182290gs7) r1     // Catch: java.lang.Throwable -> L81
            r1.setInfo(r5)     // Catch: java.lang.Throwable -> L81
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L81
            r1.setIdExisted(r0)     // Catch: java.lang.Throwable -> L81
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel r2 = (com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel) r2     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = ""
            r10.onSuccess(r2, r0)     // Catch: java.lang.Throwable -> L81
            goto L80
        L7e:
            r0 = r4
            goto L65
        L80:
            return
        L81:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0hTX r1 = X.C1205490hTX.LIZ
            X.1EMR r0 = X.C1EMR.POI_SESSION_MANAGER_ERR
            r1.LJ(r0, r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "throwable: msg: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = " stack: "
            r1.append(r0)
            java.lang.String r0 = X.C13SZ.LIZIZ(r2)
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            r0 = 4
            X.C2382909Vj.LIZ(r10, r3, r1, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1182270gs5.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }
}
