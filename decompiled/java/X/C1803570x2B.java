package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0x2B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803570x2B implements InterfaceC1804480x3e {
    public C1803560x2A LIZ;

    @Override // X.InterfaceC1804480x3e
    public final void LIZLLL() {
        C1803440x1y.LIZ("ttlive_wallet_recharge_query_package_get_cache", null);
        C1803560x2A c1803560x2A = this.LIZ;
        if (c1803560x2A != null) {
            c1803560x2A.LIZIZ = true;
            c1803560x2A.LJI = C158B.LIZ();
        }
        C1803560x2A c1803560x2A2 = this.LIZ;
        if (c1803560x2A2 != null) {
            c1803560x2A2.LIZJ = true;
            c1803560x2A2.LJII = C158B.LIZ();
        }
        C1803560x2A c1803560x2A3 = this.LIZ;
        if (c1803560x2A3 != null) {
            C1803540x28.LIZIZ(c1803560x2A3);
        }
    }

    @Override // X.InterfaceC1804480x3e
    public final void end() {
        C1803560x2A c1803560x2A = this.LIZ;
        if (c1803560x2A != null) {
            C1803540x28.LIZIZ(c1803560x2A);
        }
    }

    @Override // X.InterfaceC1804480x3e
    public final void LIZIZ(boolean z) {
        C1803560x2A c1803560x2A = this.LIZ;
        if (c1803560x2A != null) {
            c1803560x2A.LJI = C158B.LIZ();
        }
        C1803560x2A c1803560x2A2 = this.LIZ;
        if (c1803560x2A2 != null) {
            c1803560x2A2.LIZIZ = !z;
        }
    }

    @Override // X.InterfaceC1804480x3e
    public final void LIZJ(boolean z) {
        C1803560x2A c1803560x2A = this.LIZ;
        if (c1803560x2A != null) {
            c1803560x2A.LJII = C158B.LIZ();
        }
        C1803560x2A c1803560x2A2 = this.LIZ;
        if (c1803560x2A2 != null) {
            c1803560x2A2.LIZJ = !z;
        }
    }

    @Override // X.InterfaceC1804480x3e
    public final void LIZ(int i, String str, boolean z) {
        C1803560x2A c1803560x2ALIZJ;
        String strValueOf;
        if (z) {
            if (i == 2) {
                strValueOf = "live_room";
            } else {
                strValueOf = String.valueOf(i);
            }
            c1803560x2ALIZJ = C1803540x28.LIZJ(strValueOf);
        } else {
            c1803560x2ALIZJ = null;
        }
        this.LIZ = c1803560x2ALIZJ;
        if (c1803560x2ALIZJ != null) {
            c1803560x2ALIZJ.LJFF = C158B.LIZ();
        }
        C1803560x2A c1803560x2A = this.LIZ;
        if (c1803560x2A != null) {
            c1803560x2A.LIZ = !Intrinsics.LJFF(str, "");
        }
    }
}
