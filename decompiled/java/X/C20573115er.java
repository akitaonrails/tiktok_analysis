package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.15er, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20573115er {
    public static final /* synthetic */ C20573115er LIZ = new C20573115er();
    public static final InterfaceC20573215es LIZIZ;

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        String str = C344670DfF.LIZ;
        LIZIZ = (InterfaceC20573215es) iRetrofitFactory.LIZ(C344670DfF.LIZ).create(InterfaceC20573215es.class);
    }

    public static C11O8 LIZ(String str) {
        return C632140Oqq.LIZLLL(LIZIZ.LIZ(str, 20), "/aweme/v1/hide/list/", null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    public static C11O8 LIZIZ(String str, EnumC1392960mLu enumC1392960mLu) {
        return C632140Oqq.LIZLLL(LIZIZ.LIZIZ(str, "settings", enumC1392960mLu.getValue()), "/aweme/v1/hide/open/", null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    public static C11O8 LIZJ(String str, EnumC1392960mLu enumC1392960mLu) {
        return C632140Oqq.LIZLLL(LIZIZ.LIZJ(str, "settings", enumC1392960mLu.getValue()), "/aweme/v1/hide/close/", null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }
}
