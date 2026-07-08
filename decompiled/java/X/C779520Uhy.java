package X;

import Y.AAListenerS323S0100000_12;
import Y.ACListenerS147S0100000_12;
import Y.ATListenerS446S0100000_12;
import Y.AUListenerS262S0100000_12;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.publicscreen.api.NewMessageNumChannel;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentDeleteForbidRegionalSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uhy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779520Uhy extends ConstraintLayout {
    public static final /* synthetic */ int LLJJJJJIL = 0;
    public final C1668210tVr LL;
    public final ViewGroup LLILLJJLI;
    public final TuxSkeletonLayout LLILLL;
    public final View LLILZ;
    public final C417450GYl LLILZIL;
    public final TextView LLILZLL;
    public final TextView LLIZ;
    public final ConstraintLayout LLIZLLLIL;
    public C1116210f9X LLJ;
    public DataChannel LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;
    public boolean LLJILLL;
    public String LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public ValueAnimator LLJJIJIL;
    public final ValueAnimator LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;

    public C779520Uhy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final boolean getCanHide() {
        return this.LLJJIJIIJIL;
    }

    public final int getEndX() {
        return this.LLJJIJI;
    }

    public final int getHideNum() {
        return this.LLJJI;
    }

    public final int getStartX() {
        return this.LLJJIII;
    }

    public final void LJJJJLL(boolean z) {
        this.LLJJJ.cancel();
        this.LLJJIJIL.cancel();
        if (z && this.LLJJJJ && getVisibility() == 0) {
            this.LLJJJIL = false;
            this.LLJJIJIL.addListener(new AAListenerS323S0100000_12(this, 4));
            this.LLJJJ.start();
            this.LLJJIJIL.start();
            return;
        }
        C439101nJ.LJI(this.LLIZLLLIL);
    }

    public final void e0(C1116210f9X c1116210f9X) {
        int iIntValue;
        Integer num;
        if (c1116210f9X == null) {
            LJJJJLL(false);
            return;
        }
        if (this.LLJILLL && (Intrinsics.LJFF(c1116210f9X.LL, this.LLJILJILJ) || Intrinsics.LJFF(c1116210f9X.LL, "") || c1116210f9X.LLJIJIL == EnumC1116160f9S.BLANK)) {
            LJJJJLL(false);
            return;
        }
        this.LLJILLL = false;
        this.LLJ = c1116210f9X;
        if (c1116210f9X.LLILZLL == 20) {
            this.LL.setGear(C0CFG.HIGH);
            this.LLJIJIL = "up_grade";
        } else {
            this.LL.setGear(C0CFG.LOW);
            this.LLJIJIL = "basic";
        }
        if (c1116210f9X.LLJIJIL == EnumC1116160f9S.BLANK) {
            C786410Ut5.LLLZL(this.LLILLL, 0);
            C786410Ut5.LJLZ(8, this.LLILLJJLI);
        } else {
            C786410Ut5.LLLZL(this.LLILLL, 8);
            C786410Ut5.LJLZ(0, this.LLILLJJLI);
            C417450GYl c417450GYl = this.LLILZIL;
            int visibility = c417450GYl.getVisibility();
            c417450GYl.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, c417450GYl);
            C417450GYl c417450GYl2 = this.LLILZIL;
            long j = c1116210f9X.LLJ;
            if (c1116210f9X.LLILZLL == 20) {
                LinearLayout linearLayout = c417450GYl2.LL;
                if (linearLayout != null) {
                    C786410Ut5.LJZL(8, linearLayout);
                }
                LinearLayout linearLayout2 = c417450GYl2.LLILLJJLI;
                if (linearLayout2 != null) {
                    C786410Ut5.LJZL(0, linearLayout2);
                }
                c417450GYl2.setHighGearDuration(j);
            } else {
                LinearLayout linearLayout3 = c417450GYl2.LL;
                if (linearLayout3 != null) {
                    C786410Ut5.LJZL(0, linearLayout3);
                }
                LinearLayout linearLayout4 = c417450GYl2.LLILLJJLI;
                if (linearLayout4 != null) {
                    C786410Ut5.LJZL(8, linearLayout4);
                }
                c417450GYl2.setLowGearDuration(j);
            }
        }
        this.LLILZLL.setText(C0KVU.LIZ(c1116210f9X.LLILLJJLI));
        this.LLIZ.setText(c1116210f9X.LLILLL);
        if (!Intrinsics.LJFF(c1116210f9X.LL, this.LLJILJIL)) {
            this.LLJILJIL = c1116210f9X.LL;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_star_comment_overlay_show");
            c474500IjALIZ.LJJII(this.LLJIJIL, "gear_type");
            c474500IjALIZ.LJJII(this.LLJILJIL, "comment_id");
            c474500IjALIZ.LJJII(this.LLJJ, "overlay_status");
            c474500IjALIZ.LJJII("floating_bal", "overlay_type");
            c474500IjALIZ.LIZ();
            if (InterfaceC772390URp.LLLZZ.LIZIZ().booleanValue()) {
                DataChannel dataChannel = this.LLJI;
                if (dataChannel != null && (num = (Integer) dataChannel.gg0(NewMessageNumChannel.class)) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
                int i = iIntValue - 1;
                DataChannel dataChannel2 = this.LLJI;
                if (dataChannel2 != null) {
                    dataChannel2.zW(NewMessageNumChannel.class, Integer.valueOf(i));
                }
            }
        }
        C786410Ut5.c5(this.LLIZLLLIL, 1.0f);
        C786410Ut5.Ub(this.LLIZLLLIL, 1.0f);
        C786410Ut5.uc(this.LLIZLLLIL, 1.0f);
        this.LLJJJ.cancel();
        this.LLJJIJIL.cancel();
        if (this.LLIZLLLIL.getVisibility() == 8) {
            C12ES.LJIILL(0, this.LLIZLLLIL);
            this.LLJJJIL = true;
            this.LLJJIJIL.removeAllListeners();
            this.LLJJJ.start();
            this.LLJJIJIL.start();
        }
        C12ES.LJIILL(0, this.LLIZLLLIL);
    }

    public final void setCanHide(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public final void setEndX(int i) {
        this.LLJJIJI = i;
    }

    public final void setHideNum(int i) {
        this.LLJJI = i;
    }

    public final void setStartX(int i) {
        this.LLJJIII = i;
    }

    public C779520Uhy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJIJIL = "";
        this.LLJILJIL = "";
        this.LLJILJILJ = "";
        this.LLJJ = "";
        this.LLJJJIL = true;
        this.LLJJJJ = true;
        ViewGroup.inflate(context, R.layout.h4o, this);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.is3);
        this.LLIZLLLIL = constraintLayout;
        this.LL = (C1668210tVr) findViewById(R.id.c9c);
        this.LLILLJJLI = (ViewGroup) findViewById(R.id.eux);
        TuxSkeletonLayout tuxSkeletonLayout = (TuxSkeletonLayout) findViewById(R.id.veq);
        this.LLILLL = tuxSkeletonLayout;
        this.LLILZ = findViewById(R.id.fl1);
        this.LLILZIL = (C417450GYl) findViewById(R.id.xlq);
        this.LLILZLL = (TextView) findViewById(R.id.p09);
        this.LLIZ = (TextView) findViewById(R.id.eu1);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(1000L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(2);
        valueAnimator.setIntValues(tuxSkeletonLayout.getPlaceholderColor(), tuxSkeletonLayout.getPulsingColor());
        valueAnimator.setEvaluator(new ArgbEvaluator());
        tuxSkeletonLayout.setAnimator(valueAnimator);
        C500260Jjc.LJJZ(C439101nJ.LIZ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), constraintLayout);
        constraintLayout.setOnTouchListener(new ATListenerS446S0100000_12(this, 12));
        C500260Jjc.LJJZ(-2, constraintLayout);
        ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(this, 23));
        this.LLJJIJIL = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ObjectAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS262S0100000_12(this, 24));
        this.LLJJJ = valueAnimatorOfFloat2;
    }

    public final void h0(boolean z, DataChannel dataChannel, C776870Udh c776870Udh) {
        this.LLJI = dataChannel;
        if (z) {
            this.LLJJ = "unfolded";
            C786410Ut5.T7(this.LLILZLL, new ACListenerS147S0100000_12(c776870Udh, 182));
            C786410Ut5.T7(this.LLIZ, new ACListenerS147S0100000_12(c776870Udh, 183));
            ValueAnimator valueAnimatorOfFloat = ObjectAnimator.ofFloat(0.8f, 1.0f);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS262S0100000_12(this, 25));
            this.LLJJIJIL = valueAnimatorOfFloat;
            this.LLJJJJ = false;
        } else {
            this.LLIZLLLIL.getLayoutParams().width = C439101nJ.LIZ(140);
            this.LLJJ = "folded";
            this.LL.m62setBackgroundColor8_81llA(C1685850tyJ.LIZLLL(2147483648L));
        }
        if (LiveStarCommentDeleteForbidRegionalSetting.INSTANCE.getValue()) {
            C439101nJ.LJI(this.LLILZ);
            return;
        }
        C12ES.LJIILL(0, this.LLILZ);
        C786410Ut5.I7(new ACListenerS147S0100000_12((Object) this, 184), this.LLILZ);
    }

    public /* synthetic */ C779520Uhy(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
