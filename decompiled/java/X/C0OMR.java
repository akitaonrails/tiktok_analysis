package X;

import android.content.Intent;

/* JADX INFO: renamed from: X.0OMR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OMR implements InterfaceC21501419Cq {
    @Override // X.InterfaceC21501419Cq
    public final void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinProfileFragment - requestCode = ");
        sbLIZ.append(i);
        sbLIZ.append(", resultCode = ");
        sbLIZ.append(i2);
        sbLIZ.append(", data = ");
        sbLIZ.append(intent);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
    }
}
