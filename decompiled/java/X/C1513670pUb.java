package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0pUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513670pUb {
    public static final /* synthetic */ int LIZ = 0;

    public C1513670pUb() {
        throw new AssertionError("oops! the utility class is about to be instantiated...");
    }

    public static float LIZ(long j) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.US);
        decimalFormat.applyPattern("0.0");
        return CastFloatProtector.valueOf(decimalFormat.format((j / 1024.0f) / 1024.0f).replaceAll(",", e3.d)).floatValue();
    }
}
