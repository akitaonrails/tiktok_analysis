package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;

/* JADX INFO: renamed from: X.0WfT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828930WfT {
    public static C828930WfT LIZJ;
    public final Context LIZ;
    public volatile String LIZIZ;

    public C828930WfT(Context context) {
        this.LIZ = C786410Ut5.N3(context);
    }

    public static C828930WfT LIZ(Context context) {
        C0W3J.LJIIIIZZ(context);
        synchronized (C828930WfT.class) {
            try {
                if (LIZJ == null) {
                    C828920WfS.LIZ(context);
                    LIZJ = new C828930WfT(context);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return LIZJ;
    }

    public final boolean LIZIZ(int i) throws Throwable {
        C829020Wfc c829020WfcLIZ;
        int length;
        boolean zLIZJ;
        Signature[] signatureArr;
        ApplicationInfo applicationInfo;
        PackageManager.NameNotFoundException nameNotFoundException;
        String[] strArrLJJJJLL = C2204961BRm.LJJJJLL(this.LIZ.getPackageManager(), i, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz/cVtGgVoCFrAB3Iea7Cz8GqCuumNlRKZOs2bkpO0=", new String[]{"016a9"}));
        if (strArrLJJJJLL != null && (length = strArrLJJJJLL.length) != 0) {
            int i2 = 0;
            while (true) {
                String str = strArrLJJJJLL[i2];
                if (str == null) {
                    c829020WfcLIZ = C829020Wfc.LIZ();
                } else if (!str.equals(this.LIZIZ)) {
                    BinderC829000Wfa binderC829000Wfa = C828920WfS.LIZ;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        C828920WfS.LIZJ();
                        zLIZJ = C828920WfS.LIZJ.LIZJ();
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    } catch (C0WH8 e) {
                        e = e;
                        TryCatchGuardChecker.doCheck(e);
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        zLIZJ = false;
                    } catch (RemoteException e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        zLIZJ = false;
                    } catch (Throwable th) {
                        throw th;
                    }
                    if (zLIZJ) {
                        boolean zHonorsDebugCertificates = C829090Wfj.honorsDebugCertificates(this.LIZ);
                        threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            C0W3J.LJIIIIZZ(C828920WfS.LJ);
                            try {
                                C828920WfS.LIZJ();
                                try {
                                    zzq zzqVarLLZLL = C828920WfS.LIZJ.LLZLL(new zzo(str, zHonorsDebugCertificates, false, new C0WH6(C828920WfS.LJ), false));
                                    if (zzqVarLLZLL.zza) {
                                        zzqVarLLZLL.LJLZ();
                                        c829020WfcLIZ = new C829020Wfc(true, null);
                                    } else {
                                        if (zzqVarLLZLL.LLFFF() == 4) {
                                            nameNotFoundException = new PackageManager.NameNotFoundException();
                                        } else {
                                            nameNotFoundException = null;
                                        }
                                        zzqVarLLZLL.LJLZ();
                                        zzqVarLLZLL.LLFFF();
                                        c829020WfcLIZ = new C829020Wfc(false, nameNotFoundException);
                                    }
                                } catch (RemoteException e3) {
                                    e = e3;
                                    TryCatchGuardChecker.doCheck(e);
                                    c829020WfcLIZ = new C829020Wfc(false, e);
                                }
                            } catch (C0WH8 e4) {
                                e = e4;
                                TryCatchGuardChecker.doCheck(e);
                                "module init: ".concat(String.valueOf(e.getMessage()));
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } finally {
                        }
                    } else {
                        try {
                            PackageInfo packageInfoY3 = C786410Ut5.Y3(this.LIZ.getPackageManager(), str, 64);
                            boolean zHonorsDebugCertificates2 = C829090Wfj.honorsDebugCertificates(this.LIZ);
                            if (packageInfoY3 != null && (signatureArr = packageInfoY3.signatures) != null && signatureArr.length == 1) {
                                BinderC828820WfI binderC828820WfI = new BinderC828820WfI(packageInfoY3.signatures[0].toByteArray());
                                String str2 = packageInfoY3.packageName;
                                threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                try {
                                    c829020WfcLIZ = C828920WfS.LIZIZ(str2, binderC828820WfI, zHonorsDebugCertificates2, false);
                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                    if (c829020WfcLIZ.LIZ && (applicationInfo = packageInfoY3.applicationInfo) != null && (applicationInfo.flags & 2) != 0) {
                                        threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                        try {
                                            C829020Wfc c829020WfcLIZIZ = C828920WfS.LIZIZ(str2, binderC828820WfI, false, true);
                                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                            if (c829020WfcLIZIZ.LIZ) {
                                                c829020WfcLIZ = C829020Wfc.LIZ();
                                            }
                                        } finally {
                                        }
                                    }
                                } finally {
                                }
                            } else {
                                c829020WfcLIZ = C829020Wfc.LIZ();
                            }
                        } catch (PackageManager.NameNotFoundException e5) {
                            TryCatchGuardChecker.doCheck(e5);
                            "no pkg ".concat(str);
                            c829020WfcLIZ = new C829020Wfc(false, e5);
                        }
                    }
                    if (c829020WfcLIZ.LIZ) {
                        this.LIZIZ = str;
                    }
                } else {
                    c829020WfcLIZ = C829020Wfc.LIZIZ;
                }
                if (c829020WfcLIZ.LIZ) {
                    break;
                }
                i2++;
                if (i2 >= length) {
                    C0W3J.LJIIIIZZ(c829020WfcLIZ);
                    break;
                }
            }
        } else {
            c829020WfcLIZ = C829020Wfc.LIZ();
        }
        return c829020WfcLIZ.LIZ;
    }

    public static final AbstractBinderC828800WfG LIZJ(PackageInfo packageInfo, AbstractBinderC828800WfG... abstractBinderC828800WfGArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        BinderC828820WfI binderC828820WfI = new BinderC828820WfI(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < abstractBinderC828800WfGArr.length; i++) {
            if (abstractBinderC828800WfGArr[i].equals(binderC828820WfI)) {
                return abstractBinderC828800WfGArr[i];
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZLLL(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r2 = 1
            r3 = 0
            if (r5 == 0) goto L43
            if (r4 == 0) goto L46
            java.lang.String r1 = "com.android.vending"
            java.lang.String r0 = r4.packageName
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1a
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r0 = r4.packageName
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L25
        L1a:
            android.content.pm.ApplicationInfo r0 = r4.applicationInfo
            if (r0 == 0) goto L41
            int r0 = r0.flags
            r0 = r0 & 129(0x81, float:1.81E-43)
            if (r0 == 0) goto L41
            r5 = 1
        L25:
            android.content.pm.Signature[] r0 = r4.signatures
            if (r0 == 0) goto L46
            if (r5 == 0) goto L34
            X.0WfG[] r0 = X.C828970WfX.LIZ
            X.0WfG r0 = LIZJ(r4, r0)
        L31:
            if (r0 == 0) goto L46
            return r2
        L34:
            X.0WfG[] r1 = new X.AbstractBinderC828800WfG[r2]
            X.0WfG[] r0 = X.C828970WfX.LIZ
            r0 = r0[r3]
            r1[r3] = r0
            X.0WfG r0 = LIZJ(r4, r1)
            goto L31
        L41:
            r5 = 0
            goto L25
        L43:
            if (r4 == 0) goto L46
            goto L25
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C828930WfT.LIZLLL(android.content.pm.PackageInfo, boolean):boolean");
    }
}
