package X;

import com.ss.android.ugc.aweme.feed.landscape.service.LandscapeFeedMonitorImpl;
import com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Sex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726690Sex implements ILandscapeFeedMonitor {
    public static final C726690Sex LIZIZ = new C726690Sex();
    public final /* synthetic */ ILandscapeFeedMonitor LIZ;

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LIZ(Map<String, String> map) {
        this.LIZ.LIZ(map);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LIZIZ(int i, String str, Map map) {
        this.LIZ.LIZIZ(i, str, map);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LIZJ(Map<String, String> map) {
        this.LIZ.LIZJ(map);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJ(int i, String str) {
        this.LIZ.LJ(i, str);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJFF(int i, Map<String, String> map) {
        this.LIZ.LJFF(i, map);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJI(String str, Map<String, String> map) {
        this.LIZ.LJI(str, map);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJII(Map<String, String> map) {
        this.LIZ.LJII(map);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJIIIIZZ(Map<String, String> map) {
        this.LIZ.LJIIIIZZ(map);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJIIIZ(String str, String str2, String str3, Map<String, String> map) {
        this.LIZ.LJIIIZ(str, str2, str3, map);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJIIJ(Map<String, String> map) {
        this.LIZ.LJIIJ(map);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJIIJJI(Map<String, String> map) {
        this.LIZ.LJIIJJI(map);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJIIL(Map<String, String> map) {
        this.LIZ.LJIIL(map);
    }

    @Override // com.ss.android.ugc.aweme.service.ILandscapeFeedMonitor
    public final void LJIILIIL(Map<String, String> map) {
        this.LIZ.LJIILIIL(map);
    }

    public C726690Sex() {
        ILandscapeFeedMonitor iLandscapeFeedMonitor;
        List<String> list = LandscapeFeedMonitorImpl.LIZ;
        Object objLIZ = C04TD.LIZ(ILandscapeFeedMonitor.class, false);
        if (objLIZ != null) {
            iLandscapeFeedMonitor = (ILandscapeFeedMonitor) objLIZ;
        } else {
            if (C04TD.w0 == null) {
                synchronized (ILandscapeFeedMonitor.class) {
                    if (C04TD.w0 == null) {
                        C04TD.w0 = new LandscapeFeedMonitorImpl();
                    }
                }
            }
            iLandscapeFeedMonitor = C04TD.w0;
        }
        this.LIZ = iLandscapeFeedMonitor;
    }
}
