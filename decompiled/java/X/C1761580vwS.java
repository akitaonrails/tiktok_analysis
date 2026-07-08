package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS392S0200000_26;

/* JADX INFO: renamed from: X.0vwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761580vwS extends AbstractC1585810rMx {
    public String LL;
    public int LLILLL;
    public int LLILZ;
    public final /* synthetic */ C1744100vUG LLILZLL;
    public final /* synthetic */ InterfaceC10458047c LLIZ;
    public final int LLILLJJLI = 8;
    public List<Image> LLILZIL = C13BV.INSTANCE;

    public final List<Image> LJJIJIIJIL(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        Map<String, Object> map;
        LinearLayoutManager linearLayoutManager2;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null) {
            iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        } else {
            iFindFirstVisibleItemPosition = 0;
        }
        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager2) != null) {
            iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = 0;
        }
        if (iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition && iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition < this.LLILZLL.LL.LJFF.size()) {
            return this.LLILZLL.LL.LJFF.subList(Math.max(0, iFindFirstVisibleItemPosition), Math.min(iFindLastVisibleItemPosition, r2.size() - 1));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid indices: startIndex=");
        sbLIZ.append(iFindFirstVisibleItemPosition);
        sbLIZ.append(", endIndex=");
        sbLIZ.append(iFindLastVisibleItemPosition);
        sbLIZ.append(", listSize=");
        sbLIZ.append(this.LLILZLL.LL.LJFF.size());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR10010;
        RuntimeException runtimeException = new RuntimeException(strLIZIZ);
        SkuPanelStarter.SkuEnterParams skuEnterParams = ((SkuPanelBaseReusedAssem) this.LLIZ).getViewModel().LLJI;
        if (skuEnterParams != null) {
            map = skuEnterParams.trackParams;
        } else {
            map = null;
        }
        C1019103yf.LIZ(enumC1014603xw, runtimeException, map);
        return null;
    }

    public C1761580vwS(InterfaceC10458047c interfaceC10458047c, C1744100vUG c1744100vUG) {
        this.LLILZLL = c1744100vUG;
        this.LLIZ = interfaceC10458047c;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        List<Image> listLJJIJIIJIL;
        if (this.LLILZ == 0 && i != 0 && (listLJJIJIIJIL = LJJIJIIJIL(recyclerView)) != null) {
            this.LLILZIL = listLJJIJIIJIL;
        }
        if (this.LLILZ != 0) {
            if (i == 0) {
                if (this.LLILLL > this.LLILLJJLI) {
                    String str = this.LL;
                    if (str != null) {
                        C10296040w.LIZ.getClass();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(C10296040w.LIZIZ);
                        linkedHashMap.put("module_name", "head_pic");
                        linkedHashMap.put("slide_type", str);
                        C1018703yb.LIZIZ("tiktokec_module_slide", linkedHashMap);
                    }
                    C1748720vbi.LIZLLL(recyclerView, new C10530049w(), new AwS392S0200000_26(this, recyclerView, 166));
                }
                this.LLILLL = 0;
            }
        } else if (i == 0) {
            this.LLILLL = 0;
        }
        this.LLILZ = i;
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        String value;
        if (i < 0) {
            value = EnumC1017060cZc.LEFT.getValue();
        } else {
            value = EnumC1017060cZc.RIGHT.getValue();
        }
        this.LL = value;
        this.LLILLL += Math.abs(i);
    }
}
