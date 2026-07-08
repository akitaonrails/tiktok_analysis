package X;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import kotlin.jvm.internal.AwS16S0000001_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0gSx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166690gSx implements InterfaceC1324370kZH {
    public static final int LLJILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52));
    public static final int LLJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
    public static final int LLJJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88));
    public AwS419S0200000_18 LL;
    public AwS562S0100000_18 LLILLJJLI;
    public AwS562S0100000_18 LLILLL;
    public ViewOnAttachStateChangeListenerC20604515jv LLILZ;
    public C1749280vcc LLILZIL;
    public TuxNavBar LLILZLL;
    public C16GX LLIZ;
    public C21543519Sv LLIZLLLIL;
    public View LLJ;
    public ViewStub LLJI;
    public TuxIconView LLJIJIL;
    public AnimatorSet LLJILJIL;
    public Integer LLJILJILJ;

    public final void LIZ(int i, boolean z) {
        C21543519Sv c21543519Sv;
        if (z) {
            Integer numValueOf = this.LLJILJILJ;
            if (numValueOf == null) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLILZ;
                if (viewOnAttachStateChangeListenerC20604515jv != null) {
                    int screenHeight = (ScreenUtils.getScreenHeight(viewOnAttachStateChangeListenerC20604515jv.getContext()) - viewOnAttachStateChangeListenerC20604515jv.getTop()) / LLJJI;
                    this.LLJILJILJ = Integer.valueOf(screenHeight);
                    numValueOf = Integer.valueOf(screenHeight);
                    if (numValueOf == null) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (numValueOf.intValue() < i && (c21543519Sv = this.LLIZLLLIL) != null) {
                ViewGroup.LayoutParams layoutParams = c21543519Sv.getLayoutParams();
                if (layoutParams != null) {
                    C16GZ c16gz = (C16GZ) layoutParams;
                    c16gz.LIZ = 3;
                    C786410Ut5.W5(c21543519Sv, c16gz);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            }
            return;
        }
        C21543519Sv c21543519Sv2 = this.LLIZLLLIL;
        if (c21543519Sv2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = c21543519Sv2.getLayoutParams();
        if (layoutParams2 != null) {
            C16GZ c16gz2 = (C16GZ) layoutParams2;
            c16gz2.LIZ = 0;
            C786410Ut5.W5(c21543519Sv2, c16gz2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
    }

    @Override // X.InterfaceC1324380kZI
    public final void LLZZJLIL(C16GX c16gx, int i) {
        float totalScrollRange;
        View viewLJII;
        if (c16gx.getTotalScrollRange() <= 0) {
            return;
        }
        if (c16gx.getTotalScrollRange() - Math.abs(i) >= 0) {
            int iAbs = Math.abs(i);
            int i2 = LLJJ;
            totalScrollRange = (iAbs - i2) / (c16gx.getTotalScrollRange() - i2);
        } else {
            totalScrollRange = 0.0f;
        }
        new AwS16S0000001_18(totalScrollRange, 3);
        TuxNavBar tuxNavBar = this.LLILZLL;
        if (tuxNavBar != null && (viewLJII = tuxNavBar.LJII("title")) != null) {
            C786410Ut5.T4(viewLJII, totalScrollRange);
        }
    }
}
