package Y;

import X.AbstractC1375780luC;
import X.C111Q;
import X.C1192870h9B;
import X.C1193630hAP;
import X.C1373930lrD;
import X.C1378330lyJ;
import X.C1380390m1d;
import X.C1383390m6T;
import X.C1391850mK7;
import X.C1AF0;
import X.C20684815ws;
import X.C2188811AlT;
import X.C497820Jfg;
import X.C629480OmY;
import X.C786410Ut5;
import X.C787990Uvd;
import X.C830490Whz;
import X.C994003uc;
import X.ViewOnClickListenerC1377010lwB;
import android.app.Activity;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.prop.activity.StickerPropDetailActicity;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifEditActivity;
import com.ss.android.ugc.aweme.share.gif.ui.VideoShare2GifPreviewActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AObjectS395S0100000_21 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS395S0100000_21 aObjectS395S0100000_21) {
        AbstractC1375780luC abstractC1375780luC = (AbstractC1375780luC) aObjectS395S0100000_21.l0;
        C1378330lyJ c1378330lyJ = abstractC1375780luC.LLJ;
        if (c1378330lyJ != null) {
            c1378330lyJ.LIZIZ();
        }
        Activity activity = abstractC1375780luC.LLILZLL;
        if (activity != null && !activity.isFinishing()) {
            if (!abstractC1375780luC.isShowing()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = abstractC1375780luC.LLIZLLLIL;
                abstractC1375780luC.LLJJJIL = jCurrentTimeMillis + j;
                HandlerHook.viewPostDelay(abstractC1375780luC.LLJ, abstractC1375780luC.LLIZ, j);
                if (abstractC1375780luC.LL.getParent() != null) {
                    C786410Ut5.LJJJLZIJ(abstractC1375780luC.LL, (ViewGroup) abstractC1375780luC.LL.getParent());
                }
                try {
                    C1391850mK7.LIZIZ(abstractC1375780luC, "upload_success_popup");
                    abstractC1375780luC.showAtLocation(abstractC1375780luC.LLILZLL.getWindow().getDecorView(), 48, 0, -C497820Jfg.LIZJ(abstractC1375780luC.LLILZLL));
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJI(abstractC1375780luC);
                    C787990Uvd.LIZ.getClass();
                    C994003uc.LIZ();
                } catch (WindowManager.BadTokenException e) {
                    TryCatchGuardChecker.doCheck(e);
                    PopupManager.LIZJ(C1383390m6T.class);
                }
                C830490Whz c830490Whz = new C830490Whz();
                c830490Whz.put("enter_method", "publish_then_share");
                C20684815ws.LJIILLIIL("share_panel_show", c830490Whz);
                C1373930lrD.LIZIZ(abstractC1375780luC.LLJJIII, "publish_then_share");
                return null;
            }
            return null;
        }
        PopupManager.LIZJ(C1383390m6T.class);
        return null;
    }

    public static final Object invoke$1(AObjectS395S0100000_21 aObjectS395S0100000_21) {
        ((DetailAwemeListFragment) aObjectS395S0100000_21.l0).LJJIFFI();
        return null;
    }

    public static final Object invoke$2(AObjectS395S0100000_21 aObjectS395S0100000_21) {
        DetailAwemeListFragment detailAwemeListFragment = (DetailAwemeListFragment) aObjectS395S0100000_21.l0;
        detailAwemeListFragment.LLLIIII.get(detailAwemeListFragment.LL).showLoadMoreError();
        return null;
    }

    public static final Object invoke$3(AObjectS395S0100000_21 aObjectS395S0100000_21) {
        C1193630hAP c1193630hAP = (C1193630hAP) aObjectS395S0100000_21.l0;
        String str = VideoShare2GifEditActivity._pnsPageId;
        c1193630hAP.getClass();
        return C1192870h9B.LJFF;
    }

    public static final Object invoke$4(AObjectS395S0100000_21 aObjectS395S0100000_21) {
        C1193630hAP c1193630hAP = (C1193630hAP) aObjectS395S0100000_21.l0;
        String str = VideoShare2GifPreviewActivity._pnsPageId;
        c1193630hAP.getClass();
        return C1192870h9B.LJFF;
    }

    public static final Object invoke$5(AObjectS395S0100000_21 aObjectS395S0100000_21) {
        C1193630hAP c1193630hAP = (C1193630hAP) aObjectS395S0100000_21.l0;
        String str = StickerPropDetailActicity._pnsPageId;
        c1193630hAP.getClass();
        return C1192870h9B.LIZJ;
    }

    public static final Object invoke$6(AObjectS395S0100000_21 aObjectS395S0100000_21) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aObjectS395S0100000_21.l0;
        String str = StickerPropDetailFragment._pnsPageId;
        stickerPropDetailFragment.nS(false);
        return null;
    }

    public static final Object invoke$7(AObjectS395S0100000_21 aObjectS395S0100000_21) {
        String str;
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aObjectS395S0100000_21.l0;
        C111Q c111q = stickerPropDetailFragment.LLILLL;
        if (c111q != null && (str = stickerPropDetailFragment.LLILZ) != null) {
            c111q.LIZJ(str, 0);
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stickerIds is null.  prop page enter from:");
        sbLIZ.append(stickerPropDetailFragment.l);
        C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        C629480OmY.LJI(stickerPropDetailFragment);
        return null;
    }

    public static final Object invoke$8(AObjectS395S0100000_21 aObjectS395S0100000_21) {
        ViewOnClickListenerC1377010lwB viewOnClickListenerC1377010lwB = (ViewOnClickListenerC1377010lwB) aObjectS395S0100000_21.l0;
        C1380390m1d c1380390m1d = viewOnClickListenerC1377010lwB.LLILLJJLI;
        if (c1380390m1d != null) {
            c1380390m1d.LIZIZ();
        }
        Activity activity = viewOnClickListenerC1377010lwB.LLIZ;
        if (activity != null && !activity.isFinishing()) {
            if (!viewOnClickListenerC1377010lwB.isShowing()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = viewOnClickListenerC1377010lwB.LL;
                viewOnClickListenerC1377010lwB.LLILZIL = jCurrentTimeMillis + j;
                HandlerHook.viewPostDelay(viewOnClickListenerC1377010lwB.LLILLJJLI, viewOnClickListenerC1377010lwB.LLILZ, j);
                if (viewOnClickListenerC1377010lwB.LLILZLL.getParent() != null) {
                    C786410Ut5.LJJJLZIJ(viewOnClickListenerC1377010lwB.LLILZLL, (ViewGroup) viewOnClickListenerC1377010lwB.LLILZLL.getParent());
                }
                try {
                    C1391850mK7.LIZIZ(viewOnClickListenerC1377010lwB, "upload_success_popup");
                    viewOnClickListenerC1377010lwB.showAtLocation(viewOnClickListenerC1377010lwB.LLIZ.getWindow().getDecorView(), 48, 0, -C497820Jfg.LIZJ(viewOnClickListenerC1377010lwB.LLIZ));
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJI(viewOnClickListenerC1377010lwB);
                    C787990Uvd.LIZ.getClass();
                    C994003uc.LIZ();
                    return null;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PopupManager.LIZJ(C1383390m6T.class);
                    return null;
                }
            }
            return null;
        }
        PopupManager.LIZJ(C1383390m6T.class);
        return null;
    }

    public AObjectS395S0100000_21(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
