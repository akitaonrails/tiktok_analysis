package X;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312260CLw extends C09AY implements Function2<CopyOnWriteArrayList<C0CM8>, C0CME, Unit> {
    public C312260CLw() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(CopyOnWriteArrayList<C0CM8> copyOnWriteArrayList, C0CME c0cme) {
        boolean z;
        String strName;
        C0CMC c0cmc;
        C0CMC c0cmc2;
        final CopyOnWriteArrayList<C0CM8> copyOnWriteArrayList2 = copyOnWriteArrayList;
        final C0CME c0cme2 = c0cme;
        Iterator<C0CM8> it2 = copyOnWriteArrayList2.iterator();
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        while (true) {
            if (it2 != null && it2.hasNext()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            final C0CM8 next = it2.next();
            Runnable runnable = new Runnable() { // from class: X.0CLx
                public final void LIZ() {
                    Function0<Boolean> function0;
                    if (!((Boolean) C0CMX.LJIIJ.getValue()).booleanValue() || (function0 = C312230CLt.LJIL) == null || !function0.invoke().booleanValue() || !next.LLILZ.isCoreScene()) {
                        C312230CLt.LJII(next, copyOnWriteArrayList2);
                        return;
                    }
                    if (((Boolean) C1217404pY.LIZIZ.getValue()).booleanValue()) {
                        copyOnWriteArrayList2.remove(next);
                    }
                    C0CM3 c0cm3 = new C0CM3();
                    C0CM8 c0cm8 = next;
                    CopyOnWriteArrayList<C0CM8> copyOnWriteArrayList4 = copyOnWriteArrayList2;
                    c0cm3.LIZ = C0CME.SCROLL_END;
                    c0cm3.LIZIZ = true;
                    c0cm3.LJFF = c0cm8.LLILLJJLI;
                    c0cm3.LIZJ = C0CMJ.HIGH_PRIORITY.getType();
                    c0cm3.LJI = new AwS405S0200000_4(c0cm8, (C0CM8) copyOnWriteArrayList4, (CopyOnWriteArrayList<C0CM8>) 61);
                    C312240CLu.LIZ(c0cm3);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DowngradeAbility@31d1.initCommonLogic$2$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DowngradeAbility@31d1.initCommonLogic$2$1$1");
                }
            };
            if (next.LLILLL) {
                if (((Number) C0CMX.LJI.getValue()).longValue() <= 0 || !next.LLILZ.isCoreScene() || ((c0cmc = C312230CLt.LJII) != null && c0cmc.LIZJ())) {
                    C786410Ut5.LJL(C312230CLt.LIZLLL(), runnable);
                } else {
                    ((C0CMH) C312230CLt.LJIJJLI.getValue()).LIZ(runnable);
                }
            } else if (next.LLILZ.isCoreScene()) {
                if (((Number) C0CMX.LJII.getValue()).longValue() <= 0 || ((c0cmc2 = C312230CLt.LJII) != null && c0cmc2.LIZJ())) {
                    C786410Ut5.LJL(C312230CLt.LIZIZ(), runnable);
                } else {
                    ((C0CMH) C312230CLt.LJIJJ.getValue()).LIZ(runnable);
                }
            } else {
                C0CMC c0cmc3 = C312230CLt.LJII;
                if (c0cmc3 != null && c0cmc3.LIZIZ() > 0) {
                    copyOnWriteArrayList3.add(0, runnable);
                } else {
                    C786410Ut5.LJL(C312230CLt.LIZIZ(), runnable);
                }
            }
        }
        if (!copyOnWriteArrayList3.isEmpty()) {
            C312230CLt.LJIIIIZZ(C0CMJ.NORMAL_PRIORITY.getType(), copyOnWriteArrayList3);
        }
        if (((Number) C0CMX.LJIILJJIL.getValue()).longValue() > 0 && ((Number) C0CMX.LJI.getValue()).longValue() > 0) {
            if (c0cme2 != null) {
                strName = c0cme2.name();
            } else {
                strName = null;
            }
            if (Intrinsics.LJFF(strName, "FIRST_VIDEO_SHOW")) {
                C0CMH c0cmh = (C0CMH) C312230CLt.LJIJJLI.getValue();
                Runnable runnable2 = new Runnable() { // from class: X.0CCI
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("DowngradeAbility@31d1.initCommonLogic$2$2");
                        try {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Sleep for ");
                            C01GW c01gw = C0CMX.LJIILJJIL;
                            sbLIZ.append(((Number) c01gw.getValue()).longValue());
                            sbLIZ.append(" ms before normal worker execute, scene is ");
                            C0CME c0cme3 = c0cme2;
                            sbLIZ.append(c0cme3 != null ? c0cme3.name() : null);
                            C2188811AlT.LIZIZ(sbLIZ);
                            Thread.sleep(((Number) c01gw.getValue()).longValue());
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("DowngradeAbility@31d1.initCommonLogic$2$2");
                    }
                };
                synchronized (c0cmh) {
                    ((ConcurrentLinkedDeque) c0cmh.LIZJ).push(runnable2);
                }
            }
        }
        if (C1218004pe.LIZ()) {
            C786410Ut5.LJJZZIII(C312230CLt.LIZLLL(), new Runnable() { // from class: X.0CKn
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DowngradeAbility@31d1.initCommonLogic$2$3");
                    try {
                        C311900CKm.LIZLLL.LJFF();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DowngradeAbility@31d1.initCommonLogic$2$3");
                }
            });
        }
        return Unit.LIZ;
    }
}
