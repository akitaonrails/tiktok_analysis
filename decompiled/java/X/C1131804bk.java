package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.deeplink.IMDeepLinkHandlerServiceImpl;
import com.ss.android.ugc.aweme.im.service.service.IIMDeepLinkHandlerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04bk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1131804bk extends C09AY implements Function1<C0RUS, Unit> {
    public C1131804bk() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0RUS c0rus) {
        IIMDeepLinkHandlerService iIMDeepLinkHandlerService;
        C0RUS c0rus2 = c0rus;
        Object objLIZ = C04TD.LIZ(IIMDeepLinkHandlerService.class, false);
        if (objLIZ != null) {
            iIMDeepLinkHandlerService = (IIMDeepLinkHandlerService) objLIZ;
        } else {
            if (C04TD.a1 == null) {
                synchronized (IIMDeepLinkHandlerService.class) {
                    if (C04TD.a1 == null) {
                        C04TD.a1 = new IMDeepLinkHandlerServiceImpl();
                    }
                }
            }
            iIMDeepLinkHandlerService = C04TD.a1;
        }
        c0rus2.LL = iIMDeepLinkHandlerService.LIZ();
        return Unit.LIZ;
    }
}
