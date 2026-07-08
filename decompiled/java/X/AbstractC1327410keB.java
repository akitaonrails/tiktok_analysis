package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0keB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1327410keB implements InterfaceC1327390ke9<C1328480kfu> {
    public final Executor LIZ;
    public final InterfaceC1327440keE LIZIZ;

    public abstract C1328480kfu LIZLLL(C1325710kbR c1325710kbR);

    public abstract String LJ();

    public AbstractC1327410keB(Executor executor, InterfaceC1327440keE interfaceC1327440keE) {
        this.LIZ = executor;
        this.LIZIZ = interfaceC1327440keE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0keC, java.lang.Runnable] */
    @Override // X.InterfaceC1327390ke9
    public final void LIZIZ(final InterfaceC1328020kfA<C1328480kfu> interfaceC1328020kfA, InterfaceC1327930kf1 interfaceC1327930kf1) {
        final InterfaceC1325690kbP interfaceC1325690kbPLIZ = interfaceC1327930kf1.LIZ();
        final String id = interfaceC1327930kf1.getId();
        final C1325710kbR c1325710kbRLJFF = interfaceC1327930kf1.LJFF();
        final String strLJ = LJ();
        final ?? r1 = new AbstractC1327520keM<C1328480kfu>(interfaceC1328020kfA, interfaceC1325690kbPLIZ, strLJ, id) { // from class: X.0keC
            @Override // X.AbstractRunnableC2124508Tz
            public final Object LIZJ() throws Throwable {
                C1328480kfu c1328480kfuLIZLLL = this.LLJ.LIZLLL(c1325710kbRLJFF);
                if (c1328480kfuLIZLLL == null) {
                    interfaceC1325690kbPLIZ.LJIIIZ(id, this.LLJ.LJ(), false);
                    return null;
                }
                c1328480kfuLIZLLL.LJIJJ();
                interfaceC1325690kbPLIZ.LJIIIZ(id, this.LLJ.LJ(), true);
                return c1328480kfuLIZLLL;
            }

            @Override // X.AbstractRunnableC2124508Tz
            public final void LIZIZ(Object obj) {
                C1328480kfu.LIZIZ((C1328480kfu) obj);
            }
        };
        interfaceC1327930kf1.LJ(new C1330860kjk() { // from class: X.0keD
            @Override // X.InterfaceC1330340kiu
            public final void LIZJ() {
                r1.LIZ();
            }
        });
        this.LIZ.execute(r1);
    }

    public final C1328480kfu LIZJ(InputStream inputStream, int i) {
        C1323050kX9 c1323050kX9LJIJJLI = null;
        try {
            if (i > 0) {
                c1323050kX9LJIJJLI = C1323050kX9.LJIJJLI(this.LIZIZ.LIZJ(inputStream, i));
            } else {
                c1323050kX9LJIJJLI = C1323050kX9.LJIJJLI(this.LIZIZ.LIZ(inputStream));
            }
            C1328480kfu c1328480kfu = new C1328480kfu(c1323050kX9LJIJJLI);
            C1323080kXC.LIZIZ(inputStream);
            C1323050kX9.LJII(c1323050kX9LJIJJLI);
            return c1328480kfu;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323080kXC.LIZIZ(inputStream);
            C1323050kX9.LJII(c1323050kX9LJIJJLI);
            throw th;
        }
    }
}
