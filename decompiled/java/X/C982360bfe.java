package X;

/* JADX INFO: renamed from: X.0bfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982360bfe {
    public static void LIZ(AbstractC981980bf2 abstractC981980bf2, InterfaceC983270bh7 interfaceC983270bh7, int i, int i2, int i3) {
        long j;
        int i4 = i2;
        if ((i3 & 16) != 0) {
            i4 = 0;
        }
        if ((i3 & 32) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestSettlementEndApi");
        sbLIZ.append(", cutShort = ");
        sbLIZ.append(false);
        sbLIZ.append(" isFinishing = ");
        sbLIZ.append(abstractC981980bf2.LJI);
        sbLIZ.append(", source = ");
        sbLIZ.append(i);
        sbLIZ.append(", retryCount = ");
        sbLIZ.append(i4);
        sbLIZ.append(", leaveOrFinishReason = ");
        sbLIZ.append(j);
        C20441214yg.LJIIIZ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ));
        if (abstractC981980bf2.LJI) {
            C20441214yg.LJ("CompetitionStatePlayingBase", "already in isSettleFinishing true state");
            return;
        }
        long j2 = abstractC981980bf2.LJJIII().LJIIIZ;
        C974540bT2 c974540bT2 = C974540bT2.LIZ;
        int iLJJIJIIJI = C974540bT2.LJJIJIIJI(i, 0L, abstractC981980bf2.LIZ.getRoomInfo());
        C974540bT2.LJJIJIIJIL(iLJJIJIIJI, j);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("competitionId = ");
        sbLIZ2.append(j2);
        C20441214yg.LJ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ2));
        if (abstractC981980bf2.LJJIII().LJJ == j2 && j2 != 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("requestSettlementEndApi");
            sbLIZ3.append(", already finished, same competitionId = ");
            sbLIZ3.append(j2);
            C20441214yg.LJ("CompetitionStatePlayingBase", C2188811AlT.LIZIZ(sbLIZ3));
            abstractC981980bf2.LJI = false;
            return;
        }
        abstractC981980bf2.LJI = true;
        abstractC981980bf2.LJJIII().getClass();
        long jLIZ = C981480beE.LIZ();
        if (interfaceC983270bh7 == null) {
            return;
        }
        interfaceC983270bh7.LJJIIJZLJL(j2, jLIZ, 0L, iLJJIJIIJI, new C982230bfR(abstractC981980bf2, j2, i, j), new C982370bff(abstractC981980bf2, i4, interfaceC983270bh7));
    }
}
