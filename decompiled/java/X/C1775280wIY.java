package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import java.util.Map;

/* JADX INFO: renamed from: X.0wIY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1775280wIY implements InterfaceC1775490wIt, InterfaceC1775470wIr {
    public final AbstractC1775220wIS LIZ;

    @Override // X.InterfaceC1775480wIs
    public final C1768420w7U LIZ() {
        AbstractC1775220wIS abstractC1775220wIS = this.LIZ;
        if (abstractC1775220wIS != null) {
            return abstractC1775220wIS.LIZ();
        }
        return null;
    }

    @Override // X.InterfaceC1775490wIt
    public final C21281718Qd LIZJ() {
        AbstractC1775220wIS abstractC1775220wIS = this.LIZ;
        if (abstractC1775220wIS != null) {
            return abstractC1775220wIS.LIZJ();
        }
        return null;
    }

    @Override // X.InterfaceC1775470wIr
    public final void LIZIZ(String str) {
        AbstractC1775220wIS abstractC1775220wIS = this.LIZ;
        if (abstractC1775220wIS != null) {
            abstractC1775220wIS.LIZIZ(str);
        }
    }

    @Override // X.InterfaceC1775470wIr
    public final void LIZLLL(Boolean bool) {
        AbstractC1775220wIS abstractC1775220wIS = this.LIZ;
        if (abstractC1775220wIS != null) {
            abstractC1775220wIS.LIZLLL(bool);
        }
    }

    public C1775280wIY(final ViewGroup viewGroup, final C1775400wIk c1775400wIk) {
        if (viewGroup instanceof LynxView) {
            final LynxView lynxView = (LynxView) viewGroup;
            ViewParent parent = lynxView.getParent();
            if ((parent instanceof C1773610wFr) && parent != null) {
                this.LIZ = new AbstractC1775220wIS(lynxView, c1775400wIk) { // from class: X.0wIV
                    public final LynxView LJI;
                    public final InterfaceC1775430wIn LJII;
                    public C21281718Qd LJIIIIZZ;
                    public C1768420w7U LJIIIZ;

                    @Override // X.InterfaceC1775480wIs
                    public final C1768420w7U LIZ() {
                        ECMixMallItemInfoDTO eCMixMallItemInfoDTO;
                        Map<String, Object> map;
                        if (this.LJIIIZ == null) {
                            C1773330wFP c1773330wFPLJIIJ = LJIIJ();
                            this.LJIIIZ = (c1773330wFPLJIIJ == null || (eCMixMallItemInfoDTO = c1773330wFPLJIIJ.LJIIIZ) == null || (map = eCMixMallItemInfoDTO.config) == null) ? null : C1768550w7h.LIZIZ(map);
                        }
                        return this.LJIIIZ;
                    }

                    @Override // X.InterfaceC1775490wIt
                    public final C21281718Qd LIZJ() {
                        if (this.LJIIIIZZ == null) {
                            View viewFindViewByIdSelector = this.LJI.findViewByIdSelector("feed-video-time");
                            this.LJIIIIZZ = viewFindViewByIdSelector instanceof C21281718Qd ? (C21281718Qd) viewFindViewByIdSelector : null;
                        }
                        return this.LJIIIIZZ;
                    }

                    @Override // X.AbstractC1775220wIS
                    public final C1775180wIO LJI() {
                        C1775190wIP c1775190wIP;
                        C1773330wFP c1773330wFPLJIIJ = LJIIJ();
                        if (c1773330wFPLJIIJ == null || (c1775190wIP = c1773330wFPLJIIJ.LJII) == null) {
                            return null;
                        }
                        return c1775190wIP.LIZIZ;
                    }

                    public final C1773330wFP LJIIJ() {
                        C1773610wFr<?> c1773610wFrLJFF = LJFF();
                        Object data = c1773610wFrLJFF != null ? c1773610wFrLJFF.getData() : null;
                        if (data instanceof C1773330wFP) {
                            return (C1773330wFP) data;
                        }
                        return null;
                    }

                    @Override // X.AbstractC1775220wIS
                    public final InterfaceC1775430wIn LJII() {
                        return this.LJII;
                    }

                    @Override // X.InterfaceC1775470wIr
                    public final void LIZIZ(String str) {
                        InterfaceC1773850wGF interfaceC1773850wGF = this.LIZIZ;
                        if (interfaceC1773850wGF != null) {
                            interfaceC1773850wGF.LJIIJ(str, LJIIJ(), 0, new C1774840wHq(null, 7), null);
                        }
                    }

                    {
                        super(lynxView, c1775400wIk);
                        this.LJI = lynxView;
                        this.LJII = c1775400wIk;
                    }
                };
                return;
            }
            return;
        }
        this.LIZ = new AbstractC1775220wIS(viewGroup, c1775400wIk) { // from class: X.0wIU
            public final InterfaceC1775430wIn LJI;
            public C21281718Qd LJII;
            public final C1773340wFQ LJIIIIZZ;
            public final C1768420w7U LJIIIZ;

            @Override // X.InterfaceC1775490wIt
            public final C21281718Qd LIZJ() {
                InterfaceC1773310wFN mixMallController;
                C21319918c1 c21319918c1LIZIZ;
                C21326718d7 c21326718d7;
                if (this.LJII == null) {
                    C1773610wFr<?> c1773610wFrLJFF = LJFF();
                    View viewLIZJ = (c1773610wFrLJFF == null || (mixMallController = c1773610wFrLJFF.getMixMallController()) == null || (c21319918c1LIZIZ = mixMallController.LIZIZ()) == null || (c21326718d7 = c21319918c1LIZIZ.LIZJ) == null) ? null : c21326718d7.LIZJ(this.LIZ, "feed-video-time");
                    this.LJII = viewLIZJ instanceof C21281718Qd ? (C21281718Qd) viewLIZJ : null;
                }
                return this.LJII;
            }

            @Override // X.AbstractC1775220wIS
            public final C1775180wIO LJI() {
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

            @Override // X.AbstractC1775220wIS
            public final InterfaceC1775430wIn LJII() {
                return this.LJI;
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
                this.LJI = c1775400wIk;
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
        AbstractC1775220wIS abstractC1775220wIS = this.LIZ;
        if (abstractC1775220wIS != null) {
            abstractC1775220wIS.LJ(num, str, str2);
        }
    }
}
