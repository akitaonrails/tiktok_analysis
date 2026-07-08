package X;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1DWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2257121DWc {
    public final C2257201DWk LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final Paint LIZLLL;
    public final Paint LJ;
    public C2257131DWd LJFF;
    public C2257131DWd LJI;

    public C2257121DWc() {
        Paint paint = new Paint();
        this.LIZLLL = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(Typeface.DEFAULT);
        Paint paint2 = new Paint();
        this.LJ = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(Typeface.DEFAULT);
        this.LIZ = C2257201DWk.LIZ();
    }

    public C2257121DWc(C2257121DWc c2257121DWc) {
        this.LIZIZ = c2257121DWc.LIZIZ;
        this.LIZJ = c2257121DWc.LIZJ;
        this.LIZLLL = new Paint(c2257121DWc.LIZLLL);
        this.LJ = new Paint(c2257121DWc.LJ);
        C2257131DWd c2257131DWd = c2257121DWc.LJFF;
        if (c2257131DWd != null) {
            this.LJFF = new C2257131DWd(c2257131DWd);
        }
        C2257131DWd c2257131DWd2 = c2257121DWc.LJI;
        if (c2257131DWd2 != null) {
            this.LJI = new C2257131DWd(c2257131DWd2);
        }
        try {
            this.LIZ = (C2257201DWk) c2257121DWc.LIZ.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ = C2257201DWk.LIZ();
        }
    }
}
