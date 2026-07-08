package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.17ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21145117ov extends C09AY implements Function0<List<? extends AbstractC21144217om>> {
    public C21145117ov() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends AbstractC21144217om> invoke() {
        return C1697810uHb.LJIIJJI(new AbstractC21144217om() { // from class: X.17ot
            @Override // X.AbstractC21144217om
            public final C0QHX LIZ() {
                return C0QHX.READY;
            }

            @Override // X.AbstractC21144217om
            public final InterfaceC21138617ns LIZIZ(Context context, int i, C21143417oe c21143417oe) {
                InterfaceC21138617ns interfaceC21138617ns;
                ReentrantReadWriteLock.ReadLock lock = C21145717p1.LIZIZ.readLock();
                lock.lock();
                try {
                    List<C21143617og> listLIZ = C21145717p1.LIZLLL.LIZ(i);
                    synchronized (listLIZ) {
                        try {
                            C21143217oc c21143217oc = new C21143217oc(context, c21143417oe, true);
                            C21143217oc c21143217oc2 = new C21143217oc(context, c21143417oe, false);
                            Object objLIZIZ = C21145417oy.LIZIZ(listLIZ, c21143217oc);
                            if (objLIZIZ == null) {
                                objLIZIZ = C21145417oy.LIZIZ(listLIZ, c21143217oc2);
                            }
                            C21143617og c21143617og = (C21143617og) objLIZIZ;
                            if (c21143617og != null) {
                                interfaceC21138617ns = c21143617og.LJ;
                            } else {
                                interfaceC21138617ns = null;
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    lock.unlock();
                    return interfaceC21138617ns;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
        }, new AbstractC21144217om() { // from class: X.17ou
            @Override // X.AbstractC21144217om
            public final C0QHX LIZ() {
                return C0QHX.CREATING;
            }

            @Override // X.AbstractC21144217om
            public final InterfaceC21138617ns LIZIZ(Context context, int i, C21143417oe c21143417oe) {
                InterfaceC21138617ns interfaceC21138617ns;
                ReentrantReadWriteLock.ReadLock lock = C21145717p1.LIZIZ.readLock();
                lock.lock();
                try {
                    List<C21143617og> listLIZ = C21145717p1.LIZJ.LIZ(i);
                    synchronized (listLIZ) {
                        try {
                            C21143217oc c21143217oc = new C21143217oc(context, c21143417oe, true);
                            C21143217oc c21143217oc2 = new C21143217oc(context, c21143417oe, false);
                            Object objLIZIZ = C21145417oy.LIZIZ(listLIZ, c21143217oc);
                            if (objLIZIZ == null) {
                                objLIZIZ = C21145417oy.LIZIZ(listLIZ, c21143217oc2);
                            }
                            C21143617og c21143617og = (C21143617og) objLIZIZ;
                            if (c21143617og != null) {
                                interfaceC21138617ns = c21143617og.LJ;
                            } else {
                                interfaceC21138617ns = null;
                            }
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                    lock.unlock();
                    return interfaceC21138617ns;
                } catch (Throwable th) {
                    lock.unlock();
                    throw th;
                }
            }
        }, new AbstractC21144217om() { // from class: X.17ol
            @Override // X.AbstractC21144217om
            public final C0QHX LIZ() {
                return C0QHX.NO_CACHE;
            }

            @Override // X.AbstractC21144217om
            public final InterfaceC21138617ns LIZIZ(Context context, int i, C21143417oe c21143417oe) {
                InterfaceC21138317np interfaceC21138317npLIZIZ = C740760T3y.LIZIZ(i);
                if (interfaceC21138317npLIZIZ != null) {
                    return interfaceC21138317npLIZIZ.LIZ(c21143417oe);
                }
                return null;
            }
        });
    }
}
