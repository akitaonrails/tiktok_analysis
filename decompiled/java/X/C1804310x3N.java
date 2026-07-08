package X;

import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x3N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804310x3N extends AbstractC1804230x3F<IapListResult> {
    public final InterfaceC1804470x3d LJI;
    public final InterfaceC1804500x3g LJII;
    public final InterfaceC1804510x3h LJIIIIZZ;

    @Override // X.AbstractC1804230x3F
    public final boolean LJIILIIL(IapListResult iapListResult) {
        return iapListResult.data.isEmpty();
    }

    @Override // X.AbstractC1804230x3F
    public final void LJIILL(IapListResult iapListResult) {
        ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).setIapResultExtra(iapListResult.extra);
    }

    @Override // X.AbstractC1804230x3F
    public final void LJIIJ(C1804420x3Y c1804420x3Y, IapListResult iapListResult) {
        List<Diamond> list;
        IapListResult iapListResult2 = iapListResult;
        HashSet hashSet = new HashSet();
        if (iapListResult2 != null && (list = iapListResult2.data) != null) {
            Iterator<Diamond> it2 = list.iterator();
            while (it2.hasNext()) {
                List<String> list2 = it2.next().backupIapIdList;
                if (list2 != null) {
                    hashSet.addAll(list2);
                }
            }
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1567670qth(C13LP.LLIIII(hashSet), c1804420x3Y, this, null), 3);
    }

    @Override // X.AbstractC1804230x3F
    public final Object LJIIJJI(C1804420x3Y c1804420x3Y, Object obj, C1804290x3L c1804290x3L) {
        List<Diamond> list;
        IapListResult iapListResult = (IapListResult) obj;
        HashSet hashSet = new HashSet();
        if (iapListResult != null) {
            List<Diamond> list2 = iapListResult.data;
            if (list2 != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<Diamond> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().iapId);
                }
                hashSet.addAll(arrayList);
            }
            IapListResult.ListResultExtra listResultExtra = iapListResult.extra;
            if (listResultExtra != null && (list = listResultExtra.fullList) != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<Diamond> it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(it3.next().iapId);
                }
                hashSet.addAll(arrayList2);
            }
        }
        return this.LJI.LJ(new C1567680qti(false, C13LP.LLIIII(hashSet)), c1804290x3L);
    }

    @Override // X.AbstractC1804230x3F
    public final Object LJIIL(C1804420x3Y c1804420x3Y, String str, C1804290x3L c1804290x3L) {
        return this.LJII.LJ(new C1804690x3z(c1804420x3Y, str), c1804290x3L);
    }

    @Override // X.AbstractC1804230x3F
    public final Object LJIILJJIL(List list, Object obj, C1804290x3L c1804290x3L) {
        IapListResult iapListResult = (IapListResult) obj;
        return this.LJIIIIZZ.LJ(new C1804460x3c(iapListResult.data, list, iapListResult.extra), c1804290x3L);
    }

    public C1804310x3N(C1804410x3X c1804410x3X, C1804340x3Q c1804340x3Q, C1804330x3P c1804330x3P, C1796830wrJ c1796830wrJ, C1804220x3E c1804220x3E, C1804590x3p c1804590x3p, C1807890x99 c1807890x99, C1803570x2B c1803570x2B) {
        super(c1796830wrJ, c1804220x3E, c1804590x3p, c1807890x99, c1803570x2B);
        this.LJI = c1804410x3X;
        this.LJII = c1804340x3Q;
        this.LJIIIIZZ = c1804330x3P;
    }
}
