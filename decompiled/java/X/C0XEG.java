package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.metric.event.IDeviceInfoEventParamProvider;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XEG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XEG extends C09AY implements Function0<Set<? extends IDeviceInfoEventParamProvider<InterfaceC1282004zy>>> {
    public C0XEG() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Set<? extends IDeviceInfoEventParamProvider<InterfaceC1282004zy>> invoke() {
        return ServiceManager.get().getServices(IDeviceInfoEventParamProvider.class);
    }
}
