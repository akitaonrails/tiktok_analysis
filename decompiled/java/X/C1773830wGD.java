package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.ECHybridAdapter;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.style.ECMixMallStyleDTO;
import com.ss.android.ugc.aweme.ecommerce.pad.IEcMallPadService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773830wGD extends C0DXR {
    public final boolean LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(498));

    public C1773830wGD(boolean z) {
        this.LL = z;
    }

    @Override // X.C0DXR
    public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
        List<?> list;
        AbstractC1773210wFD abstractC1773210wFD;
        Boolean boolValueOf;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int iLJIIIIZZ;
        String strLJIIJ;
        C1117360fBO c1117360fBO;
        super.LIZIZ(rect, view, recyclerView, c21673919s1);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        AbstractC21673619ry adapter = recyclerView.getAdapter();
        String strLJIIJ2 = null;
        if ((adapter instanceof ECHybridAdapter) && (c1117360fBO = (C1117360fBO) adapter) != null) {
            list = c1117360fBO.LL;
        } else {
            list = null;
        }
        if ((list instanceof List) && list != null && (abstractC1773210wFD = (AbstractC1773210wFD) C13LP.LJJJLZIJ(childAdapterPosition, list)) != null && abstractC1773210wFD.LJFF != null) {
            C21681819tI c21681819tI = (C21681819tI) view.getLayoutParams();
            ECMixMallStyleDTO eCMixMallStyleDTO = abstractC1773210wFD.LJFF;
            if (eCMixMallStyleDTO != null) {
                IEcMallPadService iEcMallPadService = (IEcMallPadService) PluggableExtentionKt.pluggableSpi$default(IEcMallPadService.class, false, false, false, 14, null);
                if (iEcMallPadService != null) {
                    boolValueOf = Boolean.valueOf(iEcMallPadService.LIZLLL());
                } else {
                    boolValueOf = null;
                }
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof StaggeredGridLayoutManager) {
                    staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                } else {
                    staggeredGridLayoutManager = null;
                }
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE) && this.LL && staggeredGridLayoutManager != null) {
                    iLJIIIIZZ = staggeredGridLayoutManager.LJJIII();
                } else {
                    iLJIIIIZZ = abstractC1773210wFD.LJIIIIZZ();
                }
                if (iLJIIIIZZ == 0) {
                    return;
                }
                if (iLJIIIIZZ == 1) {
                    rect.left = eCMixMallStyleDTO.LIZ;
                    rect.right = eCMixMallStyleDTO.LIZIZ;
                } else if (c21681819tI.LIZ() % iLJIIIIZZ == 0) {
                    rect.left = eCMixMallStyleDTO.LIZ;
                    rect.right = eCMixMallStyleDTO.LJ / 2;
                } else if (c21681819tI.LIZ() % iLJIIIIZZ == iLJIIIIZZ - 1) {
                    rect.left = eCMixMallStyleDTO.LJ / 2;
                    rect.right = eCMixMallStyleDTO.LIZIZ;
                } else {
                    int i = eCMixMallStyleDTO.LJ / 2;
                    rect.left = i;
                    rect.right = i;
                }
                int i2 = eCMixMallStyleDTO.LJFF / 2;
                rect.top = i2;
                rect.bottom = i2;
                String strLJIIJ3 = abstractC1773210wFD.LJIIJ();
                AbstractC1773210wFD abstractC1773210wFD2 = (AbstractC1773210wFD) C13LP.LJJJLZIJ(childAdapterPosition - iLJIIIIZZ, list);
                if (abstractC1773210wFD2 != null) {
                    strLJIIJ = abstractC1773210wFD2.LJIIJ();
                } else {
                    strLJIIJ = null;
                }
                if (!Intrinsics.LJFF(strLJIIJ3, strLJIIJ)) {
                    rect.top = eCMixMallStyleDTO.LIZJ;
                }
                String strLJIIJ4 = abstractC1773210wFD.LJIIJ();
                AbstractC1773210wFD abstractC1773210wFD3 = (AbstractC1773210wFD) C13LP.LJJJLZIJ(childAdapterPosition + iLJIIIIZZ, list);
                if (abstractC1773210wFD3 != null) {
                    strLJIIJ2 = abstractC1773210wFD3.LJIIJ();
                }
                if (!Intrinsics.LJFF(strLJIIJ4, strLJIIJ2)) {
                    rect.bottom = eCMixMallStyleDTO.LIZLLL;
                }
            }
        }
    }
}
