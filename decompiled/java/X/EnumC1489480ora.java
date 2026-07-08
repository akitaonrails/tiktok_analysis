package X;

/* JADX INFO: renamed from: X.0ora, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public enum EnumC1489480ora {
    UNKNOWN_DISPATCH_STRATEGY,
    STATIC_DISPATCH_STRATEGY,
    WRR_DISPATCH_STRATEGY,
    CONSERVATIVE_DISPATCH_STRATEGY,
    OPTIMIZED_DISPATCH_STRATEGY,
    ROUTE_SELECTION_DISPATCH_STRATEGY,
    REQUEST_HEADER_DISPATCH_STRATEGY,
    DISPATCH_STRATEGY_SUPPORTED_LAST;

    public static EnumC1489480ora valueOf(String str) {
        return (EnumC1489480ora) C08FF.LIZ(EnumC1489480ora.class, str);
    }
}
