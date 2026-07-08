package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.services.ICreativeSAAService;
import ge.i;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.193a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214764193a extends i<InterfaceC214730191s, C12DT, C214768193e, Unit> implements InterfaceC214730191s, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public static final int LLJJLIIIJLLLLLLLZ;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC214730191s LLJJ;
    public final String LLJJI;
    public final Function0<C214768193e> LLJJIII;
    public final Function0<Unit> LLJJIJI;
    public final Function0<C12DT> LLJJIJIIJIL;
    public C12DT LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public final C214766193c LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214764193a.class, "optionsManagerApiComponent", "getOptionsManagerApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/option/manager/PublishOptionsManagerApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJLIIIJLLLLLLLZ = 8;
    }

    private final C193M P4() {
        return (C193M) this.LLJJJJLIIL.getValue(this, LLJJL[0]);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        if (!this.LLJJJ) {
            this.LLJJJ = true;
            this.LLJJJIL = false;
            this.LLJILJILJ.registerChildSceneLifecycleCallbacks(this.LLJJJJJIL, false);
        }
        super.show();
    }

    public final void K4() {
        Iterator<T> it2 = P4().yg2(C193H.LIZ).LIZJ().iterator();
        while (it2.hasNext()) {
            F4((C193Z) it2.next(), false, -1);
        }
        this.LLJJJJ = true;
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        P4().F02(C193H.LIZ, new AwS611S0100000_32(this, 96));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        if (this.LLJJJIL) {
            return;
        }
        this.LLJILJILJ.unregisterChildSceneLifecycleCallbacks(this.LLJJJJJIL);
    }

    @Override // ge.i
    public Function0<C12DT> E3() {
        return this.LLJJIJIIJIL;
    }

    public InterfaceC214730191s O4() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJJ;
    }

    @Override // X.AbstractC2255721DQs
    public String getComponentName() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C214768193e> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<Unit> w2() {
        return this.LLJJIJI;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.193c] */
    public C214764193a(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = this;
        this.LLJJI = "PublishMainOptionsComponent";
        this.LLJJIII = AFwS223S0000000_32.get$arr$(89);
        this.LLJJIJI = AFwS223S0000000_32.get$arr$(90);
        this.LLJJIJIIJIL = new AwS576S0100000_32(this, 277);
        this.LLJJJIL = true;
        this.LLJJJJJIL = new C0Y8U() { // from class: X.193c
            @Override // X.C0Y8U, X.C19AH
            public final void LJJIIZI(Scene scene) {
                if (Intrinsics.LJFF(scene, this.LIZ.LLJJIJIL)) {
                    C214764193a c214764193a = this.LIZ;
                    c214764193a.LLJJJIL = true;
                    c214764193a.LLJILJILJ.unregisterChildSceneLifecycleCallbacks(this);
                    this.LIZ.K4();
                }
            }
        };
        this.LLJJJJLIIL = C1664770tQJ.LIZ(getDiContainer(), C193M.class, null);
    }

    private final void T4(boolean z, Function0<Unit> function0) {
        if (z) {
            ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(this.LLJILJILJ.requireActivity(), new AwS576S0100000_32(function0, 276));
        } else {
            function0.invoke();
        }
    }

    public final void F4(C193Z c193z, boolean z, int i) {
        ViewGroup viewGroup;
        String strValueOf;
        C12DT c12dt = this.LLJJIJIL;
        if (c12dt != null && (viewGroup = c12dt.LLJJJIL) != null) {
            AbstractC1738640vLS abstractC1738640vLSTJ2 = P4().TJ2(c193z.LIZJ, c193z.LIZLLL, c193z.LJ, viewGroup);
            P4().q61(this, c193z.LIZ, abstractC1738640vLSTJ2, c193z.LJFF, c193z.LJI);
            if (c193z.LIZ instanceof C07UQ) {
                ((ICreativeSAAService) ServiceManager.get().getService(ICreativeSAAService.class)).invokeMethodsSafely(this.LLJILJILJ.requireActivity(), new C214765193b(c193z, this, abstractC1738640vLSTJ2, viewGroup, z, i));
            } else {
                int i2 = c193z.LIZIZ;
                if (i2 > 0) {
                    View viewFindViewById = this.LLJILJILJ.findViewById(i2);
                    if (viewFindViewById != null) {
                        Z4(abstractC1738640vLSTJ2.itemView, viewFindViewById, viewGroup);
                    } else {
                        try {
                            strValueOf = C1664590tQ1.LJIIIZ(this).getResources().getResourceName(c193z.LIZIZ);
                        } catch (Resources.NotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            strValueOf = String.valueOf(c193z.LIZIZ);
                        }
                        throw new IllegalArgumentException("targetSlotView(id=" + strValueOf + ") not found in cellContainer(" + viewGroup);
                    }
                } else if (z && i >= 0) {
                    viewGroup.addView(abstractC1738640vLSTJ2.itemView, i);
                } else {
                    viewGroup.addView(abstractC1738640vLSTJ2.itemView);
                }
            }
            P4().JF1(abstractC1738640vLSTJ2);
            C201955140j.LJIILJJIL(C193V.LIZIZ, "publish option " + c193z.LIZ.getKey() + " has been add to main container");
            return;
        }
        ((IToolsDebugGpService) ServiceManager.get().getService(IToolsDebugGpService.class)).isOpen();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishMainOptionsComponent scene=");
        sbLIZ.append(this.LLJJIJIL);
        sbLIZ.append(" cellContainer is null");
        C193S.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void Z4(View view, View view2, ViewGroup viewGroup) {
        int iIndexOfChild = viewGroup.indexOfChild(view2);
        C786410Ut5.LJJLJLI(view2, viewGroup);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, iIndexOfChild);
        }
    }
}
