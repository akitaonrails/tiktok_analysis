package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0u13, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687550u13 extends AbstractC2255721DQs<InterfaceC1454650nxP> implements InterfaceC1454650nxP, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public static final int LLILZIL;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), Context.class, null);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 401));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1687550u13.class, "context", "getContext()Landroid/content/Context;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = 8;
    }

    public InterfaceC1454650nxP W1() {
        return this;
    }

    private final SoftKeyBoardListener X1() {
        return (SoftKeyBoardListener) this.LLILLL.getValue();
    }

    public final Context getContext() {
        return (Context) this.LLILLJJLI.getValue(this, LLILZ[0]);
    }

    public final void Z1() {
        Activity activityLIZ;
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null || !(activityLIZ instanceof C19EG)) {
            return;
        }
        C19EG c19eg = (C19EG) activityLIZ;
        ImmersionBar immersionBarLJIILJJIL = ImmersionBar.LJIILJJIL(c19eg);
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, immersionBarLJIILJJIL);
        immersionBarLJIILJJIL.LJIIL();
        immersionBarLJIILJJIL.LJIIJ(false);
        C1192870h9B.LIZ.getClass();
        tuxImmersionBar.LJ(C1192870h9B.LJII.LJI);
        tuxImmersionBar.LIZJ(false, true);
        tuxImmersionBar.LIZLLL();
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        SoftKeyBoardListener softKeyBoardListenerX1 = X1();
        if (softKeyBoardListenerX1 != null) {
            softKeyBoardListenerX1.LIZIZ(new InterfaceC1391500mJY() { // from class: X.0u14
                @Override // X.InterfaceC1391500mJY
                public final void LLLL(int i) {
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJJIIJ(int i) {
                    this.LL.Z1();
                }

                @Override // X.InterfaceC1391500mJY
                public final void LJZI(int i) {
                    this.LL.Z1();
                }
            });
        }
        Z1();
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        SoftKeyBoardListener softKeyBoardListenerX1 = X1();
        if (softKeyBoardListenerX1 != null) {
            softKeyBoardListenerX1.LIZ();
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1687550u13(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
