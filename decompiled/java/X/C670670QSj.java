package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.INetwork;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670670QSj extends C09AY implements Function0<INetwork> {
    public C670670QSj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.network.INetwork, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final INetwork invoke() {
        return ServiceManager.get().getService(INetwork.class);
    }
}
