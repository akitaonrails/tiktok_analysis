package X;

import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hXo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208140hXo {
    public final InterfaceC1235640iGA LIZ;
    public final Activity LIZIZ;
    public final String[] LIZJ;
    public final Cert LIZLLL;
    public final C1208160hXq LJ;
    public final InterfaceC1207170hWF LJFF;
    public final C1208170hXr LJI;
    public final long LJII;
    public final InterfaceC1798670wuH LJIIIIZZ;
    public final InterfaceC19359210oY LJIIIZ;
    public final Function1<String, Unit> LJIIJ;
    public final Function1<String, Unit> LJIIJJI;
    public C12Q8 LJIIL;

    public final boolean LIZ() {
        for (String str : this.LIZJ) {
            if (this.LIZ.LIZ(this.LIZIZ, str)) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJFF() {
        for (String str : this.LIZJ) {
            if (C0VE9.LJIIJ(this.LIZIZ, str)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZIZ(final C1208350hY9 c1208350hY9) {
        final C259800zU c259800zU = new C259800zU();
        final C238400w2 c238400w2 = new C238400w2();
        final boolean zLIZ = LIZ();
        final boolean zLJFF = LJFF();
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requestPermissions(new): shouldShowRationale1=");
        sbLIZ.append(zLJFF);
        sbLIZ.append(" deniedForEver1=");
        sbLIZ.append(zLIZ);
        C1798620wuC.LIZLLL("LocationController", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZ.LIZIZ(this.LIZIZ, this.LIZJ, this.LIZLLL, new InterfaceC1208110hXl() { // from class: X.0hXp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1208110hXl
            public final void LIZ(C1208240hXy c1208240hXy) {
                C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("requestPermissions(new): onRequest ");
                sbLIZ2.append(c1208240hXy);
                C1798620wuC.LIZIZ("LocationController", C2188811AlT.LIZIZ(sbLIZ2));
                c259800zU.element = c1208240hXy;
                c238400w2.element = System.currentTimeMillis();
            }

            /* JADX WARN: Removed duplicated region for block: B:68:0x01dd  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x01f2  */
            /* JADX WARN: Type inference failed for: r0v48, types: [com.bytedance.i18n.location.control.SystemPermissionRequester$makeLifecycleWatcher$1] */
            @Override // X.InterfaceC1208110hXl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(kotlin.Pair<java.lang.String, ? extends X.EnumC1207930hXT>... r16) {
                /*
                    Method dump skipped, instruction units count: 540
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1208150hXp.LIZIZ(kotlin.Pair[]):void");
            }
        });
    }

    public final C12Q8 LJ(AbstractC1207960hXW abstractC1207960hXW, Function0<Unit> function0) {
        Object c098200Yq;
        try {
            c098200Yq = this.LJI.LIZIZ(this.LIZIZ, abstractC1207960hXW, this.LJ.LJIIIIZZ, this.LJIIIZ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1798620wuC c1798620wuC = C1798620wuC.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resolveSystemDialogOrFallback: no dialog available for ");
            sbLIZ.append(abstractC1207960hXW);
            C1798620wuC.LJ("LocationController", C2188811AlT.LIZIZ(sbLIZ), thM5exceptionOrNullimpl);
            function0.invoke();
            c098200Yq = null;
        }
        return (C12Q8) c098200Yq;
    }

    public static final void LIZJ(C1208140hXo c1208140hXo, EnumC1207930hXT enumC1207930hXT, List list, C1208240hXy c1208240hXy, EnumC1207420hWe enumC1207420hWe) {
        Object next;
        Object second;
        boolean z;
        EnumC1207420hWe enumC1207420hWe2 = enumC1207420hWe;
        C12Q8 c12q8 = c1208140hXo.LJIIL;
        Boolean boolValueOf = null;
        if (c12q8 != null) {
            c12q8.LIZIZ(null);
        }
        c1208140hXo.LJIIL = null;
        if (c1208240hXy != null) {
            if (enumC1207420hWe2 == null) {
                enumC1207420hWe2 = c1208240hXy.LIZ;
            }
            c1208140hXo.LJFF.LIZ(c1208240hXy);
            if (enumC1207420hWe2 != EnumC1207420hWe.EarlyOpenSettings) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((Pair) next).getFirst(), "android.permission.ACCESS_FINE_LOCATION")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                Pair pair = (Pair) next;
                if (pair != null && (second = pair.getSecond()) != null) {
                    if (second == EnumC1207930hXT.Granted) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolValueOf = Boolean.valueOf(z);
                }
                if (boolValueOf != null) {
                    C1798660wuG.LIZ(c1208140hXo.LJIIIIZZ, boolValueOf.booleanValue(), "system_permission_result");
                } else {
                    C1798660wuG.LIZ(c1208140hXo.LJIIIIZZ, C1194170hBH.LIZIZ(c1208140hXo.LIZIZ), "system_permission_result");
                }
            }
            c1208140hXo.LJFF.LIZIZ(new C1208000hXa(enumC1207930hXT, enumC1207420hWe2, null, list, 4));
        }
    }

    public C1208140hXo(InterfaceC1235640iGA interfaceC1235640iGA, Activity activity, String[] strArr, Cert cert, C1208160hXq c1208160hXq, C1208040hXe c1208040hXe, C1208170hXr c1208170hXr, long j, InterfaceC1798670wuH interfaceC1798670wuH, InterfaceC19359210oY interfaceC19359210oY, AwS384S0200000_18 awS384S0200000_18, AwS384S0200000_18 awS384S0200000_182) {
        this.LIZ = interfaceC1235640iGA;
        this.LIZIZ = activity;
        this.LIZJ = strArr;
        this.LIZLLL = cert;
        this.LJ = c1208160hXq;
        this.LJFF = c1208040hXe;
        this.LJI = c1208170hXr;
        this.LJII = j;
        this.LJIIIIZZ = interfaceC1798670wuH;
        this.LJIIIZ = interfaceC19359210oY;
        this.LJIIJ = awS384S0200000_18;
        this.LJIIJJI = awS384S0200000_182;
    }
}
