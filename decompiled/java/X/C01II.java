package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import org.json.JSONException;
import webcast.data.multi_guest_play.GuestShowdownConfigChange;
import webcast.data.multi_guest_play.GuestShowdownContent;

/* JADX INFO: renamed from: X.01II, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01II extends C01I4 {
    public static final /* synthetic */ int LJJIFFI = 0;
    public String LJIJJ;
    public boolean LJIJJLI;
    public C305201Gg LJIL;
    public final CopyOnWriteArrayList<InterfaceC305401Gi> LJJ;
    public long LJJI;

    @Override // X.C01I4
    public final String LJIILL() {
        return "GuestShowdownAnchorModel";
    }

    @Override // X.C01I4
    public final void LJIJ() {
        this.LJJ.clear();
        super.LJIJ();
    }

    public final void LJJ() {
        String str = this.LJIJJ;
        if (str.length() == 0) {
            return;
        }
        C20441214yg.LJIIIZ("GuestShowdownAnchorModel", "stopAuxStreamAndClearRecord destroyAuxStream");
        if (this.LJIJJLI) {
            InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL != null) {
                interfaceC954180awCLLJLL.stopAuxStream(str);
            }
            this.LJIJJLI = false;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null) {
            interfaceC954180awCLLJLL2.LJIILLIIL(str);
        }
        this.LJIJJ = "";
    }

    @Override // X.C01I4
    public final void LJIIIZ() throws JSONException {
        super.LJIIIZ();
        this.LJJI = 0L;
        InterfaceC934710aQn.fc.LJFF(0L);
    }

    @Override // X.C01I4
    public final void LJIIZILJ() {
        super.LJIIZILJ();
        C20337914i1<Long> c20337914i1 = InterfaceC934710aQn.fc;
        Long lLIZIZ = c20337914i1.LIZIZ();
        if (lLIZIZ == null || lLIZIZ.longValue() != 0) {
            C308501Hn.LIZJ(0, 0, 0, c20337914i1.LIZIZ().longValue(), 0L, 0L, 0L, 0L, "multi_guest_resumed");
            c20337914i1.LJFF(0L);
        }
    }

    public C01II(DataChannel dataChannel) {
        super(dataChannel);
        this.LJIJJ = "";
        this.LJJ = new CopyOnWriteArrayList<>();
        new Pair(0, 0);
    }

    public final String LJIL(String str) {
        C1275750jIr c1275750jIrLJJIJ;
        C20441214yg.LJIIIZ("GuestShowdownAnchorModel", "createPlayBoardAuxStream");
        C01IN c01in = new C01IN();
        C01IL c01il = new C01IL();
        c01il.LIZ = 200;
        c01il.LIZIZ = 200;
        c01il.LIZJ = 1;
        c01il.LIZLLL = 800;
        c01in.LIZIZ = c01il;
        if (str != null) {
            c01in.LIZ = str;
        }
        C01IM c01im = new C01IM();
        c01im.LIZ = C01IR.BITMAP;
        c01in.LIZJ = c01im;
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null && (c1275750jIrLJJIJ = interfaceC954180awCLLJLL.LJJIJ(c01in)) != null) {
            C20441214yg.LJIIIZ("GuestShowdownAnchorModel", "createPlayBoardAuxStream success.");
            this.LJIJJ = c1275750jIrLJJIJ.LIZIZ;
        }
        return this.LJIJJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    @Override // X.C01I4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(webcast.data.multi_guest_play.GuestShowdownContent r25, java.lang.String r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01II.LJIJJ(webcast.data.multi_guest_play.GuestShowdownContent, java.lang.String):void");
    }

    @Override // X.C01I4, X.InterfaceC213200ry
    public final void LJII(GuestShowdownContent guestShowdownContent, int i, GuestShowdownConfigChange guestShowdownConfigChange) {
        super.LJII(guestShowdownContent, i, guestShowdownConfigChange);
        if (i != 2 && this.LJIJJ.length() > 0) {
            LJJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e A[PHI: r6
      0x008e: PHI (r6v1 int) = (r6v0 int), (r6v3 int) binds: [B:44:0x008b, B:39:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2 A[PHI: r5
      0x00b2: PHI (r5v1 int) = (r5v0 int), (r5v4 int) binds: [B:57:0x00af, B:23:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C01I4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILLIIL(webcast.data.multi_guest_play.GuestShowdownContent r20, int r21, boolean r22, java.lang.String r23) {
        /*
            r19 = this;
            r8 = 0
            r0 = r20
            if (r0 == 0) goto L21
            java.util.List<webcast.data.multi_guest_play.GuestShowdownUser> r1 = r0.runningPlayUsers
            if (r1 == 0) goto L21
            java.util.Iterator r3 = r1.iterator()
            r16 = 0
        L10:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r3.next()
            webcast.data.multi_guest_play.GuestShowdownUser r1 = (webcast.data.multi_guest_play.GuestShowdownUser) r1
            long r1 = r1.score
            long r16 = r16 + r1
            goto L10
        L21:
            r16 = 0
            if (r0 == 0) goto L3e
        L25:
            java.util.List<webcast.data.multi_guest_play.GuestShowdownUser> r1 = r0.leavePlayUsers
            if (r1 == 0) goto L3e
            java.util.Iterator r3 = r1.iterator()
        L2d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r3.next()
            webcast.data.multi_guest_play.GuestShowdownUser r1 = (webcast.data.multi_guest_play.GuestShowdownUser) r1
            long r1 = r1.score
            long r16 = r16 + r1
            goto L2d
        L3e:
            if (r0 == 0) goto Lae
            java.util.List<webcast.data.multi_guest_play.GuestShowdownUser> r1 = r0.runningPlayUsers
            if (r1 == 0) goto Lae
            int r5 = r1.size()
        L48:
            java.util.List<webcast.data.multi_guest_play.GuestShowdownUser> r1 = r0.leavePlayUsers
            if (r1 == 0) goto Lb2
            int r1 = r1.size()
        L50:
            int r5 = r5 + r1
            switch(r21) {
                case 1: goto Lab;
                case 2: goto La8;
                case 3: goto La5;
                case 4: goto La2;
                case 5: goto L9f;
                case 6: goto L9c;
                case 7: goto L99;
                case 8: goto L96;
                default: goto L54;
            }
        L54:
            java.lang.String r18 = "other"
        L56:
            r3 = r19
            long r14 = r3.LJIILL
            int r1 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            r4 = 1000(0x3e8, float:1.401E-42)
            if (r1 != 0) goto L90
            long r14 = X.C445101oH.LIZ()
            long r1 = r3.LJIILJJIL
            long r14 = r14 - r1
            long r1 = (long) r4
            long r14 = r14 / r1
        L69:
            if (r0 == 0) goto L6d
            long r8 = r0.playId
        L6d:
            long r10 = r3.LJJI
            long r12 = X.C445101oH.LIZ()
            long r1 = r3.LJIILIIL
            long r12 = r12 - r1
            long r1 = (long) r4
            long r12 = r12 / r1
            if (r0 == 0) goto L8a
            webcast.data.multi_guest_play.GuestShowdownConfig r1 = r0.playConfig
            if (r1 == 0) goto L8a
            int r6 = r1.loserNum
        L80:
            webcast.data.multi_guest_play.GuestShowdownConfig r0 = r0.playConfig
            if (r0 == 0) goto L8e
            int r7 = r0.winnerNum
        L86:
            X.C308501Hn.LIZJ(r5, r6, r7, r8, r10, r12, r14, r16, r18)
            return
        L8a:
            r6 = 0
            if (r0 == 0) goto L8e
            goto L80
        L8e:
            r7 = 1
            goto L86
        L90:
            long r1 = r3.LJIILJJIL
            long r14 = r14 - r1
            long r1 = (long) r4
            long r14 = r14 / r1
            goto L69
        L96:
            java.lang.String r18 = "play_exclusive"
            goto L56
        L99:
            java.lang.String r18 = "multi_guest_resumed"
            goto L56
        L9c:
            java.lang.String r18 = "kick_out_all_guests"
            goto L56
        L9f:
            java.lang.String r18 = "multi_guest_closed"
            goto L56
        La2:
            java.lang.String r18 = "last_player_leave"
            goto L56
        La5:
            java.lang.String r18 = "moderator_close"
            goto L56
        La8:
            java.lang.String r18 = "host_start_again"
            goto L56
        Lab:
            java.lang.String r18 = "host_close"
            goto L56
        Lae:
            r5 = 0
            if (r0 == 0) goto Lb2
            goto L48
        Lb2:
            r1 = 0
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01II.LJIILLIIL(webcast.data.multi_guest_play.GuestShowdownContent, int, boolean, java.lang.String):void");
    }
}
