package X;

import com.bytedance.android.live.browser.IHostJsbRegisterService;
import com.ss.android.ugc.aweme.live.ILiveBDXBridgeService;
import java.util.List;

/* JADX INFO: renamed from: X.0x9a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808160x9a implements ILiveBDXBridgeService {
    public static final C1808160x9a LIZ = new C1808160x9a();

    @Override // com.ss.android.ugc.aweme.live.ILiveBDXBridgeService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodList;
        IHostJsbRegisterService iHostJsbRegisterService = (IHostJsbRegisterService) C1161920gLG.LIZJ(IHostJsbRegisterService.class);
        return (iHostJsbRegisterService == null || (listProvideXBridgetIDLMethodList = iHostJsbRegisterService.provideXBridgetIDLMethodList()) == null) ? C13BV.INSTANCE : listProvideXBridgetIDLMethodList;
    }

    @Override // com.ss.android.ugc.aweme.live.ILiveBDXBridgeService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodListForLynxPrefetch() {
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listProvideXBridgetIDLMethodListForLynxPrefetch;
        IHostJsbRegisterService iHostJsbRegisterService = (IHostJsbRegisterService) C1161920gLG.LIZJ(IHostJsbRegisterService.class);
        return (iHostJsbRegisterService == null || (listProvideXBridgetIDLMethodListForLynxPrefetch = iHostJsbRegisterService.provideXBridgetIDLMethodListForLynxPrefetch()) == null) ? C13BV.INSTANCE : listProvideXBridgetIDLMethodListForLynxPrefetch;
    }
}
