package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U1H, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U1H extends C0U1J<C0U22> {
    public final int LJIIIZ;
    public C0U1L LJIIJ;

    @Override // X.C0U1J
    public final C0U1L LIZJ() {
        C0U1L c0u1l = this.LJIIJ;
        if (c0u1l == null) {
            c0u1l = new C0U1L();
            this.LJIIJ = c0u1l;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("KaraokeSongListManager.getPlayer, getAudioFilterManager:");
            sbLIZ.append(LIZIZ());
            C20441214yg.LIZIZ("legolas_play", C2188811AlT.LIZIZ(sbLIZ));
        }
        c0u1l.LIZJ(LIZIZ());
        return c0u1l;
    }

    @Override // X.C0U1J
    public final AbstractC765580U1k LIZLLL() {
        InterfaceC769940UIe interfaceC769940UIe;
        if (!C763810Txj.LIZ(Integer.valueOf(this.LJIIIZ)) || (interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class)) == null) {
            return null;
        }
        return interfaceC769940UIe.LJII();
    }

    public final C0U22 LJIIJJI() {
        try {
            return (C0U22) C13LP.LJJJLL(this.LIZ);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LJIIL() {
        C20441214yg.LIZIZ("KaraokeSongListManager", "onPause");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPlaying: ");
        sbLIZ.append(this.LJ);
        C20441214yg.LIZIZ("KaraokeSongListManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJ) {
            LIZJ().LIZ();
        }
        this.LJFF = true;
        this.LJ = false;
    }

    @Override // X.C0U1J
    public final void LJ(C0U23 c0u23) {
        String strValueOf;
        C0U22 c0u22 = (C0U22) c0u23;
        boolean zLIZ = C763810Txj.LIZ(Integer.valueOf(this.LJIIIZ));
        boolean zBooleanValue = ((Boolean) C764820TzM.LIZ(this.LJIIIZ).LIZIZ()).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resume: ");
        sbLIZ.append(c0u22.LIZJ);
        C20441214yg.LIZIZ("karaokeLog", C2188811AlT.LIZIZ(sbLIZ));
        C0U1G.LIZ = c0u22;
        C0U1G.LIZIZ = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        if (C0U1G.LIZJ == null) {
            if (Intrinsics.LJFF(C0U1G.LJFF, Long.valueOf(c0u22.LIZ))) {
                strValueOf = C0U1G.LJ;
            } else {
                C0U1G.LJFF = Long.valueOf(c0u22.LIZ);
                strValueOf = String.valueOf(System.currentTimeMillis());
            }
            C0U1G.LIZJ = strValueOf;
        }
        C0U1G.LIZLLL = 2L;
        C0U1G.LIZLLL(-1L, -1L, zLIZ, zBooleanValue);
    }

    @Override // X.C0U1J
    public final void LJFF(AbstractC765580U1k abstractC765580U1k) {
        boolean zBooleanValue;
        super.LJFF(abstractC765580U1k);
        abstractC765580U1k.LLJJIJIL(C765700U1w.LIZIZ(C765700U1w.LJ(Integer.valueOf(this.LJIIIZ))));
        abstractC765580U1k.LLJILJIL(C765700U1w.LIZ(C765700U1w.LIZLLL(Integer.valueOf(this.LJIIIZ))));
        if (C763810Txj.LIZ(Integer.valueOf(this.LJIIIZ))) {
            zBooleanValue = InterfaceC766480U4w.LJJLIIIJJIZ.LIZIZ().booleanValue();
        } else {
            zBooleanValue = InterfaceC766480U4w.LJJLIL.LIZIZ().booleanValue();
        }
        abstractC765580U1k.LLJJIII(zBooleanValue);
        abstractC765580U1k.LLJJJIL(0.0d);
    }

    @Override // X.C0U1J
    public final void LJI(C0U23 c0u23) {
        C0U22 c0u22 = (C0U22) c0u23;
        boolean zLIZ = C763810Txj.LIZ(Integer.valueOf(this.LJIIIZ));
        boolean zBooleanValue = ((Boolean) C764820TzM.LIZ(this.LJIIIZ).LIZIZ()).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start: ");
        sbLIZ.append(c0u22.LIZJ);
        C20441214yg.LIZIZ("karaokeLog", C2188811AlT.LIZIZ(sbLIZ));
        C0U1G.LIZ = c0u22;
        C0U1G.LIZIZ = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        C0U1G.LIZJ = strValueOf;
        C0U1G.LJ = strValueOf;
        C0U1G.LJFF = Long.valueOf(c0u22.LIZ);
        C0U1G.LIZLLL = 1L;
        C0U1G.LIZLLL(-1L, -1L, zLIZ, zBooleanValue);
    }

    public C0U1H(int i, List<C0U22> list) {
        super(new CopyOnWriteArrayList(list));
        this.LJIIIZ = i;
    }

    @Override // X.C0U1J
    public final boolean LJII(int i, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPlaying: ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isPaused: ");
        sbLIZ.append(this.LJFF);
        C20441214yg.LIZIZ("KaraokeSongListManager", C2188811AlT.LIZIZ(sbLIZ));
        return super.LJII(i, z);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LJIILIIL(List<C0U22> list, Function1<? super AbstractC764660Tz6, Unit> function1) {
        String str;
        C0U1L c0u1l;
        AbstractC765580U1k abstractC765580U1k;
        AbstractC765580U1k abstractC765580U1k2;
        C0U22 c0u22LJIIJJI = LJIIJJI();
        this.LIZ.clear();
        this.LIZ.addAll(list);
        C0U22 c0u22LJIIJJI2 = LJIIJJI();
        if (!Intrinsics.LJFF(c0u22LJIIJJI2, c0u22LJIIJJI)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Auto Play CurSong: ");
            if (c0u22LJIIJJI2 != null) {
                str = c0u22LJIIJJI2.LIZJ;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            sbLIZ.append(", notifier: ");
            sbLIZ.append(true);
            C20441214yg.LIZIZ("KaraokeSongListManager", C2188811AlT.LIZIZ(sbLIZ));
            if (c0u22LJIIJJI2 == null) {
                function1.invoke(C765090Tzn.LIZ);
                LJIIJ();
                return;
            }
            if (c0u22LJIIJJI == null && (abstractC765580U1k2 = this.LIZJ) != null) {
                LJFF(abstractC765580U1k2);
            }
            this.LIZLLL = false;
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppForeground()) {
                LJII(0, true);
            } else {
                C0U22 c0u22LJIIJJI3 = LJIIJJI();
                if (c0u22LJIIJJI3 != null && (c0u1l = this.LJIIJ) != null && (abstractC765580U1k = c0u1l.LIZ) != null) {
                    if (!abstractC765580U1k.LL) {
                        abstractC765580U1k.setEnable(true);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ori: ");
                    sbLIZ2.append(C0U23.LIZ(c0u22LJIIJJI3.LIZIZ.LIZIZ()));
                    C20441214yg.LIZIZ("KaraokePlayer", C2188811AlT.LIZIZ(sbLIZ2));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("inst: ");
                    sbLIZ3.append(C0U23.LIZ(c0u22LJIIJJI3.LJIIIIZZ.LIZIZ()));
                    C20441214yg.LIZIZ("KaraokePlayer", C2188811AlT.LIZIZ(sbLIZ3));
                    abstractC765580U1k.LLJI(C0U23.LIZ(c0u22LJIIJJI3.LJIIIIZZ.LIZIZ()), C0U23.LIZ(c0u22LJIIJJI3.LIZIZ.LIZIZ()));
                }
                LJIIJ();
            }
            function1.invoke(new C764060Ty8(c0u22LJIIJJI2, true));
        }
    }
}
