package X;

import Y.ALAdapterS2S0101000_17;
import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.ShortTouchPreviewSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eth, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106390eth implements InterfaceC1101720emA {
    public long LIZ;
    public boolean LIZIZ;
    public final C1106430etl LIZJ;

    @Override // X.InterfaceC1101720emA
    public final void LLLZI() {
    }

    @Override // X.InterfaceC1101720emA
    public final boolean Ur() {
        return false;
    }

    @Override // X.InterfaceC1101720emA
    public final int Vr() {
        return 0;
    }

    @Override // X.InterfaceC1101720emA
    public final void LJLJL() {
        C1106430etl c1106430etl = this.LIZJ;
        c1106430etl.getClass();
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("destroy");
        InterfaceC469401sC interfaceC469401sC = c1106430etl.LLILLL;
        if (interfaceC469401sC != null) {
            interfaceC469401sC.cancel();
        }
        if (c1106430etl.getComposition() != null) {
            c1106430etl.updateBitmap("preview_image", null);
        }
    }

    @Override // X.InterfaceC1101720emA
    public final String Sr() {
        return C1099470eiX.LIZ(this);
    }

    @Override // X.InterfaceC1101720emA
    public final View LLLILZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1101720emA
    public final InterfaceC1101940emW Tr(ViewGroup viewGroup, boolean z) {
        int marginStart;
        ViewGroup.MarginLayoutParams marginLayoutParamsLJI = C1744700vVE.LJI(viewGroup);
        if (marginLayoutParamsLJI != null) {
            marginStart = marginLayoutParamsLJI.getMarginStart();
        } else {
            marginStart = 0;
        }
        this.LIZJ.addAnimatorListener(new ALAdapterS2S0101000_17(marginStart, viewGroup, 0));
        return new InterfaceC1101940emW() { // from class: X.0eti
            @Override // X.InterfaceC1101940emW
            public final Function1<Animator.AnimatorListener, Unit> LIZ() {
                return new AwS596S0100000_17(this.LIZ, 340);
            }

            @Override // X.InterfaceC1101940emW
            public final void LIZIZ() {
                try {
                    this.LIZ.LIZJ.cancelAnimation();
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }

            @Override // X.InterfaceC1101940emW
            public final void LIZJ() {
                try {
                    this.LIZ.LIZJ.playAnimation();
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }

            @Override // X.InterfaceC1101940emW
            public final boolean isRunning() {
                try {
                    Boolean boolValueOf = Boolean.valueOf(this.LIZ.LIZJ.isAnimating());
                    if (boolValueOf != null) {
                        return boolValueOf.booleanValue();
                    }
                    return false;
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return false;
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0etg] */
    public C1106390eth(String str, ShortTouchPreviewSetting shortTouchPreviewSetting, Context context) {
        EnumC448301on enumC448301on;
        int i;
        Object obj;
        if (Intrinsics.LJFF(str, "shortTouchEcommerceLuckyBag")) {
            enumC448301on = EnumC448301on.LOTTIE;
        } else {
            enumC448301on = EnumC448301on.DEFAULT;
        }
        EnumC448301on enumC448301on2 = EnumC448301on.LOTTIE;
        if (enumC448301on == enumC448301on2) {
            i = 100;
        } else {
            i = 70;
        }
        int i2 = enumC448301on == enumC448301on2 ? 80 : 70;
        if (enumC448301on == enumC448301on2) {
            obj = shortTouchPreviewSetting.previewImage;
        } else {
            obj = UriProtector.parse(shortTouchPreviewSetting.previewSchema);
        }
        this.LIZJ = new C1106430etl(context, new C1106410etj(str, i, i2, obj), new InterfaceC1106460eto() { // from class: X.0etg
            public long LIZ = System.currentTimeMillis();

            @Override // X.InterfaceC1106460eto
            public final void LIZ() {
                this.LIZ = System.currentTimeMillis();
            }

            @Override // X.InterfaceC1106460eto
            public final void LIZIZ(boolean z) {
                this.LIZIZ.LIZ = System.currentTimeMillis() - this.LIZ;
                this.LIZIZ.LIZIZ = z;
                InterfaceC1087010eOR interfaceC1087010eORLJIIJ = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJIIJ();
                C1106390eth c1106390eth = this.LIZIZ;
                c1106390eth.getClass();
                C1101820emK c1101820emKTd = interfaceC1087010eORLJIIJ.Td(C1099470eiX.LIZ(c1106390eth));
                if (c1101820emKTd != null) {
                    C1106390eth c1106390eth2 = this.LIZIZ;
                    c1101820emKTd.LIZJ = !c1106390eth2.LIZIZ ? 1 : 0;
                    c1101820emKTd.LIZLLL = c1106390eth2.LIZ;
                }
            }
        });
    }
}
