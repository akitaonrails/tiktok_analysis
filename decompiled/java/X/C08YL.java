package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.08YL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08YL implements InterfaceC677820QiK {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public final boolean LIZIZ;

    @Override // X.InterfaceC677820QiK
    public final void LIZ(int i, n nVar, boolean z) {
    }

    @Override // X.InterfaceC677820QiK
    public final void LIZIZ(n nVar, C1422405hW c1422405hW, int i, boolean z) {
    }

    @Override // X.InterfaceC677820QiK
    public final void LIZJ(n nVar, C1422405hW c1422405hW, int i, boolean z, long j, long j2) {
    }

    @Override // X.InterfaceC677820QiK
    public final void LIZLLL(int i, String str, Integer num, long j, long j2, long j3) {
    }

    @Override // X.InterfaceC677820QiK
    public final void LJ(int i, n nVar) {
    }

    @Override // X.InterfaceC677820QiK
    public final void LJFF(int i, String str, Integer num, long j, long j2, long j3) {
    }

    @Override // X.InterfaceC677820QiK
    public final void LJI(int i, List<String> list) {
    }

    @Override // X.InterfaceC677820QiK
    public final void onFailed(Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Preload handling failed: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public C08YL(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }

    public final void LJII(String str, Integer num, String str2, Map map) {
        try {
            C08YO.LIZ(num, str);
            EcomResourceBystander ecomResourceBystander = EcomResourceBystander.LIZ;
            String str3 = this.LIZ;
            C08YN c08yn = new C08YN(str);
            ecomResourceBystander.getClass();
            EcomResourceBystander.LJIILLIIL(map, str3, null, str2, c08yn);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
