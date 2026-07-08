package X;

import com.bytedance.android.livesdk.userservice.UserService;

/* JADX INFO: renamed from: X.0b8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962050b8t extends AbstractC962040b8s {
    public final String LJ = "ttlive_client_interact_feed_audience_monitor";

    @Override // X.AbstractC962040b8s
    public final void LJIILIIL() {
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        AbstractC962040b8s.LJIIJ(this.LIZLLL, "current_user_id", Long.valueOf(interfaceC500940JkiUser != null ? interfaceC500940JkiUser.getCurrentUserId() : 0L), true);
    }

    public final void LJIILL(InterfaceC962060b8u interfaceC962060b8u) {
        long jLIZ;
        long j;
        C958950b3t c958950b3tLIZLLL;
        long jLIZIZ = 0;
        if (interfaceC962060b8u != null) {
            jLIZ = interfaceC962060b8u.LIZ();
        } else {
            jLIZ = 0;
        }
        AbstractC962040b8s.LJIIJ(this.LIZLLL, "room_id", Long.valueOf(jLIZ), true);
        if (interfaceC962060b8u != null && (c958950b3tLIZLLL = interfaceC962060b8u.LIZLLL()) != null) {
            j = c958950b3tLIZLLL.LIZLLL;
        } else {
            j = 0;
        }
        AbstractC962040b8s.LJIIJ(this.LIZLLL, "channel_id", Long.valueOf(j), false);
        if (interfaceC962060b8u != null) {
            jLIZIZ = interfaceC962060b8u.LIZIZ();
        }
        AbstractC962040b8s.LJIIJ(this.LIZLLL, "anchor_id", Long.valueOf(jLIZIZ), true);
    }

    public final void LJIIZILJ(C958960b3u c958960b3u, long j, int i) {
        LJIIL();
        AbstractC962040b8s.LJIIJ(this.LIZLLL, "sei_channel_id", Long.valueOf(j), true);
        AbstractC962040b8s.LJIIJ(this.LIZLLL, "linker_arch_type", Integer.valueOf(i), true);
        LJIILL(c958960b3u);
        LJIILJJIL("cohost_info_succeed");
    }

    public final void LJIILLIIL(C958960b3u c958960b3u, long j, int i, Throwable th) {
        LJIIL();
        AbstractC962040b8s.LJIIJ(this.LIZLLL, "sei_channel_id", Long.valueOf(j), true);
        AbstractC962040b8s.LJIIJ(this.LIZLLL, "linker_arch_type", Integer.valueOf(i), true);
        LJIIJJI(th);
        LJIILL(c958960b3u);
        LJIILJJIL("cohost_info_failed");
    }
}
