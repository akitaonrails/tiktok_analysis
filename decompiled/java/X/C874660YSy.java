package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0YSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874660YSy implements InterfaceC870790YEb {
    @Override // X.InterfaceC870790YEb
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC870790YEb
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC870790YEb
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC870790YEb
    public final Context getApplicationContext() {
        return C2213981Bky.LIZIZ.getApplicationContext();
    }

    @Override // X.InterfaceC870790YEb
    public final String getSecUid() {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        return C461720I8s.LIZ();
    }

    @Override // X.InterfaceC870790YEb
    public final long getUid() {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        long jLIZJ = C461720I8s.LIZJ();
        if (jLIZJ <= 0) {
            C882400YjW.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getUid uid invalid: ");
            C882400YjW.LIZ();
            sbLIZ.append(C461720I8s.LIZIZ());
            sbLIZ.append(", ");
            C882400YjW.LIZ();
            sbLIZ.append(C461720I8s.LJ());
            C882690Yjz.LJFF("SDKRuntimeStateBridge", C2188811AlT.LIZIZ(sbLIZ));
        }
        return jLIZJ;
    }

    @Override // X.InterfaceC870790YEb
    public final String getToken() {
        return C0YUM.LIZ();
    }

    @Override // X.InterfaceC870790YEb
    public final boolean isAppBackground() {
        return C1906580ziK.LJI();
    }
}
