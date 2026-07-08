package X;

/* JADX INFO: renamed from: X.0Byj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305790Byj {
    public static final void LIZ(Long l, Long l2) {
        if (!((Boolean) C265400Aag.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (l != null && l.longValue() == 0) {
            C1AF0.LJ(new RuntimeException("prop_download_duration_anomaly"));
        } else if (l2 != null && l2.longValue() > 1700000000000L) {
            C1AF0.LJ(new RuntimeException("prop_download_duration_anomaly"));
        }
    }
}
