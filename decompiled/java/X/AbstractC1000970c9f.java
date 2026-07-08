package X;

import Y.ARunnableS116S0100000_16;
import Y.ARunnableS27S0101000_16;
import Y.ARunnableS49S0300000_16;
import Y.ARunnableS85S0200000_16;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import avg.f;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.ad.setting.CTAButtonShowAndColorSetting;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.TimeUnit;
import kotlin.text.u;
import mf.a;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0c9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1000970c9f extends FrameLayout implements InterfaceC987330bnf {
    public View LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public TuxTextView LLILZLL;
    public RemoteImageView LLIZ;
    public TuxIconView LLIZLLLIL;
    public View LLJ;
    public ImageView LLJI;
    public ObjectAnimator LLJIJIL;
    public final Context LLJILJIL;
    public ARunnableS27S0101000_16 LLJILJILJ;
    public Aweme LLJILLL;
    public C2189821An6 LLJJ;
    public ARunnableS27S0101000_16 LLJJI;
    public ARunnableS85S0200000_16 LLJJIII;
    public C1295960jpS LLJJIJI;
    public AnimatedDrawable2 LLJJIJIIJIL;
    public ValueAnimator LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final ARunnableS116S0100000_16 LLJJJJ;
    public int LLJJJJJIL;
    public long LLJJJJLIIL;
    public C1001000c9i LLJJL;
    public ARunnableS49S0300000_16 LLJJLIIIJLLLLLLLZ;
    public final C822660WOy LLJL;
    public boolean LLJLIL;

    public void LIZIZ() {
        this.LLJJJ = false;
        if (C1017070cZd.LJLJJI(this.LLJILLL)) {
            C2184171Adz.LIZLLL("draw_ad", "button_show", this.LLJILLL.getAwemeRawAd()).LJII();
            String str = C1017070cZd.LJLJJI(this.LLJILLL) ? "reshow" : "normal";
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", this.LLJILLL.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("button", "refer");
            c1022820ciuLIZLLL.LIZIZ(0, "is_lynx");
            c1022820ciuLIZLLL.LIZIZ(2, "button_type");
            c1022820ciuLIZLLL.LIZIZ(0, "button_show_time");
            c1022820ciuLIZLLL.LIZIZ(str, "show_type");
            c1022820ciuLIZLLL.LJII();
            IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
            if (iFeedAdService != null) {
                iFeedAdService.LJIIJJI(str);
            }
        }
    }

    @Override // X.InterfaceC987330bnf
    public final void LJIIZILJ() {
        this.LLILLJJLI = false;
        this.LLILLL = 0;
        ARunnableS27S0101000_16 aRunnableS27S0101000_16 = this.LLJILJILJ;
        if (aRunnableS27S0101000_16 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS27S0101000_16);
        }
        ARunnableS27S0101000_16 aRunnableS27S0101000_162 = this.LLJJI;
        if (aRunnableS27S0101000_162 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS27S0101000_162);
        }
        this.LLJLIL = true;
        ARunnableS49S0300000_16 aRunnableS49S0300000_16 = this.LLJJLIIIJLLLLLLLZ;
        if (aRunnableS49S0300000_16 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS49S0300000_16);
            this.LLJJLIIIJLLLLLLLZ = null;
        }
        C1001000c9i c1001000c9i = this.LLJJL;
        if (c1001000c9i != null) {
            c1001000c9i.dispose();
            this.LLJJL = null;
        }
    }

    public abstract boolean LJJIII();

    public abstract boolean LJJIIJ();

    public abstract boolean LJJIIJZLJL();

    public abstract int getLayoutId();

    @Override // X.InterfaceC987330bnf
    public View getView() {
        return this;
    }

    public abstract void setLabelVisibility(int i);

    private int getLabelBackgroundColorForPostDelay() {
        if (C1017070cZd.LLJILJIL(this.LLJILLL)) {
            return C960203pA.LIZ(R.attr.a04, getContext());
        }
        if (C1017070cZd.LLD(this.LLJILLL)) {
            return C1022030chd.LJIIJJI(this.LLJILJIL, this.LLJILLL);
        }
        int i = this.LLILZIL;
        if (i != 0) {
            this.LLILZIL = 0;
            return i;
        }
        return C1022030chd.LJI(this.LLJILJIL, this.LLJILLL);
    }

    @Override // X.InterfaceC987330bnf
    public final void LJII() {
        if (this.LLJJIJIIJIL == null || this.LLJJIJIL == null) {
            return;
        }
        HandlerHook.viewRemoveCallbacks(this.LLIZ, this.LLJJJJ);
        this.LLJJIJIL.end();
        this.LLJJIJIIJIL.LJ(0);
        this.LLJJIJIIJIL.stop();
        this.LLJJIJIIJIL = null;
    }

    public final void LJIJI() {
        this.LLILZLL.setTextColor(C960203pA.LIZ(R.attr.ee, getContext()));
        this.LLJI.setImageResource(R.drawable.bc7);
        LJJIJ(true);
    }

    public final void LJIJJ() {
        ObjectAnimator objectAnimator = this.LLJIJIL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.LLJ.clearAnimation();
        }
        View view = this.LLJ;
        if (view != null) {
            view.setBackgroundDrawable(null);
        }
    }

    public final void LJJ() {
        if (this.LLJJJIL) {
            return;
        }
        View viewLJLLJ = C786410Ut5.LJLLJ(getContext(), getLayoutId(), this);
        this.LL = viewLJLLJ;
        this.LLJ = viewLJLLJ.findViewById(R.id.g48);
        this.LLILZLL = (TuxTextView) this.LL.findViewById(R.id.nn6);
        this.LLJI = (ImageView) this.LL.findViewById(R.id.g46);
        C1295960jpS c1295960jpS = (C1295960jpS) this.LL.findViewById(R.id.yea);
        this.LLJJIJI = c1295960jpS;
        if (c1295960jpS != null) {
            try {
                c1295960jpS.setAnimation("feed_live_volume_icon_lottie.json");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LLIZ = (RemoteImageView) this.LL.findViewById(R.id.tn8);
        this.LLIZLLLIL = (TuxIconView) this.LL.findViewById(R.id.z0m);
        C421750GgH.LIZ(this);
        this.LLILLL = 0;
        this.LLJJJIL = true;
    }

    public int getBackGroundColor() {
        int i = this.LLJJJJJIL;
        Drawable background = getBackground();
        return background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : i;
    }

    public void LIZ() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.InterfaceC987330bnf
    public final void LIZLLL() {
        if (LJJIIJ()) {
            LJJ();
            LJIJJ();
            View view = this.LLJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                this.LLJ.setBackgroundResource(R.drawable.b9w);
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJ, "translationX", -r4, C12ES.LJIIJ(this.LLJILJIL));
            this.LLJIJIL = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1500L);
            this.LLJIJIL.setRepeatCount(0);
            C786410Ut5.Pd(this.LLJIJIL);
        }
    }

    @Override // X.InterfaceC987330bnf
    public final void LJIJ() {
        if (LJJIIJ()) {
            if (LJJIIJZLJL()) {
                setLabelVisibility(0);
            } else {
                setLabelVisibility(8);
            }
        }
    }

    public final void LJIJJLI() {
        if (LJJIII()) {
            int iLJI = this.LLILZIL;
            if (iLJI == 0) {
                iLJI = C1022030chd.LJI(this.LLJILJIL, this.LLJILLL);
            }
            ((C1000960c9e) this).LJIIJ(iLJI, 0);
            this.LLILZIL = 0;
            this.LLILLJJLI = true;
            Aweme aweme = this.LLJILLL;
            if (aweme != null) {
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "button_color_change", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL.LIZIZ(0, "color_change_time");
                c1022820ciuLIZLLL.LJII();
            }
            if (!C292430BdB.LIZ()) {
                ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LIZLLL(3, this.LLJILLL);
                return;
            }
            InterfaceC988260bpA interfaceC988260bpALIZIZ = C655610Pnb.LIZIZ.LIZIZ(this.LLJILLL);
            if (interfaceC988260bpALIZIZ != null) {
                interfaceC988260bpALIZIZ.f71(3);
            }
        }
    }

    public final void LJJII() {
        if (LJJIIJ() && C1017070cZd.LJLJJL(this.LLJILLL) && !this.LLJJJ) {
            HandlerHook.viewPostDelay(this, new ARunnableS116S0100000_16(this, 157), 200L);
            IFeedAdService iFeedAdService = (IFeedAdService) ServiceManager.get().getService(IFeedAdService.class);
            if (iFeedAdService != null) {
                iFeedAdService.LJIIJJI("user_interact");
            }
            this.LLJJJ = true;
        }
    }

    public InterfaceC1008930cMV getFeedItemModule() {
        IFeedService iFeedServiceLIZIZ;
        ICommerceService iCommerceService = (ICommerceService) ServiceManager.get().getService(ICommerceService.class);
        if (iCommerceService == null || (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) == null || this.LLJJ == null) {
            return null;
        }
        return iFeedServiceLIZIZ.LIZJ(getContext(), this.LLJILLL, this.LLJJ.getEventType(), false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJIJJ();
        ARunnableS85S0200000_16 aRunnableS85S0200000_16 = this.LLJJIII;
        if (aRunnableS85S0200000_16 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS85S0200000_16);
            this.LLJJIII = null;
        }
    }

    @Override // X.InterfaceC987330bnf
    public final boolean LJI() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC987330bnf
    public final void LJIIJJI() {
        LJJII();
    }

    @Override // X.InterfaceC987330bnf
    public final void LJIIL() {
        LJJII();
    }

    public int getDefaultColor() {
        return this.LLJJJJJIL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    private void setIdleUIDefaultButtonStyle(String str) {
        LJJ();
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(C960203pA.LIZ(R.attr.eh, this.LLJILJIL));
            this.LLILZLL.setText(str);
        }
        ImageView imageView = this.LLJI;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.cfd);
            C786410Ut5.LJZI(0, this.LLJI);
        }
        LJJIJ(false);
    }

    private void setLinkUIDefaultButtonStyle(String str) {
        LJJ();
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            this.LLILZLL.setText(str);
            this.LLILZLL.setTextColor(C960203pA.LIZ(R.attr.ee, this.LLJILJIL));
        }
        LJJIJ(true);
    }

    @Override // X.InterfaceC987330bnf
    public final void LJFF(long j) {
        int i;
        int duration;
        int i2;
        int iMax;
        if (!LJJIIJ()) {
            return;
        }
        this.LLJJJJLIIL = 0L;
        LJJ();
        if (!LJJIIJZLJL()) {
            LJJIIZ(j);
        } else if (C1010120cOQ.LJIJI(this.LLJILLL)) {
            if (C1010120cOQ.LJIILIIL(this.LLJILLL)) {
                i = 3;
            } else {
                i = 2;
            }
            if (C292430BdB.LIZ()) {
                InterfaceC988260bpA interfaceC988260bpALIZIZ = C655610Pnb.LIZIZ.LIZIZ(this.LLJILLL);
                if (interfaceC988260bpALIZIZ != null) {
                    interfaceC988260bpALIZIZ.f71(i);
                }
            } else {
                ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LIZLLL(i, this.LLJILLL);
            }
        }
        if (LJJIII() && !this.LLILLJJLI) {
            int iLJIL = LJIL(j);
            Aweme aweme = this.LLJILLL;
            if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && this.LLJILLL.getAwemeRawAd() != null) {
                if (C1017070cZd.LLJLL(this.LLJILLL)) {
                    iMax = Math.max(iLJIL, this.LLJILLL.getAwemeRawAd().getSlideBackInfoModel().getButtonStrategy().getShowColorSeconds() * LSPassThroughRecordSizeConfig.DEFAULT);
                } else {
                    iMax = iLJIL;
                }
                iLJIL = this.LLJILLL.getAwemeRawAd().getAnimationType() == 3 ? Math.max(iLJIL, this.LLJILLL.getAwemeRawAd().getShowButtonColorSeconds() * LSPassThroughRecordSizeConfig.DEFAULT) : iMax;
            }
            if (j != 0 && iLJIL > j && (i2 = CTAButtonShowAndColorSetting.LIZLLL) >= 0) {
                iLJIL = (int) Math.max(0L, j - ((long) i2));
            }
            ARunnableS27S0101000_16 aRunnableS27S0101000_16 = this.LLJJI;
            if (aRunnableS27S0101000_16 != null) {
                HandlerHook.viewRemoveCallbacks(this, aRunnableS27S0101000_16);
            }
            if (this.LLJJI == null) {
                this.LLJJI = new ARunnableS27S0101000_16(iLJIL, this, 14);
            }
            long j2 = iLJIL;
            if (this.LLJJJJLIIL < j2 && !C1010120cOQ.LJIILIIL(this.LLJILLL)) {
                HandlerHook.viewPostDelay(this, this.LLJJI, j2 - this.LLJJJJLIIL);
            } else {
                LJIJJLI();
            }
        }
        this.LLJJJJLIIL = 0L;
        if (this.LLJJIII == null && !C2187451AjH.LJ && C1017070cZd.LJJZZIII(this.LLJILLL)) {
            C01GW c01gw = C289890BXv.LIZ;
            if (((Number) c01gw.getValue()).intValue() > 0) {
                EnumC1001040c9m enumC1001040c9m = EnumC1001040c9m.PLAY_TIME;
                if (this.LLJILLL.getVideo() != null) {
                    duration = this.LLJILLL.getVideo().getDuration();
                } else {
                    duration = Integer.MAX_VALUE;
                }
                int iMin = Math.min(((Number) c01gw.getValue()).intValue(), duration);
                if (iMin >= duration) {
                    enumC1001040c9m = EnumC1001040c9m.FINISH_PLAY;
                }
                this.LLJJIII = new ARunnableS85S0200000_16(this, enumC1001040c9m, 43);
                HandlerHook.viewPostDelay(this, this.LLJJIII, iMin);
            }
        }
    }

    public final int LJIL(long j) {
        int i;
        int showButtonSeconds;
        int i2;
        if (C1017070cZd.LJLJJI(this.LLJILLL)) {
            showButtonSeconds = this.LLJILLL.getAwemeRawAd().getSlideBackInfoModel().getButtonStrategy().getShowSeconds();
        } else {
            Aweme aweme = this.LLJILLL;
            if (aweme != null && aweme.getAwemeRawAd() != null) {
                showButtonSeconds = this.LLJILLL.getAwemeRawAd().getShowButtonSeconds();
            } else {
                i = 0;
                if (j == 0 && i > j && (i2 = CTAButtonShowAndColorSetting.LIZJ) >= 0) {
                    return (int) Math.max(0L, j - ((long) i2));
                }
                return i;
            }
        }
        i = showButtonSeconds * LSPassThroughRecordSizeConfig.DEFAULT;
        return j == 0 ? i : i;
    }

    public final void LJJI(String str) {
        LJJ();
        C786410Ut5.LJLLLLLL(8, this.LLJ);
        if (C1017070cZd.LJJLJ(this.LLJILLL) && C1017070cZd.LJJJJIZL(this.LLJILLL)) {
            try {
                C1001020c9k.LJI(getContext(), this.LLJILLL, this.LLILZLL, this.LLJI);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZIZ();
                setLinkUIDefaultButtonStyle(str);
                return;
            }
        }
        setLinkUIDefaultButtonStyle(str);
    }

    public final void LJJIFFI(long j) {
        AwemeRawAd awemeRawAd;
        String buttonIcon;
        Aweme aweme = this.LLJILLL;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (buttonIcon = awemeRawAd.getButtonIcon()) != null && u.LJIIZILJ(buttonIcon, ".webp", false)) {
            HandlerHook.viewPostDelay(this.LLIZ, this.LLJJJJ, j);
        }
    }

    public final void LJJIIZ(long j) {
        ARunnableS27S0101000_16 aRunnableS27S0101000_16 = this.LLJILJILJ;
        if (aRunnableS27S0101000_16 != null) {
            HandlerHook.viewRemoveCallbacks(this, aRunnableS27S0101000_16);
        }
        int iLJIL = LJIL(j);
        if (this.LLJILJILJ == null) {
            this.LLJILJILJ = new ARunnableS27S0101000_16(iLJIL, this, 13);
        }
        long j2 = iLJIL;
        if (this.LLJJJJLIIL < j2 && !C1010120cOQ.LJIILJJIL(this.LLJILLL)) {
            HandlerHook.viewPostDelay(this, this.LLJILJILJ, j2 - this.LLJJJJLIIL);
        } else {
            LJJIIZI("normal");
        }
    }

    public final void LJJIIZI(String str) {
        if (C1017070cZd.LJJLIIJ(this.LLJILLL) && !LJJIIJZLJL() && !isShown()) {
            C1029590ctp.LIZLLL().LJJIJIIJI(this.LLJILJIL, this.LLJILLL);
            Aweme aweme = this.LLJILLL;
            if (aweme != null) {
                C2184171Adz.LIZLLL("draw_ad", "button_show", aweme.getAwemeRawAd()).LJIIIIZZ();
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow", this.LLJILLL.getAwemeRawAd());
                c1022820ciuLIZLLL.LIZJ("button", "refer");
                c1022820ciuLIZLLL.LIZIZ(0, "is_lynx");
                c1022820ciuLIZLLL.LIZIZ(2, "button_type");
                c1022820ciuLIZLLL.LIZIZ(0, "button_show_time");
                c1022820ciuLIZLLL.LIZIZ(str, "show_type");
                c1022820ciuLIZLLL.LJIIIIZZ();
            }
        }
        if (this.LL != null) {
            setLabelVisibility(0);
            C1029590ctp.LIZJ();
            C998440c5a.LIZ(this.LL, 0, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, true);
        }
    }

    public final void LJJIJ(boolean z) {
        Aweme aweme = this.LLJILLL;
        if (aweme != null && this.LLIZ != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null && awemeRawAd.getButtonIcon() != null) {
                C12ES.LJIILL(0, this.LLIZ);
                if (z) {
                    C786410Ut5.I5(this.LLIZ, 1.0f);
                } else {
                    C786410Ut5.I5(this.LLIZ, 0.5f);
                }
            } else {
                C12ES.LJIILL(8, this.LLIZ);
            }
        }
        Aweme aweme2 = this.LLJILLL;
        if (aweme2 != null && this.LLIZLLLIL != null) {
            if (aweme2.getAwemeRawAd() != null && C1017070cZd.LLLL(this.LLJILLL)) {
                C12ES.LJIILL(0, this.LLIZLLLIL);
                if (z) {
                    C786410Ut5.x5(this.LLIZLLLIL, 1.0f);
                    return;
                } else {
                    C786410Ut5.x5(this.LLIZLLLIL, 0.5f);
                    return;
                }
            }
            C12ES.LJIILL(8, this.LLIZLLLIL);
        }
    }

    @C14EU
    public void onDiggLocalEvent(C586100Mym c586100Mym) {
        Aweme aweme;
        if (!c586100Mym.LIZIZ && (aweme = c586100Mym.LIZ) != null && this.LLJILLL != null && TextUtils.equals(aweme.getAid(), this.LLJILLL.getAid())) {
            LJJII();
        }
    }

    @C14EU
    public void onFavoriteClickEvent(C609850Nvz c609850Nvz) {
        Aweme aweme;
        if (!c609850Nvz.LIZ && (aweme = this.LLJILLL) != null && TextUtils.equals(c609850Nvz.LIZIZ, aweme.getAid())) {
            LJJII();
        }
    }

    @C14EU
    public void onMusicClickEvent(C996690c2l c996690c2l) {
        if (!TextUtils.equals(c996690c2l.LIZ, this.LLJILLL.getAid())) {
            return;
        }
        LJJII();
    }

    public void setDefaultColor(int i) {
        this.LLJJJJJIL = i;
    }

    public void setTopViewLivePlayingViewVisible(int i) {
        C1295960jpS c1295960jpS = this.LLJJIJI;
        if (c1295960jpS != null) {
            if (i == 0) {
                if (!c1295960jpS.isAnimating()) {
                    this.LLJJIJI.playAnimation();
                }
            } else if (c1295960jpS.isAnimating()) {
                this.LLJJIJI.cancelAnimation();
            }
            C786410Ut5.LLD(i, this.LLJJIJI);
        }
    }

    @Override // X.InterfaceC987330bnf
    public void setViewOnClickListener(View.OnClickListener onClickListener) {
        if (C1848410yCV.LIZ) {
            if (onClickListener != null) {
                onClickListener = new f(onClickListener);
                onClickListener = new a(onClickListener);
            }
        } else if (onClickListener != null) {
            onClickListener = new a(onClickListener);
        }
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(onClickListener);
    }

    @Override // X.InterfaceC987330bnf
    public void setViewVisibility(int i) {
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    @Override // X.InterfaceC987330bnf
    public final void um(int i) {
        LJJ();
        if (C1017070cZd.LJJLJ(this.LLJILLL) && C1017070cZd.LJJJJIZL(this.LLJILLL)) {
            TuxTextView tuxTextView = this.LLILZLL;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(i);
            }
            if (this.LLJI != null) {
                TuxIconDrawable tuxIconDrawableLIZJ = C1001020c9k.LIZJ(i, getContext(), Integer.valueOf(R.raw.icon_chevron_right_offset_fill_ltr));
                this.LLJI.setBackground(null);
                this.LLJI.setImageDrawable(tuxIconDrawableLIZJ);
                return;
            }
            return;
        }
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColor(i);
        }
        ImageView imageView = this.LLJI;
        if (imageView != null) {
            imageView.setColorFilter(i);
            C786410Ut5.LJZI(0, this.LLJI);
        }
        if (this.LLIZ != null) {
            C786410Ut5.I5(this.LLIZ, 1.0f);
            this.LLIZ.setColorFilter(i);
        }
        if (this.LLIZLLLIL != null) {
            C786410Ut5.x5(this.LLIZLLLIL, 1.0f);
            this.LLIZLLLIL.setTintColor(i);
        }
    }

    public AbstractC1000970c9f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ void LIZJ(AbstractC1000970c9f abstractC1000970c9f, int i) {
        abstractC1000970c9f.getClass();
        C1C7U.LIZ("BaseAdBottomLabelView@6b7.colorChangeAfterSeconds$1L");
        if (abstractC1000970c9f.LJJIII()) {
            ((C1000960c9e) abstractC1000970c9f).LJIIJ(abstractC1000970c9f.getLabelBackgroundColorForPostDelay(), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            abstractC1000970c9f.LLILLJJLI = true;
            Aweme aweme = abstractC1000970c9f.LLJILLL;
            if (aweme != null) {
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "button_color_change", aweme.getAwemeRawAd());
                c1022820ciuLIZLLL.LIZIZ(Long.valueOf(((long) i) - abstractC1000970c9f.LLJJJJLIIL), "color_change_time");
                c1022820ciuLIZLLL.LJII();
            }
            if (C292430BdB.LIZ()) {
                InterfaceC988260bpA interfaceC988260bpALIZIZ = C655610Pnb.LIZIZ.LIZIZ(abstractC1000970c9f.LLJILLL);
                if (interfaceC988260bpALIZIZ != null) {
                    interfaceC988260bpALIZIZ.f71(3);
                }
            } else {
                ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LIZLLL(3, abstractC1000970c9f.LLJILLL);
            }
        }
        C1C7U.LIZIZ("BaseAdBottomLabelView@6b7.colorChangeAfterSeconds$1L");
    }

    @Override // X.InterfaceC987330bnf
    public final void LJIILIIL(int i, int i2) {
        this.LLILZ = i2;
        this.LLILZIL = i;
    }

    public void LJIILJJIL(Aweme aweme, C2189821An6 c2189821An6) {
        String strLIZIZ;
        AwemeRawAd awemeRawAd;
        boolean zLJIIZILJ;
        AwemeRawAd awemeRawAd2;
        String buttonIcon;
        AwemeRawAd awemeRawAd3;
        EventBus.LIZLLL().LJIJJ(this);
        this.LLJILLL = aweme;
        this.LLJJ = c2189821An6;
        if (!LJJIIJ()) {
            setLabelVisibility(8);
            return;
        }
        Aweme aweme2 = this.LLJILLL;
        if (aweme2 != null && AwemeExtKt.isAdTraffic(aweme2)) {
            LJJ();
            if (!LJJIIJZLJL()) {
                setLabelVisibility(8);
            } else {
                setLabelVisibility(0);
            }
            if (C1017070cZd.LLJILJIL(aweme)) {
                strLIZIZ = C1017070cZd.LJJIIZ(aweme);
            } else {
                InterfaceC705900RmW interfaceC705900RmWLIZJ = C1029590ctp.LIZJ();
                Context context = getContext();
                interfaceC705900RmWLIZJ.getClass();
                strLIZIZ = C1016550cYn.LIZIZ(context, aweme, false);
            }
            if (C1017070cZd.LJJLJLI(aweme)) {
                LJJ();
                LJIJJ();
                View view = this.LLJ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                if (C1017070cZd.LJJLJ(this.LLJILLL) && C1017070cZd.LJJJJIZL(this.LLJILLL)) {
                    try {
                        C1001020c9k.LJI(getContext(), this.LLJILLL, this.LLILZLL, this.LLJI);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1AF0.LIZIZ();
                        setIdleUIDefaultButtonStyle(strLIZIZ);
                    }
                } else {
                    setIdleUIDefaultButtonStyle(strLIZIZ);
                }
            } else {
                if (LJJIII()) {
                    strLIZIZ = this.LLJILJIL.getString(2131827877, strLIZIZ);
                }
                LJJI(strLIZIZ);
            }
            if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null) {
                if (awemeRawAd3.getButtonHeight() > 0) {
                    View view2 = this.LL;
                    int iLIZ = C1338790kwX.LIZ(awemeRawAd3.getButtonHeight());
                    if (view2 != null) {
                        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                        layoutParams.height = iLIZ;
                        C786410Ut5.W5(view2, layoutParams);
                    }
                }
                if (awemeRawAd3.getButtonFontSize() > 0) {
                    this.LLILZLL.LJJJJI(awemeRawAd3.getButtonFontSize());
                }
                if (this.LLJI != null) {
                    if (awemeRawAd3.isButtonHaveArrow()) {
                        C786410Ut5.LJZI(0, this.LLJI);
                    } else {
                        C786410Ut5.LJZI(8, this.LLJI);
                    }
                }
            }
            Aweme aweme3 = this.LLJILLL;
            if (aweme3 != null && (awemeRawAd = aweme3.getAwemeRawAd()) != null && awemeRawAd.getButtonIcon() != null) {
                Aweme aweme4 = this.LLJILLL;
                if (aweme4 != null && (awemeRawAd2 = aweme4.getAwemeRawAd()) != null && (buttonIcon = awemeRawAd2.getButtonIcon()) != null) {
                    zLJIIZILJ = u.LJIIZILJ(buttonIcon, ".webp", false);
                } else {
                    zLJIIZILJ = false;
                }
                if (zLJIIZILJ) {
                    C1324840ka2.LIZIZ(this.LLIZ, awemeRawAd.getButtonIcon(), -1, -1, false);
                } else {
                    C1324840ka2.LJIIJ(this.LLIZ, awemeRawAd.getButtonIcon(), -1, -1);
                }
            }
            Aweme aweme5 = this.LLJILLL;
            if (aweme5 != null && this.LLIZLLLIL != null && C1017070cZd.LLLL(aweme5)) {
                TuxIconView tuxIconView = this.LLIZLLLIL;
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = C1017070cZd.LJJJIL(this.LLJILLL);
                c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
                tuxIconView.setTuxIcon(c419910GdJ);
                return;
            }
            return;
        }
        setLabelVisibility(8);
    }

    public AbstractC1000970c9f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLJJJJ = new ARunnableS116S0100000_16(this, 156);
        this.LLJJJJLIIL = 0L;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = new C822660WOy(1);
        this.LLJLIL = false;
        this.LLJILJIL = context;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0c9i] */
    public final void LJ(View view, Runnable runnable, boolean z) {
        C822660WOy c822660WOy;
        if (runnable == null || view == null || !view.isAttachedToWindow()) {
            return;
        }
        if (C0J0T.LIZJ(view) && !C2214201BlK.LJIIJJI && C08AJ.LIZ(view.getContext()) != 2) {
            runnable.run();
            this.LLJL.remove(this.LLJJLIIIJLLLLLLLZ);
            C1001000c9i c1001000c9i = this.LLJJL;
            if (c1001000c9i != null) {
                c1001000c9i.dispose();
                return;
            }
            return;
        }
        if (z) {
            this.LLJLIL = false;
            ARunnableS49S0300000_16 aRunnableS49S0300000_16 = this.LLJJLIIIJLLLLLLLZ;
            if (aRunnableS49S0300000_16 != null) {
                HandlerHook.viewRemoveCallbacks(this, aRunnableS49S0300000_16);
                this.LLJJLIIIJLLLLLLLZ = null;
            }
            this.LLJJLIIIJLLLLLLLZ = new ARunnableS49S0300000_16(this, view, runnable, 10);
        }
        if (this.LLJLIL) {
            return;
        }
        if (this.LLJJL == null) {
            this.LLJJL = new C11N2<Boolean>() { // from class: X.0c9i
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onNext(Object obj) {
                    ARunnableS49S0300000_16 aRunnableS49S0300000_162;
                    if (((Boolean) obj).booleanValue()) {
                        this.LLILLJJLI.LLJLIL = true;
                        return;
                    }
                    AbstractC1000970c9f abstractC1000970c9f = this.LLILLJJLI;
                    C822660WOy c822660WOy2 = abstractC1000970c9f.LLJL;
                    if (c822660WOy2 != null && (aRunnableS49S0300000_162 = abstractC1000970c9f.LLJJLIIIJLLLLLLLZ) != null && abstractC1000970c9f.LLJLIL) {
                        c822660WOy2.remove(aRunnableS49S0300000_162);
                        AbstractC1000970c9f abstractC1000970c9f2 = this.LLILLJJLI;
                        abstractC1000970c9f2.LLJL.schedule(abstractC1000970c9f2.LLJJLIIIJLLLLLLLZ, 100L, TimeUnit.MILLISECONDS);
                    }
                    this.LLILLJJLI.LLJLIL = false;
                }
            };
            C2214201BlK.LIZLLL().LIZIZ(this.LLJJL);
        }
        ARunnableS49S0300000_16 aRunnableS49S0300000_162 = this.LLJJLIIIJLLLLLLLZ;
        if (aRunnableS49S0300000_162 != null && (c822660WOy = this.LLJL) != null) {
            c822660WOy.remove(aRunnableS49S0300000_162);
            this.LLJL.schedule(this.LLJJLIIIJLLLLLLLZ, 100L, TimeUnit.MILLISECONDS);
        }
    }
}
