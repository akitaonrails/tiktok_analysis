package X;

import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.IHomePageService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0sEL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1618910sEL extends C09AY implements Function0<InterfaceC1570600qyQ> {
    public final /* synthetic */ C1618830sED LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1618910sEL(C1618830sED c1618830sED) {
        super(0);
        this.LL = c1618830sED;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1570600qyQ invoke() {
        C19EG activity;
        AbsFragment absFragment = this.LL.LL;
        if (absFragment == null || (activity = absFragment.getActivity()) == null) {
            return null;
        }
        return ((IHomePageService) ServiceManager.get().getService(IHomePageService.class)).LJIILL(activity);
    }
}
