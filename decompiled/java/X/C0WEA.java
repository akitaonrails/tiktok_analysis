package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0WEA, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WEA {
    public static final C0WE1 LIZ = new C0WE2<C0WC2>() { // from class: X.0WE1
        @Override // X.InterfaceC819210WBr
        public final Object get() {
            return new C0WC2() { // from class: X.0WE3
                @Override // X.C0WC2
                public final long getTime() {
                    return SystemClock.elapsedRealtime();
                }
            };
        }
    };
}
