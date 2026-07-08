package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.kmp.eventbus.IEventBusService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19281310bz implements IEventBusService {
    public static final C19281310bz LIZ = new C19281310bz();
    public static final List<AbstractC19280610bs> LIZIZ = new ArrayList();
    public static final List<C13020057q> LIZJ = new ArrayList();
    public static final C054G LIZLLL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
    public static final C1DEK LJ = C095G.LIZ(-2, null, 6);
    public static boolean LJFF;

    public static void LJ() throws Throwable {
        C1865740yeS.LIZ.getClass();
        C1865740yeS.LIZJ("Event_Handler", "SharedEventManager setupAllBinds");
        C13019057p.LIZ.getClass();
        try {
            List listLIZ = C13019057p.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SharedEventManager loadBinds binds: ");
            sbLIZ.append(listLIZ);
            C1865740yeS.LIZJ("Event_Handler", C2188811AlT.LIZIZ(sbLIZ));
            ((ArrayList) LIZJ).addAll(listLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C10U8 c10u8 = C10U8.LIZ;
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("module", "NUJ"));
            c10u8.getClass();
            C10U8.LIZ("GlobalEventRegistry_setupAllBinds", e, mapLIZJ);
        }
    }

    @Override // com.tiktok.kmp.eventbus.IEventBusService
    public final void LIZ() throws Throwable {
        try {
            LJ();
            if (LJFF) {
                return;
            }
            LJFF = true;
            C23250099c.LIZLLL(LIZLLL, null, null, new C19281410c0(null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C10U8 c10u8 = C10U8.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("exception_message", message));
            c10u8.getClass();
            C10U8.LIZ("SharedEventManager_onAppStart", e, mapLIZJ);
        }
    }

    @Override // com.tiktok.kmp.eventbus.IEventBusService
    public final void LIZIZ(C19280810bu c19280810bu) throws Throwable {
        try {
            C1865740yeS c1865740yeS = C1865740yeS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SharedEventManager dispatch key: ");
            sbLIZ.append(c19280810bu);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1865740yeS.getClass();
            C1865740yeS.LIZJ("Event_Handler", strLIZIZ);
            if (LJ.LJIIIIZZ(c19280810bu) instanceof C094O) {
                C10U8 c10u8 = C10U8.LIZ;
                IllegalStateException illegalStateException = new IllegalStateException("SharedEventManager eventQueue trySend failed");
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("event", c19280810bu.toString()));
                c10u8.getClass();
                C10U8.LIZ("SharedEventManager_dispatch_trySend_failed", illegalStateException, mapLIZJ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C10U8 c10u82 = C10U8.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            Map mapLIZJ2 = C2097908Jt.LIZJ(new Pair("exception_message", message));
            c10u82.getClass();
            C10U8.LIZ("SharedEventManager_dispatch", e, mapLIZJ2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C19280810bu r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19281310bz.LIZJ(X.10bu, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        r1 = X.C2097908Jt.LIZJ(new kotlin.Pair("exception_message", r2));
        r3.getClass();
        X.C10U8.LIZ("SharedEventManager_processEvent_safeHandle", r4, r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.AbstractC19280610bs r9, X.C19280810bu r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19281310bz.LIZLLL(X.10bs, X.10bu, X.05Vn):java.lang.Object");
    }
}
