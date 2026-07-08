package X;

import Y.ACListenerS168S0100000_34;
import Y.ARunnableS134S0100000_34;
import Y.ARunnableS1S0104000_1;
import Y.ARunnableS27S0100100_34;
import Y.ATListenerS351S0200000_34;
import Y.ATListenerS466S0100000_34;
import android.R;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.MetricAffectingSpan;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ad.splash.utils.WeakHandler;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212931BjH extends RelativeLayout implements InterfaceC588460N6e, InterfaceC2212831Bj7 {
    public LinearLayout LL;
    public RelativeLayout LLILLJJLI;
    public FrameLayout LLILLL;
    public Space LLILZ;
    public ImageView LLILZIL;
    public TextView LLILZLL;
    public ImageView LLIZ;
    public TextureViewSurfaceTextureListenerC1322320kVy LLIZLLLIL;
    public RelativeLayout LLJ;
    public RelativeLayout LLJI;
    public TextView LLJIJIL;
    public ImageView LLJILJIL;
    public LinearLayout LLJILJILJ;
    public FrameLayout LLJILLL;
    public TextView LLJJ;
    public TextView LLJJI;
    public C0GZI LLJJIII;
    public TextView LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public long LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public long LLJJJJJIL;
    public int LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public long LLJL;
    public C2212201Bi6 LLJLIL;
    public InterfaceC2213271Bjp LLJLILLLLZIIL;
    public final WeakHandler LLJLL;
    public String LLJLLIL;
    public String LLJLLL;
    public int LLJZ;
    public PthreadTimer LLJZIJLIL;
    public C2212941BjI LLL;
    public GestureDetector LLLF;
    public C2213171Bjf LLLFF;
    public AnimatorSet LLLFFI;
    public ValueAnimator LLLFZ;
    public C19674911yN LLLI;
    public InterfaceC2213021BjQ LLLII;
    public Space LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public long LLLIIL;
    public boolean LLLIILIL;

    public final void LJIILIIL() {
        this.LLJJL = true;
        if (C2212231Bi9.LJIIIIZZ().LJIIJ) {
            this.LLJLL.removeMessages(1);
        }
    }

    @Override // X.InterfaceC2212831Bj7
    public final void onAppForeground() {
    }

    public final void LIZLLL() {
        ImageView imageView = this.LLIZ;
        if (imageView != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                    this.LLIZ.setImageBitmap(null);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C2212971BjL c2212971BjLLIZ = C2212971BjL.LIZ();
        C2213001BjO c2213001BjO = c2212971BjLLIZ.LIZ;
        if (c2213001BjO != null) {
            if (c2213001BjO.LJ) {
                try {
                    C786410Ut5.LJJIFFI(c2213001BjO.LIZJ, c2213001BjO.LIZIZ);
                    c2213001BjO.LIZ = null;
                    c2213001BjO.LJ = false;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            c2212971BjLLIZ.LIZ = null;
        }
        PthreadTimer pthreadTimer = c2212971BjLLIZ.LIZIZ;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
            c2212971BjLLIZ.LIZIZ = null;
        }
        InterfaceC2213021BjQ interfaceC2213021BjQ = this.LLLII;
        if (interfaceC2213021BjQ != null) {
            interfaceC2213021BjQ.release();
            this.LLLII = null;
            this.LLIZLLLIL = null;
        }
        PthreadTimer pthreadTimer2 = this.LLJZIJLIL;
        if (pthreadTimer2 != null) {
            pthreadTimer2.cancel();
            this.LLJZIJLIL = null;
        }
        AnimatorSet animatorSet = this.LLLFFI;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.LLLFFI = null;
        }
        ValueAnimator valueAnimator = this.LLLFZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.LLLFZ = null;
        }
    }

    public final void LJIIJJI() {
        C786410Ut5.LLIL(this.LLJJIJI, 0);
        this.LLJJIJI.setTextSize(1, 15.0f);
        this.LLJJIJI.setTextColor(-1);
        TextView textView = this.LLJJIJI;
        float bottom = this.LLILLJJLI.getBottom();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textView);
        textView.setY(bottom);
        this.LLJJIJI.setGravity(17);
        C786410Ut5.g6(this.LLJJIJI, new RelativeLayout.LayoutParams(-1, -2));
        C786410Ut5.T4(this.LLJJIJIIJIL, 0.0f);
        C786410Ut5.LJLLLLLL(0, this.LLJJIJIIJIL);
        C786410Ut5.Ld(this.LLJJIJIIJIL, this.LLILLJJLI.getBottom() - C1057810ddL.LIZIZ(50.0f, getContext()));
    }

    public final void LJIILJJIL() {
        C2212381BiO.LJ(this.LLJLIL.LLJI, "skip ad");
        InterfaceC2213271Bjp interfaceC2213271Bjp = this.LLJLILLLLZIIL;
        C2212201Bi6 c2212201Bi6 = this.LLJLIL;
        C2212921BjG c2212921BjG = (C2212921BjG) interfaceC2213271Bjp;
        if (!c2212921BjG.LIZIZ) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = c2212921BjG.LIZJ;
                long j2 = jCurrentTimeMillis - j;
                if (j != 0 && c2212201Bi6.LLJL == 2) {
                    jSONObject2.putOpt("duration", Long.valueOf(j2));
                }
                jSONObject.putOpt("ad_extra_data", jSONObject2);
                if (c2212201Bi6.LLJL == 0) {
                    jSONObject.putOpt("show_time", Long.valueOf(j2));
                }
                if (!C2211541Bh2.LIZ(c2212201Bi6.LLJJIJI)) {
                    jSONObject.putOpt("log_extra", c2212201Bi6.LLJJIJI);
                }
                jSONObject.putOpt("is_ad_event", "1");
                jSONObject.put("ad_fetch_time", c2212201Bi6.LLILLJJLI);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
            C2212051Bhr.LIZJ().LJFF("splash_ad", "skip", jSONObject, c2212201Bi6.LLJI);
            C2212441BiU.LIZ().LIZIZ();
            c2212921BjG.LIZIZ();
            InterfaceC2213131Bjb interfaceC2213131Bjb = c2212921BjG.LIZ;
            C2213201Bji c2213201Bji = new C2213201Bji();
            c2213201Bji.LIZ = 1;
            interfaceC2213131Bjb.LIZLLL(c2213201Bji);
        }
        if (this.LLLII != null) {
            this.LLJJJJLIIL = 2;
            LJIILL();
        }
        LJIILIIL();
        ((C2212921BjG) this.LLJLILLLLZIIL).LJ();
    }

    public final void LJIILL() {
        ARunnableS134S0100000_34 aRunnableS134S0100000_34 = new ARunnableS134S0100000_34(this, 84);
        if (C2212231Bi9.LJIIIIZZ().LJIIIIZZ) {
            HandlerHook.viewPost(this, aRunnableS134S0100000_34);
        } else {
            aRunnableS134S0100000_34.run();
        }
    }

    @Override // X.InterfaceC2212831Bj7
    public final void onAppBackground() {
        InterfaceC2213021BjQ interfaceC2213021BjQ = this.LLLII;
        if (interfaceC2213021BjQ != null) {
            interfaceC2213021BjQ.LJIILJJIL(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!C2212231Bi9.LJIIIIZZ().LJIIJ && this.LLJZIJLIL == null) {
            PthreadTimer pthreadTimer = new PthreadTimer("DASplashView2");
            this.LLJZIJLIL = pthreadTimer;
            pthreadTimer.scheduleAtFixedRate(new C1077210e8d(this, 1), (this.LLJJJJJIL % 1000) + 1000, 1000L);
        }
        C2212181Bi4.LJ().LJIL(System.currentTimeMillis());
        C2212921BjG c2212921BjG = (C2212921BjG) this.LLJLILLLLZIIL;
        c2212921BjG.getClass();
        c2212921BjG.LIZJ = System.currentTimeMillis();
        C786410Ut5.y3(getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.1BjN
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                C2212931BjH c2212931BjH = this.LL;
                C2212201Bi6 c2212201Bi6 = c2212931BjH.LLJLIL;
                if (c2212201Bi6 != null && c2212201Bi6.LLJL == 0 && c2212201Bi6.LLJJJIL == 0) {
                    c2212931BjH.LJII(0);
                }
                C786410Ut5.D3(this.LL.getViewTreeObserver(), this);
                if (!C2212231Bi9.LJIIIIZZ().LJIIJ) {
                    C2212931BjH c2212931BjH2 = this.LL;
                    c2212931BjH2.LLJLL.removeMessages(1);
                    c2212931BjH2.LLJLL.sendEmptyMessageDelayed(1, c2212931BjH2.LLJJJJJIL);
                }
                C2212931BjH c2212931BjH3 = this.LL;
                InterfaceC2213271Bjp interfaceC2213271Bjp = c2212931BjH3.LLJLILLLLZIIL;
                C2212201Bi6 c2212201Bi62 = c2212931BjH3.LLJLIL;
                ((C2212921BjG) interfaceC2213271Bjp).LIZ.LIZ(c2212201Bi62.LLJI, c2212201Bi62.LLJJIJI);
                return true;
            }
        });
        C2212061Bhs.LIZIZ().LIZ(LSPassThroughRecordSizeConfig.DEFAULT, this.LLJLIL.LLJI);
        String str = C2212231Bi9.LIZ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZLLL();
        C2212231Bi9.LJFF().LIZJ();
        AbstractC2212881BjC abstractC2212881BjC = C2212231Bi9.LJJJJL;
        if (abstractC2212881BjC != null) {
            abstractC2212881BjC.getClass();
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    public C2212931BjH(Context context) {
        float fLIZIZ;
        super(context);
        this.LLJJJJLIIL = -1;
        this.LLJLL = new WeakHandler(this);
        this.LLJZ = 0;
        this.LLLIIIIL = false;
        this.LLLIIIL = true;
        this.LLLIILIL = false;
        this.LLJJJ = System.currentTimeMillis();
        if (C2212231Bi9.LJIL != 0) {
            try {
                TypedArray typedArrayObtainStyledAttributes = new ContextThemeWrapper(getContext(), C2212231Bi9.LJIL).getTheme().obtainStyledAttributes(new int[]{R.attr.windowBackground});
                setBackgroundDrawable(typedArrayObtainStyledAttributes.getDrawable(0));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        this.LL = linearLayout;
        addView(linearLayout);
        this.LLILLJJLI = new RelativeLayout(context);
        C786410Ut5.e6(this.LLILLJJLI, new RelativeLayout.LayoutParams(-1, -1));
        Space space = new Space(context);
        this.LLILZ = space;
        space.setId(com.zhiliaoapp.musically.R.id.vuv);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        C786410Ut5.f6(this.LLILZ, layoutParams);
        this.LLILZ.setBackgroundColor(getResources().getColor(com.zhiliaoapp.musically.R.color.vu));
        C786410Ut5.LLIIZ(this.LLILZ, 4);
        this.LLILLL = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, this.LLILZ.getId());
        C786410Ut5.a6(this.LLILLL, layoutParams2);
        this.LLILLL.setId(com.zhiliaoapp.musically.R.id.vuu);
        this.LLIZ = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        this.LLIZ.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C786410Ut5.LJZI(8, this.LLIZ);
        C786410Ut5.c6(this.LLIZ, layoutParams3);
        this.LLIZLLLIL = new TextureViewSurfaceTextureListenerC1322320kVy(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams4.gravity = 17;
        TextureViewSurfaceTextureListenerC1322320kVy textureViewSurfaceTextureListenerC1322320kVy = this.LLIZLLLIL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(textureViewSurfaceTextureListenerC1322320kVy);
        textureViewSurfaceTextureListenerC1322320kVy.setLayoutParams(layoutParams4);
        TextureViewSurfaceTextureListenerC1322320kVy textureViewSurfaceTextureListenerC1322320kVy2 = this.LLIZLLLIL;
        int visibility = textureViewSurfaceTextureListenerC1322320kVy2.getVisibility();
        textureViewSurfaceTextureListenerC1322320kVy2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, textureViewSurfaceTextureListenerC1322320kVy2);
        this.LLJ = new RelativeLayout(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, (int) C1057810ddL.LIZIZ(60.0f, context));
        layoutParams5.gravity = 80;
        C786410Ut5.e6(this.LLJ, layoutParams5);
        this.LLJ.setId(com.zhiliaoapp.musically.R.id.vus);
        this.LLJ.setBackgroundColor(getResources().getColor(com.zhiliaoapp.musically.R.color.vo));
        C786410Ut5.LLIIL(this.LLJ, 8);
        this.LLJI = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(13, -1);
        C786410Ut5.e6(this.LLJI, layoutParams6);
        this.LLJIJIL = new TextView(context);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15, -1);
        this.LLJIJIL.setEllipsize(TextUtils.TruncateAt.END);
        this.LLJIJIL.setLines(1);
        this.LLJIJIL.setMaxWidth((int) C1057810ddL.LIZIZ(200.0f, context));
        this.LLJIJIL.setText(2131848704);
        this.LLJIJIL.setTextColor(getResources().getColor(com.zhiliaoapp.musically.R.color.vu));
        this.LLJIJIL.setTextSize(1, 20.0f);
        C786410Ut5.g6(this.LLJIJIL, layoutParams7);
        this.LLJIJIL.setId(com.zhiliaoapp.musically.R.id.vux);
        this.LLJI.addView(this.LLJIJIL);
        this.LLJILJIL = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(15, -1);
        layoutParams8.addRule(1, this.LLJIJIL.getId());
        layoutParams8.setMargins((int) C1057810ddL.LIZIZ(4.0f, context), 0, 0, 0);
        this.LLJILJIL.setPadding(0, (int) C1057810ddL.LIZIZ(1.0f, context), 0, 0);
        this.LLJILJIL.setImageDrawable(getResources().getDrawable(com.zhiliaoapp.musically.R.drawable.d98));
        C786410Ut5.c6(this.LLJILJIL, layoutParams8);
        this.LLJI.addView(this.LLJILJIL);
        this.LLJ.addView(this.LLJI);
        this.LLILZIL = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(20, -1);
        layoutParams9.addRule(10, -1);
        int iLIZIZ = (int) C1057810ddL.LIZIZ(14.0f, context);
        layoutParams9.setMargins(iLIZIZ, (int) C1057810ddL.LIZIZ(14.0f, context), 0, 0);
        layoutParams9.setMarginStart(iLIZIZ);
        layoutParams9.setMarginEnd(0);
        C786410Ut5.LJZI(4, this.LLILZIL);
        C786410Ut5.c6(this.LLILZIL, layoutParams9);
        this.LLJILJILJ = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-1, -2);
        this.LLJILJILJ.setOrientation(0);
        C786410Ut5.d6(this.LLJILJILJ, layoutParams10);
        if (!C2212231Bi9.LJIIIIZZ().LJIIL) {
            this.LLJILJILJ.setFitsSystemWindows(true);
        }
        this.LLLIIII = new Space(context);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, 1);
        layoutParams11.weight = 1.0f;
        C786410Ut5.f6(this.LLLIIII, layoutParams11);
        this.LLJILLL = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-2, (int) C1057810ddL.LIZIZ(36.0f, context));
        layoutParams12.addRule(21, -1);
        layoutParams12.addRule(10, -1);
        if (C2212231Bi9.LJIIIIZZ().LJFF) {
            fLIZIZ = C1057810ddL.LIZIZ(10.0f, context);
        } else {
            fLIZIZ = C1057810ddL.LIZIZ(16.0f, context);
        }
        int i = (int) fLIZIZ;
        layoutParams12.setMargins(0, (int) C1057810ddL.LIZIZ(8.0f, context), i, 0);
        layoutParams12.setMarginStart(0);
        layoutParams12.setMarginEnd(i);
        C786410Ut5.a6(this.LLJILLL, layoutParams12);
        C786410Ut5.LJZ(8, this.LLJILLL);
        this.LLJILLL.setId(com.zhiliaoapp.musically.R.id.vuy);
        this.LLJJ = new TextView(context);
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-2, (int) C1057810ddL.LIZIZ(24.0f, context));
        this.LLJJ.setBackgroundResource(com.zhiliaoapp.musically.R.drawable.d9d);
        this.LLJJ.setPaddingRelative((int) C1057810ddL.LIZIZ(10.0f, context), 0, (int) C1057810ddL.LIZIZ(10.0f, context), 0);
        layoutParams13.gravity = 17;
        this.LLJJ.setGravity(17);
        this.LLJJ.setTextSize(1, 12.0f);
        C786410Ut5.g6(this.LLJJ, layoutParams13);
        this.LLJILLL.addView(this.LLJJ);
        this.LLILZLL = new TextView(context);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        int iLIZIZ2 = (int) C1057810ddL.LIZIZ(9.0f, context);
        layoutParams14.setMargins(0, (int) C1057810ddL.LIZIZ(17.0f, context), iLIZIZ2, 0);
        layoutParams14.setMarginStart(0);
        layoutParams14.setMarginEnd(iLIZIZ2);
        this.LLILZLL.setPaddingRelative(3, 3, 3, 3);
        this.LLILZLL.setTextColor(ColorProtector.parseColor("#ffffff"));
        this.LLILZLL.setShadowLayer(12.0f, 0.0f, 0.0f, ColorProtector.parseColor("#7f000000"));
        this.LLILZLL.setTextSize(1, 12.0f);
        C786410Ut5.LLIL(this.LLILZLL, 8);
        C786410Ut5.g6(this.LLILZLL, layoutParams14);
        this.LLILZLL.setImportantForAccessibility(2);
        this.LLJJIII = new C0GZI(context);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams((int) C1057810ddL.LIZIZ(40.0f, context), (int) C1057810ddL.LIZIZ(40.0f, context));
        int iLIZIZ3 = (int) C1057810ddL.LIZIZ(44.0f, context);
        layoutParams15.setMargins(0, (int) C1057810ddL.LIZIZ(30.0f, context), iLIZIZ3, 0);
        layoutParams15.setMarginStart(0);
        layoutParams15.setMarginEnd(iLIZIZ3);
        C0GZI c0gzi = this.LLJJIII;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gzi);
        c0gzi.setLayoutParams(layoutParams15);
        this.LLJJIII.setGravity(17);
        this.LLJJIII.setTextSize(1, 18.0f);
        C0GZI c0gzi2 = this.LLJJIII;
        int visibility2 = c0gzi2.getVisibility();
        c0gzi2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c0gzi2);
        TextView textView = new TextView(context);
        this.LLJJI = textView;
        textView.setPaddingRelative((int) C1057810ddL.LIZIZ(4.0f, context), (int) C1057810ddL.LIZIZ(2.0f, context), (int) C1057810ddL.LIZIZ(4.0f, context), (int) C1057810ddL.LIZIZ(2.0f, context));
        this.LLJJI.setTextSize(1, 10.0f);
        this.LLJJI.setId(com.zhiliaoapp.musically.R.id.vur);
        C786410Ut5.LLIL(this.LLJJI, 8);
        TextView textView2 = new TextView(context);
        this.LLJJIJI = textView2;
        C786410Ut5.LLIL(textView2, 8);
        View view = new View(context);
        this.LLJJIJIIJIL = view;
        view.setBackgroundResource(com.zhiliaoapp.musically.R.drawable.bu0);
        C786410Ut5.LJLLLLLL(8, this.LLJJIJIIJIL);
        C786410Ut5.W5(this.LLJJIJIIJIL, new RelativeLayout.LayoutParams(-1, (int) C1057810ddL.LIZIZ(50.0f, context)));
        View view2 = new View(getContext());
        this.LLJJIJIL = view2;
        view2.setBackgroundResource(com.zhiliaoapp.musically.R.drawable.d9_);
        C786410Ut5.LJLLLLLL(8, this.LLJJIJIL);
        C786410Ut5.W5(this.LLJJIJIL, new RelativeLayout.LayoutParams(-1, (int) C1057810ddL.LIZIZ(105.0f, getContext())));
        this.LL.addView(this.LLILLJJLI);
        this.LLILLL.addView(this.LLIZ);
        this.LLILLL.addView(this.LLIZLLLIL);
        this.LLILLL.addView(this.LLJ);
        this.LLILLJJLI.addView(this.LLILLL);
        this.LLILLJJLI.addView(this.LLILZ);
        this.LLILLJJLI.addView(this.LLJJIJIL);
        this.LLJILJILJ.addView(this.LLILZIL);
        this.LLJILJILJ.addView(this.LLLIIII);
        this.LLILLJJLI.addView(this.LLJILJILJ);
        this.LLILLJJLI.addView(this.LLJJIJIIJIL);
        this.LLILLJJLI.addView(this.LLJJIJI);
        int i2 = C2212231Bi9.LJIJI;
        if (i2 != 0) {
            this.LLILZLL.setText(i2);
        } else {
            this.LLILZLL.setText(2131848709);
        }
        int i3 = C2212231Bi9.LJIJJ;
        if (i3 != 0) {
            this.LLJJ.setText(i3);
        } else {
            this.LLJJ.setText(2131848706);
        }
        if (C2212231Bi9.LJJIIJZLJL == 1) {
            this.LLIZ.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.LLLIIIL = true;
    }

    public static void LJIIL(C2212201Bi6 c2212201Bi6) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("show_expected", Integer.valueOf(c2212201Bi6.LLJ));
        jSONObject.putOpt("show_type", "not_real_time");
        int i = C2212231Bi9.LJJIJIIJI;
        if (i != -1) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
            }
            jSONObject.put("awemelaunch", i2);
        }
        jSONObject.put("ad_sequence", C2212141Bi0.LJIIIIZZ().LJIIJJI());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.putOpt("ad_extra_data", jSONObject);
        jSONObject2.put("is_ad_event", "1");
        if (!C2211541Bh2.LIZ(c2212201Bi6.LLJJIJI)) {
            jSONObject2.put("log_extra", c2212201Bi6.LLJJIJI);
        }
        jSONObject2.put("ad_fetch_time", c2212201Bi6.LLILLJJLI);
        C2212051Bhr.LIZJ().LJFF("splash_ad", "show", jSONObject2, c2212201Bi6.LLJI);
        C2213281Bjq.LIZJ.getValue().LIZIZ(null, c2212201Bi6.LLJI, c2212201Bi6.LLJLL, c2212201Bi6.LLJJIJI, true, -1L, null);
    }

    private void setImageTouchListener(C2212201Bi6 c2212201Bi6) {
        setOnTouchListener(new ATListenerS351S0200000_34(c2212201Bi6, this, 1));
    }

    private void setSkipClickListener(C2212201Bi6 c2212201Bi6) {
        C786410Ut5.O7(this.LLJILLL, new ACListenerS168S0100000_34(this, 50));
    }

    private void setupAdLabelLayout(C2212201Bi6 c2212201Bi6) {
        C2212721Biw c2212721Biw = c2212201Bi6.LLLII;
        if (c2212721Biw == null) {
            return;
        }
        if (!TextUtils.isEmpty(c2212721Biw.LIZLLL)) {
            this.LLJJI.setText(c2212721Biw.LIZLLL);
        }
        if (!TextUtils.isEmpty(c2212721Biw.LIZJ)) {
            this.LLJJI.setTextColor(C2212161Bi2.LJIIL(c2212721Biw.LIZJ, "#ffffff"));
        }
        if (!TextUtils.isEmpty(c2212721Biw.LIZ)) {
            GradientDrawable gradientDrawableLJ = LJ(2);
            gradientDrawableLJ.setColor(C2212161Bi2.LJIIL(c2212721Biw.LIZ, "#32222222"));
            this.LLJJI.setBackground(gradientDrawableLJ);
        }
    }

    private void setupSkipButtonHitArea(C2212201Bi6 c2212201Bi6) {
        C2212511Bib c2212511Bib = c2212201Bi6.LLLIIII;
        if (c2212511Bib != null) {
            boolean z = true;
            if ((c2212511Bib.LJIIIIZZ & 1) == 0) {
                z = false;
                if (c2212511Bib == null) {
                    return;
                }
            }
            if (this.LLJILLL.getVisibility() == 0 && this.LLJILLL.getParent() != null) {
                if (z) {
                    int iLIZIZ = (int) C1057810ddL.LIZIZ(c2212511Bib.LIZIZ, getContext());
                    int iLIZIZ2 = (int) C1057810ddL.LIZIZ(c2212511Bib.LIZJ, getContext());
                    TextView textView = this.LLJJ;
                    HandlerHook.viewPost((View) textView.getParent(), new ARunnableS1S0104000_1(textView, iLIZIZ, iLIZIZ, iLIZIZ2, iLIZIZ2, 2));
                    this.LLJILLL.setOnTouchListener(new ATListenerS466S0100000_34(this, 0));
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    this.LLJILLL.setPaddingRelative((int) C1057810ddL.LIZIZ(c2212511Bib.LIZJ, getContext()), (int) C1057810ddL.LIZIZ(14.0f, getContext()), (int) C1057810ddL.LIZIZ(16.0f, getContext()), (int) C1057810ddL.LIZIZ(c2212511Bib.LIZIZ, getContext()));
                    C786410Ut5.a6(this.LLJILLL, layoutParams);
                    C786410Ut5.O7(this.LLJILLL, new View.OnClickListener() { // from class: X.1Bjd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                        }
                    });
                    C786410Ut5.T7(this.LLJJ, new ACListenerS168S0100000_34(this, 49));
                    return;
                }
                FrameLayout frameLayout = this.LLJILLL;
                int i = c2212511Bib.LIZIZ;
                int i2 = c2212511Bib.LIZJ;
                HandlerHook.viewPost((View) frameLayout.getParent(), new ARunnableS1S0104000_1(frameLayout, i, i, i2, i2, 2));
                this.LLJILJILJ.setPaddingRelative(0, 0, 0, c2212511Bib.LIZIZ);
            }
        }
    }

    private void setupSkipLayout(C2212201Bi6 c2212201Bi6) {
        this.LLJZ = (int) (this.LLJJJJJIL / 1000);
        C0GZI c0gzi = this.LLJJIII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(this.LLJZ);
        c0gzi.setText(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIII.setDuration(this.LLJJJJJIL);
        C2212511Bib c2212511Bib = c2212201Bi6.LLLIIII;
        if (c2212511Bib != null && !TextUtils.isEmpty(c2212511Bib.LJFF)) {
            C786410Ut5.LJZ(0, this.LLJILLL);
            this.LLJLLIL = c2212511Bib.LJFF;
            this.LLJJJJ = c2212511Bib.LJI;
            this.LLJLLL = c2212511Bib.LIZ;
            this.LLJJ.setText(LJI(this.LLJZ));
            if (!TextUtils.isEmpty(c2212511Bib.LIZLLL)) {
                this.LLJJ.setTextColor(C2212161Bi2.LJIIL(c2212511Bib.LIZLLL, "#ffffff"));
                this.LLJJIII.setTextColor(C2212161Bi2.LJIIL(c2212511Bib.LIZLLL, "#ffffff"));
            }
            if (!TextUtils.isEmpty(c2212511Bib.LJ)) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                GradientDrawable gradientDrawableLJ = LJ(12);
                int iLJIIL = C2212161Bi2.LJIIL(c2212511Bib.LJ, "#32222222");
                gradientDrawableLJ.setColor(iLJIIL);
                gradientDrawable.setColor(iLJIIL);
                this.LLJJ.setBackground(gradientDrawableLJ);
                this.LLJJIII.setBackground(gradientDrawable);
            }
            setSkipClickListener(c2212201Bi6);
            return;
        }
        C786410Ut5.LJZ(8, this.LLJILLL);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10, -1);
        int iLIZIZ = (int) C1057810ddL.LIZIZ(16.0f, getContext());
        layoutParams.setMargins(0, (int) C1057810ddL.LIZIZ(16.0f, getContext()), iLIZIZ, 0);
        layoutParams.addRule(21, -1);
        layoutParams.setMarginStart(0);
        layoutParams.setMarginEnd(iLIZIZ);
        C786410Ut5.g6(this.LLILZLL, layoutParams);
    }

    private void setupUIWidgets(C2212201Bi6 c2212201Bi6) {
        int i;
        int iLIZIZ;
        setupSkipLayout(c2212201Bi6);
        setupWifiPreloadHindLayout(c2212201Bi6);
        setupAdLabelLayout(c2212201Bi6);
        C2212721Biw c2212721Biw = c2212201Bi6.LLLII;
        if (c2212721Biw != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("new splash style，position:");
            sbLIZ.append(c2212721Biw.LIZIZ);
            C2212381BiO.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            C1057810ddL.LIZJ(this.LLILZLL);
            C1057810ddL.LIZJ(this.LLJJI);
            C1057810ddL.LIZJ(this.LLJILLL);
            int i2 = c2212721Biw.LIZIZ;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            C1057810ddL.LIZ(this.LLILZLL, this.LLJILJILJ);
                            C1057810ddL.LIZ(this.LLJILLL, this.LLJILJILJ);
                            if (c2212721Biw.LIZIZ != 0) {
                                C786410Ut5.LLIL(this.LLJJI, 8);
                            }
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("xigua TV style, is clickable: ");
                            sbLIZ2.append(c2212201Bi6.LJIIIZ());
                            sbLIZ2.append(", is skippable: ");
                            sbLIZ2.append(c2212201Bi6.LIZJ());
                            C2212381BiO.LJFF(C2188811AlT.LIZIZ(sbLIZ2));
                            if (!c2212201Bi6.LJIIIZ() && !c2212201Bi6.LIZJ()) {
                                C0GZI c0gzi = this.LLJJIII;
                                int visibility = c0gzi.getVisibility();
                                c0gzi.setVisibility(0);
                                C1602160rnK.LIZIZ(visibility, 0, c0gzi);
                                C1057810ddL.LIZ(this.LLJJIII, this.LLJILJILJ);
                            } else {
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C1057810ddL.LIZIZ(40.0f, getContext()));
                                int iLIZIZ2 = (int) C1057810ddL.LIZIZ(44.0f, getContext());
                                layoutParams.setMargins(0, (int) C1057810ddL.LIZIZ(30.0f, getContext()), iLIZIZ2, 0);
                                layoutParams.setMarginStart(0);
                                layoutParams.setMarginEnd(iLIZIZ2);
                                C786410Ut5.a6(this.LLJILLL, layoutParams);
                                C786410Ut5.g6(this.LLJJ, new FrameLayout.LayoutParams(-2, -1));
                                GradientDrawable gradientDrawableLJ = LJ(20);
                                C2212511Bib c2212511Bib = c2212201Bi6.LLLIIII;
                                if (c2212511Bib != null && !TextUtils.isEmpty(c2212511Bib.LJ)) {
                                    gradientDrawableLJ.setColor(C2212161Bi2.LJIIL(c2212511Bib.LJ, "#32222222"));
                                } else {
                                    gradientDrawableLJ.setAlpha(153);
                                    gradientDrawableLJ.setColor(-16777216);
                                }
                                this.LLJJ.setPaddingRelative((int) C1057810ddL.LIZIZ(14.0f, getContext()), (int) C1057810ddL.LIZIZ(8.0f, getContext()), (int) C1057810ddL.LIZIZ(14.0f, getContext()), (int) C1057810ddL.LIZIZ(7.0f, getContext()));
                                this.LLJJ.setBackground(gradientDrawableLJ);
                                this.LLJJ.setTextSize(1, 18.0f);
                                C1057810ddL.LIZ(this.LLJILLL, this.LLJILJILJ);
                            }
                            if (!TextUtils.isEmpty(c2212721Biw.LIZLLL) && (c2212201Bi6.LJIIIZ() || !c2212201Bi6.LIZJ())) {
                                C786410Ut5.LLIL(this.LLJJI, 0);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C1057810ddL.LIZIZ(40.0f, getContext()), (int) C1057810ddL.LIZIZ(22.0f, getContext()));
                                layoutParams2.gravity = 8388691;
                                int iLIZIZ3 = (int) C1057810ddL.LIZIZ(8.0f, getContext());
                                layoutParams2.setMargins(iLIZIZ3, 0, 0, (int) C1057810ddL.LIZIZ(8.0f, getContext()));
                                layoutParams2.setMarginStart(iLIZIZ3);
                                layoutParams2.setMarginEnd(0);
                                this.LLJJI.setGravity(17);
                                GradientDrawable gradientDrawableLJ2 = LJ(4);
                                if (!TextUtils.isEmpty(c2212721Biw.LIZ)) {
                                    gradientDrawableLJ2.setColor(C2212161Bi2.LJIIL(c2212721Biw.LIZ, "#32222222"));
                                } else {
                                    gradientDrawableLJ2.setColor(-16777216);
                                    gradientDrawableLJ2.setAlpha(153);
                                }
                                this.LLJJI.setBackground(gradientDrawableLJ2);
                                if (!TextUtils.isEmpty(c2212721Biw.LIZJ)) {
                                    this.LLJJI.setTextColor(C2212161Bi2.LJIIL(c2212721Biw.LIZJ, "#ffffff"));
                                } else {
                                    this.LLJJI.setTextColor(-1);
                                }
                                this.LLJJI.setTextSize(1, 12.0f);
                                this.LLJJI.setText(c2212721Biw.LIZLLL);
                                C786410Ut5.g6(this.LLJJI, layoutParams2);
                                C1057810ddL.LIZ(this.LLJJI, this.LLILLL);
                            }
                        }
                    } else {
                        if (!TextUtils.isEmpty(this.LLJJI.getText())) {
                            C786410Ut5.LLIL(this.LLJJI, 0);
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, (int) C1057810ddL.LIZIZ(18.0f, getContext()));
                            if (this.LLILZLL.getVisibility() != 0) {
                                iLIZIZ = (int) C1057810ddL.LIZIZ(20.0f, getContext());
                            } else {
                                iLIZIZ = 0;
                            }
                            layoutParams3.setMargins(0, 0, iLIZIZ, 0);
                            layoutParams3.setMarginStart(0);
                            layoutParams3.setMarginEnd(iLIZIZ);
                            C786410Ut5.g6(this.LLJJI, layoutParams3);
                            this.LLJJI.setTextSize(1, 12.0f);
                            this.LLJJI.setPaddingRelative((int) C1057810ddL.LIZIZ(4.0f, getContext()), 0, (int) C1057810ddL.LIZIZ(0.0f, getContext()), 0);
                            this.LLJJI.setBackgroundColor(ColorProtector.parseColor("#00222222"));
                            this.LLJJI.setShadowLayer(2.0f, 0.0f, 1.0f, ColorProtector.parseColor("#66000000"));
                            C1057810ddL.LIZ(this.LLJJI, this.LLJILJILJ);
                        }
                        if (this.LLILZLL.getVisibility() == 0) {
                            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, (int) C1057810ddL.LIZIZ(18.0f, getContext()));
                            int iLIZIZ4 = (int) C1057810ddL.LIZIZ(20.0f, getContext());
                            layoutParams4.setMargins(0, 0, iLIZIZ4, 0);
                            layoutParams4.setMarginStart(0);
                            layoutParams4.setMarginEnd(iLIZIZ4);
                            C786410Ut5.g6(this.LLILZLL, layoutParams4);
                            this.LLILZLL.setTextSize(1, 12.0f);
                            this.LLILZLL.setShadowLayer(2.0f, 0.0f, 1.0f, ColorProtector.parseColor("#66000000"));
                            if (!TextUtils.isEmpty(c2212721Biw.LIZJ)) {
                                this.LLILZLL.setTextColor(C2212161Bi2.LJIIL(c2212721Biw.LIZJ, "#ffffff"));
                            }
                            this.LLILZLL.setPaddingRelative((int) C1057810ddL.LIZIZ(6.0f, getContext()), 0, (int) C1057810ddL.LIZIZ(0.0f, getContext()), 0);
                            TextView textView = this.LLILZLL;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("|  ");
                            sbLIZ3.append((Object) this.LLILZLL.getText());
                            textView.setText(C2188811AlT.LIZIZ(sbLIZ3));
                            C1057810ddL.LIZ(this.LLILZLL, this.LLJILJILJ);
                        }
                        if (this.LLJILLL.getVisibility() == 0) {
                            if (!c2212201Bi6.LLLIIIL) {
                                this.LLJJ.setTextSize(1, 16.0f);
                            }
                            C1057810ddL.LIZ(this.LLJILLL, this.LLILLJJLI);
                            int iLIZIZ5 = (int) C1057810ddL.LIZIZ(0, C2212231Bi9.LJIILL);
                            if (iLIZIZ5 <= 0) {
                                iLIZIZ5 = (C2212161Bi2.LJ() / 2) - C2212231Bi9.LJIILL.getResources().getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.f614aha);
                            }
                            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, (int) C1057810ddL.LIZIZ(30.0f, getContext()));
                            layoutParams5.addRule(12, -1);
                            int iLIZIZ6 = (int) C1057810ddL.LIZIZ(15.0f, getContext());
                            if (c2212201Bi6.LJIILIIL()) {
                                if (C2212231Bi9.LIZIZ() != null && "13".equals(C2212231Bi9.LIZIZ().LIZIZ())) {
                                    iLIZIZ5 += (int) C1057810ddL.LIZIZ(5.5f, getContext());
                                }
                                layoutParams5.setMargins(0, 0, iLIZIZ6, iLIZIZ5);
                            } else {
                                layoutParams5.setMargins(0, 0, iLIZIZ6, (int) C1057810ddL.LIZIZ(35.0f, getContext()));
                            }
                            layoutParams5.addRule(21, -1);
                            layoutParams5.setMarginStart(0);
                            layoutParams5.setMarginEnd(iLIZIZ6);
                            C786410Ut5.a6(this.LLJILLL, layoutParams5);
                            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -1);
                            this.LLJJ.setMinimumWidth((int) C1057810ddL.LIZIZ(64.0f, getContext()));
                            C786410Ut5.g6(this.LLJJ, layoutParams6);
                            C2212511Bib c2212511Bib2 = c2212201Bi6.LLLIIII;
                            if (c2212511Bib2 != null && !TextUtils.isEmpty(c2212511Bib2.LJ)) {
                                GradientDrawable gradientDrawableLJ3 = LJ(16);
                                gradientDrawableLJ3.setColor(C2212161Bi2.LJIIL(c2212511Bib2.LJ, "#32222222"));
                                if (c2212201Bi6.LJIILIIL()) {
                                    gradientDrawableLJ3.setStroke((int) C1057810ddL.LIZIZ(0.5f, getContext()), ColorProtector.parseColor("#66222222"));
                                } else {
                                    gradientDrawableLJ3.setStroke((int) C1057810ddL.LIZIZ(0.5f, getContext()), ColorProtector.parseColor("#99FAFAFA"));
                                }
                                this.LLJJ.setBackground(gradientDrawableLJ3);
                            }
                        }
                        if (this.LLILZIL.getVisibility() == 0) {
                            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
                            int iLIZIZ7 = (int) C1057810ddL.LIZIZ(14.0f, getContext());
                            layoutParams7.setMargins(iLIZIZ7, 0, 0, 0);
                            layoutParams7.setMarginStart(iLIZIZ7);
                            layoutParams7.setMarginEnd(0);
                            C786410Ut5.c6(this.LLILZIL, layoutParams7);
                        }
                        if (this.LLJILJILJ != null) {
                            RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
                            layoutParams8.setMargins(0, (int) C1057810ddL.LIZIZ(35.0f, getContext()), 0, 0);
                            layoutParams8.setMarginStart(0);
                            layoutParams8.setMarginEnd(0);
                            this.LLJILJILJ.setOrientation(0);
                            C786410Ut5.d6(this.LLJILJILJ, layoutParams8);
                        }
                    }
                } else {
                    C1057810ddL.LIZ(this.LLILZLL, this.LLJILJILJ);
                    C1057810ddL.LIZ(this.LLJILLL, this.LLJILJILJ);
                    C786410Ut5.LLIL(this.LLJJI, 0);
                    FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams9.gravity = 8388693;
                    if (c2212201Bi6.LLJJJJ == 3 && this.LLJ.getVisibility() == 0) {
                        i = this.LLJ.getLayoutParams().height;
                    } else {
                        i = 0;
                    }
                    int iLIZIZ8 = (int) C1057810ddL.LIZIZ(16.0f, getContext());
                    layoutParams9.setMargins(0, 0, iLIZIZ8, ((int) C1057810ddL.LIZIZ(20.0f, getContext())) + i);
                    layoutParams9.setMarginStart(0);
                    layoutParams9.setMarginEnd(iLIZIZ8);
                    C786410Ut5.g6(this.LLJJI, layoutParams9);
                    C1057810ddL.LIZ(this.LLJJI, this.LLILLL);
                }
            } else if (TextUtils.isEmpty(c2212721Biw.LIZLLL)) {
                C1057810ddL.LIZ(this.LLILZLL, this.LLJILJILJ);
                C1057810ddL.LIZ(this.LLJILLL, this.LLJILJILJ);
            } else {
                C1057810ddL.LIZLLL(true, this.LLJJI);
                C1057810ddL.LIZLLL(false, this.LLJILLL, this.LLILZLL);
                this.LLJJI.setTextSize(1, 12.0f);
                C786410Ut5.T7(this.LLJJI, new ACListenerS168S0100000_34(this, 51));
                float fLIZIZ = (int) C1057810ddL.LIZIZ(1.0f, getContext());
                this.LLJJI.setShadowLayer(fLIZIZ, 0.0f, fLIZIZ, Color.argb(31, 0, 0, 0));
                C1057810ddL.LIZLLL(true, this.LLJJIJIL);
                LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams10.gravity = 16;
                layoutParams10.topMargin = (int) C1057810ddL.LIZIZ(7.0f, getContext());
                layoutParams10.setMarginEnd((int) C1057810ddL.LIZIZ(13.0f, getContext()));
                TextView textView2 = this.LLJJI;
                LinearLayout linearLayout = this.LLJILJILJ;
                if (textView2 != null) {
                    C786410Ut5.W5(textView2, layoutParams10);
                }
                C1057810ddL.LIZ(textView2, linearLayout);
            }
        }
        setupSkipButtonHitArea(c2212201Bi6);
    }

    private void setupWifiPreloadHindLayout(C2212201Bi6 c2212201Bi6) {
        String str = c2212201Bi6.LLLIIIIL;
        if (!TextUtils.isEmpty(str)) {
            C786410Ut5.LLIL(this.LLILZLL, 0);
            this.LLILZLL.setText(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x056f  */
    /* JADX WARN: Type inference failed for: r0v167, types: [X.1BjJ] */
    /* JADX WARN: Type inference failed for: r0v32, types: [REQUEST, X.0kbR] */
    /* JADX WARN: Type inference failed for: r0v68, types: [REQUEST, X.0kbR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(X.C2212201Bi6 r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212931BjH.LIZ(X.1Bi6):boolean");
    }

    public final GradientDrawable LJ(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f = i;
        gradientDrawable.setCornerRadii(new float[]{C1057810ddL.LIZIZ(f, getContext()), C1057810ddL.LIZIZ(f, getContext()), C1057810ddL.LIZIZ(f, getContext()), C1057810ddL.LIZIZ(f, getContext()), C1057810ddL.LIZIZ(f, getContext()), C1057810ddL.LIZIZ(f, getContext()), C1057810ddL.LIZIZ(f, getContext()), C1057810ddL.LIZIZ(f, getContext())});
        return gradientDrawable;
    }

    public final CharSequence LJI(int i) {
        int i2;
        if (i < 0) {
            i = 0;
        }
        C2212201Bi6 c2212201Bi6 = this.LLJLIL;
        C2212721Biw c2212721Biw = c2212201Bi6.LLLII;
        if (c2212721Biw != null) {
            if (c2212721Biw.LIZIZ == 3) {
                if (c2212201Bi6.LJIIIZ()) {
                    return LJFF(this.LLJLLIL, 14, "#4DFFFFFF", 18, C786410Ut5.j4("%02d%s", new Object[]{Integer.valueOf(i), this.LLJLLL}));
                }
                if (this.LLJLIL.LIZJ()) {
                    int i3 = (int) (this.LLJJJJJIL / 1000);
                    C2212511Bib c2212511Bib = this.LLJLIL.LLLIIII;
                    if (c2212511Bib != null) {
                        i2 = c2212511Bib.LJII;
                    } else {
                        i2 = 0;
                    }
                    if (i > i3 - i2) {
                        return LJFF("Ad", 14, "#4DFFFFFF", 18, C786410Ut5.j4("%02d%s", new Object[]{Integer.valueOf(i), this.LLJLLL}));
                    }
                    return LJFF(this.LLJLLIL, 14, "#4DFFFFFF", 18, C786410Ut5.j4("%02d%s", new Object[]{Integer.valueOf(i), this.LLJLLL}));
                }
                return this.LLJLLIL;
            }
            if (c2212721Biw.LIZIZ == 2) {
                if (this.LLJJJJ) {
                    String strJ4 = C786410Ut5.j4("%d%s", new Object[]{Integer.valueOf(i), this.LLJLLL});
                    if (this.LLJLIL.LJIILIIL()) {
                        return LJFF(strJ4, 13, "#66222222", 16, this.LLJLLIL);
                    }
                    return LJFF(strJ4, 13, "#66F8F8F8", 16, this.LLJLLIL);
                }
                return this.LLJLLIL;
            }
        }
        if (this.LLJJJJ) {
            if (TextUtils.getLayoutDirectionFromLocale(getContext().getResources().getConfiguration().locale) == 1) {
                return C786410Ut5.j4("%s %s%s", new Object[]{this.LLJLLIL, Integer.valueOf(i), this.LLJLLL});
            }
            return C786410Ut5.j4("%s%s %s", new Object[]{Integer.valueOf(i), this.LLJLLL, this.LLJLLIL});
        }
        return this.LLJLLIL;
    }

    public final void LJII(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bda_splash_render_duration", System.currentTimeMillis() - this.LLJJJ);
            C2212291BiF.LIZLLL().LJII("bda_splash_render_duration", i, jSONObject, null);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final ObjectAnimator LJIIIIZZ(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "y", view.getY(), view.getY() - C1057810ddL.LIZIZ(30.0f, getContext()));
        objectAnimatorOfFloat.setDuration(300L);
        return objectAnimatorOfFloat;
    }

    public final void LJIIIZ(long j) {
        if (C2212231Bi9.LJIIIIZZ().LJIIJ) {
            ARunnableS27S0100100_34 aRunnableS27S0100100_34 = new ARunnableS27S0100100_34(this, j, 2);
            if (isAttachedToWindow()) {
                aRunnableS27S0100100_34.run();
            } else {
                HandlerHook.viewPost(this, aRunnableS27S0100100_34);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(boolean r13) {
        /*
            r12 = this;
            boolean r0 = r12.LLJJL
            if (r0 == 0) goto L5
            return
        L5:
            r12.LJIILIIL()
            com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer r0 = r12.LLJZIJLIL
            if (r0 == 0) goto L12
            r0.cancel()
            r0 = 0
            r12.LLJZIJLIL = r0
        L12:
            X.1BiS r0 = X.C2212231Bi9.LJIIIIZZ()
            boolean r0 = r0.LJIIJ
            r8 = 1
            if (r0 == 0) goto L63
            X.1Bi6 r0 = r12.LLJLIL
            boolean r0 = r0.LJIIL()
            if (r0 == 0) goto L63
            boolean r0 = r12.LLLIILIL
            if (r0 != 0) goto L63
            if (r13 != 0) goto L33
            X.1BjQ r0 = r12.LLLII
            if (r0 == 0) goto L63
            boolean r0 = r0.isVideoPlaying()
            if (r0 == 0) goto L63
        L33:
            r12.LLLIILIL = r8
            X.1Bi6 r1 = r12.LLJLIL
            int r0 = r1.LLJJIJIL
            r2 = 0
            if (r0 != r8) goto L79
            long r0 = r1.LJII()
        L40:
            int r2 = (int) r0
        L41:
            X.1Bi6 r0 = r12.LLJLIL
            X.C2212981BjM.LJI(r2, r0)
            X.1Bi6 r1 = r12.LLJLIL
            X.1Bi1 r0 = r1.LLJLIL
            if (r0 == 0) goto L63
            X.01GW<X.1Bjq> r0 = X.C2213281Bjq.LIZJ
            java.lang.Object r2 = r0.getValue()
            X.1Bjq r2 = (X.C2213281Bjq) r2
            r3 = 0
            long r4 = r1.LLJI
            X.1Bi1 r0 = r1.LLJLIL
            java.util.List<java.lang.String> r6 = r0.LIZIZ
            java.lang.String r7 = r1.LLJJIJI
            r9 = -1
            r11 = r3
            r2.LIZLLL(r3, r4, r6, r7, r8, r9, r11)
        L63:
            com.ss.android.ad.splash.utils.WeakHandler r0 = r12.LLJLL
            r0.removeMessages(r8)
            X.1Bjp r1 = r12.LLJLILLLLZIIL
            X.1Bi6 r0 = r12.LLJLIL
            X.1BjG r1 = (X.C2212921BjG) r1
            r1.LJFF(r0)
            X.1Bjp r0 = r12.LLJLILLLLZIIL
            X.1BjG r0 = (X.C2212921BjG) r0
            r0.LJ()
            return
        L79:
            X.1BjQ r0 = r12.LLLII
            if (r0 == 0) goto L8a
            int r0 = r0.getDuration()
            if (r0 <= 0) goto L8a
            X.1BjQ r0 = r12.LLLII
            int r2 = r0.getDuration()
            goto L41
        L8a:
            X.1Bi6 r0 = r12.LLJLIL
            X.1Bi1 r0 = r0.LLJLIL
            if (r0 == 0) goto L41
            long r0 = r0.LJII
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212931BjH.LJIIJ(boolean):void");
    }

    @Override // X.InterfaceC588460N6e
    public final void handleMsg(Message message) {
        int i = message.what;
        if (i == 1) {
            if (!this.LLJJL && C2212231Bi9.LJIIIIZZ().LJIIIZ && !C2212231Bi9.LJIIIIZZ().LJIIJ && this.LLLII != null) {
                HashMap<String, Object> map = new HashMap<>();
                HashMap<String, Object> map2 = new HashMap<>();
                map.put("duration", Long.toString(this.LLLII.getCurrentPosition()));
                map.put("percent", Integer.valueOf(C199635139d.LIZ(this.LLLII.getCurrentPosition(), this.LLLII.getDuration())));
                map.put("break_reason", 9);
                map2.put("break_reason", 9);
                map2.put("play_order", 1);
                C2212051Bhr.LIZJ().LJIIIIZZ(this.LLJLIL, 0L, "play_break", map, map2);
                C2212231Bi9.LJFF().LJIIIIZZ();
            }
            LJIIJ(false);
            return;
        }
        if (i != 2) {
            return;
        }
        int i2 = this.LLJZ - 1;
        this.LLJZ = i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("splash count down. display seconds left: ");
        sbLIZ.append(this.LLJZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (i2 == 0) {
            PthreadTimer pthreadTimer = this.LLJZIJLIL;
            if (pthreadTimer != null) {
                pthreadTimer.cancel();
                this.LLJZIJLIL = null;
                return;
            }
            return;
        }
        if (this.LLJJ.getVisibility() == 0 && this.LLJJJJ) {
            this.LLJJ.setText(LJI(i2));
        }
        String strReplace = "";
        if (this.LLJJIII.getVisibility() == 0) {
            C0GZI c0gzi = this.LLJJIII;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            sbLIZ2.append(i2);
            c0gzi.setText(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (this.LLJJIJI.getVisibility() != 0) {
            return;
        }
        C2212201Bi6 c2212201Bi6 = this.LLJLIL;
        if (c2212201Bi6.LLLLII != 5) {
            return;
        }
        TextView textView = this.LLJJIJI;
        String str = c2212201Bi6.LLLLIIIILLL;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(i2);
        sbLIZ3.append("");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        if (!TextUtils.isEmpty(str)) {
            strReplace = str.replace("%", strLIZIZ);
        }
        textView.setText(strReplace);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        InterfaceC2213021BjQ interfaceC2213021BjQ;
        super.onWindowFocusChanged(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasWindowFocus: ");
        sbLIZ.append(z);
        C2212381BiO.LJFF(C2188811AlT.LIZIZ(sbLIZ));
        if (C2212231Bi9.LJIIIIZZ().LJIIIZ && z != this.LLLIIIL && (interfaceC2213021BjQ = this.LLLII) != null && !this.LLJJL) {
            this.LLLIIIL = z;
            if (z) {
                interfaceC2213021BjQ.resume();
            } else {
                interfaceC2213021BjQ.pause();
            }
        }
    }

    public void setSplashAdInteraction(InterfaceC2213271Bjp interfaceC2213271Bjp) {
        this.LLJLILLLLZIIL = interfaceC2213271Bjp;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            LIZLLL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r10, android.view.KeyEvent r11) {
        /*
            r9 = this;
            r0 = 4
            r5 = 0
            if (r10 == r0) goto L4e
            r0 = 66
            if (r10 == r0) goto L31
            r2 = 0
            switch(r10) {
                case 23: goto L31;
                case 24: goto L11;
                case 25: goto L21;
                default: goto Lc;
            }
        Lc:
            boolean r0 = super.onKeyDown(r10, r11)
            return r0
        L11:
            X.1BjL r1 = X.C2212971BjL.LIZ()
            r1.LIZJ = r5
            com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer r0 = r1.LIZIZ
            if (r0 == 0) goto Lc
            r0.cancel()
            r1.LIZIZ = r2
            goto Lc
        L21:
            X.1BjL r1 = X.C2212971BjL.LIZ()
            r1.LIZJ = r5
            com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer r0 = r1.LIZIZ
            if (r0 == 0) goto Lc
            r0.cancel()
            r1.LIZIZ = r2
            goto Lc
        L31:
            X.1Bi6 r0 = r9.LLJLIL
            boolean r0 = r0.LJIIIZ()
            if (r0 == 0) goto Lc
            X.1Bi6 r3 = r9.LLJLIL
            int r2 = r3.LLJL
            r1 = 0
            if (r2 == 0) goto L4a
            r0 = 1
            if (r2 == r0) goto L4a
            r0 = 2
            if (r2 != r0) goto Lc
            r9.LIZJ(r3, r1, r1)
            goto Lc
        L4a:
            r9.LIZIZ(r3, r1, r1)
            goto Lc
        L4e:
            X.1Bi6 r0 = r9.LLJLIL
            boolean r0 = r0.LIZJ()
            if (r0 == 0) goto Lc
            int r0 = r9.LLJZ
            long r3 = (long) r0
            r7 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r7
            long r1 = r9.LLJJJJJIL
            X.1Bi6 r0 = r9.LLJLIL
            X.1Bib r0 = r0.LLLIIII
            if (r0 == 0) goto L66
            int r5 = r0.LJII
        L66:
            long r5 = (long) r5
            long r5 = r5 * r7
            long r1 = r1 - r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto Lc
            r9.LJIILJJIL()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212931BjH.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final void LIZIZ(C2212201Bi6 c2212201Bi6, float f, float f2) {
        String str;
        C2212381BiO.LJ(c2212201Bi6.LLJI, "click ad");
        if (this.LLJJJIL) {
            str = "click_normal_area";
        } else {
            str = "";
        }
        C2213111BjZ c2213111BjZ = new C2213111BjZ();
        c2213111BjZ.LIZ = 0;
        c2213111BjZ.LJ = new Point((int) f, (int) f2);
        c2213111BjZ.LIZLLL = this.LLJJJIL;
        c2213111BjZ.LIZJ = str;
        if (((C2212921BjG) this.LLJLILLLLZIIL).LIZLLL(c2212201Bi6, new C2213051BjT(c2213111BjZ))) {
            LJIILIIL();
        }
        ((C2212921BjG) this.LLJLILLLLZIIL).LJ();
    }

    public final void LIZJ(C2212201Bi6 c2212201Bi6, float f, float f2) {
        JSONObject jSONObject;
        C2212381BiO.LJ(c2212201Bi6.LLJI, "click ad");
        C2213111BjZ c2213111BjZ = new C2213111BjZ();
        c2213111BjZ.LIZIZ = true;
        c2213111BjZ.LJ = new Point((int) f, (int) f2);
        InterfaceC2213271Bjp interfaceC2213271Bjp = this.LLJLILLLLZIIL;
        C2213051BjT c2213051BjT = new C2213051BjT(c2213111BjZ);
        C2212921BjG c2212921BjG = (C2212921BjG) interfaceC2213271Bjp;
        c2212921BjG.getClass();
        List<C1031010cw7> listLIZ = C2212921BjG.LIZ(c2212201Bi6.LLJILJILJ, c2212201Bi6.LLJJ, c2212201Bi6.LLJJIJIIJIL);
        if (C2212081Bhu.LIZIZ(listLIZ)) {
            C1031000cw6 c1031000cw6LJ = c2212201Bi6.LJ();
            c1031000cw6LJ.LIZLLL = listLIZ;
            c2212921BjG.LIZ.LIZIZ(c1031000cw6LJ);
            String str = null;
            try {
                Point point = c2213051BjT.LIZJ;
                jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("click_x", Integer.valueOf(point.x));
                jSONObject2.putOpt("click_y", Integer.valueOf(point.y));
                jSONObject.putOpt("ad_extra_data", jSONObject2);
                jSONObject.put("ad_fetch_time", c2212201Bi6.LLILLJJLI);
                if (!C2211541Bh2.LIZ(c2212201Bi6.LLJJIJI)) {
                    jSONObject.put("log_extra", c2212201Bi6.LLJJIJI);
                }
                jSONObject.putOpt("is_ad_event", "1");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
            if (TextUtils.isEmpty(null)) {
                if (c2213051BjT.LIZIZ) {
                    str = "click";
                } else {
                    str = "banner_click";
                }
            }
            C2212051Bhr.LIZJ().LJFF("splash_ad", str, jSONObject, c2212201Bi6.LLJI);
            C2212231Bi9.LJFF().LJ();
            if (c2212201Bi6.LLJLIL != null) {
                C2213281Bjq.LIZJ.getValue().LIZJ(null, c2212201Bi6.LLJI, c2212201Bi6.LLJLLIL, c2212201Bi6.LLJJIJI, true, -1L, null);
            }
            c2212921BjG.LIZIZ();
            LJIILIIL();
            this.LLJJJJLIIL = 1;
            if (this.LLLII != null) {
                LJIILL();
            }
        }
        ((C2212921BjG) this.LLJLILLLLZIIL).LJ();
    }

    public final SpannableString LJFF(String str, int i, String str2, int i2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" | ");
        sbLIZ.append(str3);
        SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.p2(spannableString, new AbsoluteSizeSpan(18, true), 0, str.length(), 33);
        C786410Ut5.p2(spannableString, new AbsoluteSizeSpan(i, true), str.length(), str.length() + 3, 33);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(ColorProtector.parseColor(str2)), str.length(), str.length() + 3, 33);
        C786410Ut5.p2(spannableString, new AbsoluteSizeSpan(i2, true), str.length() + 3, spannableString.length(), 33);
        int iMax = Math.max(18, Math.max(i, i2));
        final int iLIZIZ = (int) C1057810ddL.LIZIZ((-Math.abs(iMax - 18)) / 2, getContext());
        C786410Ut5.p2(spannableString, new MetricAffectingSpan(iLIZIZ) { // from class: X.0uFj
            public final int LL;

            {
                this.LL = iLIZIZ;
            }

            @Override // android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.baselineShift += this.LL;
            }

            @Override // android.text.style.MetricAffectingSpan
            public final void updateMeasureState(TextPaint textPaint) {
                textPaint.baselineShift += this.LL;
            }
        }, 0, str.length(), 33);
        final int iLIZIZ2 = (int) C1057810ddL.LIZIZ((-Math.abs(iMax - i)) / 2, getContext());
        C786410Ut5.p2(spannableString, new MetricAffectingSpan(iLIZIZ2) { // from class: X.0uFj
            public final int LL;

            {
                this.LL = iLIZIZ2;
            }

            @Override // android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.baselineShift += this.LL;
            }

            @Override // android.text.style.MetricAffectingSpan
            public final void updateMeasureState(TextPaint textPaint) {
                textPaint.baselineShift += this.LL;
            }
        }, str.length(), str.length() + 3, 33);
        final int iLIZIZ3 = (int) C1057810ddL.LIZIZ((-Math.abs(iMax - i2)) / 2, getContext());
        C786410Ut5.p2(spannableString, new MetricAffectingSpan(iLIZIZ3) { // from class: X.0uFj
            public final int LL;

            {
                this.LL = iLIZIZ3;
            }

            @Override // android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                textPaint.baselineShift += this.LL;
            }

            @Override // android.text.style.MetricAffectingSpan
            public final void updateMeasureState(TextPaint textPaint) {
                textPaint.baselineShift += this.LL;
            }
        }, str.length() + 3, spannableString.length(), 33);
        return spannableString;
    }
}
