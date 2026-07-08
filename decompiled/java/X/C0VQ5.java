package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VQ5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VQ5 {
    public static final C0VQ5 LIZ = new C0VQ5();

    public static void LIZJ(JSONObject jSONObject) {
        C20684815ws.LJIJ("request_local_notifications", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r6, long r7, java.lang.String r9, boolean r10) {
        /*
            r2 = 3
            kotlin.Pair[] r5 = new kotlin.Pair[r2]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "task_id"
            r1.<init>(r0, r9)
            r0 = 0
            r5[r0] = r1
            r4 = 2
            r3 = 1
            if (r6 == 0) goto L43
            if (r6 == r3) goto L40
            if (r6 == r4) goto L3d
            if (r6 != r2) goto L43
            java.lang.String r2 = "non_login"
        L1a:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "task_type"
            r1.<init>(r0, r2)
            r5[r3] = r1
            java.lang.String r2 = java.lang.String.valueOf(r7)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "setting_timestamp"
            r1.<init>(r0, r2)
            r5[r4] = r1
            java.util.Map r1 = X.C2097608Jq.LJIIIIZZ(r5)
            java.lang.String r0 = "work_manager_setting"
            X.C20684815ws.LJIIZILJ(r0, r1, r10)
            return
        L3d:
            java.lang.String r2 = "do_notify"
            goto L1a
        L40:
            java.lang.String r2 = "pre_wake"
            goto L1a
        L43:
            java.lang.String r2 = "silent"
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VQ5.LIZIZ(int, long, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C0VQ5 r6, java.lang.String r7, int r8, long r9, long r11) {
        /*
            r6.getClass()
            r0 = 5
            kotlin.Pair[] r4 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "task_id"
            r1.<init>(r0, r7)
            r3 = 0
            r4[r3] = r1
            r7 = 3
            r6 = 2
            r5 = 1
            if (r8 == 0) goto L61
            if (r8 == r5) goto L5e
            if (r8 == r6) goto L5b
            if (r8 != r7) goto L61
            java.lang.String r2 = "non_login"
        L1e:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "task_type"
            r1.<init>(r0, r2)
            r4[r5] = r1
            java.lang.String r2 = java.lang.String.valueOf(r11)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "wakeup_delay_in_ms"
            r1.<init>(r0, r2)
            r4[r6] = r1
            java.lang.String r2 = java.lang.String.valueOf(r9)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "actual_timestamp"
            r1.<init>(r0, r2)
            r4[r7] = r1
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "launch_status"
            java.lang.String r0 = "succeed"
            r2.<init>(r1, r0)
            r0 = 4
            r4[r0] = r2
            java.util.Map r1 = X.C2097608Jq.LJIIIIZZ(r4)
            java.lang.String r0 = "work_manager_launch"
            X.C20684815ws.LJIIZILJ(r0, r1, r3)
            return
        L5b:
            java.lang.String r2 = "do_notify"
            goto L1e
        L5e:
            java.lang.String r2 = "pre_wake"
            goto L1e
        L61:
            java.lang.String r2 = "silent"
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VQ5.LIZ(X.0VQ5, java.lang.String, int, long, long):void");
    }
}
