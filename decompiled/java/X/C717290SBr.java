package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C717290SBr {
    public static final /* synthetic */ C717290SBr LIZ = new C717290SBr();
    public static final C01GW<String> LIZIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(460));

    public static InterfaceC717320SBu LIZIZ() {
        return (InterfaceC717320SBu) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(LIZIZ.getValue()).create(InterfaceC717320SBu.class);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZ(String str, String str2, String str3) {
        if (str == null) {
            return 1;
        }
        switch (str.hashCode()) {
            case -1572049565:
                if (!str.equals("notification_page")) {
                    return 1;
                }
                return 3;
            case 384221887:
                if (!str.equals("subscription_privilege_page")) {
                    return 1;
                }
                return 7;
            case 809483594:
                if (!str.equals("others_homepage")) {
                    return 1;
                }
                return 2;
            case 1879474642:
                if (!str.equals("playlist")) {
                    return 1;
                }
                if (Intrinsics.LJFF(str3, "homepage_hot")) {
                    return 4;
                }
                if (Intrinsics.LJFF(str3, "others_homepage")) {
                    if (Intrinsics.LJFF(str2, "from_profile_mix_list")) {
                        return 6;
                    }
                    return 5;
                }
                return 7;
            default:
                return 1;
        }
    }
}
