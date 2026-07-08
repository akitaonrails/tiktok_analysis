package X;

import X.C360050E9r;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Env, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC375530Env<I extends C360050E9r, O> implements InterfaceC375870EoT {
    public I LIZ;
    public O LIZIZ;

    @Override // X.InterfaceC375870EoT
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC375870EoT
    public final boolean LIZJ(C19A3 c19a3) {
        return false;
    }

    public abstract I LJFF(C0E48 c0e48);

    public abstract AbstractC364960ESo<I, O> LJI();

    @Override // X.InterfaceC375870EoT
    public final Object LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC375870EoT
    public final void LIZLLL(Object obj) {
        if ((obj instanceof C360050E9r) && obj != null) {
            this.LIZ = (I) obj;
        }
    }

    @Override // X.InterfaceC375870EoT
    public final String LJ(C19A3 c19a3, C0E48 c0e48, AwS406S0200000_5 awS406S0200000_5) {
        String canonicalName;
        AbstractC214793194d c214798194i;
        I i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        I i2 = this.LIZ;
        if (i2 == null) {
            i2 = (I) LJFF(c0e48);
        }
        C0EU3 c0eu3 = C0EU3.LIZ;
        String str = i2.LL;
        c0eu3.getClass();
        C0EU3.LIZIZ(c0e48, str);
        i2.LLIZ = jCurrentTimeMillis;
        i2.LJ();
        AbstractC364960ESo<I, O> abstractC364960ESoLJI = LJI();
        abstractC364960ESoLJI.LLJJIJIIJIL = i2;
        i2.LIZIZ();
        final AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(this, awS406S0200000_5, 2);
        abstractC364960ESoLJI.LLJJJ = c19a3;
        NavigationScene navigationSceneLIZ = C214869197b.LIZ(c19a3, abstractC364960ESoLJI.LLJJJIL);
        abstractC364960ESoLJI.LLJJJIL = navigationSceneLIZ;
        if (!Intrinsics.LJFF(navigationSceneLIZ.LLLLIIIILLL(), abstractC364960ESoLJI)) {
            Scene sceneLLLLIIIILLL = navigationSceneLIZ.LLLLIIIILLL();
            InterfaceC363130ELn interfaceC363130ELn = null;
            if (sceneLLLLIIIILLL != null) {
                canonicalName = sceneLLLLIIIILLL.getClass().getCanonicalName();
            } else {
                canonicalName = null;
            }
            if (!Intrinsics.LJFF(canonicalName, abstractC364960ESoLJI.getClass().getCanonicalName())) {
                if (C214928199i.LIZIZ) {
                    final Scene sceneLLLLIIIILLL2 = navigationSceneLIZ.LLLLIIIILLL();
                    if (sceneLLLLIIIILLL2 != null) {
                        interfaceC363130ELn = new AbstractC565380MFk(sceneLLLLIIIILLL2) { // from class: X.0Enw
                            @Override // X.InterfaceC363130ELn
                            public final void onResult(Object obj) {
                                Function1<Object, Unit> function1 = awS371S0200000_5;
                                if (obj == null) {
                                    obj = null;
                                }
                                function1.invoke(obj);
                            }
                        };
                    }
                } else {
                    interfaceC363130ELn = new InterfaceC363130ELn() { // from class: X.0Enx
                        @Override // X.InterfaceC363130ELn
                        public final void onResult(Object obj) {
                            Function1<Object, Unit> function1 = awS371S0200000_5;
                            if (obj == null) {
                                obj = null;
                            }
                            function1.invoke(obj);
                        }
                    };
                }
                C569760MWg c569760MWg = new C569760MWg();
                if (interfaceC363130ELn != null) {
                    c569760MWg.LIZIZ = interfaceC363130ELn;
                }
                c569760MWg.LIZ = true;
                if (abstractC364960ESoLJI.LLLLLIL() && !abstractC364960ESoLJI.LLJJIJI) {
                    c214798194i = abstractC364960ESoLJI.LLLLL();
                } else {
                    c214798194i = new C214798194i();
                }
                c569760MWg.LIZJ = c214798194i;
                navigationSceneLIZ.LLLLLLLLLL(abstractC364960ESoLJI, c569760MWg.LIZ());
                if ((!abstractC364960ESoLJI.LLLLLIL() || (abstractC364960ESoLJI.LLLLL() instanceof C214798194i)) && (i = abstractC364960ESoLJI.LLJJIJIIJIL) != null) {
                    i.LIZ();
                }
                return abstractC364960ESoLJI.getClass().getSimpleName();
            }
        }
        return abstractC364960ESoLJI.getClass().getSimpleName();
    }
}
