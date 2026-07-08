package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import avg.f;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS561S0100000_17;
import mf.a;

/* JADX INFO: renamed from: X.0fIQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121720fIQ extends LinearLayout {
    public Function1<? super String, Unit> LL;
    public BattleComboInfo LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C1324720kZq LLILZ;
    public final View LLILZIL;
    public final TextView LLILZLL;
    public final TextView LLIZ;
    public final TextView LLIZLLLIL;

    public final BattleComboInfo getInfo() {
        return this.LLILLJJLI;
    }

    public final Function1<String, Unit> getOnClicked() {
        return this.LL;
    }

    private final void setCountTv(BattleComboInfo battleComboInfo) {
        long j = battleComboInfo.comboCount;
        if (j > 99) {
            this.LLILZLL.setText("99+");
        } else {
            this.LLILZLL.setText(String.valueOf(j));
        }
    }

    public final boolean LIZ(BattleComboInfo battleComboInfo) {
        if (this.LLILLJJLI != null) {
            return true;
        }
        C20441214yg.LIZIZ("MatchWinningStreaksIconNew", "setComboInfoOnly");
        this.LLILLJJLI = battleComboInfo;
        if (battleComboInfo.comboType == EnumC1994107rX.ACTIVITY.getType()) {
            C786410Ut5.LLJJIII(this.LLILLL, 0);
            C1324720kZq c1324720kZq = this.LLILLL;
            String str = battleComboInfo.comboIconUrl;
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                new ArrayList().add(str);
                C1324610kZf url = C1819620xS4.LIZ().setUrl(str);
                url.LJIIIZ = R.drawable.ffi;
                url.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                url.LJJI(c1324720kZq);
            } else if (c1324720kZq != null && !TextUtils.isEmpty(str) && C0JSS.LIZIZ(c1324720kZq.getContext())) {
                C1322000kVS c1322000kVSLJFF = C1322000kVS.LJFF(c1324720kZq.getContext());
                c1322000kVSLJFF.LIZLLL(str);
                c1322000kVSLJFF.LIZ.getResources().getDrawable(R.drawable.ffi);
                c1322000kVSLJFF.LIZ(ImageView.ScaleType.CENTER_CROP);
                c1322000kVSLJFF.LIZJ(c1324720kZq);
            }
            C786410Ut5.LJLLLLLL(8, this.LLILZIL);
        } else {
            C786410Ut5.LLJJIII(this.LLILLL, 8);
            C786410Ut5.LJLLLLLL(0, this.LLILZIL);
        }
        setCountTv(battleComboInfo);
        LIZIZ(battleComboInfo, new BattleComboInfo(0L, 0L, 0L, null, 0, null, "", ""));
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        return true;
    }

    public final void LIZLLL(BattleComboInfo battleComboInfo) {
        BattleComboInfo battleComboInfo2;
        boolean z;
        C20441214yg.LIZIZ("MatchWinningStreaksIconNew", "update count");
        if (battleComboInfo != null && (battleComboInfo2 = this.LLILLJJLI) != null) {
            long j = battleComboInfo.comboCount;
            long j2 = battleComboInfo2.comboCount;
            if (j == j2) {
                return;
            }
            if (j2 <= 99) {
                z = true;
            } else {
                z = false;
            }
            this.LLIZ.setText(String.valueOf(Long.valueOf(j2)));
            LIZIZ(battleComboInfo, this.LLILLJJLI);
            this.LLILLJJLI = battleComboInfo;
            setCountTv(battleComboInfo);
            if (!z) {
                C786410Ut5.LLIL(this.LLILZLL, 0);
                C786410Ut5.LLIL(this.LLIZ, 8);
                return;
            }
            TextView textView = this.LLIZ;
            TextView textView2 = this.LLILZLL;
            AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(this, 688);
            C786410Ut5.LJLLLLLL(0, textView);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
            translateAnimation.setAnimationListener(new AnimationAnimationListenerC1151560g4Y(textView, awS561S0100000_17, 0));
            translateAnimation.setInterpolator(new InterpolatorC1121730fIR(0.65f, 0.0f, 0.35f));
            translateAnimation.setDuration(300L);
            textView.startAnimation(translateAnimation);
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation2.setDuration(300L);
            translateAnimation2.setInterpolator(new InterpolatorC1121730fIR(0.65f, 0.0f, 0.35f));
            textView2.startAnimation(translateAnimation2);
            return;
        }
        C20441214yg.LIZIZ("MatchWinningStreaksIconNew", "info is empty");
    }

    public final void setOnClicked(Function1<? super String, Unit> function1) {
        this.LL = function1;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (this.LLILLJJLI == null) {
            return;
        }
        super.setVisibility(i);
    }

    public C1121720fIQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Sd(R.layout.h7u, C786410Ut5.ne(context), this);
        this.LLILLL = (C1324720kZq) findViewById(R.id.winning_streak_icon);
        this.LLILZ = (C1324720kZq) findViewById(R.id.winning_streak_win_new);
        this.LLILZIL = findViewById(R.id.view_holder);
        this.LLILZLL = (TextView) findViewById(R.id.winning_streak_counts_new);
        this.LLIZ = (TextView) findViewById(R.id.winning_streak_counts_temp_new);
        this.LLIZLLLIL = (TextView) findViewById(R.id.winning_streak_counts_place_holder_new);
        setOrientation(0);
        setBackgroundResource(R.drawable.f2p);
        View.OnClickListener aCListenerS152S0100000_17 = new ACListenerS152S0100000_17(this, 8);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS152S0100000_17) : aCListenerS152S0100000_17);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final void LIZIZ(BattleComboInfo battleComboInfo, BattleComboInfo battleComboInfo2) {
        String str;
        long j = battleComboInfo.comboCount;
        long j2 = battleComboInfo2.comboCount;
        if (j <= j2) {
            j = j2;
        }
        TextView textView = this.LLIZLLLIL;
        if (j > 99) {
            str = "99+";
        } else if (j > 9) {
            str = "99";
        } else {
            str = "9";
        }
        textView.setText(str);
    }

    public final void LIZJ(float f, float f2) {
        C1324720kZq c1324720kZq = this.LLILZ;
        ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
        if (layoutParams != null) {
            C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
            Float fValueOf = Float.valueOf(f);
            c1546210qL5.getClass();
            layoutParams.width = C814420VxA.LIZIZ(C1546210qL5.LIZ(fValueOf));
            layoutParams.height = C814420VxA.LIZIZ(C1546210qL5.LIZ(Float.valueOf(f2)));
        } else {
            layoutParams = null;
        }
        C786410Ut5.u6(c1324720kZq, layoutParams);
    }
}
