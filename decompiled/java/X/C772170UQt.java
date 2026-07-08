package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMixCardEventConfig;

/* JADX INFO: renamed from: X.0UQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772170UQt {
    public static final C772170UQt LIZ = new C772170UQt();

    public static void LIZ() {
        C0JT6<Double> c0jt6 = InterfaceC1106030et7.E8;
        Double dLIZ = c0jt6.LIZ();
        double d = 0.0d;
        double dDoubleValue = (dLIZ != null ? dLIZ.doubleValue() : 0.0d) + 1.0d;
        C0JT6<Double> c0jt62 = InterfaceC1106030et7.F8;
        Double dLIZ2 = c0jt62.LIZ();
        double dDoubleValue2 = dLIZ2 != null ? dLIZ2.doubleValue() : 0.0d;
        C0JT6<Double> c0jt63 = InterfaceC1106030et7.D8;
        Double dLIZ3 = c0jt63.LIZ();
        double dDoubleValue3 = dLIZ3 != null ? dLIZ3.doubleValue() : 0.0d;
        long j = (long) dDoubleValue;
        LiveMixCardEventConfig liveMixCardEventConfig = LiveMixCardEventConfig.INSTANCE;
        if (j == liveMixCardEventConfig.getDegradeTimes()) {
            dDoubleValue3 = System.currentTimeMillis() + (liveMixCardEventConfig.getDegradeControlDuration() * 3600000);
        } else {
            d = dDoubleValue;
        }
        c0jt6.LIZJ(Double.valueOf(d));
        c0jt62.LIZJ(Double.valueOf(dDoubleValue2 + ((double) 1)));
        c0jt63.LIZJ(Double.valueOf(dDoubleValue3));
    }
}
