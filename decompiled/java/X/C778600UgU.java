package X;

import Y.ARunnableS112S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778600UgU extends ConstraintLayout {
    public final GradientDrawable LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final C16F5 LLJ;
    public final LiveIconView LLJI;
    public final LiveIconView LLJIJIL;
    public final C16F5 LLJILJIL;
    public final View LLJILJILJ;
    public View.OnClickListener LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    private final ValueAnimator getShowAlphaAnimator() {
        return (ValueAnimator) this.LLJJ.getValue();
    }

    private final ValueAnimator getShowScaleAnimator() {
        return (ValueAnimator) this.LLJJI.getValue();
    }

    public final View.OnClickListener getOnCloseClickListener() {
        return this.LLJILLL;
    }

    public final void e0(Throwable th) {
        ViewParent parent;
        Thread thread;
        View rootView = getRootView();
        Thread thread2 = null;
        if (rootView != null && (parent = rootView.getParent()) != null && parent.getClass().getName().equals("android.view.ViewRootImpl")) {
            try {
                thread = (Thread) parent.getClass().getDeclaredField("mThread").get(parent);
                try {
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            } catch (Throwable th3) {
                th = th3;
                thread = null;
            }
            thread2 = thread;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update ui error, is main = ");
        sbLIZ.append(Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()));
        sbLIZ.append(", ViewRootImpl: thread = ");
        sbLIZ.append(thread2);
        sbLIZ.append(", wanna content = ");
        sbLIZ.append((Object) this.LLJ.getText());
        C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), th);
    }

    public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
        this.LLJILLL = onClickListener;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        getShowAlphaAnimator().cancel();
        getShowScaleAnimator().cancel();
        if (i == 0) {
            getShowAlphaAnimator().start();
            getShowScaleAnimator().start();
        }
    }

    public C778600UgU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.LL = gradientDrawable;
        this.LLILLJJLI = C497740JfY.LJFF(R.color.bd);
        this.LLILLL = -13092808;
        this.LLILZ = C497740JfY.LJFF(R.color.cl);
        this.LLILZIL = C439101nJ.LIZ(12);
        this.LLILZLL = C439101nJ.LIZ(6);
        this.LLIZ = C439101nJ.LIZ(10);
        this.LLIZLLLIL = C439101nJ.LIZ(6);
        this.LLJJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1412));
        this.LLJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1413));
        ViewGroup.inflate(context, R.layout.hsr, this);
        this.LLJ = (C16F5) findViewById(R.id.znh);
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.lhz);
        this.LLJI = liveIconView;
        this.LLJIJIL = (LiveIconView) findViewById(R.id.li8);
        C16F5 c16f5 = (C16F5) findViewById(R.id.z86);
        this.LLJILJIL = c16f5;
        this.LLJILJILJ = findViewById(R.id.nah);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C439101nJ.LIZ(4));
        C500260Jjc.LJLIIIL(500L, liveIconView, new AwS591S0100000_12(this, 1085));
        C500260Jjc.LJLIIIL(500L, c16f5, new AwS591S0100000_12(this, 1086));
    }

    public final void h0(EnumC778100Ufg enumC778100Ufg, CharSequence charSequence, Object obj) {
        Integer num;
        ImageModel imageModel;
        C778580UgS c778580UgS;
        boolean z;
        Drawable drawable;
        View view;
        if (obj instanceof C778610UgV) {
            C778610UgV c778610UgV = (C778610UgV) obj;
            imageModel = c778610UgV.LIZIZ;
            num = c778610UgV.LIZJ;
            if (num == null) {
                num = null;
            }
        } else {
            num = null;
            imageModel = null;
        }
        if (obj instanceof C778580UgS) {
            c778580UgS = (C778580UgS) obj;
        } else if (obj instanceof C778680Ugc) {
            c778580UgS = ((C778680Ugc) obj).LIZIZ;
        } else if (enumC778100Ufg.getLeftIcon() != null) {
            c778580UgS = new C778580UgS(enumC778100Ufg.getLeftIcon().LIZ, enumC778100Ufg.getLeftIcon().LIZIZ);
        } else {
            c778580UgS = null;
        }
        this.LLJ.setTextColor(this.LLILLJJLI);
        this.LLJILJIL.setTextColor(this.LLILLJJLI);
        if (enumC778100Ufg.getPriority() == 0 || (enumC778100Ufg.getPriority() == 1 && enumC778100Ufg.isRed())) {
            z = true;
        } else {
            z = false;
        }
        if (num != null) {
            this.LL.setColor(num.intValue());
        } else if (z) {
            this.LL.setColor(this.LLILZ);
        } else {
            this.LL.setColor(this.LLILLL);
        }
        setBackground(this.LL);
        if (c778580UgS != null) {
            this.LLJIJIL.setIconTintList(c778580UgS.LIZIZ);
            this.LLJIJIL.setImageDrawable(c778580UgS.LIZ);
            C12ES.LJIILL(0, this.LLJIJIL);
            drawable = c778580UgS.LIZ;
        } else {
            C439101nJ.LJI(this.LLJIJIL);
            this.LLJIJIL.setIconTintList(null);
            drawable = null;
        }
        if (imageModel != null) {
            C12ES.LJIILL(0, this.LLJIJIL);
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.FIT_CENTER;
            if (drawable != null) {
                c1324610kZfLJIIIZ.LJIIJJI = drawable;
            }
            c1324610kZfLJIIIZ.LJJI(this.LLJIJIL);
        }
        this.LLJ.setText(charSequence);
        if (enumC778100Ufg.getRightText() != null) {
            this.LLJILJIL.setText(enumC778100Ufg.getRightText());
            C12ES.LJIILL(0, this.LLJILJIL);
            View view2 = this.LLJILJILJ;
            if (view2 != null) {
                C12ES.LJIILL(0, view2);
            }
        } else {
            C439101nJ.LJI(this.LLJILJIL);
        }
        C778580UgS rightIcon = enumC778100Ufg.getRightIcon();
        if (rightIcon != null && rightIcon.LIZ != null) {
            this.LLJI.setIconTintList(rightIcon.LIZIZ);
            this.LLJI.setIcon(rightIcon.LIZ);
            C12ES.LJIILL(0, this.LLJI);
            View view3 = this.LLJILJILJ;
            if (view3 != null) {
                C12ES.LJIILL(0, view3);
            }
            HandlerHook.viewPost(this, new ARunnableS112S0100000_12(this, 422));
        } else {
            C439101nJ.LJI(this.LLJI);
            this.LLJI.setIconTintList(null);
            setTouchDelegate(null);
        }
        if (enumC778100Ufg.getRightText() == null && enumC778100Ufg.getRightIcon() == null && (view = this.LLJILJILJ) != null) {
            C439101nJ.LJI(view);
        }
    }
}
