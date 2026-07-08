package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hometab.base.spi.ITabProcessManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rMJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585410rMJ extends C09AY implements Function0<C1585250rM3> {
    public C1585410rMJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1585250rM3 invoke() {
        return ((ITabProcessManager) ServiceManager.get().getService(ITabProcessManager.class)).LIZ();
    }
}
