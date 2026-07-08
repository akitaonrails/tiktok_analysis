package X;

import com.ss.android.ugc.aweme.experiment.INewUserDefaultGroup;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C1Q, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C1Q extends C09AY implements Function0<Boolean> {
    public C0C1Q() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((INewUserDefaultGroup) ServiceManager.get().getService(INewUserDefaultGroup.class)).LIZIZ(new C0C1R()));
    }
}
