package X;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521230KcL {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r6.equals("huawei") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if (r6.equals("honor") == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c6, code lost:
    
        r7.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil").getMethod("hasNotchInScreen", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d7, code lost:
    
        r1 = X.C786410Ut5.V3(r7.getPackageManager(), r7.getPackageName(), 128).metaData;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e5, code lost:
    
        if (r1 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ed, code lost:
    
        if (r1.get("android.notch_support") == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ef, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f1, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f6, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00fb, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C1AF0.LJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010c, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
        X.C1AF0.LJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0116, code lost:
    
        return LIZIZ(r7);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(android.app.Activity r7) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C521230KcL.LIZ(android.app.Activity):boolean");
    }

    public static boolean LIZIZ(Activity activity) {
        int i;
        if (Build.VERSION.SDK_INT < 28 || (i = activity.getWindow().getAttributes().layoutInDisplayCutoutMode) == 1) {
            return true;
        }
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            TypedArray typedArrayObtainStyledAttributes = activity.obtainStyledAttributes(R.style.ud, new int[]{android.R.attr.windowFullscreen});
            typedArrayObtainStyledAttributes.getValue(0, typedValue);
            typedArrayObtainStyledAttributes.recycle();
            if (typedValue.type != 18 || typedValue.data == 0) {
                return true;
            }
        }
        return false;
    }
}
