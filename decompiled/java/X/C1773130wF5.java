package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.ECHybridAdapter;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.layoutmanager.ECMMKLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.pad.IEcMallPadService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wF5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773130wF5 extends RecyclerView.ViewHolder {
    public final C1773650wFv LL;
    public final InterfaceC1773310wFN LLILLJJLI;
    public final C1773710wG1 LLILLL;
    public int LLILZ;
    public C1772690wEN LLILZIL;
    public final C01GW LLILZLL;
    public final AwS605S0100000_26 LLIZ;
    public final C01GW LLIZLLLIL;
    public final C1773380wFU<AbstractC1773210wFD> LLJ;
    public boolean LLJI;

    public final void I5() {
        Set<Function1<Integer, Unit>> scrollListeners;
        Set<Function1<Integer, Unit>> scrollListeners2;
        AwS605S0100000_26 awS605S0100000_26 = this.LLIZ;
        if (awS605S0100000_26 != null) {
            C1773650wFv c1773650wFv = this.LL;
            if (c1773650wFv != null && (scrollListeners2 = c1773650wFv.getScrollListeners()) != null) {
                scrollListeners2.add(awS605S0100000_26);
            }
            C1773640wFu c1773640wFu = (C1773640wFu) this.LLILZLL.getValue();
            if (c1773640wFu != null && (scrollListeners = c1773640wFu.getScrollListeners()) != null) {
                scrollListeners.add(awS605S0100000_26);
            }
        }
        int childCount = this.LL.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((AbstractC1773460wFc) this.LL.getChildViewHolder(this.LL.getChildAt(i))).b6();
        }
        this.LLILZ = 2;
    }

    public final ECHybridAdapter N5() {
        return (ECHybridAdapter) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R5() {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1773130wF5.R5():void");
    }

    public final void S5() {
        boolean z = this.LLILZ == 1;
        I5();
        if (z) {
            P5(-1, "switch_feed_tab");
        }
    }

    public final void T5() {
        if (this.LLILZ != 0) {
            return;
        }
        this.LLILZ = 1;
        C1772690wEN c1772690wEN = this.LLILZIL;
        if (c1772690wEN == null) {
            c1772690wEN = null;
        }
        U5(c1772690wEN, true);
        C1772690wEN c1772690wEN2 = this.LLILZIL;
        C1772690wEN c1772690wEN3 = c1772690wEN2 != null ? c1772690wEN2 : null;
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        this.LLILLJJLI.LJIIIZ().LM0(c1772690wEN3.LIZLLL, new C1773690wFz(this));
    }

    public final void L5(String str) {
        C1772720wEQ c1772720wEQ;
        Map<String, Object> mapLIZ;
        Map map;
        C1772690wEN c1772690wEN = this.LLILZIL;
        if (c1772690wEN == null) {
            Object obj = Unit.LIZ;
            if (obj != null) {
                c1772690wEN = (C1772690wEN) obj;
            } else {
                return;
            }
        }
        if (!Intrinsics.LJFF(c1772690wEN.LJ, Boolean.FALSE) && !c1772690wEN.LJI) {
            Object obj2 = null;
            if (Intrinsics.LJFF(c1772690wEN.LJII, EnumC1771620wCe.FIRST_CHUNK.getValue())) {
                if (this.LLILLJJLI.LJIIIZ().NM2()) {
                    c1772690wEN.LJII = null;
                } else {
                    return;
                }
            }
            Object objLJJLIIIJL = C13LP.LJJLIIIJL(N5().LL);
            if (objLJJLIIIJL instanceof C1772720wEQ) {
                c1772720wEQ = (C1772720wEQ) objLJJLIIIJL;
            } else {
                c1772720wEQ = null;
            }
            if (c1772720wEQ != null) {
                if (c1772690wEN.LIZJ.size() == 1) {
                    c1772720wEQ.LJJ = 0;
                } else {
                    c1772720wEQ.LJJ = 1;
                }
                if (!this.LL.isComputingLayout()) {
                    N5().notifyItemChanged(C1697810uHb.LJIIJ(N5().LL));
                }
            }
            c1772690wEN.LJI = true;
            C1774450wHD c1774450wHD = (C1774450wHD) this.LLILLJJLI.LIZJ().getService(C1774450wHD.class);
            if (c1774450wHD != null) {
                mapLIZ = c1774450wHD.LIZ(getBindingAdapterPosition());
            } else {
                mapLIZ = null;
            }
            Object objLIZLLL = this.LLILLJJLI.LIZ().LIZLLL("bff_page_tab", EnumC599720Nfe.NATIVE, C2097608Jq.LJ());
            if (objLIZLLL instanceof Boolean) {
                obj2 = objLIZLLL;
            }
            boolean zLJFF = Intrinsics.LJFF(obj2, Boolean.TRUE);
            if (mapLIZ != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapLIZ);
                linkedHashMap.put("bff_page_tab", Boolean.valueOf(zLJFF));
                map = linkedHashMap;
            } else {
                map = mapLIZ;
            }
            this.LLILLJJLI.LJIIIZ().tW(new C1772180wDY(this.itemView.getContext(), new C1771590wCb(c1772690wEN.LIZLLL, c1772690wEN.LJFF, c1772690wEN.LJIIIIZZ, "fetch", str, null, map, C2097908Jt.LIZJ(new Pair("feed_tab_index", Integer.valueOf(getBindingAdapterPosition()))), Long.valueOf(System.currentTimeMillis()), null, false, 61720)));
        }
    }

    public final void P5(int i, String str) {
        if (this.LLILZ != 2) {
            return;
        }
        if (i == -1) {
            L5(str);
            return;
        }
        int itemCount = ((N5().getItemCount() - i) - 1) - 1;
        C1773020wEu.LIZ.getClass();
        if (itemCount < C1773020wEu.LIZIZ().loadmoreThreshold) {
            L5(str);
        }
    }

    public final void U5(C1772690wEN c1772690wEN, boolean z) {
        C1117360fBO c1117360fBO;
        C1772690wEN c1772690wEN2 = this.LLILZIL;
        if (c1772690wEN2 == null) {
            c1772690wEN2 = null;
        }
        if (c1772690wEN != c1772690wEN2) {
            return;
        }
        AbstractC21673619ry adapter = this.LL.getAdapter();
        if ((adapter instanceof ECHybridAdapter) && (c1117360fBO = (C1117360fBO) adapter) != null) {
            List<? extends AbstractC1773210wFD> list = c1772690wEN.LIZJ;
            c1117360fBO.LL = list;
            C1773380wFU<AbstractC1773210wFD> c1773380wFU = this.LLJ;
            c1773380wFU.LJFF(list);
            if (z) {
                N5().notifyDataSetChanged();
            } else {
                C21342318fd.LIZ(c1773380wFU, true).LIZJ(N5());
            }
        }
    }

    public C1773130wF5(C1773650wFv c1773650wFv, InterfaceC1773310wFN interfaceC1773310wFN, C1773710wG1 c1773710wG1) {
        super(c1773650wFv);
        this.LL = c1773650wFv;
        this.LLILLJJLI = interfaceC1773310wFN;
        this.LLILLL = c1773710wG1;
        this.LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1641));
        new LinkedHashSet();
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1640));
        this.LLJ = new C1773380wFU<>(0);
        c1773650wFv.setLayoutManager(new ECMMKLayoutManager(c1773650wFv));
        c1773650wFv.setAdapter(N5());
        c1773650wFv.addItemDecoration(new C1773830wGD(true));
        IEcMallPadService iEcMallPadService = (IEcMallPadService) PluggableExtentionKt.pluggableSpi$default(IEcMallPadService.class, false, false, false, 14, null);
        if (iEcMallPadService != null && iEcMallPadService.LIZLLL()) {
            R5();
            interfaceC1773310wFN.LJIIIZ().wA1(new AwS605S0100000_26(this, 942));
        }
        this.LLIZ = new AwS605S0100000_26(this, 943);
    }
}
