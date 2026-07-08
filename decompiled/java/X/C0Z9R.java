package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Z9R, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z9R extends C09AY implements Function0<IMainPageFragment> {
    public C0Z9R() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.main.IMainPageFragment, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final IMainPageFragment invoke() {
        return ServiceManager.get().getService(IMainPageFragment.class);
    }
}
