package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownOnCalculatingMessageReceivedEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownContent;

/* JADX INFO: renamed from: X.01IJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01IJ extends C01I4 {
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public final C01GW LJJ;
    public final C01IK LJJI;

    @Override // X.C01I4
    public final String LJIILL() {
        return "GuestShowdownGuestModel";
    }

    @Override // X.C01I4
    public final void LJIIZILJ() {
        super.LJIIZILJ();
        C924790aAn.LIZLLL().LIZ(this.LJJI);
    }

    @Override // X.C01I4
    public final void LJIJ() {
        super.LJIJ();
        C924790aAn.LIZLLL().LIZJ(this.LJJI);
        ((C11NJ) this.LJJ.getValue()).LJ();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.01IK] */
    public C01IJ(DataChannel dataChannel) {
        super(dataChannel);
        this.LJJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(532));
        this.LJJI = new C0IMT() { // from class: X.01IK
            @Override // X.C0IMT
            public final void onChanged(Object obj) {
                long j;
                Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
                int i = 0;
                if (num != null) {
                    if (num.intValue() == 2) {
                        C01IJ c01ij = this.LL;
                        int i2 = 1;
                        if (c01ij.LJIILJJIL() != 0 && c01ij.LJIILJJIL() != 5) {
                            this.LL.LJIILIIL = C445101oH.LIZ();
                            if (2 == this.LL.LJIILJJIL()) {
                                this.LL.LJIILJJIL = C445101oH.LIZ();
                            }
                            C01IJ c01ij2 = this.LL;
                            c01ij2.LJIJJLI = true;
                            GuestShowdownContent guestShowdownContent = c01ij2.LIZIZ;
                            if (guestShowdownContent != null) {
                                j = guestShowdownContent.playId;
                                GuestShowdownConfig guestShowdownConfig = guestShowdownContent.playConfig;
                                if (guestShowdownConfig != null) {
                                    i = guestShowdownConfig.loserNum;
                                }
                                GuestShowdownConfig guestShowdownConfig2 = guestShowdownContent.playConfig;
                                if (guestShowdownConfig2 != null) {
                                    i2 = guestShowdownConfig2.winnerNum;
                                }
                            } else {
                                j = 0;
                            }
                            C308501Hn.LIZIZ(i, i2, j);
                            return;
                        }
                        return;
                    }
                    if (num.intValue() != 0) {
                        return;
                    }
                    C01IJ c01ij3 = this.LL;
                    if (!c01ij3.LJIJJLI) {
                        return;
                    }
                    c01ij3.LJIILLIIL(c01ij3.LIZIZ, 0, false, "guest_end");
                }
            }
        };
    }

    @Override // X.C01I4, X.InterfaceC213200ry
    public final void LJ(GuestShowdownContent guestShowdownContent) {
        long j;
        int i;
        GuestShowdownConfig guestShowdownConfig;
        this.LJIILIIL = C445101oH.LIZ();
        this.LJIJJLI = true;
        if (guestShowdownContent != null) {
            j = guestShowdownContent.playId;
        } else {
            j = 0;
        }
        int i2 = 0;
        if (guestShowdownContent != null && (guestShowdownConfig = guestShowdownContent.playConfig) != null) {
            i = guestShowdownConfig.loserNum;
        } else {
            i = 0;
            if (guestShowdownContent != null) {
            }
            C308501Hn.LIZIZ(i, i2, j);
            super.LJ(guestShowdownContent);
        }
        GuestShowdownConfig guestShowdownConfig2 = guestShowdownContent.playConfig;
        if (guestShowdownConfig2 != null) {
            i2 = guestShowdownConfig2.winnerNum;
        }
        C308501Hn.LIZIZ(i, i2, j);
        super.LJ(guestShowdownContent);
    }

    @Override // X.C01I4, X.InterfaceC213200ry
    public final void LIZIZ(int i, GuestShowdownContent guestShowdownContent) {
        super.LIZIZ(i, guestShowdownContent);
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.LC0(GuestShowdownOnCalculatingMessageReceivedEvent.class, Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba A[PHI: r0 r10
      0x00ba: PHI (r0v26 long) = (r0v11 long), (r0v27 long) binds: [B:74:0x0154, B:59:0x00b8] A[DONT_GENERATE, DONT_INLINE]
      0x00ba: PHI (r10v4 int) = (r10v1 int), (r10v5 int) binds: [B:74:0x0154, B:59:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0158 A[PHI: r0 r10
      0x0158: PHI (r0v12 long) = (r0v11 long), (r0v26 long) binds: [B:74:0x0154, B:61:0x00bc] A[DONT_GENERATE, DONT_INLINE]
      0x0158: PHI (r10v2 int) = (r10v1 int), (r10v4 int) binds: [B:74:0x0154, B:61:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a1 A[PHI: r17
      0x01a1: PHI (r17v1 int) = (r17v0 int), (r17v4 int) binds: [B:95:0x019d, B:29:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C01I4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(webcast.data.multi_guest_play.GuestShowdownContent r21, int r22, boolean r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01IJ.LJIILLIIL(webcast.data.multi_guest_play.GuestShowdownContent, int, boolean, java.lang.String):void");
    }
}
