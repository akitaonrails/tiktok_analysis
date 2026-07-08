package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Pa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2111608Pa {
    public static long LIZIZ(Intent intent, String str) {
        Bundle extras = null;
        try {
            extras = intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (extras == null) {
            return -1L;
        }
        try {
            Object obj = extras.get(str);
            if (obj != null) {
                if (obj instanceof String) {
                    try {
                        return CastLongProtector.parseLong((String) obj);
                    } catch (NumberFormatException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return -1L;
                    }
                }
                try {
                    return ((Long) obj).longValue();
                } catch (ClassCastException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return -1L;
                }
            }
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
        } catch (OutOfMemoryError e5) {
            TryCatchGuardChecker.doCheck(e5);
            return -1L;
        }
        return -1L;
    }

    public static int LIZ(int i, String str, Intent intent) {
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    Object obj = extras.get(str);
                    if (obj != null) {
                        if (obj instanceof String) {
                            try {
                                return CastIntegerProtector.parseInt((String) obj);
                            } catch (NumberFormatException e) {
                                TryCatchGuardChecker.doCheck(e);
                                return i;
                            }
                        }
                        try {
                            return ((Integer) obj).intValue();
                        } catch (ClassCastException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return i;
                        }
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                } catch (OutOfMemoryError e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return i;
                }
                return i;
            }
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        return i;
    }
}
