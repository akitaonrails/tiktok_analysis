package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rcE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595280rcE implements InterfaceC1596200rdi {
    @Override // X.InterfaceC1596200rdi
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.InterfaceC1596200rdi
    public final boolean LJIIZILJ() {
        return false;
    }

    @Override // X.InterfaceC1596200rdi
    public final C1595260rcC<? extends List<InterfaceC1891350zJl>> LJFF(boolean z, boolean z2) {
        EnumC1595320rcI enumC1595320rcI = EnumC1595320rcI.SUCCESS;
        ArrayList arrayList = new ArrayList();
        C1595260rcC<? extends List<InterfaceC1891350zJl>> c1595260rcC = new C1595260rcC<>(enumC1595320rcI, arrayList, CardStruct.IStatusCode.DEFAULT, null, null, 0, false, false, 0, 496);
        Pair<List<InterfaceC1891350zJl>, Integer> pairLJFF = C614770O9j.LIZIZ.LIZ().LJFF();
        List<InterfaceC1891350zJl> first = pairLJFF.getFirst();
        int iIntValue = pairLJFF.getSecond().intValue();
        if (C319860CgK.LIZ()) {
            if (!C1206104nj.LIZ()) {
                iIntValue = -2;
            } else if (first != null && !first.isEmpty()) {
                iIntValue = 2;
            }
            C1599640rjG.LIZIZ.Mu(iIntValue);
        }
        if (first == null) {
            return null;
        }
        C19719612Di.LJJI(new ArrayList(first), arrayList);
        c1595260rcC.LJIIIIZZ = 1;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof C1596360rdy) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((C1596360rdy) it2.next()).LLILZIL = 1;
        }
        return c1595260rcC;
    }
}
