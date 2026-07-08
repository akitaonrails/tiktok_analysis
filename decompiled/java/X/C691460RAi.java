package X;

import com.ss.android.ugc.aweme.api.creationeoy.ICreationEoyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691460RAi extends C09AY implements Function1<C0RF0, C0SZ8> {
    public C691460RAi() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SZ8 invoke(C0RF0 c0rf0) {
        return ((ICreationEoyService) ServiceManager.get().getService(ICreationEoyService.class)).LIZJ(c0rf0);
    }
}
