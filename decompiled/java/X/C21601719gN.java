package X;

import Y.ARunnableS131S0100000_31;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.19gN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21601719gN {
    public static final int LJIJ = ((Number) C259990AGv.LIZ.getValue()).intValue();
    public final InterfaceC21604919gt LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public final BPEAHandler LJIIIIZZ;
    public EnumC21602519gV LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public C21605019gu LJIILIIL;
    public final String LJIILJJIL;
    public final ArrayList<View> LJIILL;
    public final IOptimizerHelperService LJIILLIIL;
    public C21602719gX LJIIZILJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.19gu] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.19gX] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ() {
        IOptimizerHelperService iOptimizerHelperService;
        if (((Boolean) C21606019h4.LIZIZ.getValue()).booleanValue() || ((Boolean) C21606019h4.LIZJ.getValue()).booleanValue()) {
            this.LJIILIIL = new Object() { // from class: X.19gu
            };
        }
        if (((Boolean) C21606019h4.LJ.getValue()).booleanValue() && "DmtViewPager".equals(this.LJIILJJIL) && (iOptimizerHelperService = this.LJIILLIIL) != null) {
            if (!this.LJII && iOptimizerHelperService.getCurrentFragment().contains("I18nMyProfileFragment")) {
                LJ();
                this.LJII = true;
            } else {
                ?? r1 = new InterfaceC2184631Aej() { // from class: X.19gX
                    @Override // X.InterfaceC2184631Aej
                    public final void onFragmentChange(String str, String str2, boolean z) {
                        C21601719gN c21601719gN = this.LIZ;
                        if (!c21601719gN.LJII && !TextUtils.isEmpty(str2) && str2.contains("I18nMyProfileFragment")) {
                            c21601719gN.LJ();
                            c21601719gN.LJII = true;
                        }
                    }
                };
                this.LJIIZILJ = r1;
                this.LJIILLIIL.LJIILJJIL(r1);
            }
        }
    }

    public final boolean LIZIZ() {
        if (!this.LJII && this.LJI && this.LIZIZ && this.LJ) {
            return this.LIZLLL ? this.LJFF : this.LJIILIIL == null || C0CN5.LJII();
        }
        return false;
    }

    public final void LJ() {
        for (View view : this.LJIILL) {
            if (LIZIZ()) {
                C788440UwM.LIZIZ(view);
            }
        }
        this.LJIILL.clear();
    }

    public final void LIZJ() {
        if (LIZIZ()) {
            if (!this.LIZJ || Build.VERSION.SDK_INT < 24) {
                C786410Ut5.LJLIIL(300L, this.LJIIIIZZ, new ARunnableS131S0100000_31(this, 80));
            }
        }
    }

    public final void LJI() {
        if (LIZIZ()) {
            if (this.LJIIIZ == EnumC21602519gV.WAIT_OPT) {
                this.LJIIIZ = EnumC21602519gV.OPT_ING;
                int childCount = this.LIZ.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View viewLIZ = this.LIZ.LIZ(i);
                    if (viewLIZ != null) {
                        if (this.LIZ.LIZIZ(viewLIZ)) {
                            if (LIZIZ()) {
                                C788440UwM.LIZIZ(viewLIZ);
                            }
                        } else if (LIZIZ()) {
                            this.LJIILL.add(viewLIZ);
                            C788440UwM.LIZ(viewLIZ);
                        }
                    }
                }
            }
        }
    }

    public final void LJII() {
        if (LIZIZ()) {
            EnumC21602519gV enumC21602519gV = this.LJIIIZ;
            EnumC21602519gV enumC21602519gV2 = EnumC21602519gV.NOT_OPT;
            if (enumC21602519gV == enumC21602519gV2) {
                return;
            }
            ((Boolean) C21606019h4.LIZJ.getValue()).booleanValue();
            this.LJIIIZ = enumC21602519gV2;
            int childCount = this.LIZ.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewLIZ = this.LIZ.LIZ(i);
                if (viewLIZ != null && LIZIZ()) {
                    C788440UwM.LIZIZ(viewLIZ);
                }
            }
        }
    }

    public C21601719gN(InterfaceC21604919gt interfaceC21604919gt) {
        this.LIZIZ = C303520Bv4.LIZ();
        this.LIZJ = ((Boolean) C303170BuV.LIZIZ.getValue()).booleanValue();
        this.LIZLLL = ((Boolean) C0AFA.LIZ.getValue()).booleanValue();
        this.LJ = false;
        this.LJFF = true;
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = new BPEAHandler(Looper.getMainLooper());
        this.LJIIIZ = EnumC21602519gV.NOT_OPT;
        this.LJIIJ = false;
        this.LJIIJJI = 0;
        this.LJIIL = -1;
        this.LJIILL = new ArrayList<>();
        this.LJIILLIIL = (IOptimizerHelperService) PluggableExtentionKt.pluggableSpi(IOptimizerHelperService.class);
        this.LIZ = interfaceC21604919gt;
        LIZ();
    }

    public final void LIZLLL(boolean z) {
        if (!LIZIZ()) {
            return;
        }
        if (this.LJIIIZ == EnumC21602519gV.NOT_OPT) {
            if (((Boolean) C21606019h4.LIZLLL.getValue()).booleanValue() && !z) {
                this.LJIIIZ = EnumC21602519gV.WAIT_OPT;
                LJI();
            } else {
                this.LJIIIZ = EnumC21602519gV.WAIT_OPT;
            }
        }
    }

    public C21601719gN(InterfaceC21604919gt interfaceC21604919gt, int i) {
        this.LIZIZ = C303520Bv4.LIZ();
        this.LIZJ = ((Boolean) C303170BuV.LIZIZ.getValue()).booleanValue();
        this.LIZLLL = ((Boolean) C0AFA.LIZ.getValue()).booleanValue();
        this.LJ = false;
        this.LJFF = true;
        this.LJI = false;
        this.LJII = false;
        this.LJIIIIZZ = new BPEAHandler(Looper.getMainLooper());
        this.LJIIIZ = EnumC21602519gV.NOT_OPT;
        this.LJIIJ = false;
        this.LJIIJJI = 0;
        this.LJIIL = -1;
        this.LJIILL = new ArrayList<>();
        this.LJIILLIIL = (IOptimizerHelperService) PluggableExtentionKt.pluggableSpi(IOptimizerHelperService.class);
        this.LIZ = interfaceC21604919gt;
        this.LJIILJJIL = "DmtViewPager";
        LIZ();
    }

    public final void LJFF(Window window, boolean z) {
        this.LJ = z;
        if (!z) {
            return;
        }
        if (window == null) {
            this.LJ = false;
        } else if (!this.LJIIJ && this.LIZJ && Build.VERSION.SDK_INT >= 24) {
            this.LJIIJ = true;
            window.addOnFrameMetricsAvailableListener(new Window.OnFrameMetricsAvailableListener() { // from class: X.19ga
                @Override // android.view.Window.OnFrameMetricsAvailableListener
                public final void onFrameMetricsAvailable(Window window2, FrameMetrics frameMetrics, int i) {
                    long metric = frameMetrics.getMetric(3) / 1000000;
                    C21601719gN c21601719gN = this.LIZ;
                    if (c21601719gN.LJIIIZ == EnumC21602519gV.WAIT_OPT) {
                        if (metric <= 5) {
                            c21601719gN.LJIIJJI++;
                        } else {
                            c21601719gN.LJIIJJI = 0;
                        }
                        if (c21601719gN.LJIIJJI >= C21601719gN.LJIJ) {
                            c21601719gN.LJI();
                            this.LIZ.LJIIJJI = 0;
                        }
                    }
                }
            }, this.LJIIIIZZ);
        }
    }
}
