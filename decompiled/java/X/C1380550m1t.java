package X;

import com.ss.android.ugc.aweme.longpress.LPPProtocol;
import com.ss.android.ugc.aweme.longpress.LongPressStructure;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0m1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380550m1t extends AbstractC1380560m1u implements InterfaceC1380640m22 {
    public final String LIZJ;
    public final C1380610m1z LIZLLL;
    public List<String> LJ = new ArrayList();

    @Override // X.InterfaceC1380640m22
    public final InterfaceC1380660m24 LIZJ() {
        LPPProtocol lPPProtocol = this.LIZLLL.LIZIZ;
        if (lPPProtocol != null) {
            return lPPProtocol.LIZ(this.LIZJ);
        }
        return null;
    }

    public final void LJFF() {
        LongPressStructure longPressStructure;
        List<String> list;
        LPPProtocol lPPProtocol = this.LIZLLL.LIZIZ;
        if (lPPProtocol != null) {
            lPPProtocol.LIZ(this.LIZJ).setKey(this.LIZJ);
        }
        Map<String, LongPressStructure> map = this.LIZLLL.LIZ;
        ArrayList arrayList = (map == null || (longPressStructure = map.get(this.LIZJ)) == null || (list = longPressStructure.children) == null) ? new ArrayList() : new ArrayList(list);
        this.LJ = arrayList;
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            C1380550m1t c1380550m1t = new C1380550m1t((String) obj, this.LIZLLL);
            c1380550m1t.LJFF();
            LJ(c1380550m1t, i);
            i = i2;
        }
    }

    @Override // X.InterfaceC1380640m22
    public final C1380610m1z LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1380630m21
    public final String getKey() {
        return this.LIZJ;
    }

    public C1380550m1t(String str, C1380610m1z c1380610m1z) {
        this.LIZJ = str;
        this.LIZLLL = c1380610m1z;
    }
}
