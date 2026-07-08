package X;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.0kOW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1317700kOW {
    public Rect LIZIZ;
    public Rect LIZJ;
    public Bitmap LIZLLL;
    public final C1317710kOX LJFF;
    public C1323050kX9<AbstractC1327750kej> LJI;
    public int LIZ = 1;
    public boolean LJ = true;

    public final void LIZ() {
        Bitmap bitmap = this.LIZLLL;
        if (bitmap != null && !bitmap.isRecycled() && !this.LJ) {
            C786410Ut5.LJJJJ(this.LIZLLL);
            this.LIZLLL = null;
        }
        C1323050kX9<AbstractC1327750kej> c1323050kX9 = this.LJI;
        if (c1323050kX9 != null) {
            c1323050kX9.close();
        }
    }

    public C1317700kOW(C1317710kOX c1317710kOX) {
        this.LJFF = c1317710kOX;
    }
}
