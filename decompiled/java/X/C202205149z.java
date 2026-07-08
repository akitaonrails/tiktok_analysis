package X;

/* JADX INFO: renamed from: X.149z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202205149z {
    public static final C202188149i LIZ = new C14A3() { // from class: X.149i
        @Override // X.C14A3
        public final void LIZ(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4) {
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005f  */
        @Override // X.C14A3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(java.lang.String r6, int r7, long r8, java.lang.String r10, java.lang.String r11, int r12, java.lang.String r13) {
            /*
                r5 = this;
                r4 = 1
                r2 = 0
                r0 = 200(0xc8, float:2.8E-43)
                if (r7 != r0) goto L2a
                com.tts.oecverify.BdTuring r0 = com.tts.oecverify.BdTuring.getInstance()     // Catch: java.lang.Exception -> L25
                com.tts.oecverify.BdTuringConfig r0 = r0.getConfig()     // Catch: java.lang.Exception -> L25
                android.content.Context r1 = r0.getApplicationContext()     // Catch: java.lang.Exception -> L25
                java.lang.String r0 = "bd_turning_settings_init"
                android.content.SharedPreferences r0 = X.C810670Vr7.LIZJ(r1, r2, r0)     // Catch: java.lang.Exception -> L25
                android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch: java.lang.Exception -> L25
                java.lang.String r0 = "inited"
                r1.putBoolean(r0, r4)     // Catch: java.lang.Exception -> L25
                r1.commit()     // Catch: java.lang.Exception -> L25
                goto L2c
            L25:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                goto L2c
            L2a:
                if (r7 != r0) goto L2d
            L2c:
                r4 = 0
            L2d:
                java.lang.String r3 = java.lang.String.valueOf(r7)
                org.json.JSONObject r2 = new org.json.JSONObject
                r2.<init>()
                java.lang.String r0 = "shark_log_id"
                r2.put(r0, r11)     // Catch: org.json.JSONException -> L6e
                java.lang.String r0 = "req_path"
                r2.put(r0, r13)     // Catch: org.json.JSONException -> L6e
                java.lang.String r0 = "duration"
                r2.put(r0, r8)     // Catch: org.json.JSONException -> L6e
                java.lang.String r0 = "result"
                r2.put(r0, r4)     // Catch: org.json.JSONException -> L6e
                java.lang.String r1 = "key"
                java.lang.String r0 = "setting"
                r2.put(r1, r0)     // Catch: org.json.JSONException -> L6e
                java.lang.String r0 = "custom"
                java.lang.String r1 = ""
                if (r3 != 0) goto L58
                r3 = r1
            L58:
                r2.put(r0, r3)     // Catch: org.json.JSONException -> L6e
                java.lang.String r0 = "source_from"
                if (r10 != 0) goto L60
                r10 = r1
            L60:
                r2.put(r0, r10)     // Catch: org.json.JSONException -> L6e
                java.lang.String r0 = "retry_count"
                r2.put(r0, r12)     // Catch: org.json.JSONException -> L6e
                java.lang.String r0 = "oec_verify_sdk"
                X.C202191149l.LIZJ(r0, r2)
                return
            L6e:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                X.C14A6.LIZIZ()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C202188149i.LIZIZ(java.lang.String, int, long, java.lang.String, java.lang.String, int, java.lang.String):void");
        }
    };

    public static long LIZ() {
        C202185149f c202185149f = C202185149f.LIZ;
        return C202185149f.LJII("common").optLong("collection_duration", 150L);
    }
}
