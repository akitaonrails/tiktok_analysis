package X;

import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;

/* JADX INFO: renamed from: X.15IU, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15IU {
    public static final C15IU LIZIZ;
    public final SharedPreferences LIZ;

    static {
        C15IV.LIZ.getClass();
        LIZIZ = C15IV.LIZIZ;
    }

    public C15IU() {
        ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getApplicationService().getClass();
        this.LIZ = C810670Vr7.LIZJ(C1BWL.LIZ(), 0, "collect_music");
    }
}
