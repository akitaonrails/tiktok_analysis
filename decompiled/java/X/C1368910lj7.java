package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0lj7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368910lj7 {
    public static final String LIZ(int i) {
        Context applicationContext;
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null && (applicationContext = interfaceC1370110ll3.getApplicationContext()) != null) {
            return applicationContext.getString(i);
        }
        return null;
    }
}
