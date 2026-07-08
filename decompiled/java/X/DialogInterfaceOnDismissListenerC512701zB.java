package X;

import android.content.DialogInterface;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.score.CountDownForAllV2ScoreDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.anchor.LiveShowAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.audience.LiveShowAudienceWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.guest.LiveShowGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorWidget;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: renamed from: X.01zB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnDismissListenerC512701zB implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
            case 8:
                onDismiss$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onDismiss$9(this, dialogInterface);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onDismiss$10(this, dialogInterface);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onDismiss$11(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC512701zB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC512701zB dialogInterfaceOnDismissListenerC512701zB, DialogInterface dialogInterface) {
        ((LiveShowAnchorWidget) dialogInterfaceOnDismissListenerC512701zB.l0).LLJJJJ = null;
        C306901Gx.LJFF = null;
        C306901Gx.LJI = new ArrayList();
        ((LiveShowAnchorWidget) dialogInterfaceOnDismissListenerC512701zB.l0).L1(1);
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC512701zB dialogInterfaceOnDismissListenerC512701zB, DialogInterface dialogInterface) {
        String str;
        LiveShowAnchorWidget liveShowAnchorWidget = (LiveShowAnchorWidget) dialogInterfaceOnDismissListenerC512701zB.l0;
        liveShowAnchorWidget.LLJJJIL = null;
        C946060aj6<ShowConfig> c946060aj6J1 = liveShowAnchorWidget.J1(liveShowAnchorWidget.dataChannel);
        if (c946060aj6J1 != null && (str = c946060aj6J1.LIZIZ) != null && C937280aUw.LIZIZ(str)) {
            ((LiveShowAnchorWidget) dialogInterfaceOnDismissListenerC512701zB.l0).L1(1);
        }
    }

    public static final void onDismiss$10(DialogInterfaceOnDismissListenerC512701zB dialogInterfaceOnDismissListenerC512701zB, DialogInterface dialogInterface) {
        ((LiveShowModeratorWidget) dialogInterfaceOnDismissListenerC512701zB.l0).LLILLL = null;
    }

    public static final void onDismiss$11(DialogInterfaceOnDismissListenerC512701zB dialogInterfaceOnDismissListenerC512701zB, DialogInterface dialogInterface) {
        ((C438601nE) dialogInterfaceOnDismissListenerC512701zB.l0).LJJ();
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC512701zB dialogInterfaceOnDismissListenerC512701zB, DialogInterface dialogInterface) {
        ((LiveShowGuestWidget) dialogInterfaceOnDismissListenerC512701zB.l0).LLJJJ = null;
        C306901Gx.LIZIZ = false;
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC512701zB dialogInterfaceOnDismissListenerC512701zB, DialogInterface dialogInterface) {
        ((LiveShowModeratorWidget) dialogInterfaceOnDismissListenerC512701zB.l0).LLILZ = null;
        C306901Gx.LJFF = null;
        C306901Gx.LJI = new ArrayList();
    }

    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC512701zB dialogInterfaceOnDismissListenerC512701zB, DialogInterface dialogInterface) {
        ((CountDownForAllV2ScoreDialog) dialogInterfaceOnDismissListenerC512701zB.l0).LLLIIL = null;
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC512701zB dialogInterfaceOnDismissListenerC512701zB, DialogInterface dialogInterface) {
        ((LiveShowAnchorWidget) dialogInterfaceOnDismissListenerC512701zB.l0).LLJJJ = null;
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC512701zB dialogInterfaceOnDismissListenerC512701zB, DialogInterface dialogInterface) {
        ((LiveShowAudienceWidget) dialogInterfaceOnDismissListenerC512701zB.l0).LLJJJ = null;
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC512701zB dialogInterfaceOnDismissListenerC512701zB, DialogInterface dialogInterface) {
        ((BaseLiveShowWidget) dialogInterfaceOnDismissListenerC512701zB.l0).LLJILJILJ = null;
    }

    public static final void onDismiss$8(DialogInterfaceOnDismissListenerC512701zB dialogInterfaceOnDismissListenerC512701zB, DialogInterface dialogInterface) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) dialogInterfaceOnDismissListenerC512701zB.l0;
        Boolean bool = Boolean.FALSE;
        C189200o6.m2constructorimpl(bool);
        interfaceC1364105Vn.resumeWith(bool);
    }

    public static final void onDismiss$9(DialogInterfaceOnDismissListenerC512701zB dialogInterfaceOnDismissListenerC512701zB, DialogInterface dialogInterface) {
        ((LiveShowModeratorWidget) dialogInterfaceOnDismissListenerC512701zB.l0).LLILLJJLI = null;
    }
}
