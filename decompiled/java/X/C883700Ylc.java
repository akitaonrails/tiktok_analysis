package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.offline.dm.tools.debug.IDmToolsDebugService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ylc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883700Ylc extends AbstractC880120Yfq {
    public final int LLJ;
    public final int LLJI;

    @Override // X.AbstractC880120Yfq
    public final int LJ() {
        return 0;
    }

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        IDmToolsDebugService iDmToolsDebugService;
        C0Y8T c0y8t = this.LLILZ;
        if (c0y8t == null || c0y8t.getConversationId() == null || (iDmToolsDebugService = (IDmToolsDebugService) PluggableExtentionKt.pluggableSpi$default(IDmToolsDebugService.class, false, false, false, 14, null)) == null) {
            return;
        }
        iDmToolsDebugService.LJJIII();
    }

    @Override // X.AbstractC880120Yfq
    public final boolean LJI() {
        IMAIServiceAPI.LIZ.getClass();
        InterfaceC1693306k7 interfaceC1693306k7LIZ = AnonymousClass0629.LIZ().LIZ();
        C0Y8T c0y8t = this.LLILZ;
        if (c0y8t == null) {
            return true;
        }
        if (interfaceC1693306k7LIZ.LJIIIZ(c0y8t) || AnonymousClass0629.LIZ().LIZ().LJIL(this.LLILZ.getConversationId())) {
            return !C2213981Bky.LIZIZ.isRegressionTest();
        }
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

    public C883700Ylc(Activity activity, C879540Yeu c879540Yeu) {
        super(activity, c879540Yeu, null);
        this.LLJ = 2131835686;
        this.LLJI = R.raw.icon_3pt_heart;
    }
}
