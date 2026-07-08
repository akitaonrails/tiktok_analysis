package X;

import X.C360050E9r;
import android.app.Activity;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editorpro.framework.panel.ui.scene.BaseCanvasPanelRootScene;
import com.ss.ugc.android.editor.components.base.api.IConsoleBarService;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Enz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC375570Enz<I extends C360050E9r, O> implements InterfaceC375870EoT {
    public static final HashMap<String, C375690EoB> LIZLLL = new HashMap<>();
    public final C375690EoB LIZ;
    public O LIZIZ;
    public I LIZJ;

    public abstract I LJFF(C0E48 c0e48);

    public abstract BaseCanvasPanelRootScene<I, O> LJI();

    @Override // X.InterfaceC375870EoT
    public final void LIZIZ() {
        InterfaceC360800ECo consoleBar;
        IConsoleBarService iConsoleBarService = (IConsoleBarService) C792600V7i.LIZ(IConsoleBarService.class);
        if (iConsoleBarService == null || (consoleBar = iConsoleBarService.getConsoleBar()) == null) {
            return;
        }
        C0EB4.LIZIZ(consoleBar, new EnumC373450EkZ[]{EnumC373450EkZ.FULL_SCREEN}, null, Boolean.TRUE, null, null, 18);
    }

    public AbstractC375570Enz() {
        String canonicalName = getClass().getCanonicalName();
        canonicalName = canonicalName == null ? "default" : canonicalName;
        HashMap<String, C375690EoB> map = LIZLLL;
        synchronized (map) {
            try {
                C375690EoB c375690EoB = map.get(canonicalName);
                c375690EoB = c375690EoB == null ? new C375690EoB() : c375690EoB;
                this.LIZ = c375690EoB;
                map.put(canonicalName, c375690EoB);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC375870EoT
    public final Object LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC375870EoT
    public final boolean LIZJ(C19A3 c19a3) {
        InterfaceC360800ECo consoleBar;
        InterfaceC359940E9g interfaceC359940E9gAZ0;
        C375690EoB c375690EoB = this.LIZ;
        if (c375690EoB == null) {
            return false;
        }
        if (C0E47.LIZ() && !c375690EoB.LIZ && !Intrinsics.LJFF(c375690EoB.LIZIZ, String.valueOf(c19a3.requireActivity().hashCode()))) {
            C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c19a3);
            if (c1drgLJIIIZ != null) {
                C0EGY c0egyLIZIZ = C361460EFc.LIZIZ(c1drgLJIIIZ);
                if (c0egyLIZIZ != null && (interfaceC359940E9gAZ0 = c0egyLIZIZ.AZ0()) != null && !interfaceC359940E9gAZ0.LJIILIIL()) {
                    C201955140j.LIZIZ("SingleInstanceIndicator", "function bar is not clickable");
                } else {
                    Activity activityRequireActivity = c19a3.requireActivity();
                    c375690EoB.LIZ = true;
                    c375690EoB.LIZIZ = String.valueOf(activityRequireActivity.hashCode());
                    IConsoleBarService iConsoleBarService = (IConsoleBarService) C792600V7i.LIZ(IConsoleBarService.class);
                    if (iConsoleBarService != null && (consoleBar = iConsoleBarService.getConsoleBar()) != null) {
                        C0EB4.LIZIZ(consoleBar, new EnumC373450EkZ[]{EnumC373450EkZ.FULL_SCREEN}, null, Boolean.FALSE, null, null, 18);
                    }
                    return false;
                }
            } else {
                throw new IllegalStateException("objectContainer is null");
            }
        }
        return true;
    }

    @Override // X.InterfaceC375870EoT
    public final void LIZLLL(Object obj) {
        if ((obj instanceof C360050E9r) && obj != null) {
            this.LIZJ = (I) obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0EoA] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0ELn] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // X.InterfaceC375870EoT
    public String LJ(C19A3 c19a3, C0E48 c0e48, AwS406S0200000_5 awS406S0200000_5) {
        C375740EoG c375740EoG;
        long jCurrentTimeMillis = System.currentTimeMillis();
        I i = this.LIZJ;
        if (i == null) {
            i = (I) LJFF(c0e48);
        }
        C0EU3 c0eu3 = C0EU3.LIZ;
        String str = i.LL;
        c0eu3.getClass();
        C0EU3.LIZIZ(c0e48, str);
        i.LJI();
        i.LLIZ = jCurrentTimeMillis;
        i.LJ();
        BaseCanvasPanelRootScene<I, O> baseCanvasPanelRootSceneLJI = LJI();
        baseCanvasPanelRootSceneLJI.LLJJJJJIL = i;
        i.LIZIZ();
        final AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(this, awS406S0200000_5, 1);
        baseCanvasPanelRootSceneLJI.LLJJJJ = c19a3;
        AbstractC214793194d abstractC214793194dLLLLJI = baseCanvasPanelRootSceneLJI.LLLLJI();
        if ((abstractC214793194dLLLLJI instanceof C375740EoG) && (c375740EoG = (C375740EoG) abstractC214793194dLLLLJI) != null) {
            c375740EoG.LJFF = new AwS549S0100000_5(baseCanvasPanelRootSceneLJI, (BaseCanvasPanelRootScene<C360050E9r, Object>) 1049);
        }
        NavigationScene navigationSceneLIZ = C214869197b.LIZ(c19a3, baseCanvasPanelRootSceneLJI.LLJJJIL);
        baseCanvasPanelRootSceneLJI.LLJJJIL = navigationSceneLIZ;
        final ?? r2 = new InterfaceC363130ELn() { // from class: X.0EoA
            @Override // X.InterfaceC363130ELn
            public final void onResult(Object obj) {
                Function1<Object, Unit> function1 = awS371S0200000_5;
                if (obj == null) {
                    obj = null;
                }
                function1.invoke(obj);
            }
        };
        ?? r22 = r2;
        if (C214928199i.LIZIZ) {
            final Scene sceneLLLLIIIILLL = navigationSceneLIZ.LLLLIIIILLL();
            if (sceneLLLLIIIILLL != null) {
                r22 = new AbstractC565380MFk(sceneLLLLIIIILLL) { // from class: X.0Eo5
                    @Override // X.InterfaceC363130ELn
                    public final void onResult(Object obj) {
                        r2.onResult(obj);
                    }
                };
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C569760MWg c569760MWg = new C569760MWg();
        c569760MWg.LIZ = true;
        c569760MWg.LIZJ = baseCanvasPanelRootSceneLJI.LLLLJI();
        c569760MWg.LIZIZ = r22;
        navigationSceneLIZ.LLLLLLLLLL(baseCanvasPanelRootSceneLJI, c569760MWg.LIZ());
        return baseCanvasPanelRootSceneLJI.getClass().getSimpleName();
    }
}
