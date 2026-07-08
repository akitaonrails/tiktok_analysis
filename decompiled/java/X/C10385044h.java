package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.044h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10385044h {
    public static final /* synthetic */ int LIZIZ = 0;
    public final ConcurrentHashMap<String, C10380044c> LIZ = new ConcurrentHashMap<>();

    public final C10380044c LIZ(String str) {
        if (str != null) {
            return this.LIZ.get(str);
        }
        return null;
    }
}
