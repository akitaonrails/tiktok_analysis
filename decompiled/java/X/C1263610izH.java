package X;

import com.ss.android.ugc.aweme.relation.fragment.muflist.MufEmptyCell;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0izH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263610izH extends AbstractC1906720ziY {
    public final MufListPageViewModel LLIZLLLIL;

    @Override // X.AbstractC1906720ziY, X.InterfaceC1906750zib
    public final void onCreate() {
        LJIILIIL(MufUserCell.class);
        LJIILIIL(MufEmptyCell.class);
    }

    @Override // X.AbstractC1906720ziY
    public final AbstractC329610Cw3<String> LJIIJJI() {
        return (AbstractC329610Cw3) this.LLIZLLLIL.LLIZ.getValue();
    }

    public final boolean LJJ() {
        return ((ArrayList) this.LLILZLL.LJII()).size() == 1 && (C13LP.LJJJJZI(this.LLILZLL.LJII()) instanceof C1263830izd);
    }

    public C1263610izH(MufListPageViewModel mufListPageViewModel) {
        this.LLIZLLLIL = mufListPageViewModel;
    }

    public final synchronized void LJJI(String str) {
        Object next;
        if (str == null) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLILZLL.LJII()).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) next;
                if ((interfaceC1891350zJl instanceof C1247690iZb) && Intrinsics.LJFF(((C1247690iZb) interfaceC1891350zJl).LL.getUid(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) next;
        if (interfaceC1891350zJl2 != null) {
            C20600815jK.LJIIL(this.LLILZLL, interfaceC1891350zJl2);
        }
        if (((ArrayList) this.LLILZLL.LJII()).isEmpty()) {
            C20600815jK.LIZJ(this.LLILZLL, new C1263830izd());
        }
    }
}
