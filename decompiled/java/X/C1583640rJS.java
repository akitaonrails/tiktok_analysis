package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.notification.view.NotificationTabProtocol;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rJS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583640rJS extends C09AY implements Function0<Class<? extends Fragment>> {
    public final /* synthetic */ NotificationTabProtocol LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1583640rJS(NotificationTabProtocol notificationTabProtocol) {
        super(0);
        this.LL = notificationTabProtocol;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Class<? extends Fragment> invoke() {
        return ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getFragmentClass(this.LL.LLILZLL);
    }
}
