package X;

import android.text.Layout;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.header.TopBannerAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.USAddonOrderCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.CCDCNormalElementViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04JX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JX implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onGlobalLayout$0(C04JX c04jx) {
        if (((RecyclerView) c04jx.l0).getVisibility() == 0) {
            C786410Ut5.C3(((RecyclerView) c04jx.l0).getViewTreeObserver(), c04jx);
            ((USAddonOrderCell) c04jx.l1).L5();
        }
    }

    public static final void onGlobalLayout$1(C04JX c04jx) {
        ViewTreeObserver viewTreeObserver;
        Layout layout;
        String str;
        TuxTextView tuxTextViewNo = ((TopBannerAssem) c04jx.l0).No();
        if (tuxTextViewNo != null && (layout = tuxTextViewNo.getLayout()) != null) {
            TopBannerAssem topBannerAssem = (TopBannerAssem) c04jx.l0;
            Announcement announcement = (Announcement) c04jx.l1;
            if (layout.getEllipsisCount(layout.getLineCount() - 1) == 0) {
                C786410Ut5.LLLLLLZZ((TuxIconView) topBannerAssem.LLJJIJI.getValue(), 8);
                str = "disable";
            } else {
                C786410Ut5.LLLLLLZZ((TuxIconView) topBannerAssem.LLJJIJI.getValue(), 0);
                C786410Ut5.I7(new AjS40S0200000_1(topBannerAssem, announcement, 5), topBannerAssem.Lo());
                str = "normal";
            }
            C1748720vbi.LIZLLL(topBannerAssem.No(), new C048K(), new AwS115S1100000_1(announcement, str, 2));
        }
        TuxTextView tuxTextViewNo2 = ((TopBannerAssem) c04jx.l0).No();
        if (tuxTextViewNo2 != null && (viewTreeObserver = tuxTextViewNo2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c04jx);
            C2187701Ajg.LIZIZ(viewTreeObserver, c04jx, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$2(C04JX c04jx) {
        ViewTreeObserver viewTreeObserver;
        Layout layout;
        TuxTextView tuxTextView = (TuxTextView) c04jx.l0;
        if (tuxTextView != null && (layout = tuxTextView.getLayout()) != null) {
            View view = (View) c04jx.l1;
            if (layout.getEllipsisCount(layout.getLineCount() - 1) == 0 && view.findViewById(R.id.us_order_submit_aggregation_shop_name).getVisibility() == 0) {
                C0H1U.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), view.findViewById(R.id.us_order_submit_aggregation_shop_name));
            } else {
                C0H1U.LJIIIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), view.findViewById(R.id.us_order_submit_aggregation_shop_name));
            }
        }
        TuxTextView tuxTextView2 = (TuxTextView) c04jx.l0;
        if (tuxTextView2 != null && (viewTreeObserver = tuxTextView2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(c04jx);
            C2187701Ajg.LIZIZ(viewTreeObserver, c04jx, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$3(C04JX c04jx) {
        C786410Ut5.G6((SmartImageView) c04jx.l0, new FrameLayout.LayoutParams(((SmartImageView) c04jx.l0).getLayoutParams().width, ((ConstraintLayout) c04jx.l1).getHeight(), 8388613));
        C786410Ut5.C3(((ConstraintLayout) c04jx.l1).getViewTreeObserver(), c04jx);
    }

    public static final void onGlobalLayout$4(C04JX c04jx) {
        C958503ot c958503ot;
        View view = ((CCDCNormalElementViewHolderV2) c04jx.l0).itemView;
        Integer numValueOf = null;
        if ((view instanceof C943103mP) && (c958503ot = (C958503ot) view) != null) {
            numValueOf = Integer.valueOf(c958503ot.getHeaderHeight());
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGlobalLayout cvv height ");
        sbLIZ.append(numValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        if (Intrinsics.LJFF(((C889203di) c04jx.l1).LLILLJJLI.LIZ.id, "eg_ccdc_global_cvv") && numValueOf != null) {
            CCDCNormalElementViewHolderV2 cCDCNormalElementViewHolderV2 = (CCDCNormalElementViewHolderV2) c04jx.l0;
            cCDCNormalElementViewHolderV2.I5().kR2(numValueOf.intValue(), cCDCNormalElementViewHolderV2.LLILLL);
        }
        C786410Ut5.C3(((CCDCNormalElementViewHolderV2) c04jx.l0).itemView.getViewTreeObserver(), c04jx);
    }

    public C04JX(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
