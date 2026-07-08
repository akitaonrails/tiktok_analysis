package X;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ad.feed.playfun.IAdPlayFunAbility;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class ViewOnTouchListenerC2260921DeU extends FrameLayout implements View.OnTouchListener, InterfaceC996800c2w {
    public SmartImageView LL;
    public TextView LLILLJJLI;
    public View LLILLL;
    public final C01GW LLILZ;
    public C2260931DeV LLILZIL;
    public boolean LLILZLL;
    public Aweme LLIZ;
    public AwemePlayFunModel LLIZLLLIL;
    public View LLJ;
    public IAdPlayFunAbility LLJI;
    public boolean LLJIJIL;
    public final GestureDetector LLJILJIL;
    public final ViewOnLayoutChangeListenerC2325311G0j LLJILJILJ;
    public final C2260941DeW LLJILLL;

    @Override // X.InterfaceC996800c2w
    public final void LIZ() {
        this.LLILZLL = true;
    }

    @Override // X.InterfaceC996800c2w
    public final void LIZIZ() {
        this.LLILZLL = false;
        getStateContext().LIZLLL();
        SmartImageView smartImageView = this.LL;
        if (smartImageView == null) {
            smartImageView = null;
        }
        smartImageView.setImageDisplayListener(null);
    }

    @Override // X.InterfaceC996800c2w
    public final void LJII() {
        this.LLJIJIL = false;
    }

    @Override // X.InterfaceC996800c2w
    public final void pause() {
        this.LLJIJIL = true;
        C2260931DeV stateContext = getStateContext();
        AbstractC2260961DeY abstractC2260961DeY = stateContext.LJIILJJIL.get(stateContext.LIZJ);
        if (abstractC2260961DeY != null) {
            abstractC2260961DeY.LIZLLL();
        }
    }

    @Override // X.InterfaceC996800c2w
    public final void resume() {
        this.LLJIJIL = false;
        C2260931DeV stateContext = getStateContext();
        AbstractC2260961DeY abstractC2260961DeY = stateContext.LJIILJJIL.get(stateContext.LIZJ);
        if (abstractC2260961DeY != null) {
            abstractC2260961DeY.LJFF();
        }
    }

    private final InterfaceC1025280cms getAdDepend() {
        return (InterfaceC1025280cms) this.LLILZ.getValue();
    }

    public final C2260981Dea LJIIIZ() {
        int iLIZJ;
        int height;
        View viewFindViewById;
        C2260981Dea c2260981Dea = new C2260981Dea();
        int iLJIIJ = C12ES.LJIIJ(getContext());
        Activity activityLIZ = C1388190mED.LIZ(getContext());
        if (activityLIZ == null || (viewFindViewById = activityLIZ.findViewById(R.id.tpm)) == null) {
            iLIZJ = C497820Jfg.LIZJ(getContext());
        } else {
            int[] iArr = new int[2];
            viewFindViewById.getLocationOnScreen(iArr);
            iLIZJ = iArr[1] + viewFindViewById.getHeight();
        }
        View view = this.LLJ;
        if (view != null) {
            int[] iArr2 = new int[2];
            view.getLocationOnScreen(iArr2);
            height = iArr2[1] - getBottomOffset();
        } else {
            int[] iArr3 = new int[2];
            getLocationOnScreen(iArr3);
            height = iArr3[1] + getHeight();
        }
        TextView textView = this.LLILLJJLI;
        if (textView == null) {
            textView = null;
        }
        textView.measure(0, 0);
        TextView textView2 = this.LLILLJJLI;
        int measuredHeight = (textView2 != null ? textView2 : null).getMeasuredHeight();
        float f = iLJIIJ;
        c2260981Dea.LIZ = (int) (0.587f * f);
        float fLIZJ = (height - iLIZJ) - ((r0 + measuredHeight) + (2 * C12ES.LIZJ(16.0f, getContext())));
        if (fLIZJ >= 0.0f) {
            c2260981Dea.LIZIZ = iLIZJ + (fLIZJ / 2.0f) + C12ES.LIZJ(16.0f, getContext());
        } else {
            c2260981Dea.LIZ += (int) fLIZJ;
            c2260981Dea.LIZIZ = iLIZJ + C12ES.LIZJ(16.0f, getContext());
        }
        c2260981Dea.LIZJ = (f - c2260981Dea.LIZ) / 2.0f;
        c2260981Dea.LIZLLL = C12ES.LIZJ(86.0f, getContext()) / c2260981Dea.LIZ;
        return c2260981Dea;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ() {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC2260921DeU.LJIIJ():void");
    }

    public int getBottomOffset() {
        IAdPlayFunAbility iAdPlayFunAbility = this.LLJI;
        if (iAdPlayFunAbility != null) {
            return iAdPlayFunAbility.Ho0();
        }
        return 0;
    }

    public final C2260931DeV getStateContext() {
        C2260931DeV c2260931DeV = this.LLILZIL;
        if (c2260931DeV != null) {
            return c2260931DeV;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    @Override // X.InterfaceC996800c2w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel r3 = r4.LLIZLLLIL
            if (r3 == 0) goto L46
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLIZ
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = X.C1017070cZd.LJJIJLIJ(r0)
            r2 = 0
            if (r0 == 0) goto L23
            com.ss.android.ugc.aweme.feed.model.IAdTranslationData r1 = r0.getTranslationData()
            if (r1 == 0) goto L23
            boolean r0 = r1 instanceof X.C996810c2x
            if (r0 == 0) goto L52
            X.0c2x r1 = (X.C996810c2x) r1
        L19:
            if (r1 == 0) goto L23
            X.0c2y r0 = r1.LIZIZ
            if (r0 == 0) goto L23
            java.lang.String r0 = r0.LIZ
            if (r0 != 0) goto L25
        L23:
            java.lang.String r0 = r3.tips
        L25:
            r4.LJLILLLLZI(r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r3.imageInfo
            if (r0 == 0) goto L46
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C438710HIf.LIZ(r0)
            X.0kl3 r1 = X.C1331660kl2.LJIIIIZZ(r0)
            java.lang.String r0 = "AdPlayFunView"
            r1.LIZLLL(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = r4.LL
            if (r0 == 0) goto L3e
            r2 = r0
        L3e:
            r1.LJJ(r2)
            X.1DeW r0 = r4.LLJILLL
            r1.LJIIJ(r0)
        L46:
            int r1 = r4.getVisibility()
            r0 = 0
            r4.setVisibility(r0)
            X.C1602160rnK.LIZIZ(r1, r0, r4)
            return
        L52:
            boolean r0 = r1 instanceof X.C997710c4P
            if (r0 == 0) goto L23
            X.0c4P r1 = (X.C997710c4P) r1
            X.01GW r0 = r1.LIZIZ
            java.lang.Object r1 = r0.getValue()
            X.0c2x r1 = (X.C996810c2x) r1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC2260921DeU.start():void");
    }

    @Override // X.InterfaceC996800c2w
    public final boolean tn() {
        if (this.LLILZIL == null) {
            return false;
        }
        return Intrinsics.LJFF(getStateContext().LIZJ, "WidgetShowState");
    }

    @Override // X.InterfaceC996800c2w
    public final void LIZLLL() {
        C2260931DeV stateContext = getStateContext();
        if (Intrinsics.LJFF(stateContext.LIZJ, "IdleState") || Intrinsics.LJFF(stateContext.LIZJ, "WidgetShowState") || Intrinsics.LJFF(stateContext.LIZJ, "FinishState")) {
            return;
        }
        AbstractC2260961DeY abstractC2260961DeY = stateContext.LJIILJJIL.get(stateContext.LIZJ);
        if (abstractC2260961DeY != null) {
            abstractC2260961DeY.LJ();
        }
        stateContext.LIZJ = "WidgetShowState";
        PointF pointFLIZ = stateContext.LIZ();
        stateContext.LJFF.setPivotX(stateContext.LIZIZ.LIZ / 2.0f);
        stateContext.LJFF.setPivotY(stateContext.LIZIZ.LIZ / 2.0f);
        C786410Ut5.Jc(stateContext.LJFF, pointFLIZ.x);
        C786410Ut5.ed(stateContext.LJFF, pointFLIZ.y);
        C786410Ut5.Ob(stateContext.LJFF, stateContext.LIZIZ.LIZLLL);
        C786410Ut5.pc(stateContext.LJFF, stateContext.LIZIZ.LIZLLL);
        C786410Ut5.Ab(stateContext.LJFF, 0.0f);
        C786410Ut5.T4(stateContext.LJI, 0.0f);
        C786410Ut5.T4(stateContext.LJ, 0.0f);
        AbstractC2260961DeY abstractC2260961DeY2 = stateContext.LJIILJJIL.get(stateContext.LIZJ);
        if (abstractC2260961DeY2 != null) {
            abstractC2260961DeY2.LIZIZ();
        }
    }

    @Override // X.InterfaceC996800c2w
    public final void LJ() {
        C2261031Def c2261031Def;
        C2260951DeX c2260951DeX;
        C2260931DeV stateContext = getStateContext();
        if (!Intrinsics.LJFF(stateContext.LIZJ, "WidgetShowState")) {
            if (Intrinsics.LJFF(stateContext.LIZJ, "EggShowState")) {
                AbstractC2260961DeY abstractC2260961DeY = stateContext.LJIILJJIL.get("EggShowState");
                if (!(abstractC2260961DeY instanceof C2261031Def) || (c2261031Def = (C2261031Def) abstractC2260961DeY) == null) {
                    return;
                }
                c2261031Def.LJII();
                return;
            }
            return;
        }
        AbstractC2260961DeY abstractC2260961DeY2 = stateContext.LJIILJJIL.get("WidgetShowState");
        if (!(abstractC2260961DeY2 instanceof C2260951DeX) || (c2260951DeX = (C2260951DeX) abstractC2260961DeY2) == null) {
            return;
        }
        C2260931DeV c2260931DeV = c2260951DeX.LIZ;
        if (c2260931DeV.LJIIIZ) {
            Animator animatorLIZ = C20516515Pv.LIZ(c2260951DeX.LIZ.LJFF, c2260931DeV.LIZ().y);
            c2260951DeX.LIZJ = animatorLIZ;
            animatorLIZ.start();
        }
    }

    @Override // X.InterfaceC996800c2w
    public Rect getWidgetRect() {
        SmartImageView smartImageView;
        if (!tn() || (smartImageView = this.LL) == null) {
            return null;
        }
        int[] iArr = new int[2];
        smartImageView.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        SmartImageView smartImageView2 = this.LL;
        if (smartImageView2 == null) {
            smartImageView2 = null;
        }
        int width = smartImageView2.getWidth() + i;
        int i3 = iArr[1];
        SmartImageView smartImageView3 = this.LL;
        return new Rect(i, i2, width, i3 + (smartImageView3 != null ? smartImageView3 : null).getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View viewFindViewById = ((View) getParent()).findViewById(R.id.bm5);
        this.LLJ = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.addOnLayoutChangeListener(this.LLJILJILJ);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getStateContext().LIZLLL();
        View view = this.LLJ;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.LLJILJILJ);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LL = (SmartImageView) findViewById(R.id.aaa);
        this.LLILLJJLI = (TextView) findViewById(R.id.aab);
        this.LLILLL = findViewById(R.id.aa_);
        SmartImageView smartImageView = this.LL;
        if (smartImageView == null) {
            smartImageView = null;
        }
        smartImageView.setOnTouchListener(this);
        TextView textView = this.LLILLJJLI;
        if (textView == null) {
            textView = null;
        }
        textView.setOnTouchListener(this);
        View view = this.LLILLL;
        (view != null ? view : null).setOnTouchListener(this);
        setStateContext(new C2260931DeV(this));
    }

    @Override // X.InterfaceC996800c2w
    public final void LIZJ(Aweme aweme) {
        AwemePlayFunModel playFunModel;
        AwemeRawAd awemeRawAd;
        this.LLIZ = aweme;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            playFunModel = awemeRawAd.getPlayFunModel();
        } else {
            playFunModel = null;
        }
        this.LLIZLLLIL = playFunModel;
        getStateContext().LIZLLL = this.LLIZLLLIL;
    }

    @Override // X.InterfaceC996800c2w
    public final void LJFF(IAdPlayFunAbility iAdPlayFunAbility) {
        this.LLJI = iAdPlayFunAbility;
    }

    @Override // X.InterfaceC996800c2w
    public final void LJI(C988710bpt c988710bpt) {
        getStateContext().LJIIJJI = c988710bpt;
    }

    @Override // X.InterfaceC996800c2w
    public final void LJIIIIZZ(DataCenter dataCenter) {
        getStateContext().LJIIIIZZ = dataCenter;
    }

    @Override // X.InterfaceC996800c2w
    public final void LJLILLLLZI(String str) {
        TextView textView = this.LLILLJJLI;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void setPaused(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setStateContext(C2260931DeV c2260931DeV) {
        this.LLILZIL = c2260931DeV;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.1DeW] */
    public ViewOnTouchListenerC2260921DeU(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(464));
        this.LLJILJIL = new GestureDetector(context, new C2325411G0t(this, 0));
        this.LLJILJILJ = new ViewOnLayoutChangeListenerC2325311G0j(this, 2);
        this.LLJILLL = new AbstractC1335900krs() { // from class: X.1DeW
            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                if (view == null) {
                    return;
                }
                ViewOnTouchListenerC2260921DeU viewOnTouchListenerC2260921DeU = this.LL;
                int visibility = viewOnTouchListenerC2260921DeU.getVisibility();
                viewOnTouchListenerC2260921DeU.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, viewOnTouchListenerC2260921DeU);
                Aweme aweme = this.LL.LLIZ;
                if (aweme == null) {
                    return;
                }
                C988530bpb c988530bpb = C988530bpb.LIZ;
                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                c988530bpb.getClass();
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "othershow_fail", awemeRawAd);
                c1022820ciuLIZLLL.LIZJ("popupbadge", "refer");
                c1022820ciuLIZLLL.LJII();
                C1017580caS.LIZIZ(this.LL.LLIZ, false, "display", null, null);
            }

            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                boolean z;
                if (view == null) {
                    return;
                }
                Aweme aweme = this.LL.LLIZ;
                if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && aweme.getAwemeRawAd().getPlayFunModel() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ViewOnTouchListenerC2260921DeU viewOnTouchListenerC2260921DeU = this.LL;
                    if (viewOnTouchListenerC2260921DeU.LLILZLL) {
                        viewOnTouchListenerC2260921DeU.getStateContext().LIZIZ = this.LL.LJIIIZ();
                        SmartImageView smartImageView = this.LL.LL;
                        if (smartImageView == null) {
                            smartImageView = null;
                        }
                        ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                        int i = this.LL.getStateContext().LIZIZ.LIZ;
                        layoutParams.width = i;
                        layoutParams.height = i;
                        SmartImageView smartImageView2 = this.LL.LL;
                        if (smartImageView2 == null) {
                            smartImageView2 = null;
                        }
                        C786410Ut5.G6(smartImageView2, layoutParams);
                        C2260931DeV stateContext = this.LL.getStateContext();
                        stateContext.LIZJ = "IdleState";
                        AbstractC2260961DeY abstractC2260961DeY = stateContext.LJIILJJIL.get("IdleState");
                        if (abstractC2260961DeY != null) {
                            abstractC2260961DeY.LIZIZ();
                        }
                    }
                }
                C1017580caS.LIZIZ(this.LL.LLIZ, true, "display", null, null);
            }
        };
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        View view2 = this.LLILLL;
        TextView textView = null;
        if (view2 == null) {
            view2 = null;
        }
        if (Intrinsics.LJFF(view, view2)) {
            getStateContext().LJIIL = "popupmask";
        } else {
            SmartImageView smartImageView = this.LL;
            if (smartImageView == null) {
                smartImageView = null;
            }
            if (Intrinsics.LJFF(view, smartImageView)) {
                C2260931DeV stateContext = getStateContext();
                if (Intrinsics.LJFF(getStateContext().LIZJ, "EggShowState")) {
                    str = "popupbadge";
                } else {
                    str = "badge";
                }
                stateContext.LJIIL = str;
            } else {
                TextView textView2 = this.LLILLJJLI;
                if (textView2 != null) {
                    textView = textView2;
                }
                if (Intrinsics.LJFF(view, textView)) {
                    getStateContext().LJIIL = "popupbadgetext";
                }
            }
        }
        if (motionEvent == null) {
            return false;
        }
        return this.LLJILJIL.onTouchEvent(motionEvent);
    }
}
