package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.profile.business.effect.topdesigner.ITopDesignerBoardNetApi;

/* JADX INFO: renamed from: X.11Xp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19517511Xp {
    public final ITopDesignerBoardNetApi LIZ;

    public C19517511Xp() {
        C1499850p8J c1499850p8JCreateBuilder;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        this.LIZ = (iRetrofitFactory == null || (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(C0CQT.LIZJ)) == null) ? null : (ITopDesignerBoardNetApi) c1499850p8JCreateBuilder.build().retrofit.LIZ(ITopDesignerBoardNetApi.class);
    }
}
