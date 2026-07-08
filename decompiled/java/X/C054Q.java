package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.054Q, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054Q extends C09AY implements Function0<InterfaceC1411705fn> {
    public C054Q() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1411705fn invoke() {
        return ((IFrequencyControlService) ServiceManager.get().getService(IFrequencyControlService.class)).LIZIZ(new C053W(EnumC12931054f.BIRTHDAY.getKey(), new C12918053s(null, EnumC12928054c.DID, EnumC1502105uN.LIGHT_INTERACTION, EnumC12929054d.COLD_START, 1), new C12912053m(1), new C12914053o(1L, EnumC12927054b.SECOND)));
    }
}
