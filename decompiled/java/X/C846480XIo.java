package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.hybriddevtool.IHybridDevtoolService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846480XIo extends C09AY implements Function0<Boolean> {
    public C846480XIo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        IHybridDevtoolService iHybridDevtoolService = (IHybridDevtoolService) ServiceManager.get().getService(IHybridDevtoolService.class, false, false);
        if (iHybridDevtoolService != null) {
            iHybridDevtoolService.isOpen();
        }
        return false;
    }
}
