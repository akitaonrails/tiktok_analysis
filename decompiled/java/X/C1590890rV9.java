package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rV9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590890rV9 extends C09AY implements Function0<C0J97> {
    public C1590890rV9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0J97 invoke() {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LJIIIZ();
    }
}
