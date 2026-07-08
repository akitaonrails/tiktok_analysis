package X;

import android.content.Context;

/* JADX INFO: renamed from: X.1Bcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209021Bcy implements InterfaceC2208871Bcj {
    public static final C2209021Bcy LIZ = new C2209021Bcy();

    @Override // X.InterfaceC2208871Bcj
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC2208871Bcj
    public final boolean LIZ(Context context, C1DHX c1dhx) {
        int i = c1dhx.A4().getInt("device_support_antishake_mode", -1);
        C2216241Boc c2216241Boc = C2216241Boc.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CameraDeviceAbility isSupportAntiShake:");
        sbLIZ.append(i);
        c2216241Boc.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (i == 1) {
            return true;
        }
        return false;
    }
}
