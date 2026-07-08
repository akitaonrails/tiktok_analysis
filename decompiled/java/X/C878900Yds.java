package X;

import java.util.List;

/* JADX INFO: renamed from: X.0Yds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878900Yds implements InterfaceC1490905sZ<List<? extends C0Y9G>> {
    public static final int $stable = 0;
    public static final C878900Yds INSTANCE = new C878900Yds();
    public static final String LL = "message_request_aggregation_wrapper_type";

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // X.InterfaceC1490905sZ
    public String getTag() {
        return LL;
    }
}
