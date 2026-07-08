package X;

import android.content.Intent;

/* JADX INFO: renamed from: X.0Is8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480060Is8 implements InterfaceC475370IkZ {
    public final Intent LIZ;

    @Override // X.InterfaceC475370IkZ
    public final boolean LIZLLL() {
        return this.LIZ.getBooleanExtra("smooth_enter_room", false);
    }

    public C480060Is8(Intent intent) {
        this.LIZ = intent;
    }

    @Override // X.InterfaceC475370IkZ
    public final void LIZ(int i) {
        this.LIZ.addFlags(i);
    }

    @Override // X.InterfaceC475370IkZ
    public final void LIZIZ(long j) {
        this.LIZ.putExtra("room_id", j);
    }

    @Override // X.InterfaceC475370IkZ
    public final void LIZJ(int i) {
        this.LIZ.putExtra("landing_page", i);
    }

    @Override // X.InterfaceC475370IkZ
    public final void putBoolean(String str, boolean z) {
        this.LIZ.putExtra(str, z);
    }

    @Override // X.InterfaceC475370IkZ
    public final void putString(String str, String str2) {
        this.LIZ.putExtra(str, str2);
    }
}
