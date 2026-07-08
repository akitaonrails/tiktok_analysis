package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCDateElementViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelAssemFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: renamed from: X.04JW, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JW implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[PHI: r1
      0x00b8: PHI (r1v3 android.view.View) = (r1v2 android.view.View), (r1v20 android.view.View) binds: [B:39:0x00a7, B:44:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016e A[PHI: r6
      0x016e: PHI (r6v3 android.view.View) = (r6v2 android.view.View), (r6v5 android.view.View) binds: [B:48:0x00c4, B:53:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onGlobalLayout$0(X.C04JW r7) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04JW.onGlobalLayout$0(X.04JW):void");
    }

    public static final void onGlobalLayout$1(C04JW c04jw) {
        SkuPanelAssemFragment skuPanelAssemFragmentGo = ((SkuPanelAssem) c04jw.l0).Go();
        View viewFindViewById = skuPanelAssemFragmentGo.LLJJIII;
        if (viewFindViewById == null) {
            View view = skuPanelAssemFragmentGo.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.cxl);
            } else {
                viewFindViewById = null;
            }
            skuPanelAssemFragmentGo.LLJJIII = (C419400GcU) viewFindViewById;
        }
        ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c04jw);
            C2187701Ajg.LIZIZ(viewTreeObserver, c04jw, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        SkuPanelAssem skuPanelAssem = (SkuPanelAssem) c04jw.l0;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = skuPanelAssem.LLJJIJIIJIL;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setPeekHeight(skuPanelAssem.LJJIJL().getHeight());
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior2 = ((SkuPanelAssem) c04jw.l0).LLJJIJIIJIL;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.setState(3);
        }
        ((SkuPanelAssem) c04jw.l0).Lo().RQ2(true);
    }

    public static final void onGlobalLayout$2(C04JW c04jw) {
        C958503ot c958503ot;
        View view = ((CCDCDateElementViewHolderV2) c04jw.l0).itemView;
        Integer numValueOf = null;
        if ((view instanceof C942603mK) && (c958503ot = (C958503ot) view) != null) {
            numValueOf = Integer.valueOf(c958503ot.getHeaderHeight());
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGlobalLayout date height ");
        sbLIZ.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        if (numValueOf != null) {
            CCDCDateElementViewHolderV2 cCDCDateElementViewHolderV2 = (CCDCDateElementViewHolderV2) c04jw.l0;
            cCDCDateElementViewHolderV2.L5().kR2(numValueOf.intValue(), cCDCDateElementViewHolderV2.LLILLL);
        }
        C786410Ut5.C3(((CCDCDateElementViewHolderV2) c04jw.l0).itemView.getViewTreeObserver(), c04jw);
    }

    public static final void onGlobalLayout$3(C04JW c04jw) {
        C736680Sv4.LJIJJ(((OrderSubmitFragment) c04jw.l0).ZR(), new AwS367S0200000_1((OrderSubmitFragment) c04jw.l0, c04jw, 373));
    }

    public static final void onGlobalLayout$4(C04JW c04jw) {
        ViewTreeObserver viewTreeObserver;
        C20691715xz c20691715xzHS = ((OrderSubmitFragment) c04jw.l0).hS();
        if (c20691715xzHS != null && c20691715xzHS.getChildCount() > 0) {
            C20691715xz c20691715xzHS2 = ((OrderSubmitFragment) c04jw.l0).hS();
            if (c20691715xzHS2 != null && (viewTreeObserver = c20691715xzHS2.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(c04jw);
                C2187701Ajg.LIZIZ(viewTreeObserver, c04jw, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
            C03O0.LIZ.getClass();
            BPEAHandler bPEAHandler = C03O0.LJIJI;
            if (bPEAHandler != null) {
                bPEAHandler.removeCallbacks(C03O0.LJJII);
            }
            C03O0.LJLJJL(false);
        }
    }

    public C04JW(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
