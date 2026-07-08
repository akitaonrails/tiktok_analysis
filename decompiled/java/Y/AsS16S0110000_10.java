package Y;

import X.AbstractC1585810rMx;
import X.C0P7M;
import X.C418440Gaw;
import X.C661350Pwr;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.ui.SearchTopBarAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.viewmodel.SearchTopBarAssemViewModel;
import com.ss.android.ugc.aweme.search.pages.common.personalized.banner.core.viewmodel.SearchPersonalizedBannerVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchTopBarStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.TopBarDisplay;

/* JADX INFO: loaded from: classes11.dex */
public class AsS16S0110000_10 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
                break;
            default:
                super.LJJIIJ(recyclerView, i);
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
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS16S0110000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS16S0110000_10 asS16S0110000_10, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1) {
                asS16S0110000_10.z1 = true;
                return;
            }
            return;
        }
        asS16S0110000_10.z1 = false;
    }

    public static final void LJJIIJ$1(AsS16S0110000_10 asS16S0110000_10, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1) {
                asS16S0110000_10.z1 = true;
                return;
            }
            return;
        }
        asS16S0110000_10.z1 = false;
    }

    public static final void LJJIIJ$2(AsS16S0110000_10 asS16S0110000_10, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1) {
                asS16S0110000_10.z1 = true;
                return;
            }
            return;
        }
        asS16S0110000_10.z1 = false;
    }

    public static final void LJJIIZI$0(AsS16S0110000_10 asS16S0110000_10, RecyclerView recyclerView, int i, int i2) {
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        SearchTopBarStruct searchTopBarStruct;
        int iLIZIZ;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        TopBarDisplay topBarDisplay;
        Integer num;
        TopBarDisplay topBarDisplay2;
        Integer num2;
        SearchTopBarAssem searchTopBarAssem = (SearchTopBarAssem) asS16S0110000_10.l0;
        if (searchTopBarAssem.LLJJIJIL == null && searchTopBarAssem.LLJJJ == null) {
            return;
        }
        int iHp = searchTopBarAssem.hp();
        if (((SearchTopBarAssem) asS16S0110000_10.l0).getContentView().getVisibility() != 8 && iHp != 0) {
            View viewLJJIJL = ((SearchTopBarAssem) asS16S0110000_10.l0).LJJIJL();
            int i6 = 0;
            if (!asS16S0110000_10.z1 || ((searchTopBarStruct = ((SearchTopBarAssem) asS16S0110000_10.l0).ip().getState().LLILLL) != null && (topBarDisplay2 = searchTopBarStruct.topBarDisplay) != null && (num2 = topBarDisplay2.fixedHeight) != null && iHp == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num2)))) {
                SearchTopBarAssemViewModel searchTopBarAssemViewModelIp = ((SearchTopBarAssem) asS16S0110000_10.l0).ip();
                ViewGroup.LayoutParams layoutParams = viewLJJIJL.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    i3 = marginLayoutParams2.topMargin;
                } else {
                    i3 = 0;
                }
                int i7 = iHp + i3;
                ViewGroup.LayoutParams layoutParams2 = viewLJJIJL.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    i6 = marginLayoutParams.topMargin;
                }
                searchTopBarAssemViewModelIp.wQ2(i7, -i6);
                return;
            }
            SearchTopBarStruct searchTopBarStruct2 = ((SearchTopBarAssem) asS16S0110000_10.l0).ip().getState().LLILLL;
            if (searchTopBarStruct2 != null && (topBarDisplay = searchTopBarStruct2.topBarDisplay) != null && (num = topBarDisplay.fixedHeight) != null) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(num));
            } else {
                iLIZIZ = iHp;
            }
            int i8 = iHp - iLIZIZ;
            if (i2 > 0) {
                ViewGroup.LayoutParams layoutParams3 = viewLJJIJL.getLayoutParams();
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    i5 = marginLayoutParams5.topMargin;
                } else {
                    i5 = 0;
                }
                C661350Pwr.LJIIJJI(Math.max(i5 - i2, -i8), viewLJJIJL);
            } else {
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                if (iComputeVerticalScrollOffset <= i8) {
                    C661350Pwr.LJIIJJI(-iComputeVerticalScrollOffset, viewLJJIJL);
                }
            }
            SearchTopBarAssemViewModel searchTopBarAssemViewModelIp2 = ((SearchTopBarAssem) asS16S0110000_10.l0).ip();
            ViewGroup.LayoutParams layoutParams4 = viewLJJIJL.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                i4 = marginLayoutParams4.topMargin;
            } else {
                i4 = 0;
            }
            int i9 = iHp + i4;
            ViewGroup.LayoutParams layoutParams5 = viewLJJIJL.getLayoutParams();
            if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                i6 = marginLayoutParams3.topMargin;
            }
            searchTopBarAssemViewModelIp2.wQ2(i9, -i6);
        }
    }

    public static final void LJJIIZI$1(AsS16S0110000_10 asS16S0110000_10, RecyclerView recyclerView, int i, int i2) {
        if (asS16S0110000_10.z1 && i2 != 0) {
            ((SearchPersonalizedBannerVM) asS16S0110000_10.l0).vQ2();
        }
    }

    public static final void LJJIIZI$2(AsS16S0110000_10 asS16S0110000_10, RecyclerView recyclerView, int i, int i2) {
        C0P7M c0p7m = (C0P7M) asS16S0110000_10.l0;
        if (c0p7m.LJ) {
            if (asS16S0110000_10.z1 && c0p7m.LIZIZ(recyclerView)) {
                ((C0P7M) asS16S0110000_10.l0).LIZLLL("slide");
                return;
            }
            return;
        }
        c0p7m.LIZLLL("slide");
    }
}
