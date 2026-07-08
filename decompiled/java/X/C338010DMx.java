package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolClickAPI;

/* JADX INFO: renamed from: X.0DMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338010DMx {
    public static final /* synthetic */ C338010DMx LIZ = new C338010DMx();
    public static final SchoolClickAPI LIZIZ;

    static {
        C1499850p8J c1499850p8JCreateBuilder;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        LIZIZ = (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C0CQT.LIZJ)) == null) ? null : (SchoolClickAPI) c1499850p8JCreateBuilder.build().retrofit.LIZ(SchoolClickAPI.class);
    }
}
