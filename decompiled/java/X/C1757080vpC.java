package X;

import android.app.Activity;
import android.os.SystemClock;
import androidx.fragment.app.DialogFragment;
import com.ss.android.ugc.aweme.ecommerce.dependency.live.LiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.live.ILiveDependencyService;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: X.0vpC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757080vpC implements InterfaceC1757120vpG {
    public final DialogFragment LIZ;
    public final Map<String, String> LIZIZ;
    public final C1757110vpF LIZJ;
    public final boolean LIZLLL;
    public final ILiveDependencyService LJ;
    public final WeakReference<Activity> LJFF;

    public C1757080vpC() {
        throw null;
    }

    @Override // X.InterfaceC1757120vpG
    public final void LIZIZ() {
        if (this.LIZLLL) {
            show();
        } else {
            ILiveDependencyService iLiveDependencyService = this.LJ;
            iLiveDependencyService.setCurrentPlayerMute(iLiveDependencyService.isInternalWindowMute());
        }
    }

    @Override // X.InterfaceC1757120vpG
    public final boolean isShowing() {
        return this.LJ.getInternalWindowState() == 1;
    }

    @Override // X.InterfaceC1757120vpG
    public final void show() {
        Activity activity = this.LJFF.get();
        if (activity == null) {
            return;
        }
        this.LJ.showInternalWindow(activity, this.LIZ, Boolean.FALSE, this.LIZIZ, Integer.valueOf(this.LIZJ.LIZ), Integer.valueOf(this.LIZJ.LIZIZ), Integer.valueOf(this.LIZJ.LIZJ), Integer.valueOf(this.LIZJ.LIZLLL));
    }

    @Override // X.InterfaceC1757120vpG
    public final void LIZ(boolean z) {
        boolean z2;
        this.LJ.hideInternalWindow();
        ILiveDependencyService iLiveDependencyService = this.LJ;
        if (!z && !iLiveDependencyService.isInternalWindowMute()) {
            z2 = false;
        } else {
            z2 = true;
        }
        iLiveDependencyService.setCurrentPlayerMute(z2);
    }

    @Override // X.InterfaceC1757120vpG
    public final void LIZJ(boolean z) {
        boolean z2;
        ILiveDependencyService iLiveDependencyService = this.LJ;
        if (!z && !iLiveDependencyService.isInternalWindowMute()) {
            z2 = false;
        } else {
            z2 = true;
        }
        iLiveDependencyService.setCurrentPlayerMute(z2);
    }

    @Override // X.InterfaceC1757120vpG
    public final void k(EnumC1757150vpJ enumC1757150vpJ, boolean z) {
        int i = C1757100vpE.LIZ[enumC1757150vpJ.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                this.LJ.resetInternalWindow();
                return;
            }
            return;
        }
        this.LJ.hideInternalWindow();
    }

    public C1757080vpC(C19EG c19eg, DialogFragment dialogFragment, Map map, C1757110vpF c1757110vpF, boolean z) {
        AnonymousClass0317 anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = LiveDependencyService.createILiveDependencyServicebyMonsterPlugin(false);
            boolean z2 = anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null;
            String name2 = ILiveDependencyService.class.getName();
            if (anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILiveDependencyService.class);
        }
        this.LIZ = dialogFragment;
        this.LIZIZ = map;
        this.LIZJ = c1757110vpF;
        this.LIZLLL = z;
        this.LJ = (ILiveDependencyService) anonymousClass0317CreateILiveDependencyServicebyMonsterPlugin;
        this.LJFF = new WeakReference<>(c19eg);
    }
}
