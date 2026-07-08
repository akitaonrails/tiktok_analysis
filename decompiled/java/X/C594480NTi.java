package X;

import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0NTi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594480NTi implements InterfaceC1608000rwk {
    public final SessionInfo LL;
    public InterfaceC594490NTj LLILLJJLI;
    public List<C0NPA> LLILLL = C13BV.INSTANCE;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(45));
    public final C1DEV LLILZIL = C2191201ApK.LIZ();
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(44));

    @Override // X.InterfaceC1608000rwk
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1608000rwk
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC1608000rwk
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC1608000rwk
    public final void LJI() {
        this.LLILLJJLI = null;
    }

    @Override // X.InterfaceC1608000rwk
    public final Aweme LJIIIIZZ() {
        C0NPA c0npa = (C0NPA) C13LP.LJJJLL(this.LLILLL);
        String str = c0npa != null ? c0npa.LIZLLL : null;
        IAwemeService iAwemeService = (IAwemeService) this.LLILZLL.getValue();
        if (iAwemeService != null) {
            return iAwemeService.LLILZ(str);
        }
        return null;
    }

    @Override // X.InterfaceC1608000rwk
    public final long getStartIndex() {
        C0NPA c0npa = (C0NPA) C13LP.LJJJLL(this.LLILLL);
        if (c0npa != null) {
            return c0npa.LJIIIZ;
        }
        return 0L;
    }

    @Override // X.InterfaceC1608000rwk
    public final void refresh() {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C594460NTg(this, true, null), 2);
    }

    public C594480NTi(SessionInfo sessionInfo) {
        this.LL = sessionInfo;
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C594460NTg(this, false, null), 2);
    }

    @Override // X.InterfaceC1608000rwk
    public final void LIZJ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadNewer cursor: ");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        Iterator<C0NPA> it2 = this.LLILLL.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().LJIIIZ == j) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        List<C0NPA> list = this.LLILLL;
        List<C0NPA> listSubList = list.subList(i + 1, list.size());
        InterfaceC594490NTj interfaceC594490NTj = this.LLILLJJLI;
        if (interfaceC594490NTj != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
            for (C0NPA c0npa : listSubList) {
                arrayList.add(new C912500Zqy(c0npa.LJIIIZ, c0npa.LIZLLL, null));
            }
            interfaceC594490NTj.LIZJ(new C597250Nbf(arrayList, false));
        }
    }

    @Override // X.InterfaceC1608000rwk
    public final void LJ(C1607990rwj c1607990rwj) {
        this.LLILLJJLI = c1607990rwj;
    }

    @Override // X.InterfaceC1608000rwk
    public final void deleteItem(String str) {
        ((HashSet) this.LLILZ.getValue()).add(str);
    }

    @Override // X.InterfaceC1608000rwk
    public final void LIZIZ(long j, boolean z) {
        InterfaceC594490NTj interfaceC594490NTj = this.LLILLJJLI;
        if (interfaceC594490NTj != null) {
            interfaceC594490NTj.LIZIZ(new C597250Nbf(C13BV.INSTANCE, false));
        }
    }
}
