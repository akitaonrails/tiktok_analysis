package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10jm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19329610jm extends C09AY implements Function0<InterfaceC19330910jz> {
    public C19329610jm() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.10jz, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC19330910jz invoke() {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        C19329510jl.LIZ.getClass();
        return iRetrofitFactory.LIZ(C19329510jl.LIZIZ).create(InterfaceC19330910jz.class);
    }
}
