package X;

import Y.ACListenerS112S0200000_8;
import Y.ACListenerS143S0100000_8;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.ab.CCDiversionEntConfig;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0L0N, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L0N extends LinearLayout {
    public boolean LL;

    public final void LIZ() {
        String str;
        CCDiversionEntConfig.CapCutBannerBean capCutBannerBean;
        String str2;
        CCDiversionEntConfig.LIZ.getClass();
        CCDiversionEntConfig.CapCutBannerBean capCutBannerBean2 = CCDiversionEntConfig.LIZ().capcutBanner;
        if (capCutBannerBean2 == null || (str = capCutBannerBean2.onelink) == null || a0.LJJJIL(str)) {
            return;
        }
        Context context = getContext();
        Intent intent = new Intent();
        CCDiversionEntConfig.CCDiversionEntConfigBean cCDiversionEntConfigBeanLIZ = CCDiversionEntConfig.LIZ();
        intent.setData((cCDiversionEntConfigBeanLIZ == null || (capCutBannerBean = cCDiversionEntConfigBeanLIZ.capcutBanner) == null || (str2 = capCutBannerBean.onelink) == null) ? null : UriProtector.parse(str2));
        intent.setAction("android.intent.action.VIEW");
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhkdTRjIENBfvs0uapPXwL7TDZBBoShiQcr7lWSpFpxzrMGL3dukay", null));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJJI(this);
        }
    }

    public static void LIZIZ(String str) {
        String str2;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("action", str);
        CCDiversionEntConfig.LIZ.getClass();
        CCDiversionEntConfig.CapCutBannerBean capCutBannerBean = CCDiversionEntConfig.LIZ().capcutBanner;
        if (capCutBannerBean != null) {
            str2 = capCutBannerBean.position;
        } else {
            str2 = null;
        }
        pairArr[1] = new Pair("position", str2);
        C20684815ws.LJIILLIIL("tt_album_capcut_template_banner", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public final void LIZJ(boolean z) {
        CCDiversionEntConfig.CapCutBannerBean capCutBannerBean;
        boolean z2;
        this.LL = z;
        if (!z) {
            C786410Ut5.I0(this, 8);
            return;
        }
        if (!C0L0O.LIZJ()) {
            C786410Ut5.I0(this, 8);
            return;
        }
        CCDiversionEntConfig.LIZ.getClass();
        CCDiversionEntConfig.CCDiversionEntConfigBean cCDiversionEntConfigBeanLIZ = CCDiversionEntConfig.LIZ();
        if (cCDiversionEntConfigBeanLIZ != null && (capCutBannerBean = cCDiversionEntConfigBeanLIZ.capcutBanner) != null) {
            String str = capCutBannerBean.position;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            if (Intrinsics.LJFF(str.toLowerCase(Locale.ROOT), "bottom")) {
                layoutParams.gravity = 80;
            } else {
                layoutParams.gravity = 48;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
            try {
                String str2 = capCutBannerBean.title;
                if (str2 == null || str2.length() <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    String string = getContext().getString(C786410Ut5.n3(getResources(), capCutBannerBean.title, "string", getContext().getPackageName()));
                    TextView textView = (TextView) getRootView().findViewById(R.id.dk6);
                    if (textView != null) {
                        textView.setText(string);
                        C21382118m3.LIZIZ(textView, 8, 14, 1, 1);
                    }
                }
                String str3 = capCutBannerBean.btnText;
                if (str3 != null && str3.length() > 0) {
                    String string2 = getContext().getString(C786410Ut5.n3(getResources(), capCutBannerBean.btnText, "string", getContext().getPackageName()));
                    TextView textView2 = (TextView) getRootView().findViewById(R.id.dk8);
                    if (textView2 != null) {
                        textView2.setText(string2);
                        C21382118m3.LIZIZ(textView2, 6, 14, 1, 1);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (capCutBannerBean.needSelect == 1) {
                C786410Ut5.I0(this, 8);
                return;
            }
            C786410Ut5.I0(this, 0);
            C0L0O.LIZIZ();
            LIZIZ("show");
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C526610Kl1 c526610Kl1) {
        if (getVisibility() != 0 && this.LL && C0L0O.LIZJ()) {
            C786410Ut5.I0(this, 0);
            C0L0O.LIZIZ();
            LIZIZ("show");
        }
    }

    public C0L0N(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = true;
        EventBus eventBusLIZLLL = EventBus.LIZLLL();
        if (!eventBusLIZLLL.LJIIJ(this)) {
            eventBusLIZLLL.LJIJJ(this);
        }
        View viewSd = C786410Ut5.Sd(R.layout.ot, C786410Ut5.ne(context), this);
        C786410Ut5.I7(new ACListenerS112S0200000_8(this, context, 17), viewSd.findViewById(R.id.dk8));
        C786410Ut5.I7(new ACListenerS143S0100000_8(this, 128), viewSd.findViewById(R.id.dk3));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        gradientDrawable.setCornerRadius(12 * getResources().getDisplayMetrics().density);
        View viewFindViewById = findViewById(R.id.dk7);
        if (viewFindViewById != null) {
            viewFindViewById.setBackground(gradientDrawable);
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.wm, context);
        if (numLIZJ2 != null) {
            gradientDrawable2.setColor(numLIZJ2.intValue());
        }
        gradientDrawable2.setCornerRadius(24 * getResources().getDisplayMetrics().density);
        View viewFindViewById2 = findViewById(R.id.dk8);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setBackground(gradientDrawable2);
        }
    }
}
