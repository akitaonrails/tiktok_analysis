package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetTablets;

/* JADX INFO: renamed from: X.0mIc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390920mIc {
    public final TuxSheet LIZ;

    public C1390920mIc() {
        this(false, 0);
    }

    public /* synthetic */ C1390920mIc(int i) {
        this(false, 0);
    }

    public final void LIZ(float f) {
        this.LIZ.LLL = Float.valueOf(f);
    }

    public final void LIZJ(boolean z) {
        this.LIZ.LLLFF = Boolean.valueOf(z);
    }

    public final void LJ(Integer num) {
        int iIntValue;
        TuxSheet tuxSheet = this.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        tuxSheet.LLJJLIIIJLLLLLLLZ = iIntValue;
    }

    public final void LJFF(float f) {
        this.LIZ.LLJZ = Float.valueOf(f);
    }

    public final void LJI(int i) {
        this.LIZ.LLLII = Integer.valueOf(i);
    }

    public final void LJIIIIZZ(int i) {
        boolean z;
        TuxSheet tuxSheet = this.LIZ;
        tuxSheet.LLJJJIL = i;
        if (i != 3 && i != 4) {
            z = false;
        } else {
            z = true;
        }
        tuxSheet.LLILZ = z;
    }

    public C1390920mIc(boolean z, int i) {
        TuxSheet tuxSheet;
        if (z && i > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(650))) {
            tuxSheet = new TuxSheetTablets();
        } else {
            tuxSheet = new TuxSheet();
        }
        this.LIZ = tuxSheet;
    }

    public static void LJII(C1390920mIc c1390920mIc, boolean z) {
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJJJ = z;
        tuxSheet.LLJJJJJIL = null;
        tuxSheet.LLJJJJLIIL = null;
    }

    public final void LIZIZ(int i, int i2) {
        TuxSheet tuxSheet = this.LIZ;
        tuxSheet.LLJL = i;
        tuxSheet.LLJLIL = i2;
    }

    public final void LIZLLL(int i, boolean z) {
        this.LIZ.LLILZLL = Integer.valueOf(i);
        this.LIZ.LLIZ = z;
    }
}
