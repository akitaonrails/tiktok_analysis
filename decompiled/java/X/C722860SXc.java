package X;

import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722860SXc extends C09AY implements Function1<C2189821An6, Boolean> {
    public C722860SXc() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C2189821An6 c2189821An6) {
        return Boolean.valueOf(((IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class)).LJ());
    }
}
