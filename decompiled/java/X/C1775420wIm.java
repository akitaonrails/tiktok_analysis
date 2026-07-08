package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import java.util.Map;

/* JADX INFO: renamed from: X.0wIm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1775420wIm implements InterfaceC1775480wIs, InterfaceC1775470wIr {
    public final AbstractC1775370wIh LIZ;

    @Override // X.InterfaceC1775480wIs
    public final C1768420w7U LIZ() {
        AbstractC1775370wIh abstractC1775370wIh = this.LIZ;
        if (abstractC1775370wIh != null) {
            return abstractC1775370wIh.LIZ();
        }
        return null;
    }

    @Override // X.InterfaceC1775470wIr
    public final void LIZIZ(String str) {
        AbstractC1775370wIh abstractC1775370wIh = this.LIZ;
        if (abstractC1775370wIh != null) {
            abstractC1775370wIh.LIZIZ(str);
        }
    }

    @Override // X.InterfaceC1775470wIr
    public final void LIZLLL(Boolean bool) {
        AbstractC1775370wIh abstractC1775370wIh = this.LIZ;
        if (abstractC1775370wIh != null) {
            abstractC1775370wIh.LIZLLL(bool);
        }
    }

    public C1775420wIm(final ViewGroup viewGroup, final C21341418fU c21341418fU) {
        if (viewGroup instanceof LynxView) {
            final LynxView lynxView = (LynxView) viewGroup;
            ViewParent parent = lynxView.getParent();
            if ((parent instanceof C1773610wFr) && parent != null) {
                this.LIZ = new AbstractC1775370wIh(lynxView, c21341418fU) { // from class: X.0wIi
                    public final InterfaceC1775440wIo LJII;
                    public C1768420w7U LJIIIIZZ;

                    @Override // X.InterfaceC1775480wIs
                    public final C1768420w7U LIZ() {
                        ECMixMallItemInfoDTO eCMixMallItemInfoDTO;
                        Map<String, Object> map;
                        if (this.LJIIIIZZ == null) {
                            C1773330wFP c1773330wFPLJIIIIZZ = LJIIIIZZ();
                            this.LJIIIIZZ = (c1773330wFPLJIIIIZZ == null || (eCMixMallItemInfoDTO = c1773330wFPLJIIIIZZ.LJIIIZ) == null || (map = eCMixMallItemInfoDTO.config) == null) ? null : C1768550w7h.LIZIZ(map);
                        }
                        return this.LJIIIIZZ;
                    }

                    @Override // X.AbstractC1775370wIh
                    public final C1775180wIO LJII() {
                        C1775190wIP c1775190wIP;
                        C1773330wFP c1773330wFPLJIIIIZZ = LJIIIIZZ();
                        if (c1773330wFPLJIIIIZZ == null || (c1775190wIP = c1773330wFPLJIIIIZZ.LJII) == null) {
                            return null;
                        }
                        return c1775190wIP.LIZIZ;
                    }

                    public final C1773330wFP LJIIIIZZ() {
                        C1773610wFr<?> c1773610wFrLJFF = LJFF();
                        Object data = c1773610wFrLJFF != null ? c1773610wFrLJFF.getData() : null;
                        if (data instanceof C1773330wFP) {
                            return (C1773330wFP) data;
                        }
                        return null;
                    }

                    @Override // X.AbstractC1775370wIh
                    public final InterfaceC1775440wIo LJI() {
                        return this.LJII;
                    }

                    @Override // X.InterfaceC1775470wIr
                    public final void LIZIZ(String str) {
                        InterfaceC1773850wGF interfaceC1773850wGF = this.LIZIZ;
                        if (interfaceC1773850wGF != null) {
                            interfaceC1773850wGF.LJIIJ(str, LJIIIIZZ(), 0, new C1774840wHq(null, 7), null);
                        }
                    }

                    {
                        this.LJII = c21341418fU;
                    }
                };
                return;
            }
            return;
        }
        this.LIZ = new AbstractC1775370wIh(viewGroup, c21341418fU) { // from class: X.0wIj
            public final InterfaceC1775440wIo LJII;
            public final C1773340wFQ LJIIIIZZ;
            public final C1768420w7U LJIIIZ;

            @Override // X.AbstractC1775370wIh
            public final C1775180wIO LJII() {
                C1775190wIP c1775190wIP;
                C1773340wFQ c1773340wFQ = this.LJIIIIZZ;
                if (c1773340wFQ == null || (c1775190wIP = c1773340wFQ.LJII) == null) {
                    return null;
                }
                return c1775190wIP.LIZIZ;
            }

            @Override // X.InterfaceC1775480wIs
            public final C1768420w7U LIZ() {
                return this.LJIIIZ;
            }

            @Override // X.AbstractC1775370wIh
            public final InterfaceC1775440wIo LJI() {
                return this.LJII;
            }

            @Override // X.InterfaceC1775470wIr
            public final void LIZIZ(String str) {
                InterfaceC1773850wGF interfaceC1773850wGF = this.LIZIZ;
                if (interfaceC1773850wGF != null) {
                    interfaceC1773850wGF.LJIIJ(str, this.LJIIIIZZ, 0, new C1774840wHq(null, 7), null);
                }
            }

            {
                Object data;
                ECMixMallItemInfoDTO eCMixMallItemInfoDTO;
                Map<String, Object> map;
                this.LJII = c21341418fU;
                C1773610wFr<?> c1773610wFrLJFF = LJFF();
                if (c1773610wFrLJFF != null) {
                    data = c1773610wFrLJFF.getData();
                } else {
                    data = null;
                }
                C1773340wFQ c1773340wFQ = data instanceof C1773340wFQ ? (C1773340wFQ) data : null;
                this.LJIIIIZZ = c1773340wFQ;
                if (c1773340wFQ != null && (eCMixMallItemInfoDTO = c1773340wFQ.LJIIIZ) != null && (map = eCMixMallItemInfoDTO.config) != null) {
                    this.LJIIIZ = C1768550w7h.LIZIZ(map);
                }
            }
        };
    }

    @Override // X.InterfaceC1775470wIr
    public final void LJ(Integer num, String str, String str2) {
        AbstractC1775370wIh abstractC1775370wIh = this.LIZ;
        if (abstractC1775370wIh != null) {
            abstractC1775370wIh.LJ(num, str, str2);
        }
    }
}
