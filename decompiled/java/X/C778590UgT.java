package X;

import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UgT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778590UgT extends C779160UhO {
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public DataChannel LJIILJJIL;
    public int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final GradientDrawable LJIJ;
    public final C16F5 LJIJI;
    public final LiveIconView LJIJJ;
    public final LiveIconView LJIJJLI;
    public final C16F5 LJIL;
    public final View LJJ;
    public float LJJI;
    public float LJJIFFI;
    public ACListenerS147S0100000_12 LJJII;
    public final C01GW LJJIII;
    public final C01GW LJJIIJ;

    @Override // X.C779160UhO
    public final void LJIIJJI() {
        C20441214yg.LJIIIZ("FloatTipView", "show().");
        LJIILL(true, false);
    }

    @Override // X.C779160UhO
    public final void LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hide(). !isShow=");
        sbLIZ.append(!(!this.LJ));
        C20441214yg.LJIIIZ("FloatTipView", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJ) {
            LJIILL(false, true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C778590UgT(int i) {
        View viewSd;
        Context contextN3 = C786410Ut5.N3(C497740JfY.LJII());
        super(contextN3);
        int iLIZ = C439101nJ.LIZ(215);
        this.LJI = iLIZ;
        int iLIZ2 = C439101nJ.LIZ(34);
        this.LJII = iLIZ2;
        this.LJIIIIZZ = C439101nJ.LIZ(12);
        this.LJIIIZ = C439101nJ.LIZ(6);
        this.LJIIJ = C439101nJ.LIZ(10);
        this.LJIIJJI = C439101nJ.LIZ(6);
        this.LJIIL = true;
        this.LJIILIIL = true;
        this.LJIILL = C497740JfY.LJFF(R.color.cw);
        this.LJIILLIIL = C497740JfY.LJFF(R.color.bd);
        this.LJIIZILJ = C497740JfY.LJFF(R.color.cl);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.LJIJ = gradientDrawable;
        this.LJJIFFI = 1.0f;
        if (C497740JfY.LJJ()) {
            viewSd = C786410Ut5.Sd(R.layout.hss, C786410Ut5.ne(contextN3), null);
        } else {
            viewSd = C786410Ut5.Sd(R.layout.hsq, C786410Ut5.ne(contextN3), null);
        }
        this.LIZLLL = viewSd;
        this.LJIJI = (C16F5) viewSd.findViewById(R.id.znh);
        LiveIconView liveIconView = (LiveIconView) viewSd.findViewById(R.id.lhz);
        this.LJIJJ = liveIconView;
        this.LJIJJLI = (LiveIconView) viewSd.findViewById(R.id.li8);
        C16F5 c16f5 = (C16F5) viewSd.findViewById(R.id.z86);
        this.LJIL = c16f5;
        this.LJJ = viewSd.findViewById(R.id.nah);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C439101nJ.LIZ(4));
        LJIIL(iLIZ, iLIZ2);
        C500260Jjc.LJLIIIL(500L, liveIconView, new AwS591S0100000_12(this, 1100));
        C500260Jjc.LJLIIIL(500L, c16f5, new AwS591S0100000_12(this, 1102));
        LJII(0, 0);
        this.LJJIII = C452501pT.LIZIZ(new AwS556S0100000_12(this, 906));
        this.LJJIIJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 907));
    }

    public final void LJIILLIIL(Throwable th) {
        View rootView;
        ViewParent parent;
        Thread thread;
        View view = this.LIZLLL;
        Thread thread2 = null;
        if (view != null && (rootView = view.getRootView()) != null && (parent = rootView.getParent()) != null && parent.getClass().getName().equals("android.view.ViewRootImpl")) {
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
        sbLIZ.append((Object) this.LJIJI.getText());
        C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), th);
    }

    public final void LJIILL(boolean z, boolean z2) {
        float f;
        float alpha = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        View view = this.LIZLLL;
        if (view != null) {
            alpha = view.getAlpha();
        }
        this.LJJI = alpha;
        if (z2) {
            View view2 = this.LIZLLL;
            if (view2 != null) {
                C786410Ut5.T4(view2, f);
            }
            if (z != (!this.LJ)) {
                if (z) {
                    LJIIIZ();
                    return;
                } else {
                    LJI();
                    return;
                }
            }
            return;
        }
        if (((ValueAnimator) this.LJJIII.getValue()).isRunning()) {
            ((ValueAnimator) this.LJJIII.getValue()).cancel();
        }
        if (((ValueAnimator) this.LJJIIJ.getValue()).isRunning()) {
            ((ValueAnimator) this.LJJIIJ.getValue()).cancel();
        }
        if (true != (!this.LJ)) {
            LJIIIZ();
        }
        this.LJJIFFI = f - this.LJJI;
        ((ValueAnimator) this.LJJIII.getValue()).start();
        ((ValueAnimator) this.LJJIIJ.getValue()).start();
    }

    public final void LJIIZILJ(EnumC778100Ufg enumC778100Ufg, CharSequence charSequence, Object obj) {
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
        this.LJIJI.setTextColor(this.LJIILLIIL);
        this.LJIL.setTextColor(this.LJIILLIIL);
        int measuredHeight = 0;
        if (enumC778100Ufg.getPriority() == 0 || (enumC778100Ufg.getPriority() == 1 && enumC778100Ufg.isRed())) {
            z = true;
        } else {
            z = false;
        }
        if (num != null) {
            this.LJIJ.setColor(num.intValue());
        } else if (z) {
            this.LJIJ.setColor(this.LJIIZILJ);
        } else {
            this.LJIJ.setColor(this.LJIILL);
        }
        View view2 = this.LIZLLL;
        if (view2 != null) {
            view2.setBackground(this.LJIJ);
        }
        if (c778580UgS != null) {
            this.LJIJJLI.setIconTintList(c778580UgS.LIZIZ);
            this.LJIJJLI.setImageDrawable(c778580UgS.LIZ);
            C12ES.LJIILL(0, this.LJIJJLI);
            drawable = c778580UgS.LIZ;
        } else {
            C439101nJ.LJI(this.LJIJJLI);
            this.LJIJJLI.setIconTintList(null);
            drawable = null;
        }
        if (imageModel != null) {
            C12ES.LJIILL(0, this.LJIJJLI);
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.FIT_CENTER;
            if (drawable != null) {
                c1324610kZfLJIIIZ.LJIIJJI = drawable;
            }
            c1324610kZfLJIIIZ.LJJI(this.LJIJJLI);
        }
        this.LJIJI.setText(charSequence);
        if (enumC778100Ufg.getRightText() != null) {
            this.LJIL.setText(enumC778100Ufg.getRightText());
            C12ES.LJIILL(0, this.LJIL);
            View view3 = this.LJJ;
            if (view3 != null) {
                C12ES.LJIILL(0, view3);
            }
        } else {
            C439101nJ.LJI(this.LJIL);
        }
        C778580UgS rightIcon = enumC778100Ufg.getRightIcon();
        if (rightIcon != null && rightIcon.LIZ != null) {
            this.LJIJJ.setIconTintList(rightIcon.LIZIZ);
            this.LJIJJ.setIcon(rightIcon.LIZ);
            C12ES.LJIILL(0, this.LJIJJ);
            View view4 = this.LJJ;
            if (view4 != null) {
                C12ES.LJIILL(0, view4);
            }
            View view5 = this.LIZLLL;
            if (view5 != null) {
                HandlerHook.viewPost(view5, new ARunnableS112S0100000_12(this, 426));
            }
        } else {
            C439101nJ.LJI(this.LJIJJ);
            this.LJIJJ.setIconTintList(null);
            View view6 = this.LIZLLL;
            if (view6 != null) {
                view6.setTouchDelegate(null);
            }
        }
        if (enumC778100Ufg.getRightText() == null && enumC778100Ufg.getRightIcon() == null && (view = this.LJJ) != null) {
            C439101nJ.LJI(view);
        }
        View view7 = this.LIZLLL;
        if (view7 != null) {
            view7.measure(1073741824, 0);
        }
        int i = this.LJI;
        int i2 = this.LJII;
        View view8 = this.LIZLLL;
        if (view8 != null) {
            measuredHeight = view8.getMeasuredHeight();
        }
        LJIIL(i, Math.max(i2, measuredHeight));
        LJIIJJI();
    }
}
