package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ogc.news.managetopics.repo.ManageTopicsResponse;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0gHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159680gHe {
    public static volatile ManageTopicsResponse LIZJ;
    public static volatile long LIZLLL;
    public final C1159710gHh LIZ = new C1159710gHh();
    public final InterfaceC1159690gHf LIZIZ;

    public final Integer LIZ() {
        C1159710gHh c1159710gHh = this.LIZ;
        c1159710gHh.getClass();
        Object objLIZ = C1159710gHh.LIZ("fetchTopicsGuideShowTime", new AwS562S0100000_18(c1159710gHh, 2770));
        if (C189200o6.m7isFailureimpl(objLIZ)) {
            objLIZ = 0;
        }
        return (Integer) objLIZ;
    }

    public C1159680gHe() {
        InterfaceC1159690gHf.LIZ.getClass();
        this.LIZIZ = (InterfaceC1159690gHf) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(InterfaceC1159690gHf.class);
    }
}
