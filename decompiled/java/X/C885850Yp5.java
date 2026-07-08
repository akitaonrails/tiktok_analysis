package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.userportrait.api.service.IMUserPortraitApi;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0Yp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885850Yp5 implements InterfaceC884870YnV, C0Z31 {
    public static volatile int LIZIZ;
    public static volatile int LIZJ;
    public static volatile boolean LIZLLL;
    public static final C885850Yp5 LIZ = new C885850Yp5();
    public static volatile int LJ = -1;
    public static volatile int LJFF = -1;
    public static final C01GW LJI = C452501pT.LIZIZ(new C886160Ypa());
    public static volatile int LJII = -1;
    public static final C563400M7u LJIIIIZZ = new C563400M7u(0);
    public static final C01GW LJIIIZ = C452501pT.LIZIZ(new C884070YmD());
    public static final C01GW LJIIJ = C452501pT.LIZIZ(new C886210Ypf());
    public static final C01GW LJIIJJI = C452501pT.LIZIZ(new C886200Ype());
    public static final C01GW LJIIL = C452501pT.LIZIZ(new C886180Ypc());
    public static final C01GW LJIILIIL = C452501pT.LIZIZ(new C886070YpR());
    public static final C01GW LJIILJJIL = C452501pT.LIZIZ(new C885970YpH());
    public static final C01GW LJIILL = C452501pT.LIZIZ(new C886130YpX());
    public static final C01GW LJIILLIIL = C452501pT.LIZIZ(new C886120YpW());
    public static final C01GW LJIIZILJ = C452501pT.LIZIZ(new C885950YpF());
    public static final C01GW LJIJ = C452501pT.LIZIZ(new C885980YpI());
    public static final C01GW LJIJI = C452501pT.LIZIZ(new C886000YpK());
    public static final C01GW LJIJJ = C452501pT.LIZIZ(new C885960YpG());
    public static final C01GW LJIJJLI = C452501pT.LIZIZ(new C885990YpJ());
    public static final C01GW LJIL = C452501pT.LIZIZ(new C885940YpE());
    public static final C01GW LJJ = C452501pT.LIZIZ(new C885910YpB());
    public static final C01GW LJJI = C452501pT.LIZIZ(new C886140YpY());
    public static final C01GW LJJIFFI = C452501pT.LIZIZ(new C886150YpZ());
    public static final C01GW LJJII = C452501pT.LIZIZ(new C886100YpU());
    public static final C01GW LJJIII = C452501pT.LIZIZ(new C886090YpT());
    public static final C01GW LJJIIJ = C452501pT.LIZIZ(new C886190Ypd());
    public static final C01GW LJJIIJZLJL = C452501pT.LIZIZ(new C886080YpS());
    public static final C01GW LJJIIZ = C452501pT.LIZIZ(new C886010YpL());
    public static final C01GW LJJIIZI = C452501pT.LIZIZ(new C886170Ypb());
    public static final C01GW LJJIJ = C452501pT.LIZIZ(new C885930YpD());
    public static final C01GW LJJIJIIJI = C452501pT.LIZIZ(new C885920YpC());

    public static String LJIJI(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static String LJIIZILJ() {
        IMUserPortraitApi.LIZ.getClass();
        C1730606q8.LIZ().LIZIZ();
        C2270061DtE c2270061DtE = C2270061DtE.LIZ;
        if (c2270061DtE.LJIIJ()) {
            return "high";
        }
        C1730606q8.LIZ().LIZIZ();
        return c2270061DtE.LJIL() ? "medium" : "low";
    }

    @Override // X.InterfaceC884870YnV
    public final void LIZJ() {
        if (C1207204nu.LIZ()) {
            ((AtomicBoolean) LJIILIIL.getValue()).set(true);
        }
    }

    @Override // X.C0Z31
    public final void LIZLLL() {
        if (C289920BXy.LIZ()) {
            ((AtomicBoolean) LJJIIJZLJL.getValue()).set(true);
        }
    }

    @Override // X.C0Z31
    public final void LJ() {
        if (C289920BXy.LIZ()) {
            ((AtomicBoolean) LJJII.getValue()).set(true);
        }
    }

    @Override // X.C0Z31
    public final void LJFF() {
        if (C289920BXy.LIZ()) {
            ((AtomicBoolean) LJJIII.getValue()).set(true);
        }
    }

    @Override // X.InterfaceC884870YnV
    public final void LJIILJJIL() {
        if (C1207204nu.LIZ()) {
            LJIIZILJ.getValue();
        }
    }

    public static void LJIJ(String str) {
        if (!C1207204nu.LIZ()) {
            return;
        }
        ((AtomicReference) LJJ.getValue()).set(str);
    }

    @Override // X.C0Z31
    public final void LIZ(int i) {
        if (C289920BXy.LIZ() && ((AtomicBoolean) LJJIIJZLJL.getValue()).get()) {
            ((C823170WQx) LJJIIZ.getValue()).add(Integer.valueOf(i));
        }
    }

    @Override // X.InterfaceC884870YnV
    public final void LIZIZ(String str) {
        if (!C1207204nu.LIZ()) {
            return;
        }
        ((C823170WQx) LJIJJ.getValue()).add(str);
    }

    @Override // X.InterfaceC884870YnV
    public final void LJI(int i) {
        if (!C1207204nu.LIZ()) {
            return;
        }
        ((C563400M7u) LJIILL.getValue()).LJ(i);
    }

    @Override // X.InterfaceC884870YnV
    public final void LJII(String str) {
        if (!C1207204nu.LIZ()) {
            return;
        }
        ((C823170WQx) LJIJJLI.getValue()).add(str);
    }

    @Override // X.InterfaceC884870YnV
    public final void LJIIIIZZ(int i) {
        if (!C1207204nu.LIZ()) {
            return;
        }
        ((C563400M7u) LJIILLIIL.getValue()).LJ(i);
    }

    @Override // X.C0Z31
    public final void LJIIIZ(String str) {
        if (!C289920BXy.LIZ()) {
            return;
        }
        ((AtomicReference) LJJIJ.getValue()).set(str);
    }

    @Override // X.InterfaceC884870YnV
    public final void LJIIJ(String str) {
        if (!C1207204nu.LIZ()) {
            return;
        }
        ((C823170WQx) LJIILJJIL.getValue()).add(str);
    }

    @Override // X.C0Z31
    public final void LJIIJJI(int i) {
        if (!C289920BXy.LIZ()) {
            return;
        }
        ((C563400M7u) LJJIIJ.getValue()).LJ(i);
    }

    @Override // X.C0Z31
    public final void LJIIL(String str) {
        if (!C289920BXy.LIZ()) {
            return;
        }
        ((AtomicReference) LJJIJIIJI.getValue()).set(str);
    }

    @Override // X.InterfaceC884870YnV
    public final void LJIILIIL(String str) {
        if (!C1207204nu.LIZ()) {
            return;
        }
        ((C823170WQx) LJIJ.getValue()).add(str);
    }

    @Override // X.C0Z31
    public final void LJIILL(List<? extends InterfaceC1891350zJl> list) {
        if (!C289920BXy.LIZ()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) list) {
            if ((interfaceC1891350zJl instanceof C890610Ywl) && interfaceC1891350zJl != null) {
                arrayList.add(interfaceC1891350zJl);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C890610Ywl c890610Ywl = (C890610Ywl) obj;
            if (c890610Ywl.getType() == 104 || c890610Ywl.getType() == 105 || c890610Ywl.getType() == 108 || c890610Ywl.getType() == 107) {
                arrayList2.add(obj);
            }
        }
        ((C563400M7u) LJJIIZI.getValue()).LJ(arrayList2.size());
    }

    @Override // X.InterfaceC884870YnV
    public final void LJIILLIIL(String str) {
        if (!C1207204nu.LIZ()) {
            return;
        }
        ((C823170WQx) LJIJI.getValue()).add(str);
    }
}
