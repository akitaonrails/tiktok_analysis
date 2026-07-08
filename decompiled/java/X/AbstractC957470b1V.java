package X;

import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multihost.biz.link.MultiCoHostWidget;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.message.IMessageService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.0b1V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC957470b1V {
    public FrameLayout LL;
    public C15P7 LLILLJJLI;
    public Context LLILLL;
    public IMessageManager LLILZ;
    public DataChannel LLILZIL;
    public final C15P9 LLILZLL = new C15P9();
    public final C15P8 LLIZ = new C15P8(LJI());

    public abstract boolean LJI();

    public abstract void LJIIIIZZ();

    public final void LJ() {
        C20441214yg.LIZIZ("CoHostSubtitleComponent", "hide");
        FrameLayout frameLayout = this.LL;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        LIZLLL(false);
        C15P7 c15p7 = this.LLILLJJLI;
        if (c15p7 != null) {
            c15p7.hide();
        }
    }

    public final void LJIILIIL() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C20441214yg.LIZIZ("CoHostSubtitleComponent", "show");
        FrameLayout frameLayout = this.LL;
        if (frameLayout != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(!LJI() ? 56 : 52)));
                if (marginLayoutParams.bottomMargin != iLIZIZ) {
                    marginLayoutParams.bottomMargin = iLIZIZ;
                    C786410Ut5.a6(frameLayout, marginLayoutParams);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("setContainerBottomMargin: isAnchor=");
                    sbLIZ.append(LJI());
                    sbLIZ.append(" bottomMargin=");
                    sbLIZ.append(iLIZIZ);
                    sbLIZ.append(" dp");
                    C20441214yg.LIZIZ("CoHostSubtitleComponent", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        FrameLayout frameLayout2 = this.LL;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(0, frameLayout2);
        }
        C15P7 c15p7 = this.LLILLJJLI;
        if (c15p7 != null) {
            c15p7.LLJJI = false;
            HandlerHook.viewPost(c15p7, new ARunnableS115S0100000_15(c15p7, 99));
        }
        LIZLLL(true);
    }

    public void LJIIIZ() {
        FrameLayout frameLayout;
        LJ();
        C15P7 c15p7 = this.LLILLJJLI;
        if (c15p7 != null && (frameLayout = this.LL) != null) {
            frameLayout.removeOnLayoutChangeListener(c15p7);
        }
        this.LLILZ = null;
        this.LLILLL = null;
        this.LL = null;
        this.LLILLJJLI = null;
    }

    public void LIZLLL(boolean z) {
        View rootView;
        FrameLayout frameLayout = this.LL;
        if (frameLayout != null && (rootView = frameLayout.getRootView()) != null) {
            if (z) {
                View viewFindViewById = rootView.findViewById(R.id.qjn);
                if (viewFindViewById != null) {
                    viewFindViewById.setElevation(1.0f);
                }
                View viewFindViewById2 = rootView.findViewById(R.id.video_animate_container);
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setElevation(2.0f);
                }
                View viewFindViewById3 = rootView.findViewById(R.id.y6v);
                if (viewFindViewById3 != null) {
                    viewFindViewById3.setElevation(2.0f);
                }
                View viewFindViewById4 = rootView.findViewById(R.id.yjr);
                if (viewFindViewById4 != null) {
                    viewFindViewById4.setElevation(2.0f);
                }
                View viewFindViewById5 = rootView.findViewById(R.id.v96);
                if (viewFindViewById5 != null) {
                    viewFindViewById5.setElevation(2.0f);
                }
                View viewFindViewById6 = rootView.findViewById(R.id.ixx);
                if (viewFindViewById6 != null) {
                    viewFindViewById6.setElevation(2.0f);
                    return;
                }
                return;
            }
            View viewFindViewById7 = rootView.findViewById(R.id.qjn);
            if (viewFindViewById7 != null) {
                viewFindViewById7.setElevation(0.0f);
            }
            View viewFindViewById8 = rootView.findViewById(R.id.y6v);
            if (viewFindViewById8 != null) {
                viewFindViewById8.setElevation(0.0f);
            }
            View viewFindViewById9 = rootView.findViewById(R.id.video_animate_container);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setElevation(0.0f);
            }
            View viewFindViewById10 = rootView.findViewById(R.id.yjr);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setElevation(0.0f);
            }
            View viewFindViewById11 = rootView.findViewById(R.id.v96);
            if (viewFindViewById11 != null) {
                viewFindViewById11.setElevation(0.0f);
            }
            View viewFindViewById12 = rootView.findViewById(R.id.ixx);
            if (viewFindViewById12 == null) {
                return;
            }
            viewFindViewById12.setElevation(0.0f);
        }
    }

    public void LJIIL(MultiCoHostWidget multiCoHostWidget) {
        IMessageManager iMessageManager;
        C20441214yg.LIZIZ("CoHostSubtitleComponent", "onLoad: widget added to subtitle_container");
        this.LLILZIL = multiCoHostWidget.dataChannel;
        Context context = multiCoHostWidget.context;
        FrameLayout frameLayout = (FrameLayout) multiCoHostWidget.findViewById(R.id.wm4);
        C15P7 c15p7 = (C15P7) frameLayout.findViewById(R.id.wme);
        if (c15p7 == null) {
            c15p7 = new C15P7(context);
            frameLayout.addView(c15p7, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(266)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44))));
        }
        int visibility = c15p7.getVisibility();
        c15p7.setVisibility(4);
        C1602160rnK.LIZIZ(visibility, 4, c15p7);
        c15p7.setOnCloseClick(new AwS559S0100000_15(this, 582));
        C15P9 c15p9 = this.LLILZLL;
        c15p7.LLIZ = c15p9;
        c15p9.LIZ = new AwS610S0100000_31(c15p7, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        c15p7.LLIZLLLIL = this.LLIZ;
        frameLayout.addOnLayoutChangeListener(c15p7);
        this.LLILLL = context;
        this.LL = frameLayout;
        this.LLILLJJLI = c15p7;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            iMessageManager = ((IMessageService) C1161920gLG.LIZJ(IMessageService.class)).get(room.getId());
        } else {
            iMessageManager = null;
        }
        this.LLILZ = iMessageManager;
    }
}
