package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zn3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909510zn3 extends C09AY implements Function0<InterfaceC1909500zn2> {
    public C1909510zn3() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1909500zn2 invoke() {
        return ((LocalTestApi) ServiceManager.get().getService(LocalTestApi.class)).getTabletService();
    }
}
