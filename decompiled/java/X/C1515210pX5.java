package X;

import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pX5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515210pX5 {
    public static volatile C1515210pX5 LIZ;

    public static Map LIZIZ() {
        return ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).getCommonParams();
    }

    public static String LIZJ() {
        return ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).getHostDomain();
    }

    public static C1515210pX5 LIZLLL() {
        if (LIZ == null) {
            synchronized (C1515210pX5.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1515210pX5();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static InterfaceC1904907d9 LJ() {
        return ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).e72();
    }

    public static InterfaceC1904907d9 LJFF() {
        return ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).X01();
    }

    public static C0IMD LJI(Class cls) {
        return ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).qL2(cls);
    }

    public static InterfaceC1132110fZB LJII(Class cls) {
        return ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).R00(cls);
    }

    public static C0K8R LIZ(String str, List list) {
        return ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).downloadFile(false, Integer.MAX_VALUE, str, list, null);
    }

    public static C0K8R LJIIIIZZ(int i, String str, List list, String str2, byte[] bArr, long j, String str3) {
        return ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).uploadFile(i, str, list, str2, bArr, j, str3);
    }
}
