package X;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: renamed from: X.05GX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05GX implements Serializable {
    public final String eventName;
    public final Map<String, String> params;
    public final long timeStamp;

    public C05GX(String str, Map<String, String> map, long j) {
        this.eventName = str;
        this.params = map;
        this.timeStamp = j;
    }
}
