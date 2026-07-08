package X;

import Y.AObjectS78S0000000_28;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10ZT, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10ZT implements InterfaceC813980VwS {
    public static final C10ZT LIZ = new C10ZT();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new AObjectS78S0000000_28(0));
    public static final C01GW LIZJ = C452501pT.LIZIZ(new AObjectS78S0000000_28(1));

    @Override // X.InterfaceC813980VwS
    public final boolean LIZIZ() {
        boolean zLIZIZ = ((C10ZU) LIZIZ.getValue()).LIZIZ();
        C1865740yeS c1865740yeS = C1865740yeS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSaveCacheEnabled: ");
        sbLIZ.append(zLIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1865740yeS.getClass();
        C1865740yeS.LIZJ("PushVideoPreloadManager", strLIZIZ);
        return zLIZIZ;
    }

    @Override // X.InterfaceC813980VwS
    public final boolean LIZJ(String str) {
        boolean zLIZ = ((C10ZU) LIZIZ.getValue()).LIZ();
        C1865740yeS c1865740yeS = C1865740yeS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isSaveCacheEnabledInternal: ");
        sbLIZ.append(zLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1865740yeS.getClass();
        C1865740yeS.LIZJ("PushVideoPreloadManager", strLIZIZ);
        if (zLIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cache_");
            sbLIZ2.append(str);
            boolean zLJFF = Intrinsics.LJFF(C10ZP.LIZ("push_video_preload", C2188811AlT.LIZIZ(sbLIZ2)), "1");
            if (!zLJFF) {
                str = "";
            }
            C10ZV.LIZ = str;
            if (zLJFF) {
                boolean zLIZIZ = ((C10ZU) LIZJ.getValue()).LIZIZ();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("isReadCacheEnabledFromDeeplink: ");
                sbLIZ3.append(zLIZIZ);
                C1865740yeS.LIZJ("PushVideoPreloadManager", C2188811AlT.LIZIZ(sbLIZ3));
                if (zLIZIZ) {
                    LJI("read", "1", "");
                }
                return zLIZIZ;
            }
            C1865740yeS.LIZJ("PushVideoPreloadManager", "isReadCacheEnabledFromDeeplink: !hasCache , return false");
            return false;
        }
        C1865740yeS.LIZJ("PushVideoPreloadManager", "isReadCacheEnabledFromDeeplink: saveCacheDisabled, return false");
        return false;
    }

    @Override // X.InterfaceC813980VwS
    public final boolean LIZLLL(String str) {
        boolean zLJFF;
        if (Intrinsics.LJFF(C10ZV.LIZ, str)) {
            zLJFF = true;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cache_");
            sbLIZ.append(str);
            zLJFF = Intrinsics.LJFF(C10ZP.LIZ("push_video_preload", C2188811AlT.LIZIZ(sbLIZ)), "1");
        }
        if (zLJFF) {
            boolean zLIZ = ((C10ZU) LIZJ.getValue()).LIZ();
            C1865740yeS c1865740yeS = C1865740yeS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("isReadCacheEnabled: ");
            sbLIZ2.append(zLIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c1865740yeS.getClass();
            C1865740yeS.LIZJ("PushVideoPreloadManager", strLIZIZ);
            return zLIZ;
        }
        C1865740yeS.LIZ.getClass();
        C1865740yeS.LIZJ("PushVideoPreloadManager", "isReadCacheEnabled: !hasCache , return false");
        return false;
    }

    @Override // X.InterfaceC813980VwS
    public final void LJ(String str) {
        INewUserDebugService iNewUserDebugServiceLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Keva kevaLIZIZ = C10ZP.LIZIZ("push_video_preload");
        if (kevaLIZIZ != null) {
            kevaLIZIZ.erase(strLIZIZ);
        }
        int iLIZ = C10ZV.LIZ() - 1;
        if (iLIZ < 0) {
            iLIZ = 0;
        }
        C10ZP.LIZJ("push_video_preload", "cache_size", String.valueOf(iLIZ));
        C1865740yeS.LIZ.getClass();
        if (C1865740yeS.LIZ() && (iNewUserDebugServiceLIZIZ = C1865740yeS.LIZIZ()) != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("deleteAweme: ");
            sbLIZ2.append(str);
            sbLIZ2.append(", size: ");
            sbLIZ2.append(C10ZV.LIZ());
            iNewUserDebugServiceLIZIZ.LJI("PushVideoPreloadManager", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC813980VwS
    public final void LJFF(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        LJI("save_video", str2, str);
    }

    public static void LJI(String str, String str2, String str3) {
        C20684815ws.LJIILLIIL("push_video_preload_state", C2097608Jq.LJI(new Pair("type", str), new Pair("state", str2), new Pair("size", String.valueOf(C10ZV.LIZ())), new Pair("error_info", str3)));
    }

    @Override // X.InterfaceC813980VwS
    public final void LIZ(final String str, final String str2, final boolean z) {
        String str3 = "1";
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cache_");
            sbLIZ.append(str);
            C10ZP.LIZJ("push_video_preload", C2188811AlT.LIZIZ(sbLIZ), "1");
            C10ZP.LIZJ("push_video_preload", "cache_size", String.valueOf(C10ZV.LIZ() + 1));
        }
        C1865740yeS c1865740yeS = C1865740yeS.LIZ;
        Function0 function0 = new Function0() { // from class: X.10ZW
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str4 = str;
                boolean z2 = z;
                String str5 = str2;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("saveAweme: ");
                sbLIZ2.append(str4);
                sbLIZ2.append(", isSuccess: ");
                sbLIZ2.append(z2);
                sbLIZ2.append(", errorType: ");
                sbLIZ2.append(str5);
                sbLIZ2.append(", size: ");
                sbLIZ2.append(C10ZV.LIZ());
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        };
        c1865740yeS.getClass();
        C1865740yeS.LIZLLL("PushVideoPreloadManager", function0);
        if (!z) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LJI("save_aweme", str3, str2);
    }
}
