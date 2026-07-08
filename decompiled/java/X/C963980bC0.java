package X;

/* JADX INFO: renamed from: X.0bC0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963980bC0 implements InterfaceC964060bC8 {
    public final InterfaceC963690bBX LIZ;

    @Override // X.InterfaceC964060bC8
    public final C963990bC1 build() {
        long j;
        C964020bC4 c964020bC4 = this.LIZ.get();
        if (c964020bC4 == null) {
            C20441214yg.LJ("TeamPairBattleRejectRequestBuilder", "Cached battle information is null");
        }
        long j2 = 0;
        if (c964020bC4 != null) {
            j = c964020bC4.LIZIZ;
            j2 = c964020bC4.LIZ;
        } else {
            j = 0;
        }
        int i = c964020bC4 != null ? c964020bC4.LIZJ : 0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("channelId: ");
        sbLIZ.append(j);
        sbLIZ.append(", battleId: ");
        sbLIZ.append(j2);
        sbLIZ.append(", inviteType: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("TeamPairBattleRejectRequestBuilder", C2188811AlT.LIZIZ(sbLIZ));
        return new C963990bC1(j, j2, i);
    }

    public C963980bC0(InterfaceC963690bBX interfaceC963690bBX) {
        this.LIZ = interfaceC963690bBX;
    }
}
