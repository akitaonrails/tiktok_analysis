package Y;

import X.AbstractC1585810rMx;
import X.C10523049p;
import X.C1748720vbi;
import X.C1755360vmQ;
import X.C1755630vmr;
import X.C1758910vs9;
import X.C1773640wFu;
import X.InterfaceC1771900wD6;
import X.InterfaceC1773310wFN;
import X.InterfaceC1773890wGJ;
import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo.SeaPdpCreatorVideoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.shoprecommend.SeaPdpShopRecommendVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.PdpProductRecommendVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shoprecommend.PdpShopRecommendVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.spark.PdpLynxCardVH;
import com.ss.android.ugc.aweme.ecommerce.showcase.profile.TabStoreFragment;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeCardListAssem;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public class AsS52S0100000_26 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 1:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 3:
            case 6:
            case 7:
            case 8:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 4:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 5:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIJ$4(this, recyclerView, i);
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
            case 5:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 6:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 7:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case 8:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIZI$7(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS52S0100000_26(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS52S0100000_26 asS52S0100000_26, RecyclerView recyclerView, int i) {
        SeaPdpShopRecommendVH seaPdpShopRecommendVH = (SeaPdpShopRecommendVH) asS52S0100000_26.l0;
        if (seaPdpShopRecommendVH.LLJJL != 0) {
            if (i == 0) {
                if (seaPdpShopRecommendVH.LLJJJJJIL > 8) {
                    C1748720vbi.LIZLLL(seaPdpShopRecommendVH.itemView, new C10523049p(), new AwS605S0100000_26((SeaPdpShopRecommendVH) asS52S0100000_26.l0, 209));
                }
                ((SeaPdpShopRecommendVH) asS52S0100000_26.l0).LLJJJJJIL = 0;
            }
        } else if (i == 0) {
            ((SeaPdpShopRecommendVH) asS52S0100000_26.l0).LLJJJJJIL = 0;
        }
        ((SeaPdpShopRecommendVH) asS52S0100000_26.l0).LLJJL = i;
    }

    public static final void LJJIIJ$1(AsS52S0100000_26 asS52S0100000_26, RecyclerView recyclerView, int i) {
        PdpShopRecommendVH pdpShopRecommendVH = (PdpShopRecommendVH) asS52S0100000_26.l0;
        if (pdpShopRecommendVH.LLJL != 0) {
            if (i == 0) {
                if (pdpShopRecommendVH.LLJJL > 8) {
                    C1748720vbi.LIZLLL(pdpShopRecommendVH.itemView, new C10523049p(), new AwS605S0100000_26((PdpShopRecommendVH) asS52S0100000_26.l0, 237));
                }
                ((PdpShopRecommendVH) asS52S0100000_26.l0).LLJJL = 0;
            }
        } else if (i == 0) {
            ((PdpShopRecommendVH) asS52S0100000_26.l0).LLJJL = 0;
        }
        ((PdpShopRecommendVH) asS52S0100000_26.l0).LLJL = i;
    }

    public static final void LJJIIJ$2(AsS52S0100000_26 asS52S0100000_26, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((TabStoreFragment) asS52S0100000_26.l0).eT();
        }
    }

    public static final void LJJIIJ$3(AsS52S0100000_26 asS52S0100000_26, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((RecSwipeCardListAssem) asS52S0100000_26.l0).hp().setState(AFwS268S0000000_26.get$arr$(582));
        } else {
            if (i != 0) {
                return;
            }
            ((RecSwipeCardListAssem) asS52S0100000_26.l0).hp().setState(AFwS268S0000000_26.get$arr$(583));
        }
    }

    public static final void LJJIIJ$4(AsS52S0100000_26 asS52S0100000_26, RecyclerView recyclerView, int i) {
        PdpProductRecommendVH pdpProductRecommendVH = (PdpProductRecommendVH) asS52S0100000_26.l0;
        if (pdpProductRecommendVH.LLJLILLLLZIIL != 0) {
            if (i == 0) {
                C1748720vbi.LIZLLL(pdpProductRecommendVH.itemView, new C10523049p(), new AwS605S0100000_26((PdpProductRecommendVH) asS52S0100000_26.l0, 861));
                ((PdpProductRecommendVH) asS52S0100000_26.l0).getClass();
            }
        } else if (i == 0) {
            ((PdpProductRecommendVH) asS52S0100000_26.l0).getClass();
        }
        ((PdpProductRecommendVH) asS52S0100000_26.l0).LLJLILLLLZIIL = i;
    }

    public static final void LJJIIZI$0(AsS52S0100000_26 asS52S0100000_26, RecyclerView recyclerView, int i, int i2) {
        SeaPdpCreatorVideoViewHolder seaPdpCreatorVideoViewHolder = (SeaPdpCreatorVideoViewHolder) asS52S0100000_26.l0;
        int i3 = seaPdpCreatorVideoViewHolder.LLJZIJLIL + i;
        seaPdpCreatorVideoViewHolder.LLJZIJLIL = i3;
        if (i3 >= C1758910vs9.LIZ(recyclerView.getContext()) / 4) {
            ((SeaPdpCreatorVideoViewHolder) asS52S0100000_26.l0).c6();
            ((SeaPdpCreatorVideoViewHolder) asS52S0100000_26.l0).LLJZIJLIL = 0;
        }
    }

    public static final void LJJIIZI$1(AsS52S0100000_26 asS52S0100000_26, RecyclerView recyclerView, int i, int i2) {
        String str;
        SeaPdpShopRecommendVH seaPdpShopRecommendVH = (SeaPdpShopRecommendVH) asS52S0100000_26.l0;
        if (i < 0) {
            str = "show_left";
        } else {
            str = "show_right";
        }
        seaPdpShopRecommendVH.LLJJJIL = str;
        seaPdpShopRecommendVH.LLJJJJJIL += Math.abs(i);
    }

    public static final void LJJIIZI$2(AsS52S0100000_26 asS52S0100000_26, RecyclerView recyclerView, int i, int i2) {
        String str;
        PdpShopRecommendVH pdpShopRecommendVH = (PdpShopRecommendVH) asS52S0100000_26.l0;
        if (i < 0) {
            str = "show_left";
        } else {
            str = "show_right";
        }
        pdpShopRecommendVH.LLJJJJJIL = str;
        pdpShopRecommendVH.LLJJL += Math.abs(i);
    }

    public static final void LJJIIZI$3(AsS52S0100000_26 asS52S0100000_26, RecyclerView recyclerView, int i, int i2) {
        ((PdpLynxCardVH) asS52S0100000_26.l0).h6();
    }

    public static final void LJJIIZI$4(AsS52S0100000_26 asS52S0100000_26, RecyclerView recyclerView, int i, int i2) {
        ((C1755630vmr) asS52S0100000_26.l0).LIZ = SystemClock.elapsedRealtime();
    }

    public static final void LJJIIZI$5(AsS52S0100000_26 asS52S0100000_26, RecyclerView recyclerView, int i, int i2) {
        ((C1755360vmQ) asS52S0100000_26.l0).LIZ = SystemClock.elapsedRealtime();
    }

    public static final void LJJIIZI$6(AsS52S0100000_26 asS52S0100000_26, RecyclerView recyclerView, int i, int i2) {
        InterfaceC1773890wGJ interfaceC1773890wGJLIZJ;
        InterfaceC1771900wD6 interfaceC1771900wD6;
        Iterator<T> it2 = ((C1773640wFu) asS52S0100000_26.l0).getScrollListeners().iterator();
        while (it2.hasNext()) {
            Function1 function1 = (Function1) it2.next();
            if (i2 != 0) {
                function1.invoke(Integer.valueOf(i2));
            }
        }
        if ((!((C1773640wFu) asS52S0100000_26.l0).canScrollVertically(-1) && i2 < 0) || (!((C1773640wFu) asS52S0100000_26.l0).canScrollVertically(1) && i2 > 0)) {
            ((C1773640wFu) asS52S0100000_26.l0).stopScroll();
        }
        InterfaceC1773310wFN controller = ((C1773640wFu) asS52S0100000_26.l0).getController();
        if (controller != null && (interfaceC1773890wGJLIZJ = controller.LIZJ()) != null && (interfaceC1771900wD6 = (InterfaceC1771900wD6) interfaceC1773890wGJLIZJ.getService(InterfaceC1771900wD6.class)) != null) {
            interfaceC1771900wD6.LJIIIIZZ((C1773640wFu) asS52S0100000_26.l0, i2);
        }
    }

    public static final void LJJIIZI$7(AsS52S0100000_26 asS52S0100000_26, RecyclerView recyclerView, int i, int i2) {
        String str;
        PdpProductRecommendVH pdpProductRecommendVH = (PdpProductRecommendVH) asS52S0100000_26.l0;
        if (i < 0) {
            str = "show_left";
        } else {
            str = "show_right";
        }
        pdpProductRecommendVH.LLJLIL = str;
    }
}
