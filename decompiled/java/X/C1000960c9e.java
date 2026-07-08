package X;

import Y.AAListenerS327S0100000_16;
import Y.AObjectS359S0100000_16;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0c9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1000960c9e extends AbstractC1000970c9f {
    public static final /* synthetic */ int LLJZIJLIL = 0;
    public float LLJLILLLLZIIL;
    public float LLJLL;
    public boolean LLJLLIL;
    public AnonymousClass0956 LLJLLL;
    public final C054G LLJZ;

    @Override // X.AbstractC1000970c9f
    public int getLayoutId() {
        return R.layout.b_i;
    }

    public static float getButtonShapePX() {
        C0C3H.LIZ.getClass();
        return C418440Gaw.LIZIZ(Integer.valueOf(C0C3H.LIZ() ? 6 : 2));
    }

    private float getEffectiveButtonShapePX() {
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.LLJILLL;
        return (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getAdStyleActionModel() == null || awemeRawAd.getAdStyleActionModel().cornerRadius == null || awemeRawAd.getAdStyleActionModel().cornerRadius.updateTuxButtonLargerCornerMap == null || !awemeRawAd.getAdStyleActionModel().cornerRadius.updateTuxButtonLargerCornerMap.ctaButton) ? getButtonShapePX() : C418440Gaw.LIZIZ(200);
    }

    @Override // X.AbstractC1000970c9f
    public final boolean LJJIII() {
        Aweme aweme = this.LLJILLL;
        if (aweme == null || aweme.getAwemeRawAd() == null || C1017070cZd.LJJJJIZL(this.LLJILLL)) {
            return false;
        }
        if (!C1017070cZd.LLJLL(this.LLJILLL)) {
            if (C1017070cZd.LJLJJI(this.LLJILLL)) {
                return false;
            }
            if (this.LLJILLL.getAwemeRawAd().getAnimationType() != 1 && this.LLJILLL.getAwemeRawAd().getAnimationType() != 3) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC1000970c9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIIJ() {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1000960c9e.LJJIIJ():boolean");
    }

    @Override // X.AbstractC1000970c9f
    public final boolean LJJIIJZLJL() {
        return C1017070cZd.LLLLIIL(this.LLJILLL);
    }

    private int getMarginBottom() {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.p6);
        AwemeRawAd awemeRawAd = this.LLJILLL.getAwemeRawAd();
        return (awemeRawAd == null || awemeRawAd.getButtonHeight() <= 0) ? dimensionPixelOffset : -C1338790kwX.LIZ(awemeRawAd.getButtonHeight());
    }

    private View getSlotView() {
        if ((getParent() instanceof View) && (getParent() instanceof C708910RrN)) {
            return (View) getParent();
        }
        return null;
    }

    @Override // X.AbstractC1000970c9f, X.InterfaceC987330bnf
    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956;
        super.LIZ();
        if (!C1017070cZd.LJJLJ(this.LLJILLL) || (anonymousClass0956 = this.LLJLLL) == null) {
            return;
        }
        anonymousClass0956.LIZIZ(null);
        this.LLJLLL = null;
    }

    @Override // X.AbstractC1000970c9f, X.InterfaceC987330bnf
    public final void LIZIZ() {
        super.LIZIZ();
        this.LLJLLIL = true;
    }

    @Override // X.InterfaceC987330bnf
    public final void LJIIIIZZ() {
        C1029590ctp.LIZJ();
        C998440c5a.LIZ(this, getMarginBottom(), DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, false);
    }

    @Override // X.InterfaceC987330bnf
    public final void LJIILLIIL() {
        if (LJJIIJ()) {
            LJJ();
            if (LJJIIJZLJL() || C1010120cOQ.LJIILJJIL(this.LLJILLL)) {
                C1029590ctp.LIZJ();
                C998440c5a.LIZ(this, 0, 0, true);
                LJ(this, new ARunnableS116S0100000_16(this, 159), true);
            } else {
                C1029590ctp.LIZJ();
                C998440c5a.LIZ(this, getMarginBottom(), 0, false);
            }
            int defaultColor = getDefaultColor();
            if (C1017070cZd.LJJJJIZL(this.LLJILLL) && this.LLJILLL.getAwemeRawAd() != null) {
                defaultColor = C1001020c9k.LIZ(getDefaultColor(), this.LLJILLL);
            } else if (!LJJIII()) {
                defaultColor = C1022030chd.LJI(getContext(), this.LLJILLL);
            }
            int i = this.LLILZ;
            LJIIJ(defaultColor, 0);
            this.LLILZ = i;
        }
    }

    @Override // X.InterfaceC987330bnf
    public final void LJIIIZ(boolean z) {
        if (this.LLJJIJI == null) {
            return;
        }
        if (C1017070cZd.LLJILJIL(this.LLJILLL)) {
            setLabelVisibility(0);
            setTopViewLivePlayingViewVisible(0);
            if (!z) {
                LJIIJ(C960203pA.LIZ(R.attr.a04, getContext()), 0);
            }
            LJJI(C1017070cZd.LJJIIZ(this.LLJILLL));
            ImageView imageView = this.LLJI;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.bc7);
                return;
            }
            return;
        }
        if (!C1017070cZd.LLJI(this.LLJILLL)) {
            return;
        }
        if (!TextUtils.isEmpty(this.LLJILLL.getAwemeRawAd().getWebUrl())) {
            setTopViewLivePlayingViewVisible(8);
            if (!z) {
                LJIIJ(C1022030chd.LJI(getContext(), this.LLJILLL), 0);
            }
            InterfaceC705900RmW interfaceC705900RmWLIZJ = C1029590ctp.LIZJ();
            Context context = getContext();
            Aweme aweme = this.LLJILLL;
            interfaceC705900RmWLIZJ.getClass();
            LJJI(C1016550cYn.LIZIZ(context, aweme, false));
            this.LLJI.setImageResource(R.drawable.cfd);
            return;
        }
        setLabelVisibility(8);
    }

    @Override // X.InterfaceC987330bnf
    public final void LJIILL(Boolean bool) {
        if (this.LLJJIJI == null || C1017070cZd.LLJI(this.LLJILLL)) {
            return;
        }
        if (C1017070cZd.LJIIIIZZ(this.LLJILLL) && !LJJIIJ()) {
            return;
        }
        if (C1017070cZd.LLD(this.LLJILLL)) {
            setLabelVisibility(0);
            setTopViewLivePlayingViewVisible(0);
            if (!bool.booleanValue()) {
                LJIIJ(C1022030chd.LJIIJJI(getContext(), this.LLJILLL), 0);
                LJJI(C1017070cZd.LJJIFFI(this.LLJILLL));
            } else {
                LJJI(C1017070cZd.LJJIFFI(this.LLJILLL));
            }
            this.LLJI.setImageResource(R.drawable.bc7);
            return;
        }
        Aweme aweme = this.LLJILLL;
        if (aweme != null && aweme.getAwemeRawAd() != null && (!TextUtils.isEmpty(this.LLJILLL.getAwemeRawAd().getWebUrl()) || C1017070cZd.LLILLIZIL(this.LLJILLL) || C1017070cZd.LLIL(this.LLJILLL) || C1017070cZd.LJJZZIII(this.LLJILLL) || C1017070cZd.LJJZZI(this.LLJILLL))) {
            if (!bool.booleanValue() && C1009740cNo.LJII(this.LLJILLL)) {
                LJIIJ(C1022030chd.LJI(getContext(), this.LLJILLL), 0);
                InterfaceC705900RmW interfaceC705900RmWLIZJ = C1029590ctp.LIZJ();
                Context context = getContext();
                Aweme aweme2 = this.LLJILLL;
                interfaceC705900RmWLIZJ.getClass();
                LJJI(C1016550cYn.LIZIZ(context, aweme2, false));
            }
            setTopViewLivePlayingViewVisible(8);
            return;
        }
        setLabelVisibility(8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Context contextLIZ;
        if (!C1017070cZd.LLIIL(this.LLJILLL)) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                double dHypot = Math.hypot(motionEvent.getX() - this.LLJLILLLLZIIL, motionEvent.getY() - this.LLJLL);
                if (getContext() != null) {
                    contextLIZ = getContext();
                } else {
                    C844470XAv.LIZ.getClass();
                    contextLIZ = C844470XAv.LIZ();
                }
                if (dHypot < ViewConfiguration.get(contextLIZ).getScaledTouchSlop() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            }
        } else {
            this.LLJLILLLLZIIL = motionEvent.getX();
            this.LLJLL = motionEvent.getY();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.AbstractC1000970c9f
    public void setLabelVisibility(int i) {
        if (i == 0 && AwemeExtKt.isAdTraffic(this.LLJILLL)) {
            this.LLJILLL.getAwemeRawAd().setIsCTAFirstShown(true);
        }
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
        View slotView = getSlotView();
        if (slotView != null) {
            Object tag = slotView.getTag(R.id.eku);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() != i) {
                slotView.setTag(R.id.ekv, Integer.valueOf(i));
            } else {
                C786410Ut5.LJLLLLLL(i, slotView);
                slotView.setTag(R.id.ekv, null);
            }
        }
    }

    public C1000960c9e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJZ = C2296808zG.LIZIZ();
        int iLIZ = C446980Hfs.LIZ(context, R.color.bw);
        C01GW c01gw = C0BSE.LIZ;
        if (!TextUtils.isEmpty((String) c01gw.getValue())) {
            try {
                iLIZ = Color.parseColor((String) c01gw.getValue());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZIZ();
            }
        }
        setDefaultColor(iLIZ);
    }

    @Override // X.InterfaceC987330bnf
    public final void LJIIJ(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(getEffectiveButtonShapePX());
        int i3 = this.LLILLL;
        if (i3 != 0 && i3 == i) {
            return;
        }
        this.LLILLL = i;
        if (C1017070cZd.LJJLJ(this.LLJILLL)) {
            gradientDrawable.setColor(i);
            setBackground(gradientDrawable);
            return;
        }
        if (i2 == 0) {
            gradientDrawable.setColor(i);
            setBackground(gradientDrawable);
            if (!C1017070cZd.LLJI(this.LLJILLL) && LJJIII()) {
                if (C1010120cOQ.LJIILIIL(this.LLJILLL)) {
                    this.LLILZLL.setTextColor(C960203pA.LIZ(R.attr.ee, getContext()));
                    this.LLJI.setImageResource(R.drawable.bc7);
                    LJJIJ(true);
                    return;
                }
                this.LLJI.setImageResource(R.drawable.cfd);
                int i4 = this.LLILZ;
                if (i4 != 0) {
                    this.LLILZLL.setTextColor(i4);
                    this.LLJI.setColorFilter(this.LLILZ);
                    this.LLILZ = 0;
                    LJJIJ(true);
                    return;
                }
                this.LLILZLL.setTextColor(C960203pA.LIZ(R.attr.eh, getContext()));
                LJJIJ(false);
                return;
            }
            this.LLILZLL.setTextColor(C960203pA.LIZ(R.attr.ee, getContext()));
            this.LLJI.setImageResource(R.drawable.bc7);
            LJJIJ(true);
            return;
        }
        gradientDrawable.setColor(getBackGroundColor());
        C421750GgH.LIZJ(this, gradientDrawable, getBackGroundColor(), i, i2, new AAListenerS327S0100000_16(this, 0));
        if (!C1017070cZd.LLJI(this.LLJILLL) && LJJIII()) {
            this.LLILZLL.setTextColor(C960203pA.LIZ(R.attr.eh, getContext()));
            this.LLJI.setImageResource(R.drawable.cfd);
            LJJIJ(false);
        } else {
            this.LLILZLL.setTextColor(C960203pA.LIZ(R.attr.ee, getContext()));
            this.LLJI.setImageResource(R.drawable.bc7);
            LJJIJ(true);
        }
    }

    @Override // X.AbstractC1000970c9f, X.InterfaceC987330bnf
    public final void LJIILJJIL(Aweme aweme, C2189821An6 c2189821An6) {
        View slotView = getSlotView();
        if (slotView != null) {
            slotView.setTag(R.id.eku, null);
        }
        super.LJIILJJIL(aweme, c2189821An6);
        if (C1017070cZd.LJJLJ(aweme)) {
            this.LLJLLL = C23250099c.LIZLLL(this.LLJZ, C315960Ca2.LIZIZ, null, new C315400CXy(C1001030c9l.class, new AObjectS359S0100000_16(this, 6), null), 2);
        }
    }
}
