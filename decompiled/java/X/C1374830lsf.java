package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.0lsf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374830lsf implements InterfaceC1378050lxr {
    public final /* synthetic */ Activity LIZ;

    @Override // X.InterfaceC1378050lxr
    public final Activity get() {
        Activity activity = this.LIZ;
        if (activity != null) {
            return activity;
        }
        InterfaceC1370110ll3 interfaceC1370110ll3 = C1370370llT.LIZ;
        if (interfaceC1370110ll3 != null) {
            return interfaceC1370110ll3.getCurrentActivity();
        }
        return null;
    }

    public C1374830lsf(Activity activity) {
        this.LIZ = activity;
    }
}
