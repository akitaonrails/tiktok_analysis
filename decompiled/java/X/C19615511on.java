package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.IFoundationAVServiceProxy;

/* JADX INFO: renamed from: X.11on, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19615511on {
    public static final Gson LIZ = ((IFoundationAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getNetworkService().getRetrofitFactoryGson();
}
