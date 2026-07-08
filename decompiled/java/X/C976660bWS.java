package X;

import Y.ARunnableS115S0100000_15;
import android.os.Looper;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostLayoutExtra;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS559S0100000_15;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.MultiGuestLayoutNonSeiExtra;

/* JADX INFO: renamed from: X.0bWS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976660bWS extends AbstractC983420bhM {
    public boolean LLILZIL;

    @Override // X.AbstractC983420bhM
    public final String LJIIJ() {
        return "CatchBeansWindowComponent";
    }

    @Override // X.AbstractC983420bhM
    public final void LJIILIIL() {
        super.LJIILIIL();
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        C786410Ut5.LJLIIL((c981480beEM91 == null || !c981480beEM91.LJJIIJZLJL) ? 0L : 500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS115S0100000_15(this, 25));
    }

    @Override // X.AbstractC983420bhM, X.InterfaceC977430bXh
    public final void onUnload() {
        super.onUnload();
        LJIILLIIL(false);
    }

    @InterfaceC1294060jmO
    public final void LJIILLIIL(boolean z) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateContainerOffsetY, moveDown = ");
        sbLIZ.append(z);
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LL) {
            return;
        }
        if (z) {
            if (!this.LLILZIL) {
                this.LLILZIL = true;
                LJIIJJI("updateContainerOffsetY down to 40");
                if (C963580bBM.LIZ()) {
                    C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
                    if (c955010axXI30 != null) {
                        c955010axXI30.LJJI(new AbstractC957950b2H() { // from class: X.0b2C
                            @Override // X.AbstractC957950b2H
                            public final C955270axx LIZ(List<Long> list) {
                                Pair pairLJ = C957830b25.LJ();
                                List listLJFF = C957830b25.LJFF();
                                String str = (String) pairLJ.getSecond();
                                String str2 = (String) pairLJ.getFirst();
                                CohostLayoutExtra cohostLayoutExtra = new CohostLayoutExtra();
                                cohostLayoutExtra.offsetY = 40;
                                cohostLayoutExtra.isZoomLayout = 0;
                                cohostLayoutExtra.scene = 12;
                                return new C955270axx(new C955320ay2(str, str2, (MultiGuestLayoutExtra) null, C957830b25.LIZ(cohostLayoutExtra), (MultiGuestLayoutNonSeiExtra) null, 48), listLJFF, C957830b25.LJIIJ(listLJFF));
                            }
                        });
                    }
                } else {
                    InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
                    if (interfaceC954180awCLJIIIZ != null && (interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLJIIIZ.LLIIJLIL()) != null) {
                        interfaceC937900aVwLLIIJLIL2.LJLLLLLL(40.0f, 1, true);
                    }
                }
                C954660awy.LJIIIZ = "";
                return;
            }
            return;
        }
        if (!this.LLILZIL) {
            return;
        }
        this.LLILZIL = false;
        LJIIJJI("updateContainerOffsetY set to 0");
        if (C963580bBM.LIZ()) {
            C955010axX c955010axXI302 = C915980Zwa.LJII().i30();
            if (c955010axXI302 == null) {
                return;
            }
            c955010axXI302.LJJI(new AbstractC957950b2H() { // from class: X.0b2B
                @Override // X.AbstractC957950b2H
                public final C955270axx LIZ(List<Long> list) {
                    Pair pairLJ = C957830b25.LJ();
                    List listLJFF = C957830b25.LJFF();
                    String str = (String) pairLJ.getSecond();
                    String str2 = (String) pairLJ.getFirst();
                    CohostLayoutExtra cohostLayoutExtra = new CohostLayoutExtra();
                    cohostLayoutExtra.offsetY = 0;
                    cohostLayoutExtra.isZoomLayout = 0;
                    cohostLayoutExtra.scene = 13;
                    return new C955270axx(new C955320ay2(str, str2, (MultiGuestLayoutExtra) null, C957830b25.LIZ(cohostLayoutExtra), (MultiGuestLayoutNonSeiExtra) null, 48), listLJFF, C957830b25.LJIIJ(listLJFF));
                }
            });
            return;
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ2 == null || (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ2.LLIIJLIL()) == null) {
            return;
        }
        interfaceC937900aVwLLIIJLIL.LJLLLLLL(0.0f, 0, true);
    }

    @Override // X.AbstractC983420bhM, X.InterfaceC977410bXf
    public final void LJ(EnumC974260bSa enumC974260bSa, C981480beE c981480beE) {
        long jLongValue;
        super.LJ(enumC974260bSa, c981480beE);
        if (enumC974260bSa.compareTo(EnumC974260bSa.FINISH) >= 0) {
            Long lLJIIJ = C930540aK4.LJIIJ();
            if (lLJIIJ != null) {
                jLongValue = lLJIIJ.longValue();
            } else {
                jLongValue = 0;
            }
            C915120ZvC.LIZIZ(jLongValue, this.LL, 7, null, null, 24);
            LJIILLIIL(false);
        }
    }

    public C976660bWS(boolean z, DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15, List list) {
        super(z, dataChannel, awS559S0100000_15, list);
    }
}
