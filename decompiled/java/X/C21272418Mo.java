package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Mo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21272418Mo implements Observer<List<? extends C21271118Mb>>, InterfaceC1164530gPT, InterfaceC1740480vOQ {
    public static boolean LLJJIJIIJIL;
    public final ProductListModel LL;
    public final Context LLILLJJLI;
    public final List<AnchorProductInfoModel> LLILLL;
    public final boolean LLILZ;
    public int LLILZIL;
    public final C15MV LLILZLL;
    public int LLIZ = 0;
    public C18O5 LLIZLLLIL;
    public C18O6 LLJ;
    public final IECommerceVideoService LLJI;
    public final IECommerceAnchorService LLJIJIL;
    public AwS576S0100000_32 LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public long LLJJ;
    public final String LLJJI;
    public final List<Integer> LLJJIII;
    public final C01GW LLJJIJI;

    public final void LIZIZ() {
        C18MZ c18mz;
        this.LLILZIL = 2;
        if (LIZ().getAdapter() instanceof C18MZ) {
            AbstractC21673619ry adapter = LIZ().getAdapter();
            if (!(adapter instanceof C18MZ) || (c18mz = (C18MZ) adapter) == null) {
                return;
            }
            c18mz.LLILZIL = 2;
        }
    }

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // X.InterfaceC1748820vbs
    public final String getPageName() {
        return "video_multi_anchor";
    }

    @Override // X.InterfaceC1748820vbs
    public final void sh() {
    }

    public final RecyclerView LIZ() {
        return (RecyclerView) this.LLJJIJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL() {
        RecyclerView recyclerViewLIZ = LIZ();
        int childCount = recyclerViewLIZ.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerViewLIZ.getChildAt(i);
            if (childAt instanceof InterfaceC990510bsn) {
                boolean localVisibleRect = childAt.getLocalVisibleRect(new Rect());
                Function1<Boolean, Unit> exposeListener = ((InterfaceC990510bsn) childAt).getExposeListener();
                if (exposeListener != null) {
                    exposeListener.invoke(Boolean.valueOf(localVisibleRect));
                }
            }
        }
    }

    public final void LJ() {
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_cart_refresh", this);
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return C960603pE.LIZJ(this);
    }

    @Override // X.InterfaceC1748820vbs
    public final Map<String, String> Aa() {
        return C988803tm.LIZIZ;
    }

    @Override // X.InterfaceC1748810vbr
    public final List<String> getRegisteredLane() {
        return C988803tm.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<? extends C21271118Mb> list) {
        int i;
        Integer num;
        int iIntValue;
        CartEntry cartEntry;
        Integer num2;
        CartEntry cartEntry2;
        CartEntry cartEntry3;
        String str;
        String string;
        CartEntry cartEntry4;
        C18MZ c18mz;
        List<? extends C21271118Mb> list2 = list;
        AbstractC21673619ry adapter = LIZ().getAdapter();
        if ((adapter instanceof C18MZ) && (c18mz = (C18MZ) adapter) != 0) {
            c18mz.LLLJ(list2);
        }
        if (!list2.isEmpty()) {
            Iterator<? extends C21271118Mb> it2 = list2.iterator();
            while (it2.hasNext()) {
                Map<String, String> map = it2.next().LIZ;
                if (map != null && !map.isEmpty()) {
                    i = 1;
                    break;
                }
            }
            i = 0;
        } else {
            i = 0;
        }
        this.LLIZ = i;
        C21271118Mb c21271118Mb = (C21271118Mb) C13LP.LJJJLZIJ(0, list2);
        if (c21271118Mb != null && c21271118Mb.LJIL) {
            C21272518Mp.LIZ.getClass();
            iIntValue = C21272518Mp.LJIIJJI;
        } else {
            C21272518Mp c21272518Mp = C21272518Mp.LIZ;
            if (c21271118Mb != null && (cartEntry2 = c21271118Mb.LJIIIZ) != null) {
                num = cartEntry2.itemCount;
            } else {
                num = null;
            }
            c21272518Mp.getClass();
            C21272518Mp.LIZIZ(num);
            if (c21271118Mb != null && (cartEntry = c21271118Mb.LJIIIZ) != null && (num2 = cartEntry.itemCount) != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 0;
            }
        }
        boolean z = LIZ().getAdapter() instanceof C18MZ;
        this.LLJILJILJ = iIntValue;
        if (this.LLJILJIL == null) {
            this.LLJILJIL = new AwS576S0100000_32(this, 898);
        }
        String strLJIIJ = "";
        if (!this.LLILLL.isEmpty()) {
            if (c21271118Mb == null || (cartEntry4 = c21271118Mb.LJIIIZ) == null || (str = cartEntry4.link) == null) {
                str = "";
            }
            AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) ListProtector.get(this.LLILLL, 0);
            Long l = ((AnchorProductInfoModel) ListProtector.get(this.LLILLL, 0)).extraData.productId;
            if (l != null && (string = l.toString()) != null) {
                strLJIIJ = string;
            }
            ProductListModel productListModel = this.LL;
            strLJIIJ = C21272218Mm.LJIIJ(str, anchorProductInfoModel, strLJIIJ, productListModel.aweme, productListModel.eventType, this.LLJJI, this.LLILZ);
        }
        String strLJFF = C18LA.LJFF(LIZ(), strLJIIJ, "c92278.d6087", null);
        if (c21271118Mb != null && (cartEntry3 = c21271118Mb.LJIIIZ) != null && cartEntry3.link != null) {
            C18O5 c18o5 = this.LLIZLLLIL;
            if (c18o5 != null) {
                c18o5.LJJLIIIJ(strLJFF, this.LLJILJIL, true);
            }
        } else {
            C18O5 c18o52 = this.LLIZLLLIL;
            if (c18o52 != null) {
                c18o52.LJJLIIIJ(strLJFF, this.LLJILJIL, false);
            }
        }
        C18O5 c18o53 = this.LLIZLLLIL;
        if (c18o53 != null) {
            c18o53.LJIJJ(this.LLJILJILJ);
        }
    }

    @Override // X.InterfaceC1740480vOQ
    public final void mG(View view, LifecycleOwner lifecycleOwner) {
        C1756050vnX.LIZ(this, view, lifecycleOwner);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.18O6] */
    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        int iIntValue;
        Integer num;
        if (Intrinsics.LJFF(str, "ec_cart_refresh")) {
            if (this.LLJ == null) {
                this.LLJ = new InterfaceC1752840viM() { // from class: X.18O6
                    @Override // X.InterfaceC1752840viM
                    public final ViewGroup LJJIJL() {
                        C18O5 c18o5 = this.LIZ.LLIZLLLIL;
                        if (c18o5 != null) {
                            return c18o5.LJJIJL();
                        }
                        return null;
                    }

                    @Override // X.InterfaceC1752840viM
                    public final View nb() {
                        C18O5 c18o5 = this.LIZ.LLIZLLLIL;
                        if (c18o5 != null) {
                            return c18o5.LJIIJJI();
                        }
                        return null;
                    }
                };
            }
            try {
                CartRefreshEvent cartRefreshEventLIZ = C049Q.LIZ(str2);
                Integer num2 = cartRefreshEventLIZ.count;
                int iIntValue2 = 0;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                this.LLJILJILJ = iIntValue;
                AbstractC21673619ry adapter = LIZ().getAdapter();
                if ((adapter instanceof C18MZ) && ((C18MZ) adapter) != null && (num = cartRefreshEventLIZ.count) != null) {
                    num.intValue();
                }
                C18O5 c18o5 = this.LLIZLLLIL;
                if (c18o5 != null) {
                    Integer num3 = cartRefreshEventLIZ.count;
                    if (num3 != null) {
                        iIntValue2 = num3.intValue();
                    }
                    c18o5.LJIJJ(iIntValue2);
                }
                C21272518Mp c21272518Mp = C21272518Mp.LIZ;
                Integer num4 = cartRefreshEventLIZ.count;
                c21272518Mp.getClass();
                C21272518Mp.LIZIZ(num4);
                IECommerceVideoService iECommerceVideoService = this.LLJI;
                if (iECommerceVideoService != null) {
                    RecyclerView recyclerViewLIZ = LIZ();
                    C06MM.LIZ(this.LLILLJJLI);
                    iECommerceVideoService.LIZJ(recyclerViewLIZ, this.LLJ, cartRefreshEventLIZ.toast);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LIZJ(View view, Function0<Unit> function0, Function0<Unit> function02) {
        C1756050vnX.LIZJ(view, this, function0, function02);
    }

    public C21272418Mo(ProductListModel productListModel, Context context, List<AnchorProductInfoModel> list, C2344009Gk c2344009Gk, boolean z, int i, C15MV c15mv) {
        C21270018Lq c21270018LqLIZ;
        this.LL = productListModel;
        this.LLILLJJLI = context;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = c15mv;
        IECommerceVideoService iECommerceVideoService = (IECommerceVideoService) ServiceManager.get().getService(IECommerceVideoService.class);
        this.LLJI = iECommerceVideoService;
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        this.LLJIJIL = iECommerceAnchorService;
        String strLJIIJJI = C21272218Mm.LJIIJJI(productListModel, z);
        if (strLJIIJJI == null && (strLJIIJJI = productListModel.entranceForm) == null) {
            strLJIIJJI = "video_multi_anchor";
        }
        this.LLJJI = strLJIIJJI;
        this.LLJJIII = new ArrayList();
        this.LLJJIJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 896));
        LIZ().setBackgroundColor(0);
        RecyclerView recyclerViewLIZ = LIZ();
        HashMap map = new HashMap(c2344009Gk.LIZ);
        int i2 = this.LLILZIL;
        C21269318Lj c21269318Lj = new C21269318Lj();
        c21269318Lj.LIZ.setPanelStyle(0);
        c21269318Lj.LIZ.setPanelClickMethod(4);
        recyclerViewLIZ.setAdapter(new C18MZ(productListModel, context, map, z, i2, iECommerceVideoService, iECommerceAnchorService, c21269318Lj.LIZ));
        if (iECommerceAnchorService != null && iECommerceAnchorService.LJJJJZI()) {
            c21270018LqLIZ = C21269818Lo.LIZ(C21269818Lo.LIZ, list, false, C0H9H.LIZIZ(8), C0H9H.LIZIZ(8), C0H9H.LIZIZ(4), 2);
        } else {
            c21270018LqLIZ = C21269818Lo.LIZ(C21269818Lo.LIZ, list, false, 0, 0, 0, 30);
        }
        RecyclerView recyclerViewLIZ2 = LIZ();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2);
        LIZ().addItemDecoration(c21270018LqLIZ);
        recyclerViewLIZ2.setLayoutManager(gridLayoutManager);
    }
}
