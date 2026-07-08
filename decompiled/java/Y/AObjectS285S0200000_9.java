package Y;

import X.C0NVM;
import X.C0NVN;
import X.C0NVO;
import X.C0NVP;
import X.C0SZ8;
import X.C12ES;
import X.C2188811AlT;
import X.C23250099c;
import X.C594920NVa;
import X.C786410Ut5;
import X.InterfaceC497601wk;
import android.graphics.drawable.GradientDrawable;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.feed.platform.panel.player.IVideoPlayBehaviorMobAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public class AObjectS285S0200000_9 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final Object invoke$0(AObjectS285S0200000_9 aObjectS285S0200000_9) {
        PlayerController playerController = (PlayerController) aObjectS285S0200000_9.l0;
        C0SZ8 c0sz8 = (C0SZ8) aObjectS285S0200000_9.l1;
        playerController.getClass();
        return Long.valueOf(playerController.LLJLIL(c0sz8.LJIIIIZZ()));
    }

    public static final Object invoke$1(AObjectS285S0200000_9 aObjectS285S0200000_9) {
        PlayerController playerController = (PlayerController) aObjectS285S0200000_9.l0;
        C0SZ8 c0sz8 = (C0SZ8) aObjectS285S0200000_9.l1;
        playerController.getClass();
        return Long.valueOf(playerController.LLJLIL(c0sz8.LJIIIIZZ()));
    }

    public static final Object invoke$2(AObjectS285S0200000_9 aObjectS285S0200000_9) {
        ((IVideoPlayBehaviorMobAbility) aObjectS285S0200000_9.l0).Ki1(((Aweme) aObjectS285S0200000_9.l1).getAid());
        return null;
    }

    public static final Object invoke$3(AObjectS285S0200000_9 aObjectS285S0200000_9) {
        C23250099c.LIZLLL((InterfaceC497601wk) aObjectS285S0200000_9.l0, null, null, new C0NVP((C594920NVa) aObjectS285S0200000_9.l1, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS285S0200000_9 aObjectS285S0200000_9) {
        C23250099c.LIZLLL((InterfaceC497601wk) aObjectS285S0200000_9.l0, null, null, new C0NVN((C0NVO) aObjectS285S0200000_9.l1, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS285S0200000_9 aObjectS285S0200000_9) {
        C23250099c.LIZLLL((InterfaceC497601wk) aObjectS285S0200000_9.l0, null, null, new C0NVM((C594920NVa) aObjectS285S0200000_9.l1, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS285S0200000_9 aObjectS285S0200000_9) {
        StickerPropDetailFragment stickerPropDetailFragment = (StickerPropDetailFragment) aObjectS285S0200000_9.l0;
        Exception exc = (Exception) aObjectS285S0200000_9.l1;
        String str = StickerPropDetailFragment._pnsPageId;
        stickerPropDetailFragment.rS(exc);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) stickerPropDetailFragment.LLJJJ.getLayoutParams();
        if (stickerPropDetailFragment.LLJJJJ.getVisibility() == 0) {
            layoutParams.topMargin = (int) C12ES.LIZJ(52.0f, stickerPropDetailFragment.getContext());
        } else {
            layoutParams.topMargin = 0;
        }
        C786410Ut5.U6(stickerPropDetailFragment.LLJJJ, layoutParams);
        return null;
    }

    public static final Object invoke$7(AObjectS285S0200000_9 aObjectS285S0200000_9) {
        String aid;
        VideoViewCell videoViewCell = (VideoViewCell) aObjectS285S0200000_9.l0;
        Aweme aweme = (Aweme) aObjectS285S0200000_9.l1;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        videoViewCell.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = "N";
        }
        sbLIZ.append(aid);
        sbLIZ.append("/");
        sbLIZ.append(videoViewCell.hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AObjectS285S0200000_9 aObjectS285S0200000_9) {
        VideoViewCell videoViewCell = (VideoViewCell) aObjectS285S0200000_9.l0;
        Aweme aweme = (Aweme) aObjectS285S0200000_9.l1;
        GradientDrawable gradientDrawable = VideoViewCell.R0;
        videoViewCell.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getAid());
        sbLIZ.append("/");
        sbLIZ.append(videoViewCell.hashCode());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AObjectS285S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
