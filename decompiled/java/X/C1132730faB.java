package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0faB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132730faB implements InterfaceC1132740faC {
    public final InterfaceC1132530fZr LIZ;
    public C1135290feJ LIZIZ;
    public C1132270fZR LIZJ;
    public C1132260fZQ LIZLLL;
    public final List<InterfaceC1132740faC> LJ = new ArrayList();

    @Override // X.InterfaceC1132740faC
    public final void LIZ() {
        Iterator<InterfaceC1132740faC> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    public final void LIZJ() {
        DataChannel dataChannelO3;
        C1135290feJ c1135290feJ = this.LIZIZ;
        if (c1135290feJ != null) {
            InterfaceC1132530fZr interfaceC1132530fZr = c1135290feJ.LIZ;
            if (interfaceC1132530fZr != null && (dataChannelO3 = interfaceC1132530fZr.o3()) != null) {
                dataChannelO3.zQ2(c1135290feJ);
            }
            C1135300feK c1135300feK = c1135290feJ.LJFF;
            c1135300feK.LJFF = true;
            c1135300feK.LJIIIIZZ = false;
            c1135300feK.LIZLLL.removeCallbacks(c1135300feK.LJIIIZ);
            c1135300feK.LIZLLL.removeCallbacks(c1135300feK.LJIIJ);
            c1135300feK.LIZIZ("clear");
            C1135590fen c1135590fen = c1135290feJ.LJI;
            if (c1135590fen != null && c1135590fen.LIZJ != null) {
                C20441214yg.LJIIIZ("GiftEffectPreDownloadManager", "destroy");
                c1135590fen.LJFF = false;
                c1135590fen.LJFF(new AwS561S0100000_17(c1135590fen, 608));
                c1135590fen.LIZLLL = null;
                c1135590fen.LIZJ = null;
            }
            C1136200ffm c1136200ffm = c1135290feJ.LJ;
            c1136200ffm.LIZ.LIZ.clear();
            c1136200ffm.LIZIZ.LIZ.clear();
            c1135290feJ.LIZLLL = true;
        }
        ((ArrayList) this.LJ).clear();
    }

    public C1132730faB(InterfaceC1132530fZr interfaceC1132530fZr) {
        this.LIZ = interfaceC1132530fZr;
    }

    @Override // X.InterfaceC1132740faC
    public final void LIZIZ(boolean z) {
        Iterator<InterfaceC1132740faC> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(z);
        }
    }

    @Override // X.InterfaceC1132740faC
    public final void LIZLLL(boolean z) {
        Iterator<InterfaceC1132740faC> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL(z);
        }
    }
}
