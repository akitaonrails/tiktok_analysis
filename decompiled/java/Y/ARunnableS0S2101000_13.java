package Y;

import X.C0WSW;
import X.C0WSX;
import X.C13LP;
import X.C1C7U;
import X.C791040V1i;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.impl.TTFrontierConnection;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS0S2101000_13 implements Runnable {
    public final int $t;
    public int i3;
    public Object l2;
    public String s0;
    public String s1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d A[Catch: JSONException -> 0x011e, TryCatch #4 {JSONException -> 0x011e, blocks: (B:48:0x00e5, B:50:0x010d, B:51:0x0112, B:53:0x0118), top: B:76:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118 A[Catch: JSONException -> 0x011e, TRY_LEAVE, TryCatch #4 {JSONException -> 0x011e, blocks: (B:48:0x00e5, B:50:0x010d, B:51:0x0112, B:53:0x0118), top: B:76:0x00e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS0S2101000_13.LIZ$0():void");
    }

    public static final void run$0(ARunnableS0S2101000_13 aRunnableS0S2101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("TTFrontierConnection@4ff9.onConnectionStateChanged$1");
        try {
            try {
                TTFrontierConnection tTFrontierConnection = (TTFrontierConnection) aRunnableS0S2101000_13.l2;
                tTFrontierConnection.LJIILJJIL.onConnectionStateChanged(tTFrontierConnection, aRunnableS0S2101000_13.i3, aRunnableS0S2101000_13.s0, aRunnableS0S2101000_13.s1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTFrontierConnection@4ff9.onConnectionStateChanged$1");
    }

    public static final void run$1(ARunnableS0S2101000_13 aRunnableS0S2101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("TTFrontierConnection@4ff9.onConnectionError$1");
        try {
            try {
                TTFrontierConnection tTFrontierConnection = (TTFrontierConnection) aRunnableS0S2101000_13.l2;
                tTFrontierConnection.LJIILJJIL.onConnectionError(tTFrontierConnection, aRunnableS0S2101000_13.i3, aRunnableS0S2101000_13.s0, aRunnableS0S2101000_13.s1);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTFrontierConnection@4ff9.onConnectionError$1");
    }

    public static final void run$2(ARunnableS0S2101000_13 aRunnableS0S2101000_13) {
        String str = aRunnableS0S2101000_13.s0;
        int i = aRunnableS0S2101000_13.i3;
        String str2 = aRunnableS0S2101000_13.s1;
        Throwable th = (Throwable) aRunnableS0S2101000_13.l2;
        C1C7U.LIZ("LogUtil@2c24.logcat$1L");
        Iterator<C0WSX> it2 = C0WSW.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(i, str2, str, th);
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if (str != null && !a0.LJJJIL(str)) {
            int i3 = 0;
            while (i3 < str.length()) {
                int length = str.length();
                int i4 = i3 + 3500;
                if (length > i4) {
                    length = i4;
                }
                arrayList.add(str.substring(i3, length));
                i3 = i4;
            }
        }
        C13LP.LJJLIIIJL(arrayList);
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i == 6 && arrayList.size() > 1) {
                            while (i2 < arrayList.size() - 1) {
                                i2++;
                            }
                        }
                    } else if (arrayList.size() > 1) {
                        while (i2 < arrayList.size() - 1) {
                            i2++;
                        }
                    }
                } else if (arrayList.size() > 1) {
                    while (i2 < arrayList.size() - 1) {
                        i2++;
                    }
                }
            } else if (arrayList.size() > 1) {
                while (i2 < arrayList.size() - 1) {
                    i2++;
                }
            }
        } else if (arrayList.size() > 1) {
            while (i2 < arrayList.size() - 1) {
                i2++;
            }
        }
        C1C7U.LIZIZ("LogUtil@2c24.logcat$1L");
    }

    public static final void run$3(ARunnableS0S2101000_13 aRunnableS0S2101000_13) {
        boolean zLIZ;
        C1C7U.LIZ("TraceStats@aae3.endTrace$1");
        try {
            aRunnableS0S2101000_13.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TraceStats@aae3.endTrace$1");
    }

    public ARunnableS0S2101000_13(C791040V1i c791040V1i, int i, String str, int i2) {
        this.$t = i2;
        this.l2 = c791040V1i;
        this.i3 = i;
        this.s0 = "";
        this.s1 = str;
    }

    public ARunnableS0S2101000_13(int i, String str, String str2, Object obj, int i2) {
        this.$t = i2;
        this.s0 = str;
        this.i3 = i;
        this.s1 = str2;
        this.l2 = obj;
    }
}
