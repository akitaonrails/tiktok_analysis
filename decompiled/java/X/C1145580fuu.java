package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.text.Spannable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchFanHammerSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchItemExtraTimeEnable;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchItemSpecialEffectGuideEnable;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchTop2Top3CardSettings;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS146S0400000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145580fuu extends FrameLayout implements InterfaceC1145720fv8 {
    public AppCompatImageView LL;
    public C1145830fvJ LLILLJJLI;
    public LiveIconView LLILLL;
    public View LLILZ;
    public final ARunnableS116S0100000_16 LLILZIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1145830fvJ c1145830fvJ = this.LLILLJJLI;
        if (c1145830fvJ != null) {
            HandlerHook.viewRemoveCallbacks(c1145830fvJ, this.LLILZIL);
        }
        C1145830fvJ c1145830fvJ2 = this.LLILLJJLI;
        if (c1145830fvJ2 != null) {
            c1145830fvJ2.LIZ();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LL = (AppCompatImageView) findViewById(R.id.lmc);
        C1145830fvJ c1145830fvJ = (C1145830fvJ) findViewById(R.id.tv_tip_guide);
        if (c1145830fvJ != null) {
            c1145830fvJ.LL.LJJJI(R.style.a9f);
            c1145830fvJ.setConsumeTouchEvent(false);
        } else {
            c1145830fvJ = null;
        }
        this.LLILLJJLI = c1145830fvJ;
        this.LLILLL = (LiveIconView) findViewById(R.id.lj7);
        this.LLILZ = findViewById(R.id.l_c);
    }

    public C1145580fuu(Context context) {
        super(context, null, 0);
        this.LLILZIL = new ARunnableS116S0100000_16(this, 130);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h2r, this, true);
    }

    private final void setGuideText(CharSequence charSequence) {
        String string;
        C1145830fvJ c1145830fvJ = this.LLILLJJLI;
        if (c1145830fvJ == null) {
            return;
        }
        if (charSequence instanceof Spannable) {
            c1145830fvJ.setSpan((Spannable) charSequence);
            return;
        }
        if (charSequence == null || (string = charSequence.toString()) == null) {
            string = "";
        }
        c1145830fvJ.setText(string);
    }

    public void setBackgroundAlpha(float f) {
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    @Override // X.InterfaceC1145720fv8
    public final void LIZ(C1145600fuw c1145600fuw, AwS146S0400000_17 awS146S0400000_17) {
        int i;
        String str = c1145600fuw.LJFF;
        C1145830fvJ c1145830fvJ = this.LLILLJJLI;
        if (c1145830fvJ != null) {
            HandlerHook.viewRemoveCallbacks(c1145830fvJ, this.LLILZIL);
        }
        C1145830fvJ c1145830fvJ2 = this.LLILLJJLI;
        if (c1145830fvJ2 != null) {
            c1145830fvJ2.LIZ();
        }
        C1145830fvJ c1145830fvJ3 = this.LLILLJJLI;
        if (c1145830fvJ3 != null) {
            c1145830fvJ3.setText("");
        }
        AbstractC1145640fv0 abstractC1145640fv0 = c1145600fuw.LIZ;
        if (!Intrinsics.LJFF(abstractC1145640fv0, C1145670fv3.LIZ)) {
            if (Intrinsics.LJFF(abstractC1145640fv0, C1145700fv6.LIZ)) {
                int visibility = getVisibility();
                setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, this);
                setGuideText(c1145600fuw.LIZIZ);
                C1145830fvJ c1145830fvJ4 = this.LLILLJJLI;
                if (c1145830fvJ4 != null) {
                    HandlerHook.viewPostDelay(c1145830fvJ4, this.LLILZIL, 1000L);
                }
                if (LiveMatchFanHammerSetting.INSTANCE.isEnabled() && Intrinsics.LJFF(str, "fan_hammer")) {
                    LIZIZ(28.0f, 28.0f);
                    C1143680frq.LIZLLL(this.LL, "tiktok_live_interaction_demand_1", "ttlive_match_item_fans_hammer_card_guide.png");
                } else if (LiveMatchTop2Top3CardSettings.INSTANCE.getValue() && Intrinsics.LJFF(str, "top2")) {
                    LIZIZ(36.0f, 40.0f);
                    C1143680frq.LIZLLL(this.LL, "tiktok_live_interaction_demand_1", "ttlive_match_item_top2_card_guide.png");
                } else if (LiveMatchItemSpecialEffectGuideEnable.INSTANCE.enable()) {
                    LIZIZ(36.0f, 40.0f);
                    C1143680frq.LIZLLL(this.LL, "tiktok_live_interaction_demand_1", "ttlive_match_item_hammer_card_guide.png");
                } else if (LiveMatchItemExtraTimeEnable.INSTANCE.getValue()) {
                    LIZIZ(36.0f, 40.0f);
                    C1143680frq.LIZLLL(this.LL, "tiktok_live_interaction_demand_1", "ttlive_match_item_extra_card_guide.png");
                } else {
                    LIZIZ(36.0f, 40.0f);
                    C1143680frq.LIZLLL(this.LL, C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), "ttlive_match_item_card_guide_icon.png");
                }
                LiveIconView liveIconView = this.LLILLL;
                if (liveIconView != null) {
                    C786410Ut5.LLJJIJIL(liveIconView, 0);
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(abstractC1145640fv0, C1145710fv7.LIZ)) {
                return;
            }
            if (!(abstractC1145640fv0 instanceof C1144890ftn) && !(abstractC1145640fv0 instanceof C1144920ftq)) {
                return;
            }
            AbstractC1145640fv0 abstractC1145640fv02 = c1145600fuw.LIZ;
            if (abstractC1145640fv02 instanceof C1144890ftn) {
                i = ((C1144890ftn) abstractC1145640fv02).LIZ;
            } else if (!(abstractC1145640fv02 instanceof C1144920ftq)) {
                return;
            } else {
                i = ((C1144920ftq) abstractC1145640fv02).LIZ;
            }
            int visibility2 = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility2, 0, this);
            setGuideText(c1145600fuw.LIZIZ);
            C1145830fvJ c1145830fvJ5 = this.LLILLJJLI;
            if (c1145830fvJ5 != null) {
                HandlerHook.viewPostDelay(c1145830fvJ5, this.LLILZIL, 1000L);
            }
            LIZIZ(24.0f, 24.0f);
            if (i != 0) {
                AppCompatImageView appCompatImageView = this.LL;
                if (appCompatImageView != null) {
                    C786410Ut5.LLILIL(appCompatImageView, 0);
                }
                AppCompatImageView appCompatImageView2 = this.LL;
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setImageResource(i);
                }
            } else {
                AppCompatImageView appCompatImageView3 = this.LL;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setImageDrawable(null);
                }
                AppCompatImageView appCompatImageView4 = this.LL;
                if (appCompatImageView4 != null) {
                    C786410Ut5.LLILIL(appCompatImageView4, 8);
                }
            }
            LiveIconView liveIconView2 = this.LLILLL;
            if (liveIconView2 == null) {
                return;
            }
            C786410Ut5.LLJJIJIL(liveIconView2, 0);
        }
    }

    public final void LIZIZ(float f, float f2) {
        ViewGroup.LayoutParams layoutParams;
        AppCompatImageView appCompatImageView = this.LL;
        if (appCompatImageView == null || (layoutParams = appCompatImageView.getLayoutParams()) == null) {
            return;
        }
        int iLIZIZ = (int) C497740JfY.LIZIZ(f);
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(f2);
        if (layoutParams.width != iLIZIZ || layoutParams.height != iLIZIZ2) {
            layoutParams.width = iLIZIZ;
            layoutParams.height = iLIZIZ2;
            C786410Ut5.h6(appCompatImageView, layoutParams);
        }
    }
}
