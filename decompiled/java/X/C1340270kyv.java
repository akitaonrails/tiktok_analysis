package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import irm.AkS89S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340270kyv extends FrameLayout implements InterfaceC1339670kxx {
    public ObjectAnimator LL;
    public TuxIconView LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxIconView LLILZ;

    @Override // X.InterfaceC1339670kxx
    public final void LJII() {
        TuxIconView tuxIconView = this.LLILZ;
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            }
            TuxIconView tuxIconView2 = this.LLILZ;
            if (tuxIconView2 == null) {
                tuxIconView2 = null;
            }
            ViewGroup.LayoutParams layoutParams2 = tuxIconView2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            }
        }
        TuxIconView tuxIconView3 = this.LLILLJJLI;
        if (tuxIconView3 != null) {
            ViewGroup.LayoutParams layoutParams3 = tuxIconView3.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(37));
            }
            TuxIconView tuxIconView4 = this.LLILLJJLI;
            if (tuxIconView4 == null) {
                tuxIconView4 = null;
            }
            ViewGroup.LayoutParams layoutParams4 = tuxIconView4.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
            }
        }
        TuxIconView tuxIconView5 = this.LLILLL;
        if (tuxIconView5 != null) {
            ViewGroup.LayoutParams layoutParams5 = tuxIconView5.getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(37));
            }
            TuxIconView tuxIconView6 = this.LLILLL;
            ViewGroup.LayoutParams layoutParams6 = (tuxIconView6 != null ? tuxIconView6 : null).getLayoutParams();
            if (layoutParams6 != null) {
                layoutParams6.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
            }
        }
    }

    @Override // X.InterfaceC1339670kxx
    public void setTranslateClickListener(InterfaceC1340280kyw interfaceC1340280kyw) {
        TuxIconView tuxIconView = this.LLILLJJLI;
        TuxIconView tuxIconView2 = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.I7(new AkS89S0100000_21(interfaceC1340280kyw, 1), tuxIconView);
        TuxIconView tuxIconView3 = this.LLILLL;
        if (tuxIconView3 != null) {
            tuxIconView2 = tuxIconView3;
        }
        C786410Ut5.I7(new AkS89S0100000_21(interfaceC1340280kyw, 2), tuxIconView2);
    }

    @Override // X.InterfaceC1339670kxx
    public void setTranslationState(AbstractC1340120kyg abstractC1340120kyg) {
        TuxIconView tuxIconView = this.LLILLJJLI;
        TuxIconView tuxIconView2 = null;
        TuxIconView tuxIconView3 = null;
        ObjectAnimator objectAnimator = null;
        if (tuxIconView == null) {
            tuxIconView = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        TuxIconView tuxIconView4 = this.LLILLL;
        if (tuxIconView4 == null) {
            tuxIconView4 = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
        TuxIconView tuxIconView5 = this.LLILZ;
        if (tuxIconView5 == null) {
            tuxIconView5 = null;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
        ObjectAnimator objectAnimator2 = this.LL;
        if (objectAnimator2 == null) {
            objectAnimator2 = null;
        }
        objectAnimator2.cancel();
        if (abstractC1340120kyg instanceof C1340020kyW) {
            if (((C1340020kyW) abstractC1340120kyg).LIZIZ) {
                TuxIconView tuxIconView6 = this.LLILLL;
                if (tuxIconView6 != null) {
                    tuxIconView3 = tuxIconView6;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(abstractC1340120kyg, C1340030kyX.LIZIZ)) {
            TuxIconView tuxIconView7 = this.LLILZ;
            if (tuxIconView7 == null) {
                tuxIconView7 = null;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView7, 0);
            ObjectAnimator objectAnimator3 = this.LL;
            if (objectAnimator3 != null) {
                objectAnimator = objectAnimator3;
            }
            C786410Ut5.Pd(objectAnimator);
            return;
        }
        if (Intrinsics.LJFF(abstractC1340120kyg, C1340130kyh.LIZIZ)) {
            TuxIconView tuxIconView8 = this.LLILLJJLI;
            if (tuxIconView8 != null) {
                tuxIconView2 = tuxIconView8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            return;
        }
        if (abstractC1340120kyg == null) {
        } else {
            throw new C1954807lC();
        }
    }

    public C1340270kyv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(getContext(), R.layout.a59, this);
        this.LLILZ = (TuxIconView) findViewById(R.id.nmk);
        this.LLILLJJLI = (TuxIconView) findViewById(R.id.yir);
        this.LLILLL = (TuxIconView) findViewById(R.id.y4z);
        TuxIconView tuxIconView = this.LLILZ;
        ObjectAnimator duration = ObjectAnimator.ofFloat(tuxIconView == null ? null : tuxIconView, "rotation", 0.0f, 360.0f).setDuration(800L);
        this.LL = duration;
        (duration == null ? null : duration).setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimator = this.LL;
        (objectAnimator != null ? objectAnimator : null).setRepeatCount(-1);
    }
}
