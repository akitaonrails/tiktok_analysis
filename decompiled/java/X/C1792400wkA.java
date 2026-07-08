package X;

import com.bytedance.globalpayment.iap.model.SKUInfo;
import java.util.Map;

/* JADX INFO: renamed from: X.0wkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792400wkA {
    public final Map<String, SKUInfo> LIZ;
    public final C1792410wkB LIZIZ;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0wkB] */
    public C1792400wkA(Map map) {
        ?? r0 = new AbstractC1792180wjo() { // from class: X.0wkB
            public final String LIZLLL = "livesdk_iap_query_product";

            @Override // X.AbstractC1792180wjo
            public final String LIZ() {
                return this.LIZLLL;
            }
        };
        this.LIZ = map;
        this.LIZIZ = r0;
    }
}
