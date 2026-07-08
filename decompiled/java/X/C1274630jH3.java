package X;

import android.graphics.Point;

/* JADX INFO: renamed from: X.0jH3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274630jH3 {
    public static final void LIZ(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int iRint;
        boolean z2;
        if (i < i2) {
            i5 = i2;
        } else {
            i5 = i;
        }
        if (i5 != i4) {
            int iFloor = (int) Math.floor((((double) i5) * ((double) i3)) / ((double) i4));
            if (z) {
                i6 = 8;
            } else {
                i6 = 16;
            }
            int i7 = iFloor % i6;
            if (i7 == 0) {
                iRint = iFloor;
            } else {
                iRint = ((int) Math.rint(((double) iFloor) / ((double) i6))) * i6;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getGameAdaptiveStreamSize(). targetWidth=");
            sbLIZ.append(i);
            sbLIZ.append(" ,targetHeight=");
            sbLIZ.append(i2);
            sbLIZ.append(" ,initShortLength=");
            sbLIZ.append(i3);
            sbLIZ.append(" ,initLongLength=");
            sbLIZ.append(i4);
            sbLIZ.append(" ,standardLongLength=");
            sbLIZ.append(i5);
            sbLIZ.append(" ,adaptedShortLength=");
            sbLIZ.append(iFloor);
            sbLIZ.append(" ,alignment=");
            sbLIZ.append(i6);
            sbLIZ.append(" ,alignedShortLength=");
            sbLIZ.append(iRint);
            sbLIZ.append(" ,alignedShortIsAlignment=");
            if (i7 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            sbLIZ.append(z2);
            sbLIZ.append(" ,shortLengthAlign=");
            double d = ((double) iFloor) / ((double) i6);
            sbLIZ.append(d);
            sbLIZ.append("shortLengthAlignRound=");
            sbLIZ.append(Math.rint(d));
            C2188811AlT.LIZIZ(sbLIZ);
            if (z) {
                new Point(i5, iRint);
                return;
            } else {
                new Point(iRint, i5);
                return;
            }
        }
        if (z) {
            new Point(i4, i3);
        } else {
            new Point(i3, i4);
        }
    }
}
