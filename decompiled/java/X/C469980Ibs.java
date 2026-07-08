package X;

import android.os.Bundle;

/* JADX INFO: renamed from: X.0Ibs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469980Ibs implements InterfaceC475370IkZ {
    public final Bundle LIZ;

    @Override // X.InterfaceC475370IkZ
    public final void LIZ(int i) {
    }

    @Override // X.InterfaceC475370IkZ
    public final boolean LIZLLL() {
        return this.LIZ.getBoolean("smooth_enter_room");
    }

    public C469980Ibs(Bundle bundle) {
        this.LIZ = bundle;
    }

    @Override // X.InterfaceC475370IkZ
    public final void LIZIZ(long j) {
        this.LIZ.putLong("room_id", j);
    }

    @Override // X.InterfaceC475370IkZ
    public final void LIZJ(int i) {
        this.LIZ.putInt("landing_page", i);
    }

    @Override // X.InterfaceC475370IkZ
    public final void putBoolean(String str, boolean z) {
        this.LIZ.putBoolean(str, z);
    }

    @Override // X.InterfaceC475370IkZ
    public final void putString(String str, String str2) {
        C786410Ut5.LJJJI(str, str2, this.LIZ);
    }
}
