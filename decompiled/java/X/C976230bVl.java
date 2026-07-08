package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.AwS0S0111300_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bVl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976230bVl {
    public static void LIZ(C975970bVL c975970bVL, InterfaceC976360bVy interfaceC976360bVy, int i, boolean z, long j, int i2, long j2, int i3) {
        long j3;
        Room roomInfo;
        boolean z2;
        long j4;
        long j5 = j2;
        int i4 = i2;
        if ((i3 & 32) != 0) {
            i4 = 0;
        }
        if ((i3 & 64) != 0) {
            j5 = -1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finish, cutShort = ");
        sbLIZ.append(z);
        sbLIZ.append(" isFinishing = ");
        sbLIZ.append(c975970bVL.LJIIL);
        sbLIZ.append(", source = ");
        sbLIZ.append(i);
        sbLIZ.append(", retryCount = ");
        sbLIZ.append(i4);
        sbLIZ.append(", leaveOrFinishReason = ");
        sbLIZ.append(j5);
        C20441214yg.LJIIIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
        if (c975970bVL.LJIIL) {
            C20441214yg.LJ("MultiMatchStateMatching", "already in isSettleFinishing true state");
            return;
        }
        C975960bVK c975960bVK = c975970bVL.LJII;
        if (c975960bVK != null) {
            j3 = c975960bVK.LJ;
        } else {
            j3 = 0;
        }
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        InterfaceC975520bUc interfaceC975520bUc = c975970bVL.LIZIZ;
        if (interfaceC975520bUc != null) {
            roomInfo = interfaceC975520bUc.getRoomInfo();
        } else {
            roomInfo = null;
        }
        int iLJJIJIIJI = C974540bT2.LJJIJIIJI(i, j, roomInfo);
        String strLJJIJIIJIL = C974540bT2.LJJIJIIJIL(iLJJIJIIJI, j5);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isBattleId is 0 ->");
        if (j3 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ2.append(z2);
        C20441214yg.LJ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ2));
        if (C915980Zwa.LJFF().xd2() == j3 && j3 != 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Already finished ,and deal result , same Id =");
            sbLIZ3.append(j3);
            C20441214yg.LJ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ3));
            c975970bVL.LJIIL = false;
            return;
        }
        c975970bVL.LJIIL = true;
        if (interfaceC976360bVy == null) {
            return;
        }
        if (z) {
            j4 = j;
        } else {
            j4 = 0;
        }
        interfaceC976360bVy.LJIJI(j3, z, j4, iLJJIJIIJI, strLJJIJIIJIL, j5, null, new AwS0S0111300_15(c975970bVL, j3, z, j5, j, i, 0), new AwS0S0111300_15(c975970bVL, j3, z, j5, j, i, 1), new AwS559S0100000_15(c975970bVL, 972), new C976210bVj(c975970bVL, i4, j5, j, z, interfaceC976360bVy));
    }
}
