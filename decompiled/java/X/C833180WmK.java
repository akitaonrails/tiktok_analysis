package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0WmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C833180WmK implements InterfaceC19786612bI {
    public static final C833180WmK LIZ = new C833180WmK();

    @Override // X.InterfaceC19786612bI
    public final long LIZ() {
        return SystemClock.elapsedRealtime();
    }

    @Override // X.InterfaceC19786612bI
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
