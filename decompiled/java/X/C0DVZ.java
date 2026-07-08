package X;

import android.widget.ImageView;

/* JADX INFO: renamed from: X.0DVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DVZ {
    public static final EnumC1338240kve LIZ(ImageView.ScaleType scaleType) {
        switch (C0DVY.LIZ[scaleType.ordinal()]) {
            case 1:
                return EnumC1338240kve.FIT_XY;
            case 2:
                return EnumC1338240kve.FIT_START;
            case 3:
                return EnumC1338240kve.FIT_CENTER;
            case 4:
                return EnumC1338240kve.FIT_END;
            case 5:
                return EnumC1338240kve.CENTER;
            case 6:
                return EnumC1338240kve.CENTER_CROP;
            case 7:
                return EnumC1338240kve.CENTER_INSIDE;
            default:
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unsupported scale type ");
                sbLIZ.append(scaleType);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
