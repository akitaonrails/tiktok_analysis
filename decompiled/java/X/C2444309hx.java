package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;

/* JADX INFO: renamed from: X.09hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2444309hx implements InterfaceC884990Ynh, InterfaceC908170Zjz {
    public boolean LL;
    public C09AE LLILLJJLI;

    @Override // X.InterfaceC884990Ynh
    public final void LJ() {
    }

    @Override // X.InterfaceC884990Ynh
    public final void LIZJ() {
        C0I0B.LJFF.LIZ().LIZ(this);
        this.LL = false;
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC884990Ynh
    public final void LIZLLL() {
        if (this.LL) {
            return;
        }
        C09AE c09ae = this.LLILLJJLI;
        if (c09ae == null || !c09ae.isActive()) {
            Context applicationContext = C2213981Bky.LIZIZ.getApplicationContext();
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService == null || !creativeToolsPluginService.LJI(applicationContext)) {
                return;
            }
            AbstractC883730Ylf.LJIIIIZZ.getClass();
            this.LLILLJJLI = C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C2444109hv(applicationContext, this, null));
        }
    }

    public C2444309hx() {
        C0I0B.LJFF.LIZ().LIZLLL(this);
    }

    @Override // X.InterfaceC908170Zjz
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        C1729806q0.LIZ(C881500Yi4.LIZLLL(), new C2444209hw(this, null));
    }
}
