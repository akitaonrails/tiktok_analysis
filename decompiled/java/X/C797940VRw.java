package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ICoinService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ttf.network.depend.AbsIESNetDependAdapter;
import java.util.Map;

/* JADX INFO: renamed from: X.0VRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C797940VRw extends AbsIESNetDependAdapter {
    public static volatile C797940VRw LIZ;

    @Override // X.InterfaceC1493280oxi
    public final void LJIIJJI() {
    }

    public static C797940VRw LJIJI() {
        if (LIZ == null) {
            synchronized (C797940VRw.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C797940VRw();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    @Override // X.InterfaceC1493280oxi
    public final String[] LJ() {
        if (C0X4M.LIZ == null) {
            C0X4M.LIZ = C0X4M.LJFF;
        }
        return C0X4M.LIZ;
    }

    @Override // X.AbstractC1493260oxg
    public final Map<String, String> LJIJ() {
        ICoinService iCoinService = (ICoinService) PluggableExtentionKt.pluggableSpi(ICoinService.class);
        if (iCoinService == null) {
            return null;
        }
        Map<String, String> mapLJ = iCoinService.LJ();
        if (mapLJ.isEmpty()) {
            return null;
        }
        return mapLJ;
    }

    @Override // X.AbstractC1493260oxg, X.InterfaceC1494880p0I
    public final long LIZ() {
        return C1150504el.LIZ().LJJII * 1000;
    }

    @Override // X.AbstractC1493260oxg, X.InterfaceC1494880p0I
    public final long LJIILJJIL() {
        return C1150504el.LIZ().LJJIII;
    }
}
