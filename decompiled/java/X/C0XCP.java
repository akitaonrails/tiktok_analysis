package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XCP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XCP {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final Context LJFF;
    public final C0XCQ LJI = new AbstractC824140WUq<PackageInfo>() { // from class: X.0XCQ
        @Override // X.AbstractC824140WUq
        public final PackageInfo LIZ(Object[] objArr) {
            try {
                return C786410Ut5.Y3(this.LIZJ.LJFF.getPackageManager(), this.LIZJ.LJFF.getPackageName(), 0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C844830XCf.LIZJ("AppVersionCompat#getPackageInfo error", th);
                return null;
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0XCQ] */
    public C0XCP(C0XC1 c0xc1) {
        String str;
        this.LJFF = c0xc1.LJIIIIZZ;
        this.LIZ = c0xc1.LJIIJJI;
        if (TextUtils.isEmpty(c0xc1.LJIIL)) {
            str = "";
        } else {
            str = c0xc1.LJIIL;
        }
        this.LIZIZ = str;
        this.LIZJ = c0xc1.LJIILIIL;
        this.LIZLLL = c0xc1.LJIILJJIL;
        this.LJ = c0xc1.LJIILL;
    }
}
