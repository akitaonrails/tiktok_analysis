package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.pumbaa.PumbaaTask;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WwI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839360WwI extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ PumbaaTask LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C839360WwI(PumbaaTask pumbaaTask) {
        super(0);
        this.LL = pumbaaTask;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.LL.getClass();
        return Boolean.valueOf(((IComplianceService) ServiceManager.get().getService(IComplianceService.class)).LJIILL() == 1);
    }
}
