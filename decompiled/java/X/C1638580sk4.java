package X;

import Y.ACListenerS159S0100000_25;
import Y.AObjectS246S0100000_25;
import android.content.ComponentCallbacks2;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import lnn.q;

/* JADX INFO: renamed from: X.0sk4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1638580sk4 extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public final InterfaceC1648510t05 LLILLJJLI = (InterfaceC1648510t05) getDiContainer().LJIIL(null, InterfaceC1648510t05.class);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final q LLILZ = (q) getDiContainer().LJIIL(null, q.class);
    public FrameLayout LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1638580sk4.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this;
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    public final void X1() {
        String stickerId;
        Mission mission = getShortVideoContext().creativeModel.commerceModel.getMission();
        if (mission == null || (stickerId = mission.getStickerId()) == null || stickerId.length() == 0 || !this.LLILZLL) {
            return;
        }
        C990380bsa.LIZ(this.LLILZIL, C366700EZg.LIZ(-100.0d), 0, false);
        this.LLILZLL = false;
    }

    public final void o2() {
        String stickerId;
        InterfaceC535600KzW interfaceC535600KzWLIZ;
        FrameLayout frameLayoutLJLLLL;
        TextView textView;
        Mission mission = getShortVideoContext().creativeModel.commerceModel.getMission();
        if (mission == null || this.LLIZ || (stickerId = mission.getStickerId()) == null || stickerId.length() == 0) {
            return;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(C1664590tQ1.LJII(this), R.style.z9);
        Scene scene = (Scene) getDiContainer().LJIIL(null, AbstractC214814194y.class);
        if (scene != null) {
            interfaceC535600KzWLIZ = C535500KzM.LIZ(scene);
        } else {
            ComponentCallbacks2 componentCallbacks2LJII = C1664590tQ1.LJII(this);
            if (!(componentCallbacks2LJII instanceof InterfaceC535600KzW)) {
                return;
            } else {
                interfaceC535600KzWLIZ = (InterfaceC535600KzW) componentCallbacks2LJII;
            }
        }
        if (interfaceC535600KzWLIZ == null || (frameLayoutLJLLLL = interfaceC535600KzWLIZ.LJLLLL()) == null) {
            return;
        }
        ViewStub viewStub = (ViewStub) frameLayoutLJLLLL.findViewById(R.id.video_bottom_mission_container);
        if (viewStub != null && viewStub.getParent() != null) {
            viewStub.bringToFront();
            viewStub.setLayoutResource(R.layout.d3w);
            this.LLILZIL = (FrameLayout) C786410Ut5.LJLLLL(viewStub);
        }
        FrameLayout frameLayout = this.LLILZIL;
        if (frameLayout == null || (textView = (TextView) frameLayout.findViewById(R.id.cez)) == null) {
            return;
        }
        FrameLayout frameLayout2 = this.LLILZIL;
        TuxIconView tuxIconView = frameLayout2 != null ? (TuxIconView) frameLayout2.findViewById(R.id.cex) : null;
        textView.setText(C786410Ut5.L3(C1664590tQ1.LJII(this)).getText(2131837327));
        FrameLayout frameLayout3 = this.LLILZIL;
        if (frameLayout3 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zq);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
            frameLayout3.setBackground(c384050F3z.LIZ(contextThemeWrapper));
        }
        C990380bsa.LIZ(this.LLILZIL, C366700EZg.LIZ(-100.0d), 0, false);
        C990380bsa.LIZ(this.LLILZIL, C366700EZg.LIZ(40.0d), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS159S0100000_25(this, 1));
        }
        this.LLILZLL = true;
        new C11BY().LJIJI(mission, 0);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveEvent<AbstractC1627380sS0> liveEventMa2;
        LiveEvent<Boolean> liveEventDN1;
        super.onCreate();
        if (this.LLILLJJLI != null) {
            q qVar = this.LLILZ;
            if (qVar != null && (liveEventDN1 = qVar.dN1()) != null) {
                liveEventDN1.LIZ(this, new AObjectS246S0100000_25(this, 42));
            }
            q qVar2 = this.LLILZ;
            if (qVar2 == null || (liveEventMa2 = qVar2.Ma2()) == null) {
                return;
            }
            liveEventMa2.LIZ(this, new AObjectS246S0100000_25(this, 43));
        }
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1638580sk4(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void Z1(String str) {
        Mission mission = getShortVideoContext().creativeModel.commerceModel.getMission();
        if (mission != null && !TextUtils.equals(mission.getStickerId(), str) && mission.getStickerId() != null) {
            this.LLIZ = true;
            mission.setUserEverChoseDifferentSticker(true);
            new C11BY().LJIILLIIL(mission, 0);
        }
    }

    public final void W1(AbstractC1627380sS0 abstractC1627380sS0) {
        EnumC1448980noG enumC1448980noG;
        Effect effect;
        String effectId = null;
        if (abstractC1627380sS0 instanceof C1627370sRz) {
            C1627370sRz c1627370sRz = (C1627370sRz) abstractC1627380sS0;
            effect = c1627370sRz.LIZ;
            enumC1448980noG = c1627370sRz.LIZJ;
        } else if (abstractC1627380sS0 instanceof C1627360sRy) {
            enumC1448980noG = ((C1627360sRy) abstractC1627380sS0).LIZJ;
            effect = null;
        } else {
            throw new C1954807lC();
        }
        if (enumC1448980noG != EnumC1448980noG.MANUAL_SET) {
            if (effect != null) {
                effectId = effect.getEffectId();
            }
            Z1(effectId);
        }
    }
}
