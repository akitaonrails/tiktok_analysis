package X;

import Y.ACListenerS152S0100000_17;
import Y.ARunnableS23S0201000_17;
import Y.AfS153S0200000_17;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.GiftGalleryMessage;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupBlocksUI;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS383S0200000_17;

/* JADX INFO: renamed from: X.0g4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1151710g4n implements ViewTreeObserver.OnGlobalLayoutListener {
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
            case 5:
                onGlobalLayout$5(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1151710g4n viewTreeObserverOnGlobalLayoutListenerC1151710g4n) {
        C1095140ebY c1095140ebY;
        long j;
        boolean zLJIIZILJ;
        boolean zLIZLLL;
        boolean zHasOnClickListeners;
        final C1099230ei9 c1099230ei9 = ((LiveRoomUserInfoWidget) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l1).LLLLILI;
        C1094740eau c1094740eau = (C1094740eau) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l0;
        c1099230ei9.LIZJ();
        c1099230ei9.LJJI = true;
        c1099230ei9.LJJIFFI = c1094740eau;
        boolean zIsClickable = false;
        if (c1094740eau != null) {
            ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).eS1(c1099230ei9.LIZIZ, "", c1094740eau.LIZLLL, false);
        }
        FrameLayout frameLayout = c1099230ei9.LIZJ;
        if (frameLayout == null) {
            c1099230ei9.LIZIZ();
        } else {
            C786410Ut5.LJJJJIZL(frameLayout);
            DataChannel dataChannel = c1099230ei9.LIZIZ;
            if (dataChannel != null) {
                c1095140ebY = (C1095140ebY) dataChannel.gg0(FansClubChannel.class);
            } else {
                c1095140ebY = null;
            }
            if (c1095140ebY != null) {
                j = c1095140ebY.LIZ;
            } else {
                j = 0;
            }
            DataChannel dataChannel2 = c1099230ei9.LIZIZ;
            if (dataChannel2 != null) {
                zLJIIZILJ = C500260Jjc.LJIIZILJ(dataChannel2);
            } else {
                zLJIIZILJ = false;
            }
            C1096340edU c1096340edU = c1099230ei9.LJIIZILJ;
            if (c1096340edU != null) {
                zLIZLLL = c1096340edU.LIZLLL();
            } else {
                zLIZLLL = false;
            }
            C1099610eil c1099610eil = c1099230ei9.LJIIL;
            if (c1099610eil != null) {
                zHasOnClickListeners = c1099610eil.hasOnClickListeners();
            } else {
                zHasOnClickListeners = false;
            }
            c1099230ei9.LJJIIJZLJL = zHasOnClickListeners;
            C1099610eil c1099610eil2 = c1099230ei9.LJIIL;
            if (c1099610eil2 != null) {
                zIsClickable = c1099610eil2.isClickable();
            }
            c1099230ei9.LJJIIZ = zIsClickable;
            if (zLIZLLL && (zLJIIZILJ || j > 0)) {
                FrameLayout frameLayout2 = c1099230ei9.LIZJ;
                if (frameLayout2 != null) {
                    C786410Ut5.O7(frameLayout2, new ACListenerS152S0100000_17(c1099230ei9, 112));
                }
                C1099610eil c1099610eil3 = c1099230ei9.LJIIL;
                if (c1099610eil3 != null && (!c1099230ei9.LJJIIJZLJL)) {
                    C786410Ut5.H8(c1099610eil3, new ACListenerS152S0100000_17(c1099230ei9, 114));
                }
            } else {
                FrameLayout frameLayout3 = c1099230ei9.LIZJ;
                if (frameLayout3 != null) {
                    C786410Ut5.O7(frameLayout3, null);
                }
            }
            final C1295960jpS c1295960jpS = new C1295960jpS(c1099230ei9.LIZ);
            c1295960jpS.setMaintainOriginalImageBounds(true);
            C786410Ut5.s6(c1295960jpS, new ViewGroup.LayoutParams(-1, -1));
            c1295960jpS.setScaleType(ImageView.ScaleType.FIT_START);
            frameLayout.addView(c1295960jpS);
            if (C497740JfY.LJJ()) {
                C786410Ut5.Wb(c1295960jpS, -1.0f);
            }
            ImageModel imageModel = c1094740eau.LJFF;
            if (imageModel == null) {
                c1099230ei9.LJJ = true;
            } else {
                c1099230ei9.LJJIIJ.LIZ(C1121670fIL.LJ(imageModel).LJJLL(new AfS153S0200000_17(c1295960jpS, c1099230ei9, 22), new C09JN() { // from class: X.00N1
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("UserInfoGuideAnimator@c8c.startAnimation$2");
                        C1C7U.LIZIZ("UserInfoGuideAnimator@c8c.startAnimation$2");
                    }
                }));
            }
            C1143680frq.LJIIL(c1295960jpS, c1094740eau.LIZIZ, c1094740eau.LIZJ, "images", false, new InterfaceC1143790fs1() { // from class: X.0eiH
                @Override // X.InterfaceC1143790fs1
                public final void onFinish(boolean z) {
                    C1099230ei9 c1099230ei92 = c1099230ei9;
                    if (!c1099230ei92.LJJIIZI) {
                        return;
                    }
                    c1099230ei92.LJIJJ = c1295960jpS;
                    c1099230ei9.LIZLLL(c1295960jpS);
                }
            }, Boolean.FALSE, new AwS383S0200000_17(c1099230ei9, c1295960jpS, 79));
        }
        C786410Ut5.C3(((LiveRoomUserInfoWidget) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l1).LLLL.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1151710g4n);
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1151710g4n viewTreeObserverOnGlobalLayoutListenerC1151710g4n) {
        ((LiveRoomUserInfoWidget) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l1).l2((GiftGalleryMessage) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l0, false);
        C786410Ut5.C3(((LiveRoomUserInfoWidget) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l1).LLLL.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1151710g4n);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1151710g4n viewTreeObserverOnGlobalLayoutListenerC1151710g4n) {
        ((LiveRoomUserInfoWidget) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l1).l2((GiftGalleryMessage) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l0, true);
        C786410Ut5.C3(((LiveRoomUserInfoWidget) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l1).LLLL.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1151710g4n);
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1151710g4n viewTreeObserverOnGlobalLayoutListenerC1151710g4n) {
        int height;
        C1133890fc3 c1133890fc3;
        C1133890fc3 c1133890fc32;
        ViewTreeObserver viewTreeObserver;
        C1133890fc3 c1133890fc33 = (C1133890fc3) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l0;
        if (c1133890fc33 != null && c1133890fc33.getMeasuredHeight() > 0 && (c1133890fc32 = (C1133890fc3) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l0) != null && (viewTreeObserver = c1133890fc32.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1151710g4n);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1151710g4n, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C1133890fc3 c1133890fc34 = (C1133890fc3) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l0;
        if (c1133890fc34 != null && (height = c1133890fc34.getHeight()) > 0 && (c1133890fc3 = (C1133890fc3) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l0) != null) {
            float y = (((ConstraintLayout) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l1).getY() - C497740JfY.LJIIIZ(R.dimen.aq5)) - height;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1133890fc3);
            c1133890fc3.setY(y);
        }
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC1151710g4n viewTreeObserverOnGlobalLayoutListenerC1151710g4n) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        if (((ConstraintLayout) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l0).getMeasuredHeight() > 0 && (viewTreeObserver2 = ((ConstraintLayout) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l0).getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1151710g4n);
            C2187701Ajg.LIZIZ(viewTreeObserver2, viewTreeObserverOnGlobalLayoutListenerC1151710g4n, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C1133890fc3 c1133890fc3 = (C1133890fc3) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l1;
        if (c1133890fc3 != null) {
            float x = ((ConstraintLayout) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l0).getX();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1133890fc3);
            c1133890fc3.setX(x);
        }
        C1133890fc3 c1133890fc32 = (C1133890fc3) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l1;
        if (c1133890fc32 != null && (viewTreeObserver = c1133890fc32.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1151710g4n viewTreeObserverOnGlobalLayoutListenerC1151710g4n2 = new ViewTreeObserverOnGlobalLayoutListenerC1151710g4n((ConstraintLayout) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l0, (C1133890fc3) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l1, 3);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1151710g4n2);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1151710g4n2, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC1151710g4n viewTreeObserverOnGlobalLayoutListenerC1151710g4n) {
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1151710g4n);
        UniversalPopupBlocksUI universalPopupBlocksUI = (UniversalPopupBlocksUI) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l1;
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC1151710g4n.l0;
        universalPopupBlocksUI.getClass();
        HandlerHook.viewPostDelay(view, new ARunnableS23S0201000_17(0, view, universalPopupBlocksUI, 6), 16L);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ViewTreeObserverOnGlobalLayoutListenerC1151710g4n(androidx.constraintlayout.widget.ConstraintLayout r2, X.C1133890fc3 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 3 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC1151710g4n.<init>(androidx.constraintlayout.widget.ConstraintLayout, X.0fc3, int):void");
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1151710g4n(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
