package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0lku, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1370020lku {
    public static int LIZ(double d) {
        Context applicationContext;
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 == null || (applicationContext = interfaceC1370110ll3.getApplicationContext()) == null || applicationContext.getResources() == null || applicationContext.getResources().getDisplayMetrics() == null) {
            return 0;
        }
        return (int) ((d * ((double) applicationContext.getResources().getDisplayMetrics().density)) + 0.5d);
    }
}
