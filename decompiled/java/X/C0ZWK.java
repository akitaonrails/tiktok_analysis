package X;

import Y.ARunnableS104S0100000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0ZWK, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZWK extends FrameLayout {
    public final C0ZWJ LL;
    public InterfaceC2187608he LLILLJJLI;
    public final FrameLayout LLILLL;
    public final FrameLayout LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    private final C0ZWL getCtaButtonFactory() {
        return (C0ZWL) this.LLJIJIL.getValue();
    }

    private final C0ZWS getGrayMaskFactory() {
        return (C0ZWS) this.LLJILLL.getValue();
    }

    private final C0ZWW getPhotoSwapPongAnimationMaskFactory() {
        return (C0ZWW) this.LLJJIJI.getValue();
    }

    private final C0ZWM getPhotoSwapReceiveMaskFactory() {
        return (C0ZWM) this.LLJJIII.getValue();
    }

    private final C0ZWU getPhotoSwapSendMaskFactory() {
        return (C0ZWU) this.LLJJI.getValue();
    }

    private final C0ZWV getPlayMaskFactory() {
        return (C0ZWV) this.LLJILJIL.getValue();
    }

    private final C0ZWN getProgressCircleFactory() {
        return (C0ZWN) this.LLJI.getValue();
    }

    private final C0ZWX getSpinnerMaskFactory() {
        return (C0ZWX) this.LLILZIL.getValue();
    }

    private final C0ZWT getSubscribeProgressCircleFactory() {
        return (C0ZWT) this.LLJ.getValue();
    }

    private final C0ZWO getTallSafetyMaskFactory() {
        return (C0ZWO) this.LLIZ.getValue();
    }

    private final C0ZWP getTallSafetyMaskWithPlayIconFactory() {
        return (C0ZWP) this.LLIZLLLIL.getValue();
    }

    private final C0ZWY getTiktokPlaceholderFactory() {
        return (C0ZWY) this.LLJILJILJ.getValue();
    }

    private final C0ZWQ getTuxIconAndTextViewFactory() {
        return (C0ZWQ) this.LLJJ.getValue();
    }

    private final C0ZWR getWideSafetyMaskFactory() {
        return (C0ZWR) this.LLILZLL.getValue();
    }

    public final InterfaceC2187608he getReportableComponent() {
        return this.LLILLJJLI;
    }

    public C0ZWK(Context context) {
        super(context, null, 0);
        C0ZWJ c0zwj = new C0ZWJ(context, null, 0);
        this.LL = c0zwj;
        FrameLayout frameLayout = new FrameLayout(context);
        this.LLILLL = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.LLILZ = frameLayout2;
        setBackgroundColor(C343420DdE.LIZJ(R.attr.a03, context));
        Iterator it2 = C1697810uHb.LJIIJJI(c0zwj, frameLayout, frameLayout2).iterator();
        while (it2.hasNext()) {
            addView((View) it2.next(), new FrameLayout.LayoutParams(-1, -1, 17));
        }
        this.LLILZIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(460));
        this.LLILZLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(466));
        this.LLIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(462));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(463));
        this.LLJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(461));
        this.LLJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(459));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(453));
        this.LLJILJIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(458));
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(464));
        this.LLJILLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(454));
        this.LLJJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(465));
        this.LLJJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(457));
        this.LLJJIII = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(456));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(455));
    }

    public final void setCallback(C0ZWH c0zwh) {
        this.LL.setCallback(c0zwh);
    }

    public final void setReportableComponent(InterfaceC2187608he interfaceC2187608he) {
        this.LLILLJJLI = interfaceC2187608he;
        this.LL.setReportableComponent(interfaceC2187608he);
    }

    public final void LIZ(ViewGroup viewGroup, InterfaceC900840ZVq interfaceC900840ZVq) {
        View viewLIZIZ;
        if (!(interfaceC900840ZVq instanceof C900800ZVm)) {
            if (interfaceC900840ZVq instanceof C0ND2) {
                C901920ZZu c901920ZZuLIZIZ = getSubscribeProgressCircleFactory().LIZIZ(getContext());
                interfaceC900840ZVq.getClass();
                c901920ZZuLIZIZ.setMsgUuid$im_camera_card_release(null);
                viewGroup.addView(c901920ZZuLIZIZ);
                return;
            }
            if (interfaceC900840ZVq instanceof C0ND5) {
                C343410DdD c343410DdDLIZIZ = getProgressCircleFactory().LIZIZ(getContext());
                interfaceC900840ZVq.getClass();
                c343410DdDLIZIZ.setProgress$im_camera_card_release(0);
                viewGroup.addView(c343410DdDLIZIZ);
                return;
            }
            if (interfaceC900840ZVq instanceof C900850ZVr) {
                viewGroup.addView(getSpinnerMaskFactory().LIZIZ(getContext()));
                return;
            }
            if (interfaceC900840ZVq instanceof C900790ZVl) {
                C343470DdJ c343470DdJLIZIZ = getTuxIconAndTextViewFactory().LIZIZ(getContext());
                C343470DdJ c343470DdJ = c343470DdJLIZIZ;
                c343470DdJ.setText(c343470DdJ.getContext().getString(2131831013));
                c343470DdJ.setIconRes(R.raw.icon_large_refresh);
                viewGroup.addView(c343470DdJLIZIZ);
                return;
            }
            if (interfaceC900840ZVq instanceof C900820ZVo) {
                viewGroup.addView(getPlayMaskFactory().LIZIZ(getContext()));
                return;
            }
            if (interfaceC900840ZVq instanceof C900780ZVk) {
                viewGroup.addView(getGrayMaskFactory().LIZIZ(getContext()));
                return;
            }
            if (interfaceC900840ZVq instanceof C900830ZVp) {
                viewGroup.addView(getTiktokPlaceholderFactory().LIZIZ(getContext()));
                return;
            }
            if (interfaceC900840ZVq instanceof C0ND3) {
                C343470DdJ c343470DdJLIZIZ2 = getTuxIconAndTextViewFactory().LIZIZ(getContext());
                C343470DdJ c343470DdJ2 = c343470DdJLIZIZ2;
                if (((C0ND3) interfaceC900840ZVq).LIZ) {
                    c343470DdJ2.setText(c343470DdJ2.getContext().getString(2131831025));
                    c343470DdJ2.setIconRes(R.raw.icon_large_video);
                } else {
                    c343470DdJ2.setText(c343470DdJ2.getContext().getString(2131831015));
                    c343470DdJ2.setIconRes(R.raw.icon_large_photo);
                }
                viewGroup.addView(c343470DdJLIZIZ2);
                return;
            }
            if (interfaceC900840ZVq instanceof C0ZW1) {
                C343440DdG c343440DdGLIZIZ = getWideSafetyMaskFactory().LIZIZ(getContext());
                c343440DdGLIZIZ.setText$im_camera_card_release(((C0ZW1) interfaceC900840ZVq).LIZ);
                viewGroup.addView(c343440DdGLIZIZ);
                return;
            }
            if (interfaceC900840ZVq instanceof C900910ZVx) {
                C900910ZVx c900910ZVx = (C900910ZVx) interfaceC900840ZVq;
                if (c900910ZVx.LIZIZ) {
                    viewLIZIZ = getTallSafetyMaskWithPlayIconFactory().LIZIZ(getContext());
                    ((C343430DdF) viewLIZIZ).setText$im_camera_card_release(c900910ZVx.LIZ);
                } else {
                    viewLIZIZ = getTallSafetyMaskFactory().LIZIZ(getContext());
                    ((C343450DdH) viewLIZIZ).setText$im_camera_card_release(c900910ZVx.LIZ);
                }
                viewGroup.addView(viewLIZIZ);
                return;
            }
            if (interfaceC900840ZVq instanceof C900750ZVh) {
                C03G6 c03g6LIZIZ = getCtaButtonFactory().LIZIZ(getContext());
                C0IBW c0ibw = C0IBW.LIZ;
                C0IBX c0ibx = ((C900750ZVh) interfaceC900840ZVq).LIZ;
                c0ibw.getClass();
                C0IBW.LIZLLL(c03g6LIZIZ, c0ibx);
                viewGroup.addView(c03g6LIZIZ);
                return;
            }
            if (interfaceC900840ZVq instanceof C900760ZVi) {
                C343370Dd9 c343370Dd9LIZIZ = getPhotoSwapReceiveMaskFactory().LIZIZ(getContext());
                C343370Dd9 c343370Dd9 = c343370Dd9LIZIZ;
                c343370Dd9.setOnRevealClickListener(((C900760ZVi) interfaceC900840ZVq).LIZ.LIZ);
                HandlerHook.viewPost(c343370Dd9.LL, new ARunnableS104S0100000_4(c343370Dd9, 106));
                viewGroup.addView(c343370Dd9LIZIZ);
                return;
            }
            if (interfaceC900840ZVq instanceof C900810ZVn) {
                viewGroup.addView(getPhotoSwapSendMaskFactory().LIZIZ(getContext()));
            } else {
                if (interfaceC900840ZVq instanceof C0ND4) {
                    C900940ZWa c900940ZWaLIZIZ = getPhotoSwapPongAnimationMaskFactory().LIZIZ(getContext());
                    c900940ZWaLIZIZ.setMessageUuid(((C0ND4) interfaceC900840ZVq).LIZ);
                    viewGroup.addView(c900940ZWaLIZIZ);
                    return;
                }
                throw new C1954807lC();
            }
        }
    }
}
