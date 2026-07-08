package X;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0s46, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612560s46 implements Serializable {
    public static final int $stable = 8;
    public final Map<String, Object> iapTrackingData;
    public final boolean ifUsePopup;
    public final String panelType;
    public final List<String> subscriptionType;

    public C1612560s46(String str, boolean z, List<String> list, Map<String, ? extends Object> map) {
        this.panelType = str;
        this.ifUsePopup = z;
        this.subscriptionType = list;
        this.iapTrackingData = map;
    }
}
