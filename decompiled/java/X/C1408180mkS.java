package X;

import Y.ARunnableS122S0100000_22;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import ge.i;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0mkS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408180mkS extends i<InterfaceC1648800t0Y, C1419630n2v, C0267007d, C003G> implements InterfaceC1648800t0Y, InterfaceC379610EuV {
    public static final C1408190mkT LLJJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public boolean LLJJ;
    public List<? extends User> LLJJI;
    public long LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final Function0<C0267007d> LLJJIJIL;
    public final Function0<C003G> LLJJJ;
    public Function1<? super Boolean, Unit> LLJJJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0mkT] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1408180mkS.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJ = new Object() { // from class: X.0mkT
        };
        LLJJJJLIIL = 8;
    }

    public InterfaceC1648800t0Y H4() {
        return this;
    }

    @Override // X.InterfaceC1648800t0Y
    public void q90() {
        this.LLJJIJIIJIL = false;
        O4();
    }

    @Override // X.InterfaceC1648800t0Y
    public void se0() {
        this.LLJJIJIIJIL = true;
        if (this.LLJJI != null) {
            P4();
        }
    }

    private final void F4() {
        if (this.LLJJ) {
            return;
        }
        this.LLJJ = true;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1407730mjj(this, null), 3);
    }

    private final void O4() {
        if (this.LLJJIJI) {
            this.LLJJIJI = false;
            this.LLJJJIL.invoke(Boolean.FALSE);
            View viewK4 = K4();
            if (viewK4 == null) {
                hide();
            } else {
                viewK4.animate().alpha(0.0f).setDuration(250L).withEndAction(new ARunnableS122S0100000_22(this, 48)).start();
            }
        }
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLJILLL.getValue(this, LLJJJJJIL[0]);
    }

    public final void P4() {
        if (this.LLJJIJI) {
            return;
        }
        this.LLJJIJI = true;
        show();
        this.LLJJJIL.invoke(Boolean.TRUE);
        View viewK4 = K4();
        if (viewK4 != null) {
            C786410Ut5.T4(viewK4, 0.0f);
            viewK4.animate().alpha(1.0f).setDuration(250L).start();
        }
    }

    private final View K4() {
        try {
            return E3().invoke().requireView();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        hide();
        F4();
        this.LLJJIJIIJIL = getShortVideoContext().shootMode == 30;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        H4();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0267007d> o2() {
        return this.LLJJIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C003G> w2() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC1648800t0Y
    public void ik1(Function1<? super Boolean, Unit> function1) {
        this.LLJJJIL = function1;
    }

    public C1408180mkS(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
        this.LLJJIJIL = AFwS210S0000000_22.get$arr$(178);
        this.LLJJJ = AFwS210S0000000_22.get$arr$(179);
        this.LLJJJIL = AFwS261S0000000_22.get$arr$(138);
    }
}
