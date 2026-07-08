package Y;

import X.AbstractC1585810rMx;
import X.C11VU;
import X.C1398350mUb;
import X.C13LP;
import X.C13LQ;
import X.C1415620mwS;
import X.C1415640mwU;
import X.C1415790mwj;
import X.C1419590n2r;
import X.C1420490n4J;
import X.C1420790n4n;
import X.C1421110n5J;
import X.C1421140n5M;
import X.C1421590n65;
import X.C1424850nBL;
import X.C1424910nBR;
import X.C1425080nBi;
import X.C1427030nEr;
import X.C1427080nEw;
import X.C201955140j;
import X.C2188811AlT;
import X.C283140B7w;
import X.C425240Glu;
import X.EnumC1064704Ej;
import X.InterfaceC1408730mlL;
import X.InterfaceC1415670mwX;
import X.InterfaceC1421120n5K;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.creative.model.AutoCutCategory;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class AsS49S0100000_22 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 1:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 2:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 3:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 4:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 5:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 6:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 7:
                LJJIIJ$5(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 4:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case 6:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
            case 7:
                LJJIIZI$7(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS49S0100000_22(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i) {
        ((C1420790n4n) asS49S0100000_22.l0).getClass();
        if (i != 0) {
            if (i == 1) {
                ((C1420790n4n) asS49S0100000_22.l0).getClass();
                return;
            }
            return;
        }
        ((C1420790n4n) asS49S0100000_22.l0).getClass();
    }

    public static final void LJJIIJ$1(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        C1421590n65 c1421590n65 = C1421590n65.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScrollStateChanged:newState=");
        sbLIZ.append(i);
        C201955140j.LIZJ(c1421590n65, C2188811AlT.LIZIZ(sbLIZ));
        C425240Glu c425240Glu = ((C1415620mwS) asS49S0100000_22.l0).LLILZ;
        RecyclerView.LayoutManager layoutManager = null;
        if (c425240Glu != null) {
            layoutManager = c425240Glu.getLayoutManager();
        }
        if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
            staggeredGridLayoutManager.LJJIIZ();
        }
        ((C1415620mwS) asS49S0100000_22.l0).LIZ();
    }

    public static final void LJJIIJ$2(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i) {
        C1420490n4J c1420490n4J = (C1420490n4J) asS49S0100000_22.l0;
        c1420490n4J.LLIZLLLIL = c1420490n4J.LLJ;
        c1420490n4J.LLJ = i;
    }

    public static final void LJJIIJ$3(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i) {
        InterfaceC1415670mwX interfaceC1415670mwX = ((C1415640mwU) asS49S0100000_22.l0).LLILZIL;
        if (interfaceC1415670mwX != null) {
            interfaceC1415670mwX.LIZ(i);
        }
    }

    public static final void LJJIIJ$4(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
            staggeredGridLayoutManager.LJJIIZ();
        }
    }

    public static final void LJJIIJ$5(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i) {
        String title;
        float fR5;
        Asset asset;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateListView onScrollStateChanged: newState = ");
        sbLIZ.append(i);
        sbLIZ.append(", curPlayIndex = ");
        sbLIZ.append(((C1424850nBL) asS49S0100000_22.l0).LLJLILLLLZIIL);
        sbLIZ.append(" - ");
        C1424850nBL c1424850nBL = (C1424850nBL) asS49S0100000_22.l0;
        C1419590n2r c1419590n2rLLLFZ = c1424850nBL.LLJJLIIIJLLLLLLLZ.LLLFZ(c1424850nBL.LLJLILLLLZIIL);
        if (c1419590n2rLLLFZ != null && (asset = c1419590n2rLLLFZ.LIZ) != null) {
            title = asset.getTitle();
        } else {
            title = null;
        }
        sbLIZ.append(title);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (((C1424850nBL) asS49S0100000_22.l0).LLJZIJLIL && ((Boolean) C283140B7w.LIZ.getValue()).booleanValue()) {
            if (i == 0) {
                ((C1424850nBL) asS49S0100000_22.l0).LLJZIJLIL = false;
                return;
            }
            return;
        }
        C1424850nBL c1424850nBL2 = (C1424850nBL) asS49S0100000_22.l0;
        if (!c1424850nBL2.LLJJJ) {
            int iLIZJ = C11VU.LIZJ(8.0d, c1424850nBL2.LL);
            int height = c1424850nBL2.getHeight();
            if (height > 0) {
                c1424850nBL2.LLJJJ = true;
                c1424850nBL2.LLJJJIL = (height / 2) - iLIZJ;
            }
        }
        if (i != 0) {
            if (i == 1) {
                C1424850nBL c1424850nBL3 = (C1424850nBL) asS49S0100000_22.l0;
                C1425080nBi c1425080nBiLIZIZ = c1424850nBL3.LIZIZ(c1424850nBL3.LLJLILLLLZIIL);
                if (c1425080nBiLIZIZ != null) {
                    c1425080nBiLIZIZ.T5(false, true);
                }
                c1424850nBL3.LJIIIZ();
                C1424850nBL c1424850nBL4 = (C1424850nBL) asS49S0100000_22.l0;
                C1425080nBi c1425080nBiLIZIZ2 = c1424850nBL4.LIZIZ(c1424850nBL4.LLJLILLLLZIIL);
                if (c1425080nBiLIZIZ2 != null) {
                    fR5 = c1425080nBiLIZIZ2.R5();
                } else {
                    fR5 = 0.0f;
                }
                c1424850nBL4.LLJLL = fR5;
                return;
            }
            return;
        }
        C1424850nBL c1424850nBL5 = (C1424850nBL) asS49S0100000_22.l0;
        c1424850nBL5.LJJ(c1424850nBL5.LLJJIJIL);
        ((C1424850nBL) asS49S0100000_22.l0).LJIILIIL();
        C1424850nBL c1424850nBL6 = (C1424850nBL) asS49S0100000_22.l0;
        if (c1424850nBL6.LLLFF) {
            c1424850nBL6.LLJJLIIIJLLLLLLLZ.notifyItemChanged(0);
            c1424850nBL6.LLJJLIIIJLLLLLLLZ.notifyItemChanged(1);
            ((C1424850nBL) asS49S0100000_22.l0).LLLFF = false;
        }
        ((C1424850nBL) asS49S0100000_22.l0).LJIIIIZZ();
    }

    public static final void LJJIIZI$0(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (i < 0) {
                if (iFindFirstVisibleItemPosition != -1) {
                    C1415790mwj c1415790mwj = (C1415790mwj) asS49S0100000_22.l0;
                    if (c1415790mwj.LIZLLL > iFindFirstVisibleItemPosition) {
                        c1415790mwj.LIZLLL = iFindFirstVisibleItemPosition;
                        InterfaceC1408730mlL interfaceC1408730mlL = c1415790mwj.LIZJ;
                        if (interfaceC1408730mlL != null) {
                            interfaceC1408730mlL.LIZ(EnumC1064704Ej.LEFT, iFindFirstVisibleItemPosition);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i <= 0 || iFindLastVisibleItemPosition == -1) {
                return;
            }
            C1415790mwj c1415790mwj2 = (C1415790mwj) asS49S0100000_22.l0;
            if (c1415790mwj2.LJ >= iFindLastVisibleItemPosition) {
                return;
            }
            c1415790mwj2.LJ = iFindLastVisibleItemPosition;
            InterfaceC1408730mlL interfaceC1408730mlL2 = c1415790mwj2.LIZJ;
            if (interfaceC1408730mlL2 == null) {
                return;
            }
            interfaceC1408730mlL2.LIZ(EnumC1064704Ej.RIGHT, iFindLastVisibleItemPosition);
        }
    }

    public static final void LJJIIZI$1(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i, int i2) {
        ((C1420790n4n) asS49S0100000_22.l0).getClass();
    }

    public static final void LJJIIZI$2(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        List<C1427080nEw> list;
        if (i2 <= 0) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int childCount = linearLayoutManager.getChildCount();
            int itemCount = linearLayoutManager.getItemCount();
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int i3 = childCount * 2;
            if (!((C1427030nEr) asS49S0100000_22.l0).LLLLILI().LIZ.LJII && ((C1427030nEr) asS49S0100000_22.l0).LLLLILI().LIZ.LJI && itemCount - childCount <= iFindFirstVisibleItemPosition + i3 && (list = ((C1427030nEr) asS49S0100000_22.l0).LLLLILI().LIZ.LJ) != null) {
                C1427030nEr c1427030nEr = (C1427030nEr) asS49S0100000_22.l0;
                if (!list.isEmpty()) {
                    c1427030nEr.LLLLIL().LIZ.invoke(Integer.valueOf(c1427030nEr.LLLLILI().LIZ.LJFF));
                }
            }
        }
    }

    public static final void LJJIIZI$3(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i, int i2) {
        ((C1415620mwS) asS49S0100000_22.l0).LIZ();
    }

    public static final void LJJIIZI$4(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        AutoCutThemeData autoCutThemeData;
        AutoCutCategory autoCutCategory;
        C1420490n4J c1420490n4J = (C1420490n4J) asS49S0100000_22.l0;
        if (c1420490n4J.LLIZ) {
            c1420490n4J.LJ();
            return;
        }
        if (c1420490n4J.LLIZLLLIL == 0 && c1420490n4J.LLJ == 2) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLZIJ(linearLayoutManager.findFirstVisibleItemPosition(), ((C1420490n4J) asS49S0100000_22.l0).LLILLL)) != null && (autoCutCategory = autoCutThemeData.category) != null) {
            ((C1420490n4J) asS49S0100000_22.l0).LIZLLL(autoCutCategory, false);
        }
    }

    public static final void LJJIIZI$5(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i, int i2) {
        InterfaceC1415670mwX interfaceC1415670mwX = ((C1415640mwU) asS49S0100000_22.l0).LLILZIL;
        if (interfaceC1415670mwX != null) {
            interfaceC1415670mwX.LIZIZ(i, i2);
        }
    }

    public static final void LJJIIZI$6(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i, int i2) {
        int itemCount;
        int iIntValue;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int[] iArrLJIJJ;
        Integer numLJJJJJL;
        if (i2 > 0 && ((C1421110n5J) asS49S0100000_22.l0).LLJILJIL) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                itemCount = layoutManager.getItemCount();
            } else {
                itemCount = 0;
            }
            RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
            if ((layoutManager2 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager2) != null && (iArrLJIJJ = staggeredGridLayoutManager.LJIJJ(null)) != null && (numLJJJJJL = C13LQ.LJJJJJL(iArrLJIJJ)) != null) {
                iIntValue = numLJJJJJL.intValue();
            } else {
                iIntValue = 0;
            }
            C1421140n5M c1421140n5M = ((C1421110n5J) asS49S0100000_22.l0).LLJI;
            if ((c1421140n5M != null && c1421140n5M.LLILLL) || iIntValue < itemCount - 2) {
                return;
            }
            if (c1421140n5M != null) {
                boolean z = c1421140n5M.LLILLL;
                c1421140n5M.LLILLL = true;
                if (!z) {
                    c1421140n5M.notifyItemInserted(c1421140n5M.LLILLJJLI.size());
                }
            }
            InterfaceC1421120n5K povPanelClickListener = ((C1421110n5J) asS49S0100000_22.l0).getPovPanelClickListener();
            if (povPanelClickListener == null) {
                return;
            }
            povPanelClickListener.LJFF();
        }
    }

    public static final void LJJIIZI$7(AsS49S0100000_22 asS49S0100000_22, RecyclerView recyclerView, int i, int i2) {
        String title;
        C1424910nBR c1424910nBR;
        Asset asset;
        if (((C1424850nBL) asS49S0100000_22.l0).LLJZIJLIL && ((Boolean) C283140B7w.LIZ.getValue()).booleanValue()) {
            return;
        }
        C1424850nBL c1424850nBL = (C1424850nBL) asS49S0100000_22.l0;
        boolean z = c1424850nBL.LLJJIJIL;
        if (i2 > 0) {
            c1424850nBL.LLJJIJIL = true;
        }
        if (i2 < 0) {
            c1424850nBL.LLJJIJIL = false;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateListView onScrolled: prevIsScrollUp = ");
        sbLIZ.append(z);
        sbLIZ.append(", isScrollUp = ");
        sbLIZ.append(((C1424850nBL) asS49S0100000_22.l0).LLJJIJIL);
        sbLIZ.append(", curPlayIndex = ");
        sbLIZ.append(((C1424850nBL) asS49S0100000_22.l0).LLJLILLLLZIIL);
        sbLIZ.append(" - ");
        C1424850nBL c1424850nBL2 = (C1424850nBL) asS49S0100000_22.l0;
        C1419590n2r c1419590n2rLLLFZ = c1424850nBL2.LLJJLIIIJLLLLLLLZ.LLLFZ(c1424850nBL2.LLJLILLLLZIIL);
        if (c1419590n2rLLLFZ != null && (asset = c1419590n2rLLLFZ.LIZ) != null) {
            title = asset.getTitle();
        } else {
            title = null;
        }
        sbLIZ.append(title);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        ((C1424850nBL) asS49S0100000_22.l0).LJJ(z);
        ((C1424850nBL) asS49S0100000_22.l0).LJII(false);
        C1424850nBL c1424850nBL3 = (C1424850nBL) asS49S0100000_22.l0;
        Integer numLJJJJI = C13LQ.LJJJJI(c1424850nBL3.LLJJL.LJIJJ(null));
        if (numLJJJJI != null && numLJJJJI.intValue() == c1424850nBL3.LLJJLIIIJLLLLLLLZ.getItemCount() - 1 && c1424850nBL3.LLJJLIIIJLLLLLLLZ.LLJI) {
            C1424850nBL c1424850nBL4 = (C1424850nBL) asS49S0100000_22.l0;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c1424850nBL4.LLJ.findViewHolderForAdapterPosition(c1424850nBL4.LLJJLIIIJLLLLLLLZ.getItemCount() - 1);
            if ((viewHolderFindViewHolderForAdapterPosition instanceof C1424910nBR) && (c1424910nBR = (C1424910nBR) viewHolderFindViewHolderForAdapterPosition) != null) {
                HandlerHook.viewPost(c1424910nBR.LL, new ARunnableS41S0110000_22(c1424910nBR, 9));
            }
        }
    }
}
