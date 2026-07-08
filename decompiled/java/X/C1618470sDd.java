package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.IStoryService;

/* JADX INFO: renamed from: X.0sDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1618470sDd implements InterfaceC1456340o08<IStoryService> {
    public IStoryService LL;

    @Override // X.InterfaceC1456340o08
    public final IStoryService get() {
        if (this.LL == null) {
            this.LL = (IStoryService) ServiceManager.get().getService(IStoryService.class);
        }
        return this.LL;
    }
}
