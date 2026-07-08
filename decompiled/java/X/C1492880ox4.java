package X;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: X.0ox4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492880ox4 {
    public final Map<String, String> LIZIZ;
    public C1492900ox6 LIZLLL;
    public final String LIZ = UUID.randomUUID().toString();
    public final CountDownLatch LIZJ = new CountDownLatch(1);

    public C1492880ox4(String str, int i, Map<String, String> map) {
        this.LIZIZ = map;
    }
}
