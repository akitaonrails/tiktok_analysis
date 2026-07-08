package X;

import Y.ARunnableS77S0200000_8;
import android.os.HandlerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.vesdk.VEUtils;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MSO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MSO {
    public static final C0MSO LJFF = new C0MSO();
    public final HandlerThread LIZ;
    public final Executor LIZIZ;
    public final ConcurrentHashSet LIZJ;
    public final Map<String, C0MSN> LIZLLL;
    public final List<C0MSN> LJ;

    public C0MSO() {
        HandlerThread handlerThread = new HandlerThread("render_thread");
        this.LIZ = handlerThread;
        this.LIZIZ = C786410Ut5.d4(2);
        this.LIZJ = new ConcurrentHashSet();
        this.LIZLLL = new ConcurrentHashMap();
        this.LJ = new LinkedList();
        handlerThread.start();
    }

    public final boolean LIZ(C0MSN c0msn) {
        synchronized (this.LJ) {
            try {
                if (c0msn.LJFF.get()) {
                    return false;
                }
                if (((LinkedList) this.LJ).contains(c0msn)) {
                    return false;
                }
                ((LinkedList) this.LJ).add(c0msn);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZLLL(C0MSN c0msn) {
        if (c0msn == null) {
            return;
        }
        synchronized (this.LJ) {
            try {
                ((LinkedList) this.LJ).remove(c0msn);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(C0MSJ c0msj) {
        Iterator it2 = this.LIZJ.iterator();
        while (it2.hasNext()) {
            Reference reference = (Reference) it2.next();
            if (reference == null) {
                it2.remove();
            } else {
                Object obj = reference.get();
                if (obj == null) {
                    it2.remove();
                } else if (Intrinsics.LJFF(obj, c0msj)) {
                    it2.remove();
                }
            }
        }
    }

    public final void LIZIZ(C0MSN c0msn, boolean z) {
        int iIntValue;
        int iIntValue2;
        long j;
        if (c0msn == null) {
            return;
        }
        if (c0msn.LJFF.get()) {
            LIZLLL(c0msn);
            return;
        }
        if (c0msn.LIZIZ == C0L9K.VIDEO) {
            C0MSP.LIZ("parse resource by video begin...");
            C2356009La c2356009La = C2356009La.LIZ;
            String str = c0msn.LIZ;
            c2356009La.getClass();
            VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ = C2356009La.LIZ(str);
            if (vEVideoFileInfoLIZ != null) {
                int i = vEVideoFileInfoLIZ.rotation;
                if (i != 90 && i != 270) {
                    iIntValue = vEVideoFileInfoLIZ.width;
                    iIntValue2 = vEVideoFileInfoLIZ.height;
                } else {
                    iIntValue = vEVideoFileInfoLIZ.height;
                    iIntValue2 = vEVideoFileInfoLIZ.width;
                }
                j = ((long) vEVideoFileInfoLIZ.duration) * 1000;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parse video success, videoInfo = ");
                sbLIZ.append(vEVideoFileInfoLIZ);
                C0MSP.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C0MSP.LIZ("parse video fail! videoInfo is null!");
                iIntValue = 0;
                j = 0;
                iIntValue2 = 0;
            }
            C0MSP.LIZ("parse resource by video finish");
        } else {
            C0MSP.LIZ("parse resource by bitmap begin...");
            Pair<Integer, Integer> pairLIZJ = C097U.LIZJ(c0msn.LIZ);
            iIntValue = pairLIZJ.getFirst().intValue();
            iIntValue2 = pairLIZJ.getSecond().intValue();
            C0MSP.LIZ("parse resource by bitmap finish");
            j = 0;
        }
        LinkedHashSet<C0MSH> linkedHashSet = new LinkedHashSet();
        synchronized (c0msn) {
            try {
                if (!c0msn.LJFF.get()) {
                    c0msn.LIZJ = iIntValue;
                    c0msn.LIZLLL = iIntValue2;
                    c0msn.LJ = j;
                    c0msn.LJFF.set(true);
                    Iterator it2 = ((CopyOnWriteArraySet) c0msn.LJI).iterator();
                    while (it2.hasNext()) {
                        WeakReference weakReference = (WeakReference) it2.next();
                        if (weakReference == null) {
                            it2.remove();
                        } else {
                            C0MSH c0msh = (C0MSH) weakReference.get();
                            if (c0msh == null) {
                                it2.remove();
                            } else {
                                linkedHashSet.add(c0msh);
                            }
                        }
                    }
                    ((CopyOnWriteArraySet) c0msn.LJI).clear();
                    if (!linkedHashSet.isEmpty()) {
                        for (C0MSH c0msh2 : linkedHashSet) {
                            c0msh2.getClass();
                            c0msh2.LIZLLL = c0msn.LIZJ;
                            c0msh2.LJ = c0msn.LIZLLL;
                            c0msh2.LJFF = c0msn.LJ;
                            c0msh2.LIZ();
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LIZLLL(c0msn);
    }

    public final void LIZJ(C0MSD c0msd, boolean z) {
        Object c0msn;
        if (c0msd == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0msd.LIZ);
        sbLIZ.append('_');
        sbLIZ.append(Long.toHexString(new C0VSJ(c0msd.LIZ).lastModified()));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        synchronized (this.LIZLLL) {
            try {
                c0msn = ((ConcurrentHashMap) this.LIZLLL).get(strLIZIZ);
                if (c0msn == null) {
                    c0msn = new C0MSN(c0msd);
                    ((ConcurrentHashMap) this.LIZLLL).put(strLIZIZ, c0msn);
                }
                ((C0MSN) c0msn).LIZ(c0msd);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            C0MSN c0msn2 = (C0MSN) c0msn;
            LIZ(c0msn2);
            LIZIZ(c0msn2, true);
        } else {
            C0MSN c0msn3 = (C0MSN) c0msn;
            if (!LIZ(c0msn3)) {
                return;
            }
            this.LIZIZ.execute(new ARunnableS77S0200000_8(this, c0msn3, 29));
        }
    }
}
