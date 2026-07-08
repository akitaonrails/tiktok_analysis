package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.video.preload.VideoPreloadManager;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ogu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482860ogu extends VideoPreloadManager implements InterfaceC1488150opR {
    @Override // com.ss.android.ugc.aweme.video.preload.VideoPreloadManager, X.InterfaceC1482870ogv, X.InterfaceC1488150opR
    public final void LIZ() {
        C1475700oVM.LIZ().LIZ();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.VideoPreloadManager, X.InterfaceC1482870ogv
    public final void clearCache() {
        C1478160oZK.LIZ().clearCache();
    }

    public C1482860ogu(int i) {
    }

    public static final int LJJZZIII(C1482560ogQ c1482560ogQ) {
        return C1475700oVM.LIZ().LJJLIIIJJI(C1479290ob9.LJII(C1479540obY.LIZIZ(c1482560ogQ)));
    }

    public static final long LJL(String str) {
        return C1475700oVM.LIZ().LJIILL(str);
    }

    @Override // X.InterfaceC1488150opR
    public final void LJIILLIIL(int i, List list) {
        if (list != null && list.size() != 0 && i > 0) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                SimVideoUrlModel simVideoUrlModelLJII = C1479290ob9.LJII(C1479540obY.LIZIZ((InterfaceC1479620obg) it2.next()));
                if (simVideoUrlModelLJII != null && simVideoUrlModelLJII.getUrlList() != null && simVideoUrlModelLJII.getUrlList().size() != 0) {
                    int i2 = i * 1024;
                    C786410Ut5.j4("user actively preload --> URI:%s, size:%sKB, url:%s", new Object[]{simVideoUrlModelLJII.getUri(), Integer.valueOf(i2), ListProtector.get(simVideoUrlModelLJII.getUrlList(), 0)});
                    C1478160oZK.LIZ().LJJJLL(simVideoUrlModelLJII, i2);
                }
            }
            return;
        }
        C786410Ut5.j4("user actively preload, error -->playList:%s, size:%s", new Object[]{list, Integer.valueOf(i)});
    }

    @Override // com.ss.android.ugc.aweme.video.preload.VideoPreloadManager, X.InterfaceC1482870ogv
    public final void LJIIL(String str, long j, long j2, int i, byte[] bArr) {
        C1478160oZK.LIZ().LJIIL(str, j, j2, i, bArr);
    }
}
