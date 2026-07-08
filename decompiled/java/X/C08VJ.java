package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08VJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08VJ {
    public final SharedPreferences LIZ;
    public C08VK LIZIZ;

    public final void LIZIZ() {
        SharedPreferences.Editor editorPutLong = this.LIZ.edit().putBoolean("is_verified", this.LIZIZ.LJ).putLong("timestamp", this.LIZIZ.LJFF);
        String str = this.LIZIZ.LIZ;
        if (TextUtils.isEmpty(str)) {
            editorPutLong.remove("e_app_key");
        } else {
            editorPutLong.putString("e_app_key", str);
        }
        String str2 = this.LIZIZ.LIZJ;
        if (TextUtils.isEmpty(str2)) {
            editorPutLong.remove("last_e_app_key");
        } else {
            editorPutLong.putString("last_e_app_key", str2);
        }
        String str3 = this.LIZIZ.LIZIZ;
        if (TextUtils.isEmpty(str3)) {
            editorPutLong.remove("app_key");
        } else {
            String strLIZJ = ((C14BQ) C08VL.LIZ()).LIZJ(str3);
            if (TextUtils.isEmpty(strLIZJ)) {
                editorPutLong.remove("app_key");
            } else {
                editorPutLong.putString("app_key", strLIZJ);
            }
        }
        String str4 = this.LIZIZ.LIZLLL;
        if (TextUtils.isEmpty(str4)) {
            editorPutLong.remove("last_app_key");
        } else {
            String strLIZJ2 = ((C14BQ) C08VL.LIZ()).LIZJ(str4);
            if (TextUtils.isEmpty(strLIZJ2)) {
                editorPutLong.remove("last_app_key");
            } else {
                editorPutLong.putString("last_app_key", strLIZJ2);
            }
        }
        editorPutLong.apply();
    }

    public final String LIZ(String str) {
        String str2;
        synchronized (this) {
            try {
                C08VK c08vk = this.LIZIZ;
                if (C08VK.LIZIZ(str) && str.equals(c08vk.LIZ) && C08VK.LIZIZ(c08vk.LIZIZ)) {
                    str2 = c08vk.LIZIZ;
                } else {
                    if (C08VK.LIZIZ(str)) {
                        if (str.equals(c08vk.LIZJ) && C08VK.LIZIZ(c08vk.LIZLLL)) {
                            str2 = c08vk.LIZLLL;
                        }
                    } else {
                        c08vk.getClass();
                    }
                    str2 = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C08VJ(android.content.Context r12, java.lang.String r13) {
        /*
            r11 = this;
            r11.<init>()
            android.content.Context r3 = X.C786410Ut5.N3(r12)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "de_sdk_"
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2 = 0
            android.content.SharedPreferences r3 = X.C810670Vr7.LIZJ(r3, r2, r0)
            r11.LIZ = r3
            java.lang.String r0 = "e_app_key"
            r9 = 0
            java.lang.String r4 = r3.getString(r0, r9)
            java.lang.String r0 = "app_key"
            java.lang.String r1 = r3.getString(r0, r9)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L46
            r5 = r9
        L32:
            java.lang.String r0 = "last_e_app_key"
            java.lang.String r6 = r3.getString(r0, r9)
            java.lang.String r0 = "last_app_key"
            java.lang.String r3 = r3.getString(r0, r9)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L5f
            r0 = 2
            goto L51
        L46:
            X.08VO r0 = X.C08VL.LIZ()
            X.14BQ r0 = (X.C14BQ) r0
            java.lang.String r5 = r0.LIZ(r1)
            goto L32
        L51:
            byte[] r0 = android.util.Base64.decode(r3, r0)     // Catch: java.lang.IllegalArgumentException -> L5b
            int r1 = r0.length     // Catch: java.lang.IllegalArgumentException -> L5b
            r0 = 32
            if (r1 != r0) goto L5f
            goto L6c
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5f:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L87
            r3 = r9
        L66:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L6d
        L6c:
            r9 = r3
        L6d:
            android.content.SharedPreferences r1 = r11.LIZ
            java.lang.String r0 = "is_verified"
            boolean r10 = r1.getBoolean(r0, r2)
            android.content.SharedPreferences r3 = r11.LIZ
            java.lang.String r2 = "timestamp"
            r0 = 0
            long r7 = r3.getLong(r2, r0)
            X.08VK r3 = new X.08VK
            r3.<init>(r4, r5, r6, r7, r9, r10)
            r11.LIZIZ = r3
            return
        L87:
            X.08VO r0 = X.C08VL.LIZ()
            X.14BQ r0 = (X.C14BQ) r0
            java.lang.String r3 = r0.LIZ(r3)
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08VJ.<init>(android.content.Context, java.lang.String):void");
    }
}
