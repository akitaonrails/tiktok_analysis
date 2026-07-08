package Y;

import X.AbstractC1773210wFD;
import X.AbstractC1773460wFc;
import X.AbstractC21673619ry;
import X.C1768370w7P;
import X.C1773470wFd;
import X.C1773550wFl;
import X.C1773640wFu;
import X.C1C7U;
import X.C2097608Jq;
import X.C21281718Qd;
import X.C21281818Qe;
import X.C2188811AlT;
import X.EnumC1771210wBz;
import X.EnumC599720Nfe;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.ECHybridAdapter;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS38S0010000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class ARunnableS45S0110000_26 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Map<String, Object> map;
        ECHybridAdapter eCHybridAdapter;
        C1773640wFu c1773640wFu;
        View view;
        if (Intrinsics.LJFF(((AbstractC1773460wFc) this.l0).LL.LIZ().LIZLLL("page_visible", EnumC599720Nfe.NATIVE, C2097608Jq.LJ()), Boolean.TRUE)) {
            AbstractC1773460wFc abstractC1773460wFc = (AbstractC1773460wFc) this.l0;
            D d = abstractC1773460wFc.LLILLL;
            if (d != 0 && d.LJIIJJI) {
                if (abstractC1773460wFc.itemView.getTop() <= 1) {
                    if (!abstractC1773460wFc.LLIZ.LIZ) {
                        abstractC1773460wFc.X5(true);
                    }
                } else if (abstractC1773460wFc.LLIZ.LIZ) {
                    abstractC1773460wFc.X5(false);
                }
            }
            AbstractC1773460wFc abstractC1773460wFc2 = (AbstractC1773460wFc) this.l0;
            boolean z = this.z1;
            abstractC1773460wFc2.getClass();
            if (!(abstractC1773460wFc2 instanceof C1773470wFd)) {
                int height = abstractC1773460wFc2.itemView.getHeight();
                if (height == abstractC1773460wFc2.S5() || height == 0) {
                    if (z) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("card height is illegal");
                        EnumC1771210wBz enumC1771210wBz = EnumC1771210wBz.TRACK_REPORT_HEIGHT_ILLEGAL;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("card height is illegal: ");
                        D d2 = abstractC1773460wFc2.LLILLL;
                        sbLIZ.append(d2 != 0 ? d2.LJIIJJI() : null);
                        sbLIZ.append(" - ");
                        D d3 = abstractC1773460wFc2.LLILLL;
                        sbLIZ.append(d3 != 0 ? d3.LJIIIZ() : null);
                        sbLIZ.append(" - ");
                        sbLIZ.append(abstractC1773460wFc2.getBindingAdapterPosition());
                        sbLIZ.append(" - ");
                        D d4 = abstractC1773460wFc2.LLILLL;
                        sbLIZ.append((d4 == 0 || (map = d4.LJI) == null) ? null : ((LinkedHashMap) map).get("log_id"));
                        sbLIZ.append(" - ");
                        sbLIZ.append(height);
                        C1768370w7P.LIZ(illegalArgumentException, enumC1771210wBz, C2188811AlT.LIZIZ(sbLIZ), null);
                        return;
                    }
                    return;
                }
                List<C1773550wFl> list = abstractC1773460wFc2.LLILZLL.LIZIZ;
                AbstractC21673619ry<? extends RecyclerView.ViewHolder> bindingAdapter = abstractC1773460wFc2.getBindingAdapter();
                if (!(bindingAdapter instanceof ECHybridAdapter) || (eCHybridAdapter = (ECHybridAdapter) bindingAdapter) == null || (c1773640wFu = eCHybridAdapter.LLIZLLLIL) == null) {
                    return;
                }
                int iMin = (abstractC1773460wFc2.getBindingAdapterPosition() <= c1773640wFu.LLILLL || (view = c1773640wFu.LLILZ) == null) ? 0 : Math.min(view.getHeight(), (int) view.getTranslationY());
                Rect rect = new Rect();
                c1773640wFu.getLocalVisibleRect(rect);
                int iMin2 = ((Math.min(((int) abstractC1773460wFc2.itemView.getY()) + height, rect.bottom) - Math.max((int) abstractC1773460wFc2.itemView.getY(), rect.top + iMin)) * 100) / height;
                if (iMin2 < 0) {
                    iMin2 = 0;
                }
                D d5 = abstractC1773460wFc2.LLILLL;
                if (d5 != 0) {
                    d5.LJIIL = iMin2 == 100;
                }
                for (C1773550wFl c1773550wFl : list) {
                    c1773550wFl.getClass();
                    if (c1773550wFl.LIZJ) {
                        if (iMin2 <= c1773550wFl.LIZIZ || iMin2 == 0) {
                            c1773550wFl.LIZ(false);
                        }
                    } else if (iMin2 > c1773550wFl.LIZ || iMin2 == 100) {
                        c1773550wFl.LIZ(true);
                    }
                }
            }
        }
    }

    public static final void run$0(ARunnableS45S0110000_26 aRunnableS45S0110000_26) {
        boolean zLIZ;
        C1C7U.LIZ("MMKSingleVideoView@a724.updateTimeIcon$1$1");
        try {
            ((C21281818Qe) aRunnableS45S0110000_26.l0).h0(aRunnableS45S0110000_26.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MMKSingleVideoView@a724.updateTimeIcon$1$1");
    }

    public static final void run$1(ARunnableS45S0110000_26 aRunnableS45S0110000_26) {
        boolean zLIZ;
        C1C7U.LIZ("EcVideoView@8143.updateTimeIcon$1$1");
        try {
            ((C21281718Qd) aRunnableS45S0110000_26.l0).i0(aRunnableS45S0110000_26.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcVideoView@8143.updateTimeIcon$1$1");
    }

    public static final void run$2(ARunnableS45S0110000_26 aRunnableS45S0110000_26) {
        boolean zLIZ;
        C1C7U.LIZ("RecSwipeViewModel@199f.followCurrentUser$1");
        try {
            RecSwipeViewModel recSwipeViewModel = (RecSwipeViewModel) aRunnableS45S0110000_26.l0;
            boolean z = aRunnableS45S0110000_26.z1;
            recSwipeViewModel.getClass();
            recSwipeViewModel.setState(new AwS38S0010000_26(z, 9));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecSwipeViewModel@199f.followCurrentUser$1");
    }

    public static final void run$3(ARunnableS45S0110000_26 aRunnableS45S0110000_26) {
        boolean zLIZ;
        C1C7U.LIZ("ECAbsViewHolder@3b89.onScanningStickyAndVisibility$1");
        try {
            aRunnableS45S0110000_26.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECAbsViewHolder@3b89.onScanningStickyAndVisibility$1");
    }

    public ARunnableS45S0110000_26(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS45S0110000_26(AbstractC1773460wFc abstractC1773460wFc, AbstractC1773460wFc<AbstractC1773210wFD> abstractC1773460wFc2, int i, boolean z) {
        this.$t = z ? 1 : 0;
        this.l0 = abstractC1773460wFc;
        this.z1 = i;
    }
}
