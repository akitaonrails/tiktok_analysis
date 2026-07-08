package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveFYPDestroyOptSettings;
import com.bytedance.android.livesdk.sei.SeiAppData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0bK8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969020bK8 implements InterfaceC969450bKp {
    public final /* synthetic */ C1AXM LL;

    @Override // X.InterfaceC958970b3v
    public final boolean LJJJIL() {
        return true;
    }

    @Override // X.InterfaceC958970b3v
    public final void LLIIIL(Map map) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJJJ() {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLJ(LinkUser linkUser) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LJJJI() {
        Iterator<InterfaceC958970b3v> it2 = this.LL.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJJI();
        }
    }

    public C969020bK8(C1AXM c1axm) {
        this.LL = c1axm;
    }

    @Override // X.InterfaceC958970b3v
    public final void LJJIJL(C2180891AWx c2180891AWx) {
        Iterator<InterfaceC958970b3v> it2 = this.LL.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJJIJL(c2180891AWx);
        }
    }

    @Override // X.InterfaceC969450bKp
    public final void LJJLIIIJLLLLLLLZ(List<? extends InterfaceC937840aVq> list) {
        C1AXM c1axm = this.LL;
        Iterator<InterfaceC958970b3v> it2 = c1axm.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(c1axm.LL.LIZIZ, list);
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
        View view = this.LL.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            this.LL.LJJII(view, interfaceC937820aVo);
        }
        Iterator<InterfaceC958970b3v> it2 = this.LL.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LLLLL(interfaceC937820aVo);
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LIZJ(int i, List list) {
        Iterator<InterfaceC958970b3v> it2 = this.LL.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(i, list);
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
        Boolean boolValueOf;
        Map<Integer, Integer> mapLIZIZ;
        if (!MultiLiveFYPDestroyOptSettings.INSTANCE.isEnable()) {
            String strLLIIII = this.LL.LLIIII(570);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL.LJLLL());
            sbLIZ.append(":onLayoutSwitch layoutId = ");
            sbLIZ.append(interfaceC937820aVo.getLayoutId());
            sbLIZ.append(" layout'all are = ");
            sbLIZ.append(interfaceC937820aVo.getContainerAllRange());
            sbLIZ.append(" realArea = ");
            sbLIZ.append(interfaceC937820aVo.getContainerActualRange());
            sbLIZ.append(" playerArea = ");
            sbLIZ.append(interfaceC937820aVo.getPlayerRange());
            C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        }
        C1AXM c1axm = this.LL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LL.LLILLJJLI);
        sbLIZ2.append("#onLayoutSwitch#1");
        c1axm.LLFZ(710, C2188811AlT.LIZIZ(sbLIZ2));
        Layout layoutLIZJ = this.LL.LJJLIIJ().LIZJ(false);
        if (layoutLIZJ != null) {
            C1AXM c1axm2 = this.LL;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c1axm2.LLILLJJLI);
            sbLIZ3.append("#onLayoutSwitch#2");
            c1axm2.LLFZ(720, C2188811AlT.LIZIZ(sbLIZ3));
            String strLLIIII2 = c1axm2.LLIIII(572);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(c1axm2.LJLLL());
            sbLIZ4.append(":onLayoutSwitch scene = ");
            sbLIZ4.append(layoutLIZJ.scene);
            sbLIZ4.append(" micCount = ");
            sbLIZ4.append(layoutLIZJ.micCount);
            C1AZW.LJIIJ(12, strLLIIII2, C2188811AlT.LIZIZ(sbLIZ4), null, null);
            C20337914i1<Map<Integer, Integer>> c20337914i1 = InterfaceC1104970erP.H2;
            if (c20337914i1 != null && (mapLIZIZ = c20337914i1.LIZIZ()) != null) {
                mapLIZIZ.put(Integer.valueOf(layoutLIZJ.scene), Integer.valueOf(layoutLIZJ.micCount));
            }
            C965220bE0 c965220bE0 = c1axm2.LL.LJIIJ;
            if (c965220bE0 != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("tryReportIdentifyResult success:");
                sbLIZ5.append(true);
                sbLIZ5.append(" reason:");
                sbLIZ5.append("");
                sbLIZ5.append(" isDisposed:");
                C11JF c11jf = c965220bE0.LLILLL;
                if (c11jf != null) {
                    boolValueOf = Boolean.valueOf(c11jf.isDisposed());
                } else {
                    boolValueOf = null;
                }
                sbLIZ5.append(boolValueOf);
                C20441214yg.LIZIZ("layout_identify", C2188811AlT.LIZIZ(sbLIZ5));
                C11JF c11jf2 = c965220bE0.LLILLL;
                if (c11jf2 != null && !c11jf2.isDisposed()) {
                    C11JF c11jf3 = c965220bE0.LLILLL;
                    if (c11jf3 != null) {
                        c11jf3.dispose();
                    }
                    c965220bE0.LLILLL = null;
                    long jCurrentTimeMillis = 0;
                    if (c965220bE0.LLILZ != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - c965220bE0.LLILZ;
                    }
                    c965220bE0.LJ((int) jCurrentTimeMillis, "", true);
                }
            }
        }
        Iterator it2 = ((ArrayList) this.LL.LLLLIIL).iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        ((ArrayList) this.LL.LLLLIIL).clear();
        Iterator<InterfaceC958970b3v> it3 = this.LL.LLJJIJIIJIL.iterator();
        while (it3.hasNext()) {
            it3.next().LLIILII(interfaceC937820aVo, i);
        }
        this.LL.LL.LJFF.LJJJIL();
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJLLL(List list, boolean z) {
        Iterator<InterfaceC958970b3v> it2 = this.LL.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LLJLLL(list, z);
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
        View view = this.LL.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            this.LL.LJJII(view, c2180891AWx);
        }
        Iterator<InterfaceC958970b3v> it2 = this.LL.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LLLIIIIL(c2180891AWx, i);
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
        boolean z;
        String strLLIIII = this.LL.LLIIII(606);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LJLLL());
        sbLIZ.append(":onWindowStateChanged window.pos = ");
        sbLIZ.append(interfaceC937840aVq.LJIIIIZZ());
        sbLIZ.append(" ,oldState = ");
        sbLIZ.append(enumC918810a19);
        sbLIZ.append(", newState = ");
        sbLIZ.append(enumC918810a192);
        sbLIZ.append(" container = ");
        sbLIZ.append(interfaceC937840aVq.LJJIIJ().hashCode());
        sbLIZ.append(" abs = ");
        sbLIZ.append(interfaceC937840aVq.LJIIL());
        sbLIZ.append(", window.linkmicId: ");
        sbLIZ.append(interfaceC937840aVq.LJ());
        sbLIZ.append(", window.windowContentType: ");
        if (this.LL.LL.LIZIZ == 4) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(interfaceC937840aVq.LIZIZ(z));
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        Iterator<InterfaceC958970b3v> it2 = this.LL.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIILL(interfaceC937840aVq, enumC918810a19, enumC918810a192, c938510aWv);
        }
    }
}
