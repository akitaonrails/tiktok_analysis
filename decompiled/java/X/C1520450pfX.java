package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0pfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520450pfX implements InterfaceC1520470pfZ {
    public static final C1520450pfX LIZ = new C1520450pfX();
    public static final ArrayList<InterfaceC1520470pfZ> LIZIZ = new ArrayList<>();
    public static final ArrayList<InterfaceC1520460pfY> LIZJ = new ArrayList<>();

    @Override // X.InterfaceC1520470pfZ
    public void onEventCreated(C1520560pfi c1520560pfi) {
        c1520560pfi.LIZLLL.LIZ = EnumC1520240pfC.EVENT_CREATE;
        Iterator<InterfaceC1520470pfZ> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onEventCreated(c1520560pfi);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZIZ(th);
            }
        }
        for (InterfaceC1520460pfY interfaceC1520460pfY : LIZJ) {
            try {
                c1520560pfi.LIZ().toString();
                c1520560pfi.LJII();
                interfaceC1520460pfY.onEventCreated(new C1520520pfe());
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1520960pgM.LIZIZ(th2);
            }
        }
    }

    @Override // X.InterfaceC1520470pfZ
    public void onEventSampled(C1520560pfi c1520560pfi) {
        c1520560pfi.LIZLLL.LIZ = EnumC1520240pfC.SAMPLE_THROW;
        Iterator<InterfaceC1520470pfZ> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onEventSampled(c1520560pfi);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZIZ(th);
            }
        }
        for (InterfaceC1520460pfY interfaceC1520460pfY : LIZJ) {
            try {
                c1520560pfi.LIZ().toString();
                c1520560pfi.LJII();
                interfaceC1520460pfY.onEventSampled(new C1520520pfe());
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1520960pgM.LIZIZ(th2);
            }
        }
    }

    @Override // X.InterfaceC1520470pfZ
    public void onEventTerminated(C1520560pfi c1520560pfi) {
        c1520560pfi.LIZLLL.LIZ = EnumC1520240pfC.EVENT_TERMINATED;
        Iterator<InterfaceC1520470pfZ> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onEventTerminated(c1520560pfi);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZIZ(th);
            }
        }
        for (InterfaceC1520460pfY interfaceC1520460pfY : LIZJ) {
            try {
                c1520560pfi.LIZ().toString();
                c1520560pfi.LJII();
                interfaceC1520460pfY.onEventTerminated(new C1520520pfe());
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1520960pgM.LIZIZ(th2);
            }
        }
    }

    @Override // X.InterfaceC1520470pfZ
    public void onEventUpdated(C1520560pfi c1520560pfi) {
        c1520560pfi.LIZLLL.LIZ = EnumC1520240pfC.EVENT_UPDATED;
        Iterator<InterfaceC1520470pfZ> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onEventUpdated(c1520560pfi);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZIZ(th);
            }
        }
        for (InterfaceC1520460pfY interfaceC1520460pfY : LIZJ) {
            try {
                c1520560pfi.LIZ().toString();
                c1520560pfi.LJII();
                interfaceC1520460pfY.onEventUpdated(new C1520520pfe());
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1520960pgM.LIZIZ(th2);
            }
        }
    }

    @Override // X.InterfaceC1520470pfZ
    public void onEventUploaded(C1520560pfi c1520560pfi) {
        c1520560pfi.LIZLLL.LIZ = EnumC1520240pfC.EVENT_UPLOAD;
        Iterator<InterfaceC1520470pfZ> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            try {
                it2.next().onEventUploaded(c1520560pfi);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZIZ(th);
            }
        }
        for (InterfaceC1520460pfY interfaceC1520460pfY : LIZJ) {
            try {
                c1520560pfi.LIZ().toString();
                c1520560pfi.LJII();
                interfaceC1520460pfY.onEventUploaded(new C1520520pfe());
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1520960pgM.LIZIZ(th2);
            }
        }
    }
}
