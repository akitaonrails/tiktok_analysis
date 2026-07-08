package X;

import com.ss.android.ugc.aweme.experiment.INewUserDefaultGroup;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303180BuW extends C09AY implements Function0<Boolean> {
    public C303180BuW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((INewUserDefaultGroup) ServiceManager.get().getService(INewUserDefaultGroup.class)).LIZIZ(new C303190BuX()));
    }
}
