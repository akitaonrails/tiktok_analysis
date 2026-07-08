package X;

/* JADX INFO: renamed from: X.0U1L, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U1L {
    public AbstractC765580U1k LIZ;

    public final void LIZ() {
        C20441214yg.LIZIZ("KaraokePlayer#onPause", String.valueOf(this.LIZ));
        AbstractC765580U1k abstractC765580U1k = this.LIZ;
        if (abstractC765580U1k != null) {
            abstractC765580U1k.pause();
        }
    }

    public final void LIZIZ() {
        AbstractC765580U1k abstractC765580U1k = this.LIZ;
        if (abstractC765580U1k != null) {
            abstractC765580U1k.resume();
        }
    }

    public final void LIZJ(AbstractC765580U1k abstractC765580U1k) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("KaraokePlayerWrapper.setAudioFilterManager, manager:");
        sbLIZ.append(abstractC765580U1k);
        C20441214yg.LIZIZ("legolas_play", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ = abstractC765580U1k;
    }

    public final void LIZLLL(C0U23 c0u23) {
        int i = C771340UNo.LIZ;
        C771340UNo.LJFF("karaoke", String.valueOf(c0u23.LIZ));
        if (c0u23 instanceof C0U22) {
            C0U22 c0u22 = (C0U22) c0u23;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("KaraokePlayerWrapper.startPlay, audioFilterMgr:");
            sbLIZ.append(this.LIZ);
            C20441214yg.LIZIZ("legolas_play", C2188811AlT.LIZIZ(sbLIZ));
            AbstractC765580U1k abstractC765580U1k = this.LIZ;
            if (abstractC765580U1k != null) {
                if (!abstractC765580U1k.LL) {
                    abstractC765580U1k.setEnable(true);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ori: ");
                sbLIZ2.append(C0U23.LIZ(c0u22.LIZIZ.LIZIZ()));
                C20441214yg.LIZIZ("KaraokePlayer", C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("inst: ");
                sbLIZ3.append(C0U23.LIZ(c0u22.LJIIIIZZ.LIZIZ()));
                C20441214yg.LIZIZ("KaraokePlayer", C2188811AlT.LIZIZ(sbLIZ3));
                abstractC765580U1k.LLJI(C0U23.LIZ(c0u22.LJIIIIZZ.LIZIZ()), C0U23.LIZ(c0u22.LIZIZ.LIZIZ()));
                abstractC765580U1k.resume();
                return;
            }
            return;
        }
        AbstractC765580U1k abstractC765580U1k2 = this.LIZ;
        if (abstractC765580U1k2 == null) {
            return;
        }
        abstractC765580U1k2.LLJ(C0U23.LIZ(c0u23.LIZIZ.LIZIZ()));
        abstractC765580U1k2.resume();
    }
}
