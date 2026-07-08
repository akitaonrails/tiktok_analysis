package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VESize;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0tNw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663300tNw {
    public static final String LIZIZ(Number number) {
        C19348710mr c19348710mr;
        String string;
        if (number.longValue() < LSPassThroughRecordSizeConfig.DEFAULT) {
            c19348710mr = new C19348710mr(null, null, null, 15);
        } else {
            c19348710mr = new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13);
        }
        CharSequence charSequenceLIZ = C19374310qz.LIZ(number, c19348710mr, null, 1, 20);
        if (charSequenceLIZ == null || (string = charSequenceLIZ.toString()) == null) {
            return "";
        }
        return string;
    }

    public static final boolean LIZ(int i, int i2, int i3) {
        if (((Number) C298570Bn5.LIZ.getValue()).intValue() != 1 || i == 0 || i2 == -1 || i2 < i3 * 2 || i < i3) {
            return false;
        }
        return true;
    }

    public static final Pair<Float, Float> LIZJ(boolean z, float f, float f2, float f3, float f4, VESize vESize, boolean z2) {
        float fLIZIZ;
        float f5;
        float f6;
        float f7 = f / 694.0f;
        float f8 = f2 / 390.0f;
        if (z2) {
            fLIZIZ = ((C418440Gaw.LIZIZ(Float.valueOf(f4)) / 2.0f) + (f7 * vESize.height)) - C418440Gaw.LIZIZ(47);
            f5 = vESize.height;
        } else {
            float fLIZIZ2 = C418440Gaw.LIZIZ(Float.valueOf(f4)) / 2.0f;
            int i = vESize.height;
            fLIZIZ = fLIZIZ2 + (f7 * i);
            f5 = i;
        }
        float f9 = fLIZIZ / f5;
        if (z) {
            f6 = 0.5f;
        } else {
            float fLIZIZ3 = C418440Gaw.LIZIZ(Float.valueOf(f3)) / 2.0f;
            int i2 = vESize.width;
            f6 = (fLIZIZ3 + (f8 * i2)) / i2;
        }
        return new Pair<>(Float.valueOf(f6), Float.valueOf(f9));
    }
}
