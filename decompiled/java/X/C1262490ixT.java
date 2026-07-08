package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;

/* JADX INFO: renamed from: X.0ixT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262490ixT {
    public static final String[] LIZ = {"1-1", "1-2", "1-3", "1-4", "1-5", "1-6", "1-7", "3-1", "3-2", "3-3", "6-1"};

    public static final Context LIZIZ(C1262300ixA c1262300ixA) {
        Context contextRequireContext;
        Fragment fragment = c1262300ixA.hostFragment;
        if ((fragment == null || (contextRequireContext = fragment.requireContext()) == null) && (contextRequireContext = c1262300ixA.hostActivity) == null) {
            "not attach context!".toString();
            throw new IllegalStateException("not attach context!");
        }
        return contextRequireContext;
    }

    public static final LifecycleOwner LIZJ(C1262300ixA c1262300ixA) {
        LifecycleOwner lifecycleOwner = c1262300ixA.hostFragment;
        if (lifecycleOwner == null && (lifecycleOwner = c1262300ixA.hostActivity) == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        return lifecycleOwner;
    }

    public static final boolean LIZLLL(C1262300ixA c1262300ixA) {
        if (!c1262300ixA.apiConfig.LJII || !C816930W2x.LIZ()) {
            return false;
        }
        if (c1262300ixA.apiConfig.LIZ == EnumC1262370ixH.INBOX_PAGE) {
            C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
            if (c19212010Ec.LJIIJ() && c19212010Ec.LJJIJIIJI()) {
                int i = C2187451AjH.LIZ;
                return true;
            }
        }
        EnumC325100Com networkStatus = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus();
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("network type: ");
        sbLIZ.append(networkStatus);
        C2188811AlT.LIZIZ(sbLIZ);
        if (networkStatus == EnumC325100Com.STRONG) {
            return false;
        }
        return true;
    }

    public static final UrlModel LIZ(C1262090iwp c1262090iwp, int i, C1261860iwS c1261860iwS, boolean z) {
        if (z) {
            UrlModel avatar300 = c1261860iwS.getAvatar300();
            if (avatar300 == null) {
                UrlModel avatarMedium = c1261860iwS.getAvatarMedium();
                if (avatarMedium == null) {
                    return c1261860iwS.getAvatar168();
                }
                return avatarMedium;
            }
            return avatar300;
        }
        if (i != 400) {
            if (i != 401) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("can't support the listVariant: ");
                sbLIZ.append(i);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
            switch (c1262090iwp.LIZ) {
                case 100:
                case 101:
                case 102:
                    UrlModel avatar168 = c1261860iwS.getAvatar168();
                    if (avatar168 == null) {
                        UrlModel avatar3002 = c1261860iwS.getAvatar300();
                        if (avatar3002 == null) {
                            return c1261860iwS.getAvatarMedium();
                        }
                        return avatar3002;
                    }
                    return avatar168;
                case 103:
                case 104:
                    UrlModel avatarThumb = c1261860iwS.getAvatarThumb();
                    if (avatarThumb == null) {
                        UrlModel avatar1682 = c1261860iwS.getAvatar168();
                        if (avatar1682 == null) {
                            UrlModel avatar3003 = c1261860iwS.getAvatar300();
                            if (avatar3003 == null) {
                                return c1261860iwS.getAvatarMedium();
                            }
                            return avatar3003;
                        }
                        return avatar1682;
                    }
                    return avatarThumb;
                default:
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("can't support the cell variant: ");
                    sbLIZ2.append(c1262090iwp.LIZ);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    strLIZIZ2.toString();
                    throw new IllegalStateException(strLIZIZ2);
            }
        }
        UrlModel avatar3004 = c1261860iwS.getAvatar300();
        if (avatar3004 == null) {
            return c1261860iwS.getAvatarMedium();
        }
        return avatar3004;
    }
}
