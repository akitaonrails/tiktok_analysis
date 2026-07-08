package X;

import Y.ARunnableS97S0200000_28;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.unifiedauth.manager.PushSystemPopupManager;
import com.ss.android.ugc.aweme.unifiedauth.push.UniAuthGuidePopupServiceImpl;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;

/* JADX INFO: renamed from: X.10DC, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10DC implements InterfaceC809680VpW {
    public final /* synthetic */ Runnable LIZ;
    public final /* synthetic */ Handler LIZIZ;
    public final /* synthetic */ C10D2 LIZJ;
    public final /* synthetic */ UniAuthGuidePopupServiceImpl LIZLLL;
    public final /* synthetic */ Context LJ;
    public final /* synthetic */ UnifiedAuthPopupConfig LJFF;
    public final /* synthetic */ C10DS LJI;
    public final /* synthetic */ C013C LJII;
    public final /* synthetic */ C1917270zzZ LJIIIIZZ;

    @Override // X.InterfaceC809680VpW
    public final void LIZ() {
        if (!this.LJII.element) {
            UniAuthGuidePopupServiceImpl uniAuthGuidePopupServiceImpl = this.LIZLLL;
            C1917270zzZ c1917270zzZ = this.LJIIIIZZ;
            uniAuthGuidePopupServiceImpl.getClass();
            UniAuthGuidePopupServiceImpl.LJII(c1917270zzZ);
            this.LJII.element = true;
        }
        Runnable runnable = this.LIZ;
        if (runnable != null) {
            this.LIZIZ.removeCallbacks(runnable);
        }
        C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS97S0200000_28(this.LIZJ, this.LJI, 1));
    }

    @Override // X.InterfaceC809680VpW
    public final void LIZIZ() {
        if (!this.LJII.element) {
            UniAuthGuidePopupServiceImpl uniAuthGuidePopupServiceImpl = this.LIZLLL;
            C1917270zzZ c1917270zzZ = this.LJIIIIZZ;
            uniAuthGuidePopupServiceImpl.getClass();
            UniAuthGuidePopupServiceImpl.LJII(c1917270zzZ);
            this.LJII.element = true;
        }
        Runnable runnable = this.LIZ;
        if (runnable != null) {
            this.LIZIZ.removeCallbacks(runnable);
        }
        C786410Ut5.LJJZZIII(this.LIZIZ, new ARunnableS97S0200000_28(this.LIZJ, this.LJI, 2));
    }

    @Override // X.InterfaceC809680VpW
    public final void LIZJ(String str, final boolean z) {
        Runnable runnable;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tryShowOppoPushPopup onRequestResult(started=");
        sbLIZ.append(z);
        sbLIZ.append(", msg=");
        sbLIZ.append(str);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[OPPO]");
        if (!z && (runnable = this.LIZ) != null) {
            this.LIZIZ.removeCallbacks(runnable);
        }
        Handler handler = this.LIZIZ;
        final C10D2 c10d2 = this.LIZJ;
        final UniAuthGuidePopupServiceImpl uniAuthGuidePopupServiceImpl = this.LIZLLL;
        final Context context = this.LJ;
        final UnifiedAuthPopupConfig unifiedAuthPopupConfig = this.LJFF;
        final C10DS c10ds = this.LJI;
        final C013C c013c = this.LJII;
        final C1917270zzZ c1917270zzZ = this.LJIIIIZZ;
        C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.10DD
            public final void LIZ() {
                if (!z) {
                    C10D2 c10d22 = c10d2;
                    if (c10d22 != null) {
                        c10d22.LIZ();
                    }
                    uniAuthGuidePopupServiceImpl.LJFF(context, c10ds, unifiedAuthPopupConfig);
                    return;
                }
                if (!c013c.element) {
                    UniAuthGuidePopupServiceImpl uniAuthGuidePopupServiceImpl2 = uniAuthGuidePopupServiceImpl;
                    C1917270zzZ c1917270zzZ2 = c1917270zzZ;
                    uniAuthGuidePopupServiceImpl2.getClass();
                    UniAuthGuidePopupServiceImpl.LJII(c1917270zzZ2);
                    c013c.element = true;
                }
                C211000rc.LIZ("[OPPO]");
                C10DS c10ds2 = c10ds;
                if (c10ds2 != null) {
                    c10ds2.onShow(0);
                }
                new PushSystemPopupManager().LJIIZILJ(false, false, false);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("UniAuthGuidePopupServiceImpl@a7f1.tryShowCustomizedInstance$1$3$notShownBack$2$onRequestResult$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("UniAuthGuidePopupServiceImpl@a7f1.tryShowCustomizedInstance$1$3$notShownBack$2$onRequestResult$2");
            }
        });
    }

    public C10DC(ARunnableS97S0200000_28 aRunnableS97S0200000_28, Handler handler, C10D2 c10d2, UniAuthGuidePopupServiceImpl uniAuthGuidePopupServiceImpl, Context context, UnifiedAuthPopupConfig unifiedAuthPopupConfig, C10DS c10ds, C013C c013c, C1917270zzZ c1917270zzZ) {
        this.LIZ = aRunnableS97S0200000_28;
        this.LIZIZ = handler;
        this.LIZJ = c10d2;
        this.LIZLLL = uniAuthGuidePopupServiceImpl;
        this.LJ = context;
        this.LJFF = unifiedAuthPopupConfig;
        this.LJI = c10ds;
        this.LJII = c013c;
        this.LJIIIIZZ = c1917270zzZ;
    }
}
