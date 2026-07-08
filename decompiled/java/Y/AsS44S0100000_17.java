package Y;

import X.AbstractC1585810rMx;
import X.C0IJT;
import X.C0PEM;
import X.C1103910eph;
import X.C1113190f4f;
import X.C1114850f7L;
import X.C1123380fL6;
import X.C1127050fR1;
import X.C1128500fTM;
import X.C1128520fTO;
import X.C1128530fTP;
import X.C1128590fTV;
import X.C1128710fTh;
import X.C1133630fbd;
import X.C1133640fbe;
import X.C13BV;
import X.C20600815jK;
import X.C23250099c;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C781570UlH;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1091490eVf;
import X.InterfaceC1891350zJl;
import X.InterfaceC497601wk;
import X.RunnableC781530UlD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.billboard.ui.page.BasicPageVH;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssem;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftPanelWidget;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.GiftPanelLeafViewModel;
import com.bytedance.android.livesdk.impl.revenue.starcomment.extendscreen.StarCommentExtendWidget;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListAssem;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.tts.oecverify.BdTuring;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class AsS44S0100000_17 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    public static final void LJJIIZI$2(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i, int i2) {
    }

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
            case 3:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 4:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 5:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case 6:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 7:
                LJJIIJ$6(this, recyclerView, i);
                break;
            case 8:
                LJJIIJ$7(this, recyclerView, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIJ$8(this, recyclerView, i);
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
            case 7:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 4:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 6:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case 8:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS44S0100000_17(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1) {
                ((C1113190f4f) asS44S0100000_17.l0).LJIIIIZZ = false;
            }
        } else {
            if (!(!recyclerView.canScrollVertically(1))) {
                return;
            }
            C1113190f4f c1113190f4f = (C1113190f4f) asS44S0100000_17.l0;
            c1113190f4f.LJII = EnumC1091490eVf.NORMAL;
            c1113190f4f.LIZJ(0);
        }
    }

    public static final void LJJIIJ$1(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1) {
                BasicPageVH basicPageVH = (BasicPageVH) asS44S0100000_17.l0;
                if (!basicPageVH.LLILZIL) {
                    basicPageVH.LLILZIL = true;
                    C784440Upu.LIZ().LIZIZ(new C1103910eph("vertical_slide", null));
                    return;
                }
                return;
            }
            return;
        }
        ((BasicPageVH) asS44S0100000_17.l0).LLILZIL = false;
    }

    public static final void LJJIIJ$2(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        List<InterfaceC1891350zJl> listLJII;
        C20600815jK<InterfaceC1891350zJl> state;
        if (i != 0) {
            if (i == 1) {
                C1133630fbd c1133630fbd = ((GiftAnchorPanelGiftPageCenterAssem) asS44S0100000_17.l0).hp().LLILZIL;
                c1133630fbd.getClass();
                c1133630fbd.LJIIJJI = System.currentTimeMillis();
                return;
            }
            return;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((GiftAnchorPanelGiftPageCenterAssem) asS44S0100000_17.l0).LLJJJIL;
        RecyclerView.LayoutManager layoutManager = null;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        }
        if (!(layoutManager instanceof GridLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return;
        }
        GiftAnchorPanelGiftPageCenterAssem giftAnchorPanelGiftPageCenterAssem = (GiftAnchorPanelGiftPageCenterAssem) asS44S0100000_17.l0;
        C1133630fbd c1133630fbd2 = giftAnchorPanelGiftPageCenterAssem.hp().LLILZIL;
        String str = giftAnchorPanelGiftPageCenterAssem.hp().LLILLL;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = giftAnchorPanelGiftPageCenterAssem.LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
            listLJII = state.LJII();
        } else {
            listLJII = C13BV.INSTANCE;
        }
        c1133630fbd2.LIZLLL(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition, str, listLJII);
    }

    public static final void LJJIIJ$3(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1) {
                ((GiftAnchorPanelRecordPageCenterAssem) asS44S0100000_17.l0).LLJJJJJIL = true;
                return;
            }
            return;
        }
        GiftAnchorPanelRecordPageCenterAssem giftAnchorPanelRecordPageCenterAssem = (GiftAnchorPanelRecordPageCenterAssem) asS44S0100000_17.l0;
        if (!giftAnchorPanelRecordPageCenterAssem.LLJJJJJIL) {
            return;
        }
        String str = giftAnchorPanelRecordPageCenterAssem.hp().LLILLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_gift_record_scroll");
        C1133640fbe.LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "gift_enter_from");
        c474500IjALIZ.LIZ();
        ((GiftAnchorPanelRecordPageCenterAssem) asS44S0100000_17.l0).LLJJJJJIL = false;
    }

    public static final void LJJIIJ$4(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i) {
        C1114850f7L c1114850f7L = (C1114850f7L) asS44S0100000_17.l0;
        if (i == 1) {
            c1114850f7L.LIZ(true);
        } else {
            c1114850f7L.LIZ(false);
        }
    }

    public static final void LJJIIJ$5(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i) {
        FrameLayout frameLayout;
        GridLayoutManager gridLayoutManager;
        RecyclerView.LayoutManager layoutManager;
        GridLayoutManager gridLayoutManager2;
        FrameLayout frameLayout2;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ;
        C1128710fTh c1128710fTh = (C1128710fTh) asS44S0100000_17.l0;
        c1128710fTh.LLLLIILL = i;
        if (i == 1) {
            c1128710fTh.LJJJJI();
            C1128710fTh c1128710fTh2 = (C1128710fTh) asS44S0100000_17.l0;
            C1127050fR1 c1127050fR1 = c1128710fTh2.LLJJIJI;
            if (c1127050fR1 != null) {
                c1127050fR1.LLLFZ(c1128710fTh2.P1(), recyclerView, true);
            }
        }
        if ((i == 1 || i == 2) && (frameLayout = ((C1128710fTh) asS44S0100000_17.l0).LLLLIIIILLL) != null) {
            frameLayout.setClipChildren(true);
        }
        if (i == 0) {
            C1128710fTh c1128710fTh3 = (C1128710fTh) asS44S0100000_17.l0;
            RunnableC781530UlD runnableC781530UlD = c1128710fTh3.LLJJIII;
            if (runnableC781530UlD != null) {
                layoutManager = runnableC781530UlD.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if (layoutManager instanceof GridLayoutManager) {
                gridLayoutManager2 = (GridLayoutManager) layoutManager;
            } else {
                gridLayoutManager2 = null;
            }
            if (runnableC781530UlD != null && gridLayoutManager2 != null && (giftPanelLeafViewModelLJJLIIIIJ = c1128710fTh3.LJJLIIIIJ()) != null) {
                C23250099c.LIZLLL(c1128710fTh3.LJJLIIIJ(), C0PEM.LIZ.plus(c1128710fTh3.LLZZ), null, new C1128520fTO(giftPanelLeafViewModelLJJLIIIIJ, runnableC781530UlD, gridLayoutManager2, c1128710fTh3, null), 2);
            }
            if (recyclerView.computeVerticalScrollOffset() == 0 && (frameLayout2 = ((C1128710fTh) asS44S0100000_17.l0).LLLLIIIILLL) != null) {
                frameLayout2.setClipChildren(false);
            }
            C1128710fTh c1128710fTh4 = (C1128710fTh) asS44S0100000_17.l0;
            C1127050fR1 c1127050fR12 = c1128710fTh4.LLJJIJI;
            if (c1127050fR12 != null) {
                c1127050fR12.LLLFZ(c1128710fTh4.P1(), recyclerView, false);
                return;
            }
            return;
        }
        RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
        if (!(layoutManager2 instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager2) == null) {
            return;
        }
        C23250099c.LIZLLL(((C1128710fTh) asS44S0100000_17.l0).LJJLIIIJ(), C0PEM.LIZ.plus(((C1128710fTh) asS44S0100000_17.l0).LLZZ), null, new C1128530fTP((C1128710fTh) asS44S0100000_17.l0, recyclerView, gridLayoutManager, null), 2);
    }

    public static final void LJJIIJ$6(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i) {
        if (i == 0) {
            return;
        }
        if (C1123380fL6.LIZIZ()) {
            C1123380fL6.LIZJ(206, true);
        }
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = (LiveNewGiftPanelWidget) asS44S0100000_17.l0;
        liveNewGiftPanelWidget.A1(liveNewGiftPanelWidget.LLILZ);
    }

    public static final void LJJIIJ$7(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i) {
        ((LiveNewGiftPanelWidget) asS44S0100000_17.l0).LLJJIII = true;
    }

    public static final void LJJIIJ$8(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i) {
        View view;
        C781570UlH c781570UlH = ((StarCommentExtendWidget) asS44S0100000_17.l0).LLILLJJLI;
        if (c781570UlH != null && !c781570UlH.canScrollVertically(1)) {
            View view2 = ((StarCommentExtendWidget) asS44S0100000_17.l0).LLILLL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
            return;
        }
        StarCommentExtendWidget starCommentExtendWidget = (StarCommentExtendWidget) asS44S0100000_17.l0;
        if (starCommentExtendWidget.LLILZ || (view = starCommentExtendWidget.LLILLL) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view);
    }

    public static final void LJJIIZI$0(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i, int i2) {
        int iFindLastVisibleItemPosition;
        C1113190f4f c1113190f4f;
        int i3;
        if (recyclerView.canScrollVertically(1)) {
            C1113190f4f c1113190f4f2 = (C1113190f4f) asS44S0100000_17.l0;
            if (!c1113190f4f2.LJIIIIZZ && (iFindLastVisibleItemPosition = c1113190f4f2.LJIIIZ.findLastVisibleItemPosition()) > (i3 = (c1113190f4f = (C1113190f4f) asS44S0100000_17.l0).LJI)) {
                c1113190f4f.LIZJ(c1113190f4f.LJFF - (iFindLastVisibleItemPosition - i3));
                ((C1113190f4f) asS44S0100000_17.l0).LJI = iFindLastVisibleItemPosition;
                return;
            }
            return;
        }
        C1113190f4f.LIZLLL((C1113190f4f) asS44S0100000_17.l0, EnumC1091490eVf.NORMAL, 2);
    }

    public static final void LJJIIZI$1(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((GiftAnchorPanelGiftPageCenterAssem) asS44S0100000_17.l0).LLJJJIL;
        RecyclerView.LayoutManager layoutManager = null;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
        }
        if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            C1133630fbd c1133630fbd = ((GiftAnchorPanelGiftPageCenterAssem) asS44S0100000_17.l0).hp().LLILZIL;
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            c1133630fbd.LIZLLL = Math.min(iFindFirstVisibleItemPosition, c1133630fbd.LIZLLL);
            c1133630fbd.LJ = Math.max(iFindLastVisibleItemPosition, c1133630fbd.LJ);
        }
    }

    public static final void LJJIIZI$3(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i, int i2) {
        C1114850f7L c1114850f7L = (C1114850f7L) asS44S0100000_17.l0;
        if (c1114850f7L.LIZIZ) {
            c1114850f7L.LIZ += i;
        }
    }

    public static final void LJJIIZI$4(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i, int i2) {
        RecyclerView.LayoutManager layoutManager;
        GridLayoutManager gridLayoutManager;
        GiftLeafRootViewModel giftLeafRootViewModelLJJLIIIJJIZ;
        InterfaceC497601wk viewModelScope;
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ = ((C1128710fTh) asS44S0100000_17.l0).LJJLIIIIJ();
        boolean z = true;
        if (giftPanelLeafViewModelLJJLIIIIJ != null && !giftPanelLeafViewModelLJJLIIIIJ.LLJJJ && Math.abs(i2) > 0) {
            C1128590fTV.LJJJIL = SystemClock.uptimeMillis();
        }
        GiftPanelLeafViewModel giftPanelLeafViewModelLJJLIIIIJ2 = ((C1128710fTh) asS44S0100000_17.l0).LJJLIIIIJ();
        if (giftPanelLeafViewModelLJJLIIIIJ2 != null) {
            if (Math.abs(i2) <= 0) {
                z = false;
            }
            giftPanelLeafViewModelLJJLIIIIJ2.LLJJJ = z;
        }
        ((C1128710fTh) asS44S0100000_17.l0).LJJLIIIIJ();
        C1128710fTh c1128710fTh = (C1128710fTh) asS44S0100000_17.l0;
        RunnableC781530UlD runnableC781530UlD = c1128710fTh.LLJJIII;
        if (runnableC781530UlD != null) {
            layoutManager = runnableC781530UlD.getLayoutManager();
        } else {
            layoutManager = null;
        }
        if (layoutManager instanceof GridLayoutManager) {
            gridLayoutManager = (GridLayoutManager) layoutManager;
        } else {
            gridLayoutManager = null;
        }
        if (runnableC781530UlD != null && gridLayoutManager != null && (giftLeafRootViewModelLJJLIIIJJIZ = c1128710fTh.LJJLIIIJJIZ()) != null && (viewModelScope = ViewModelKt.getViewModelScope(giftLeafRootViewModelLJJLIIIJJIZ)) != null) {
            C23250099c.LIZLLL(viewModelScope, C0PEM.LIZ.plus(c1128710fTh.LLZZ), null, new C1128500fTM(c1128710fTh, runnableC781530UlD, gridLayoutManager, null), 2);
        }
    }

    public static final void LJJIIZI$5(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        View childAt;
        View childAt2;
        if (((PackageListAssem) asS44S0100000_17.l0).So() == null) {
            PackageListAssem packageListAssem = (PackageListAssem) asS44S0100000_17.l0;
            if (packageListAssem.Go().getChildCount() > 0) {
                RecyclerView.LayoutManager layoutManager = packageListAssem.Go().getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && (childAt = packageListAssem.Go().getChildAt(0)) != null && (childAt2 = packageListAssem.Go().getChildAt(packageListAssem.Go().getChildCount() - 1)) != null) {
                    int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    int itemCount = linearLayoutManager.getItemCount();
                    if (C497740JfY.LJJ()) {
                        if (iFindFirstVisibleItemPosition == 0 && childAt.getRight() <= packageListAssem.Go().getWidth()) {
                            C500260Jjc.LJIILIIL(packageListAssem.LLJIJIL);
                        } else {
                            C500260Jjc.LLFFF(packageListAssem.LLJIJIL);
                        }
                        if (iFindLastVisibleItemPosition == itemCount - 1 && childAt2.getLeft() == 0) {
                            C500260Jjc.LJIILIIL(packageListAssem.LLJI);
                            return;
                        } else {
                            C500260Jjc.LLFFF(packageListAssem.LLJI);
                            return;
                        }
                    }
                    if (iFindFirstVisibleItemPosition == 0 && childAt.getLeft() == 0) {
                        C500260Jjc.LJIILIIL(packageListAssem.LLJI);
                    } else {
                        C500260Jjc.LLFFF(packageListAssem.LLJI);
                    }
                    if (iFindLastVisibleItemPosition == itemCount - 1 && childAt2.getRight() <= packageListAssem.Go().getWidth()) {
                        C500260Jjc.LJIILIIL(packageListAssem.LLJIJIL);
                        return;
                    } else {
                        C500260Jjc.LLFFF(packageListAssem.LLJIJIL);
                        return;
                    }
                }
                return;
            }
            return;
        }
        View view = ((PackageListAssem) asS44S0100000_17.l0).LLJI;
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
        View view2 = ((PackageListAssem) asS44S0100000_17.l0).LLJIJIL;
        if (view2 == null) {
            return;
        }
        C500260Jjc.LJIILIIL(view2);
    }

    public static final void LJJIIZI$6(AsS44S0100000_17 asS44S0100000_17, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        if (!((LiveNewGiftPanelWidget) asS44S0100000_17.l0).LLLF && Math.abs(i2) > 0) {
            C1128590fTV.LJJJIL = SystemClock.uptimeMillis();
        }
        LiveNewGiftPanelWidget liveNewGiftPanelWidget = (LiveNewGiftPanelWidget) asS44S0100000_17.l0;
        if (Math.abs(i2) > 0) {
            z = true;
        } else {
            z = false;
        }
        liveNewGiftPanelWidget.LLLF = z;
    }
}
