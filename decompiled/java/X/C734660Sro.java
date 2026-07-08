package X;

import com.ss.android.ugc.aweme.favorites.business.aweme.ability.ICollectAweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Sro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734660Sro extends C09AY implements Function0<ICollectAweme> {
    public C734660Sro() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.favorites.business.aweme.ability.ICollectAweme, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ICollectAweme invoke() {
        return ServiceManager.get().getService(ICollectAweme.class);
    }
}
