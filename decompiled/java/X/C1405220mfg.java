package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1405220mfg {
    public final InterfaceC1434300nQa LIZ;
    public volatile boolean LIZIZ;
    public C556300Lro LIZLLL;
    public int LJFF;
    public final List<InterfaceC1405230mfh> LIZJ = new ArrayList();
    public double LJ = -1.0d;
    public final ReentrantLock LJI = new ReentrantLock();
    public EnumC1404590mef LJII = EnumC1404590mef.DEFAULT;

    public final C556300Lro LIZIZ() {
        C556300Lro c556300Lro = this.LIZLLL;
        if (c556300Lro != null) {
            return c556300Lro;
        }
        return null;
    }

    public C1405220mfg(InterfaceC1434300nQa interfaceC1434300nQa) {
        this.LIZ = interfaceC1434300nQa;
    }

    public final void LIZ(EnumC1404590mef enumC1404590mef) {
        this.LIZ.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickPublishWaiter start onStartObservers, observer count: ");
        sbLIZ.append(((ArrayList) this.LIZJ).size());
        C1405310mfp.LIZIZ("ClickPublishWaiter", C2188811AlT.LIZIZ(sbLIZ));
        if (!((ArrayList) this.LIZJ).isEmpty()) {
            for (InterfaceC1405230mfh interfaceC1405230mfh : (ArrayList) this.LIZJ) {
                if (interfaceC1405230mfh != null) {
                    try {
                        interfaceC1405230mfh.LIZ(enumC1404590mef);
                    } catch (NullPointerException e) {
                        TryCatchGuardChecker.doCheck(e);
                        int size = ((ArrayList) this.LIZJ).size();
                        List<InterfaceC1405230mfh> list = this.LIZJ;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : (ArrayList) list) {
                            if (obj == null) {
                                arrayList.add(obj);
                            }
                        }
                        int size2 = arrayList.size();
                        this.LIZ.LIZJ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("observerCount: ");
                        sbLIZ2.append(size);
                        sbLIZ2.append(", nullObserverCount: ");
                        sbLIZ2.append(size2);
                        C1405310mfp.LIZIZ("ClickPublishWaiter", C2188811AlT.LIZIZ(sbLIZ2));
                        throw e;
                    }
                }
            }
        }
        this.LIZ.LIZJ();
        C1405310mfp.LIZIZ("ClickPublishWaiter", "ClickPublishWaiter end onStartObservers");
    }

    public final boolean LIZJ(Function1<? super EnumC1404590mef, Unit> function1) {
        if (this.LIZIZ) {
            function1.invoke(this.LJII);
            return true;
        }
        this.LJI.lock();
        try {
            ((ArrayList) this.LIZJ).add(new C1405250mfj(function1));
            this.LJI.unlock();
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.unlock();
            throw th;
        }
    }

    public final void LIZLLL(EnumC1404590mef enumC1404590mef) {
        this.LIZIZ = true;
        this.LJII = enumC1404590mef;
        this.LIZLLL = new C556300Lro(0);
        this.LJ = C2179771ASp.LJIIIIZZ();
        this.LJFF = C2179771ASp.LIZLLL();
        this.LJI.lock();
        try {
            LIZ(enumC1404590mef);
            this.LJI.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJI.unlock();
            throw th;
        }
    }
}
