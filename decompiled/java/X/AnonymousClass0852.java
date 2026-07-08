package X;

import com.tiktok.ttm.TTMParamData;

/* JADX INFO: renamed from: X.0852, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0852 {
    public static final /* synthetic */ int LIZ = 0;

    public static double LIZ(TTMParamData tTMParamData, String str) {
        Double dLJII;
        double doubleValue = tTMParamData.getDoubleValue(str);
        if (doubleValue == Double.MAX_VALUE) {
            String stringValue = tTMParamData.getStringValue(str);
            if (stringValue != null && (dLJII = C2327809Ae.LJII(stringValue)) != null) {
                return dLJII.doubleValue();
            }
            return Double.MAX_VALUE;
        }
        return doubleValue;
    }

    public static int LIZIZ(TTMParamData tTMParamData, String str) {
        Integer numLJIIJJI;
        long intValue = tTMParamData.getIntValue(str);
        if (intValue == Long.MAX_VALUE) {
            String stringValue = tTMParamData.getStringValue(str);
            if (stringValue != null && (numLJIIJJI = C2095008Iq.LJIIJJI(stringValue)) != null) {
                return numLJIIJJI.intValue();
            }
            return Integer.MAX_VALUE;
        }
        return (int) intValue;
    }
}
