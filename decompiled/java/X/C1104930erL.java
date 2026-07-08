package X;

import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService;
import com.bytedance.android.livesdkapi.host.IHostResource;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.0erL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104930erL {
    public final FrameLayout LIZ;
    public final LifecycleOwner LIZIZ;
    public final ILiveGiftDelegatePlayerService LIZJ = (ILiveGiftDelegatePlayerService) C1161920gLG.LIZJ(ILiveGiftDelegatePlayerService.class);
    public Object LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final void LIZIZ() {
        this.LJ = false;
        this.LJFF = false;
        Object obj = this.LIZLLL;
        if (obj != null) {
            this.LIZJ.tryCancel(obj);
        }
        this.LIZLLL = null;
        C786410Ut5.LJJJJIZL(this.LIZ);
    }

    public static final void LIZJ() {
        IHostResource iHostResource;
        IHostResource iHostResource2 = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        if ((iHostResource2 == null || !iHostResource2.u61("tiktok_live_revenue_enigma_subscription")) && (iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class)) != null) {
            iHostResource.NP0("tiktok_live_revenue_enigma_subscription");
        }
    }

    public C1104930erL(FrameLayout frameLayout, LifecycleOwner lifecycleOwner) {
        this.LIZ = frameLayout;
        this.LIZIZ = lifecycleOwner;
    }

    public static void LIZ(final C1104930erL c1104930erL, String str, AFwS221S0000000_31 aFwS221S0000000_31, final Function0 function0, int i) {
        boolean z;
        final Function0 function02 = aFwS221S0000000_31;
        if ((i & 4) != 0) {
            function02 = AFwS205S0000000_17.get$arr$(165);
        }
        if ((i & 8) != 0) {
            function0 = AFwS205S0000000_17.get$arr$(166);
        }
        c1104930erL.LJ = false;
        c1104930erL.LJFF = false;
        String strLJIIL = C1143780fs0.LJIIL("tiktok_live_revenue_enigma_subscription", str);
        File fileLJII = C1143780fs0.LJII("tiktok_live_revenue_enigma_subscription", str);
        if (fileLJII != null && fileLJII.exists()) {
            z = true;
        } else {
            z = false;
        }
        C500260Jjc.LLFFF(c1104930erL.LIZ);
        if (z && strLJIIL.length() > 0) {
            Object obj = c1104930erL.LIZLLL;
            if (obj == null) {
                c1104930erL.LIZLLL = c1104930erL.LIZJ.createLiveGiftPlayController(c1104930erL.LIZ.getContext(), c1104930erL.LIZIZ, c1104930erL.LIZJ.buildDelegateGiftPlayListener(new InterfaceC2280931EPr() { // from class: X.0erM
                    @Override // X.InterfaceC2280931EPr
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC2280931EPr
                    public final void LJII() {
                        function02.invoke();
                    }

                    @Override // X.InterfaceC2280931EPr
                    public final void onEnd() {
                        C1104930erL c1104930erL2 = this.LIZ;
                        c1104930erL2.LJ = false;
                        c1104930erL2.LJFF = true;
                        function0.invoke();
                    }

                    @Override // X.InterfaceC2280931EPr
                    public final void onStart() {
                        C1104930erL c1104930erL2 = this.LIZ;
                        c1104930erL2.LJ = true;
                        c1104930erL2.LJFF = false;
                    }

                    @Override // X.InterfaceC2280931EPr
                    public final void onStop() {
                        C1104930erL c1104930erL2 = this.LIZ;
                        c1104930erL2.LJ = false;
                        c1104930erL2.LJFF = false;
                    }

                    @Override // X.InterfaceC2280931EPr
                    public final void LIZ(int i2, String str2, boolean z2) {
                        C1104930erL c1104930erL2 = this.LIZ;
                        boolean z3 = false;
                        c1104930erL2.LJ = false;
                        if (!z2) {
                            z3 = true;
                        }
                        c1104930erL2.LJFF = z3;
                        function0.invoke();
                    }
                }), c1104930erL.LIZ);
            } else {
                c1104930erL.LIZJ.stop(obj);
            }
            c1104930erL.LIZJ.setKeepLastFrame(c1104930erL.LIZLLL, true);
            c1104930erL.LIZJ.setLoopParam(c1104930erL.LIZLLL, false);
            if (c1104930erL.LIZJ.start(c1104930erL.LIZLLL, strLJIIL, 0L) != null) {
                c1104930erL.LJ = false;
                c1104930erL.LJFF = false;
                function02.invoke();
                return;
            }
            return;
        }
        c1104930erL.LJ = false;
        c1104930erL.LJFF = false;
        function02.invoke();
    }
}
