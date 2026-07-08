package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.INetwork;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1702930uPr extends C09AY implements Function0<INetwork> {
    public C1702930uPr() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.network.INetwork, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final INetwork invoke() {
        return ServiceManager.get().getService(INetwork.class);
    }
}
