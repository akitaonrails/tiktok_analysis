package X;

import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveTTDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveTTDependencyService;

/* JADX INFO: renamed from: X.04Zx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1120704Zx {
    public static final C1120704Zx LIZ = new C1120704Zx();
    public static C1ACD LIZIZ;
    public static InterfaceC2175541ACi LIZJ;

    public static C1ACD LIZ() {
        AnonymousClass0317 anonymousClass0317CreateILiveTTDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveTTDependencyServicebyMonsterPlugin = LiveTTDependencyService.createILiveTTDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, ILiveTTDependencyService.class.getName(), anonymousClass0317CreateILiveTTDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILiveTTDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILiveTTDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveTTDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveTTDependencyService.class);
        }
        C1ACD c1acdGenerateLivePlayHelper = ((ILiveTTDependencyService) anonymousClass0317CreateILiveTTDependencyServicebyMonsterPlugin).generateLivePlayHelper(new InterfaceC2175541ACi() { // from class: X.1ACs
            @Override // X.InterfaceC2175541ACi
            public final Integer Dk() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean LLILLIZIL() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Md() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean U1() {
                return true;
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Y7() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final void o() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void oc(C945320ahu c945320ahu) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void T5() {
                InterfaceC2175541ACi interfaceC2175541ACi = C1120704Zx.LIZJ;
                if (interfaceC2175541ACi != null) {
                    interfaceC2175541ACi.T5();
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void v() {
                InterfaceC2175541ACi interfaceC2175541ACi = C1120704Zx.LIZJ;
                if (interfaceC2175541ACi != null) {
                    interfaceC2175541ACi.v();
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean We() {
                return !C1AEJ.LIZ();
            }

            @Override // X.InterfaceC2175541ACi
            /* JADX INFO: renamed from: if */
            public final void mo29if(String str) {
                InterfaceC2175541ACi interfaceC2175541ACi = C1120704Zx.LIZJ;
                if (interfaceC2175541ACi != null) {
                    interfaceC2175541ACi.mo29if(str);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void oe(String str) {
                InterfaceC2175541ACi interfaceC2175541ACi = C1120704Zx.LIZJ;
                if (interfaceC2175541ACi != null) {
                    interfaceC2175541ACi.oe(str);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void sk(String str) {
                InterfaceC2175541ACi interfaceC2175541ACi = C1120704Zx.LIZJ;
                if (interfaceC2175541ACi != null) {
                    interfaceC2175541ACi.sk(str);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void w9(String str) {
                InterfaceC2175541ACi interfaceC2175541ACi = C1120704Zx.LIZJ;
                if (interfaceC2175541ACi != null) {
                    interfaceC2175541ACi.w9(str);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
                InterfaceC2175541ACi interfaceC2175541ACi = C1120704Zx.LIZJ;
                if (interfaceC2175541ACi != null) {
                    interfaceC2175541ACi.LLLLJ(enumC1913550ztZ, obj);
                }
            }

            @Override // X.InterfaceC2175541ACi
            public final void Th(int i, int i2, View view) {
                InterfaceC2175541ACi interfaceC2175541ACi = C1120704Zx.LIZJ;
                if (interfaceC2175541ACi != null) {
                    interfaceC2175541ACi.Th(i, i2, view);
                }
            }
        }, EnumC1913520ztW.NORMAL);
        LIZIZ = c1acdGenerateLivePlayHelper;
        return c1acdGenerateLivePlayHelper;
    }
}
