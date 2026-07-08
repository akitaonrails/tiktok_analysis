package X;

import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Srn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734650Srn extends C09AY implements Function0<IAwemeCollectionState> {
    public C734650Srn() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IAwemeCollectionState invoke() {
        return ServiceManager.get().getService(IAwemeCollectionState.class);
    }
}
