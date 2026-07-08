package X;

import Y.ARunnableS117S0100000_17;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.LinkedList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fU8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128980fU8 {
    public final Function0<GiftLeafRootViewModel> LIZ;
    public final InterfaceC1129980fVk LIZIZ;
    public final InterfaceC1130010fVn LIZJ;
    public final C1129470fUv LIZLLL;
    public final C1129730fVL LJ;
    public final int LJFF = EnumC1129580fV6.GIFT_PANEL_MULTI_GUEST_VIEW.getZIndex();
    public final int LJI = EnumC1129580fV6.GIFT_PANEL_MULTI_GUEST_SWITCH_TARGET_LEAF.getZIndex();
    public final int LJII = EnumC1129580fV6.GIFT_PANEL_TAKE_THE_STAGE_LEAF.getZIndex();
    public C964190bCL LJIIIIZZ;

    public final void LIZIZ() {
        int i = C1130100fVw.LIZ.LJIILL ? this.LJFF : this.LJI;
        if (this.LIZIZ.LIZ(i)) {
            this.LIZIZ.LIZJ(i);
        }
    }

    public static int LIZ(long j) {
        int size;
        Gift giftFindGiftById = GiftManager.inst().findGiftById(j);
        if (giftFindGiftById != null) {
            if (C1125800fP0.LJFF()) {
                size = ((LinkedList) C1125800fP0.LIZLLL()).size();
            } else {
                size = 1;
            }
            return size * giftFindGiftById.diamondCount;
        }
        return 0;
    }

    public final void LIZJ(boolean z, boolean z2) {
        int iLIZ;
        if (C1125810fP1.LIZ()) {
            int i = 0;
            if (z) {
                View view = this.LIZLLL.LJIIJ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                View view2 = this.LIZLLL.LJIIJ;
                if (view2 != null) {
                    HandlerHook.viewPostDelay(view2, new ARunnableS117S0100000_17(this, 232), 100L);
                }
            } else if (z2) {
                C1129700fVI c1129700fVI = this.LIZLLL.LJIIJJI;
                if (c1129700fVI != null) {
                    iLIZ = c1129700fVI.LIZJ.LIZ(true);
                } else {
                    iLIZ = 0;
                }
                ViewGroup viewGroup = this.LIZLLL.LJ;
                if (viewGroup != null) {
                    C500260Jjc.LJJLJ(iLIZ, viewGroup);
                }
                ViewGroup viewGroup2 = this.LIZLLL.LIZLLL;
                if (viewGroup2 != null) {
                    C500260Jjc.LJJLJ(iLIZ, viewGroup2);
                }
                View view3 = this.LIZLLL.LJFF;
                if (view3 != null) {
                    C500260Jjc.LJJLJ(iLIZ, view3);
                }
                ViewGroup viewGroup3 = this.LIZLLL.LIZJ;
                if (viewGroup3 != null) {
                    C500260Jjc.LJJLJ(iLIZ, viewGroup3);
                }
            } else {
                ViewGroup viewGroup4 = this.LIZLLL.LJ;
                if (viewGroup4 != null) {
                    C500260Jjc.LJJLJ(0, viewGroup4);
                }
                ViewGroup viewGroup5 = this.LIZLLL.LIZLLL;
                if (viewGroup5 != null) {
                    C500260Jjc.LJJLJ(0, viewGroup5);
                }
                View view4 = this.LIZLLL.LJFF;
                if (view4 != null) {
                    C500260Jjc.LJJLJ(0, view4);
                }
                ViewGroup viewGroup6 = this.LIZLLL.LIZJ;
                if (viewGroup6 != null) {
                    C500260Jjc.LJJLJ(0, viewGroup6);
                }
            }
            View view5 = this.LIZLLL.LJIIJ;
            if (view5 != null) {
                if (!z) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view5);
            }
        }
    }

    public C1128980fU8(AwS561S0100000_17 awS561S0100000_17, C1100430ek5 c1100430ek5, C1129750fVN c1129750fVN, C1129470fUv c1129470fUv, C1129730fVL c1129730fVL) {
        this.LIZ = awS561S0100000_17;
        this.LIZIZ = c1100430ek5;
        this.LIZJ = c1129750fVN;
        this.LIZLLL = c1129470fUv;
        this.LJ = c1129730fVL;
    }
}
