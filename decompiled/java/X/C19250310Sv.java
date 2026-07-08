package X;

import Y.AObserverS230S0100000_28;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.IPluginService;

/* JADX INFO: renamed from: X.10Sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19250310Sv implements InterfaceC19251410Tg {
    public C0VGI LIZ;

    @Override // X.InterfaceC19251410Tg
    public final void run() {
        this.LIZ = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).backgroundThreadObserveFirst(EnumC19241510Pl.PREVIOUS_LOGIN_DATA, new AObserverS230S0100000_28(this, 107));
    }
}
