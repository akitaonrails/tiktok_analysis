package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS146S0400000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fuv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145590fuv extends FrameLayout implements InterfaceC1145720fv8 {
    public AppCompatImageView LL;
    public C1149220g0m LLILLJJLI;
    public LiveIconView LLILLL;
    public View LLILZ;
    public C16FS LLILZIL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LL = (AppCompatImageView) findViewById(R.id.lmc);
        this.LLILLJJLI = (C1149220g0m) findViewById(R.id.tv_tip_guide);
        this.LLILLL = (LiveIconView) findViewById(R.id.lj7);
        this.LLILZ = findViewById(R.id.l_c);
        this.LLILZIL = (C16FS) findViewById(R.id.cqw);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public C1145590fuv(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h2q, this, true);
    }

    public void setBackgroundAlpha(float f) {
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
    }

    @Override // X.InterfaceC1145720fv8
    public final void LIZ(C1145600fuw c1145600fuw, AwS146S0400000_17 awS146S0400000_17) {
        String str;
        AbstractC1145640fv0 abstractC1145640fv0 = c1145600fuw.LIZ;
        if (!Intrinsics.LJFF(abstractC1145640fv0, C1145670fv3.LIZ) && !Intrinsics.LJFF(abstractC1145640fv0, C1145700fv6.LIZ)) {
            if (Intrinsics.LJFF(abstractC1145640fv0, C1145710fv7.LIZ)) {
                int visibility = getVisibility();
                setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, this);
                C1149220g0m c1149220g0m = this.LLILLJJLI;
                if (c1149220g0m != null) {
                    C1149220g0m.LIZIZ(c1149220g0m, new SpannableStringBuilder(c1145600fuw.LIZIZ));
                }
                C1149220g0m c1149220g0m2 = this.LLILLJJLI;
                if (c1149220g0m2 != null) {
                    int visibility2 = c1149220g0m2.getVisibility();
                    c1149220g0m2.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility2, 0, c1149220g0m2);
                }
                C1143680frq.LIZLLL(this.LL, C0IPN.LIZ("tiktok_live_watch_resource", "tiktok_live_interaction_demand_1"), "ttlive_match_item_card_guide_icon.png");
                LiveIconView liveIconView = this.LLILLL;
                if (liveIconView != null) {
                    C786410Ut5.LLJJIJIL(liveIconView, 0);
                }
                C16FS c16fs = this.LLILZIL;
                if (c16fs != null) {
                    C786410Ut5.LLJJJ(c16fs, 8);
                    return;
                }
                return;
            }
            if (abstractC1145640fv0 instanceof C1144900fto) {
                int visibility3 = getVisibility();
                setVisibility(0);
                C1602160rnK.LIZIZ(visibility3, 0, this);
                C1149220g0m c1149220g0m3 = this.LLILLJJLI;
                if (c1149220g0m3 != null) {
                    C1149220g0m.LIZIZ(c1149220g0m3, new SpannableStringBuilder(c1145600fuw.LIZIZ));
                }
                C1149220g0m c1149220g0m4 = this.LLILLJJLI;
                if (c1149220g0m4 != null) {
                    int visibility4 = c1149220g0m4.getVisibility();
                    c1149220g0m4.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility4, 0, c1149220g0m4);
                }
                if (c1145600fuw.LIZLLL != null) {
                    AppCompatImageView appCompatImageView = this.LL;
                    if (appCompatImageView != null) {
                        C786410Ut5.LLILIL(appCompatImageView, 0);
                    }
                    C20441214yg.LJ("MatchBottomGuideTipLayout", "updateBottomConfig: leftIconRes is not null");
                    C1819620xS4.LIZ().LJIIIZ(c1145600fuw.LIZLLL).LJJI(this.LL);
                }
                C1144880ftm c1144880ftm = c1145600fuw.LJ;
                String str2 = null;
                if (c1144880ftm != null) {
                    str = c1144880ftm.LJ;
                } else {
                    str = null;
                }
                if (C500260Jjc.LJJIIZ(str)) {
                    C16FS c16fs2 = this.LLILZIL;
                    if (c16fs2 != null) {
                        C1144880ftm c1144880ftm2 = c1145600fuw.LJ;
                        if (c1144880ftm2 != null) {
                            str2 = c1144880ftm2.LJ;
                        }
                        c16fs2.setText(str2);
                    }
                } else {
                    C16FS c16fs3 = this.LLILZIL;
                    if (c16fs3 != null) {
                        c16fs3.setText(C497740JfY.LJIJI(2131842142));
                    }
                }
                LiveIconView liveIconView2 = this.LLILLL;
                if (liveIconView2 != null) {
                    C786410Ut5.LLJJIJIL(liveIconView2, 8);
                }
                C16FS c16fs4 = this.LLILZIL;
                if (c16fs4 != null) {
                    C786410Ut5.LLJJJ(c16fs4, 0);
                }
                C16FS c16fs5 = this.LLILZIL;
                if (c16fs5 == null) {
                    return;
                }
                C500260Jjc.LJLIIIL(500L, c16fs5, new AwS596S0100000_17(awS146S0400000_17, 367));
                return;
            }
            if (!(abstractC1145640fv0 instanceof C1145680fv4)) {
                return;
            }
            int visibility5 = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility5, 0, this);
            C1149220g0m c1149220g0m5 = this.LLILLJJLI;
            if (c1149220g0m5 != null) {
                C1149220g0m.LIZIZ(c1149220g0m5, new SpannableStringBuilder(c1145600fuw.LIZIZ));
            }
            C1149220g0m c1149220g0m6 = this.LLILLJJLI;
            if (c1149220g0m6 != null) {
                int visibility6 = c1149220g0m6.getVisibility();
                c1149220g0m6.setVisibility(0);
                C1602160rnK.LIZIZ(visibility6, 0, c1149220g0m6);
            }
            int iLIZIZ = (int) C497740JfY.LIZIZ(24.0f);
            AppCompatImageView appCompatImageView2 = this.LL;
            if (appCompatImageView2 != null) {
                C500260Jjc.LJLL(iLIZIZ, iLIZIZ, appCompatImageView2);
            }
            C1143680frq.LIZLLL(this.LL, "tiktok_live_interaction_demand_1", "ttlive_match_item_icy_clash_bottom_guide_icon.png");
            LiveIconView liveIconView3 = this.LLILLL;
            if (liveIconView3 != null) {
                C786410Ut5.LLJJIJIL(liveIconView3, 0);
            }
            C16FS c16fs6 = this.LLILZIL;
            if (c16fs6 == null) {
                return;
            }
            C786410Ut5.LLJJJ(c16fs6, 8);
        }
    }
}
