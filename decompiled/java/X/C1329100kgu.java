package X;

import android.app.ActivityManager;

/* JADX INFO: renamed from: X.0kgu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1329100kgu implements InterfaceC1320070kSL<C1329770khz> {
    public final ActivityManager LIZ;

    @Override // X.InterfaceC1320070kSL
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public C1329770khz get() {
        int iMin = Math.min(this.LIZ.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        return new C1329770khz(iMin < 33554432 ? 4194304 : iMin < 67108864 ? 6291456 : iMin / 4, 256, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public C1329100kgu(ActivityManager activityManager) {
        this.LIZ = activityManager;
    }
}
