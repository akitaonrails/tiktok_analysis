package X;

import android.os.Build;

/* JADX INFO: renamed from: X.0VII, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VII {
    /* JADX WARN: Removed duplicated region for block: B:45:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0VIV LIZ(byte[] r7) throws java.lang.Throwable {
        /*
            X.0VIV r6 = new X.0VIV
            r6.<init>()
            if (r7 != 0) goto L8
            return r6
        L8:
            java.io.ByteArrayInputStream r5 = new java.io.ByteArrayInputStream
            r5.<init>(r7)
            r2 = 0
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L45
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L45
            int r3 = r4.readInt()     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L60
        L17:
            if (r3 <= 0) goto L34
            java.lang.String r0 = r4.readUTF()     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L60
            android.net.Uri r2 = android.net.Uri.parse(r0)     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L60
            boolean r0 = r4.readBoolean()     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L60
            X.0VIE r1 = new X.0VIE     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L60
            r1.<init>(r0, r2)     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L60
            java.util.Set<X.0VIE> r0 = r6.LIZ     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L60
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L60
            r0.add(r1)     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L60
            int r3 = r3 + (-1)
            goto L17
        L34:
            r4.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3c:
            r5.close()     // Catch: java.io.IOException -> L5a
            return r6
        L40:
            r0 = move-exception
            goto L47
        L42:
            r1 = move-exception
            r4 = r2
            goto L61
        L45:
            r0 = move-exception
            r4 = r2
        L47:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L54
            r4.close()     // Catch: java.io.IOException -> L50
            goto L54
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L54:
            r5.close()     // Catch: java.io.IOException -> L58
            goto L5f
        L58:
            r0 = move-exception
            goto L5b
        L5a:
            r0 = move-exception
        L5b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r6
        L5f:
            return r6
        L60:
            r1 = move-exception
        L61:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L60
            if (r4 == 0) goto L6e
            r4.close()     // Catch: java.io.IOException -> L6a
            goto L6e
        L6a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6e:
            r5.close()     // Catch: java.io.IOException -> L72
            throw r1
        L72:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VII.LIZ(byte[]):X.0VIV");
    }

    public static C0VIT LIZIZ(int i) {
        if (i != 0) {
            if (i == 1) {
                return C0VIT.LINEAR;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not convert ");
            sbLIZ.append(i);
            sbLIZ.append(" to BackoffPolicy");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return C0VIT.EXPONENTIAL;
    }

    public static EnumC794930VGh LIZJ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                                return EnumC794930VGh.TEMPORARILY_UNMETERED;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Could not convert ");
                            sbLIZ.append(i);
                            sbLIZ.append(" to NetworkType");
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        return EnumC794930VGh.METERED;
                    }
                    return EnumC794930VGh.NOT_ROAMING;
                }
                return EnumC794930VGh.UNMETERED;
            }
            return EnumC794930VGh.CONNECTED;
        }
        return EnumC794930VGh.NOT_REQUIRED;
    }

    public static C0VIU LIZLLL(int i) {
        if (i != 0) {
            if (i == 1) {
                return C0VIU.DROP_WORK_REQUEST;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Could not convert ");
            sbLIZ.append(i);
            sbLIZ.append(" to OutOfQuotaPolicy");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return C0VIU.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static C0VIP LJ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return C0VIP.CANCELLED;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Could not convert ");
                            sbLIZ.append(i);
                            sbLIZ.append(" to State");
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        return C0VIP.BLOCKED;
                    }
                    return C0VIP.FAILED;
                }
                return C0VIP.SUCCEEDED;
            }
            return C0VIP.RUNNING;
        }
        return C0VIP.ENQUEUED;
    }

    public static int LJFF(C0VIP c0vip) {
        switch (C0VIJ.LIZ[c0vip.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Could not convert ");
                sbLIZ.append(c0vip);
                sbLIZ.append(" to int");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
