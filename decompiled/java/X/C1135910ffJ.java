package X;

import android.os.Looper;
import com.bytedance.android.livesdk.GiftAnchorPanelGiftRecordReceivedEvent;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.AwS135S0110000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ffJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135910ffJ implements InterfaceC1137720fiE {
    public DataChannel LIZJ;
    public C1135930ffL LJFF;
    public C1135810ff9 LJII;
    public final LinkedList<C1135810ff9> LIZ = new LinkedList<>();
    public final LinkedList<C1135810ff9> LIZIZ = new LinkedList<>();
    public final HashSet<String> LIZLLL = new HashSet<>();
    public final HashSet<String> LJ = new HashSet<>();
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());
    public final C1139380fku LJIIIIZZ = new C1139380fku(this);

    public final void LJIILIIL() {
        Gift gift;
        Gift gift2;
        Iterator<C1135810ff9> it2 = this.LIZ.iterator();
        while (true) {
            int i = 0;
            if (!it2.hasNext()) {
                break;
            }
            C1135810ff9 next = it2.next();
            C1134960fdm c1134960fdm = C1134980fdo.LIZ;
            GiftMessage giftMessage = next.LIZ;
            if (giftMessage != null && (gift2 = giftMessage.mGift) != null) {
                i = gift2.type;
            }
            c1134960fdm.LIZ(i, true);
            C1135790ff7.LJIIIIZZ(next, EnumC1133520fbS.MESSAGE_DISCARDED, EnumC1136250ffr.SHOW);
        }
        for (C1135810ff9 c1135810ff9 : this.LIZIZ) {
            C1134960fdm c1134960fdm2 = C1134980fdo.LIZ;
            GiftMessage giftMessage2 = c1135810ff9.LIZ;
            c1134960fdm2.LIZ((giftMessage2 == null || (gift = giftMessage2.mGift) == null) ? 0 : gift.type, false);
            C1135790ff7.LJIIIIZZ(c1135810ff9, EnumC1133520fbS.MESSAGE_DISCARDED, EnumC1136250ffr.SHOW);
        }
    }

    public final C1135810ff9 LJIILL() {
        C1135810ff9 c1135810ff9LJIILLIIL;
        if (!this.LIZ.isEmpty()) {
            c1135810ff9LJIILLIIL = LJIILLIIL(true);
            if (c1135810ff9LJIILLIIL != null) {
                return c1135810ff9LJIILLIIL;
            }
        } else {
            c1135810ff9LJIILLIIL = null;
        }
        return true ^ this.LIZIZ.isEmpty() ? LJIILLIIL(false) : c1135810ff9LJIILLIIL;
    }

    public final C1135810ff9 LJIILLIIL(boolean z) {
        LinkedList<C1135810ff9> linkedList;
        C1135810ff9 next;
        if (z) {
            linkedList = this.LIZ;
        } else {
            linkedList = this.LIZIZ;
        }
        Iterator<C1135810ff9> it2 = linkedList.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LJJLIIIJLLLLLLLZ != 1001) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(X.C1135810ff9 r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135910ffJ.LJIJ(X.0ff9, boolean):void");
    }

    @Override // X.InterfaceC1137720fiE
    public final void LJ(long j, C1135810ff9 c1135810ff9, int i) {
        for (C1135810ff9 c1135810ff92 : this.LIZ) {
            if (Intrinsics.LJFF(c1135810ff92, c1135810ff9) || c1135810ff92.LJJJJZ == j) {
                c1135810ff92.LJJLIIIJLLLLLLLZ = i;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update success ");
                sbLIZ.append(i);
                C20441214yg.LJIIIZ("LynxGiftChannelPreload", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        for (C1135810ff9 c1135810ff93 : this.LIZIZ) {
            if (Intrinsics.LJFF(c1135810ff93, c1135810ff9) || c1135810ff93.LJJJJZ == j) {
                c1135810ff93.LJJLIIIJLLLLLLLZ = i;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("update success ");
                sbLIZ2.append(i);
                C20441214yg.LJIIIZ("LynxGiftChannelPreload", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        C1135930ffL c1135930ffL = this.LJFF;
        if (c1135930ffL != null) {
            c1135930ffL.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1135810ff9 LJIILJJIL(X.C1136320ffy r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            if (r9 == 0) goto L95
            java.util.LinkedList<X.0ff9> r0 = r7.LIZ
        L4:
            java.util.Iterator r6 = r0.iterator()
        L8:
            boolean r0 = r6.hasNext()
            r5 = 0
            if (r0 == 0) goto L99
            java.lang.Object r3 = r6.next()
            X.0ff9 r3 = (X.C1135810ff9) r3
            boolean r0 = r8.LIZJ
            r2 = 0
            if (r0 != 0) goto L20
            int r1 = r3.LJJLIIIJLLLLLLLZ
            r0 = 1001(0x3e9, float:1.403E-42)
            if (r1 != r0) goto L93
        L20:
            X.0fbj r0 = X.C1133690fbj.LIZ
            r0.getClass()
            boolean r0 = X.C1133690fbj.LJFF(r3)
            if (r0 == 0) goto L93
            r4 = 0
        L2c:
            java.util.ArrayList<java.lang.String> r1 = r8.LIZIZ
            java.lang.String r0 = r3.LIZLLL
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L8
            if (r4 == 0) goto L8
            X.0ff9 r4 = r8.LIZ
            if (r4 == 0) goto L8e
            X.0fbj r0 = X.C1133690fbj.LIZ
            r0.getClass()
            java.lang.String r1 = r3.LIZLLL
            java.lang.String r0 = r4.LIZLLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L8e
            boolean r0 = X.C1133690fbj.LJ(r3)
            if (r0 != 0) goto L8e
            boolean r0 = X.C1133690fbj.LJ(r4)
            if (r0 != 0) goto L8e
        L57:
            if (r10 == 0) goto L6c
            com.bytedance.android.livesdk.model.message.GiftMessage r0 = r3.LIZ
            if (r0 == 0) goto L6a
            boolean r0 = r0.LLILLJJLI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L63:
            boolean r0 = X.C176600m4.LIZIZ(r0)
            if (r0 != 0) goto L6c
            return r5
        L6a:
            r0 = r5
            goto L63
        L6c:
            X.C1136080ffa.LJI(r3, r9)
            r6.remove()
            java.util.HashSet<java.lang.String> r1 = r7.LIZLLL
            java.lang.String r0 = r3.LIZLLL
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L83
            java.util.HashSet<java.lang.String> r1 = r7.LIZLLL
            java.lang.String r0 = r3.LIZLLL
            r1.remove(r0)
        L83:
            int r1 = r3.LJIIIZ
            X.0ff9 r0 = r8.LIZ
            if (r0 == 0) goto L8b
            int r2 = r0.LJIIIZ
        L8b:
            if (r1 <= r2) goto L8
            return r3
        L8e:
            X.0ff9 r0 = r8.LIZ
            if (r0 != 0) goto L8
            goto L57
        L93:
            r4 = 1
            goto L2c
        L95:
            java.util.LinkedList<X.0ff9> r0 = r7.LIZIZ
            goto L4
        L99:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135910ffJ.LJIILJJIL(X.0ffy, boolean, boolean):X.0ff9");
    }

    public final void LJIIZILJ(C1135810ff9 c1135810ff9, boolean z, boolean z2) {
        DataChannel dataChannel;
        if (z2) {
            C11RO c11ro = C1135890ffH.LIZ;
            C1135890ffH.LIZJ(c1135810ff9, this.LIZ, this.LIZLLL, z2, z, new AwS135S0110000_17(this, z, 13));
            C1133990fcD.LIZ(z2, this.LIZ, null);
            return;
        }
        DataChannel dataChannel2 = this.LIZJ;
        if (dataChannel2 != null && Intrinsics.LJFF(dataChannel2.gg0(C1085130eLP.class), Boolean.TRUE) && (dataChannel = this.LIZJ) != null) {
            dataChannel.LC0(GiftAnchorPanelGiftRecordReceivedEvent.class, c1135810ff9);
        }
        C11RO c11ro2 = C1135890ffH.LIZ;
        C1135890ffH.LIZJ(c1135810ff9, this.LIZIZ, this.LIZLLL, false, z, new AwS135S0110000_17(this, z, 14));
        C1133990fcD.LIZ(z2, this.LIZIZ, null);
    }
}
