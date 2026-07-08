package Y;

import X.C1084590eKX;
import X.C1084600eKY;
import X.C1092460eXE;
import X.C1094740eau;
import X.C1099190ei5;
import X.C1106110etF;
import X.C1143680frq;
import X.C1295960jpS;
import X.C12ES;
import X.C16F5;
import X.C496500JdY;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1143790fs1;
import X.ViewTreeObserverOnGlobalLayoutListenerC1151710g4n;
import Y.ARunnableS25S0400000_17;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.function.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.model.message.GiftGalleryMessage;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes18.dex */
public class AObjectS292S0200000_17 implements Function0 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS292S0200000_17 aObjectS292S0200000_17) {
        ((LiveRoomNotifyWidget) aObjectS292S0200000_17.l1).C1((Uri) aObjectS292S0200000_17.l0);
        return null;
    }

    public static final Object invoke$1(AObjectS292S0200000_17 aObjectS292S0200000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS292S0200000_17.l0;
        GiftGalleryMessage giftGalleryMessage = (GiftGalleryMessage) aObjectS292S0200000_17.l1;
        C16F5 c16f5 = liveRoomUserInfoWidget.LLLL;
        if (c16f5 != null) {
            C12ES.LJIILL(0, c16f5);
            liveRoomUserInfoWidget.LLLL.setText(C497740JfY.LJIJI(2131841883));
            C786410Ut5.x3(liveRoomUserInfoWidget.LLLL.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1151710g4n(giftGalleryMessage, liveRoomUserInfoWidget, 2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS292S0200000_17 aObjectS292S0200000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS292S0200000_17.l0;
        final Function0 function0 = (Function0) aObjectS292S0200000_17.l1;
        final C1099190ei5 c1099190ei5 = liveRoomUserInfoWidget.LLLLLZL;
        if (c1099190ei5.LIZ != null && c1099190ei5.LIZIZ != null) {
            final View viewLIZIZ = C1092460eXE.LIZIZ(c1099190ei5.LIZLLL, c1099190ei5.LJ, c1099190ei5.LJFF, c1099190ei5.LJI);
            c1099190ei5.LJIIJ = true;
            c1099190ei5.LJIIL = false;
            FrameLayout frameLayout = c1099190ei5.LIZIZ;
            C786410Ut5.LJJJJIZL(frameLayout);
            final C1295960jpS c1295960jpS = new C1295960jpS(c1099190ei5.LIZ);
            c1295960jpS.setMaintainOriginalImageBounds(true);
            C786410Ut5.s6(c1295960jpS, new ViewGroup.LayoutParams(-1, -1));
            c1295960jpS.setScaleType(ImageView.ScaleType.FIT_START);
            frameLayout.addView(c1295960jpS);
            if (C497740JfY.LJJ()) {
                C786410Ut5.Wb(c1295960jpS, -1.0f);
            }
            C1143680frq.LJIIL(c1295960jpS, "tiktok_live_revenue_guardian", "fragment_user_info_anim_lottie.zip", "images", false, new InterfaceC1143790fs1() { // from class: X.0eiB
                @Override // X.InterfaceC1143790fs1
                public final void onFinish(boolean z) {
                    C1099190ei5 c1099190ei52 = c1099190ei5;
                    if (!c1099190ei52.LJIIJ) {
                        return;
                    }
                    c1099190ei52.LJIIIZ = c1295960jpS;
                    if (z) {
                        C1295960jpS c1295960jpS2 = c1295960jpS;
                        HandlerHook.viewPost(c1295960jpS2, new ARunnableS25S0400000_17(viewLIZIZ, c1295960jpS2, c1099190ei52, function0, 5));
                    } else {
                        c1099190ei52.LIZ(function0);
                    }
                }
            }, Boolean.FALSE, new AwS585S0100000_6(c1099190ei5, 310));
        } else {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS292S0200000_17 aObjectS292S0200000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS292S0200000_17.l0;
        C1094740eau c1094740eau = (C1094740eau) aObjectS292S0200000_17.l1;
        C16F5 c16f5 = liveRoomUserInfoWidget.LLLL;
        if (c16f5 != null) {
            C12ES.LJIILL(0, c16f5);
            liveRoomUserInfoWidget.LLLL.setText(c1094740eau.LJ);
            C786410Ut5.x3(liveRoomUserInfoWidget.LLLL.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1151710g4n(c1094740eau, liveRoomUserInfoWidget, 0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AObjectS292S0200000_17 aObjectS292S0200000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS292S0200000_17.l0;
        GiftGalleryMessage giftGalleryMessage = (GiftGalleryMessage) aObjectS292S0200000_17.l1;
        C16F5 c16f5 = liveRoomUserInfoWidget.LLLL;
        if (c16f5 != null) {
            C12ES.LJIILL(0, c16f5);
            liveRoomUserInfoWidget.LLLL.setText(C497740JfY.LJIJI(2131841884));
            C786410Ut5.x3(liveRoomUserInfoWidget.LLLL.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC1151710g4n(giftGalleryMessage, liveRoomUserInfoWidget, 1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AObjectS292S0200000_17 aObjectS292S0200000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS292S0200000_17.l0;
        C496500JdY c496500JdY = (C496500JdY) aObjectS292S0200000_17.l1;
        String str = LiveRoomUserInfoWidget.Q;
        DataChannel dataChannel = liveRoomUserInfoWidget.dataChannel;
        if (dataChannel != null) {
            Boolean bool = Boolean.TRUE;
            liveRoomUserInfoWidget.x2(bool.equals(dataChannel.gg0(MuteMicChannel.class)));
            liveRoomUserInfoWidget.Q2(c496500JdY.LIZIZ, bool, Boolean.FALSE);
            liveRoomUserInfoWidget.LLLLZ.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS292S0200000_17 aObjectS292S0200000_17) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS292S0200000_17.l0;
        C1084590eKX c1084590eKX = (C1084590eKX) aObjectS292S0200000_17.l1;
        c1106110etF.LLLFZ = true;
        C1084600eKY.LJ(c1106110etF.LLILZIL.getId(), c1084590eKX);
        c1106110etF.LJIIL(c1084590eKX);
        c1106110etF.LJIIJJI(c1084590eKX);
        return Unit.LIZ;
    }

    public AObjectS292S0200000_17(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
