package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ca1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017310ca1 extends C09AY implements Function0<InterfaceC688220Qz6> {
    public C1017310ca1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC688220Qz6 invoke() {
        return ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJJI();
    }
}
