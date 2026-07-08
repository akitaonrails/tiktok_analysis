package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.dm.tools.debug.IDmToolsDebugService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0YtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888400YtC extends AbstractC880120Yfq {
    public final int LLJ;
    public final int LLJI;

    @Override // X.AbstractC880120Yfq
    public final int LJ() {
        return 0;
    }

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        C0Y8T c0y8t = this.LLILZ;
        if (c0y8t == null || c0y8t.getConversationId() == null) {
            return;
        }
        ((IDmToolsDebugService) ServiceManager.get().getService(IDmToolsDebugService.class)).LJIILLIIL();
    }

    @Override // X.AbstractC880120Yfq
    public final boolean LJI() {
        if (!C2213981Bky.LIZIZ.isRegressionTest()) {
            return true;
        }
        ((IDmToolsDebugService) ServiceManager.get().getService(IDmToolsDebugService.class)).LJIILLIIL();
        return true;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJI;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJ;
    }

    public C888400YtC(Activity activity, C879540Yeu c879540Yeu) {
        super(activity, c879540Yeu, null);
        this.LLJ = 2131835691;
        this.LLJI = R.raw.icon_3pt_heart;
    }
}
