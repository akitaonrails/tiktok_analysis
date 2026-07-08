package X;

import Y.ALAdapterS21S0100000_26;
import Y.AUListenerS274S0100000_26;
import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.dependency.commonfeed.CommonFeedDependService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.commonfeed.ICommonFeedDependService;

/* JADX INFO: renamed from: X.0w2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765350w2X implements InterfaceC1058150ddt {
    public final Interpolator LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public InterfaceC1765400w2c LLILZ;
    public InterfaceC1765380w2a LLILZIL;
    public TuxSheet LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public final float LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public boolean LLJILJILJ;

    public C1765350w2X() {
        this(0);
    }

    public final Integer LIZIZ() {
        Object c098200Yq;
        FragmentManager childFragmentManager;
        Fragment fragmentLJJJJZI;
        try {
            TuxSheet tuxSheet = this.LLILZLL;
            if (tuxSheet == null || (childFragmentManager = tuxSheet.getChildFragmentManager()) == null || (fragmentLJJJJZI = childFragmentManager.LJJJJZI("sheet_content_fragment")) == null) {
                c098200Yq = null;
            } else {
                String str = TuxSheet._pnsPageId;
                c098200Yq = C1391190mJ3.LJIIIZ(fragmentLJJJJZI);
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C16BC c16bc = (C16BC) c098200Yq;
        if (C299110Bnx.LIZ()) {
            TuxSheetBehavior tuxSheetBehavior = c16bc instanceof TuxSheetBehavior ? (TuxSheetBehavior) c16bc : null;
            if (tuxSheetBehavior != null) {
                return Integer.valueOf(tuxSheetBehavior.getPeekHeight());
            }
            return null;
        }
        BottomSheetBehavior bottomSheetBehavior = c16bc instanceof BottomSheetBehavior ? (BottomSheetBehavior) c16bc : null;
        if (bottomSheetBehavior != null) {
            return Integer.valueOf(bottomSheetBehavior.getPeekHeight());
        }
        return null;
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    public final void LIZ() {
        View view;
        TuxSheet tuxSheet = this.LLILZLL;
        if (tuxSheet == null || (view = tuxSheet.getView()) == null) {
            return;
        }
        int measuredHeight = view.getMeasuredHeight();
        Integer numLIZIZ = LIZIZ();
        if (numLIZIZ != null) {
            int iIntValue = numLIZIZ.intValue();
            if (measuredHeight <= 0 || iIntValue <= 0) {
                return;
            }
            this.LLIZ = measuredHeight;
            this.LLIZLLLIL = iIntValue;
            this.LLJILJIL = LIZJ(measuredHeight, iIntValue);
            this.LLJIJIL = C814420VxA.LIZIZ(this.LLIZ * this.LLJI);
            InterfaceC1765380w2a interfaceC1765380w2a = this.LLILZIL;
            if (interfaceC1765380w2a != null) {
                interfaceC1765380w2a.LLJLL(this.LLIZLLLIL, this.LLJILJIL);
            }
        }
    }

    public C1765350w2X(Interpolator interpolator) {
        this.LL = interpolator;
        this.LLILLJJLI = 1;
        this.LLJI = 1.0f;
    }

    public final void G2(int i) {
        int i2;
        if (i == 4 && ((i2 = this.LLILLJJLI) == 3 || i2 == 0)) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS274S0100000_26(this, 13));
            valueAnimatorOfFloat.addListener(new ALAdapterS21S0100000_26(this, 10));
            valueAnimatorOfFloat.start();
        }
        InterfaceC1765400w2c interfaceC1765400w2c = this.LLILZ;
        if (interfaceC1765400w2c != null) {
            interfaceC1765400w2c.LIZ(this.LLILLJJLI, i);
        }
        this.LLILLJJLI = i;
    }

    public final void sy(View view) {
        ViewTreeObserverOnGlobalLayoutListenerC1775960wJe viewTreeObserverOnGlobalLayoutListenerC1775960wJe = new ViewTreeObserverOnGlobalLayoutListenerC1775960wJe(this, view, 0);
        C786410Ut5.x3(view.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1775960wJe);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1775890wJX(view, viewTreeObserverOnGlobalLayoutListenerC1775960wJe, 1));
    }

    public /* synthetic */ C1765350w2X(int i) {
        this(C1619980sG4.LJIILIIL());
    }

    public final float LIZJ(int i, int i2) {
        AnonymousClass0317 anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = CommonFeedDependService.createICommonFeedDependServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = ICommonFeedDependService.class.getName();
            if (anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommonFeedDependService.class);
        }
        if (((ICommonFeedDependService) anonymousClass0317CreateICommonFeedDependServicebyMonsterPlugin).isUnifyShrinkAbilityEnableFeedParams()) {
            return i2;
        }
        if (this.LLJILJILJ) {
            return i2;
        }
        return i * 0.73f;
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        float f2;
        int iLIZIZ;
        int i;
        InterfaceC1765380w2a interfaceC1765380w2a;
        if (this.LLILLL && f < 0.0f && f < this.LLJ && this.LLILLJJLI != 4) {
            G2(4);
        }
        this.LLJ = f;
        if (this.LLIZ == 0) {
            View view = tuxSheet.getView();
            if (view != null) {
                this.LLIZ = view.getMeasuredHeight();
            } else {
                return;
            }
        }
        if (this.LLIZLLLIL == 0) {
            Integer numLIZIZ = LIZIZ();
            if (numLIZIZ != null) {
                this.LLIZLLLIL = numLIZIZ.intValue();
            } else {
                return;
            }
        }
        if (this.LLJIJIL == 0) {
            this.LLJIJIL = C814420VxA.LIZIZ(this.LLIZ * this.LLJI);
        }
        if (this.LLJILJIL < 0.001f) {
            this.LLJILJIL = LIZJ(this.LLIZ, this.LLIZLLLIL);
        }
        if (f >= 0.0f) {
            f2 = this.LLIZLLLIL + ((this.LLIZ - r2) * f);
        } else {
            f2 = (1 + f) * this.LLIZLLLIL;
        }
        if (Math.abs(f2) <= Float.MAX_VALUE && (iLIZIZ = C814420VxA.LIZIZ(f2)) <= (i = this.LLJIJIL) && (interfaceC1765380w2a = this.LLILZIL) != null) {
            if (iLIZIZ > i) {
                iLIZIZ = i;
            }
            interfaceC1765380w2a.LLJLL(iLIZIZ, this.LLJILJIL);
        }
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        boolean z = false;
        Integer num = 0;
        if (i == 2) {
            z = true;
        }
        this.LLILLL = z;
        if (i != 1) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    num = 1;
                } else {
                    return;
                }
            }
        } else {
            num = 2;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            InterfaceC1765400w2c interfaceC1765400w2c = this.LLILZ;
            if (interfaceC1765400w2c != null) {
                interfaceC1765400w2c.LIZ(this.LLILLJJLI, iIntValue);
            }
            this.LLILLJJLI = iIntValue;
        }
    }
}
