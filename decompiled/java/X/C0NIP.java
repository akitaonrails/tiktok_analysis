package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.IBaseListFragmentPanel;

/* JADX INFO: renamed from: X.0NIP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NIP implements C1ARK {
    public InterfaceC739770T0d LL;

    public final InterfaceC739770T0d LIZ() {
        InterfaceC739770T0d interfaceC739770T0d = this.LL;
        if (interfaceC739770T0d != null) {
            return interfaceC739770T0d;
        }
        return null;
    }

    public final boolean LJ() {
        return this.LL != null;
    }

    @Override // X.InterfaceC2179331AQx
    public final C0NIR LJIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1ARK
    public final long LIZIZ() {
        return LIZ().getPlayerManager().getCurrentPosition();
    }

    @Override // X.C1ARK
    public final C1ANF LIZJ() {
        switch (LIZ().getPlayerManager().LJIILL().getPlayState().getState()) {
            case 0:
                return C1ANF.PLAYBACK_STATE_PAUSED;
            case 1:
                return C1ANF.PLAYBACK_STATE_START;
            case 2:
                return C1ANF.PLAYBACK_STATE_START;
            case 3:
                return C1ANF.PLAYBACK_STATE_START;
            case 4:
                return C1ANF.PLAYBACK_STATE_PLAYING;
            case 5:
                return C1ANF.PLAYBACK_STATE_PAUSED;
            case 6:
                return C1ANF.PLAYBACK_STATE_PAUSED;
            case 7:
                return C1ANF.PLAYBACK_STATE_STOPPED;
            default:
                return C1ANF.PLAYBACK_STATE_ERROR;
        }
    }

    public final boolean LJFF() {
        if (LJ()) {
            return LIZJ() == C1ANF.PLAYBACK_STATE_PLAYING || LIZJ() == C1ANF.PLAYBACK_STATE_START;
        }
        return false;
    }

    public final void LJI() {
        if (LJ()) {
            Aweme awemeLLILLIZIL = LIZ().LLILLIZIL();
            IBaseListFragmentPanel iBaseListFragmentPanelLJJLIIIJJIZ = LIZ().LJJLIIIJJIZ();
            C587810N3r.LIZLLL(awemeLLILLIZIL, iBaseListFragmentPanelLJJLIIIJJIZ != null ? iBaseListFragmentPanelLJJLIIIJJIZ.C7(true) : null);
        }
    }

    @Override // X.C1ARK
    public final long getDuration() {
        return LIZ().te();
    }

    @Override // X.C1ARK
    public final void LIZLLL(C0NIR c0nir) {
        if (LJ() && LIZ() != null && LIZ().getPlayerManager() != null) {
            LIZ().getPlayerManager().LJJL();
            LJI();
        }
    }

    @Override // X.C1ARK
    public final void LJII(C0NIR c0nir) {
        String strC7;
        if (LJ()) {
            Aweme awemeLLILLIZIL = LIZ().LLILLIZIL();
            IBaseListFragmentPanel iBaseListFragmentPanelLJJLIIIJJIZ = LIZ().LJJLIIIJJIZ();
            if (iBaseListFragmentPanelLJJLIIIJJIZ != null) {
                strC7 = iBaseListFragmentPanelLJJLIIIJJIZ.C7(true);
            } else {
                strC7 = null;
            }
            C587810N3r.LJFF = Long.valueOf(System.currentTimeMillis());
            C587810N3r.LJ = 0L;
            if (awemeLLILLIZIL != null && strC7 != null) {
                C587810N3r.LJ(awemeLLILLIZIL, strC7, "click_audio_play", null);
            }
            if (C2214201BlK.LJIIJJI && !C20692815yA.LIZJ()) {
                C587810N3r.LIZJ = true;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0NIM(this, null), 3);
        }
    }

    @Override // X.C1ARK
    public final void LJIIIIZZ(C0NIR c0nir) {
        String str;
        String strC7;
        if (LJ()) {
            if (c0nir != null && (str = c0nir.LIZ) != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != 270608360) {
                    if (iHashCode != 1553123424) {
                        if (iHashCode == 1836520147) {
                            str.equals("PAUSE_FROM_LOSS_FOCUS_TRANSIENT");
                        }
                    } else if (str.equals("PAUSE_FROM_NOTIFICATION_CLICK")) {
                        Aweme awemeLLILLIZIL = LIZ().LLILLIZIL();
                        IBaseListFragmentPanel iBaseListFragmentPanelLJJLIIIJJIZ = LIZ().LJJLIIIJJIZ();
                        if (iBaseListFragmentPanelLJJLIIIJJIZ != null) {
                            strC7 = iBaseListFragmentPanelLJJLIIIJJIZ.C7(true);
                        } else {
                            strC7 = null;
                        }
                        if (awemeLLILLIZIL != null && strC7 != null) {
                            C587810N3r.LJ(awemeLLILLIZIL, strC7, "click_audio_pause", null);
                        }
                        LJI();
                    }
                } else if (str.equals("PAUSE_FROM_LOSS_FOCUS")) {
                    LJI();
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0NIN(this, null), 3);
        }
    }

    @Override // X.C1ARK
    public final void LJIIJ(C0NIR c0nir) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0NIO(this, null), 3);
    }

    @Override // X.C1ARK
    public final void LJIILL(C2179231AQn c2179231AQn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Not yet implemented");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1ARK
    public final void LJJ(long j, InterfaceC2178281AMw interfaceC2178281AMw) {
        String strC7;
        if (LJ()) {
            LIZ().getPlayerManager().seek((j / getDuration()) * 100);
            Aweme awemeLLILLIZIL = LIZ().LLILLIZIL();
            IBaseListFragmentPanel iBaseListFragmentPanelLJJLIIIJJIZ = LIZ().LJJLIIIJJIZ();
            if (iBaseListFragmentPanelLJJLIIIJJIZ != null) {
                strC7 = iBaseListFragmentPanelLJJLIIIJJIZ.C7(true);
            } else {
                strC7 = null;
            }
            if (awemeLLILLIZIL != null && strC7 != null) {
                C587810N3r.LJ(awemeLLILLIZIL, strC7, "click_progress_bar", null);
            }
        }
    }
}
