package X;

import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Srm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734640Srm extends C09AY implements Function0<IAwemeCollectionStateNotifier> {
    public C734640Srm() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAwemeCollectionStateNotifier invoke() {
        return ServiceManager.get().getService(IAwemeCollectionStateNotifier.class);
    }
}
