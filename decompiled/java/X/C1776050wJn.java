package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.network.ECNetControllerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.IECNetControllerDependencyService;

/* JADX INFO: renamed from: X.0wJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776050wJn implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public static final void run$0(C1776050wJn c1776050wJn) {
        AnonymousClass0317 anonymousClass0317CreateIECNetControllerDependencyServicebyMonsterPlugin;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIECNetControllerDependencyServicebyMonsterPlugin = ECNetControllerDependencyService.createIECNetControllerDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIECNetControllerDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IECNetControllerDependencyService.class.getName();
            if (anonymousClass0317CreateIECNetControllerDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIECNetControllerDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIECNetControllerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECNetControllerDependencyService.class);
        }
        ((IECNetControllerDependencyService) anonymousClass0317CreateIECNetControllerDependencyServicebyMonsterPlugin).exitPDPLaunchScene();
        ((C1758380vrI) c1776050wJn.l0).LIZIZ = null;
    }

    public static final void run$1(C1776050wJn c1776050wJn) {
        ((C1758390vrJ) c1776050wJn.l0).LIZIZ = null;
    }

    public C1776050wJn(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
