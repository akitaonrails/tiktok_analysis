package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2133108Xh {
    public final C08PR LIZ;
    public final Context LIZIZ;
    public final C2133308Xj LIZJ;
    public PackageInfo LIZLLL;

    public final PackageInfo LJ() {
        if (this.LIZLLL == null) {
            try {
                this.LIZLLL = C786410Ut5.Y3(this.LIZIZ.getPackageManager(), this.LIZIZ.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return this.LIZLLL;
    }

    public static void LIZ(String str) {
        C1AF0.LIZLLL("SplitCompat : " + str, C1BL9.LIZ());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r8.LIZ.getName().equals("manifest") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        r2 = r8.LIZ.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r0 = r8.LIZ.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
    
        if (r2 == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        r1 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        r0 = (((long) r1) & 4294967295L) | (((long) com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)) << 32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c7, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(X.C786410Ut5.j4("Couldn't parse versionCodeMajor to int: %s", new java.lang.Object[]{r0.getMessage()}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c9, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00df, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(X.C786410Ut5.j4("Couldn't parse versionCode to int: %s", new java.lang.Object[]{r0.getMessage()}));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(java.io.File[] r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2133108Xh.LIZJ(java.io.File[]):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        LIZ("Downloaded split " + r2 + " is not signed.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(java.io.File[] r12) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2133108Xh.LIZLLL(java.io.File[]):boolean");
    }

    public C2133108Xh(Context context, C08PR c08pr) {
        C2133308Xj c2133308Xj = new C2133308Xj();
        this.LIZ = c08pr;
        this.LIZIZ = context;
        this.LIZJ = c2133308Xj;
    }

    public static void LIZIZ(String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SplitCompat");
        sbLIZ.append(" : ");
        sbLIZ.append(str);
        C1AF0.LJI(th, C2188811AlT.LIZIZ(sbLIZ), C1BL9.LIZ());
    }
}
