package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.HangoutRoomFeedAssem;
import com.ss.android.ugc.aweme.hangout.component.newuserguide.view.HangoutNewUserGuideAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;

/* JADX INFO: renamed from: X.0KdE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class ViewTreeObserverOnPreDrawListenerC521780KdE implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            case 3:
                return onPreDraw$3(this);
            case 4:
                return onPreDraw$4(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC521780KdE viewTreeObserverOnPreDrawListenerC521780KdE) {
        InterfaceC480510Isr interfaceC480510IsrLIZIZ = ((IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)).YY().LIZIZ(((LivePlayFragment) viewTreeObserverOnPreDrawListenerC521780KdE.l0).Q0);
        if (interfaceC480510IsrLIZIZ != null && interfaceC480510IsrLIZIZ.j0(EnumC1700470uLt.TEXTURE_RENDER_DRAW_FRAME)) {
            C786410Ut5.LJZI(8, ((LivePlayFragment) viewTreeObserverOnPreDrawListenerC521780KdE.l0).LLLLLL);
            interfaceC480510IsrLIZIZ.I0();
            C0IEZ c0iez = ((LivePlayFragment) viewTreeObserverOnPreDrawListenerC521780KdE.l0).LLLLLLIL;
            if (c0iez != null) {
                c0iez.LIZ();
            }
        }
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC521780KdE viewTreeObserverOnPreDrawListenerC521780KdE) {
        C0IFA c0ifa;
        LivePlayFragment livePlayFragment = (LivePlayFragment) viewTreeObserverOnPreDrawListenerC521780KdE.l0;
        if (!livePlayFragment.G1) {
            EnterRoomConfig enterRoomConfig = livePlayFragment.g1;
            long jCurrentTimeMillis = System.currentTimeMillis() - ((LivePlayFragment) viewTreeObserverOnPreDrawListenerC521780KdE.l0).H1;
            C0IX5.LJIIIZ(enterRoomConfig);
            long j = enterRoomConfig.mRoomsData.roomId;
            if (j > 0 && (c0ifa = C0IX5.LJ.get(Long.valueOf(j))) != null) {
                c0ifa.LJI = jCurrentTimeMillis;
            }
            ((LivePlayFragment) viewTreeObserverOnPreDrawListenerC521780KdE.l0).G1 = true;
        }
        return true;
    }

    public static final boolean onPreDraw$2(ViewTreeObserverOnPreDrawListenerC521780KdE viewTreeObserverOnPreDrawListenerC521780KdE) {
        int iKp;
        HangoutRoomFeedAssem hangoutRoomFeedAssem = (HangoutRoomFeedAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0;
        if (hangoutRoomFeedAssem.LLILZ && !hangoutRoomFeedAssem.LLJJJ && !hangoutRoomFeedAssem.LLJJJJLIIL) {
            View view = hangoutRoomFeedAssem.LLJJIJIL;
            if (view == null) {
                iKp = hangoutRoomFeedAssem.kp();
            } else {
                View view2 = hangoutRoomFeedAssem.LLJJIJI;
                if (view2 != null) {
                    float top = view.getTop() + view.getHeight() + view.getTranslationY();
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        View view3 = (View) parent;
                        while (view3 != null && view3 != view2) {
                            top += view3.getTop() + view3.getTranslationY();
                            Object parent2 = view3.getParent();
                            if (!(parent2 instanceof View)) {
                                break;
                            }
                            view3 = (View) parent2;
                        }
                    }
                    iKp = (int) top;
                }
                return true;
            }
            if (iKp > 0) {
                ((HangoutRoomFeedAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0).ip(iKp);
                if (Math.abs(iKp - ((HangoutRoomFeedAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0).kp()) <= 1) {
                    ((HangoutRoomFeedAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0).hp(iKp);
                    ((HangoutRoomFeedAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0).Gp();
                }
                return true;
            }
            return true;
        }
        hangoutRoomFeedAssem.Gp();
        return true;
    }

    public static final boolean onPreDraw$3(ViewTreeObserverOnPreDrawListenerC521780KdE viewTreeObserverOnPreDrawListenerC521780KdE) {
        View view;
        View view2;
        FrameLayout.LayoutParams layoutParams;
        Object parent = ((HangoutNewUserGuideAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0).getContentView().getParent();
        if (parent instanceof ViewGroup) {
            view = (View) parent;
        } else {
            view = null;
        }
        if (view == null) {
            return true;
        }
        Object parent2 = view.getParent();
        if (!(parent2 instanceof ViewGroup) || (view2 = (View) parent2) == null) {
            return true;
        }
        View viewFindViewById = view2.findViewById(R.id.oag);
        View viewFindViewById2 = ((HangoutNewUserGuideAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0).getContentView().findViewById(R.id.zyz);
        if (viewFindViewById == null || viewFindViewById2 == null || viewFindViewById2.getHeight() <= 0) {
            return true;
        }
        ((HangoutNewUserGuideAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0).getClass();
        int bottom = viewFindViewById2.getBottom();
        Object parent3 = viewFindViewById2.getParent();
        if (parent3 instanceof View) {
            View view3 = (View) parent3;
            while (view3 != null && view3 != view2) {
                bottom += view3.getTop();
                Object parent4 = view3.getParent();
                if (!(parent4 instanceof View)) {
                    break;
                }
                view3 = (View) parent4;
            }
        }
        int iLIZIZ = bottom + ((int) C497740JfY.LIZIZ(32.0f));
        ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
        if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null) {
            return true;
        }
        if (layoutParams.topMargin != iLIZIZ) {
            layoutParams.topMargin = iLIZIZ;
            C786410Ut5.W5(viewFindViewById, layoutParams);
            return true;
        }
        C786410Ut5.LJLLLLLL(0, viewFindViewById);
        AssemVMLazy assemVMLazy = ((HangoutNewUserGuideAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0).LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = HangoutNewUserGuideAssem.LLJLIL;
        assemVMLazy.getValue().setState(AFwS237S0000000_7.get$arr$(292));
        C786410Ut5.D3(((HangoutNewUserGuideAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0).getContentView().getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC521780KdE);
        ((HangoutNewUserGuideAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0).LLJJIJIIJIL = null;
        return true;
    }

    public static final boolean onPreDraw$4(ViewTreeObserverOnPreDrawListenerC521780KdE viewTreeObserverOnPreDrawListenerC521780KdE) {
        if (((HangoutNewUserGuideAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0).tp()) {
            C786410Ut5.D3(((HangoutNewUserGuideAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0).getContentView().getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC521780KdE);
            ((HangoutNewUserGuideAssem) viewTreeObserverOnPreDrawListenerC521780KdE.l0).LLJJIJIL = null;
            return true;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC521780KdE(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
