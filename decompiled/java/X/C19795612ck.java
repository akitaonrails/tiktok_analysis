package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.12ck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19795612ck extends AbstractC19795912cn {
    public final List<String> LLILLL;
    public final List<InterfaceC19797112cz> LLILZ;
    public final C19795712cl LLILZIL;

    @Override // X.AbstractC19795912cn, X.InterfaceC19797112cz
    public final InterfaceC19797112cz LIZIZ() {
        return new C19795612ck(this);
    }

    public C19795612ck(C19795612ck c19795612ck) {
        super(c19795612ck.LL);
        ArrayList arrayList = new ArrayList(c19795612ck.LLILLL.size());
        this.LLILLL = arrayList;
        arrayList.addAll(c19795612ck.LLILLL);
        ArrayList arrayList2 = new ArrayList(c19795612ck.LLILZ.size());
        this.LLILZ = arrayList2;
        arrayList2.addAll(c19795612ck.LLILZ);
        this.LLILZIL = c19795612ck.LLILZIL;
    }

    @Override // X.AbstractC19795912cn
    public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
        C19796212cq c19796212cq;
        C19795712cl c19795712clLIZLLL = this.LLILZIL.LIZLLL();
        int i = 0;
        while (true) {
            int size = ((ArrayList) this.LLILLL).size();
            c19796212cq = InterfaceC19797112cz.LJIILIIL;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                c19795712clLIZLLL.LJ((String) ListProtector.get(this.LLILLL, i), c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, i)));
            } else {
                c19795712clLIZLLL.LJ((String) ListProtector.get(this.LLILLL, i), c19796212cq);
            }
            i++;
        }
        for (InterfaceC19797112cz interfaceC19797112cz : (ArrayList) this.LLILZ) {
            InterfaceC19797112cz interfaceC19797112czLIZIZ = c19795712clLIZLLL.LIZIZ(interfaceC19797112cz);
            if (interfaceC19797112czLIZIZ instanceof C19798412dC) {
                interfaceC19797112czLIZIZ = c19795712clLIZLLL.LIZIZ(interfaceC19797112cz);
            }
            if (interfaceC19797112czLIZIZ instanceof C19797212d0) {
                return ((C19797212d0) interfaceC19797112czLIZIZ).LL;
            }
        }
        return c19796212cq;
    }

    public C19795612ck(String str, List<InterfaceC19797112cz> list, List<InterfaceC19797112cz> list2, C19795712cl c19795712cl) {
        super(str);
        this.LLILLL = new ArrayList();
        this.LLILZIL = c19795712cl;
        ArrayList<InterfaceC19797112cz> arrayList = (ArrayList) list;
        if (!arrayList.isEmpty()) {
            for (InterfaceC19797112cz interfaceC19797112cz : arrayList) {
                ((ArrayList) this.LLILLL).add(interfaceC19797112cz.LJFF());
            }
        }
        this.LLILZ = new ArrayList(list2);
    }
}
