package X;

/* JADX INFO: renamed from: X.0kjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1330650kjP {
    OnCloseToDalvikHeapLimit(0.5d),
    OnSystemMemoryCriticallyLowWhileAppInForeground(1.0d),
    OnSystemLowMemoryWhileAppInForeground(0.5d),
    OnSystemLowMemoryWhileAppInBackground(1.0d),
    OnAppBackgrounded(1.0d);

    public final double LL;

    public double getSuggestedTrimRatio() {
        return this.LL;
    }

    EnumC1330650kjP(double d) {
        this.LL = d;
    }
}
