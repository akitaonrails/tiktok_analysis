package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0DnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349820DnY extends C349710DnN {
    public final InterfaceC349700DnM LIZIZ;
    public final InterfaceC349700DnM LIZJ;

    public final List<C349800DnW> LIZIZ() {
        LIZ(AFwS191S0000000_5.get$arr$(436));
        List<C349800DnW> listLIZLLL = new C349690DnL(this.LIZIZ, true).LIZLLL();
        LIZ(new AwS549S0100000_5(listLIZLLL, (List<C349800DnW>) 1701));
        List<C349800DnW> listLIZLLL2 = new C349690DnL(this.LIZJ, false).LIZLLL();
        LIZ(new AwS549S0100000_5(listLIZLLL2, (List<C349800DnW>) 1702));
        ArrayList arrayList = new ArrayList();
        Iterator<C349800DnW> it2 = listLIZLLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        C349800DnW c349800DnW = (C349800DnW) C13LP.LJJLIIIJL(listLIZLLL);
        int i = c349800DnW != null ? c349800DnW.LIZJ : 0;
        for (C349800DnW c349800DnW2 : listLIZLLL2) {
            c349800DnW2.LIZIZ += i;
            c349800DnW2.LIZJ += i;
            arrayList.add(c349800DnW2);
        }
        LIZ(new AwS549S0100000_5(arrayList, (List<C349800DnW>) 1703));
        return arrayList;
    }

    public C349820DnY(C363700ENs c363700ENs, C363700ENs c363700ENs2) {
        super(c363700ENs);
        this.LIZIZ = c363700ENs;
        this.LIZJ = c363700ENs2;
    }
}
