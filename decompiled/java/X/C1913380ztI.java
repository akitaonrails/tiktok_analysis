package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ztI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1913380ztI implements INetworkStandardUIService {
    public static final C1913380ztI LLILLJJLI = new C1913380ztI();
    public final /* synthetic */ INetworkStandardUIService LL = (INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class);

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final InterfaceC908430ZkP getNetworkStateForSharePanel() {
        return this.LL.getNetworkStateForSharePanel();
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final int getStatusViewNeedShowForSearch(EnumC1609900rzo enumC1609900rzo, Exception exc) {
        return this.LL.getStatusViewNeedShowForSearch(enumC1609900rzo, exc);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final boolean isStandardUIEnable() {
        return this.LL.isStandardUIEnable();
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void registerForNetworkChangeToasts() {
        this.LL.registerForNetworkChangeToasts();
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void removeLazyToast(EnumC1609900rzo enumC1609900rzo) {
        this.LL.removeLazyToast(enumC1609900rzo);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void resetTipsBarrier(C1749280vcc c1749280vcc) {
        this.LL.resetTipsBarrier(c1749280vcc);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void setStatusView(C1749280vcc c1749280vcc, EnumC1609900rzo enumC1609900rzo, Function0<Unit> function0, Exception exc) {
        this.LL.setStatusView(c1749280vcc, enumC1609900rzo, function0, exc);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void setStatusView(C1749280vcc c1749280vcc, EnumC1609900rzo enumC1609900rzo, Function0<Unit> function0, Exception exc, C20626215nQ c20626215nQ) {
        this.LL.setStatusView(c1749280vcc, enumC1609900rzo, function0, exc, c20626215nQ);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    @InterfaceC1294060jmO
    public final void setStatusView(C1749280vcc c1749280vcc, String str, Function0<Unit> function0, Exception exc) {
        this.LL.setStatusView(c1749280vcc, str, function0, exc);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void showNetworkToast(Activity activity, InterfaceC908430ZkP interfaceC908430ZkP, String str) {
        this.LL.showNetworkToast(activity, interfaceC908430ZkP, str);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void startLazyToast(EnumC1609900rzo enumC1609900rzo, Activity activity) {
        this.LL.startLazyToast(enumC1609900rzo, activity);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    public final void triggerNetworkTips(Activity activity, EnumC1609900rzo enumC1609900rzo, Exception exc, C1749280vcc c1749280vcc) {
        this.LL.triggerNetworkTips(activity, enumC1609900rzo, exc, c1749280vcc);
    }

    @Override // com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService
    @InterfaceC1294060jmO
    public final void triggerNetworkTips(Activity activity, String str, Exception exc, C1749280vcc c1749280vcc) {
        this.LL.triggerNetworkTips(activity, str, exc, c1749280vcc);
    }
}
