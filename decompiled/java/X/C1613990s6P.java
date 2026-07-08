package X;

import com.google.gson.Gson;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0s6P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1613990s6P extends C09AY implements Function0<Gson> {
    public C1613990s6P() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Gson invoke() {
        return ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson();
    }
}
