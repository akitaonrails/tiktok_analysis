package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.touchpoint.api.model.FeedToast;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility;
import com.ss.android.ugc.feed.platform.panel.share.ShareCoinIncentiveComponent;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS590S0100000_11;
import njp.a;

/* JADX INFO: renamed from: X.0Sq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.panel.share.ShareCoinIncentiveComponent$eventInit$1$1", f = "ShareCoinIncentiveComponent.kt", l = {55}, m = "invokeSuspend")
public final class C733600Sq6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ShareCoinIncentiveComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C733600Sq6(ShareCoinIncentiveComponent shareCoinIncentiveComponent, InterfaceC1364105Vn<? super C733600Sq6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = shareCoinIncentiveComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C733600Sq6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [X.0Sq7] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0SZ8 c0sz8LJLIL;
        final VideoViewCell videoViewCell;
        Aweme awemeLJIIIIZZ;
        boolean zCQ2;
        VideoShareViewModel videoShareViewModelLIZLLL;
        InterfaceC20660615sy interfaceC20660615sy;
        int[] iArrCB1;
        Pair<Integer, Integer> pairNQ2;
        C1C7U.LIZ("ShareCoinIncentiveComponent@7b59.eventInit$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("ShareCoinIncentiveComponent@7b59.eventInit$1$1");
                return objLJFF;
            }
        }
        final ShareCoinIncentiveComponent shareCoinIncentiveComponent = this.LLILLJJLI;
        if (shareCoinIncentiveComponent.LLILLL.getValue() != null && !C621180OYa.LIZIZ.LJIIL()) {
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) shareCoinIncentiveComponent.LLILZ.getValue();
            Drawable drawableBf2 = null;
            if (iViewPagerComponentAbility != null) {
                c0sz8LJLIL = iViewPagerComponentAbility.LJLIL();
            } else {
                c0sz8LJLIL = null;
            }
            if ((c0sz8LJLIL instanceof VideoViewCell) && (videoViewCell = (VideoViewCell) c0sz8LJLIL) != null) {
                IViewPagerComponentAbility iViewPagerComponentAbility2 = (IViewPagerComponentAbility) shareCoinIncentiveComponent.LLILZ.getValue();
                if (iViewPagerComponentAbility2 != null) {
                    awemeLJIIIIZZ = iViewPagerComponentAbility2.LJIIIIZZ();
                } else {
                    awemeLJIIIIZZ = null;
                }
                VideoShareViewModel videoShareViewModelLIZLLL2 = C0RLJ.LIZLLL(videoViewCell);
                if (videoShareViewModelLIZLLL2 != null && awemeLJIIIIZZ != null) {
                    zCQ2 = videoShareViewModelLIZLLL2.CQ2(awemeLJIIIIZZ);
                } else {
                    zCQ2 = false;
                }
                C128Y c128yLJI = C724240Sb0.LJI(shareCoinIncentiveComponent);
                if ((c128yLJI instanceof InterfaceC20660615sy) && (interfaceC20660615sy = (InterfaceC20660615sy) c128yLJI) != null && TextUtils.equals(interfaceC20660615sy.getSceneId(), "for_u_feed")) {
                    ?? r13 = new InterfaceC212382189k() { // from class: X.0Sq7
                        @Override // X.InterfaceC212382189k
                        public final void LIZIZ() {
                            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                            int i2 = shareCoinIncentiveComponent.LLILLJJLI;
                            Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("click_position", "close"));
                            c1894320zOY.getClass();
                            C1894320zOY.LJIILJJIL(i2, mapLJIIJ, null, null, null);
                            shareCoinIncentiveComponent.bo(1);
                        }

                        @Override // X.InterfaceC212382189k
                        public final void onShow() {
                            C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                            int i2 = shareCoinIncentiveComponent.LLILLJJLI;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            c1894320zOY.getClass();
                            C1894320zOY.LJIJJ(i2, linkedHashMap, null, null, null, "");
                            shareCoinIncentiveComponent.bo(2);
                        }

                        @Override // X.InterfaceC212382189k
                        public final void LIZ(boolean z) {
                            VideoViewCell videoViewCell2 = videoViewCell;
                            videoViewCell2.getClass();
                            VideoShareViewModel videoShareViewModelLIZLLL3 = C0RLJ.LIZLLL(videoViewCell2);
                            if (videoShareViewModelLIZLLL3 != null && !videoShareViewModelLIZLLL3.LLILZIL) {
                                videoShareViewModelLIZLLL3.LLILZIL = true;
                                videoShareViewModelLIZLLL3.setState(new AwS590S0100000_11((Long) 1000L, 548));
                            }
                            C621180OYa.LIZIZ.LJJJJ();
                            if (!z) {
                                C1894320zOY c1894320zOY = C1894320zOY.LIZ;
                                int i2 = shareCoinIncentiveComponent.LLILLJJLI;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                c1894320zOY.getClass();
                                C1894320zOY.LJIIZILJ(i2, linkedHashMap, null, null, null);
                                shareCoinIncentiveComponent.bo(0);
                            }
                        }
                    };
                    FeedToast feedToast = (FeedToast) shareCoinIncentiveComponent.LLILLL.getValue();
                    InteractRightAreaAttachAbility interactRightAreaAttachAbility = (InteractRightAreaAttachAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(videoViewCell), InteractRightAreaAttachAbility.class, null);
                    if (interactRightAreaAttachAbility != null) {
                        iArrCB1 = interactRightAreaAttachAbility.cB1();
                    } else {
                        iArrCB1 = null;
                    }
                    InteractRightAreaAttachAbility interactRightAreaAttachAbility2 = (InteractRightAreaAttachAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(videoViewCell), InteractRightAreaAttachAbility.class, null);
                    if (interactRightAreaAttachAbility2 != null) {
                        pairNQ2 = interactRightAreaAttachAbility2.nQ2();
                    } else {
                        pairNQ2 = null;
                    }
                    InteractRightAreaAttachAbility interactRightAreaAttachAbility3 = (InteractRightAreaAttachAbility) C1558520qew.LIZ(C1558420qem.LIZIZ(videoViewCell), InteractRightAreaAttachAbility.class, null);
                    if (interactRightAreaAttachAbility3 != null) {
                        drawableBf2 = interactRightAreaAttachAbility3.bf2();
                    }
                    PopupManager.LJIJI(new C212385189n(interfaceC20660615sy, feedToast, zCQ2, iArrCB1, pairNQ2, drawableBf2, r13), true);
                    C1893680zNW.LIZ.getClass();
                    C1893680zNW.LJIIJJI(38, null);
                } else if (zCQ2 && (videoShareViewModelLIZLLL = C0RLJ.LIZLLL(videoViewCell)) != null) {
                    videoShareViewModelLIZLLL.setState(new AwS590S0100000_11(videoShareViewModelLIZLLL, 546));
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareCoinIncentiveComponent@7b59.eventInit$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
