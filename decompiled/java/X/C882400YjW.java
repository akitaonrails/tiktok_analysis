package X;

import com.bytedance.ies.im.core.api.depend.IWsDepend;
import com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService;
import com.bytedance.ies.im.core.depend.WsDependImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0YjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882400YjW {
    public static final C882400YjW LIZ = new C882400YjW();

    public static AbstractC883470YlF LIZ() {
        LJFF().LIZ();
        return C883250Ykt.LL;
    }

    public static C0YUF LIZLLL() {
        return LJFF().LJI();
    }

    public static InterfaceC872790YLt LJ() {
        LJFF().LIZIZ();
        return C883520YlK.LIZ;
    }

    public static final IIMCoreDependProxyService LJFF() {
        return (IIMCoreDependProxyService) ServiceManager.get().getService(IIMCoreDependProxyService.class);
    }

    public static C0YUG LJI() {
        return LJFF().LIZLLL();
    }

    public static IWsDepend LJII() {
        LJFF().LIZJ();
        return WsDependImpl.LL;
    }

    public static C0YMF LIZIZ(C0YM2 c0ym2) {
        return LJFF().LJFF(c0ym2);
    }
}
