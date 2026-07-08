package X;

import com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0NuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C608960NuY implements InterfaceC1631620sYq<VideoItemParams, Map<String, ? extends Object>, InterfaceC1364105Vn<? super AbstractC1387105bp>, Object>, InterfaceC842703Qz {
    public final C704830Rkn LL;

    public C608960NuY(C704830Rkn c704830Rkn) {
        this.LL = c704830Rkn;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(VideoItemParams videoItemParams, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AbstractC1387105bp> interfaceC1364105Vn) {
        InterfaceC1369790lkX interfaceC1369790lkX;
        String strKey;
        C608590Ntx c608590Ntx = C608530Ntr.LLJJI;
        C704830Rkn c704830Rkn = this.LL;
        c608590Ntx.getClass();
        QuickExternalShareVM quickExternalShareVMLIZ = C608590Ntx.LIZ(c704830Rkn);
        if (quickExternalShareVMLIZ != null) {
            interfaceC1369790lkX = quickExternalShareVMLIZ.LLILLJJLI;
        } else {
            interfaceC1369790lkX = null;
        }
        C01GW c01gw = C283820BAm.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 1) {
            Set<String> setKeySet = C1374650lsN.LIZ.keySet();
            if (interfaceC1369790lkX != null) {
                strKey = interfaceC1369790lkX.key();
            } else {
                strKey = null;
            }
            if (!C13LP.LJJJJ(strKey, setKeySet)) {
                return C1387305br.LIZIZ;
            }
            return new C1387205bq(null);
        }
        if (((Number) c01gw.getValue()).intValue() == 2) {
            return new C1387205bq(null);
        }
        return C1387305br.LIZIZ;
    }
}
